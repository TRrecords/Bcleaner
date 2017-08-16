package com.cleanerb.de;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class widget extends  android.app.Service{
	public static class widget_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
			android.content.Intent in = new android.content.Intent(context, widget.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
			context.startService(in);
		}

	}
    static widget mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return widget.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new BA(this, null, null, "com.cleanerb.de", "com.cleanerb.de.widget");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "com.cleanerb.de.widget", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("** Service (widget) Create **");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			if (ServiceHelper.StarterHelper.waitForLayout != null)
				BA.handler.post(ServiceHelper.StarterHelper.waitForLayout);
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA))
			handleStart(intent);
		else {
			ServiceHelper.StarterHelper.waitForLayout = new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (widget) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
				}
			};
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (widget) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
    			if (intent != null) {
    				if (intent.hasExtra("b4a_internal_intent"))
    					iw.setObject((android.content.Intent) intent.getParcelableExtra("b4a_internal_intent"));
    				else
    					iw.setObject(intent);
    			}
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        BA.LogInfo("** Service (widget) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.cachecleaner.CacheCleaner _cb = null;
public static anywheresoftware.b4a.objects.Timer _t2 = null;
public static String _name = "";
public static String _apath = "";
public static String _l = "";
public static String[] _types = null;
public static String _packname = "";
public static de.donmanfred.AnimationComposerWrapper _am = null;
public static Object[] _app = null;
public static int _counter = 0;
public static com.rootsoft.customtoast.CustomToast _cts = null;
public static anywheresoftware.b4a.objects.collections.List _piclist = null;
public static anywheresoftware.b4a.objects.collections.List _obj = null;
public static String _date = "";
public static String _time = "";
public static String _dir = "";
public static com.cleanerb.de.keyvaluestore _kvst = null;
public static com.cleanerb.de.keyvaluestore _kvsdata = null;
public com.cleanerb.de.main _main = null;
public com.cleanerb.de.starter _starter = null;
public com.cleanerb.de.setanimation _setanimation = null;
public com.cleanerb.de.loglist _loglist = null;
public static String  _cb_oncleancompleted(long _cachesize) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub cb_onCleanCompleted(CacheSize As Long)";
 //BA.debugLineNum = 139;BA.debugLine="cts.Show(\"Phone is clean!\",8,Gravity.CENTER_HORIZ";
_cts.Show(BA.ObjectToCharSequence("Phone is clean!"),(int) (8),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,(int) (0),(int) (0));
 //BA.debugLineNum = 142;BA.debugLine="kvsdata.PutSimple(date&\" at \"&time,obj.Size&\" App";
_kvsdata._putsimple(_date+" at "+_time,(Object)(BA.NumberToString(_obj.getSize())+" Apps searched / "+_formatfilesize((float) (_cachesize))+" cache cleaned."));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public static String  _cb_oncleanstarted() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _icon = null;
int _i = 0;
 //BA.debugLineNum = 126;BA.debugLine="Sub cb_onCleanStarted";
 //BA.debugLineNum = 127;BA.debugLine="Log(\"CleanStarted\")";
anywheresoftware.b4a.keywords.Common.Log("CleanStarted");
 //BA.debugLineNum = 129;BA.debugLine="Private icon As Bitmap";
_icon = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 130;BA.debugLine="For i = 0 To  piclist.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_piclist.getSize()-1);
for (_i = (int) (0) ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
 //BA.debugLineNum = 131;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_i));
 //BA.debugLineNum = 132;BA.debugLine="icon=piclist.Get(i)";
_icon.setObject((android.graphics.Bitmap)(_piclist.Get(_i)));
 //BA.debugLineNum = 133;BA.debugLine="cts.ShowBitmap(\"Cleaning\",0.4,Gravity.CENTER_HOR";
_cts.ShowBitmap(BA.ObjectToCharSequence("Cleaning"),(int) (0.4),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,(int) (0),(int) (0),(android.graphics.Bitmap)(_icon.getObject()));
 }
};
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return "";
}
public static String  _cb_onscancompleted(Object _appslist) throws Exception{
long _totalsize = 0L;
anywheresoftware.b4a.phone.PackageManagerWrapper _pm = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _icon = null;
anywheresoftware.b4a.objects.collections.List _lu = null;
int _n = 0;
 //BA.debugLineNum = 78;BA.debugLine="Sub cb_onScanCompleted(AppsList As Object)";
 //BA.debugLineNum = 79;BA.debugLine="Dim totalsize As Long = 0";
_totalsize = (long) (0);
 //BA.debugLineNum = 80;BA.debugLine="Dim pm As PackageManager";
_pm = new anywheresoftware.b4a.phone.PackageManagerWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private icon As BitmapDrawable";
_icon = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 82;BA.debugLine="piclist.Clear";
_piclist.Clear();
 //BA.debugLineNum = 83;BA.debugLine="obj.Clear";
_obj.Clear();
 //BA.debugLineNum = 84;BA.debugLine="Try";
try { //BA.debugLineNum = 85;BA.debugLine="Dim lu As List = AppsList";
_lu = new anywheresoftware.b4a.objects.collections.List();
_lu.setObject((java.util.List)(_appslist));
 //BA.debugLineNum = 86;BA.debugLine="If lu.Size=0 Then";
if (_lu.getSize()==0) { 
 //BA.debugLineNum = 87;BA.debugLine="Log(\"nothing to show\")";
anywheresoftware.b4a.keywords.Common.Log("nothing to show");
 //BA.debugLineNum = 88;BA.debugLine="cts.ShowBitmap(\"Phone is clean!\",10,Gravity.CEN";
_cts.ShowBitmap(BA.ObjectToCharSequence("Phone is clean!"),(int) (10),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,(int) (0),(int) (0),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_done_all_white_18dp.png").getObject()));
 //BA.debugLineNum = 90;BA.debugLine="kvst.PutSimple(date&\" at \"&time,obj.Size&\" Apps";
_kvst._putsimple(_date+" at "+_time,(Object)(BA.NumberToString(_obj.getSize())+" Apps searched / "+_formatfilesize((float) (0))+" cache cleaned."));
 //BA.debugLineNum = 91;BA.debugLine="kvsdata.PutSimple(date&\" at \"&time,\"clear! - 0,";
_kvsdata._putsimple(_date+" at "+_time,(Object)("clear! - 0,00 MB"));
 //BA.debugLineNum = 92;BA.debugLine="CallSub(Main,\"button_off\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"button_off");
 //BA.debugLineNum = 93;BA.debugLine="CallSub(Main,\"info_set\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"info_set");
 //BA.debugLineNum = 95;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 97;BA.debugLine="For n = 0 To lu.Size-1";
{
final int step17 = 1;
final int limit17 = (int) (_lu.getSize()-1);
for (_n = (int) (0) ; (step17 > 0 && _n <= limit17) || (step17 < 0 && _n >= limit17); _n = ((int)(0 + _n + step17)) ) {
 //BA.debugLineNum = 98;BA.debugLine="app= lu.Get(n)";
_app = (Object[])(_lu.Get(_n));
 //BA.debugLineNum = 99;BA.debugLine="If app(1) = \"com.android.systemui\" Then Continu";
if ((_app[(int) (1)]).equals((Object)("com.android.systemui"))) { 
if (true) continue;};
 //BA.debugLineNum = 100;BA.debugLine="icon = pm.GetApplicationIcon(app(1))";
_icon.setObject((android.graphics.drawable.BitmapDrawable)(_pm.GetApplicationIcon(BA.ObjectToString(_app[(int) (1)]))));
 //BA.debugLineNum = 101;BA.debugLine="totalsize = totalsize+app(2)";
_totalsize = (long) (_totalsize+(double)(BA.ObjectToNumber(_app[(int) (2)])));
 //BA.debugLineNum = 102;BA.debugLine="piclist.Add(icon.Bitmap)";
_piclist.Add((Object)(_icon.getBitmap()));
 //BA.debugLineNum = 103;BA.debugLine="obj.Add(app(1))";
_obj.Add(_app[(int) (1)]);
 //BA.debugLineNum = 104;BA.debugLine="kvsdata.PutSimple(date&\" at \"&time,obj.Size&\" A";
_kvsdata._putsimple(_date+" at "+_time,(Object)(BA.NumberToString(_obj.getSize())+" Apps / "+_formatfilesize((float) (_totalsize))));
 //BA.debugLineNum = 105;BA.debugLine="kvst.PutSimple(date&\" at \"&time,obj.Size&\" Apps";
_kvst._putsimple(_date+" at "+_time,(Object)(BA.NumberToString(_obj.getSize())+" Apps / "+_formatfilesize((float) (_totalsize))));
 }
};
 //BA.debugLineNum = 107;BA.debugLine="cts.Show(FormatFileSize(totalsize)&\" found\",5,Gr";
_cts.Show(BA.ObjectToCharSequence(_formatfilesize((float) (_totalsize))+" found"),(int) (5),anywheresoftware.b4a.keywords.Common.Gravity.CENTER,(int) (0),(int) (0));
 //BA.debugLineNum = 108;BA.debugLine="File.WriteList(dir,\"data1.txt\",obj)";
anywheresoftware.b4a.keywords.Common.File.WriteList(_dir,"data1.txt",_obj);
 } 
       catch (Exception e30) {
			processBA.setLastException(e30); //BA.debugLineNum = 110;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.Log(anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
 //BA.debugLineNum = 112;BA.debugLine="If lu.size>0 Then";
if (_lu.getSize()>0) { 
 //BA.debugLineNum = 113;BA.debugLine="CallSub(Main,\"button_set\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"button_set");
 //BA.debugLineNum = 114;BA.debugLine="CallSub(Main,\"tab2_refresh\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"tab2_refresh");
 };
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public static String  _cb_onscanprogress(int _current,int _total) throws Exception{
int _prog = 0;
 //BA.debugLineNum = 73;BA.debugLine="Sub cb_onScanProgress(Current As Int , Total As In";
 //BA.debugLineNum = 74;BA.debugLine="Dim prog As Int=100/Total*Current";
_prog = (int) (100/(double)_total*_current);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public static String  _cb_onscanstarted() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub cb_OnScanStarted";
 //BA.debugLineNum = 70;BA.debugLine="Log(\"Started\")";
anywheresoftware.b4a.keywords.Common.Log("Started");
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public static String  _clean_start() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub clean_start";
 //BA.debugLineNum = 119;BA.debugLine="t2.Enabled=True";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 120;BA.debugLine="CallSub(Main,\"but_on\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"but_on");
 //BA.debugLineNum = 121;BA.debugLine="CallSub(Main,\"button_off\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"button_off");
 //BA.debugLineNum = 122;BA.debugLine="cts.ShowBitmap(\"Cleaning\",10,Gravity.CENTER_HORIZ";
_cts.ShowBitmap(BA.ObjectToCharSequence("Cleaning"),(int) (10),anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL,(int) (0),(int) (0),(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"warning_38x38.png").getObject()));
 //BA.debugLineNum = 123;BA.debugLine="Log(\"start\")";
anywheresoftware.b4a.keywords.Common.Log("start");
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public static String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 159;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
 //BA.debugLineNum = 160;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 161;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 162;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 164;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 165;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 166;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
 //BA.debugLineNum = 167;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 168;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
 //BA.debugLineNum = 169;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 170;BA.debugLine="Return NumberFormat(Si, 1, 2) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (2))+_unit[_i];
 };
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public static String  _im1_click() throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub im1_Click";
 //BA.debugLineNum = 64;BA.debugLine="cb.ScanCache";
_cb.ScanCache();
 //BA.debugLineNum = 65;BA.debugLine="Log(\"b2: click\")";
anywheresoftware.b4a.keywords.Common.Log("b2: click");
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private cb As CacheCleaner";
_cb = new anywheresoftware.b4a.cachecleaner.CacheCleaner();
 //BA.debugLineNum = 9;BA.debugLine="Dim t2 As Timer";
_t2 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 10;BA.debugLine="Private name,apath,l,Types(1),packName As String";
_name = "";
_apath = "";
_l = "";
_types = new String[(int) (1)];
java.util.Arrays.fill(_types,"");
_packname = "";
 //BA.debugLineNum = 11;BA.debugLine="Dim am As AnimationComposer";
_am = new de.donmanfred.AnimationComposerWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim app() As Object";
_app = new Object[(int) (0)];
{
int d0 = _app.length;
for (int i0 = 0;i0 < d0;i0++) {
_app[i0] = new Object();
}
}
;
 //BA.debugLineNum = 13;BA.debugLine="Dim counter As Int";
_counter = 0;
 //BA.debugLineNum = 14;BA.debugLine="Private cts As CustomToast";
_cts = new com.rootsoft.customtoast.CustomToast();
 //BA.debugLineNum = 15;BA.debugLine="Dim piclist As List";
_piclist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Dim obj As List";
_obj = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="Dim date,time As String";
_date = "";
_time = "";
 //BA.debugLineNum = 18;BA.debugLine="Dim dir As String=File.DirDefaultExternal";
_dir = anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal();
 //BA.debugLineNum = 19;BA.debugLine="Private kvst,kvsdata As KeyValueStore";
_kvst = new com.cleanerb.de.keyvaluestore();
_kvsdata = new com.cleanerb.de.keyvaluestore();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public static String  _remote_start() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub remote_start";
 //BA.debugLineNum = 54;BA.debugLine="kvst.Initialize(File.DirInternal,\"data_time\")";
_kvst._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_time");
 //BA.debugLineNum = 55;BA.debugLine="piclist.Initialize";
_piclist.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="obj.Initialize";
_obj.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="cb.initialize(\"cb\")";
_cb.initialize("cb",processBA);
 //BA.debugLineNum = 58;BA.debugLine="cts.Initialize";
_cts.Initialize(processBA);
 //BA.debugLineNum = 59;BA.debugLine="counter=0";
_counter = (int) (0);
 //BA.debugLineNum = 60;BA.debugLine="cb.ScanCache";
_cb.ScanCache();
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
b4a.example.osstats _rstat = null;
 //BA.debugLineNum = 22;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 23;BA.debugLine="DateTime.TimeFormat=\"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
 //BA.debugLineNum = 24;BA.debugLine="DateTime.DateFormat=\"dd.MM.yyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd.MM.yyy");
 //BA.debugLineNum = 25;BA.debugLine="date=DateTime.Date(DateTime.Now)";
_date = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 26;BA.debugLine="time=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 27;BA.debugLine="Dim rstat As OSStats";
_rstat = new b4a.example.osstats();
 //BA.debugLineNum = 28;BA.debugLine="rstat.Initialize(100,50,Me,\"ram\")";
_rstat._initialize(processBA,(int) (100),(int) (50),widget.getObject(),"ram");
 //BA.debugLineNum = 29;BA.debugLine="kvst.Initialize(File.DirInternal,\"data_time\")";
_kvst._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_time");
 //BA.debugLineNum = 30;BA.debugLine="kvsdata.Initialize(File.DirInternal,\"data_data\")";
_kvsdata._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_data");
 //BA.debugLineNum = 31;BA.debugLine="If rstat.IsInitialized=True Then";
if (_rstat.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 32;BA.debugLine="rstat.StartStats";
_rstat._startstats();
 }else {
 //BA.debugLineNum = 35;BA.debugLine="rstat.StartStats";
_rstat._startstats();
 };
 //BA.debugLineNum = 37;BA.debugLine="piclist.Initialize";
_piclist.Initialize();
 //BA.debugLineNum = 38;BA.debugLine="obj.Initialize";
_obj.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="cb.initialize(\"cb\")";
_cb.initialize("cb",processBA);
 //BA.debugLineNum = 40;BA.debugLine="cts.Initialize";
_cts.Initialize(processBA);
 //BA.debugLineNum = 41;BA.debugLine="counter=0";
_counter = (int) (0);
 //BA.debugLineNum = 42;BA.debugLine="t2.Initialize(\"t2\",1000)";
_t2.Initialize(processBA,"t2",(long) (1000));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 50;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static String  _t2_tick() throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub t2_Tick";
 //BA.debugLineNum = 146;BA.debugLine="counter=counter+1";
_counter = (int) (_counter+1);
 //BA.debugLineNum = 147;BA.debugLine="If counter=obj.Size Then";
if (_counter==_obj.getSize()) { 
 //BA.debugLineNum = 148;BA.debugLine="cb.CleanCache";
_cb.CleanCache();
 //BA.debugLineNum = 149;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 150;BA.debugLine="counter=0";
_counter = (int) (0);
 //BA.debugLineNum = 151;BA.debugLine="obj.Clear";
_obj.Clear();
 //BA.debugLineNum = 152;BA.debugLine="CallSub(Main,\"tab2_refresh\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"tab2_refresh");
 //BA.debugLineNum = 153;BA.debugLine="CallSub(Main,\"info_set\")";
anywheresoftware.b4a.keywords.Common.CallSubNew(processBA,(Object)(mostCurrent._main.getObject()),"info_set");
 };
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
}
