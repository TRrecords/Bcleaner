package com.bcleaner;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _about_click() throws Exception{
try {
		Debug.PushSubsStack("about_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,492);
if (RapidSub.canDelegate("about_click")) return main.remoteMe.runUserSub(false, "main","about_click");
RemoteObject _ig = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
 BA.debugLineNum = 492;BA.debugLine="Sub about_click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 493;BA.debugLine="Dim ig As BitmapDrawable";
Debug.ShouldStop(4096);
_ig = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("ig", _ig);
 BA.debugLineNum = 494;BA.debugLine="ig.Initialize(LoadBitmap(File.DirAssets,\"id-card.";
Debug.ShouldStop(8192);
_ig.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("id-card.png"))).getObject())));
 BA.debugLineNum = 495;BA.debugLine="dia3.setTitle(\"About \"&pak.GetApplicationLabel(\"c";
Debug.ShouldStop(16384);
main.mostCurrent._dia3.runMethod(false,"setTitle",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("About "),main._pak.runMethod(true,"GetApplicationLabel",(Object)(RemoteObject.createImmutable("com.bcleaner"))),RemoteObject.createImmutable(" - Version "),main._pak.runMethod(true,"GetVersionName",(Object)(RemoteObject.createImmutable("com.bcleaner"))))))).runVoidMethod ("create");
 BA.debugLineNum = 496;BA.debugLine="dia3.setIcon2(ig).create";
Debug.ShouldStop(32768);
main.mostCurrent._dia3.runMethod(false,"setIcon2",(Object)((_ig.getObject()))).runVoidMethod ("create");
 BA.debugLineNum = 497;BA.debugLine="dia3.setMessage(\"Written in Basic by D.Trojan. Pu";
Debug.ShouldStop(65536);
main.mostCurrent._dia3.runMethod(false,"setMessage",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Written in Basic by D.Trojan. Published by SuloMedia™")))).runMethod(false,"setCancelable",(Object)(main.mostCurrent.__c.getField(true,"True"))).runMethod(false,"setNeutralButton",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok")))).runVoidMethod ("show");
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bd1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bd2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _l1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _l2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _l3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _l4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _l5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _l6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Activity.LoadLayout(\"1\")";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("1")),main.mostCurrent.activityBA);
 BA.debugLineNum = 61;BA.debugLine="toolbar.SetAsActionBar";
Debug.ShouldStop(268435456);
main.mostCurrent._toolbar.runVoidMethod ("SetAsActionBar",main.mostCurrent.activityBA);
 BA.debugLineNum = 62;BA.debugLine="toolbar.Elevation=10dip";
Debug.ShouldStop(536870912);
main.mostCurrent._toolbar.runMethod(true,"setElevation",BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))));
 BA.debugLineNum = 63;BA.debugLine="toolbar.PopupTheme=toolbar.THEME_DARK";
Debug.ShouldStop(1073741824);
main.mostCurrent._toolbar.runVoidMethod ("setPopupTheme",main.mostCurrent._toolbar.getField(true,"THEME_DARK"));
 BA.debugLineNum = 64;BA.debugLine="toolbar.Title=pak.GetApplicationLabel(\"com.bclean";
Debug.ShouldStop(-2147483648);
main.mostCurrent._toolbar.runMethod(true,"setTitle",BA.ObjectToCharSequence(main._pak.runMethod(true,"GetApplicationLabel",(Object)(RemoteObject.createImmutable("com.bcleaner")))));
 BA.debugLineNum = 65;BA.debugLine="toolbar.SubTitle=\"Version \"&pak.GetVersionName(\"c";
Debug.ShouldStop(1);
main.mostCurrent._toolbar.runMethod(true,"setSubTitle",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Version "),main._pak.runMethod(true,"GetVersionName",(Object)(RemoteObject.createImmutable("com.bcleaner"))))));
 BA.debugLineNum = 66;BA.debugLine="ABHelper.Initialize";
Debug.ShouldStop(2);
main.mostCurrent._abhelper.runVoidMethod ("Initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 67;BA.debugLine="os.Initialize(\"os\")";
Debug.ShouldStop(4);
main._os.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("os")));
 BA.debugLineNum = 68;BA.debugLine="cc.initialize(\"cc\")";
Debug.ShouldStop(8);
main._cc.runVoidMethod ("initialize",(Object)(RemoteObject.createImmutable("cc")),main.processBA);
 BA.debugLineNum = 69;BA.debugLine="toolbar.InitMenuListener";
Debug.ShouldStop(16);
main.mostCurrent._toolbar.runVoidMethod ("InitMenuListener");
 BA.debugLineNum = 70;BA.debugLine="ABHelper.HomeVisible=True";
Debug.ShouldStop(32);
main.mostCurrent._abhelper.runVoidMethod ("setHomeVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="applist.Initialize";
Debug.ShouldStop(64);
main.mostCurrent._applist.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="mathlist.Initialize";
Debug.ShouldStop(128);
main.mostCurrent._mathlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="tmp.Initialize";
Debug.ShouldStop(256);
main.mostCurrent._tmp.runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="catlist.Initialize";
Debug.ShouldStop(512);
main.mostCurrent._catlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="dia.Initialize(\"dia\")";
Debug.ShouldStop(1024);
main.mostCurrent._dia.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("dia")));
 BA.debugLineNum = 76;BA.debugLine="dia2.Initialize(\"dia2\")";
Debug.ShouldStop(2048);
main.mostCurrent._dia2.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("dia2")));
 BA.debugLineNum = 77;BA.debugLine="dia3.Initialize(\"dia3\")";
Debug.ShouldStop(4096);
main.mostCurrent._dia3.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("dia3")));
 BA.debugLineNum = 78;BA.debugLine="lw3.Initialize(\"lw3\")";
Debug.ShouldStop(8192);
main.mostCurrent._lw3.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("lw3")));
 BA.debugLineNum = 79;BA.debugLine="lw3.Enabled=True";
Debug.ShouldStop(16384);
main.mostCurrent._lw3.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 80;BA.debugLine="t1.Initialize(\"t1\",1000)";
Debug.ShouldStop(32768);
main._t1.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("t1")),(Object)(BA.numberCast(long.class, 1000)));
 BA.debugLineNum = 81;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(65536);
main._t1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 82;BA.debugLine="counter=0";
Debug.ShouldStop(131072);
main._counter = BA.numberCast(int.class, 0);
 BA.debugLineNum = 83;BA.debugLine="Activity.TitleColor=mcl.md_black_1000";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runMethod(true,"setTitleColor",main.mostCurrent._mcl.runMethod(true,"getmd_black_1000"));
 BA.debugLineNum = 84;BA.debugLine="Activity.Color=Colors.ARGB(255,255,255,255)'mcl.m";
Debug.ShouldStop(524288);
main.mostCurrent._activity.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 85;BA.debugLine="Dim bd,bd1,bd2 As BitmapDrawable";
Debug.ShouldStop(1048576);
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
_bd1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd1", _bd1);
_bd2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd2", _bd2);
 BA.debugLineNum = 86;BA.debugLine="bd1.Initialize(LoadBitmap(File.DirAssets,\"menu-1.";
Debug.ShouldStop(2097152);
_bd1.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("menu-1.png"))).getObject())));
 BA.debugLineNum = 87;BA.debugLine="Activity.AddMenuItem3(\"Info\", \"inf\", bd1.Bitmap,T";
Debug.ShouldStop(4194304);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem3",(Object)(BA.ObjectToCharSequence("Info")),(Object)(BA.ObjectToString("inf")),(Object)(_bd1.runMethod(false,"getBitmap")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 89;BA.debugLine="Activity.AddMenuItem(\"About\",\"about\")";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem",(Object)(BA.ObjectToCharSequence("About")),(Object)(RemoteObject.createImmutable("about")));
 BA.debugLineNum = 90;BA.debugLine="bd2.Initialize(LoadBitmap(File.DirAssets,\"close.p";
Debug.ShouldStop(33554432);
_bd2.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("close.png"))).getObject())));
 BA.debugLineNum = 91;BA.debugLine="Activity.AddMenuItem3(\"Exit\", \"close\",bd2.Bitmap,";
Debug.ShouldStop(67108864);
main.mostCurrent._activity.runVoidMethod ("AddMenuItem3",(Object)(BA.ObjectToCharSequence("Exit")),(Object)(BA.ObjectToString("close")),(Object)(_bd2.runMethod(false,"getBitmap")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 92;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
Debug.ShouldStop(134217728);
main.mostCurrent._cb1.runVoidMethod ("setButtonColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 93;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
Debug.ShouldStop(268435456);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("boost.png"))).getObject()));
 BA.debugLineNum = 94;BA.debugLine="kvst.Initialize(File.DirDefaultExternal,\"data_tim";
Debug.ShouldStop(536870912);
main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_initialize",main.processBA,(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("data_time")));
 BA.debugLineNum = 95;BA.debugLine="kvsdata.Initialize(File.DirDefaultExternal,\"data_";
Debug.ShouldStop(1073741824);
main.mostCurrent._kvsdata.runClassMethod (com.bcleaner.keyvaluestore.class, "_initialize",main.processBA,(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("data_data")));
 BA.debugLineNum = 96;BA.debugLine="kvsmat.Initialize(File.DirDefaultExternal,\"data_m";
Debug.ShouldStop(-2147483648);
main.mostCurrent._kvsmat.runClassMethod (com.bcleaner.keyvaluestore.class, "_initialize",main.processBA,(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("data_math")));
 BA.debugLineNum = 97;BA.debugLine="draw.InitializeNewInstance(\"android.graphics.Shad";
Debug.ShouldStop(1);
main.mostCurrent._draw.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.graphics.Shader")),(Object)((main.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 98;BA.debugLine="pg.Visible=False";
Debug.ShouldStop(2);
main.mostCurrent._pg.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="pg.RimShader=draw";
Debug.ShouldStop(4);
main.mostCurrent._pg.runVoidMethod ("setRimShader",(main.mostCurrent._draw.getObject()));
 BA.debugLineNum = 100;BA.debugLine="pg.BarColor=Colors.ARGB(220,14,136,244)";
Debug.ShouldStop(8);
main.mostCurrent._pg.runMethod(true,"setBarColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 101;BA.debugLine="pg.BarLength=10dip";
Debug.ShouldStop(16);
main.mostCurrent._pg.runMethod(true,"setBarLength",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 BA.debugLineNum = 102;BA.debugLine="pg.BarWidth=10dip";
Debug.ShouldStop(32);
main.mostCurrent._pg.runMethod(true,"setBarWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 BA.debugLineNum = 103;BA.debugLine="pg.RimWidth=10dip";
Debug.ShouldStop(64);
main.mostCurrent._pg.runMethod(true,"setRimWidth",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 BA.debugLineNum = 104;BA.debugLine="pg.FadingEdgeLength=15dip";
Debug.ShouldStop(128);
main.mostCurrent._pg.runVoidMethod ("setFadingEdgeLength",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15))));
 BA.debugLineNum = 105;BA.debugLine="pg.SpinSpeed=45";
Debug.ShouldStop(256);
main.mostCurrent._pg.runMethod(true,"setSpinSpeed",BA.numberCast(int.class, 45));
 BA.debugLineNum = 106;BA.debugLine="pg.TextSize=30";
Debug.ShouldStop(512);
main.mostCurrent._pg.runMethod(true,"setTextSize",BA.numberCast(int.class, 30));
 BA.debugLineNum = 107;BA.debugLine="pg.TextColor=mcl.md_blue_A700";
Debug.ShouldStop(1024);
main.mostCurrent._pg.runMethod(true,"setTextColor",main.mostCurrent._mcl.runMethod(true,"getmd_blue_A700"));
 BA.debugLineNum = 108;BA.debugLine="Dim l1,l2,l3,l4,l5,l6 As Label";
Debug.ShouldStop(2048);
_l1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l1", _l1);
_l2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l2", _l2);
_l3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l3", _l3);
_l4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l4", _l4);
_l5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l5", _l5);
_l6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l6", _l6);
 BA.debugLineNum = 109;BA.debugLine="l1.Initialize(\"l1\")";
Debug.ShouldStop(4096);
_l1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("l1")));
 BA.debugLineNum = 110;BA.debugLine="l2.Initialize(\"l2\")";
Debug.ShouldStop(8192);
_l2.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("l2")));
 BA.debugLineNum = 111;BA.debugLine="l3.Initialize(\"l3\")";
Debug.ShouldStop(16384);
_l3.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("l3")));
 BA.debugLineNum = 112;BA.debugLine="l4.Initialize(\"l4\")";
Debug.ShouldStop(32768);
_l4.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("l4")));
 BA.debugLineNum = 113;BA.debugLine="l5.Initialize(\"l5\")";
Debug.ShouldStop(65536);
_l5.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("l5")));
 BA.debugLineNum = 114;BA.debugLine="l6.Initialize(\"l6\")";
Debug.ShouldStop(131072);
_l6.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("l6")));
 BA.debugLineNum = 115;BA.debugLine="l6=lw3.SingleLineLayout.Label";
Debug.ShouldStop(262144);
_l6 = main.mostCurrent._lw3.runMethod(false,"getSingleLineLayout").getField(false,"Label");Debug.locals.put("l6", _l6);
 BA.debugLineNum = 116;BA.debugLine="l1.TextColor=mcl.md_light_blue_A700'Colors.ARGB(2";
Debug.ShouldStop(524288);
_l1.runMethod(true,"setTextColor",main.mostCurrent._mcl.runMethod(true,"getmd_light_blue_A700"));
 BA.debugLineNum = 117;BA.debugLine="l6.TextColor=mcl.md_red_A200'Colors.ARGB(200,255,";
Debug.ShouldStop(1048576);
_l6.runMethod(true,"setTextColor",main.mostCurrent._mcl.runMethod(true,"getmd_red_A200"));
 BA.debugLineNum = 118;BA.debugLine="l1.TextSize=15";
Debug.ShouldStop(2097152);
_l1.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 119;BA.debugLine="l6.TextSize=15";
Debug.ShouldStop(4194304);
_l6.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 120;BA.debugLine="l1.Gravity=Gravity.CENTER";
Debug.ShouldStop(8388608);
_l1.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 121;BA.debugLine="l4=lw3.TwoLinesAndBitmap.Label";
Debug.ShouldStop(16777216);
_l4 = main.mostCurrent._lw3.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label");Debug.locals.put("l4", _l4);
 BA.debugLineNum = 122;BA.debugLine="l2.TextColor=Colors.White";
Debug.ShouldStop(33554432);
_l2.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 123;BA.debugLine="l4.TextColor=Colors.White";
Debug.ShouldStop(67108864);
_l4.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 124;BA.debugLine="l2.TextSize=15";
Debug.ShouldStop(134217728);
_l2.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 125;BA.debugLine="l4.TextSize=15";
Debug.ShouldStop(268435456);
_l4.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 126;BA.debugLine="l3.TextColor=mcl.md_amber_A700";
Debug.ShouldStop(536870912);
_l3.runMethod(true,"setTextColor",main.mostCurrent._mcl.runMethod(true,"getmd_amber_A700"));
 BA.debugLineNum = 127;BA.debugLine="l5=lw3.TwoLinesAndBitmap.SecondLabel";
Debug.ShouldStop(1073741824);
_l5 = main.mostCurrent._lw3.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel");Debug.locals.put("l5", _l5);
 BA.debugLineNum = 128;BA.debugLine="l3.TextSize=15";
Debug.ShouldStop(-2147483648);
_l3.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 129;BA.debugLine="l5.TextSize=15";
Debug.ShouldStop(1);
_l5.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 130;BA.debugLine="l5.TextColor=mcl.md_blue_500";
Debug.ShouldStop(2);
_l5.runMethod(true,"setTextColor",main.mostCurrent._mcl.runMethod(true,"getmd_blue_500"));
 BA.debugLineNum = 131;BA.debugLine="Label1.TextColor=Colors.ARGB(255,14,136,244)'Colo";
Debug.ShouldStop(4);
main.mostCurrent._label1.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 132;BA.debugLine="Label1.BringToFront";
Debug.ShouldStop(8);
main.mostCurrent._label1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 133;BA.debugLine="Label1.Gravity=Gravity.CENTER_HORIZONTAL";
Debug.ShouldStop(16);
main.mostCurrent._label1.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"));
 BA.debugLineNum = 134;BA.debugLine="DateTime.DateFormat=\"dd.MM\"";
Debug.ShouldStop(32);
main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd.MM"));
 BA.debugLineNum = 135;BA.debugLine="time=DateTime.Time(DateTime.Now)";
Debug.ShouldStop(64);
main.mostCurrent._time = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 136;BA.debugLine="date= DateTime.Date(DateTime.Now)";
Debug.ShouldStop(128);
main.mostCurrent._date = main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(main.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 137;BA.debugLine="Label2.TextColor=Colors.ARGB(190,14,136,244)";
Debug.ShouldStop(256);
main.mostCurrent._label2.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 190)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 138;BA.debugLine="Label3.TextColor=Colors.ARGB(190,14,136,244)";
Debug.ShouldStop(512);
main.mostCurrent._label3.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 190)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 139;BA.debugLine="Label2.TextSize=15";
Debug.ShouldStop(1024);
main.mostCurrent._label2.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 140;BA.debugLine="Label3.TextSize=15";
Debug.ShouldStop(2048);
main.mostCurrent._label3.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 141;BA.debugLine="Label1.BringToFront";
Debug.ShouldStop(4096);
main.mostCurrent._label1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 142;BA.debugLine="Label1.TextSize=19";
Debug.ShouldStop(8192);
main.mostCurrent._label1.runMethod(true,"setTextSize",BA.numberCast(float.class, 19));
 BA.debugLineNum = 144;BA.debugLine="If FirstTime=True Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_firsttime,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 145;BA.debugLine="File.WriteList(File.DirDefaultExternal,\"math.txt";
Debug.ShouldStop(65536);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("math.txt")),(Object)(main.mostCurrent._mathlist));
 };
 BA.debugLineNum = 148;BA.debugLine="kvs_read";
Debug.ShouldStop(524288);
_kvs_read();
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,165);
if (RapidSub.canDelegate("activity_keypress")) return main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 165;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 166;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 167;BA.debugLine="Activity.Finish";
Debug.ShouldStop(64);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 168;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
Debug.ShouldStop(128);
main.mostCurrent._setanimation.runVoidMethod ("_setanimati",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("extra_in")),(Object)(RemoteObject.createImmutable("extra_out")));
 };
 BA.debugLineNum = 170;BA.debugLine="Return(True)";
Debug.ShouldStop(512);
if (true) return (main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,156);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 156;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 158;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(536870912);
main._t1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 159;BA.debugLine="pg.Visible=False";
Debug.ShouldStop(1073741824);
main.mostCurrent._pg.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 160;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._cb1.runVoidMethod ("setButtonColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 161;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
Debug.ShouldStop(1);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("boost.png"))).getObject()));
 BA.debugLineNum = 162;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
Debug.ShouldStop(2);
main.mostCurrent._setanimation.runVoidMethod ("_setanimati",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("extra_in")),(Object)(RemoteObject.createImmutable("extra_out")));
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,151);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 151;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 153;BA.debugLine="kvs_read";
Debug.ShouldStop(16777216);
_kvs_read();
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _app_list() throws Exception{
try {
		Debug.PushSubsStack("app_list (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,392);
if (RapidSub.canDelegate("app_list")) return main.remoteMe.runUserSub(false, "main","app_list");
int _i = 0;
 BA.debugLineNum = 392;BA.debugLine="Sub app_list";
Debug.ShouldStop(128);
 BA.debugLineNum = 393;BA.debugLine="applist=pak.GetInstalledPackages";
Debug.ShouldStop(256);
main.mostCurrent._applist = main._pak.runMethod(false,"GetInstalledPackages");
 BA.debugLineNum = 394;BA.debugLine="Obj1.Target = Obj1.GetContext";
Debug.ShouldStop(512);
main.mostCurrent._obj1.setField ("Target",(main.mostCurrent._obj1.runMethod(false,"GetContext",main.processBA)));
 BA.debugLineNum = 395;BA.debugLine="Obj1.Target = Obj1.RunMethod(\"getPackageManager\")";
Debug.ShouldStop(1024);
main.mostCurrent._obj1.setField ("Target",main.mostCurrent._obj1.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPackageManager"))));
 BA.debugLineNum = 396;BA.debugLine="Obj2.Target = Obj1.RunMethod2(\"getInstalledPackag";
Debug.ShouldStop(2048);
main.mostCurrent._obj2.setField ("Target",main.mostCurrent._obj1.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getInstalledPackages")),(Object)(BA.NumberToString(0)),(Object)(RemoteObject.createImmutable("java.lang.int"))));
 BA.debugLineNum = 397;BA.debugLine="size = Obj2.RunMethod(\"size\")";
Debug.ShouldStop(4096);
main._size = BA.numberCast(int.class, main.mostCurrent._obj2.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("size"))));
 BA.debugLineNum = 398;BA.debugLine="For i = 0 To size -1";
Debug.ShouldStop(8192);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {main._size,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 399;BA.debugLine="Obj3.Target = Obj2.RunMethod2(\"get\", i, \"java.la";
Debug.ShouldStop(16384);
main.mostCurrent._obj3.setField ("Target",main.mostCurrent._obj2.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("get")),(Object)(BA.NumberToString(_i)),(Object)(RemoteObject.createImmutable("java.lang.int"))));
 BA.debugLineNum = 400;BA.debugLine="size = Obj2.RunMethod(\"size\")";
Debug.ShouldStop(32768);
main._size = BA.numberCast(int.class, main.mostCurrent._obj2.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("size"))));
 BA.debugLineNum = 401;BA.debugLine="Obj3.Target = Obj3.GetField(\"applicationInfo\") '";
Debug.ShouldStop(65536);
main.mostCurrent._obj3.setField ("Target",main.mostCurrent._obj3.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("applicationInfo"))));
 BA.debugLineNum = 402;BA.debugLine="flags = Obj3.GetField(\"flags\")";
Debug.ShouldStop(131072);
main._flags = BA.numberCast(int.class, main.mostCurrent._obj3.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("flags"))));
 BA.debugLineNum = 403;BA.debugLine="packName = Obj3.GetField(\"packageName\")";
Debug.ShouldStop(262144);
main.mostCurrent._packname = BA.ObjectToString(main.mostCurrent._obj3.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("packageName"))));
 BA.debugLineNum = 404;BA.debugLine="If Bit.And(flags, 1)  = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"Bit").runMethod(true,"And",(Object)(main._flags),(Object)(BA.numberCast(int.class, 1))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 406;BA.debugLine="args(0) = Obj3.Target";
Debug.ShouldStop(2097152);
main.mostCurrent._args.setArrayElement (main.mostCurrent._obj3.getField(false,"Target"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 407;BA.debugLine="Types(0) = \"android.content.pm.ApplicationInfo\"";
Debug.ShouldStop(4194304);
main.mostCurrent._types.setArrayElement (BA.ObjectToString("android.content.pm.ApplicationInfo"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 408;BA.debugLine="name = Obj1.RunMethod4(\"getApplicationLabel\", a";
Debug.ShouldStop(8388608);
main.mostCurrent._name = BA.ObjectToString(main.mostCurrent._obj1.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("getApplicationLabel")),(Object)(main.mostCurrent._args),(Object)(main.mostCurrent._types)));
 BA.debugLineNum = 409;BA.debugLine="icon = Obj1.RunMethod4(\"getApplicationIcon\", ar";
Debug.ShouldStop(16777216);
main.mostCurrent._icon.setObject(main.mostCurrent._obj1.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("getApplicationIcon")),(Object)(main.mostCurrent._args),(Object)(main.mostCurrent._types)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cb1_click() throws Exception{
try {
		Debug.PushSubsStack("cb1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,238);
if (RapidSub.canDelegate("cb1_click")) return main.remoteMe.runUserSub(false, "main","cb1_click");
 BA.debugLineNum = 238;BA.debugLine="Sub cb1_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="cb1.ImageBitmap=Null";
Debug.ShouldStop(16384);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 240;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,255,255,255)";
Debug.ShouldStop(32768);
main.mostCurrent._cb1.runVoidMethod ("setButtonColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 241;BA.debugLine="pg.Visible=True";
Debug.ShouldStop(65536);
main.mostCurrent._pg.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 242;BA.debugLine="Label1.Visible=False";
Debug.ShouldStop(131072);
main.mostCurrent._label1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 243;BA.debugLine="scan_start";
Debug.ShouldStop(262144);
_scan_start();
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cc_oncleancompleted(RemoteObject _cachesize) throws Exception{
try {
		Debug.PushSubsStack("cc_onCleanCompleted (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,346);
if (RapidSub.canDelegate("cc_oncleancompleted")) return main.remoteMe.runUserSub(false, "main","cc_oncleancompleted", _cachesize);
RemoteObject _n = RemoteObject.createImmutable(0);
Debug.locals.put("CacheSize", _cachesize);
 BA.debugLineNum = 346;BA.debugLine="Sub cc_onCleanCompleted(CacheSize As Long)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Log(CacheSize)";
Debug.ShouldStop(67108864);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_cachesize)));
 BA.debugLineNum = 348;BA.debugLine="Activity.Color=Colors.ARGB(255,255,255,255)";
Debug.ShouldStop(134217728);
main.mostCurrent._activity.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 349;BA.debugLine="pg.stopSpinning";
Debug.ShouldStop(268435456);
main.mostCurrent._pg.runVoidMethod ("stopSpinning");
 BA.debugLineNum = 350;BA.debugLine="pg.Visible=False";
Debug.ShouldStop(536870912);
main.mostCurrent._pg.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 351;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"succes";
Debug.ShouldStop(1073741824);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("success.png"))).getObject()));
 BA.debugLineNum = 352;BA.debugLine="kvsmat.PutSimple(CacheSize,CacheSize)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._kvsmat.runClassMethod (com.bcleaner.keyvaluestore.class, "_putsimple",(Object)(BA.NumberToString(_cachesize)),(Object)((_cachesize)));
 BA.debugLineNum = 353;BA.debugLine="mathlist.Add(CacheSize)";
Debug.ShouldStop(1);
main.mostCurrent._mathlist.runVoidMethod ("Add",(Object)((_cachesize)));
 BA.debugLineNum = 355;BA.debugLine="Dim n As Int=0";
Debug.ShouldStop(4);
_n = BA.numberCast(int.class, 0);Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 356;BA.debugLine="n=n+CacheSize";
Debug.ShouldStop(8);
_n = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_n,_cachesize}, "+",1, 2));Debug.locals.put("n", _n);
 BA.debugLineNum = 357;BA.debugLine="Log(\"CS n: \"&n)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("CS n: "),_n)));
 BA.debugLineNum = 358;BA.debugLine="kvst.PutSimple(n,date&\"|@ \"&time&\" App(s): \"&Form";
Debug.ShouldStop(32);
main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_putsimple",(Object)(BA.NumberToString(_n)),(Object)((RemoteObject.concat(main.mostCurrent._date,RemoteObject.createImmutable("|@ "),main.mostCurrent._time,RemoteObject.createImmutable(" App(s): "),_formatfilesize(BA.numberCast(float.class, _cachesize))))));
 BA.debugLineNum = 359;BA.debugLine="kvs_read";
Debug.ShouldStop(64);
_kvs_read();
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cc_oncleanstarted() throws Exception{
try {
		Debug.PushSubsStack("cc_onCleanStarted (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,342);
if (RapidSub.canDelegate("cc_oncleanstarted")) return main.remoteMe.runUserSub(false, "main","cc_oncleanstarted");
 BA.debugLineNum = 342;BA.debugLine="Sub cc_onCleanStarted";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="Log(\"CleanStarted\")";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("CleanStarted")));
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cc_onscancompleted(RemoteObject _appslist) throws Exception{
try {
		Debug.PushSubsStack("cc_onScanCompleted (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,303);
if (RapidSub.canDelegate("cc_onscancompleted")) return main.remoteMe.runUserSub(false, "main","cc_onscancompleted", _appslist);
RemoteObject _totalsize = RemoteObject.createImmutable(0L);
RemoteObject _pm = RemoteObject.declareNull("anywheresoftware.b4a.phone.PackageManagerWrapper");
RemoteObject _lu = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _app = null;
Debug.locals.put("AppsList", _appslist);
 BA.debugLineNum = 303;BA.debugLine="Sub cc_onScanCompleted(AppsList As Object)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="Dim totalsize As Long = 0";
Debug.ShouldStop(32768);
_totalsize = BA.numberCast(long.class, 0);Debug.locals.put("totalsize", _totalsize);Debug.locals.put("totalsize", _totalsize);
 BA.debugLineNum = 305;BA.debugLine="Dim pm As PackageManager";
Debug.ShouldStop(65536);
_pm = RemoteObject.createNew ("anywheresoftware.b4a.phone.PackageManagerWrapper");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 307;BA.debugLine="catlist.Clear";
Debug.ShouldStop(262144);
main.mostCurrent._catlist.runVoidMethod ("Clear");
 BA.debugLineNum = 308;BA.debugLine="tmp.Clear";
Debug.ShouldStop(524288);
main.mostCurrent._tmp.runVoidMethod ("Clear");
 BA.debugLineNum = 309;BA.debugLine="lw3.Clear";
Debug.ShouldStop(1048576);
main.mostCurrent._lw3.runVoidMethod ("Clear");
 BA.debugLineNum = 310;BA.debugLine="Try";
Debug.ShouldStop(2097152);
try { BA.debugLineNum = 311;BA.debugLine="Dim lu As List = AppsList";
Debug.ShouldStop(4194304);
_lu = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lu.setObject(_appslist);Debug.locals.put("lu", _lu);
 BA.debugLineNum = 312;BA.debugLine="If lu.Size=0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_lu.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 313;BA.debugLine="Log(\"nothing to show\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("nothing to show")));
 BA.debugLineNum = 314;BA.debugLine="kvst.PutSimple(time,\"| Last Scan: clear\")";
Debug.ShouldStop(33554432);
main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_putsimple",(Object)(main.mostCurrent._time),(Object)((RemoteObject.createImmutable("| Last Scan: clear"))));
 BA.debugLineNum = 315;BA.debugLine="close_init";
Debug.ShouldStop(67108864);
_close_init();
 BA.debugLineNum = 316;BA.debugLine="Return";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 318;BA.debugLine="For n = 0 To lu.Size-1";
Debug.ShouldStop(536870912);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_lu.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_n = 0 ; (step14 > 0 && _n <= limit14) || (step14 < 0 && _n >= limit14); _n = ((int)(0 + _n + step14)) ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 319;BA.debugLine="Dim app() As Object = lu.Get(n)";
Debug.ShouldStop(1073741824);
_app = (_lu.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("app", _app);Debug.locals.put("app", _app);
 BA.debugLineNum = 320;BA.debugLine="If app(1) = \"com.android.systemui\" Then Continu";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_app.getArrayElement(false,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(("com.android.systemui")))) { 
if (true) continue;};
 BA.debugLineNum = 321;BA.debugLine="icon = pm.GetApplicationIcon(app(1))";
Debug.ShouldStop(1);
main.mostCurrent._icon.setObject(_pm.runMethod(false,"GetApplicationIcon",(Object)(BA.ObjectToString(_app.getArrayElement(false,BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 323;BA.debugLine="lw3.AddTwoLinesAndBitmap(app(0),NumberFormat2(a";
Debug.ShouldStop(4);
main.mostCurrent._lw3.runVoidMethod ("AddTwoLinesAndBitmap",(Object)(BA.ObjectToCharSequence(_app.getArrayElement(false,BA.numberCast(int.class, 0)))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _app.getArrayElement(false,BA.numberCast(int.class, 2))),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(main.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable("MB")))),(Object)(main.mostCurrent._icon.runMethod(false,"getBitmap")));
 BA.debugLineNum = 324;BA.debugLine="lw3.AddSingleLine(catlist.Get(0)&\" App(s) with,";
Debug.ShouldStop(8);
main.mostCurrent._lw3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._catlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(" App(s) with, "),main.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _app.getArrayElement(false,BA.numberCast(int.class, 2))),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(main.mostCurrent.__c.getField(true,"True"))),RemoteObject.createImmutable("MB"),RemoteObject.createImmutable(" to clean")))));
 BA.debugLineNum = 325;BA.debugLine="lw3.SetSelection(n)";
Debug.ShouldStop(16);
main.mostCurrent._lw3.runVoidMethod ("SetSelection",(Object)(BA.numberCast(int.class, _n)));
 BA.debugLineNum = 326;BA.debugLine="catlist.Add(lu.Size)";
Debug.ShouldStop(32);
main.mostCurrent._catlist.runVoidMethod ("Add",(Object)((_lu.runMethod(true,"getSize"))));
 BA.debugLineNum = 327;BA.debugLine="totalsize = totalsize+app(2)";
Debug.ShouldStop(64);
_totalsize = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {_totalsize,BA.numberCast(double.class, _app.getArrayElement(false,BA.numberCast(int.class, 2)))}, "+",1, 0));Debug.locals.put("totalsize", _totalsize);
 BA.debugLineNum = 328;BA.debugLine="tmp.Add(app(0)&\" \"&NumberFormat2(app(2)/1024/10";
Debug.ShouldStop(128);
main.mostCurrent._tmp.runVoidMethod ("Add",(Object)((RemoteObject.concat(_app.getArrayElement(false,BA.numberCast(int.class, 0)),RemoteObject.createImmutable(" "),main.mostCurrent.__c.runMethod(true,"NumberFormat2",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _app.getArrayElement(false,BA.numberCast(int.class, 2))),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "//",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(main.mostCurrent.__c.getField(true,"True")))))));
 }
}Debug.locals.put("n", _n);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e26) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e26.toString()); BA.debugLineNum = 333;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA).runMethod(true,"getMessage")));
 };
 BA.debugLineNum = 335;BA.debugLine="If lu.size>0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_lu.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 336;BA.debugLine="end_scan";
Debug.ShouldStop(32768);
_end_scan();
 }else {
 BA.debugLineNum = 338;BA.debugLine="close_init";
Debug.ShouldStop(131072);
_close_init();
 };
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cc_onscanprogress(RemoteObject _current,RemoteObject _total) throws Exception{
try {
		Debug.PushSubsStack("cc_onScanProgress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,297);
if (RapidSub.canDelegate("cc_onscanprogress")) return main.remoteMe.runUserSub(false, "main","cc_onscanprogress", _current, _total);
Debug.locals.put("Current", _current);
Debug.locals.put("Total", _total);
 BA.debugLineNum = 297;BA.debugLine="Sub cc_onScanProgress(Current As Int , Total As In";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="pg.Progress=360/Total*Current";
Debug.ShouldStop(512);
main.mostCurrent._pg.runVoidMethod ("setProgress",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(360),_total,_current}, "/*",0, 0)));
 BA.debugLineNum = 299;BA.debugLine="pg.Text=Current &\" Apps scanned\"";
Debug.ShouldStop(1024);
main.mostCurrent._pg.runVoidMethod ("setText",RemoteObject.concat(_current,RemoteObject.createImmutable(" Apps scanned")));
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cc_onscanstarted() throws Exception{
try {
		Debug.PushSubsStack("cc_OnScanStarted (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,292);
if (RapidSub.canDelegate("cc_onscanstarted")) return main.remoteMe.runUserSub(false, "main","cc_onscanstarted");
 BA.debugLineNum = 292;BA.debugLine="Sub cc_OnScanStarted";
Debug.ShouldStop(8);
 BA.debugLineNum = 294;BA.debugLine="Log(\"Started\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Started")));
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close_click() throws Exception{
try {
		Debug.PushSubsStack("close_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,252);
if (RapidSub.canDelegate("close_click")) return main.remoteMe.runUserSub(false, "main","close_click");
 BA.debugLineNum = 252;BA.debugLine="Sub close_click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="ExitApplication";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 254;BA.debugLine="SetAnimation.setanimati(\"extra_in\", \"extra_out\")";
Debug.ShouldStop(536870912);
main.mostCurrent._setanimation.runVoidMethod ("_setanimati",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("extra_in")),(Object)(RemoteObject.createImmutable("extra_out")));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close_init() throws Exception{
try {
		Debug.PushSubsStack("close_init (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,257);
if (RapidSub.canDelegate("close_init")) return main.remoteMe.runUserSub(false, "main","close_init");
 BA.debugLineNum = 257;BA.debugLine="Sub close_init";
Debug.ShouldStop(1);
 BA.debugLineNum = 258;BA.debugLine="pg.Visible=False";
Debug.ShouldStop(2);
main.mostCurrent._pg.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 259;BA.debugLine="Label1.Visible=True";
Debug.ShouldStop(4);
main.mostCurrent._label1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 260;BA.debugLine="Label1.BringToFront";
Debug.ShouldStop(8);
main.mostCurrent._label1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 261;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
Debug.ShouldStop(16);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("boost.png"))).getObject()));
 BA.debugLineNum = 262;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
Debug.ShouldStop(32);
main.mostCurrent._cb1.runVoidMethod ("setButtonColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 263;BA.debugLine="kvs_read";
Debug.ShouldStop(64);
_kvs_read();
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _close_nothing() throws Exception{
try {
		Debug.PushSubsStack("close_nothing (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,266);
if (RapidSub.canDelegate("close_nothing")) return main.remoteMe.runUserSub(false, "main","close_nothing");
 BA.debugLineNum = 266;BA.debugLine="Sub close_nothing";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="pg.Visible=False";
Debug.ShouldStop(1024);
main.mostCurrent._pg.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 268;BA.debugLine="cb1.ImageBitmap=Null";
Debug.ShouldStop(2048);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 269;BA.debugLine="Label1.Visible=True";
Debug.ShouldStop(4096);
main.mostCurrent._label1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 270;BA.debugLine="Label1.BringToFront";
Debug.ShouldStop(8192);
main.mostCurrent._label1.runVoidMethod ("BringToFront");
 BA.debugLineNum = 271;BA.debugLine="Activity.Color=Colors.ARGB(255,255,255,255)";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 272;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost.";
Debug.ShouldStop(32768);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("boost.png"))).getObject()));
 BA.debugLineNum = 273;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
Debug.ShouldStop(65536);
main.mostCurrent._cb1.runVoidMethod ("setButtonColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 274;BA.debugLine="kvs_read";
Debug.ShouldStop(131072);
_kvs_read();
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia_oncancel() throws Exception{
try {
		Debug.PushSubsStack("dia_onCancel (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,443);
if (RapidSub.canDelegate("dia_oncancel")) return main.remoteMe.runUserSub(false, "main","dia_oncancel");
 BA.debugLineNum = 443;BA.debugLine="Sub dia_onCancel()";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 444;BA.debugLine="Log($\"onCancel()\"$)";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("onCancel()"))));
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia_onclick(RemoteObject _button,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("dia_onClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,446);
if (RapidSub.canDelegate("dia_onclick")) return main.remoteMe.runUserSub(false, "main","dia_onclick", _button, _index);
Debug.locals.put("Button", _button);
Debug.locals.put("index", _index);
 BA.debugLineNum = 446;BA.debugLine="Sub dia_onClick(Button As Int, index As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 448;BA.debugLine="If Button=-1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_button,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 450;BA.debugLine="kvst.DeleteAll";
Debug.ShouldStop(2);
main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_deleteall");
 BA.debugLineNum = 452;BA.debugLine="mathlist.Clear";
Debug.ShouldStop(8);
main.mostCurrent._mathlist.runVoidMethod ("Clear");
 BA.debugLineNum = 453;BA.debugLine="Activity.Invalidate";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("Invalidate");
 };
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("dia_onDismiss (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,456);
if (RapidSub.canDelegate("dia_ondismiss")) return main.remoteMe.runUserSub(false, "main","dia_ondismiss");
 BA.debugLineNum = 456;BA.debugLine="Sub dia_onDismiss()";
Debug.ShouldStop(128);
 BA.debugLineNum = 457;BA.debugLine="Log($\"onDismiss()\"$)";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("onDismiss()"))));
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia_onitemclick(RemoteObject _index,RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("dia_onItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,459);
if (RapidSub.canDelegate("dia_onitemclick")) return main.remoteMe.runUserSub(false, "main","dia_onitemclick", _index, _selected);
Debug.locals.put("index", _index);
Debug.locals.put("selected", _selected);
 BA.debugLineNum = 459;BA.debugLine="Sub dia_onItemClick(index As Int,selected As Boole";
Debug.ShouldStop(1024);
 BA.debugLineNum = 460;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("onItemClick("),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_index))),RemoteObject.createImmutable(","),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selected))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 461;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia_onkey(RemoteObject _key,RemoteObject _keyevent) throws Exception{
try {
		Debug.PushSubsStack("dia_onKey (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,462);
if (RapidSub.canDelegate("dia_onkey")) return main.remoteMe.runUserSub(false, "main","dia_onkey", _key, _keyevent);
Debug.locals.put("key", _key);
Debug.locals.put("keyevent", _keyevent);
 BA.debugLineNum = 462;BA.debugLine="Sub dia_onKey(key As Int, keyevent As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia2_onclick(RemoteObject _button,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("dia2_onClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,465);
if (RapidSub.canDelegate("dia2_onclick")) return main.remoteMe.runUserSub(false, "main","dia2_onclick", _button, _index);
Debug.locals.put("Button", _button);
Debug.locals.put("index", _index);
 BA.debugLineNum = 465;BA.debugLine="Sub dia2_onClick(Button As Int, index As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia2_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("dia2_onDismiss (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,469);
if (RapidSub.canDelegate("dia2_ondismiss")) return main.remoteMe.runUserSub(false, "main","dia2_ondismiss");
 BA.debugLineNum = 469;BA.debugLine="Sub dia2_onDismiss()";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 470;BA.debugLine="Log($\"onDismiss()\"$)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("onDismiss()"))));
 BA.debugLineNum = 471;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia2_onitemclick(RemoteObject _index,RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("dia2_onItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,472);
if (RapidSub.canDelegate("dia2_onitemclick")) return main.remoteMe.runUserSub(false, "main","dia2_onitemclick", _index, _selected);
Debug.locals.put("index", _index);
Debug.locals.put("selected", _selected);
 BA.debugLineNum = 472;BA.debugLine="Sub dia2_onItemClick(index As Int,selected As Bool";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 473;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("onItemClick("),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_index))),RemoteObject.createImmutable(","),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selected))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 474;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia2_onkey(RemoteObject _key,RemoteObject _keyevent) throws Exception{
try {
		Debug.PushSubsStack("dia2_onKey (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,475);
if (RapidSub.canDelegate("dia2_onkey")) return main.remoteMe.runUserSub(false, "main","dia2_onkey", _key, _keyevent);
Debug.locals.put("key", _key);
Debug.locals.put("keyevent", _keyevent);
 BA.debugLineNum = 475;BA.debugLine="Sub dia2_onKey(key As Int, keyevent As Int)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia3_onclick(RemoteObject _button,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("dia3_onClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,478);
if (RapidSub.canDelegate("dia3_onclick")) return main.remoteMe.runUserSub(false, "main","dia3_onclick", _button, _index);
Debug.locals.put("Button", _button);
Debug.locals.put("index", _index);
 BA.debugLineNum = 478;BA.debugLine="Sub dia3_onClick(Button As Int, index As Int)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 479;BA.debugLine="Log($\"onClick()\"$)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("onClick()"))));
 BA.debugLineNum = 481;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia3_ondismiss() throws Exception{
try {
		Debug.PushSubsStack("dia3_onDismiss (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,483);
if (RapidSub.canDelegate("dia3_ondismiss")) return main.remoteMe.runUserSub(false, "main","dia3_ondismiss");
 BA.debugLineNum = 483;BA.debugLine="Sub dia3_onDismiss()";
Debug.ShouldStop(4);
 BA.debugLineNum = 484;BA.debugLine="Log($\"onDismiss()\"$)";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("onDismiss()"))));
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia3_onitemclick(RemoteObject _index,RemoteObject _selected) throws Exception{
try {
		Debug.PushSubsStack("dia3_onItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,486);
if (RapidSub.canDelegate("dia3_onitemclick")) return main.remoteMe.runUserSub(false, "main","dia3_onitemclick", _index, _selected);
Debug.locals.put("index", _index);
Debug.locals.put("selected", _selected);
 BA.debugLineNum = 486;BA.debugLine="Sub dia3_onItemClick(index As Int,selected As Bool";
Debug.ShouldStop(32);
 BA.debugLineNum = 487;BA.debugLine="Log($\"onItemClick(${index},${selected})\"$)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("onItemClick("),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_index))),RemoteObject.createImmutable(","),main.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selected))),RemoteObject.createImmutable(")")))));
 BA.debugLineNum = 488;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dia3_onkey(RemoteObject _key,RemoteObject _keyevent) throws Exception{
try {
		Debug.PushSubsStack("dia3_onKey (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,489);
if (RapidSub.canDelegate("dia3_onkey")) return main.remoteMe.runUserSub(false, "main","dia3_onkey", _key, _keyevent);
Debug.locals.put("key", _key);
Debug.locals.put("keyevent", _keyevent);
 BA.debugLineNum = 489;BA.debugLine="Sub dia3_onKey(key As Int, keyevent As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _end_scan() throws Exception{
try {
		Debug.PushSubsStack("end_scan (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,362);
if (RapidSub.canDelegate("end_scan")) return main.remoteMe.runUserSub(false, "main","end_scan");
RemoteObject _sum = RemoteObject.createImmutable(0);
int _g = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 362;BA.debugLine="Sub end_scan";
Debug.ShouldStop(512);
 BA.debugLineNum = 363;BA.debugLine="Dim sum As Int=0";
Debug.ShouldStop(1024);
_sum = BA.numberCast(int.class, 0);Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 364;BA.debugLine="For  g=0 To  tmp.Size-1";
Debug.ShouldStop(2048);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._tmp.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_g = 0 ; (step2 > 0 && _g <= limit2) || (step2 < 0 && _g >= limit2); _g = ((int)(0 + _g + step2)) ) {
Debug.locals.put("g", _g);
 BA.debugLineNum = 365;BA.debugLine="sum=sum+g";
Debug.ShouldStop(4096);
_sum = RemoteObject.solve(new RemoteObject[] {_sum,RemoteObject.createImmutable(_g)}, "+",1, 1);Debug.locals.put("sum", _sum);
 }
}Debug.locals.put("g", _g);
;
 BA.debugLineNum = 368;BA.debugLine="cinfo.AddView(lw3,10dip,0dip,70%x,55%y)";
Debug.ShouldStop(32768);
main.mostCurrent._cinfo.runVoidMethod ("AddView",(Object)((main.mostCurrent._lw3.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)))),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 55)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 369;BA.debugLine="Dim res As Int";
Debug.ShouldStop(65536);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 370;BA.debugLine="cinfo.Show(\"Clean?:\",\"Clean\",\"Cancel\",\"\",LoadBitm";
Debug.ShouldStop(131072);
main.mostCurrent._cinfo.runMethodAndSync(true,"Show",(Object)(BA.ObjectToString("Clean?:")),(Object)(BA.ObjectToString("Clean")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),main.mostCurrent.activityBA,(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("warning_38x38.png"))).getObject())));
 BA.debugLineNum = 371;BA.debugLine="If cinfo.Response=DialogResponse.POSITIVE Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main.mostCurrent._cinfo.runMethod(true,"getResponse"),BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 373;BA.debugLine="t1.Enabled=True";
Debug.ShouldStop(1048576);
main._t1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 375;BA.debugLine="pg.spin";
Debug.ShouldStop(4194304);
main.mostCurrent._pg.runVoidMethod ("spin");
 }else {
 BA.debugLineNum = 377;BA.debugLine="close_init";
Debug.ShouldStop(16777216);
_close_init();
 };
 BA.debugLineNum = 379;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatfilesize(RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("FormatFileSize (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,418);
if (RapidSub.canDelegate("formatfilesize")) return main.remoteMe.runUserSub(false, "main","formatfilesize", _bytes);
RemoteObject _unit = null;
RemoteObject _po = RemoteObject.createImmutable(0);
RemoteObject _si = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 418;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 420;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
Debug.ShouldStop(8);
_unit = RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString(" Byte"),BA.ObjectToString(" KB"),BA.ObjectToString(" MB"),BA.ObjectToString(" GB"),BA.ObjectToString(" TB"),BA.ObjectToString(" PB"),BA.ObjectToString(" EB"),BA.ObjectToString(" ZB"),RemoteObject.createImmutable(" YB")});Debug.locals.put("Unit", _unit);Debug.locals.put("Unit", _unit);
 BA.debugLineNum = 422;BA.debugLine="If Bytes = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_bytes,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 424;BA.debugLine="Return \"0 Bytes\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString("0 Bytes");
 }else {
 BA.debugLineNum = 428;BA.debugLine="Private Po, Si As Double";
Debug.ShouldStop(2048);
_po = RemoteObject.createImmutable(0);Debug.locals.put("Po", _po);
_si = RemoteObject.createImmutable(0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 429;BA.debugLine="Private I As Int";
Debug.ShouldStop(4096);
_i = RemoteObject.createImmutable(0);Debug.locals.put("I", _i);
 BA.debugLineNum = 431;BA.debugLine="Bytes = Abs(Bytes)";
Debug.ShouldStop(16384);
_bytes = BA.numberCast(float.class, main.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _bytes))));Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 433;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
Debug.ShouldStop(65536);
_i = BA.numberCast(int.class, main.mostCurrent.__c.runMethod(true,"Floor",(Object)(main.mostCurrent.__c.runMethod(true,"Logarithm",(Object)(BA.numberCast(double.class, _bytes)),(Object)(BA.numberCast(double.class, 1024))))));Debug.locals.put("I", _i);
 BA.debugLineNum = 434;BA.debugLine="Po = Power(1024, I)";
Debug.ShouldStop(131072);
_po = main.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, _i)));Debug.locals.put("Po", _po);
 BA.debugLineNum = 435;BA.debugLine="Si = Bytes / Po";
Debug.ShouldStop(262144);
_si = RemoteObject.solve(new RemoteObject[] {_bytes,_po}, "/",0, 0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 437;BA.debugLine="Return NumberFormat(Si, 1, 2) & Unit(I)";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.concat(main.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_si),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))),_unit.getArrayElement(true,_i));
 };
 BA.debugLineNum = 441;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getactivitiesinfo(RemoteObject _package) throws Exception{
try {
		Debug.PushSubsStack("GetActivitiesInfo (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,514);
if (RapidSub.canDelegate("getactivitiesinfo")) return main.remoteMe.runUserSub(false, "main","getactivitiesinfo", _package);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("package", _package);
 BA.debugLineNum = 514;BA.debugLine="Sub GetActivitiesInfo(package As String) As Object";
Debug.ShouldStop(2);
 BA.debugLineNum = 515;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 516;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(8);
_r.setField ("Target",(_r.runMethod(false,"GetContext",main.processBA)));
 BA.debugLineNum = 517;BA.debugLine="r.Target = r.RunMethod(\"getPackageManager\")";
Debug.ShouldStop(16);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPackageManager"))));
 BA.debugLineNum = 518;BA.debugLine="r.Target = r.RunMethod3(\"getPackageInfo\", package";
Debug.ShouldStop(32);
_r.setField ("Target",_r.runMethod(false,"RunMethod3",(Object)(BA.ObjectToString("getPackageInfo")),(Object)(_package),(Object)(BA.ObjectToString("java.lang.String")),(Object)(BA.NumberToString(0x00000001)),(Object)(RemoteObject.createImmutable("java.lang.int"))));
 BA.debugLineNum = 519;BA.debugLine="Return r.GetField(\"applicationInfo\")";
Debug.ShouldStop(64);
if (true) return _r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("applicationInfo")));
 BA.debugLineNum = 520;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfilename(RemoteObject _fullpath) throws Exception{
try {
		Debug.PushSubsStack("GetFileName (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,500);
if (RapidSub.canDelegate("getfilename")) return main.remoteMe.runUserSub(false, "main","getfilename", _fullpath);
Debug.locals.put("FullPath", _fullpath);
 BA.debugLineNum = 500;BA.debugLine="Sub GetFileName(FullPath As String) As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 501;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\"/";
Debug.ShouldStop(1048576);
if (true) return _fullpath.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fullpath.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/"))),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 502;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparentpath(RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("GetParentPath (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,522);
if (RapidSub.canDelegate("getparentpath")) return main.remoteMe.runUserSub(false, "main","getparentpath", _path);
RemoteObject _path1 = RemoteObject.createImmutable("");
Debug.locals.put("Path", _path);
 BA.debugLineNum = 522;BA.debugLine="Sub GetParentPath(Path As String) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 523;BA.debugLine="Dim Path1 As String";
Debug.ShouldStop(1024);
_path1 = RemoteObject.createImmutable("");Debug.locals.put("Path1", _path1);
 BA.debugLineNum = 524;BA.debugLine="If Path = \"/\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_path,BA.ObjectToString("/"))) { 
 BA.debugLineNum = 525;BA.debugLine="Return \"/\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("/");
 };
 BA.debugLineNum = 527;BA.debugLine="L = Path.LastIndexOf(\"/\")";
Debug.ShouldStop(16384);
main.mostCurrent._l = BA.NumberToString(_path.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/"))));
 BA.debugLineNum = 528;BA.debugLine="If L = Path.Length - 1 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent._l,BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_path.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 530;BA.debugLine="Path1 = Path.SubString2(0,L)";
Debug.ShouldStop(131072);
_path1 = _path.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, main.mostCurrent._l)));Debug.locals.put("Path1", _path1);
 }else {
 BA.debugLineNum = 532;BA.debugLine="Path1 = Path";
Debug.ShouldStop(524288);
_path1 = _path;Debug.locals.put("Path1", _path1);
 };
 BA.debugLineNum = 534;BA.debugLine="L = Path.LastIndexOf(\"/\")";
Debug.ShouldStop(2097152);
main.mostCurrent._l = BA.NumberToString(_path.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/"))));
 BA.debugLineNum = 535;BA.debugLine="If L = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._l,BA.NumberToString(0))) { 
 BA.debugLineNum = 536;BA.debugLine="L = 1";
Debug.ShouldStop(8388608);
main.mostCurrent._l = BA.NumberToString(1);
 };
 BA.debugLineNum = 538;BA.debugLine="Return Path1.SubString2(0,L)";
Debug.ShouldStop(33554432);
if (true) return _path1.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, main.mostCurrent._l)));
 BA.debugLineNum = 539;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsourcedir(RemoteObject _appinfo) throws Exception{
try {
		Debug.PushSubsStack("GetSourceDir (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,504);
if (RapidSub.canDelegate("getsourcedir")) return main.remoteMe.runUserSub(false, "main","getsourcedir", _appinfo);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("AppInfo", _appinfo);
 BA.debugLineNum = 504;BA.debugLine="Sub GetSourceDir(AppInfo As Object) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 505;BA.debugLine="Try";
Debug.ShouldStop(16777216);
try { BA.debugLineNum = 506;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(33554432);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 507;BA.debugLine="r.Target = AppInfo";
Debug.ShouldStop(67108864);
_r.setField ("Target",_appinfo);
 BA.debugLineNum = 508;BA.debugLine="Return r.GetField(\"sourceDir\")";
Debug.ShouldStop(134217728);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToString(_r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("sourceDir"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e6.toString()); BA.debugLineNum = 510;BA.debugLine="Return \"\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 512;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 26;BA.debugLine="Dim args(1) As Object";
main.mostCurrent._args = RemoteObject.createNewArray ("Object", new int[] {1}, new Object[]{});
 //BA.debugLineNum = 27;BA.debugLine="Dim Obj1, Obj2, Obj3 As Reflector";
main.mostCurrent._obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
main.mostCurrent._obj2 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
main.mostCurrent._obj3 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");
 //BA.debugLineNum = 28;BA.debugLine="Dim size,flags As Int";
main._size = RemoteObject.createImmutable(0);
main._flags = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="Private name,apath,l,Types(1),packName As String";
main.mostCurrent._name = RemoteObject.createImmutable("");
main.mostCurrent._apath = RemoteObject.createImmutable("");
main.mostCurrent._l = RemoteObject.createImmutable("");
main.mostCurrent._types = RemoteObject.createNewArray ("String", new int[] {1}, new Object[]{});
main.mostCurrent._packname = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Private icon As BitmapDrawable";
main.mostCurrent._icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
 //BA.debugLineNum = 31;BA.debugLine="Private ac As AppCompat";
main.mostCurrent._ac = RemoteObject.createNew ("de.amberhome.objects.appcompat.AppCompatBase");
 //BA.debugLineNum = 32;BA.debugLine="Private Panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private toolbar As ACToolBarLight";
main.mostCurrent._toolbar = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Dim ABHelper As ACActionBar";
main.mostCurrent._abhelper = RemoteObject.createNew ("de.amberhome.objects.appcompat.ACActionBar");
 //BA.debugLineNum = 35;BA.debugLine="Private cb1 As Circlebutton";
main.mostCurrent._cb1 = RemoteObject.createNew ("com.circlebuttonwrapper.CircleButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private mcl As MaterialColors";
main.mostCurrent._mcl = RemoteObject.createNew ("com.tchart.materialcolors.MaterialColors");
 //BA.debugLineNum = 37;BA.debugLine="Private lw3 As ListView";
main.mostCurrent._lw3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private applist,catlist,mathlist As List";
main.mostCurrent._applist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main.mostCurrent._catlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main.mostCurrent._mathlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 39;BA.debugLine="Private pg As pgWheel";
main.mostCurrent._pg = RemoteObject.createNew ("de.donmanfred.pgWheel");
 //BA.debugLineNum = 40;BA.debugLine="Private cinfo As CustomDialog";
main.mostCurrent._cinfo = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");
 //BA.debugLineNum = 41;BA.debugLine="Dim counter As Int";
main._counter = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 42;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim date,time As String";
main.mostCurrent._date = RemoteObject.createImmutable("");
main.mostCurrent._time = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Dim kvst As KeyValueStore";
main.mostCurrent._kvst = RemoteObject.createNew ("com.bcleaner.keyvaluestore");
 //BA.debugLineNum = 45;BA.debugLine="Dim kvsdata As KeyValueStore";
main.mostCurrent._kvsdata = RemoteObject.createNew ("com.bcleaner.keyvaluestore");
 //BA.debugLineNum = 46;BA.debugLine="Dim kvsmat As KeyValueStore";
main.mostCurrent._kvsmat = RemoteObject.createNew ("com.bcleaner.keyvaluestore");
 //BA.debugLineNum = 47;BA.debugLine="Private dia As 	AlertDialogBuilder";
main.mostCurrent._dia = RemoteObject.createNew ("de.donmanfred.AlertDialogBuilder");
 //BA.debugLineNum = 48;BA.debugLine="Private dia2 As 	AlertDialogBuilder";
main.mostCurrent._dia2 = RemoteObject.createNew ("de.donmanfred.AlertDialogBuilder");
 //BA.debugLineNum = 49;BA.debugLine="Private dia3 As 	AlertDialogBuilder";
main.mostCurrent._dia3 = RemoteObject.createNew ("de.donmanfred.AlertDialogBuilder");
 //BA.debugLineNum = 50;BA.debugLine="Private shader As BitmapDrawable";
main.mostCurrent._shader = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
 //BA.debugLineNum = 51;BA.debugLine="Dim draw As JavaObject";
main.mostCurrent._draw = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
 //BA.debugLineNum = 52;BA.debugLine="Dim tmp As List";
main.mostCurrent._tmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 53;BA.debugLine="Private Panel2 As Panel";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private Label2 As Label";
main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private Label3 As Label";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private storage As MLfiles";
main.mostCurrent._storage = RemoteObject.createNew ("MLfiles.Fileslib.MLfiles");
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _inf_click() throws Exception{
try {
		Debug.PushSubsStack("inf_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,222);
if (RapidSub.canDelegate("inf_click")) return main.remoteMe.runUserSub(false, "main","inf_click");
RemoteObject _ic = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _id = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _read = RemoteObject.createImmutable("");
RemoteObject _logcat = RemoteObject.createImmutable("");
RemoteObject _lg = RemoteObject.createImmutable("");
 BA.debugLineNum = 222;BA.debugLine="Sub inf_click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim ic,id As BitmapDrawable";
Debug.ShouldStop(1073741824);
_ic = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("ic", _ic);
_id = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("id", _id);
 BA.debugLineNum = 224;BA.debugLine="ic.Initialize(LoadBitmap(File.DirAssets,\"add-3.pn";
Debug.ShouldStop(-2147483648);
_ic.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("add-3.png"))).getObject())));
 BA.debugLineNum = 225;BA.debugLine="id.Initialize(LoadBitmap(File.DirAssets,\"add-3.pn";
Debug.ShouldStop(1);
_id.runVoidMethod ("Initialize",(Object)((main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("add-3.png"))).getObject())));
 BA.debugLineNum = 226;BA.debugLine="Dim read As String";
Debug.ShouldStop(2);
_read = RemoteObject.createImmutable("");Debug.locals.put("read", _read);
 BA.debugLineNum = 227;BA.debugLine="For Each logcat As String In kvst.ListKeys";
Debug.ShouldStop(4);
final RemoteObject group5 = main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_listkeys");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get();
for (int index5 = 0;index5 < groupLen5 ;index5++){
_logcat = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("logcat", _logcat);
Debug.locals.put("logcat", _logcat);
 }
Debug.locals.put("logcat", _logcat);
;
 BA.debugLineNum = 230;BA.debugLine="dia.setIcon2(id).create";
Debug.ShouldStop(32);
main.mostCurrent._dia.runMethod(false,"setIcon2",(Object)((_id.getObject()))).runVoidMethod ("create");
 BA.debugLineNum = 231;BA.debugLine="For Each lg As String In kvst.ListKeys";
Debug.ShouldStop(64);
final RemoteObject group8 = main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_listkeys");
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
for (int index8 = 0;index8 < groupLen8 ;index8++){
_lg = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("lg", _lg);
Debug.locals.put("lg", _lg);
 BA.debugLineNum = 232;BA.debugLine="read=kvst.GetSimple(lg)";
Debug.ShouldStop(128);
_read = main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_getsimple",(Object)(_lg));Debug.locals.put("read", _read);
 }
Debug.locals.put("lg", _lg);
;
 BA.debugLineNum = 234;BA.debugLine="dia.setCancelable(True).setNegativeButton(\"Clear\"";
Debug.ShouldStop(512);
main.mostCurrent._dia.runMethod(false,"setCancelable",(Object)(main.mostCurrent.__c.getField(true,"True"))).runMethod(false,"setNegativeButton",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Clear")))).runMethod(false,"setNeutralButton",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Ok")))).runMethod(false,"setTitle",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Event log:")))).runMethod(false,"setMultiChoiceItems",(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_getsimple",(Object)(_logcat))})),(Object)((main.mostCurrent.__c.getField(false,"Null")))).runVoidMethod ("show");
 BA.debugLineNum = 235;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _kvs_read() throws Exception{
try {
		Debug.PushSubsStack("kvs_read (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,173);
if (RapidSub.canDelegate("kvs_read")) return main.remoteMe.runUserSub(false, "main","kvs_read");
RemoteObject _si = RemoteObject.createImmutable(0);
RemoteObject _exi = RemoteObject.createImmutable(0);
RemoteObject _ini = RemoteObject.createImmutable(0);
RemoteObject _sd = RemoteObject.createImmutable("");
RemoteObject _exd = RemoteObject.createImmutable("");
RemoteObject _inter = RemoteObject.createImmutable("");
RemoteObject _mount = RemoteObject.createImmutable("");
RemoteObject _math = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0f);
RemoteObject _read = RemoteObject.createImmutable("");
RemoteObject _dread = RemoteObject.createImmutable("");
RemoteObject _logcat = RemoteObject.createImmutable("");
RemoteObject _da1 = RemoteObject.createImmutable("");
RemoteObject _sum = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
 BA.debugLineNum = 173;BA.debugLine="Sub kvs_read";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Dim si,exi,ini As Int";
Debug.ShouldStop(8192);
_si = RemoteObject.createImmutable(0);Debug.locals.put("si", _si);
_exi = RemoteObject.createImmutable(0);Debug.locals.put("exi", _exi);
_ini = RemoteObject.createImmutable(0);Debug.locals.put("ini", _ini);
 BA.debugLineNum = 175;BA.debugLine="Dim sd,exd,inter,mount As String";
Debug.ShouldStop(16384);
_sd = RemoteObject.createImmutable("");Debug.locals.put("sd", _sd);
_exd = RemoteObject.createImmutable("");Debug.locals.put("exd", _exd);
_inter = RemoteObject.createImmutable("");Debug.locals.put("inter", _inter);
_mount = RemoteObject.createImmutable("");Debug.locals.put("mount", _mount);
 BA.debugLineNum = 176;BA.debugLine="sd=storage.Sdcard";
Debug.ShouldStop(32768);
_sd = main.mostCurrent._storage.runMethod(true,"Sdcard");Debug.locals.put("sd", _sd);
 BA.debugLineNum = 177;BA.debugLine="exd=storage.SdcardReady";
Debug.ShouldStop(65536);
_exd = main.mostCurrent._storage.runMethod(true,"SdcardReady");Debug.locals.put("exd", _exd);
 BA.debugLineNum = 178;BA.debugLine="inter=os.TotalInternalMemorySize";
Debug.ShouldStop(131072);
_inter = BA.NumberToString(main._os.runMethod(true,"getTotalInternalMemorySize"));Debug.locals.put("inter", _inter);
 BA.debugLineNum = 179;BA.debugLine="ini=inter";
Debug.ShouldStop(262144);
_ini = BA.numberCast(int.class, _inter);Debug.locals.put("ini", _ini);
 BA.debugLineNum = 180;BA.debugLine="mount=storage.SdcardReady";
Debug.ShouldStop(524288);
_mount = main.mostCurrent._storage.runMethod(true,"SdcardReady");Debug.locals.put("mount", _mount);
 BA.debugLineNum = 181;BA.debugLine="If exd=\"mounted\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_exd,BA.ObjectToString("mounted"))) { 
 BA.debugLineNum = 182;BA.debugLine="Label3.Text=storage.GetDiskstats(sd)";
Debug.ShouldStop(2097152);
main.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._storage.runMethod(true,"GetDiskstats",(Object)(_sd))));
 }else {
 BA.debugLineNum = 184;BA.debugLine="Label2.Text=storage.GetDiskstats(File.DirRootExt";
Debug.ShouldStop(8388608);
main.mostCurrent._label2.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._storage.runMethod(true,"GetDiskstats",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirRootExternal")))));
 BA.debugLineNum = 185;BA.debugLine="Label3.text=\"Total Apps cleaned: \"&catlist.Get(0";
Debug.ShouldStop(16777216);
main.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Total Apps cleaned: "),main.mostCurrent._catlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));
 };
 BA.debugLineNum = 187;BA.debugLine="Dim math As Int";
Debug.ShouldStop(67108864);
_math = RemoteObject.createImmutable(0);Debug.locals.put("math", _math);
 BA.debugLineNum = 188;BA.debugLine="Dim result As Float";
Debug.ShouldStop(134217728);
_result = RemoteObject.createImmutable(0f);Debug.locals.put("result", _result);
 BA.debugLineNum = 189;BA.debugLine="Dim read,dread As String";
Debug.ShouldStop(268435456);
_read = RemoteObject.createImmutable("");Debug.locals.put("read", _read);
_dread = RemoteObject.createImmutable("");Debug.locals.put("dread", _dread);
 BA.debugLineNum = 190;BA.debugLine="For Each logcat As String In kvst.ListKeys";
Debug.ShouldStop(536870912);
final RemoteObject group17 = main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_listkeys");
final int groupLen17 = group17.runMethod(true,"getSize").<Integer>get();
for (int index17 = 0;index17 < groupLen17 ;index17++){
_logcat = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("logcat", _logcat);
Debug.locals.put("logcat", _logcat);
 BA.debugLineNum = 191;BA.debugLine="read=kvst.GetSimple(logcat)";
Debug.ShouldStop(1073741824);
_read = main.mostCurrent._kvst.runClassMethod (com.bcleaner.keyvaluestore.class, "_getsimple",(Object)(_logcat));Debug.locals.put("read", _read);
 }
Debug.locals.put("logcat", _logcat);
;
 BA.debugLineNum = 194;BA.debugLine="Dim da1 As String";
Debug.ShouldStop(2);
_da1 = RemoteObject.createImmutable("");Debug.locals.put("da1", _da1);
 BA.debugLineNum = 195;BA.debugLine="mathlist.Clear";
Debug.ShouldStop(4);
main.mostCurrent._mathlist.runVoidMethod ("Clear");
 BA.debugLineNum = 196;BA.debugLine="Dim sum As Int =  0";
Debug.ShouldStop(8);
_sum = BA.numberCast(int.class, 0);Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 197;BA.debugLine="For Each d As Double In kvsmat.ListKeys";
Debug.ShouldStop(16);
final RemoteObject group23 = main.mostCurrent._kvsmat.runClassMethod (com.bcleaner.keyvaluestore.class, "_listkeys");
final int groupLen23 = group23.runMethod(true,"getSize").<Integer>get();
for (int index23 = 0;index23 < groupLen23 ;index23++){
_d = BA.numberCast(double.class, group23.runMethod(false,"Get",index23));Debug.locals.put("d", _d);
Debug.locals.put("d", _d);
 BA.debugLineNum = 198;BA.debugLine="mathlist.Add(d)";
Debug.ShouldStop(32);
main.mostCurrent._mathlist.runVoidMethod ("Add",(Object)((_d)));
 BA.debugLineNum = 199;BA.debugLine="sum =sum +d";
Debug.ShouldStop(64);
_sum = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_sum,_d}, "+",1, 0));Debug.locals.put("sum", _sum);
 }
Debug.locals.put("d", _d);
;
 BA.debugLineNum = 201;BA.debugLine="Label1.Text=\"Total \"&FormatFileSize(sum)&\" cleane";
Debug.ShouldStop(256);
main.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Total "),_formatfilesize(BA.numberCast(float.class, _sum)),RemoteObject.createImmutable(" cleaned!"))));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lv1_ItemClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,382);
if (RapidSub.canDelegate("lv1_itemclick")) return main.remoteMe.runUserSub(false, "main","lv1_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 382;BA.debugLine="Sub lv1_ItemClick (Position As Int, Value As Objec";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 383;BA.debugLine="If Value=Position Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_value,(_position))) { 
 BA.debugLineNum = 384;BA.debugLine="inf_click";
Debug.ShouldStop(-2147483648);
_inf_click();
 };
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lv1_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("lv1_ItemLongClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,388);
if (RapidSub.canDelegate("lv1_itemlongclick")) return main.remoteMe.runUserSub(false, "main","lv1_itemlongclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 388;BA.debugLine="Sub lv1_ItemLongClick (Position As Int, Value As O";
Debug.ShouldStop(8);
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mean(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("mean (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,204);
if (RapidSub.canDelegate("mean")) return main.remoteMe.runUserSub(false, "main","mean", _data);
RemoteObject _sum = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("data", _data);
 BA.debugLineNum = 204;BA.debugLine="Sub mean(data As List) As Double";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="Dim sum As Int  = 0";
Debug.ShouldStop(4096);
_sum = BA.numberCast(int.class, 0);Debug.locals.put("sum", _sum);Debug.locals.put("sum", _sum);
 BA.debugLineNum = 206;BA.debugLine="For Each x As Double In data";
Debug.ShouldStop(8192);
final RemoteObject group2 = _data;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get();
for (int index2 = 0;index2 < groupLen2 ;index2++){
_x = BA.numberCast(double.class, group2.runMethod(false,"Get",index2));Debug.locals.put("x", _x);
Debug.locals.put("x", _x);
 BA.debugLineNum = 207;BA.debugLine="sum = sum + x";
Debug.ShouldStop(16384);
_sum = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_sum,_x}, "+",1, 0));Debug.locals.put("sum", _sum);
 }
Debug.locals.put("x", _x);
;
 BA.debugLineNum = 209;BA.debugLine="Return sum";
Debug.ShouldStop(65536);
if (true) return BA.numberCast(double.class, _sum);
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pg_onclick(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("pg_onClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,414);
if (RapidSub.canDelegate("pg_onclick")) return main.remoteMe.runUserSub(false, "main","pg_onclick", _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 414;BA.debugLine="Sub pg_onClick(value As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
setanimation_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.bcleaner.main");
starter.myClass = BA.getDeviceClass ("com.bcleaner.starter");
keyvaluestore.myClass = BA.getDeviceClass ("com.bcleaner.keyvaluestore");
clschecklist.myClass = BA.getDeviceClass ("com.bcleaner.clschecklist");
clsexplorer.myClass = BA.getDeviceClass ("com.bcleaner.clsexplorer");
setanimation.myClass = BA.getDeviceClass ("com.bcleaner.setanimation");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private pak As PackageManager";
main._pak = RemoteObject.createNew ("anywheresoftware.b4a.phone.PackageManagerWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim cc As CacheCleaner";
main._cc = RemoteObject.createNew ("anywheresoftware.b4a.cachecleaner.CacheCleaner");
 //BA.debugLineNum = 21;BA.debugLine="Dim t1 As Timer";
main._t1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 22;BA.debugLine="Private os As OperatingSystem";
main._os = RemoteObject.createNew ("com.rootsoft.oslibrary.OSLibrary");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _scan_start() throws Exception{
try {
		Debug.PushSubsStack("scan_start (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,246);
if (RapidSub.canDelegate("scan_start")) return main.remoteMe.runUserSub(false, "main","scan_start");
 BA.debugLineNum = 246;BA.debugLine="Sub scan_start";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 248;BA.debugLine="cc.ScanCache";
Debug.ShouldStop(8388608);
main._cc.runVoidMethod ("ScanCache");
 BA.debugLineNum = 249;BA.debugLine="ToastMessageShow(\"scan started\",False)";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("scan started")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _t1_tick() throws Exception{
try {
		Debug.PushSubsStack("t1_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,278);
if (RapidSub.canDelegate("t1_tick")) return main.remoteMe.runUserSub(false, "main","t1_tick");
 BA.debugLineNum = 278;BA.debugLine="Sub t1_Tick";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="counter=counter+1";
Debug.ShouldStop(4194304);
main._counter = RemoteObject.solve(new RemoteObject[] {main._counter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 280;BA.debugLine="If counter>0 Then cc.CleanCache";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",main._counter,BA.numberCast(double.class, 0))) { 
main._cc.runVoidMethod ("CleanCache");};
 BA.debugLineNum = 281;BA.debugLine="If counter = 2 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main._counter,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 282;BA.debugLine="t1.Enabled=False";
Debug.ShouldStop(33554432);
main._t1.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 283;BA.debugLine="counter=0";
Debug.ShouldStop(67108864);
main._counter = BA.numberCast(int.class, 0);
 BA.debugLineNum = 284;BA.debugLine="cb1.ImageBitmap=Null";
Debug.ShouldStop(134217728);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.getField(false,"Null")));
 BA.debugLineNum = 285;BA.debugLine="cb1.ImageBitmap=LoadBitmap(File.DirAssets,\"boost";
Debug.ShouldStop(268435456);
main.mostCurrent._cb1.runVoidMethod ("setImageBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("boost.png"))).getObject()));
 BA.debugLineNum = 286;BA.debugLine="cb1.ButtonColor=Colors.ARGB(255,14,136,244)";
Debug.ShouldStop(536870912);
main.mostCurrent._cb1.runVoidMethod ("setButtonColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 287;BA.debugLine="Label1.TextColor=Colors.ARGB(255,14,136,244)";
Debug.ShouldStop(1073741824);
main.mostCurrent._label1.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 14)),(Object)(BA.numberCast(int.class, 136)),(Object)(BA.numberCast(int.class, 244))));
 BA.debugLineNum = 288;BA.debugLine="close_init";
Debug.ShouldStop(-2147483648);
_close_init();
 };
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _variance(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("variance (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,212);
if (RapidSub.canDelegate("variance")) return main.remoteMe.runUserSub(false, "main","variance", _data);
RemoteObject _sum = RemoteObject.createImmutable(0);
RemoteObject _sum_sqr = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("data", _data);
 BA.debugLineNum = 212;BA.debugLine="Sub variance(data As List) As Double";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Dim  Sum As Double = 0";
Debug.ShouldStop(1048576);
_sum = BA.numberCast(double.class, 0);Debug.locals.put("Sum", _sum);Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 214;BA.debugLine="Dim  Sum_sqr As Double = 0";
Debug.ShouldStop(2097152);
_sum_sqr = BA.numberCast(double.class, 0);Debug.locals.put("Sum_sqr", _sum_sqr);Debug.locals.put("Sum_sqr", _sum_sqr);
 BA.debugLineNum = 215;BA.debugLine="For Each x As Double In data";
Debug.ShouldStop(4194304);
final RemoteObject group3 = _data;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get();
for (int index3 = 0;index3 < groupLen3 ;index3++){
_x = BA.numberCast(double.class, group3.runMethod(false,"Get",index3));Debug.locals.put("x", _x);
Debug.locals.put("x", _x);
 BA.debugLineNum = 216;BA.debugLine="Sum = Sum + x";
Debug.ShouldStop(8388608);
_sum = RemoteObject.solve(new RemoteObject[] {_sum,_x}, "+",1, 0);Debug.locals.put("Sum", _sum);
 BA.debugLineNum = 217;BA.debugLine="Sum_sqr = Sum_sqr + x'*x";
Debug.ShouldStop(16777216);
_sum_sqr = RemoteObject.solve(new RemoteObject[] {_sum_sqr,_x}, "+",1, 0);Debug.locals.put("Sum_sqr", _sum_sqr);
 }
Debug.locals.put("x", _x);
;
 BA.debugLineNum = 219;BA.debugLine="Return (Sum_sqr - (Sum+Sum)/data.Size)/data.size";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_sum_sqr,(RemoteObject.solve(new RemoteObject[] {_sum,_sum}, "+",1, 0)),_data.runMethod(true,"getSize")}, "-/",1, 0)),_data.runMethod(true,"getSize")}, "/",0, 0);
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}