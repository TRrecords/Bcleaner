Type=Service
Version=6.8
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: false
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private cb As CacheCleaner
	Dim t2 As Timer
	Private name,apath,l,Types(1),packName As String
	Dim am As AnimationComposer
	Dim app() As Object
	 Dim counter As Int
	 Private cts As CustomToast
	Dim piclist As List
	Dim obj As List 
	Dim date,time As String 
	Dim dir As String=File.DirDefaultExternal
	Private kvst,kvsdata As KeyValueStore
End Sub

Sub Service_Create
	DateTime.TimeFormat="HH:mm"
	DateTime.DateFormat="dd.MM.yyy"
	date=DateTime.Date(DateTime.Now)
	time=DateTime.Time(DateTime.Now)
	Dim rstat As OSStats
	rstat.Initialize(100,50,Me,"ram")
	kvst.Initialize(File.DirInternal,"data_time")
	kvsdata.Initialize(File.DirInternal,"data_data")
	If rstat.IsInitialized=True Then
		rstat.StartStats
	Else
			
		rstat.StartStats
	End If
	piclist.Initialize
	obj.Initialize
	cb.initialize("cb")
	cts.Initialize
	counter=0
	t2.Initialize("t2",1000)
End Sub

Sub Service_Start (StartingIntent As Intent)
	
End Sub

Sub Service_Destroy
	t2.Enabled=False
End Sub

Sub remote_start
	kvst.Initialize(File.DirInternal,"data_time")
	piclist.Initialize
	obj.Initialize
	cb.initialize("cb")
	cts.Initialize
	counter=0
	cb.ScanCache
End Sub

Sub im1_Click
	cb.ScanCache
	Log("b2: click")
End Sub 

Sub cb_OnScanStarted

	Log("Started")
End Sub

Sub cb_onScanProgress(Current As Int , Total As Int)
	Dim prog As Int=100/Total*Current 
	
End Sub

Sub cb_onScanCompleted(AppsList As Object)
	Dim totalsize As Long = 0
	Dim pm As PackageManager
	Private icon As BitmapDrawable
	piclist.Clear
	obj.Clear
	Try
		Dim lu As List = AppsList
		If lu.Size=0 Then
			Log("nothing to show")
			cts.ShowBitmap("Phone is clean!",10,Gravity.CENTER_HORIZONTAL,0,0,LoadBitmap(File.DirAssets,"ic_done_all_white_18dp.png"))
			'ToastMessageShow("Phone ist allready clean!",False)
			kvst.PutSimple(date&" at "&time,obj.Size&" Apps searched / "&FormatFileSize(0)&" cache cleaned.")
			kvsdata.PutSimple(date&" at "&time,"clear! - 0,00 MB")
			CallSub(Main,"button_off")
			CallSub(Main,"info_set")
			'CallSub(Main,"tab2_refresh")
			Return
		End If
		For n = 0 To lu.Size-1
			app= lu.Get(n)
			If app(1) = "com.android.systemui" Then Continue 'com.android.systemui This Pakage Have No Icon In Some Android 5
			icon = pm.GetApplicationIcon(app(1))
			totalsize = totalsize+app(2)
			piclist.Add(icon.Bitmap)
			obj.Add(app(1))
			kvsdata.PutSimple(date&" at "&time,obj.Size&" Apps / "&FormatFileSize(totalsize))
			kvst.PutSimple(date&" at "&time,obj.Size&" Apps / "&FormatFileSize(totalsize))
		Next
		cts.Show(FormatFileSize(totalsize)&" found",5,Gravity.CENTER,0,0)
		File.WriteList(dir,"data1.txt",obj)
	Catch
		Log(LastException.Message)
	End Try
	If lu.size>0 Then
		CallSub(Main,"button_set")
		CallSub(Main,"tab2_refresh")
	End If
	
End Sub
Sub clean_start
	t2.Enabled=True
	CallSub(Main,"but_on")
	CallSub(Main,"button_off")
	cts.ShowBitmap("Cleaning",10,Gravity.CENTER_HORIZONTAL,0,0,LoadBitmap(File.DirAssets,"warning_38x38.png"))
	Log("start")
End Sub

Sub cb_onCleanStarted
	Log("CleanStarted")
	'CallSub(Main,"button_set")
	Private icon As Bitmap
	For i = 0 To  piclist.Size-1
		Log(i)
		icon=piclist.Get(i)
		cts.ShowBitmap("Cleaning",0.4,Gravity.CENTER_HORIZONTAL,0,0,icon)
	Next

End Sub

Sub cb_onCleanCompleted(CacheSize As Long)
	cts.Show("Phone is clean!",8,Gravity.CENTER_HORIZONTAL,0,0)
	'ToastMessageShow(FormatFileSize(CacheSize)&" cleaned!",False)
	'kvst.PutSimple(date&" at "&time,obj.Size&" Apps searched / "&FormatFileSize(CacheSize)&" cache cleaned.")
	kvsdata.PutSimple(date&" at "&time,obj.Size&" Apps searched / "&FormatFileSize(CacheSize)&" cache cleaned.")
End Sub

Sub t2_Tick
	counter=counter+1
	If counter=obj.Size Then 
		cb.CleanCache
		t2.Enabled=False
		counter=0
		obj.Clear
		CallSub(Main,"tab2_refresh")
		CallSub(Main,"info_set")
		'cts.Show("Phone is clean!",8,Gravity.CENTER_HORIZONTAL,0,0)
	End If
	
End Sub

Sub FormatFileSize(Bytes As Float) As String
	Private Unit() As String = Array As String(" Byte", " KB", " MB", " GB", " TB", " PB", " EB", " ZB", " YB")
	If Bytes = 0 Then
		Return "0 Bytes"
	Else
		Private Po, Si As Double
		Private I As Int
		Bytes = Abs(Bytes)
		I = Floor(Logarithm(Bytes, 1024))
		Po = Power(1024, I)
		Si = Bytes / Po
		Return NumberFormat(Si, 1, 2) & Unit(I)
	End If
End Sub
