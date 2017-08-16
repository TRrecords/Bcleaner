package com.cleanerb.de;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends android.support.v7.app.AppCompatActivity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new BA(this.getApplicationContext(), null, null, "com.cleanerb.de", "com.cleanerb.de.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.cleanerb.de", "com.cleanerb.de.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.cleanerb.de.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.phone.PackageManagerWrapper _pak = null;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
public static com.rootsoft.oslibrary.OSLibrary _os = null;
public static String _date = "";
public static String _time = "";
public Object[] _args = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _obj1 = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _obj2 = null;
public anywheresoftware.b4a.agraham.reflection.Reflection _obj3 = null;
public static int _size = 0;
public static int _flags = 0;
public static String _name = "";
public static String _apath = "";
public static String _l = "";
public static String[] _types = null;
public static String _packname = "";
public anywheresoftware.b4a.objects.drawable.BitmapDrawable _icon = null;
public de.amberhome.objects.appcompat.AppCompatBase _ac = null;
public de.amberhome.objects.appcompat.ACToolbarLightWrapper _toolbar = null;
public de.amberhome.objects.appcompat.ACActionBar _abhelper = null;
public com.tchart.materialcolors.MaterialColors _mcl = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lw3 = null;
public anywheresoftware.b4a.objects.collections.List _applist = null;
public anywheresoftware.b4a.objects.collections.List _catlist = null;
public anywheresoftware.b4a.objects.collections.List _mathlist = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog _cinfo = null;
public static int _counter = 0;
public com.cleanerb.de.keyvaluestore _kvst = null;
public com.cleanerb.de.keyvaluestore _kvsdata = null;
public com.cleanerb.de.keyvaluestore _kvsmat = null;
public de.donmanfred.AlertDialogBuilder _dia = null;
public de.donmanfred.AlertDialogBuilder _dia2 = null;
public de.donmanfred.AlertDialogBuilder _dia3 = null;
public anywheresoftware.b4a.objects.drawable.BitmapDrawable _shader = null;
public anywheresoftware.b4j.object.JavaObject _draw = null;
public anywheresoftware.b4a.objects.collections.List _tmp = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public MLfiles.Fileslib.MLfiles _storage = null;
public Object[] _app = null;
public com.maximussoft.msos.MSOS _xmsos = null;
public b4a.example.osstats _xosstats = null;
public anywheresoftware.b4a.objects.collections.List _piclist = null;
public anywheresoftware.b4a.objects.PanelWrapper _expan = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog _exdia = null;
public anywheresoftware.b4a.phone.CallLogWrapper _calllog = null;
public anywheresoftware.b4a.objects.collections.List _callist = null;
public flm.b4a.animationplus.AnimationPlusWrapper _animplus = null;
public giuseppe.salvi.icos.library.ICOSRotateAnimation _ios = null;
public anywheresoftware.b4a.objects.TabHostWrapper _tab1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lv4 = null;
public com.cleanerb.de.batt _bat = null;
public b4a.community.donmanfred.widget.bcSnackBar _sb1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lv5 = null;
public com.circlebuttonwrapper.CircleButtonWrapper _cbutton = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public de.amberhome.objects.appcompat.ACFlatButtonWrapper _afb1 = null;
public com.cleanerb.de.widget _widget = null;
public com.cleanerb.de.starter _starter = null;
public com.cleanerb.de.setanimation _setanimation = null;
public com.cleanerb.de.loglist _loglist = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (loglist.mostCurrent != null);
return vis;}
public static String  _about_click() throws Exception{
anywheresoftware.b4a.objects.drawable.BitmapDrawable _ig = null;
 //BA.debugLineNum = 502;BA.debugLine="Sub about_click";
 //BA.debugLineNum = 503;BA.debugLine="Dim ig As BitmapDrawable";
_ig = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 504;BA.debugLine="ig.Initialize(LoadBitmap(File.DirAssets,\"id-card.";
_ig.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"id-card.png").getObject()));
 //BA.debugLineNum = 505;BA.debugLine="dia3.setTitle(\"About \"&pak.GetApplicationLabel(\"c";
mostCurrent._dia3.setTitle(BA.ObjectToCharSequence("About "+_pak.GetApplicationLabel("com.cleanerb.de")+" - Version "+_pak.GetVersionName("com.cleanerb.de"))).create();
 //BA.debugLineNum = 506;BA.debugLine="dia3.setIcon2(ig).create";
mostCurrent._dia3.setIcon2((android.graphics.drawable.Drawable)(_ig.getObject())).create();
 //BA.debugLineNum = 507;BA.debugLine="dia3.setMessage(\"Written in Basic by D.Trojan. Pu";
mostCurrent._dia3.setMessage(BA.ObjectToCharSequence("Written in Basic by D.Trojan. Published by SuloMedia™")).setCancelable(anywheresoftware.b4a.keywords.Common.True).setNeutralButton(BA.ObjectToCharSequence("Ok")).show();
 //BA.debugLineNum = 508;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _ic = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _id = null;
String _r = "";
 //BA.debugLineNum = 74;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 75;BA.debugLine="Activity.LoadLayout(\"1\")";
mostCurrent._activity.LoadLayout("1",mostCurrent.activityBA);
 //BA.debugLineNum = 77;BA.debugLine="Dim ic,id As Bitmap";
_ic = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_id = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 78;BA.debugLine="ic=LoadBitmap(File.DirAssets,\"ic_arrow_drop_down_";
_ic = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_arrow_drop_down_circle_white_18dp.png");
 //BA.debugLineNum = 79;BA.debugLine="id=LoadBitmap(File.DirAssets,\"ic_arrow_back_white";
_id = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_arrow_back_white_18dp.png");
 //BA.debugLineNum = 80;BA.debugLine="toolbar.SetAsActionBar";
mostCurrent._toolbar.SetAsActionBar(mostCurrent.activityBA);
 //BA.debugLineNum = 81;BA.debugLine="toolbar.Elevation=10dip";
mostCurrent._toolbar.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))));
 //BA.debugLineNum = 82;BA.debugLine="toolbar.PopupTheme=toolbar.THEME_LIGHT";
mostCurrent._toolbar.setPopupTheme(mostCurrent._toolbar.THEME_LIGHT);
 //BA.debugLineNum = 83;BA.debugLine="toolbar.Title=pak.GetApplicationLabel(\"com.cleane";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence(_pak.GetApplicationLabel("com.cleanerb.de")));
 //BA.debugLineNum = 84;BA.debugLine="toolbar.SubTitle=\"Version \"&pak.GetVersionName(\"c";
mostCurrent._toolbar.setSubTitle(BA.ObjectToCharSequence("Version "+_pak.GetVersionName("com.cleanerb.de")));
 //BA.debugLineNum = 85;BA.debugLine="toolbar.NavigationIconBitmap=id";
mostCurrent._toolbar.setNavigationIconBitmap((android.graphics.Bitmap)(_id.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="toolbar.Color=Colors.ARGB(255,65,66,67)";
mostCurrent._toolbar.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (65),(int) (66),(int) (67)));
 //BA.debugLineNum = 87;BA.debugLine="piclist.Initialize";
mostCurrent._piclist.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="ABHelper.Initialize";
mostCurrent._abhelper.Initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 89;BA.debugLine="callist.Initialize";
mostCurrent._callist.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="xOSStats.Initialize(400, 50, Me, \"myStats\")";
mostCurrent._xosstats._initialize(mostCurrent.activityBA,(int) (400),(int) (50),main.getObject(),"myStats");
 //BA.debugLineNum = 91;BA.debugLine="os.Initialize(\"os\")";
_os.Initialize(processBA,"os");
 //BA.debugLineNum = 92;BA.debugLine="toolbar.InitMenuListener";
mostCurrent._toolbar.InitMenuListener();
 //BA.debugLineNum = 93;BA.debugLine="ABHelper.HomeVisible=True";
mostCurrent._abhelper.setHomeVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 94;BA.debugLine="applist.Initialize";
mostCurrent._applist.Initialize();
 //BA.debugLineNum = 95;BA.debugLine="mathlist.Initialize";
mostCurrent._mathlist.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="expan.Initialize(\"expan\")";
mostCurrent._expan.Initialize(mostCurrent.activityBA,"expan");
 //BA.debugLineNum = 97;BA.debugLine="tmp.Initialize";
mostCurrent._tmp.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="catlist.Initialize";
mostCurrent._catlist.Initialize();
 //BA.debugLineNum = 99;BA.debugLine="dia.Initialize(\"dia\")";
mostCurrent._dia.Initialize(mostCurrent.activityBA,"dia");
 //BA.debugLineNum = 100;BA.debugLine="dia2.Initialize(\"dia2\")";
mostCurrent._dia2.Initialize(mostCurrent.activityBA,"dia2");
 //BA.debugLineNum = 101;BA.debugLine="dia3.Initialize(\"dia3\")";
mostCurrent._dia3.Initialize(mostCurrent.activityBA,"dia3");
 //BA.debugLineNum = 102;BA.debugLine="lw3.Initialize(\"lw3\")";
mostCurrent._lw3.Initialize(mostCurrent.activityBA,"lw3");
 //BA.debugLineNum = 103;BA.debugLine="lw3.Enabled=True";
mostCurrent._lw3.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 104;BA.debugLine="t1.Initialize(\"t1\",1000)";
_t1.Initialize(processBA,"t1",(long) (1000));
 //BA.debugLineNum = 105;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 106;BA.debugLine="counter=0";
_counter = (int) (0);
 //BA.debugLineNum = 107;BA.debugLine="Activity.TitleColor=mcl.md_black_1000";
mostCurrent._activity.setTitleColor(mostCurrent._mcl.getmd_black_1000());
 //BA.debugLineNum = 108;BA.debugLine="Activity.Color=Colors.ARGB(255,65,66,67)";
mostCurrent._activity.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (65),(int) (66),(int) (67)));
 //BA.debugLineNum = 109;BA.debugLine="Activity.AddMenuItem3(\"Log\", \"inf\", ic,True)";
mostCurrent._activity.AddMenuItem3(BA.ObjectToCharSequence("Log"),"inf",(android.graphics.Bitmap)(_ic.getObject()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 111;BA.debugLine="Activity.AddMenuItem(\"System RAM\",\"aps\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("System RAM"),"aps");
 //BA.debugLineNum = 112;BA.debugLine="Activity.AddMenuItem(\"reload\",\"ref\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("reload"),"ref");
 //BA.debugLineNum = 113;BA.debugLine="Activity.AddMenuItem(\"About\",\"about\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("About"),"about");
 //BA.debugLineNum = 115;BA.debugLine="Activity.AddMenuItem(\"Exit\", \"close\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("Exit"),"close");
 //BA.debugLineNum = 116;BA.debugLine="draw.InitializeNewInstance(\"android.graphics.Shad";
mostCurrent._draw.InitializeNewInstance("android.graphics.Shader",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 117;BA.debugLine="Label4.Text=\"Scan\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Scan"));
 //BA.debugLineNum = 119;BA.debugLine="Label4.textsize=15";
mostCurrent._label4.setTextSize((float) (15));
 //BA.debugLineNum = 120;BA.debugLine="DateTime.TimeFormat=\"HH:mm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm");
 //BA.debugLineNum = 121;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
 //BA.debugLineNum = 122;BA.debugLine="date=DateTime.Date(DateTime.Now)";
_date = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 123;BA.debugLine="time=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 124;BA.debugLine="Cbutton.ButtonColor=mcl.md_amber_600";
mostCurrent._cbutton.setButtonColor(mostCurrent._mcl.getmd_amber_600());
 //BA.debugLineNum = 125;BA.debugLine="Label4.BringToFront";
mostCurrent._label4.BringToFront();
 //BA.debugLineNum = 128;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 //BA.debugLineNum = 130;BA.debugLine="If File.Exists(File.DirInternal,\"math.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"math.txt")) { 
 }else {
 //BA.debugLineNum = 133;BA.debugLine="File.WriteList(File.DirInternal,\"math.txt\",mathl";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"math.txt",mostCurrent._mathlist);
 };
 };
 //BA.debugLineNum = 137;BA.debugLine="kvst.Initialize(File.DirInternal,\"data_time\")";
mostCurrent._kvst._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_time");
 //BA.debugLineNum = 138;BA.debugLine="kvsdata.Initialize(File.DirInternal,\"data_data\")";
mostCurrent._kvsdata._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_data");
 //BA.debugLineNum = 139;BA.debugLine="kvsmat.Initialize(File.DirInternal,\"data_math\")";
mostCurrent._kvsmat._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_math");
 //BA.debugLineNum = 140;BA.debugLine="ios.InfinityRotateCentre(\"ios\",360,10)";
mostCurrent._ios.InfinityRotateCentre(mostCurrent.activityBA,"ios",(float) (360),(long) (10));
 //BA.debugLineNum = 141;BA.debugLine="bat.Initialize";
mostCurrent._bat._initialize(processBA);
 //BA.debugLineNum = 142;BA.debugLine="kvs_read";
_kvs_read();
 //BA.debugLineNum = 143;BA.debugLine="tab_one";
_tab_one();
 //BA.debugLineNum = 144;BA.debugLine="tab_two";
_tab_two();
 //BA.debugLineNum = 146;BA.debugLine="For Each r As String  In kvst.ListKeys";
final anywheresoftware.b4a.BA.IterableList group62 = mostCurrent._kvst._listkeys();
final int groupLen62 = group62.getSize();
for (int index62 = 0;index62 < groupLen62 ;index62++){
_r = BA.ObjectToString(group62.Get(index62));
 //BA.debugLineNum = 147;BA.debugLine="Log(r)";
anywheresoftware.b4a.keywords.Common.Log(_r);
 }
;
 //BA.debugLineNum = 151;BA.debugLine="afb1.BringToFront";
mostCurrent._afb1.BringToFront();
 //BA.debugLineNum = 152;BA.debugLine="afb1.Text=\"Cllean\"";
mostCurrent._afb1.setText(BA.ObjectToCharSequence("Cllean"));
 //BA.debugLineNum = 153;BA.debugLine="afb1.TextSize=12";
mostCurrent._afb1.setTextSize((float) (12));
 //BA.debugLineNum = 154;BA.debugLine="afb1.Color=mcl.md_grey_600";
mostCurrent._afb1.setColor(mostCurrent._mcl.getmd_grey_600());
 //BA.debugLineNum = 155;BA.debugLine="afb1.Gravity=Gravity.CENTER";
mostCurrent._afb1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 156;BA.debugLine="afb1.TextColor=mcl.md_white_1000";
mostCurrent._afb1.setTextColor(mostCurrent._mcl.getmd_white_1000());
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 169;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 170;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 171;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 };
 //BA.debugLineNum = 173;BA.debugLine="Return(True)";
if (true) return (anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 165;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 160;BA.debugLine="xOSStats.StartStats";
mostCurrent._xosstats._startstats();
 //BA.debugLineNum = 161;BA.debugLine="kvs_read";
_kvs_read();
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public static String  _afb1_click() throws Exception{
 //BA.debugLineNum = 305;BA.debugLine="Sub afb1_Click";
 //BA.debugLineNum = 307;BA.debugLine="CallSubDelayed(widget,\"clean_start\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(mostCurrent.activityBA,(Object)(mostCurrent._widget.getObject()),"clean_start");
 //BA.debugLineNum = 308;BA.debugLine="but_off";
_but_off();
 //BA.debugLineNum = 309;BA.debugLine="Activity.Invalidate";
mostCurrent._activity.Invalidate();
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public static String  _app_list() throws Exception{
int _i = 0;
String _total = "";
 //BA.debugLineNum = 418;BA.debugLine="Sub app_list";
 //BA.debugLineNum = 419;BA.debugLine="catlist.Clear";
mostCurrent._catlist.Clear();
 //BA.debugLineNum = 420;BA.debugLine="lv4.Clear";
mostCurrent._lv4.Clear();
 //BA.debugLineNum = 421;BA.debugLine="applist=pak.GetInstalledPackages";
mostCurrent._applist = _pak.GetInstalledPackages();
 //BA.debugLineNum = 422;BA.debugLine="Obj1.Target = Obj1.GetContext";
mostCurrent._obj1.Target = (Object)(mostCurrent._obj1.GetContext(processBA));
 //BA.debugLineNum = 423;BA.debugLine="Obj1.Target = Obj1.RunMethod(\"getPackageManager\")";
mostCurrent._obj1.Target = mostCurrent._obj1.RunMethod("getPackageManager");
 //BA.debugLineNum = 424;BA.debugLine="Obj2.Target = Obj1.RunMethod2(\"getInstalledPackag";
mostCurrent._obj2.Target = mostCurrent._obj1.RunMethod2("getInstalledPackages",BA.NumberToString(0),"java.lang.int");
 //BA.debugLineNum = 425;BA.debugLine="size = Obj2.RunMethod(\"size\")";
_size = (int)(BA.ObjectToNumber(mostCurrent._obj2.RunMethod("size")));
 //BA.debugLineNum = 426;BA.debugLine="For i = 0 To size -1";
{
final int step8 = 1;
final int limit8 = (int) (_size-1);
for (_i = (int) (0) ; (step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8); _i = ((int)(0 + _i + step8)) ) {
 //BA.debugLineNum = 427;BA.debugLine="Obj3.Target = Obj2.RunMethod2(\"get\", i, \"java.la";
mostCurrent._obj3.Target = mostCurrent._obj2.RunMethod2("get",BA.NumberToString(_i),"java.lang.int");
 //BA.debugLineNum = 428;BA.debugLine="size = Obj2.RunMethod(\"size\")";
_size = (int)(BA.ObjectToNumber(mostCurrent._obj2.RunMethod("size")));
 //BA.debugLineNum = 429;BA.debugLine="Obj3.Target = Obj3.GetField(\"applicationInfo\") '";
mostCurrent._obj3.Target = mostCurrent._obj3.GetField("applicationInfo");
 //BA.debugLineNum = 430;BA.debugLine="flags = Obj3.GetField(\"flags\")";
_flags = (int)(BA.ObjectToNumber(mostCurrent._obj3.GetField("flags")));
 //BA.debugLineNum = 431;BA.debugLine="packName = Obj3.GetField(\"packageName\")";
mostCurrent._packname = BA.ObjectToString(mostCurrent._obj3.GetField("packageName"));
 //BA.debugLineNum = 432;BA.debugLine="If Bit.And(flags, 1)  = 0 Then";
if (anywheresoftware.b4a.keywords.Common.Bit.And(_flags,(int) (1))==0) { 
 //BA.debugLineNum = 434;BA.debugLine="args(0) = Obj3.Target";
mostCurrent._args[(int) (0)] = mostCurrent._obj3.Target;
 //BA.debugLineNum = 435;BA.debugLine="Types(0) = \"android.content.pm.ApplicationInfo\"";
mostCurrent._types[(int) (0)] = "android.content.pm.ApplicationInfo";
 //BA.debugLineNum = 436;BA.debugLine="name = Obj1.RunMethod4(\"getApplicationLabel\", a";
mostCurrent._name = BA.ObjectToString(mostCurrent._obj1.RunMethod4("getApplicationLabel",mostCurrent._args,mostCurrent._types));
 //BA.debugLineNum = 437;BA.debugLine="icon = Obj1.RunMethod4(\"getApplicationIcon\", ar";
mostCurrent._icon.setObject((android.graphics.drawable.BitmapDrawable)(mostCurrent._obj1.RunMethod4("getApplicationIcon",mostCurrent._args,mostCurrent._types)));
 //BA.debugLineNum = 438;BA.debugLine="Dim total As String";
_total = "";
 //BA.debugLineNum = 439;BA.debugLine="total = File.Size(GetParentPath(GetSourceDir(Ge";
_total = BA.NumberToString(anywheresoftware.b4a.keywords.Common.File.Size(_getparentpath(_getsourcedir(_getactivitiesinfo(mostCurrent._packname))),_getfilename(_getsourcedir(_getactivitiesinfo(mostCurrent._packname)))));
 //BA.debugLineNum = 440;BA.debugLine="lv4.AddTwoLinesAndBitmap2(name,packName&\" | \"&F";
mostCurrent._lv4.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(mostCurrent._name),BA.ObjectToCharSequence(mostCurrent._packname+" | "+_formatfilesize((float)(Double.parseDouble(_total)))),mostCurrent._icon.getBitmap(),(Object)(mostCurrent._packname));
 //BA.debugLineNum = 441;BA.debugLine="catlist.Add(packName)";
mostCurrent._catlist.Add((Object)(mostCurrent._packname));
 };
 }
};
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public static String  _aps_click() throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 389;BA.debugLine="Sub aps_click";
 //BA.debugLineNum = 390;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 391;BA.debugLine="i.Initialize(\"android.intent.action.MANAGE_PACKAG";
_i.Initialize("android.intent.action.MANAGE_PACKAGE_STORAGE","");
 //BA.debugLineNum = 392;BA.debugLine="StartActivity(i)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_i.getObject()));
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public static String  _but_off() throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub but_off";
 //BA.debugLineNum = 296;BA.debugLine="Label4.Text=\"Searching..\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Searching.."));
 //BA.debugLineNum = 297;BA.debugLine="Label4.TextColor=Colors.ARGB(255,65,66,67)";
mostCurrent._label4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (65),(int) (66),(int) (67)));
 //BA.debugLineNum = 298;BA.debugLine="Label4.SetVisibleAnimated(400,False)";
mostCurrent._label4.SetVisibleAnimated((int) (400),anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public static String  _but_on() throws Exception{
 //BA.debugLineNum = 300;BA.debugLine="Sub but_on";
 //BA.debugLineNum = 301;BA.debugLine="Label4.text=\"Scan\"";
mostCurrent._label4.setText(BA.ObjectToCharSequence("Scan"));
 //BA.debugLineNum = 302;BA.debugLine="Label4.TextColor=mcl.md_white_1000";
mostCurrent._label4.setTextColor(mostCurrent._mcl.getmd_white_1000());
 //BA.debugLineNum = 303;BA.debugLine="Label4.SetVisibleAnimated(400,True)";
mostCurrent._label4.SetVisibleAnimated((int) (400),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public static String  _button_off() throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub button_off";
 //BA.debugLineNum = 284;BA.debugLine="afb1.Visible=False";
mostCurrent._afb1.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return "";
}
public static String  _button_set() throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="Sub button_set";
 //BA.debugLineNum = 287;BA.debugLine="If afb1.Visible=False Then";
if (mostCurrent._afb1.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 288;BA.debugLine="afb1.SetVisibleAnimated(400,True)";
mostCurrent._afb1.SetVisibleAnimated((int) (400),anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 290;BA.debugLine="If afb1.Visible=True Then";
if (mostCurrent._afb1.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 291;BA.debugLine="afb1.SetVisibleAnimated(400,False)";
mostCurrent._afb1.SetVisibleAnimated((int) (400),anywheresoftware.b4a.keywords.Common.False);
 };
 };
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public static String  _call_list() throws Exception{
int _res = 0;
 //BA.debugLineNum = 410;BA.debugLine="Sub call_list";
 //BA.debugLineNum = 411;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 412;BA.debugLine="res=InputList(callist,\"Call Log:\",1)";
_res = anywheresoftware.b4a.keywords.Common.InputList(mostCurrent._callist,BA.ObjectToCharSequence("Call Log:"),(int) (1),mostCurrent.activityBA);
 //BA.debugLineNum = 413;BA.debugLine="If Not (res=DialogResponse.CANCEL) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_res==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL)) { 
 //BA.debugLineNum = 414;BA.debugLine="callist.Clear";
mostCurrent._callist.Clear();
 };
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public static String  _cbutton_click() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub Cbutton_Click";
 //BA.debugLineNum = 182;BA.debugLine="ProgressDialogShow(\"Scan for App trash\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Scan for App trash"));
 //BA.debugLineNum = 183;BA.debugLine="ref_click";
_ref_click();
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public static String  _close_click() throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub close_click";
 //BA.debugLineNum = 401;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 402;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public static String  _dia_oncancel() throws Exception{
 //BA.debugLineNum = 462;BA.debugLine="Sub dia_onCancel()";
 //BA.debugLineNum = 463;BA.debugLine="Log($\"onCancel()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onCancel()"));
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return "";
}
public static String  _dia_ondismiss() throws Exception{
 //BA.debugLineNum = 466;BA.debugLine="Sub dia_onDismiss()";
 //BA.debugLineNum = 467;BA.debugLine="Log($\"onDismiss()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onDismiss()"));
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return "";
}
public static String  _dia_onitemclick(int _index,boolean _selected) throws Exception{
 //BA.debugLineNum = 469;BA.debugLine="Sub dia_onItemClick(index As Int,selected As Boole";
 //BA.debugLineNum = 470;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onItemClick("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_selected))+")"));
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return "";
}
public static String  _dia_onkey(int _key,int _keyevent) throws Exception{
 //BA.debugLineNum = 472;BA.debugLine="Sub dia_onKey(key As Int, keyevent As Int)";
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_onclick(int _button,int _index) throws Exception{
 //BA.debugLineNum = 475;BA.debugLine="Sub dia2_onClick(Button As Int, index As Int)";
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_ondismiss() throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Sub dia2_onDismiss()";
 //BA.debugLineNum = 480;BA.debugLine="Log($\"onDismiss()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onDismiss()"));
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_onitemclick(int _index,boolean _selected) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub dia2_onItemClick(index As Int,selected As Bool";
 //BA.debugLineNum = 483;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onItemClick("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_selected))+")"));
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_onkey(int _key,int _keyevent) throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub dia2_onKey(key As Int, keyevent As Int)";
 //BA.debugLineNum = 486;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_onclick(int _button,int _index) throws Exception{
 //BA.debugLineNum = 488;BA.debugLine="Sub dia3_onClick(Button As Int, index As Int)";
 //BA.debugLineNum = 489;BA.debugLine="Log($\"onClick()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onClick()"));
 //BA.debugLineNum = 491;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_ondismiss() throws Exception{
 //BA.debugLineNum = 493;BA.debugLine="Sub dia3_onDismiss()";
 //BA.debugLineNum = 494;BA.debugLine="Log($\"onDismiss()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onDismiss()"));
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_onitemclick(int _index,boolean _selected) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub dia3_onItemClick(index As Int,selected As Bool";
 //BA.debugLineNum = 497;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onItemClick("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_selected))+")"));
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_onkey(int _key,int _keyevent) throws Exception{
 //BA.debugLineNum = 499;BA.debugLine="Sub dia3_onKey(key As Int, keyevent As Int)";
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return "";
}
public static String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 447;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
 //BA.debugLineNum = 448;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 449;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 450;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 452;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 453;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 454;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
 //BA.debugLineNum = 455;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 456;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
 //BA.debugLineNum = 457;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 458;BA.debugLine="Return NumberFormat(Si, 1, 2) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (2))+_unit[_i];
 };
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return "";
}
public static Object  _getactivitiesinfo(String _package) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 524;BA.debugLine="Sub GetActivitiesInfo(package As String) As Object";
 //BA.debugLineNum = 525;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 526;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(processBA));
 //BA.debugLineNum = 527;BA.debugLine="r.Target = r.RunMethod(\"getPackageManager\")";
_r.Target = _r.RunMethod("getPackageManager");
 //BA.debugLineNum = 528;BA.debugLine="r.Target = r.RunMethod3(\"getPackageInfo\", package";
_r.Target = _r.RunMethod3("getPackageInfo",_package,"java.lang.String",BA.NumberToString(0x00000001),"java.lang.int");
 //BA.debugLineNum = 529;BA.debugLine="Return r.GetField(\"applicationInfo\")";
if (true) return _r.GetField("applicationInfo");
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return null;
}
public static String  _getfilename(String _fullpath) throws Exception{
 //BA.debugLineNum = 510;BA.debugLine="Sub GetFileName(FullPath As String) As String";
 //BA.debugLineNum = 511;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\"/";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf("/")+1));
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return "";
}
public static String  _getparentpath(String _path) throws Exception{
String _path1 = "";
 //BA.debugLineNum = 532;BA.debugLine="Sub GetParentPath(Path As String) As String";
 //BA.debugLineNum = 533;BA.debugLine="Dim Path1 As String";
_path1 = "";
 //BA.debugLineNum = 534;BA.debugLine="If Path = \"/\" Then";
if ((_path).equals("/")) { 
 //BA.debugLineNum = 535;BA.debugLine="Return \"/\"";
if (true) return "/";
 };
 //BA.debugLineNum = 537;BA.debugLine="L = Path.LastIndexOf(\"/\")";
mostCurrent._l = BA.NumberToString(_path.lastIndexOf("/"));
 //BA.debugLineNum = 538;BA.debugLine="If L = Path.Length - 1 Then";
if ((mostCurrent._l).equals(BA.NumberToString(_path.length()-1))) { 
 //BA.debugLineNum = 540;BA.debugLine="Path1 = Path.SubString2(0,L)";
_path1 = _path.substring((int) (0),(int)(Double.parseDouble(mostCurrent._l)));
 }else {
 //BA.debugLineNum = 542;BA.debugLine="Path1 = Path";
_path1 = _path;
 };
 //BA.debugLineNum = 544;BA.debugLine="L = Path.LastIndexOf(\"/\")";
mostCurrent._l = BA.NumberToString(_path.lastIndexOf("/"));
 //BA.debugLineNum = 545;BA.debugLine="If L = 0 Then";
if ((mostCurrent._l).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 546;BA.debugLine="L = 1";
mostCurrent._l = BA.NumberToString(1);
 };
 //BA.debugLineNum = 548;BA.debugLine="Return Path1.SubString2(0,L)";
if (true) return _path1.substring((int) (0),(int)(Double.parseDouble(mostCurrent._l)));
 //BA.debugLineNum = 549;BA.debugLine="End Sub";
return "";
}
public static String  _getsourcedir(Object _appinfo) throws Exception{
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
 //BA.debugLineNum = 514;BA.debugLine="Sub GetSourceDir(AppInfo As Object) As String";
 //BA.debugLineNum = 515;BA.debugLine="Try";
try { //BA.debugLineNum = 516;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 517;BA.debugLine="r.Target = AppInfo";
_r.Target = _appinfo;
 //BA.debugLineNum = 518;BA.debugLine="Return r.GetField(\"sourceDir\")";
if (true) return BA.ObjectToString(_r.GetField("sourceDir"));
 } 
       catch (Exception e6) {
			processBA.setLastException(e6); //BA.debugLineNum = 520;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 522;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Dim args(1) As Object";
mostCurrent._args = new Object[(int) (1)];
{
int d0 = mostCurrent._args.length;
for (int i0 = 0;i0 < d0;i0++) {
mostCurrent._args[i0] = new Object();
}
}
;
 //BA.debugLineNum = 29;BA.debugLine="Dim Obj1, Obj2, Obj3 As Reflector";
mostCurrent._obj1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
mostCurrent._obj2 = new anywheresoftware.b4a.agraham.reflection.Reflection();
mostCurrent._obj3 = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 30;BA.debugLine="Dim size,flags As Int";
_size = 0;
_flags = 0;
 //BA.debugLineNum = 31;BA.debugLine="Private name,apath,l,Types(1),packName As String";
mostCurrent._name = "";
mostCurrent._apath = "";
mostCurrent._l = "";
mostCurrent._types = new String[(int) (1)];
java.util.Arrays.fill(mostCurrent._types,"");
mostCurrent._packname = "";
 //BA.debugLineNum = 32;BA.debugLine="Private icon As BitmapDrawable";
mostCurrent._icon = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 33;BA.debugLine="Private ac As AppCompat";
mostCurrent._ac = new de.amberhome.objects.appcompat.AppCompatBase();
 //BA.debugLineNum = 35;BA.debugLine="Private toolbar As ACToolBarLight";
mostCurrent._toolbar = new de.amberhome.objects.appcompat.ACToolbarLightWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Dim ABHelper As ACActionBar";
mostCurrent._abhelper = new de.amberhome.objects.appcompat.ACActionBar();
 //BA.debugLineNum = 37;BA.debugLine="Private mcl As MaterialColors";
mostCurrent._mcl = new com.tchart.materialcolors.MaterialColors();
 //BA.debugLineNum = 38;BA.debugLine="Private lw3 As ListView";
mostCurrent._lw3 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private applist,catlist,mathlist As List";
mostCurrent._applist = new anywheresoftware.b4a.objects.collections.List();
mostCurrent._catlist = new anywheresoftware.b4a.objects.collections.List();
mostCurrent._mathlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 41;BA.debugLine="Private cinfo As CustomDialog";
mostCurrent._cinfo = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog();
 //BA.debugLineNum = 42;BA.debugLine="Dim counter As Int";
_counter = 0;
 //BA.debugLineNum = 43;BA.debugLine="Dim kvst As KeyValueStore";
mostCurrent._kvst = new com.cleanerb.de.keyvaluestore();
 //BA.debugLineNum = 44;BA.debugLine="Dim kvsdata As KeyValueStore";
mostCurrent._kvsdata = new com.cleanerb.de.keyvaluestore();
 //BA.debugLineNum = 45;BA.debugLine="Dim kvsmat As KeyValueStore";
mostCurrent._kvsmat = new com.cleanerb.de.keyvaluestore();
 //BA.debugLineNum = 46;BA.debugLine="Private dia As 	AlertDialogBuilder";
mostCurrent._dia = new de.donmanfred.AlertDialogBuilder();
 //BA.debugLineNum = 47;BA.debugLine="Private dia2 As 	AlertDialogBuilder";
mostCurrent._dia2 = new de.donmanfred.AlertDialogBuilder();
 //BA.debugLineNum = 48;BA.debugLine="Private dia3 As 	AlertDialogBuilder";
mostCurrent._dia3 = new de.donmanfred.AlertDialogBuilder();
 //BA.debugLineNum = 49;BA.debugLine="Private shader As BitmapDrawable";
mostCurrent._shader = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 50;BA.debugLine="Dim draw As JavaObject";
mostCurrent._draw = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 51;BA.debugLine="Dim tmp As List";
mostCurrent._tmp = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 52;BA.debugLine="Private Panel2 As Panel";
mostCurrent._panel2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private storage As MLfiles";
mostCurrent._storage = new MLfiles.Fileslib.MLfiles();
 //BA.debugLineNum = 54;BA.debugLine="Dim app() As Object";
mostCurrent._app = new Object[(int) (0)];
{
int d0 = mostCurrent._app.length;
for (int i0 = 0;i0 < d0;i0++) {
mostCurrent._app[i0] = new Object();
}
}
;
 //BA.debugLineNum = 55;BA.debugLine="Dim xMSOS As MSOS";
mostCurrent._xmsos = new com.maximussoft.msos.MSOS();
 //BA.debugLineNum = 56;BA.debugLine="Dim xOSStats As OSStats";
mostCurrent._xosstats = new b4a.example.osstats();
 //BA.debugLineNum = 57;BA.debugLine="Private piclist As List";
mostCurrent._piclist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 58;BA.debugLine="Dim expan As Panel";
mostCurrent._expan = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Dim  exdia As CustomDialog";
mostCurrent._exdia = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog();
 //BA.debugLineNum = 60;BA.debugLine="Dim calllog As CallLog";
mostCurrent._calllog = new anywheresoftware.b4a.phone.CallLogWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private callist As List";
mostCurrent._callist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 62;BA.debugLine="Dim AnimPlus As AnimationPlus";
mostCurrent._animplus = new flm.b4a.animationplus.AnimationPlusWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Dim ios As ICOSRotateAnimation";
mostCurrent._ios = new giuseppe.salvi.icos.library.ICOSRotateAnimation();
 //BA.debugLineNum = 64;BA.debugLine="Private tab1 As TabHost";
mostCurrent._tab1 = new anywheresoftware.b4a.objects.TabHostWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private lv4 As ListView";
mostCurrent._lv4 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 66;BA.debugLine="Dim bat As batt";
mostCurrent._bat = new com.cleanerb.de.batt();
 //BA.debugLineNum = 67;BA.debugLine="Private sb1 As bcSnackBar";
mostCurrent._sb1 = new b4a.community.donmanfred.widget.bcSnackBar();
 //BA.debugLineNum = 68;BA.debugLine="Private lv5 As ListView";
mostCurrent._lv5 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private Cbutton As Circlebutton";
mostCurrent._cbutton = new com.circlebuttonwrapper.CircleButtonWrapper();
 //BA.debugLineNum = 70;BA.debugLine="Private Label4 As Label";
mostCurrent._label4 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 71;BA.debugLine="Private afb1 As ACFlatButton";
mostCurrent._afb1 = new de.amberhome.objects.appcompat.ACFlatButtonWrapper();
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return "";
}
public static String  _inf_click() throws Exception{
 //BA.debugLineNum = 395;BA.debugLine="Sub inf_click";
 //BA.debugLineNum = 396;BA.debugLine="StartActivity(loglist)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._loglist.getObject()));
 //BA.debugLineNum = 397;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public static String  _info_set() throws Exception{
String _q = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub info_set";
 //BA.debugLineNum = 275;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 276;BA.debugLine="lv5.Clear";
mostCurrent._lv5.Clear();
 //BA.debugLineNum = 277;BA.debugLine="lv5.FastScrollEnabled=True";
mostCurrent._lv5.setFastScrollEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 278;BA.debugLine="For Each q As String In kvst.ListKeys";
final anywheresoftware.b4a.BA.IterableList group4 = mostCurrent._kvst._listkeys();
final int groupLen4 = group4.getSize();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_q = BA.ObjectToString(group4.Get(index4));
 }
;
 //BA.debugLineNum = 280;BA.debugLine="lv5.AddSingleLine(kvst.GetSimple(q))";
mostCurrent._lv5.AddSingleLine(BA.ObjectToCharSequence(mostCurrent._kvst._getsimple(_q)));
 //BA.debugLineNum = 281;BA.debugLine="lv5.AddSingleLine(time)";
mostCurrent._lv5.AddSingleLine(BA.ObjectToCharSequence(_time));
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public static String  _kvs_read() throws Exception{
int _exi = 0;
int _ini = 0;
String _sd = "";
String _si = "";
String _exd = "";
String _inter = "";
String _mount = "";
 //BA.debugLineNum = 373;BA.debugLine="Sub kvs_read";
 //BA.debugLineNum = 374;BA.debugLine="Dim exi,ini As Int";
_exi = 0;
_ini = 0;
 //BA.debugLineNum = 375;BA.debugLine="Dim sd,si,exd,inter,mount As String";
_sd = "";
_si = "";
_exd = "";
_inter = "";
_mount = "";
 //BA.debugLineNum = 376;BA.debugLine="sd=storage.Sdcard";
_sd = mostCurrent._storage.Sdcard();
 //BA.debugLineNum = 377;BA.debugLine="exd=storage.SdcardReady";
_exd = mostCurrent._storage.SdcardReady();
 //BA.debugLineNum = 378;BA.debugLine="inter=os.TotalInternalMemorySize";
_inter = BA.NumberToString(_os.getTotalInternalMemorySize());
 //BA.debugLineNum = 379;BA.debugLine="exi=os.TotalExternalMemorySize";
_exi = (int) (_os.getTotalExternalMemorySize());
 //BA.debugLineNum = 380;BA.debugLine="mount=storage.SdcardReady";
_mount = mostCurrent._storage.SdcardReady();
 //BA.debugLineNum = 381;BA.debugLine="If exd=\"mounted\" Then";
if ((_exd).equals("mounted")) { 
 //BA.debugLineNum = 382;BA.debugLine="si=storage.GetExtSd";
_si = mostCurrent._storage.GetExtSd();
 }else {
 };
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return "";
}
public static String  _lv4_itemclick(int _position,Object _value) throws Exception{
int _t = 0;
anywheresoftware.b4a.objects.IntentWrapper _i = null;
 //BA.debugLineNum = 234;BA.debugLine="Sub lv4_ItemClick (Position As Int, Value As Objec";
 //BA.debugLineNum = 235;BA.debugLine="For t=0 To catlist.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._catlist.getSize()-1);
for (_t = (int) (0) ; (step1 > 0 && _t <= limit1) || (step1 < 0 && _t >= limit1); _t = ((int)(0 + _t + step1)) ) {
 //BA.debugLineNum = 236;BA.debugLine="Log(catlist.Get(t))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(mostCurrent._catlist.Get(_t)));
 //BA.debugLineNum = 237;BA.debugLine="packName=catlist.Get(t)";
mostCurrent._packname = BA.ObjectToString(mostCurrent._catlist.Get(_t));
 }
};
 //BA.debugLineNum = 239;BA.debugLine="If Value=packName Then";
if ((_value).equals((Object)(mostCurrent._packname))) { 
 //BA.debugLineNum = 240;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 241;BA.debugLine="i.Initialize(\"android.content.pm.ApplicationInfo";
_i.Initialize("android.content.pm.ApplicationInfo",BA.ObjectToString(_value));
 //BA.debugLineNum = 242;BA.debugLine="StartActivity(i)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(_i.getObject()));
 };
 //BA.debugLineNum = 244;BA.debugLine="End Sub";
return "";
}
public static String  _lv5_itemclick(int _position,Object _value) throws Exception{
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog _cd = null;
anywheresoftware.b4a.objects.PanelWrapper _pap = null;
anywheresoftware.b4a.objects.LabelWrapper _la1 = null;
anywheresoftware.b4a.objects.LabelWrapper _la2 = null;
anywheresoftware.b4a.objects.LabelWrapper _la3 = null;
int _u = 0;
String _total = "";
 //BA.debugLineNum = 329;BA.debugLine="Sub lv5_ItemClick (Position As Int, Value As Objec";
 //BA.debugLineNum = 330;BA.debugLine="Dim  cd As CustomDialog";
_cd = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog();
 //BA.debugLineNum = 331;BA.debugLine="Dim pap As Panel";
_pap = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 332;BA.debugLine="pap.Initialize(\"pap\")";
_pap.Initialize(mostCurrent.activityBA,"pap");
 //BA.debugLineNum = 333;BA.debugLine="Dim la1,la2,la3 As Label";
_la1 = new anywheresoftware.b4a.objects.LabelWrapper();
_la2 = new anywheresoftware.b4a.objects.LabelWrapper();
_la3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 334;BA.debugLine="la3.Initialize(\"la3\")";
_la3.Initialize(mostCurrent.activityBA,"la3");
 //BA.debugLineNum = 335;BA.debugLine="la2.Initialize(\"la2\")";
_la2.Initialize(mostCurrent.activityBA,"la2");
 //BA.debugLineNum = 336;BA.debugLine="la1.Initialize(\"la1\")";
_la1.Initialize(mostCurrent.activityBA,"la1");
 //BA.debugLineNum = 337;BA.debugLine="pap.AddView(la1,2dip,2dip,95%x,25dip)";
_pap.AddView((android.view.View)(_la1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (95),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)));
 //BA.debugLineNum = 338;BA.debugLine="pap.AddView(la2,2dip,27dip,95%x,25dip)";
_pap.AddView((android.view.View)(_la2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (27)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (95),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)));
 //BA.debugLineNum = 339;BA.debugLine="pap.AddView(la3,2dip,52dip,95%x,25dip)";
_pap.AddView((android.view.View)(_la3.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (52)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (95),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (25)));
 //BA.debugLineNum = 340;BA.debugLine="cd.AddView(pap,2dip,1dip,99%x,130dip)";
_cd.AddView((android.view.View)(_pap.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (99),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
 //BA.debugLineNum = 341;BA.debugLine="For u=0 To widget.obj.Size-1";
{
final int step12 = 1;
final int limit12 = (int) (mostCurrent._widget._obj.getSize()-1);
for (_u = (int) (0) ; (step12 > 0 && _u <= limit12) || (step12 < 0 && _u >= limit12); _u = ((int)(0 + _u + step12)) ) {
 //BA.debugLineNum = 342;BA.debugLine="packName=widget.obj.Get(u)";
mostCurrent._packname = BA.ObjectToString(mostCurrent._widget._obj.Get(_u));
 //BA.debugLineNum = 343;BA.debugLine="name=pak.GetApplicationLabel(widget.obj.Get(u))";
mostCurrent._name = _pak.GetApplicationLabel(BA.ObjectToString(mostCurrent._widget._obj.Get(_u)));
 //BA.debugLineNum = 344;BA.debugLine="icon=pak.GetApplicationIcon(widget.obj.Get(u))";
mostCurrent._icon.setObject((android.graphics.drawable.BitmapDrawable)(_pak.GetApplicationIcon(BA.ObjectToString(mostCurrent._widget._obj.Get(_u)))));
 }
};
 //BA.debugLineNum = 346;BA.debugLine="Dim total As String";
_total = "";
 //BA.debugLineNum = 347;BA.debugLine="total = File.Size(GetParentPath(GetSourceDir(GetA";
_total = BA.NumberToString(anywheresoftware.b4a.keywords.Common.File.Size(_getparentpath(_getsourcedir(_getactivitiesinfo(mostCurrent._packname))),_getfilename(_getsourcedir(_getactivitiesinfo(mostCurrent._packname)))));
 //BA.debugLineNum = 348;BA.debugLine="size=total";
_size = (int)(Double.parseDouble(_total));
 //BA.debugLineNum = 349;BA.debugLine="la1.Text=packName";
_la1.setText(BA.ObjectToCharSequence(mostCurrent._packname));
 //BA.debugLineNum = 350;BA.debugLine="la2.Text=name";
_la2.setText(BA.ObjectToCharSequence(mostCurrent._name));
 //BA.debugLineNum = 351;BA.debugLine="la3.Text=FormatFileSize(size)";
_la3.setText(BA.ObjectToCharSequence(_formatfilesize((float) (_size))));
 //BA.debugLineNum = 352;BA.debugLine="If Value=packName Then";
if ((_value).equals((Object)(mostCurrent._packname))) { 
 //BA.debugLineNum = 353;BA.debugLine="cd.Show(\"App Info:\",\"Got It\",\"\",\"Clear All\",icon.";
_cd.Show("App Info:","Got It","","Clear All",mostCurrent.activityBA,mostCurrent._icon.getBitmap());
 };
 //BA.debugLineNum = 355;BA.debugLine="If cd.Response=DialogResponse.NEGATIVE Then";
if (_cd.getResponse()==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
 //BA.debugLineNum = 357;BA.debugLine="CallSubDelayed(widget,\"clean_start\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(mostCurrent.activityBA,(Object)(mostCurrent._widget.getObject()),"clean_start");
 };
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public static String  _mystats_update(float[] _cpuefficiency,float _ramusage) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub myStats_Update(CPUEfficiency() As Float, RAMUs";
 //BA.debugLineNum = 406;BA.debugLine="sb1.Text(\"RAM: \"&FormatFileSize(RAMUsage*1024*102";
mostCurrent._sb1.Text(BA.ObjectToCharSequence("RAM: "+_formatfilesize((float) (_ramusage*1024*1024*10))));
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
widget._process_globals();
starter._process_globals();
setanimation._process_globals();
loglist._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private pak As PackageManager";
_pak = new anywheresoftware.b4a.phone.PackageManagerWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim t1 As Timer";
_t1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 22;BA.debugLine="Private os As OperatingSystem";
_os = new com.rootsoft.oslibrary.OSLibrary();
 //BA.debugLineNum = 23;BA.debugLine="Dim date,time As String";
_date = "";
_time = "";
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public static String  _ref_click() throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Sub ref_click";
 //BA.debugLineNum = 187;BA.debugLine="CallSubDelayed(widget,\"remote_start\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(mostCurrent.activityBA,(Object)(mostCurrent._widget.getObject()),"remote_start");
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public static String  _tab_one() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bati1 = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bati2 = null;
anywheresoftware.b4a.objects.collections.List _pis1 = null;
anywheresoftware.b4a.objects.collections.List _pis2 = null;
anywheresoftware.b4a.objects.collections.List _pis3 = null;
anywheresoftware.b4a.objects.LabelWrapper _l1 = null;
anywheresoftware.b4a.objects.LabelWrapper _l2 = null;
anywheresoftware.b4a.objects.LabelWrapper _l3 = null;
anywheresoftware.b4a.objects.LabelWrapper _l4 = null;
anywheresoftware.b4a.objects.LabelWrapper _l5 = null;
anywheresoftware.b4a.objects.LabelWrapper _l6 = null;
 //BA.debugLineNum = 190;BA.debugLine="Sub tab_one";
 //BA.debugLineNum = 191;BA.debugLine="Dim bati1,bati2 As Bitmap";
_bati1 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bati2 = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 192;BA.debugLine="bati1=LoadBitmap(File.DirAssets,\"ic_apps_black_18";
_bati1 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_apps_black_18dp.png");
 //BA.debugLineNum = 193;BA.debugLine="bati2=LoadBitmap(File.DirAssets,\"ic_apps_white_18";
_bati2 = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_apps_white_18dp.png");
 //BA.debugLineNum = 194;BA.debugLine="tab1.AddTabWithIcon(\"Cleaner Tab:\",bati1,bati2,\"t";
mostCurrent._tab1.AddTabWithIcon(mostCurrent.activityBA,"Cleaner Tab:",(android.graphics.Bitmap)(_bati1.getObject()),(android.graphics.Bitmap)(_bati2.getObject()),"ta2");
 //BA.debugLineNum = 195;BA.debugLine="sb1.Color=mcl.md_amber_600";
mostCurrent._sb1.setColor(mostCurrent._mcl.getmd_amber_600());
 //BA.debugLineNum = 196;BA.debugLine="sb1.TextColor(mcl.md_black_1000)";
mostCurrent._sb1.TextColor(mostCurrent._mcl.getmd_black_1000());
 //BA.debugLineNum = 197;BA.debugLine="sb1.singleLine(True)";
mostCurrent._sb1.singleLine(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 198;BA.debugLine="sb1.actionText(\"Status: \"&bat.BatteryInformation(";
mostCurrent._sb1.actionText(BA.ObjectToCharSequence("Status: "+BA.NumberToString(mostCurrent._bat._getbatteryinformation()[(int) (0)])+"%"));
 //BA.debugLineNum = 199;BA.debugLine="Dim pis1,pis2,pis3 As List";
_pis1 = new anywheresoftware.b4a.objects.collections.List();
_pis2 = new anywheresoftware.b4a.objects.collections.List();
_pis3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 200;BA.debugLine="pis1.Initialize";
_pis1.Initialize();
 //BA.debugLineNum = 201;BA.debugLine="pis2.Initialize";
_pis2.Initialize();
 //BA.debugLineNum = 202;BA.debugLine="pis3.Initialize";
_pis3.Initialize();
 //BA.debugLineNum = 203;BA.debugLine="os.RunningServiceInfo(999,pis1,pis2,pis3)";
_os.RunningServiceInfo((int) (999),(java.util.List)(_pis1.getObject()),(java.util.List)(_pis2.getObject()),(java.util.List)(_pis3.getObject()));
 //BA.debugLineNum = 204;BA.debugLine="sb1.actionText(\"Proccess: \"&pis1.size)";
mostCurrent._sb1.actionText(BA.ObjectToCharSequence("Proccess: "+BA.NumberToString(_pis1.getSize())));
 //BA.debugLineNum = 207;BA.debugLine="Dim l1,l2,l3,l4,l5,l6 As Label";
_l1 = new anywheresoftware.b4a.objects.LabelWrapper();
_l2 = new anywheresoftware.b4a.objects.LabelWrapper();
_l3 = new anywheresoftware.b4a.objects.LabelWrapper();
_l4 = new anywheresoftware.b4a.objects.LabelWrapper();
_l5 = new anywheresoftware.b4a.objects.LabelWrapper();
_l6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 208;BA.debugLine="l1.Initialize(\"l1\")";
_l1.Initialize(mostCurrent.activityBA,"l1");
 //BA.debugLineNum = 209;BA.debugLine="l2.Initialize(\"l2\")";
_l2.Initialize(mostCurrent.activityBA,"l2");
 //BA.debugLineNum = 210;BA.debugLine="l3.Initialize(\"l3\")";
_l3.Initialize(mostCurrent.activityBA,"l3");
 //BA.debugLineNum = 211;BA.debugLine="l4.Initialize(\"l4\")";
_l4.Initialize(mostCurrent.activityBA,"l4");
 //BA.debugLineNum = 212;BA.debugLine="l5.Initialize(\"l5\")";
_l5.Initialize(mostCurrent.activityBA,"l5");
 //BA.debugLineNum = 213;BA.debugLine="l6.Initialize(\"l6\")";
_l6.Initialize(mostCurrent.activityBA,"l6");
 //BA.debugLineNum = 214;BA.debugLine="l6=lv5.SingleLineLayout.Label";
_l6 = mostCurrent._lv5.getSingleLineLayout().Label;
 //BA.debugLineNum = 215;BA.debugLine="l1.TextColor=mcl.md_amber_600'Colors.ARGB(200,255";
_l1.setTextColor(mostCurrent._mcl.getmd_amber_600());
 //BA.debugLineNum = 216;BA.debugLine="l6.TextColor=mcl.md_white_1000'Colors.ARGB(200,25";
_l6.setTextColor(mostCurrent._mcl.getmd_white_1000());
 //BA.debugLineNum = 217;BA.debugLine="l1.TextSize=15";
_l1.setTextSize((float) (15));
 //BA.debugLineNum = 218;BA.debugLine="l6.TextSize=15";
_l6.setTextSize((float) (15));
 //BA.debugLineNum = 219;BA.debugLine="l1.Gravity=Gravity.CENTER";
_l1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 220;BA.debugLine="l4=lv5.TwoLinesAndBitmap.Label";
_l4 = mostCurrent._lv5.getTwoLinesAndBitmap().Label;
 //BA.debugLineNum = 221;BA.debugLine="l2.TextColor=Colors.White";
_l2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 222;BA.debugLine="l4.TextColor=Colors.White";
_l4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 223;BA.debugLine="l2.TextSize=15";
_l2.setTextSize((float) (15));
 //BA.debugLineNum = 224;BA.debugLine="l4.TextSize=15";
_l4.setTextSize((float) (15));
 //BA.debugLineNum = 225;BA.debugLine="l3.TextColor=mcl.md_amber_A700";
_l3.setTextColor(mostCurrent._mcl.getmd_amber_A700());
 //BA.debugLineNum = 226;BA.debugLine="l5=lv5.TwoLinesAndBitmap.SecondLabel";
_l5 = mostCurrent._lv5.getTwoLinesAndBitmap().SecondLabel;
 //BA.debugLineNum = 227;BA.debugLine="l3.TextSize=15";
_l3.setTextSize((float) (15));
 //BA.debugLineNum = 228;BA.debugLine="l5.TextSize=15";
_l5.setTextSize((float) (15));
 //BA.debugLineNum = 229;BA.debugLine="l5.TextColor=mcl.md_blue_500";
_l5.setTextColor(mostCurrent._mcl.getmd_blue_500());
 //BA.debugLineNum = 230;BA.debugLine="lv5.FastScrollEnabled=True";
mostCurrent._lv5.setFastScrollEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 231;BA.debugLine="Return";
if (true) return "";
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public static String  _tab_two() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l1 = null;
anywheresoftware.b4a.objects.LabelWrapper _l2 = null;
anywheresoftware.b4a.objects.LabelWrapper _l3 = null;
anywheresoftware.b4a.objects.LabelWrapper _l4 = null;
anywheresoftware.b4a.objects.LabelWrapper _l5 = null;
anywheresoftware.b4a.objects.LabelWrapper _l6 = null;
 //BA.debugLineNum = 246;BA.debugLine="Sub tab_two";
 //BA.debugLineNum = 247;BA.debugLine="tab1.AddTab(\"App Manager:\",\"ta1\")";
mostCurrent._tab1.AddTab(mostCurrent.activityBA,"App Manager:","ta1");
 //BA.debugLineNum = 248;BA.debugLine="app_list";
_app_list();
 //BA.debugLineNum = 249;BA.debugLine="Dim l1,l2,l3,l4,l5,l6 As Label";
_l1 = new anywheresoftware.b4a.objects.LabelWrapper();
_l2 = new anywheresoftware.b4a.objects.LabelWrapper();
_l3 = new anywheresoftware.b4a.objects.LabelWrapper();
_l4 = new anywheresoftware.b4a.objects.LabelWrapper();
_l5 = new anywheresoftware.b4a.objects.LabelWrapper();
_l6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 250;BA.debugLine="l1.Initialize(\"l1\")";
_l1.Initialize(mostCurrent.activityBA,"l1");
 //BA.debugLineNum = 251;BA.debugLine="l2.Initialize(\"l2\")";
_l2.Initialize(mostCurrent.activityBA,"l2");
 //BA.debugLineNum = 252;BA.debugLine="l3.Initialize(\"l3\")";
_l3.Initialize(mostCurrent.activityBA,"l3");
 //BA.debugLineNum = 253;BA.debugLine="l4.Initialize(\"l4\")";
_l4.Initialize(mostCurrent.activityBA,"l4");
 //BA.debugLineNum = 254;BA.debugLine="l5.Initialize(\"l5\")";
_l5.Initialize(mostCurrent.activityBA,"l5");
 //BA.debugLineNum = 255;BA.debugLine="l6.Initialize(\"l6\")";
_l6.Initialize(mostCurrent.activityBA,"l6");
 //BA.debugLineNum = 256;BA.debugLine="l6=lv4.SingleLineLayout.Label";
_l6 = mostCurrent._lv4.getSingleLineLayout().Label;
 //BA.debugLineNum = 257;BA.debugLine="l1.TextColor=mcl.md_light_blue_A700'Colors.ARGB(2";
_l1.setTextColor(mostCurrent._mcl.getmd_light_blue_A700());
 //BA.debugLineNum = 258;BA.debugLine="l6.TextColor=mcl.md_red_A200'Colors.ARGB(200,255,";
_l6.setTextColor(mostCurrent._mcl.getmd_red_A200());
 //BA.debugLineNum = 259;BA.debugLine="l1.TextSize=15";
_l1.setTextSize((float) (15));
 //BA.debugLineNum = 260;BA.debugLine="l6.TextSize=15";
_l6.setTextSize((float) (15));
 //BA.debugLineNum = 261;BA.debugLine="l1.Gravity=Gravity.CENTER";
_l1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 //BA.debugLineNum = 262;BA.debugLine="l4=lv4.TwoLinesAndBitmap.Label";
_l4 = mostCurrent._lv4.getTwoLinesAndBitmap().Label;
 //BA.debugLineNum = 263;BA.debugLine="l2.TextColor=Colors.White";
_l2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 264;BA.debugLine="l4.TextColor=Colors.White";
_l4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
 //BA.debugLineNum = 265;BA.debugLine="l2.TextSize=15";
_l2.setTextSize((float) (15));
 //BA.debugLineNum = 266;BA.debugLine="l4.TextSize=15";
_l4.setTextSize((float) (15));
 //BA.debugLineNum = 267;BA.debugLine="l3.TextColor=mcl.md_amber_A700";
_l3.setTextColor(mostCurrent._mcl.getmd_amber_A700());
 //BA.debugLineNum = 268;BA.debugLine="l5=lv4.TwoLinesAndBitmap.SecondLabel";
_l5 = mostCurrent._lv4.getTwoLinesAndBitmap().SecondLabel;
 //BA.debugLineNum = 269;BA.debugLine="l3.TextSize=15";
_l3.setTextSize((float) (15));
 //BA.debugLineNum = 270;BA.debugLine="l5.TextSize=15";
_l5.setTextSize((float) (15));
 //BA.debugLineNum = 271;BA.debugLine="l5.TextColor=mcl.md_blue_500";
_l5.setTextColor(mostCurrent._mcl.getmd_blue_500());
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public static String  _tab1_click() throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Sub tab1_Click";
 //BA.debugLineNum = 367;BA.debugLine="app_list";
_app_list();
 //BA.debugLineNum = 368;BA.debugLine="kvs_read";
_kvs_read();
 //BA.debugLineNum = 370;BA.debugLine="End Sub";
return "";
}
public static String  _tab1_tabchanged() throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub tab1_TabChanged";
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public static String  _tab2_refresh() throws Exception{
String _r = "";
int _u = 0;
 //BA.debugLineNum = 312;BA.debugLine="Sub tab2_refresh";
 //BA.debugLineNum = 313;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 314;BA.debugLine="but_on";
_but_on();
 //BA.debugLineNum = 315;BA.debugLine="lv5.Clear";
mostCurrent._lv5.Clear();
 //BA.debugLineNum = 316;BA.debugLine="For Each r As String  In kvst.ListKeys";
final anywheresoftware.b4a.BA.IterableList group4 = mostCurrent._kvst._listkeys();
final int groupLen4 = group4.getSize();
for (int index4 = 0;index4 < groupLen4 ;index4++){
_r = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 317;BA.debugLine="Log(r)";
anywheresoftware.b4a.keywords.Common.Log(_r);
 }
;
 //BA.debugLineNum = 320;BA.debugLine="For u=0 To widget.obj.Size-1";
{
final int step7 = 1;
final int limit7 = (int) (mostCurrent._widget._obj.getSize()-1);
for (_u = (int) (0) ; (step7 > 0 && _u <= limit7) || (step7 < 0 && _u >= limit7); _u = ((int)(0 + _u + step7)) ) {
 //BA.debugLineNum = 321;BA.debugLine="packName=widget.obj.Get(u)";
mostCurrent._packname = BA.ObjectToString(mostCurrent._widget._obj.Get(_u));
 //BA.debugLineNum = 322;BA.debugLine="icon=pak.GetApplicationIcon(widget.obj.Get(u))";
mostCurrent._icon.setObject((android.graphics.drawable.BitmapDrawable)(_pak.GetApplicationIcon(BA.ObjectToString(mostCurrent._widget._obj.Get(_u)))));
 //BA.debugLineNum = 323;BA.debugLine="name=pak.GetApplicationLabel(widget.obj.Get(u))";
mostCurrent._name = _pak.GetApplicationLabel(BA.ObjectToString(mostCurrent._widget._obj.Get(_u)));
 //BA.debugLineNum = 324;BA.debugLine="lv5.AddTwoLinesAndBitmap2(name,\"\",icon.Bitmap,p";
mostCurrent._lv5.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(mostCurrent._name),BA.ObjectToCharSequence(""),mostCurrent._icon.getBitmap(),(Object)(mostCurrent._packname));
 //BA.debugLineNum = 325;BA.debugLine="lv5.SetSelection(u)";
mostCurrent._lv5.SetSelection(_u);
 }
};
 //BA.debugLineNum = 328;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar_navigationitemclick() throws Exception{
 //BA.debugLineNum = 176;BA.debugLine="Sub toolbar_NavigationItemClick";
 //BA.debugLineNum = 177;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 178;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
}
