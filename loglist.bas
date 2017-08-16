Type=Activity
Version=6.8
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Module created by trOw (D.Trojan)
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private t2 As Timer
	Dim date,time As String

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
		Private kvsdata,kvst,kvsmat As KeyValueStore
		Dim mathlist As List
	Private lv1 As ListView
	Private mcl As MaterialColors
	Private toolbar As ACToolBarLight
	Dim ABHelper As ACActionBar
	Dim ic,id,ie,ii As Bitmap
	
	Private counter As Int 
	Private bdia As BetterDialogs
	Dim progress As NumberProgressBar
	Private Ptext As Label
	Dim zipitem(1),logdir,arcdir,logitem As String
	Dim mit As ACMenuItem
End Sub
#Extends:android.support.v7.app.AppCompatActivity
Sub Activity_Create(FirstTime As Boolean)
	ic=LoadBitmap(File.DirAssets,"ic_developer_mode_white_18dp.png")
	id=LoadBitmap(File.DirAssets,"ic_arrow_back_white_18dp.png")
	ie=LoadBitmap(File.DirAssets,"ic_archive_white_18dp.png")
	'ii=LoadBitmap(File.DirAssets,"ic_apps_black_18dp.png")
	Activity.LoadLayout("3")
	Activity.TitleColor=mcl.md_black_1000
	Activity.Color=Colors.ARGB(255,65,66,67)
	mathlist.Initialize
	toolbar.SetAsActionBar
	ABHelper.Initialize
	ABHelper.ShowUpIndicator=True
	toolbar.Elevation=10dip
	toolbar.Color=Colors.ARGB(255,65,66,67)
	toolbar.PopupTheme=toolbar.THEME_LIGHT
	'toolbar.NavigationIconBitmap=ie
	toolbar.NavigationIconBitmap=id
	toolbar.Title="LoggCat"
	toolbar.SubTitleTextColor=mcl.md_light_blue_A400
	toolbar.SubTitle="Log Archive:"
	Activity.AddMenuItem3("Export","ep",ie,True)
	Activity.AddMenuItem("clear/Log","mo")
	Activity.AddMenuItem("Close","cl")
	toolbar.InitMenuListener
	kvsdata.Initialize(File.DirInternal,"data_data")
	kvst.Initialize(File.DirInternal,"data_time")
	kvsmat.Initialize(File.DirInternal,"data_math")
	'##############################Extras##############################################
	DateTime.TimeFormat="HHmm"
	DateTime.DateFormat="dd-MM-yyy"
	date=DateTime.Date(DateTime.Now)
	time=DateTime.Time(DateTime.Now)
	Log(date)
	Log(time)
	t2.Initialize("t2",1000)
	t2.Enabled=False
	counter=0
	'#############################List View############################################
	Dim l1,l2,l3,l4,l5,l6 As Label
	l1.Initialize("l1")
	l2.Initialize("l2")
	l1=lv1.TwoLinesAndBitmap.Label
	lv1.TwoLinesAndBitmap.Label.Color=Colors.ARGB(80,255,255,255)
	l2=lv1.TwoLinesAndBitmap.SecondLabel
	lv1.TwoLinesAndBitmap.SecondLabel.Color=Colors.ARGB(40,255,255,255)
	l2.TextColor=mcl.md_light_blue_A400'Colors.ARGB(200,255,255,255)
	l1.TextSize=17
	l1.Gravity=Gravity.FILL
	l2.Gravity=Gravity.FILL
	l1.TextColor=Colors.ARGB(190,255,255,255)
	l2.TextSize=17
	lv1.TwoLinesAndBitmap.ItemHeight=65dip
	lv1.TwoLinesAndBitmap.ImageView.Width=15%x
	lv1.TwoLinesAndBitmap.Label.Typeface=Typeface.CreateNew(Typeface.MONOSPACE,Typeface.STYLE_ITALIC)
	lv1.TwoLinesAndBitmap.SecondLabel.Typeface=Typeface.CreateNew(Typeface.MONOSPACE,Typeface.STYLE_ITALIC)
	'####################################Panel Settings#################################
	
	progress.Initialize("progress")
	progress.ReachedBarColor=mcl.md_blue_A400
	progress.ProgressTextColor=mcl.md_white_1000
	progress.Max=100
	Ptext.Initialize("Ptext")
	Ptext.Gravity=Gravity.CENTER_HORIZONTAL
	Ptext.TextSize=13
	Ptext.TextColor=mcl.md_blue_500
	arcdir=File.DirRootExternal&"/log/archive"
	logdir=File.DirRootExternal&"/log/"
	Dim zipo As String ="_log.txt"
	If File.IsDirectory(logdir,zipo.Contains(".txt")) Then
		ToastMessageShow("logdir exists.",False) 
		Else 
		File.MakeDir(File.DirDefaultExternal,"/log")
		File.MakeDir(File.DirDefaultExternal,"/log/archive")
		File.MakeDir(File.DirRootExternal,"/log/archive")
		File.MakeDir(File.DirRootExternal,"/log")
		ToastMessageShow("logdir created!",False)
	End If
	
End Sub

Sub Activity_Resume
	If t2.IsInitialized=True Then 
		t2.Enabled=False
		Else
			t2.Initialize("t2",1000)
			t2.Enabled=False
	End If
	toolbar.InitMenuListener
	init
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	t2.Enabled=False
End Sub

Sub Activity_BackKeyPressed As Boolean
	bdia.CloseDialog(DialogResponse.CANCEL)
	Return bdia
End Sub

Sub Activity_ActionBarHomeClick
	Activity.Finish
	SetAnimation.setanimati("extra_in", "extra_out")
End Sub

Sub toolbar_NavigationItemClick
		Activity.Finish
	SetAnimation.setanimati("extra_in", "extra_out")
End Sub
Sub toolbar_MenuItemClick (Item As ACMenuItem)
	If Item.Title="Export" Then
		zip_log
	End If
	If Item.Id="cl" Then 
		Activity.Finish
		SetAnimation.setanimati("extra_in", "extra_out")
	End If
End Sub
Sub init
	lv1.Clear
	'id.Initialize(LoadBitmap(File.DirAssets,"add-3.png"))
	Dim r1 As String
	Dim sublist As List 
	sublist.Initialize
	Dim n As Int 
	For Each lg As String In kvsdata.ListKeys
		r1=lg
		sublist.Add(kvsdata.GetSimple(lg)&" - "&r1)
		lv1.AddTwoLinesAndBitmap2(lg,kvsdata.GetSimple(lg),ic,r1)
	Next
	File.WriteList(logdir,"logcat.txt",sublist)
	For t = 0 To lv1.Size-1
		lv1.SetSelection(t)
	Next
End Sub

Sub mo_click
	kvst.DeleteAll
	kvsmat.DeleteAll
End Sub
Sub ep_click
	zip_log
End Sub

Sub lv1_ItemClick (Position As Int, Value As Object)
	
End Sub

Sub lv1_ItemLongClick (Position As Int, Value As Object)
	Dim res As Int 
	res=Msgbox2("Clear Log-List?","Attention:","clear","cancel","",LoadBitmap(File.DirAssets,"close_48x48.png"))
	If res=DialogResponse.POSITIVE Then 
		clear_log
	End If
End Sub

Sub clear_log
	kvsdata.DeleteAll
	lv1.Clear
	Activity.Invalidate
	lv1.AddTwoLinesAndBitmap("Log file cleared...",date&"|"&time,ic) 
	init
End Sub

Sub progress_onProgressChange(current As Int, maxvalue As Int)
	
End Sub


Sub t2_Tick
	counter=counter+1
	progress.incrementProgressBy(counter)
	Log("tick: "&counter)
	If counter = 3 Then
		t2.Enabled=False
		bdia.CloseDialog(DialogResponse.CANCEL)
		counter=0
	End If
End Sub

Sub zip_log
	If File.Exists(logdir,"logcat.txt") Then 
			File.Copy(logdir,"logcat.txt",arcdir,"log_"&date&"_"&time&".txt")
		Log("file logcat SubExists!")
		Else 
		init	
	End If
End Sub

