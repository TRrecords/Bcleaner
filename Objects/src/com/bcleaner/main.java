package com.bcleaner;


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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.bcleaner", "com.bcleaner.main");
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
		activityBA = new BA(this, layout, processBA, "com.bcleaner", "com.bcleaner.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.bcleaner.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.phone.PackageManagerWrapper _pak = null;
public static anywheresoftware.b4a.cachecleaner.CacheCleaner _cc = null;
public static anywheresoftware.b4a.objects.Timer _t1 = null;
public static com.rootsoft.oslibrary.OSLibrary _os = null;
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
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public de.amberhome.objects.appcompat.ACToolbarLightWrapper _toolbar = null;
public de.amberhome.objects.appcompat.ACActionBar _abhelper = null;
public com.circlebuttonwrapper.CircleButtonWrapper _cb1 = null;
public com.tchart.materialcolors.MaterialColors _mcl = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lw3 = null;
public anywheresoftware.b4a.objects.collections.List _applist = null;
public anywheresoftware.b4a.objects.collections.List _catlist = null;
public anywheresoftware.b4a.objects.collections.List _mathlist = null;
public de.donmanfred.pgWheel _pg = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog _cinfo = null;
public static int _counter = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public static String _date = "";
public static String _time = "";
public com.bcleaner.keyvaluestore _kvst = null;
public com.bcleaner.keyvaluestore _kvsdata = null;
public com.bcleaner.keyvaluestore _kvsmat = null;
public de.donmanfred.AlertDialogBuilder _dia = null;
public de.donmanfred.AlertDialogBuilder _dia2 = null;
public de.donmanfred.AlertDialogBuilder _dia3 = null;
public anywheresoftware.b4a.objects.drawable.BitmapDrawable _shader = null;
public anywheresoftware.b4j.object.JavaObject _draw = null;
public anywheresoftware.b4a.objects.collections.List _tmp = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public MLfiles.Fileslib.MLfiles _storage = null;
public com.bcleaner.starter _starter = null;
public com.bcleaner.setanimation _setanimation = null;
public static String  _about_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "about_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "about_click", null);
anywheresoftware.b4a.objects.drawable.BitmapDrawable _ig = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub about_click";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim ig As BitmapDrawable";
_ig = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="ig.Initialize(LoadBitmap(File.DirAssets,\"id-card.";
_ig.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"id-card.png").getObject()));
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="dia3.setTitle(\"About \"&pak.GetApplicationLabel(\"c";
mostCurrent._dia3.setTitle(BA.ObjectToCharSequence("About "+_pak.GetApplicationLabel("com.bcleaner")+" - Version "+_pak.GetVersionName("com.bcleaner"))).create();
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="dia3.setIcon2(ig).create";
mostCurrent._dia3.setIcon2((android.graphics.drawable.Drawable)(_ig.getObject())).create();
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="dia3.setMessage(\"Written in Basic by D.Trojan. Pu";
mostCurrent._dia3.setMessage(BA.ObjectToCharSequence("Written in Basic by D.Trojan. Published by SuloMedia™")).setCancelable(anywheresoftware.b4a.keywords.Common.True).setNeutralButton(BA.ObjectToCharSequence("Ok")).show();
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd1 = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd2 = null;
anywheresoftware.b4a.objects.LabelWrapper _l1 = null;
anywheresoftware.b4a.objects.LabelWrapper _l2 = null;
anywheresoftware.b4a.objects.LabelWrapper _l3 = null;
anywheresoftware.b4a.objects.LabelWrapper _l4 = null;
anywheresoftware.b4a.objects.LabelWrapper _l5 = null;
anywheresoftware.b4a.objects.LabelWrapper _l6 = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Activity.LoadLayout(\"1\")";
mostCurrent._activity.LoadLayout("1",mostCurrent.activityBA);
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="toolbar.SetAsActionBar";
mostCurrent._toolbar.SetAsActionBar(mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="toolbar.Elevation=10dip";
mostCurrent._toolbar.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))));
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="toolbar.PopupTheme=toolbar.THEME_DARK";
mostCurrent._toolbar.setPopupTheme(mostCurrent._toolbar.THEME_DARK);
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="toolbar.Title=pak.GetApplicationLabel(\"com.bclean";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence(_pak.GetApplicationLabel("com.bcleaner")));
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="toolbar.SubTitle=\"Version \"&pak.GetVersionName(\"c";
mostCurrent._toolbar.setSubTitle(BA.ObjectToCharSequence("Version "+_pak.GetVersionName("com.bcleaner")));
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="ABHelper.Initialize";
mostCurrent._abhelper.Initialize(mostCurrent.activityBA);
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="os.Initialize(\"os\")";
_os.Initialize(processBA,"os");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="cc.initialize(\"cc\")";
_cc.initialize("cc",processBA);
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="toolbar.InitMenuListener";
mostCurrent._toolbar.InitMenuListener();
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="ABHelper.HomeVisible=True";
mostCurrent._abhelper.setHomeVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="applist.Initialize";
mostCurrent._applist.Initialize();
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="mathlist.Initialize";
mostCurrent._mathlist.Initialize();
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="tmp.Initialize";
mostCurrent._tmp.Initialize();
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="catlist.Initialize";
mostCurrent._catlist.Initialize();
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="dia.Initialize(\"dia\")";
mostCurrent._dia.Initialize(mostCurrent.activityBA,"dia");
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="dia2.Initialize(\"dia2\")";
mostCurrent._dia2.Initialize(mostCurrent.activityBA,"dia2");
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="dia3.Initialize(\"dia3\")";
mostCurrent._dia3.Initialize(mostCurrent.activityBA,"dia3");
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="lw3.Initialize(\"lw3\")";
mostCurrent._lw3.Initialize(mostCurrent.activityBA,"lw3");
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="lw3.Enabled=True";
mostCurrent._lw3.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="t1.Initialize(\"t1\",1000)";
_t1.Initialize(processBA,"t1",(long) (1000));
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="counter=0";
_counter = (int) (0);
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="Activity.TitleColor=mcl.md_black_1000";
mostCurrent._activity.setTitleColor(mostCurrent._mcl.getmd_black_1000());
RDebugUtils.currentLine=131097;
 //BA.debugLineNum = 131097;BA.debugLine="Activity.Color=Colors.ARGB(255,255,255,255)'mcl.m";
mostCurrent._activity.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="Dim bd,bd1,bd2 As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
_bd1 = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
_bd2 = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="bd1.Initialize(LoadBitmap(File.DirAssets,\"menu-1.";
_bd1.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"menu-1.png").getObject()));
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="Activity.AddMenuItem3(\"Info\", \"inf\", bd1.Bitmap,T";
mostCurrent._activity.AddMenuItem3(BA.ObjectToCharSequence("Info"),"inf",_bd1.getBitmap(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="Activity.AddMenuItem(\"About\",\"about\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("About"),"about");
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="bd2.Initialize(LoadBitmap(File.DirAssets,\"close.p";
_bd2.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"close.png").getObject()));
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="Activity.AddMenuItem3(\"Exit\", \"close\",bd2.Bitmap,";
mostCurrent._activity.AddMenuItem3(BA.ObjectToCharSequence("Exit"),"close",_bd2.getBitmap(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
mostCurrent._cb1.setButtonColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"boost.png").getObject()));
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="kvst.Initialize(File.DirDefaultExternal,\"data_tim";
mostCurrent._kvst._initialize(null,processBA,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"data_time");
RDebugUtils.currentLine=131108;
 //BA.debugLineNum = 131108;BA.debugLine="kvsdata.Initialize(File.DirDefaultExternal,\"data_";
mostCurrent._kvsdata._initialize(null,processBA,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"data_data");
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="kvsmat.Initialize(File.DirDefaultExternal,\"data_m";
mostCurrent._kvsmat._initialize(null,processBA,anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"data_math");
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="draw.InitializeNewInstance(\"android.graphics.Shad";
mostCurrent._draw.InitializeNewInstance("android.graphics.Shader",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="pg.Visible=False";
mostCurrent._pg.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="pg.RimShader=draw";
mostCurrent._pg.setRimShader((android.graphics.Shader)(mostCurrent._draw.getObject()));
RDebugUtils.currentLine=131113;
 //BA.debugLineNum = 131113;BA.debugLine="pg.BarColor=Colors.ARGB(220,14,136,244)";
mostCurrent._pg.setBarColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (220),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="pg.BarLength=10dip";
mostCurrent._pg.setBarLength(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="pg.BarWidth=10dip";
mostCurrent._pg.setBarWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=131116;
 //BA.debugLineNum = 131116;BA.debugLine="pg.RimWidth=10dip";
mostCurrent._pg.setRimWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=131117;
 //BA.debugLineNum = 131117;BA.debugLine="pg.FadingEdgeLength=15dip";
mostCurrent._pg.setFadingEdgeLength(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15)));
RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="pg.SpinSpeed=45";
mostCurrent._pg.setSpinSpeed((int) (45));
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="pg.TextSize=30";
mostCurrent._pg.setTextSize((int) (30));
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="pg.TextColor=mcl.md_blue_A700";
mostCurrent._pg.setTextColor(mostCurrent._mcl.getmd_blue_A700());
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="Dim l1,l2,l3,l4,l5,l6 As Label";
_l1 = new anywheresoftware.b4a.objects.LabelWrapper();
_l2 = new anywheresoftware.b4a.objects.LabelWrapper();
_l3 = new anywheresoftware.b4a.objects.LabelWrapper();
_l4 = new anywheresoftware.b4a.objects.LabelWrapper();
_l5 = new anywheresoftware.b4a.objects.LabelWrapper();
_l6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=131122;
 //BA.debugLineNum = 131122;BA.debugLine="l1.Initialize(\"l1\")";
_l1.Initialize(mostCurrent.activityBA,"l1");
RDebugUtils.currentLine=131123;
 //BA.debugLineNum = 131123;BA.debugLine="l2.Initialize(\"l2\")";
_l2.Initialize(mostCurrent.activityBA,"l2");
RDebugUtils.currentLine=131124;
 //BA.debugLineNum = 131124;BA.debugLine="l3.Initialize(\"l3\")";
_l3.Initialize(mostCurrent.activityBA,"l3");
RDebugUtils.currentLine=131125;
 //BA.debugLineNum = 131125;BA.debugLine="l4.Initialize(\"l4\")";
_l4.Initialize(mostCurrent.activityBA,"l4");
RDebugUtils.currentLine=131126;
 //BA.debugLineNum = 131126;BA.debugLine="l5.Initialize(\"l5\")";
_l5.Initialize(mostCurrent.activityBA,"l5");
RDebugUtils.currentLine=131127;
 //BA.debugLineNum = 131127;BA.debugLine="l6.Initialize(\"l6\")";
_l6.Initialize(mostCurrent.activityBA,"l6");
RDebugUtils.currentLine=131128;
 //BA.debugLineNum = 131128;BA.debugLine="l6=lw3.SingleLineLayout.Label";
_l6 = mostCurrent._lw3.getSingleLineLayout().Label;
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="l1.TextColor=mcl.md_light_blue_A700'Colors.ARGB(2";
_l1.setTextColor(mostCurrent._mcl.getmd_light_blue_A700());
RDebugUtils.currentLine=131130;
 //BA.debugLineNum = 131130;BA.debugLine="l6.TextColor=mcl.md_red_A200'Colors.ARGB(200,255,";
_l6.setTextColor(mostCurrent._mcl.getmd_red_A200());
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="l1.TextSize=15";
_l1.setTextSize((float) (15));
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="l6.TextSize=15";
_l6.setTextSize((float) (15));
RDebugUtils.currentLine=131133;
 //BA.debugLineNum = 131133;BA.debugLine="l1.Gravity=Gravity.CENTER";
_l1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=131134;
 //BA.debugLineNum = 131134;BA.debugLine="l4=lw3.TwoLinesAndBitmap.Label";
_l4 = mostCurrent._lw3.getTwoLinesAndBitmap().Label;
RDebugUtils.currentLine=131135;
 //BA.debugLineNum = 131135;BA.debugLine="l2.TextColor=Colors.White";
_l2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131136;
 //BA.debugLineNum = 131136;BA.debugLine="l4.TextColor=Colors.White";
_l4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="l2.TextSize=15";
_l2.setTextSize((float) (15));
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="l4.TextSize=15";
_l4.setTextSize((float) (15));
RDebugUtils.currentLine=131139;
 //BA.debugLineNum = 131139;BA.debugLine="l3.TextColor=mcl.md_amber_A700";
_l3.setTextColor(mostCurrent._mcl.getmd_amber_A700());
RDebugUtils.currentLine=131140;
 //BA.debugLineNum = 131140;BA.debugLine="l5=lw3.TwoLinesAndBitmap.SecondLabel";
_l5 = mostCurrent._lw3.getTwoLinesAndBitmap().SecondLabel;
RDebugUtils.currentLine=131141;
 //BA.debugLineNum = 131141;BA.debugLine="l3.TextSize=15";
_l3.setTextSize((float) (15));
RDebugUtils.currentLine=131142;
 //BA.debugLineNum = 131142;BA.debugLine="l5.TextSize=15";
_l5.setTextSize((float) (15));
RDebugUtils.currentLine=131143;
 //BA.debugLineNum = 131143;BA.debugLine="l5.TextColor=mcl.md_blue_500";
_l5.setTextColor(mostCurrent._mcl.getmd_blue_500());
RDebugUtils.currentLine=131144;
 //BA.debugLineNum = 131144;BA.debugLine="Label1.TextColor=Colors.ARGB(255,14,136,244)'Colo";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=131145;
 //BA.debugLineNum = 131145;BA.debugLine="Label1.BringToFront";
mostCurrent._label1.BringToFront();
RDebugUtils.currentLine=131146;
 //BA.debugLineNum = 131146;BA.debugLine="Label1.Gravity=Gravity.CENTER_HORIZONTAL";
mostCurrent._label1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
RDebugUtils.currentLine=131147;
 //BA.debugLineNum = 131147;BA.debugLine="DateTime.DateFormat=\"dd.MM\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd.MM");
RDebugUtils.currentLine=131148;
 //BA.debugLineNum = 131148;BA.debugLine="time=DateTime.Time(DateTime.Now)";
mostCurrent._time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=131149;
 //BA.debugLineNum = 131149;BA.debugLine="date= DateTime.Date(DateTime.Now)";
mostCurrent._date = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=131150;
 //BA.debugLineNum = 131150;BA.debugLine="Label2.TextColor=Colors.ARGB(190,14,136,244)";
mostCurrent._label2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (190),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=131151;
 //BA.debugLineNum = 131151;BA.debugLine="Label3.TextColor=Colors.ARGB(190,14,136,244)";
mostCurrent._label3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (190),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=131152;
 //BA.debugLineNum = 131152;BA.debugLine="Label2.TextSize=15";
mostCurrent._label2.setTextSize((float) (15));
RDebugUtils.currentLine=131153;
 //BA.debugLineNum = 131153;BA.debugLine="Label3.TextSize=15";
mostCurrent._label3.setTextSize((float) (15));
RDebugUtils.currentLine=131154;
 //BA.debugLineNum = 131154;BA.debugLine="Label1.BringToFront";
mostCurrent._label1.BringToFront();
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="Label1.TextSize=19";
mostCurrent._label1.setTextSize((float) (19));
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="If FirstTime=True Then";
if (_firsttime==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=131158;
 //BA.debugLineNum = 131158;BA.debugLine="File.WriteList(File.DirDefaultExternal,\"math.txt";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"math.txt",mostCurrent._mathlist);
 };
RDebugUtils.currentLine=131161;
 //BA.debugLineNum = 131161;BA.debugLine="kvs_read";
_kvs_read();
RDebugUtils.currentLine=131162;
 //BA.debugLineNum = 131162;BA.debugLine="End Sub";
return "";
}
public static String  _kvs_read() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kvs_read"))
	return (String) Debug.delegate(mostCurrent.activityBA, "kvs_read", null);
int _si = 0;
int _exi = 0;
int _ini = 0;
String _sd = "";
String _exd = "";
String _inter = "";
String _mount = "";
int _math = 0;
float _result = 0f;
String _read = "";
String _dread = "";
String _logcat = "";
String _da1 = "";
int _sum = 0;
double _d = 0;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub kvs_read";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim si,exi,ini As Int";
_si = 0;
_exi = 0;
_ini = 0;
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim sd,exd,inter,mount As String";
_sd = "";
_exd = "";
_inter = "";
_mount = "";
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="sd=storage.Sdcard";
_sd = mostCurrent._storage.Sdcard();
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="exd=storage.SdcardReady";
_exd = mostCurrent._storage.SdcardReady();
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="inter=os.TotalInternalMemorySize";
_inter = BA.NumberToString(_os.getTotalInternalMemorySize());
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="ini=inter";
_ini = (int)(Double.parseDouble(_inter));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="mount=storage.SdcardReady";
_mount = mostCurrent._storage.SdcardReady();
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="If exd=\"mounted\" Then";
if ((_exd).equals("mounted")) { 
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="Label3.Text=storage.GetDiskstats(sd)";
mostCurrent._label3.setText(BA.ObjectToCharSequence(mostCurrent._storage.GetDiskstats(_sd)));
 }else {
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="Label2.Text=storage.GetDiskstats(File.DirRootExt";
mostCurrent._label2.setText(BA.ObjectToCharSequence(mostCurrent._storage.GetDiskstats(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal())));
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="Label3.text=\"Total Apps cleaned: \"&catlist.Get(0";
mostCurrent._label3.setText(BA.ObjectToCharSequence("Total Apps cleaned: "+BA.ObjectToString(mostCurrent._catlist.Get((int) (0)))));
 };
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="Dim math As Int";
_math = 0;
RDebugUtils.currentLine=6422543;
 //BA.debugLineNum = 6422543;BA.debugLine="Dim result As Float";
_result = 0f;
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="Dim read,dread As String";
_read = "";
_dread = "";
RDebugUtils.currentLine=6422545;
 //BA.debugLineNum = 6422545;BA.debugLine="For Each logcat As String In kvst.ListKeys";
final anywheresoftware.b4a.BA.IterableList group17 = mostCurrent._kvst._listkeys(null);
final int groupLen17 = group17.getSize();
for (int index17 = 0;index17 < groupLen17 ;index17++){
_logcat = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=6422546;
 //BA.debugLineNum = 6422546;BA.debugLine="read=kvst.GetSimple(logcat)";
_read = mostCurrent._kvst._getsimple(null,_logcat);
 }
;
RDebugUtils.currentLine=6422549;
 //BA.debugLineNum = 6422549;BA.debugLine="Dim da1 As String";
_da1 = "";
RDebugUtils.currentLine=6422550;
 //BA.debugLineNum = 6422550;BA.debugLine="mathlist.Clear";
mostCurrent._mathlist.Clear();
RDebugUtils.currentLine=6422551;
 //BA.debugLineNum = 6422551;BA.debugLine="Dim sum As Int =  0";
_sum = (int) (0);
RDebugUtils.currentLine=6422552;
 //BA.debugLineNum = 6422552;BA.debugLine="For Each d As Double In kvsmat.ListKeys";
final anywheresoftware.b4a.BA.IterableList group23 = mostCurrent._kvsmat._listkeys(null);
final int groupLen23 = group23.getSize();
for (int index23 = 0;index23 < groupLen23 ;index23++){
_d = (double)(BA.ObjectToNumber(group23.Get(index23)));
RDebugUtils.currentLine=6422553;
 //BA.debugLineNum = 6422553;BA.debugLine="mathlist.Add(d)";
mostCurrent._mathlist.Add((Object)(_d));
RDebugUtils.currentLine=6422554;
 //BA.debugLineNum = 6422554;BA.debugLine="sum =sum +d";
_sum = (int) (_sum+_d);
 }
;
RDebugUtils.currentLine=6422556;
 //BA.debugLineNum = 6422556;BA.debugLine="Label1.Text=\"Total \"&FormatFileSize(sum)&\" cleane";
mostCurrent._label1.setText(BA.ObjectToCharSequence("Total "+_formatfilesize((float) (_sum))+" cleaned!"));
RDebugUtils.currentLine=6422557;
 //BA.debugLineNum = 6422557;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress"))
	return (Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode});
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 };
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Return(True)";
if (true) return (anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="pg.Visible=False";
mostCurrent._pg.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
mostCurrent._cb1.setButtonColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"boost.png").getObject()));
RDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
RDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="kvs_read";
_kvs_read();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _app_list() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "app_list"))
	return (String) Debug.delegate(mostCurrent.activityBA, "app_list", null);
int _i = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub app_list";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="applist=pak.GetInstalledPackages";
mostCurrent._applist = _pak.GetInstalledPackages();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Obj1.Target = Obj1.GetContext";
mostCurrent._obj1.Target = (Object)(mostCurrent._obj1.GetContext(processBA));
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Obj1.Target = Obj1.RunMethod(\"getPackageManager\")";
mostCurrent._obj1.Target = mostCurrent._obj1.RunMethod("getPackageManager");
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Obj2.Target = Obj1.RunMethod2(\"getInstalledPackag";
mostCurrent._obj2.Target = mostCurrent._obj1.RunMethod2("getInstalledPackages",BA.NumberToString(0),"java.lang.int");
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="size = Obj2.RunMethod(\"size\")";
_size = (int)(BA.ObjectToNumber(mostCurrent._obj2.RunMethod("size")));
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="For i = 0 To size -1";
{
final int step6 = 1;
final int limit6 = (int) (_size-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="Obj3.Target = Obj2.RunMethod2(\"get\", i, \"java.la";
mostCurrent._obj3.Target = mostCurrent._obj2.RunMethod2("get",BA.NumberToString(_i),"java.lang.int");
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="size = Obj2.RunMethod(\"size\")";
_size = (int)(BA.ObjectToNumber(mostCurrent._obj2.RunMethod("size")));
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Obj3.Target = Obj3.GetField(\"applicationInfo\") '";
mostCurrent._obj3.Target = mostCurrent._obj3.GetField("applicationInfo");
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="flags = Obj3.GetField(\"flags\")";
_flags = (int)(BA.ObjectToNumber(mostCurrent._obj3.GetField("flags")));
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="packName = Obj3.GetField(\"packageName\")";
mostCurrent._packname = BA.ObjectToString(mostCurrent._obj3.GetField("packageName"));
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="If Bit.And(flags, 1)  = 0 Then";
if (anywheresoftware.b4a.keywords.Common.Bit.And(_flags,(int) (1))==0) { 
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="args(0) = Obj3.Target";
mostCurrent._args[(int) (0)] = mostCurrent._obj3.Target;
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="Types(0) = \"android.content.pm.ApplicationInfo\"";
mostCurrent._types[(int) (0)] = "android.content.pm.ApplicationInfo";
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="name = Obj1.RunMethod4(\"getApplicationLabel\", a";
mostCurrent._name = BA.ObjectToString(mostCurrent._obj1.RunMethod4("getApplicationLabel",mostCurrent._args,mostCurrent._types));
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="icon = Obj1.RunMethod4(\"getApplicationIcon\", ar";
mostCurrent._icon.setObject((android.graphics.drawable.BitmapDrawable)(mostCurrent._obj1.RunMethod4("getApplicationIcon",mostCurrent._args,mostCurrent._types)));
 };
 }
};
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="End Sub";
return "";
}
public static String  _cb1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cb1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cb1_click", null);
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub cb1_Click";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="cb1.ImageBitmap=Null";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,255,255,255)";
mostCurrent._cb1.setButtonColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="pg.Visible=True";
mostCurrent._pg.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Label1.Visible=False";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="scan_start";
_scan_start();
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="End Sub";
return "";
}
public static String  _scan_start() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "scan_start"))
	return (String) Debug.delegate(mostCurrent.activityBA, "scan_start", null);
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub scan_start";
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="cc.ScanCache";
_cc.ScanCache();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="ToastMessageShow(\"scan started\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("scan started"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="End Sub";
return "";
}
public static String  _cc_oncleancompleted(long _cachesize) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_oncleancompleted"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cc_oncleancompleted", new Object[] {_cachesize});
int _n = 0;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub cc_onCleanCompleted(CacheSize As Long)";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Log(CacheSize)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_cachesize));
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Activity.Color=Colors.ARGB(255,255,255,255)";
mostCurrent._activity.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="pg.stopSpinning";
mostCurrent._pg.stopSpinning();
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="pg.Visible=False";
mostCurrent._pg.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"succes";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"success.png").getObject()));
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="kvsmat.PutSimple(CacheSize,CacheSize)";
mostCurrent._kvsmat._putsimple(null,BA.NumberToString(_cachesize),(Object)(_cachesize));
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="mathlist.Add(CacheSize)";
mostCurrent._mathlist.Add((Object)(_cachesize));
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="Dim n As Int=0";
_n = (int) (0);
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="n=n+CacheSize";
_n = (int) (_n+_cachesize);
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="Log(\"CS n: \"&n)";
anywheresoftware.b4a.keywords.Common.Log("CS n: "+BA.NumberToString(_n));
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="kvst.PutSimple(n,date&\"|@ \"&time&\" App(s): \"&Form";
mostCurrent._kvst._putsimple(null,BA.NumberToString(_n),(Object)(mostCurrent._date+"|@ "+mostCurrent._time+" App(s): "+_formatfilesize((float) (_cachesize))));
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="kvs_read";
_kvs_read();
RDebugUtils.currentLine=7340046;
 //BA.debugLineNum = 7340046;BA.debugLine="End Sub";
return "";
}
public static String  _formatfilesize(float _bytes) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "formatfilesize"))
	return (String) Debug.delegate(mostCurrent.activityBA, "formatfilesize", new Object[] {_bytes});
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="Private I As Int";
_i = 0;
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
RDebugUtils.currentLine=7733267;
 //BA.debugLineNum = 7733267;BA.debugLine="Return NumberFormat(Si, 1, 2) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (2))+_unit[_i];
 };
RDebugUtils.currentLine=7733271;
 //BA.debugLineNum = 7733271;BA.debugLine="End Sub";
return "";
}
public static String  _cc_oncleanstarted() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_oncleanstarted"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cc_oncleanstarted", null);
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub cc_onCleanStarted";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Log(\"CleanStarted\")";
anywheresoftware.b4a.keywords.Common.Log("CleanStarted");
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public static String  _cc_onscancompleted(Object _appslist) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_onscancompleted"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cc_onscancompleted", new Object[] {_appslist});
long _totalsize = 0L;
anywheresoftware.b4a.phone.PackageManagerWrapper _pm = null;
anywheresoftware.b4a.objects.collections.List _lu = null;
int _n = 0;
Object[] _app = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub cc_onScanCompleted(AppsList As Object)";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim totalsize As Long = 0";
_totalsize = (long) (0);
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim pm As PackageManager";
_pm = new anywheresoftware.b4a.phone.PackageManagerWrapper();
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="catlist.Clear";
mostCurrent._catlist.Clear();
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="tmp.Clear";
mostCurrent._tmp.Clear();
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="lw3.Clear";
mostCurrent._lw3.Clear();
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Try";
try {RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Dim lu As List = AppsList";
_lu = new anywheresoftware.b4a.objects.collections.List();
_lu.setObject((java.util.List)(_appslist));
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="If lu.Size=0 Then";
if (_lu.getSize()==0) { 
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Log(\"nothing to show\")";
anywheresoftware.b4a.keywords.Common.Log("nothing to show");
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="kvst.PutSimple(time,\"| Last Scan: clear\")";
mostCurrent._kvst._putsimple(null,mostCurrent._time,(Object)("| Last Scan: clear"));
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="close_init";
_close_init();
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="For n = 0 To lu.Size-1";
{
final int step14 = 1;
final int limit14 = (int) (_lu.getSize()-1);
for (_n = (int) (0) ; (step14 > 0 && _n <= limit14) || (step14 < 0 && _n >= limit14); _n = ((int)(0 + _n + step14)) ) {
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="Dim app() As Object = lu.Get(n)";
_app = (Object[])(_lu.Get(_n));
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="If app(1) = \"com.android.systemui\" Then Continu";
if ((_app[(int) (1)]).equals((Object)("com.android.systemui"))) { 
if (true) continue;};
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="icon = pm.GetApplicationIcon(app(1))";
mostCurrent._icon.setObject((android.graphics.drawable.BitmapDrawable)(_pm.GetApplicationIcon(BA.ObjectToString(_app[(int) (1)]))));
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="lw3.AddTwoLinesAndBitmap(app(0),NumberFormat2(a";
mostCurrent._lw3.AddTwoLinesAndBitmap(BA.ObjectToCharSequence(_app[(int) (0)]),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(_app[(int) (2)]))/(double)1024/(double)1024,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)+"MB"),mostCurrent._icon.getBitmap());
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="lw3.AddSingleLine(catlist.Get(0)&\" App(s) with,";
mostCurrent._lw3.AddSingleLine(BA.ObjectToCharSequence(BA.ObjectToString(mostCurrent._catlist.Get((int) (0)))+" App(s) with, "+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(_app[(int) (2)]))/(double)1024/(double)1024,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)+"MB"+" to clean"));
RDebugUtils.currentLine=7208982;
 //BA.debugLineNum = 7208982;BA.debugLine="lw3.SetSelection(n)";
mostCurrent._lw3.SetSelection(_n);
RDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="catlist.Add(lu.Size)";
mostCurrent._catlist.Add((Object)(_lu.getSize()));
RDebugUtils.currentLine=7208984;
 //BA.debugLineNum = 7208984;BA.debugLine="totalsize = totalsize+app(2)";
_totalsize = (long) (_totalsize+(double)(BA.ObjectToNumber(_app[(int) (2)])));
RDebugUtils.currentLine=7208985;
 //BA.debugLineNum = 7208985;BA.debugLine="tmp.Add(app(0)&\" \"&NumberFormat2(app(2)/1024/10";
mostCurrent._tmp.Add((Object)(BA.ObjectToString(_app[(int) (0)])+" "+anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(_app[(int) (2)]))/(double)1024/(double)1024,(int) (1),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.True)));
 }
};
 } 
       catch (Exception e26) {
			processBA.setLastException(e26);RDebugUtils.currentLine=7208990;
 //BA.debugLineNum = 7208990;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.Log(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage());
 };
RDebugUtils.currentLine=7208992;
 //BA.debugLineNum = 7208992;BA.debugLine="If lu.size>0 Then";
if (_lu.getSize()>0) { 
RDebugUtils.currentLine=7208993;
 //BA.debugLineNum = 7208993;BA.debugLine="end_scan";
_end_scan();
 }else {
RDebugUtils.currentLine=7208995;
 //BA.debugLineNum = 7208995;BA.debugLine="close_init";
_close_init();
 };
RDebugUtils.currentLine=7208997;
 //BA.debugLineNum = 7208997;BA.debugLine="End Sub";
return "";
}
public static String  _close_init() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "close_init"))
	return (String) Debug.delegate(mostCurrent.activityBA, "close_init", null);
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub close_init";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="pg.Visible=False";
mostCurrent._pg.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Label1.Visible=True";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Label1.BringToFront";
mostCurrent._label1.BringToFront();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"boost.png").getObject()));
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
mostCurrent._cb1.setButtonColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="kvs_read";
_kvs_read();
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="End Sub";
return "";
}
public static String  _end_scan() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "end_scan"))
	return (String) Debug.delegate(mostCurrent.activityBA, "end_scan", null);
int _sum = 0;
int _g = 0;
int _res = 0;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub end_scan";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim sum As Int=0";
_sum = (int) (0);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="For  g=0 To  tmp.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._tmp.getSize()-1);
for (_g = (int) (0) ; (step2 > 0 && _g <= limit2) || (step2 < 0 && _g >= limit2); _g = ((int)(0 + _g + step2)) ) {
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="sum=sum+g";
_sum = (int) (_sum+_g);
 }
};
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="cinfo.AddView(lw3,10dip,0dip,70%x,55%y)";
mostCurrent._cinfo.AddView((android.view.View)(mostCurrent._lw3.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (55),mostCurrent.activityBA));
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="cinfo.Show(\"Clean?:\",\"Clean\",\"Cancel\",\"\",LoadBitm";
mostCurrent._cinfo.Show("Clean?:","Clean","Cancel","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"warning_38x38.png").getObject()));
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="If cinfo.Response=DialogResponse.POSITIVE Then";
if (mostCurrent._cinfo.getResponse()==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="t1.Enabled=True";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="pg.spin";
mostCurrent._pg.spin();
 }else {
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="close_init";
_close_init();
 };
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="End Sub";
return "";
}
public static String  _cc_onscanprogress(int _current,int _total) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_onscanprogress"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cc_onscanprogress", new Object[] {_current,_total});
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub cc_onScanProgress(Current As Int , Total As In";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="pg.Progress=360/Total*Current";
mostCurrent._pg.setProgress((int) (360/(double)_total*_current));
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="pg.Text=Current &\" Apps scanned\"";
mostCurrent._pg.setText(BA.NumberToString(_current)+" Apps scanned");
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="End Sub";
return "";
}
public static String  _cc_onscanstarted() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cc_onscanstarted"))
	return (String) Debug.delegate(mostCurrent.activityBA, "cc_onscanstarted", null);
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub cc_OnScanStarted";
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Log(\"Started\")";
anywheresoftware.b4a.keywords.Common.Log("Started");
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="End Sub";
return "";
}
public static String  _close_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "close_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "close_click", null);
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub close_click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return "";
}
public static String  _close_nothing() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "close_nothing"))
	return (String) Debug.delegate(mostCurrent.activityBA, "close_nothing", null);
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub close_nothing";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="pg.Visible=False";
mostCurrent._pg.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="cb1.ImageBitmap=Null";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Label1.Visible=True";
mostCurrent._label1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Label1.BringToFront";
mostCurrent._label1.BringToFront();
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="Activity.Color=Colors.ARGB(255,255,255,255)";
mostCurrent._activity.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"boost.png").getObject()));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
mostCurrent._cb1.setButtonColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="kvs_read";
_kvs_read();
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="End Sub";
return "";
}
public static String  _dia_oncancel() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia_oncancel"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia_oncancel", null);
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub dia_onCancel()";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Log($\"onCancel()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onCancel()"));
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return "";
}
public static String  _dia_onclick(int _button,int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia_onclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia_onclick", new Object[] {_button,_index});
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub dia_onClick(Button As Int, index As Int)";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="If Button=-1 Then";
if (_button==-1) { 
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="kvst.DeleteAll";
mostCurrent._kvst._deleteall(null);
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="mathlist.Clear";
mostCurrent._mathlist.Clear();
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Activity.Invalidate";
mostCurrent._activity.Invalidate();
 };
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="End Sub";
return "";
}
public static String  _dia_ondismiss() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia_ondismiss"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia_ondismiss", null);
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub dia_onDismiss()";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Log($\"onDismiss()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onDismiss()"));
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return "";
}
public static String  _dia_onitemclick(int _index,boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia_onitemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia_onitemclick", new Object[] {_index,_selected});
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub dia_onItemClick(index As Int,selected As Boole";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onItemClick("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_selected))+")"));
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="End Sub";
return "";
}
public static String  _dia_onkey(int _key,int _keyevent) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia_onkey"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia_onkey", new Object[] {_key,_keyevent});
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub dia_onKey(key As Int, keyevent As Int)";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_onclick(int _button,int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia2_onclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia2_onclick", new Object[] {_button,_index});
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub dia2_onClick(Button As Int, index As Int)";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_ondismiss() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia2_ondismiss"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia2_ondismiss", null);
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub dia2_onDismiss()";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Log($\"onDismiss()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onDismiss()"));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_onitemclick(int _index,boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia2_onitemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia2_onitemclick", new Object[] {_index,_selected});
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub dia2_onItemClick(index As Int,selected As Bool";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onItemClick("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_selected))+")"));
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
public static String  _dia2_onkey(int _key,int _keyevent) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia2_onkey"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia2_onkey", new Object[] {_key,_keyevent});
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub dia2_onKey(key As Int, keyevent As Int)";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_onclick(int _button,int _index) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia3_onclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia3_onclick", new Object[] {_button,_index});
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub dia3_onClick(Button As Int, index As Int)";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Log($\"onClick()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onClick()"));
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_ondismiss() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia3_ondismiss"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia3_ondismiss", null);
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub dia3_onDismiss()";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Log($\"onDismiss()\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onDismiss()"));
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_onitemclick(int _index,boolean _selected) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia3_onitemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia3_onitemclick", new Object[] {_index,_selected});
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub dia3_onItemClick(index As Int,selected As Bool";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
anywheresoftware.b4a.keywords.Common.Log(("onItemClick("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_index))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_selected))+")"));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public static String  _dia3_onkey(int _key,int _keyevent) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dia3_onkey"))
	return (String) Debug.delegate(mostCurrent.activityBA, "dia3_onkey", new Object[] {_key,_keyevent});
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub dia3_onKey(key As Int, keyevent As Int)";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="End Sub";
return "";
}
public static Object  _getactivitiesinfo(String _package) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getactivitiesinfo"))
	return (Object) Debug.delegate(mostCurrent.activityBA, "getactivitiesinfo", new Object[] {_package});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub GetActivitiesInfo(package As String) As Object";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(processBA));
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="r.Target = r.RunMethod(\"getPackageManager\")";
_r.Target = _r.RunMethod("getPackageManager");
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="r.Target = r.RunMethod3(\"getPackageInfo\", package";
_r.Target = _r.RunMethod3("getPackageInfo",_package,"java.lang.String",BA.NumberToString(0x00000001),"java.lang.int");
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Return r.GetField(\"applicationInfo\")";
if (true) return _r.GetField("applicationInfo");
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return null;
}
public static String  _getfilename(String _fullpath) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getfilename"))
	return (String) Debug.delegate(mostCurrent.activityBA, "getfilename", new Object[] {_fullpath});
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub GetFileName(FullPath As String) As String";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\"/";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf("/")+1));
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return "";
}
public static String  _getparentpath(String _path) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getparentpath"))
	return (String) Debug.delegate(mostCurrent.activityBA, "getparentpath", new Object[] {_path});
String _path1 = "";
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub GetParentPath(Path As String) As String";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Dim Path1 As String";
_path1 = "";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="If Path = \"/\" Then";
if ((_path).equals("/")) { 
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Return \"/\"";
if (true) return "/";
 };
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="L = Path.LastIndexOf(\"/\")";
mostCurrent._l = BA.NumberToString(_path.lastIndexOf("/"));
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="If L = Path.Length - 1 Then";
if ((mostCurrent._l).equals(BA.NumberToString(_path.length()-1))) { 
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Path1 = Path.SubString2(0,L)";
_path1 = _path.substring((int) (0),(int)(Double.parseDouble(mostCurrent._l)));
 }else {
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Path1 = Path";
_path1 = _path;
 };
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="L = Path.LastIndexOf(\"/\")";
mostCurrent._l = BA.NumberToString(_path.lastIndexOf("/"));
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="If L = 0 Then";
if ((mostCurrent._l).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="L = 1";
mostCurrent._l = BA.NumberToString(1);
 };
RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="Return Path1.SubString2(0,L)";
if (true) return _path1.substring((int) (0),(int)(Double.parseDouble(mostCurrent._l)));
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="End Sub";
return "";
}
public static String  _getsourcedir(Object _appinfo) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getsourcedir"))
	return (String) Debug.delegate(mostCurrent.activityBA, "getsourcedir", new Object[] {_appinfo});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub GetSourceDir(AppInfo As Object) As String";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Try";
try {RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="r.Target = AppInfo";
_r.Target = _appinfo;
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Return r.GetField(\"sourceDir\")";
if (true) return BA.ObjectToString(_r.GetField("sourceDir"));
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="End Sub";
return "";
}
public static String  _inf_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "inf_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "inf_click", null);
anywheresoftware.b4a.objects.drawable.BitmapDrawable _ic = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _id = null;
String _read = "";
String _logcat = "";
String _lg = "";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub inf_click";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim ic,id As BitmapDrawable";
_ic = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
_id = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="ic.Initialize(LoadBitmap(File.DirAssets,\"add-3.pn";
_ic.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"add-3.png").getObject()));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="id.Initialize(LoadBitmap(File.DirAssets,\"add-3.pn";
_id.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"add-3.png").getObject()));
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim read As String";
_read = "";
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="For Each logcat As String In kvst.ListKeys";
final anywheresoftware.b4a.BA.IterableList group5 = mostCurrent._kvst._listkeys(null);
final int groupLen5 = group5.getSize();
for (int index5 = 0;index5 < groupLen5 ;index5++){
_logcat = BA.ObjectToString(group5.Get(index5));
 }
;
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="dia.setIcon2(id).create";
mostCurrent._dia.setIcon2((android.graphics.drawable.Drawable)(_id.getObject())).create();
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="For Each lg As String In kvst.ListKeys";
final anywheresoftware.b4a.BA.IterableList group8 = mostCurrent._kvst._listkeys(null);
final int groupLen8 = group8.getSize();
for (int index8 = 0;index8 < groupLen8 ;index8++){
_lg = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="read=kvst.GetSimple(lg)";
_read = mostCurrent._kvst._getsimple(null,_lg);
 }
;
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="dia.setCancelable(True).setNegativeButton(\"Clear\"";
mostCurrent._dia.setCancelable(anywheresoftware.b4a.keywords.Common.True).setNegativeButton(BA.ObjectToCharSequence("Clear")).setNeutralButton(BA.ObjectToCharSequence("Ok")).setTitle(BA.ObjectToCharSequence("Event log:")).setMultiChoiceItems(new String[]{mostCurrent._kvst._getsimple(null,_logcat)},(boolean[])(anywheresoftware.b4a.keywords.Common.Null)).show();
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="Return";
if (true) return "";
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="End Sub";
return "";
}
public static String  _lv1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv1_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "lv1_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub lv1_ItemClick (Position As Int, Value As Objec";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="If Value=Position Then";
if ((_value).equals((Object)(_position))) { 
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="inf_click";
_inf_click();
 };
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="End Sub";
return "";
}
public static String  _lv1_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lv1_itemlongclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "lv1_itemlongclick", new Object[] {_position,_value});
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub lv1_ItemLongClick (Position As Int, Value As O";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return "";
}
public static double  _mean(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mean"))
	return (Double) Debug.delegate(mostCurrent.activityBA, "mean", new Object[] {_data});
int _sum = 0;
double _x = 0;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub mean(data As List) As Double";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim sum As Int  = 0";
_sum = (int) (0);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="For Each x As Double In data";
final anywheresoftware.b4a.BA.IterableList group2 = _data;
final int groupLen2 = group2.getSize();
for (int index2 = 0;index2 < groupLen2 ;index2++){
_x = (double)(BA.ObjectToNumber(group2.Get(index2)));
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="sum = sum + x";
_sum = (int) (_sum+_x);
 }
;
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Return sum";
if (true) return _sum;
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="End Sub";
return 0;
}
public static String  _pg_onclick(Object _value) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pg_onclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "pg_onclick", new Object[] {_value});
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub pg_onClick(value As Object)";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public static String  _t1_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "t1_tick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "t1_tick", null);
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub t1_Tick";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="counter=counter+1";
_counter = (int) (_counter+1);
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="If counter>0 Then cc.CleanCache";
if (_counter>0) { 
_cc.CleanCache();};
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="If counter = 2 Then";
if (_counter==2) { 
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="t1.Enabled=False";
_t1.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="counter=0";
_counter = (int) (0);
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="cb1.ImageBitmap=Null";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost";
mostCurrent._cb1.setImageBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"boost.png").getObject()));
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
mostCurrent._cb1.setButtonColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="Label1.TextColor=Colors.ARGB(255,14,136,244)";
mostCurrent._label1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (14),(int) (136),(int) (244)));
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="close_init";
_close_init();
 };
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="End Sub";
return "";
}
public static double  _variance(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "variance"))
	return (Double) Debug.delegate(mostCurrent.activityBA, "variance", new Object[] {_data});
double _sum = 0;
double _sum_sqr = 0;
double _x = 0;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub variance(data As List) As Double";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim  Sum As Double = 0";
_sum = 0;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Dim  Sum_sqr As Double = 0";
_sum_sqr = 0;
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="For Each x As Double In data";
final anywheresoftware.b4a.BA.IterableList group3 = _data;
final int groupLen3 = group3.getSize();
for (int index3 = 0;index3 < groupLen3 ;index3++){
_x = (double)(BA.ObjectToNumber(group3.Get(index3)));
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Sum = Sum + x";
_sum = _sum+_x;
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="Sum_sqr = Sum_sqr + x'*x";
_sum_sqr = _sum_sqr+_x;
 }
;
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Return (Sum_sqr - (Sum+Sum)/data.Size)/data.size";
if (true) return (_sum_sqr-(_sum+_sum)/(double)_data.getSize())/(double)_data.getSize();
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="End Sub";
return 0;
}
}