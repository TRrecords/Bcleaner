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

public class loglist extends android.support.v7.app.AppCompatActivity implements B4AActivity{
	public static loglist mostCurrent;
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
			processBA = new BA(this.getApplicationContext(), null, null, "com.cleanerb.de", "com.cleanerb.de.loglist");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (loglist).");
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
		activityBA = new BA(this, layout, processBA, "com.cleanerb.de", "com.cleanerb.de.loglist");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.cleanerb.de.loglist", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (loglist) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (loglist) Resume **");
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
		return loglist.class;
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
        BA.LogInfo("** Activity (loglist) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (loglist) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _t2 = null;
public static String _date = "";
public static String _time = "";
public com.cleanerb.de.keyvaluestore _kvsdata = null;
public com.cleanerb.de.keyvaluestore _kvst = null;
public com.cleanerb.de.keyvaluestore _kvsmat = null;
public anywheresoftware.b4a.objects.collections.List _mathlist = null;
public anywheresoftware.b4a.objects.ListViewWrapper _lv1 = null;
public com.tchart.materialcolors.MaterialColors _mcl = null;
public de.amberhome.objects.appcompat.ACToolbarLightWrapper _toolbar = null;
public de.amberhome.objects.appcompat.ACActionBar _abhelper = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _ic = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _id = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _ie = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _ii = null;
public static int _counter = 0;
public flm.b4a.betterdialogs.BetterDialogs _bdia = null;
public de.donmanfred.NumberProgressBarWrapper _progress = null;
public anywheresoftware.b4a.objects.LabelWrapper _ptext = null;
public static String[] _zipitem = null;
public static String _logdir = "";
public static String _arcdir = "";
public static String _logitem = "";
public de.amberhome.objects.appcompat.ACMenuItemWrapper _mit = null;
public com.cleanerb.de.main _main = null;
public com.cleanerb.de.widget _widget = null;
public com.cleanerb.de.starter _starter = null;
public com.cleanerb.de.setanimation _setanimation = null;

public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public static String  _activity_actionbarhomeclick() throws Exception{
 //BA.debugLineNum = 134;BA.debugLine="Sub Activity_ActionBarHomeClick";
 //BA.debugLineNum = 135;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 136;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_backkeypressed() throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub Activity_BackKeyPressed As Boolean";
 //BA.debugLineNum = 130;BA.debugLine="bdia.CloseDialog(DialogResponse.CANCEL)";
mostCurrent._bdia.CloseDialog(anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL);
 //BA.debugLineNum = 131;BA.debugLine="Return bdia";
if (true) return BA.ObjectToBoolean(mostCurrent._bdia);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return false;
}
public static String  _activity_create(boolean _firsttime) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l1 = null;
anywheresoftware.b4a.objects.LabelWrapper _l2 = null;
anywheresoftware.b4a.objects.LabelWrapper _l3 = null;
anywheresoftware.b4a.objects.LabelWrapper _l4 = null;
anywheresoftware.b4a.objects.LabelWrapper _l5 = null;
anywheresoftware.b4a.objects.LabelWrapper _l6 = null;
String _zipo = "";
 //BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 35;BA.debugLine="ic=LoadBitmap(File.DirAssets,\"ic_developer_mode_w";
mostCurrent._ic = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_developer_mode_white_18dp.png");
 //BA.debugLineNum = 36;BA.debugLine="id=LoadBitmap(File.DirAssets,\"ic_arrow_back_white";
mostCurrent._id = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_arrow_back_white_18dp.png");
 //BA.debugLineNum = 37;BA.debugLine="ie=LoadBitmap(File.DirAssets,\"ic_archive_white_18";
mostCurrent._ie = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"ic_archive_white_18dp.png");
 //BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"3\")";
mostCurrent._activity.LoadLayout("3",mostCurrent.activityBA);
 //BA.debugLineNum = 40;BA.debugLine="Activity.TitleColor=mcl.md_black_1000";
mostCurrent._activity.setTitleColor(mostCurrent._mcl.getmd_black_1000());
 //BA.debugLineNum = 41;BA.debugLine="Activity.Color=Colors.ARGB(255,65,66,67)";
mostCurrent._activity.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (65),(int) (66),(int) (67)));
 //BA.debugLineNum = 42;BA.debugLine="mathlist.Initialize";
mostCurrent._mathlist.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="toolbar.SetAsActionBar";
mostCurrent._toolbar.SetAsActionBar(mostCurrent.activityBA);
 //BA.debugLineNum = 44;BA.debugLine="ABHelper.Initialize";
mostCurrent._abhelper.Initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 45;BA.debugLine="ABHelper.ShowUpIndicator=True";
mostCurrent._abhelper.setShowUpIndicator(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 46;BA.debugLine="toolbar.Elevation=10dip";
mostCurrent._toolbar.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))));
 //BA.debugLineNum = 47;BA.debugLine="toolbar.Color=Colors.ARGB(255,65,66,67)";
mostCurrent._toolbar.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (65),(int) (66),(int) (67)));
 //BA.debugLineNum = 48;BA.debugLine="toolbar.PopupTheme=toolbar.THEME_LIGHT";
mostCurrent._toolbar.setPopupTheme(mostCurrent._toolbar.THEME_LIGHT);
 //BA.debugLineNum = 50;BA.debugLine="toolbar.NavigationIconBitmap=id";
mostCurrent._toolbar.setNavigationIconBitmap((android.graphics.Bitmap)(mostCurrent._id.getObject()));
 //BA.debugLineNum = 51;BA.debugLine="toolbar.Title=\"LoggCat\"";
mostCurrent._toolbar.setTitle(BA.ObjectToCharSequence("LoggCat"));
 //BA.debugLineNum = 52;BA.debugLine="toolbar.SubTitleTextColor=mcl.md_light_blue_A400";
mostCurrent._toolbar.setSubTitleTextColor(mostCurrent._mcl.getmd_light_blue_A400());
 //BA.debugLineNum = 53;BA.debugLine="toolbar.SubTitle=\"Log Archive:\"";
mostCurrent._toolbar.setSubTitle(BA.ObjectToCharSequence("Log Archive:"));
 //BA.debugLineNum = 54;BA.debugLine="Activity.AddMenuItem3(\"Export\",\"ep\",ie,True)";
mostCurrent._activity.AddMenuItem3(BA.ObjectToCharSequence("Export"),"ep",(android.graphics.Bitmap)(mostCurrent._ie.getObject()),anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 55;BA.debugLine="Activity.AddMenuItem(\"clear/Log\",\"mo\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("clear/Log"),"mo");
 //BA.debugLineNum = 56;BA.debugLine="Activity.AddMenuItem(\"Close\",\"cl\")";
mostCurrent._activity.AddMenuItem(BA.ObjectToCharSequence("Close"),"cl");
 //BA.debugLineNum = 57;BA.debugLine="toolbar.InitMenuListener";
mostCurrent._toolbar.InitMenuListener();
 //BA.debugLineNum = 58;BA.debugLine="kvsdata.Initialize(File.DirInternal,\"data_data\")";
mostCurrent._kvsdata._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_data");
 //BA.debugLineNum = 59;BA.debugLine="kvst.Initialize(File.DirInternal,\"data_time\")";
mostCurrent._kvst._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_time");
 //BA.debugLineNum = 60;BA.debugLine="kvsmat.Initialize(File.DirInternal,\"data_math\")";
mostCurrent._kvsmat._initialize(processBA,anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_math");
 //BA.debugLineNum = 62;BA.debugLine="DateTime.TimeFormat=\"HHmm\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HHmm");
 //BA.debugLineNum = 63;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd-MM-yyy");
 //BA.debugLineNum = 64;BA.debugLine="date=DateTime.Date(DateTime.Now)";
_date = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 65;BA.debugLine="time=DateTime.Time(DateTime.Now)";
_time = anywheresoftware.b4a.keywords.Common.DateTime.Time(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 66;BA.debugLine="Log(date)";
anywheresoftware.b4a.keywords.Common.Log(_date);
 //BA.debugLineNum = 67;BA.debugLine="Log(time)";
anywheresoftware.b4a.keywords.Common.Log(_time);
 //BA.debugLineNum = 68;BA.debugLine="t2.Initialize(\"t2\",1000)";
_t2.Initialize(processBA,"t2",(long) (1000));
 //BA.debugLineNum = 69;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 70;BA.debugLine="counter=0";
_counter = (int) (0);
 //BA.debugLineNum = 72;BA.debugLine="Dim l1,l2,l3,l4,l5,l6 As Label";
_l1 = new anywheresoftware.b4a.objects.LabelWrapper();
_l2 = new anywheresoftware.b4a.objects.LabelWrapper();
_l3 = new anywheresoftware.b4a.objects.LabelWrapper();
_l4 = new anywheresoftware.b4a.objects.LabelWrapper();
_l5 = new anywheresoftware.b4a.objects.LabelWrapper();
_l6 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 73;BA.debugLine="l1.Initialize(\"l1\")";
_l1.Initialize(mostCurrent.activityBA,"l1");
 //BA.debugLineNum = 74;BA.debugLine="l2.Initialize(\"l2\")";
_l2.Initialize(mostCurrent.activityBA,"l2");
 //BA.debugLineNum = 75;BA.debugLine="l1=lv1.TwoLinesAndBitmap.Label";
_l1 = mostCurrent._lv1.getTwoLinesAndBitmap().Label;
 //BA.debugLineNum = 76;BA.debugLine="lv1.TwoLinesAndBitmap.Label.Color=Colors.ARGB(80,";
mostCurrent._lv1.getTwoLinesAndBitmap().Label.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (80),(int) (255),(int) (255),(int) (255)));
 //BA.debugLineNum = 77;BA.debugLine="l2=lv1.TwoLinesAndBitmap.SecondLabel";
_l2 = mostCurrent._lv1.getTwoLinesAndBitmap().SecondLabel;
 //BA.debugLineNum = 78;BA.debugLine="lv1.TwoLinesAndBitmap.SecondLabel.Color=Colors.AR";
mostCurrent._lv1.getTwoLinesAndBitmap().SecondLabel.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (40),(int) (255),(int) (255),(int) (255)));
 //BA.debugLineNum = 79;BA.debugLine="l2.TextColor=mcl.md_light_blue_A400'Colors.ARGB(2";
_l2.setTextColor(mostCurrent._mcl.getmd_light_blue_A400());
 //BA.debugLineNum = 80;BA.debugLine="l1.TextSize=17";
_l1.setTextSize((float) (17));
 //BA.debugLineNum = 81;BA.debugLine="l1.Gravity=Gravity.FILL";
_l1.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 //BA.debugLineNum = 82;BA.debugLine="l2.Gravity=Gravity.FILL";
_l2.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 //BA.debugLineNum = 83;BA.debugLine="l1.TextColor=Colors.ARGB(190,255,255,255)";
_l1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (190),(int) (255),(int) (255),(int) (255)));
 //BA.debugLineNum = 84;BA.debugLine="l2.TextSize=17";
_l2.setTextSize((float) (17));
 //BA.debugLineNum = 85;BA.debugLine="lv1.TwoLinesAndBitmap.ItemHeight=65dip";
mostCurrent._lv1.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (65)));
 //BA.debugLineNum = 86;BA.debugLine="lv1.TwoLinesAndBitmap.ImageView.Width=15%x";
mostCurrent._lv1.getTwoLinesAndBitmap().ImageView.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (15),mostCurrent.activityBA));
 //BA.debugLineNum = 87;BA.debugLine="lv1.TwoLinesAndBitmap.Label.Typeface=Typeface.Cre";
mostCurrent._lv1.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.MONOSPACE,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC));
 //BA.debugLineNum = 88;BA.debugLine="lv1.TwoLinesAndBitmap.SecondLabel.Typeface=Typefa";
mostCurrent._lv1.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.CreateNew(anywheresoftware.b4a.keywords.Common.Typeface.MONOSPACE,anywheresoftware.b4a.keywords.Common.Typeface.STYLE_ITALIC));
 //BA.debugLineNum = 91;BA.debugLine="progress.Initialize(\"progress\")";
mostCurrent._progress.Initialize(processBA,"progress");
 //BA.debugLineNum = 92;BA.debugLine="progress.ReachedBarColor=mcl.md_blue_A400";
mostCurrent._progress.setReachedBarColor(mostCurrent._mcl.getmd_blue_A400());
 //BA.debugLineNum = 93;BA.debugLine="progress.ProgressTextColor=mcl.md_white_1000";
mostCurrent._progress.setProgressTextColor(mostCurrent._mcl.getmd_white_1000());
 //BA.debugLineNum = 94;BA.debugLine="progress.Max=100";
mostCurrent._progress.setMax((int) (100));
 //BA.debugLineNum = 95;BA.debugLine="Ptext.Initialize(\"Ptext\")";
mostCurrent._ptext.Initialize(mostCurrent.activityBA,"Ptext");
 //BA.debugLineNum = 96;BA.debugLine="Ptext.Gravity=Gravity.CENTER_HORIZONTAL";
mostCurrent._ptext.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL);
 //BA.debugLineNum = 97;BA.debugLine="Ptext.TextSize=13";
mostCurrent._ptext.setTextSize((float) (13));
 //BA.debugLineNum = 98;BA.debugLine="Ptext.TextColor=mcl.md_blue_500";
mostCurrent._ptext.setTextColor(mostCurrent._mcl.getmd_blue_500());
 //BA.debugLineNum = 99;BA.debugLine="arcdir=File.DirRootExternal&\"/log/archive\"";
mostCurrent._arcdir = anywheresoftware.b4a.keywords.Common.File.getDirRootExternal()+"/log/archive";
 //BA.debugLineNum = 100;BA.debugLine="logdir=File.DirRootExternal&\"/log/\"";
mostCurrent._logdir = anywheresoftware.b4a.keywords.Common.File.getDirRootExternal()+"/log/";
 //BA.debugLineNum = 101;BA.debugLine="Dim zipo As String =\"_log.txt\"";
_zipo = "_log.txt";
 //BA.debugLineNum = 102;BA.debugLine="If File.IsDirectory(logdir,zipo.Contains(\".txt\"))";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(mostCurrent._logdir,BA.ObjectToString(_zipo.contains(".txt")))) { 
 //BA.debugLineNum = 103;BA.debugLine="ToastMessageShow(\"logdir exists.\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("logdir exists."),anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 105;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"/log\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"/log");
 //BA.debugLineNum = 106;BA.debugLine="File.MakeDir(File.DirDefaultExternal,\"/log/archi";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"/log/archive");
 //BA.debugLineNum = 107;BA.debugLine="File.MakeDir(File.DirRootExternal,\"/log/archive\"";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"/log/archive");
 //BA.debugLineNum = 108;BA.debugLine="File.MakeDir(File.DirRootExternal,\"/log\")";
anywheresoftware.b4a.keywords.Common.File.MakeDir(anywheresoftware.b4a.keywords.Common.File.getDirRootExternal(),"/log");
 //BA.debugLineNum = 109;BA.debugLine="ToastMessageShow(\"logdir created!\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("logdir created!"),anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 126;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 115;BA.debugLine="If t2.IsInitialized=True Then";
if (_t2.IsInitialized()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 116;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 118;BA.debugLine="t2.Initialize(\"t2\",1000)";
_t2.Initialize(processBA,"t2",(long) (1000));
 //BA.debugLineNum = 119;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 121;BA.debugLine="toolbar.InitMenuListener";
mostCurrent._toolbar.InitMenuListener();
 //BA.debugLineNum = 122;BA.debugLine="init";
_init();
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public static String  _clear_log() throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub clear_log";
 //BA.debugLineNum = 191;BA.debugLine="kvsdata.DeleteAll";
mostCurrent._kvsdata._deleteall();
 //BA.debugLineNum = 192;BA.debugLine="lv1.Clear";
mostCurrent._lv1.Clear();
 //BA.debugLineNum = 193;BA.debugLine="Activity.Invalidate";
mostCurrent._activity.Invalidate();
 //BA.debugLineNum = 194;BA.debugLine="lv1.AddTwoLinesAndBitmap(\"Log file cleared...\",da";
mostCurrent._lv1.AddTwoLinesAndBitmap(BA.ObjectToCharSequence("Log file cleared..."),BA.ObjectToCharSequence(_date+"|"+_time),(android.graphics.Bitmap)(mostCurrent._ic.getObject()));
 //BA.debugLineNum = 195;BA.debugLine="init";
_init();
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public static String  _ep_click() throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub ep_click";
 //BA.debugLineNum = 175;BA.debugLine="zip_log";
_zip_log();
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private kvsdata,kvst,kvsmat As KeyValueStore";
mostCurrent._kvsdata = new com.cleanerb.de.keyvaluestore();
mostCurrent._kvst = new com.cleanerb.de.keyvaluestore();
mostCurrent._kvsmat = new com.cleanerb.de.keyvaluestore();
 //BA.debugLineNum = 19;BA.debugLine="Dim mathlist As List";
mostCurrent._mathlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Private lv1 As ListView";
mostCurrent._lv1 = new anywheresoftware.b4a.objects.ListViewWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private mcl As MaterialColors";
mostCurrent._mcl = new com.tchart.materialcolors.MaterialColors();
 //BA.debugLineNum = 22;BA.debugLine="Private toolbar As ACToolBarLight";
mostCurrent._toolbar = new de.amberhome.objects.appcompat.ACToolbarLightWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Dim ABHelper As ACActionBar";
mostCurrent._abhelper = new de.amberhome.objects.appcompat.ACActionBar();
 //BA.debugLineNum = 24;BA.debugLine="Dim ic,id,ie,ii As Bitmap";
mostCurrent._ic = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
mostCurrent._id = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
mostCurrent._ie = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
mostCurrent._ii = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Private counter As Int";
_counter = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private bdia As BetterDialogs";
mostCurrent._bdia = new flm.b4a.betterdialogs.BetterDialogs();
 //BA.debugLineNum = 28;BA.debugLine="Dim progress As NumberProgressBar";
mostCurrent._progress = new de.donmanfred.NumberProgressBarWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private Ptext As Label";
mostCurrent._ptext = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Dim zipitem(1),logdir,arcdir,logitem As String";
mostCurrent._zipitem = new String[(int) (1)];
java.util.Arrays.fill(mostCurrent._zipitem,"");
mostCurrent._logdir = "";
mostCurrent._arcdir = "";
mostCurrent._logitem = "";
 //BA.debugLineNum = 31;BA.debugLine="Dim mit As ACMenuItem";
mostCurrent._mit = new de.amberhome.objects.appcompat.ACMenuItemWrapper();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
String _r1 = "";
anywheresoftware.b4a.objects.collections.List _sublist = null;
int _n = 0;
String _lg = "";
int _t = 0;
 //BA.debugLineNum = 152;BA.debugLine="Sub init";
 //BA.debugLineNum = 153;BA.debugLine="lv1.Clear";
mostCurrent._lv1.Clear();
 //BA.debugLineNum = 155;BA.debugLine="Dim r1 As String";
_r1 = "";
 //BA.debugLineNum = 156;BA.debugLine="Dim sublist As List";
_sublist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 157;BA.debugLine="sublist.Initialize";
_sublist.Initialize();
 //BA.debugLineNum = 158;BA.debugLine="Dim n As Int";
_n = 0;
 //BA.debugLineNum = 159;BA.debugLine="For Each lg As String In kvsdata.ListKeys";
final anywheresoftware.b4a.BA.IterableList group6 = mostCurrent._kvsdata._listkeys();
final int groupLen6 = group6.getSize();
for (int index6 = 0;index6 < groupLen6 ;index6++){
_lg = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 160;BA.debugLine="r1=lg";
_r1 = _lg;
 //BA.debugLineNum = 161;BA.debugLine="sublist.Add(kvsdata.GetSimple(lg)&\" - \"&r1)";
_sublist.Add((Object)(mostCurrent._kvsdata._getsimple(_lg)+" - "+_r1));
 //BA.debugLineNum = 162;BA.debugLine="lv1.AddTwoLinesAndBitmap2(lg,kvsdata.GetSimple(l";
mostCurrent._lv1.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_lg),BA.ObjectToCharSequence(mostCurrent._kvsdata._getsimple(_lg)),(android.graphics.Bitmap)(mostCurrent._ic.getObject()),(Object)(_r1));
 }
;
 //BA.debugLineNum = 164;BA.debugLine="File.WriteList(logdir,\"logcat.txt\",sublist)";
anywheresoftware.b4a.keywords.Common.File.WriteList(mostCurrent._logdir,"logcat.txt",_sublist);
 //BA.debugLineNum = 165;BA.debugLine="For t = 0 To lv1.Size-1";
{
final int step12 = 1;
final int limit12 = (int) (mostCurrent._lv1.getSize()-1);
for (_t = (int) (0) ; (step12 > 0 && _t <= limit12) || (step12 < 0 && _t >= limit12); _t = ((int)(0 + _t + step12)) ) {
 //BA.debugLineNum = 166;BA.debugLine="lv1.SetSelection(t)";
mostCurrent._lv1.SetSelection(_t);
 }
};
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public static String  _lv1_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 178;BA.debugLine="Sub lv1_ItemClick (Position As Int, Value As Objec";
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public static String  _lv1_itemlongclick(int _position,Object _value) throws Exception{
int _res = 0;
 //BA.debugLineNum = 182;BA.debugLine="Sub lv1_ItemLongClick (Position As Int, Value As O";
 //BA.debugLineNum = 183;BA.debugLine="Dim res As Int";
_res = 0;
 //BA.debugLineNum = 184;BA.debugLine="res=Msgbox2(\"Clear Log-List?\",\"Attention:\",\"clear";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Clear Log-List?"),BA.ObjectToCharSequence("Attention:"),"clear","cancel","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"close_48x48.png").getObject()),mostCurrent.activityBA);
 //BA.debugLineNum = 185;BA.debugLine="If res=DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 186;BA.debugLine="clear_log";
_clear_log();
 };
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public static String  _mo_click() throws Exception{
 //BA.debugLineNum = 170;BA.debugLine="Sub mo_click";
 //BA.debugLineNum = 171;BA.debugLine="kvst.DeleteAll";
mostCurrent._kvst._deleteall();
 //BA.debugLineNum = 172;BA.debugLine="kvsmat.DeleteAll";
mostCurrent._kvsmat._deleteall();
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private t2 As Timer";
_t2 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 11;BA.debugLine="Dim date,time As String";
_date = "";
_time = "";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public static String  _progress_onprogresschange(int _current,int _maxvalue) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub progress_onProgressChange(current As Int, maxv";
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return "";
}
public static String  _t2_tick() throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub t2_Tick";
 //BA.debugLineNum = 204;BA.debugLine="counter=counter+1";
_counter = (int) (_counter+1);
 //BA.debugLineNum = 205;BA.debugLine="progress.incrementProgressBy(counter)";
mostCurrent._progress.incrementProgressBy(_counter);
 //BA.debugLineNum = 206;BA.debugLine="Log(\"tick: \"&counter)";
anywheresoftware.b4a.keywords.Common.Log("tick: "+BA.NumberToString(_counter));
 //BA.debugLineNum = 207;BA.debugLine="If counter = 3 Then";
if (_counter==3) { 
 //BA.debugLineNum = 208;BA.debugLine="t2.Enabled=False";
_t2.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 209;BA.debugLine="bdia.CloseDialog(DialogResponse.CANCEL)";
mostCurrent._bdia.CloseDialog(anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL);
 //BA.debugLineNum = 210;BA.debugLine="counter=0";
_counter = (int) (0);
 };
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar_menuitemclick(de.amberhome.objects.appcompat.ACMenuItemWrapper _item) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub toolbar_MenuItemClick (Item As ACMenuItem)";
 //BA.debugLineNum = 144;BA.debugLine="If Item.Title=\"Export\" Then";
if ((_item.getTitle()).equals("Export")) { 
 //BA.debugLineNum = 145;BA.debugLine="zip_log";
_zip_log();
 };
 //BA.debugLineNum = 147;BA.debugLine="If Item.Id=\"cl\" Then";
if (_item.getId()==(double)(Double.parseDouble("cl"))) { 
 //BA.debugLineNum = 148;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 149;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 };
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public static String  _toolbar_navigationitemclick() throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub toolbar_NavigationItemClick";
 //BA.debugLineNum = 140;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 //BA.debugLineNum = 141;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
mostCurrent._setanimation._setanimati(mostCurrent.activityBA,"extra_in","extra_out");
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public static String  _zip_log() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub zip_log";
 //BA.debugLineNum = 215;BA.debugLine="If File.Exists(logdir,\"logcat.txt\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._logdir,"logcat.txt")) { 
 //BA.debugLineNum = 216;BA.debugLine="File.Copy(logdir,\"logcat.txt\",logdir,\"log_\"&dat";
anywheresoftware.b4a.keywords.Common.File.Copy(mostCurrent._logdir,"logcat.txt",mostCurrent._logdir,"log_"+_date+"_"+_time+".txt");
 //BA.debugLineNum = 217;BA.debugLine="Log(\"file logcat SubExists!\")";
anywheresoftware.b4a.keywords.Common.Log("file logcat SubExists!");
 }else {
 //BA.debugLineNum = 219;BA.debugLine="init";
_init();
 };
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
}
