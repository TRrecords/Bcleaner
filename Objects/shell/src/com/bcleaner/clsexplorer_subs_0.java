package com.bcleaner;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsexplorer_subs_0 {


public static RemoteObject  _addentry(RemoteObject __ref,RemoteObject _id,RemoteObject _text1,RemoteObject _text2,RemoteObject _withcheckbox) throws Exception{
try {
		Debug.PushSubsStack("AddEntry (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("addentry")) return __ref.runUserSub(false, "clsexplorer","addentry", __ref, _id, _text1, _text2, _withcheckbox);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _margin = RemoteObject.createImmutable(0);
RemoteObject _posx = RemoteObject.createImmutable(0);
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _largeurlabel = RemoteObject.createImmutable(0);
RemoteObject _lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("ID", _id);
Debug.locals.put("Text1", _text1);
Debug.locals.put("Text2", _text2);
Debug.locals.put("WithCheckbox", _withcheckbox);
 BA.debugLineNum = 108;BA.debugLine="Private Sub AddEntry(ID As Int, Text1 As String, T";
Debug.ShouldStop(2048);
 BA.debugLineNum = 109;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
Debug.ShouldStop(4096);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 109;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
Debug.ShouldStop(4096);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 110;BA.debugLine="Dim Margin As Int: Margin = 5dip";
Debug.ShouldStop(8192);
_margin = RemoteObject.createImmutable(0);Debug.locals.put("Margin", _margin);
 BA.debugLineNum = 110;BA.debugLine="Dim Margin As Int: Margin = 5dip";
Debug.ShouldStop(8192);
_margin = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)));Debug.locals.put("Margin", _margin);
 BA.debugLineNum = 111;BA.debugLine="Dim PosX As Int: PosX = Margin";
Debug.ShouldStop(16384);
_posx = RemoteObject.createImmutable(0);Debug.locals.put("PosX", _posx);
 BA.debugLineNum = 111;BA.debugLine="Dim PosX As Int: PosX = Margin";
Debug.ShouldStop(16384);
_posx = _margin;Debug.locals.put("PosX", _posx);
 BA.debugLineNum = 113;BA.debugLine="Dim chk As CheckBox";
Debug.ShouldStop(65536);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chk", _chk);
 BA.debugLineNum = 114;BA.debugLine="If WithCheckbox Then";
Debug.ShouldStop(131072);
if (_withcheckbox.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 115;BA.debugLine="chk.Initialize(\"lstMulti\")";
Debug.ShouldStop(262144);
_chk.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lstMulti")));
 BA.debugLineNum = 116;BA.debugLine="pnl.AddView(chk, PosX, 0, 40dip, itemHeight)";
Debug.ShouldStop(524288);
_pnl.runVoidMethod ("AddView",(Object)((_chk.getObject())),(Object)(_posx),(Object)(BA.numberCast(int.class, 0)),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(__ref.getField(true,"_itemheight")));
 BA.debugLineNum = 117;BA.debugLine="PosX = chk.Width + chk.Left";
Debug.ShouldStop(1048576);
_posx = RemoteObject.solve(new RemoteObject[] {_chk.runMethod(true,"getWidth"),_chk.runMethod(true,"getLeft")}, "+",1, 1);Debug.locals.put("PosX", _posx);
 };
 BA.debugLineNum = 120;BA.debugLine="Dim LargeurLabel As Int";
Debug.ShouldStop(8388608);
_largeurlabel = RemoteObject.createImmutable(0);Debug.locals.put("LargeurLabel", _largeurlabel);
 BA.debugLineNum = 121;BA.debugLine="LargeurLabel = svFichiers.Width - PosX - Margin";
Debug.ShouldStop(16777216);
_largeurlabel = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svfichiers").runMethod(true,"getWidth"),_posx,_margin}, "--",2, 1);Debug.locals.put("LargeurLabel", _largeurlabel);
 BA.debugLineNum = 122;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
Debug.ShouldStop(33554432);
_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl1", _lbl1);
 BA.debugLineNum = 122;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
Debug.ShouldStop(33554432);
_lbl1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 123;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(67108864);
_lbl1.runMethod(true,"setGravity",clsexplorer.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 124;BA.debugLine="lbl1.Text = Text1";
Debug.ShouldStop(134217728);
_lbl1.runMethod(true,"setText",BA.ObjectToCharSequence(_text1));
 BA.debugLineNum = 125;BA.debugLine="lbl1.TextSize = 18";
Debug.ShouldStop(268435456);
_lbl1.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 126;BA.debugLine="If Text2 = \"\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_text2,BA.ObjectToString(""))) { 
 BA.debugLineNum = 128;BA.debugLine="lbl1.TextColor = FolderTextColor";
Debug.ShouldStop(-2147483648);
_lbl1.runMethod(true,"setTextColor",__ref.getField(true,"_foldertextcolor"));
 BA.debugLineNum = 129;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1);
_lbl1.runMethod(false,"setTypeface",clsexplorer.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 130;BA.debugLine="pnl.AddView(lbl1, PosX, 2dip, LargeurLabel, item";
Debug.ShouldStop(2);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(_posx),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(_largeurlabel),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemheight"),clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "-",1, 1)));
 }else {
 BA.debugLineNum = 133;BA.debugLine="lbl1.TextColor = FileTextColor1";
Debug.ShouldStop(16);
_lbl1.runMethod(true,"setTextColor",__ref.getField(true,"_filetextcolor1"));
 BA.debugLineNum = 134;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(32);
_lbl1.runMethod(false,"setTypeface",clsexplorer.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 135;BA.debugLine="pnl.AddView(lbl1, PosX, 2dip, LargeurLabel, Bit.";
Debug.ShouldStop(64);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(_posx),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))),(Object)(_largeurlabel),(Object)(clsexplorer.__c.getField(false,"Bit").runMethod(true,"ShiftRight",(Object)(__ref.getField(true,"_itemheight")),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 137;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
Debug.ShouldStop(256);
_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl2", _lbl2);
 BA.debugLineNum = 137;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
Debug.ShouldStop(256);
_lbl2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 138;BA.debugLine="lbl2.Gravity = Gravity.TOP";
Debug.ShouldStop(512);
_lbl2.runMethod(true,"setGravity",clsexplorer.__c.getField(false,"Gravity").getField(true,"TOP"));
 BA.debugLineNum = 139;BA.debugLine="lbl2.Text = Text2";
Debug.ShouldStop(1024);
_lbl2.runMethod(true,"setText",BA.ObjectToCharSequence(_text2));
 BA.debugLineNum = 140;BA.debugLine="lbl2.TextColor = FileTextColor2";
Debug.ShouldStop(2048);
_lbl2.runMethod(true,"setTextColor",__ref.getField(true,"_filetextcolor2"));
 BA.debugLineNum = 141;BA.debugLine="lbl2.TextSize = 14";
Debug.ShouldStop(4096);
_lbl2.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 142;BA.debugLine="lbl2.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(8192);
_lbl2.runMethod(false,"setTypeface",clsexplorer.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 143;BA.debugLine="pnl.AddView(lbl2, PosX, lbl1.Top + lbl1.Height,";
Debug.ShouldStop(16384);
_pnl.runVoidMethod ("AddView",(Object)((_lbl2.getObject())),(Object)(_posx),(Object)(RemoteObject.solve(new RemoteObject[] {_lbl1.runMethod(true,"getTop"),_lbl1.runMethod(true,"getHeight")}, "+",1, 1)),(Object)(_largeurlabel),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemheight"),_lbl1.runMethod(true,"getTop"),_lbl1.runMethod(true,"getHeight")}, "--",2, 1)));
 };
 BA.debugLineNum = 146;BA.debugLine="If Ellipsis Then";
Debug.ShouldStop(131072);
if (__ref.getField(true,"_ellipsis").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 147;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(262144);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 148;BA.debugLine="r.Target = lbl1";
Debug.ShouldStop(524288);
_r.setField ("Target",(_lbl1.getObject()));
 BA.debugLineNum = 149;BA.debugLine="r.RunMethod2(\"setLines\", 1, \"java.lang.int\")";
Debug.ShouldStop(1048576);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setLines")),(Object)(BA.NumberToString(1)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 150;BA.debugLine="r.RunMethod2(\"setHorizontallyScrolling\", True, \"";
Debug.ShouldStop(2097152);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setHorizontallyScrolling")),(Object)(BA.ObjectToString(clsexplorer.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 151;BA.debugLine="r.RunMethod2(\"setEllipsize\", \"MIDDLE\", \"android.";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setEllipsize")),(Object)(BA.ObjectToString("MIDDLE")),(Object)(RemoteObject.createImmutable("android.text.TextUtils$TruncateAt")));
 };
 BA.debugLineNum = 154;BA.debugLine="lstFichiers.AddCustomItem(ID, pnl, itemHeight)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lstfichiers").runClassMethod (com.bcleaner.clschecklist.class, "_addcustomitem",(Object)((_id)),(Object)(_pnl),(Object)(__ref.getField(true,"_itemheight")));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
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
public static RemoteObject  _afficherimage(RemoteObject __ref,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("AfficherImage (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("afficherimage")) return __ref.runUserSub(false, "clsexplorer","afficherimage", __ref, _image);
RemoteObject _marge = RemoteObject.createImmutable(0);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _ratiobmp = RemoteObject.createImmutable(0f);
RemoteObject _ratioimg = RemoteObject.createImmutable(0f);
RemoteObject _diviseur = RemoteObject.createImmutable(0f);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("Image", _image);
 BA.debugLineNum = 495;BA.debugLine="Private Sub AfficherImage(Image As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 496;BA.debugLine="Dim Marge As Int: Marge = 2dip";
Debug.ShouldStop(32768);
_marge = RemoteObject.createImmutable(0);Debug.locals.put("Marge", _marge);
 BA.debugLineNum = 496;BA.debugLine="Dim Marge As Int: Marge = 2dip";
Debug.ShouldStop(32768);
_marge = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Marge", _marge);
 BA.debugLineNum = 497;BA.debugLine="pnlVisu.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlvisu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 498;BA.debugLine="pnlVisu.Color = Colors.Transparent";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlvisu").runVoidMethod ("setColor",clsexplorer.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 499;BA.debugLine="ivVisu.Initialize(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_ivvisu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 500;BA.debugLine="pnlVisu.AddView(ivVisu, 0, 0, pnlFiles.Width - (2";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlvisu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_ivvisu").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1))}, "-",1, 1)));
 BA.debugLineNum = 501;BA.debugLine="lblVisu.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblvisu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 502;BA.debugLine="lblVisu.Text = \"Please wait...\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblvisu").runMethod(true,"setText",BA.ObjectToCharSequence("Please wait..."));
 BA.debugLineNum = 503;BA.debugLine="lblVisu.TextColor = FileTextColor1";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblvisu").runMethod(true,"setTextColor",__ref.getField(true,"_filetextcolor1"));
 BA.debugLineNum = 504;BA.debugLine="lblVisu.TextSize = 18";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblvisu").runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 505;BA.debugLine="lblVisu.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lblvisu").runMethod(false,"setTypeface",clsexplorer.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 506;BA.debugLine="pnlVisu.AddView(lblVisu, 10dip, 10dip, pnlFiles.W";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlvisu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblvisu").getObject())),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1)),clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 1)),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))));
 BA.debugLineNum = 507;BA.debugLine="pnlFiles.AddView(pnlVisu, Marge, Marge, pnlFiles.";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlfiles").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlvisu").getObject())),(Object)(_marge),(Object)(_marge),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1))}, "-",1, 1)));
 BA.debugLineNum = 508;BA.debugLine="svFichiers.Visible = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_svfichiers").runMethod(true,"setVisible",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 509;BA.debugLine="DoEvents: DoEvents";
Debug.ShouldStop(268435456);
clsexplorer.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 509;BA.debugLine="DoEvents: DoEvents";
Debug.ShouldStop(268435456);
clsexplorer.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 510;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 511;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(1073741824);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 512;BA.debugLine="bmp.InitializeSample(strChemin, Image, pnlVisu.W";
Debug.ShouldStop(-2147483648);
_bmp.runVoidMethod ("InitializeSample",(Object)(__ref.getField(true,"_strchemin")),(Object)(_image),(Object)(__ref.getField(false,"_pnlvisu").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_pnlvisu").runMethod(true,"getHeight")));
 BA.debugLineNum = 513;BA.debugLine="If bmp.Height <= pnlVisu.Height AND bmp.Width <=";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("k",_bmp.runMethod(true,"getHeight"),BA.numberCast(double.class, __ref.getField(false,"_pnlvisu").runMethod(true,"getHeight"))) && RemoteObject.solveBoolean("k",_bmp.runMethod(true,"getWidth"),BA.numberCast(double.class, __ref.getField(false,"_pnlvisu").runMethod(true,"getWidth")))) { 
 BA.debugLineNum = 515;BA.debugLine="ivVisu.Gravity = Gravity.CENTER";
Debug.ShouldStop(4);
__ref.getField(false,"_ivvisu").runMethod(true,"setGravity",clsexplorer.__c.getField(false,"Gravity").getField(true,"CENTER"));
 }else {
 BA.debugLineNum = 517;BA.debugLine="Dim RatioBmp, RatioImg As Float";
Debug.ShouldStop(16);
_ratiobmp = RemoteObject.createImmutable(0f);Debug.locals.put("RatioBmp", _ratiobmp);
_ratioimg = RemoteObject.createImmutable(0f);Debug.locals.put("RatioImg", _ratioimg);
 BA.debugLineNum = 518;BA.debugLine="RatioBmp = bmp.Width / bmp.Height";
Debug.ShouldStop(32);
_ratiobmp = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_bmp.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("RatioBmp", _ratiobmp);
 BA.debugLineNum = 519;BA.debugLine="RatioImg = pnlVisu.Width / pnlVisu.Height";
Debug.ShouldStop(64);
_ratioimg = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlvisu").runMethod(true,"getWidth"),__ref.getField(false,"_pnlvisu").runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("RatioImg", _ratioimg);
 BA.debugLineNum = 520;BA.debugLine="If NumberFormat(RatioBmp, 1, 2) = NumberFormat(";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",clsexplorer.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _ratiobmp)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))),clsexplorer.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _ratioimg)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))))) { 
 BA.debugLineNum = 522;BA.debugLine="ivVisu.Gravity = Gravity.FILL";
Debug.ShouldStop(512);
__ref.getField(false,"_ivvisu").runMethod(true,"setGravity",clsexplorer.__c.getField(false,"Gravity").getField(true,"FILL"));
 }else {
 BA.debugLineNum = 525;BA.debugLine="Dim Diviseur As Float";
Debug.ShouldStop(4096);
_diviseur = RemoteObject.createImmutable(0f);Debug.locals.put("Diviseur", _diviseur);
 BA.debugLineNum = 526;BA.debugLine="If RatioImg > RatioBmp Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_ratioimg,BA.numberCast(double.class, _ratiobmp))) { 
 BA.debugLineNum = 527;BA.debugLine="Diviseur = bmp.Height / pnlVisu.Height";
Debug.ShouldStop(16384);
_diviseur = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),__ref.getField(false,"_pnlvisu").runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("Diviseur", _diviseur);
 BA.debugLineNum = 528;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(bmp.Width";
Debug.ShouldStop(32768);
_bmp = __ref.runClassMethod (com.bcleaner.clsexplorer.class, "_createscaledbitmap",(Object)(_bmp),(Object)(BA.numberCast(int.class, clsexplorer.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_diviseur,clsexplorer.__c.getField(true,"Density")}, "//",0, 0))))),(Object)(BA.numberCast(int.class, clsexplorer.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlvisu").runMethod(true,"getHeight"),clsexplorer.__c.getField(true,"Density")}, "/",0, 0))))));Debug.locals.put("bmp", _bmp);
 }else {
 BA.debugLineNum = 531;BA.debugLine="Diviseur = bmp.Width / pnlVisu.Width";
Debug.ShouldStop(262144);
_diviseur = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),__ref.getField(false,"_pnlvisu").runMethod(true,"getWidth")}, "/",0, 0));Debug.locals.put("Diviseur", _diviseur);
 BA.debugLineNum = 532;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(pnlVisu.W";
Debug.ShouldStop(524288);
_bmp = __ref.runClassMethod (com.bcleaner.clsexplorer.class, "_createscaledbitmap",(Object)(_bmp),(Object)(BA.numberCast(int.class, clsexplorer.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlvisu").runMethod(true,"getWidth"),clsexplorer.__c.getField(true,"Density")}, "/",0, 0))))),(Object)(BA.numberCast(int.class, clsexplorer.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_diviseur,clsexplorer.__c.getField(true,"Density")}, "//",0, 0))))));Debug.locals.put("bmp", _bmp);
 };
 BA.debugLineNum = 535;BA.debugLine="ivVisu.Gravity = Gravity.NO_GRAVITY";
Debug.ShouldStop(4194304);
__ref.getField(false,"_ivvisu").runMethod(true,"setGravity",clsexplorer.__c.getField(false,"Gravity").getField(true,"NO_GRAVITY"));
 };
 };
 BA.debugLineNum = 538;BA.debugLine="ivVisu.Bitmap = bmp";
Debug.ShouldStop(33554432);
__ref.getField(false,"_ivvisu").runMethod(false,"setBitmap",(_bmp.getObject()));
 BA.debugLineNum = 539;BA.debugLine="lblVisu.Text = \"\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lblvisu").runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 540;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(134217728);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 541;BA.debugLine="r.Target = pnlVisu";
Debug.ShouldStop(268435456);
_r.setField ("Target",(__ref.getField(false,"_pnlvisu").getObject()));
 BA.debugLineNum = 542;BA.debugLine="r.SetOnClickListener(\"pnlVisu_Close\") 'We cannot";
Debug.ShouldStop(536870912);
_r.runVoidMethod ("SetOnClickListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlVisu_Close")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e46) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e46.toString()); BA.debugLineNum = 544;BA.debugLine="Msgbox(LastException.Message, \"Oooops\")";
Debug.ShouldStop(-2147483648);
clsexplorer.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(clsexplorer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Oooops"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 545;BA.debugLine="pnlVisu_Close(Null)";
Debug.ShouldStop(1);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_pnlvisu_close",(Object)(clsexplorer.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 547;BA.debugLine="End Sub";
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
public static RemoteObject  _affichertexte(RemoteObject __ref,RemoteObject _texte) throws Exception{
try {
		Debug.PushSubsStack("AfficherTexte (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("affichertexte")) return __ref.runUserSub(false, "clsexplorer","affichertexte", __ref, _texte);
RemoteObject _marge = RemoteObject.createImmutable(0);
RemoteObject _contenu = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _reader = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _ligne = RemoteObject.createImmutable("");
RemoteObject _cpt = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("Texte", _texte);
 BA.debugLineNum = 557;BA.debugLine="Private Sub AfficherTexte(Texte As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 558;BA.debugLine="Dim Marge As Int: Marge = 2dip";
Debug.ShouldStop(8192);
_marge = RemoteObject.createImmutable(0);Debug.locals.put("Marge", _marge);
 BA.debugLineNum = 558;BA.debugLine="Dim Marge As Int: Marge = 2dip";
Debug.ShouldStop(8192);
_marge = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Marge", _marge);
 BA.debugLineNum = 559;BA.debugLine="pnlVisu.Initialize(\"\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_pnlvisu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 560;BA.debugLine="lblVisu.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblvisu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 561;BA.debugLine="pnlVisu.AddView(lblVisu, 10dip, 10dip, pnlFiles.W";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlvisu").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblvisu").getObject())),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1)),clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1)),clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "--",2, 1)));
 BA.debugLineNum = 562;BA.debugLine="pnlFiles.AddView(pnlVisu, Marge, Marge, pnlFiles.";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlfiles").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlvisu").getObject())),(Object)(_marge),(Object)(_marge),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marge}, "*",0, 1))}, "-",1, 1)));
 BA.debugLineNum = 563;BA.debugLine="pnlVisu.Color = Colors.Transparent";
Debug.ShouldStop(262144);
__ref.getField(false,"_pnlvisu").runVoidMethod ("setColor",clsexplorer.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 564;BA.debugLine="svFichiers.Visible = False";
Debug.ShouldStop(524288);
__ref.getField(false,"_svfichiers").runMethod(true,"setVisible",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 565;BA.debugLine="lblVisu.TextColor = FileTextColor1";
Debug.ShouldStop(1048576);
__ref.getField(false,"_lblvisu").runMethod(true,"setTextColor",__ref.getField(true,"_filetextcolor1"));
 BA.debugLineNum = 566;BA.debugLine="lblVisu.TextSize = 16";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lblvisu").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 567;BA.debugLine="lblVisu.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lblvisu").runMethod(false,"setTypeface",clsexplorer.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 568;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 569;BA.debugLine="Dim Contenu As StringBuilder: Contenu.Initialize";
Debug.ShouldStop(16777216);
_contenu = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("Contenu", _contenu);
 BA.debugLineNum = 569;BA.debugLine="Dim Contenu As StringBuilder: Contenu.Initialize";
Debug.ShouldStop(16777216);
_contenu.runVoidMethod ("Initialize");
 BA.debugLineNum = 570;BA.debugLine="Dim Reader As TextReader, Ligne As String, Cpt A";
Debug.ShouldStop(33554432);
_reader = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("Reader", _reader);
_ligne = RemoteObject.createImmutable("");Debug.locals.put("Ligne", _ligne);
_cpt = RemoteObject.createImmutable(0);Debug.locals.put("Cpt", _cpt);
 BA.debugLineNum = 571;BA.debugLine="Reader.Initialize(File.OpenInput(strChemin, Text";
Debug.ShouldStop(67108864);
_reader.runVoidMethod ("Initialize",(Object)((clsexplorer.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(__ref.getField(true,"_strchemin")),(Object)(_texte)).getObject())));
 BA.debugLineNum = 572;BA.debugLine="Ligne = Reader.ReadLine";
Debug.ShouldStop(134217728);
_ligne = _reader.runMethod(true,"ReadLine");Debug.locals.put("Ligne", _ligne);
 BA.debugLineNum = 573;BA.debugLine="Do While Ligne <> Null";
Debug.ShouldStop(268435456);
while (RemoteObject.solveBoolean("N",_ligne)) {
 BA.debugLineNum = 574;BA.debugLine="Cpt = Cpt + 1";
Debug.ShouldStop(536870912);
_cpt = RemoteObject.solve(new RemoteObject[] {_cpt,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Cpt", _cpt);
 BA.debugLineNum = 575;BA.debugLine="If Cpt > 50 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_cpt,BA.numberCast(double.class, 50))) { 
 BA.debugLineNum = 576;BA.debugLine="Contenu.Append(\"--- Lines after 50 are skipped";
Debug.ShouldStop(-2147483648);
_contenu.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("--- Lines after 50 are skipped ---")));
 BA.debugLineNum = 577;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 BA.debugLineNum = 579;BA.debugLine="Contenu.Append(Ligne).Append(CRLF)";
Debug.ShouldStop(4);
_contenu.runMethod(false,"Append",(Object)(_ligne)).runVoidMethod ("Append",(Object)(clsexplorer.__c.getField(true,"CRLF")));
 BA.debugLineNum = 580;BA.debugLine="Ligne = Reader.ReadLine";
Debug.ShouldStop(8);
_ligne = _reader.runMethod(true,"ReadLine");Debug.locals.put("Ligne", _ligne);
 }
;
 BA.debugLineNum = 582;BA.debugLine="Reader.Close";
Debug.ShouldStop(32);
_reader.runVoidMethod ("Close");
 BA.debugLineNum = 583;BA.debugLine="lblVisu.Text = Contenu";
Debug.ShouldStop(64);
__ref.getField(false,"_lblvisu").runMethod(true,"setText",BA.ObjectToCharSequence(_contenu.getObject()));
 BA.debugLineNum = 584;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(128);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 585;BA.debugLine="r.Target = pnlVisu";
Debug.ShouldStop(256);
_r.setField ("Target",(__ref.getField(false,"_pnlvisu").getObject()));
 BA.debugLineNum = 586;BA.debugLine="r.SetOnClickListener(\"pnlVisu_Close\") 'We cannot";
Debug.ShouldStop(512);
_r.runVoidMethod ("SetOnClickListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlVisu_Close")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e33) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e33.toString()); BA.debugLineNum = 588;BA.debugLine="Msgbox(LastException.Message, \"Oooops\")";
Debug.ShouldStop(2048);
clsexplorer.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(clsexplorer.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Oooops"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 589;BA.debugLine="Reader.Close";
Debug.ShouldStop(4096);
_reader.runVoidMethod ("Close");
 BA.debugLineNum = 590;BA.debugLine="pnlVisu_Close(Null)";
Debug.ShouldStop(8192);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_pnlvisu_close",(Object)(clsexplorer.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 592;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _anim_animationend(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Anim_AnimationEnd (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,753);
if (RapidSub.canDelegate("anim_animationend")) return __ref.runUserSub(false, "clsexplorer","anim_animationend", __ref);
 BA.debugLineNum = 753;BA.debugLine="Private Sub Anim_AnimationEnd";
Debug.ShouldStop(65536);
 BA.debugLineNum = 754;BA.debugLine="pnlRange.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlrange").runMethod(true,"setVisible",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 755;BA.debugLine="End Sub";
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
public static RemoteObject  _btnok_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnOK_Click (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,683);
if (RapidSub.canDelegate("btnok_click")) return __ref.runUserSub(false, "clsexplorer","btnok_click", __ref);
 BA.debugLineNum = 683;BA.debugLine="Private Sub btnOK_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 684;BA.debugLine="Selection.Canceled = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_selection").setField ("Canceled",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 685;BA.debugLine="If bOnlyFolders Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_bonlyfolders").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 686;BA.debugLine="If edtFilename.Text = \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_edtfilename").runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 687;BA.debugLine="Selection.ChosenPath = strChemin";
Debug.ShouldStop(16384);
__ref.getField(false,"_selection").setField ("ChosenPath",__ref.getField(true,"_strchemin"));
 }else {
 BA.debugLineNum = 689;BA.debugLine="Selection.ChosenPath = edtFilename.Text";
Debug.ShouldStop(65536);
__ref.getField(false,"_selection").setField ("ChosenPath",__ref.getField(false,"_edtfilename").runMethod(true,"getText"));
 };
 BA.debugLineNum = 691;BA.debugLine="Selection.ChosenFile = \"\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_selection").setField ("ChosenFile",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 693;BA.debugLine="Selection.ChosenPath = strChemin";
Debug.ShouldStop(1048576);
__ref.getField(false,"_selection").setField ("ChosenPath",__ref.getField(true,"_strchemin"));
 BA.debugLineNum = 694;BA.debugLine="Selection.ChosenFile = edtFilename.Text";
Debug.ShouldStop(2097152);
__ref.getField(false,"_selection").setField ("ChosenFile",__ref.getField(false,"_edtfilename").runMethod(true,"getText"));
 };
 BA.debugLineNum = 696;BA.debugLine="WaitUntilOK = False";
Debug.ShouldStop(8388608);
__ref.setField ("_waituntilok",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 697;BA.debugLine="End Sub";
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
public static RemoteObject  _calcnewtop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CalcNewTop (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,744);
if (RapidSub.canDelegate("calcnewtop")) return __ref.runUserSub(false, "clsexplorer","calcnewtop", __ref);
 BA.debugLineNum = 744;BA.debugLine="Private Sub CalcNewTop As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 745;BA.debugLine="Return (svFichiers.VerticalScrollPosition / (svFi";
Debug.ShouldStop(256);
if (true) return BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svfichiers").runMethod(true,"getVerticalScrollPosition"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svfichiers").runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(false,"_svfichiers").runMethod(true,"getHeight")}, "-",1, 1)),__ref.getField(true,"_maxpos")}, "/*",0, 0)));
 BA.debugLineNum = 746;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Type typResult(Canceled As Boolean, ChosenPath As";
;
 //BA.debugLineNum = 5;BA.debugLine="Public BorderColor, BackgroundColor As Int";
clsexplorer._bordercolor = RemoteObject.createImmutable(0);__ref.setField("_bordercolor",clsexplorer._bordercolor);
clsexplorer._backgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_backgroundcolor",clsexplorer._backgroundcolor);
 //BA.debugLineNum = 6;BA.debugLine="Public FolderTextColor As Int";
clsexplorer._foldertextcolor = RemoteObject.createImmutable(0);__ref.setField("_foldertextcolor",clsexplorer._foldertextcolor);
 //BA.debugLineNum = 7;BA.debugLine="Public FileTextColor1, FileTextColor2 As Int";
clsexplorer._filetextcolor1 = RemoteObject.createImmutable(0);__ref.setField("_filetextcolor1",clsexplorer._filetextcolor1);
clsexplorer._filetextcolor2 = RemoteObject.createImmutable(0);__ref.setField("_filetextcolor2",clsexplorer._filetextcolor2);
 //BA.debugLineNum = 8;BA.debugLine="Public DividerColor As Int";
clsexplorer._dividercolor = RemoteObject.createImmutable(0);__ref.setField("_dividercolor",clsexplorer._dividercolor);
 //BA.debugLineNum = 9;BA.debugLine="Public DialogRect As Rect";
clsexplorer._dialogrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");__ref.setField("_dialogrect",clsexplorer._dialogrect);
 //BA.debugLineNum = 10;BA.debugLine="Public FastScrollEnabled As Boolean";
clsexplorer._fastscrollenabled = RemoteObject.createImmutable(false);__ref.setField("_fastscrollenabled",clsexplorer._fastscrollenabled);
 //BA.debugLineNum = 11;BA.debugLine="Public Selection As typResult";
clsexplorer._selection = RemoteObject.createNew ("com.bcleaner.clsexplorer._typresult");__ref.setField("_selection",clsexplorer._selection);
 //BA.debugLineNum = 12;BA.debugLine="Public Ellipsis As Boolean";
clsexplorer._ellipsis = RemoteObject.createImmutable(false);__ref.setField("_ellipsis",clsexplorer._ellipsis);
 //BA.debugLineNum = 14;BA.debugLine="Private actEcran As Activity";
clsexplorer._actecran = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_actecran",clsexplorer._actecran);
 //BA.debugLineNum = 15;BA.debugLine="Private strChemin As String";
clsexplorer._strchemin = RemoteObject.createImmutable("");__ref.setField("_strchemin",clsexplorer._strchemin);
 //BA.debugLineNum = 16;BA.debugLine="Private lstFiltre As List";
clsexplorer._lstfiltre = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstfiltre",clsexplorer._lstfiltre);
 //BA.debugLineNum = 17;BA.debugLine="Private bOnlyFolders As Boolean";
clsexplorer._bonlyfolders = RemoteObject.createImmutable(false);__ref.setField("_bonlyfolders",clsexplorer._bonlyfolders);
 //BA.debugLineNum = 18;BA.debugLine="Private bVisualiser As Boolean";
clsexplorer._bvisualiser = RemoteObject.createImmutable(false);__ref.setField("_bvisualiser",clsexplorer._bvisualiser);
 //BA.debugLineNum = 19;BA.debugLine="Private bMultiFolderSelection As Boolean";
clsexplorer._bmultifolderselection = RemoteObject.createImmutable(false);__ref.setField("_bmultifolderselection",clsexplorer._bmultifolderselection);
 //BA.debugLineNum = 20;BA.debugLine="Private bMultiFileSelection As Boolean";
clsexplorer._bmultifileselection = RemoteObject.createImmutable(false);__ref.setField("_bmultifileselection",clsexplorer._bmultifileselection);
 //BA.debugLineNum = 21;BA.debugLine="Private strBtnOKTxt As String";
clsexplorer._strbtnoktxt = RemoteObject.createImmutable("");__ref.setField("_strbtnoktxt",clsexplorer._strbtnoktxt);
 //BA.debugLineNum = 23;BA.debugLine="Private pnlMasque As Panel";
clsexplorer._pnlmasque = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlmasque",clsexplorer._pnlmasque);
 //BA.debugLineNum = 24;BA.debugLine="Private pnlCadre As Panel";
clsexplorer._pnlcadre = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlcadre",clsexplorer._pnlcadre);
 //BA.debugLineNum = 25;BA.debugLine="Private pnlFiles As Panel";
clsexplorer._pnlfiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlfiles",clsexplorer._pnlfiles);
 //BA.debugLineNum = 26;BA.debugLine="Private svFichiers As ScrollView2D";
clsexplorer._svfichiers = RemoteObject.createNew ("flm.b4a.scrollview2d.ScrollView2DWrapper");__ref.setField("_svfichiers",clsexplorer._svfichiers);
 //BA.debugLineNum = 27;BA.debugLine="Private lstFichiers As ClsCheckList";
clsexplorer._lstfichiers = RemoteObject.createNew ("com.bcleaner.clschecklist");__ref.setField("_lstfichiers",clsexplorer._lstfichiers);
 //BA.debugLineNum = 28;BA.debugLine="Private itemHeight As Int: itemHeight = 55dip";
clsexplorer._itemheight = RemoteObject.createImmutable(0);__ref.setField("_itemheight",clsexplorer._itemheight);
 //BA.debugLineNum = 28;BA.debugLine="Private itemHeight As Int: itemHeight = 55dip";
__ref.setField ("_itemheight",clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 55))));
 //BA.debugLineNum = 29;BA.debugLine="Private pnlVisu As Panel";
clsexplorer._pnlvisu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlvisu",clsexplorer._pnlvisu);
 //BA.debugLineNum = 30;BA.debugLine="Private lblVisu As Label";
clsexplorer._lblvisu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblvisu",clsexplorer._lblvisu);
 //BA.debugLineNum = 31;BA.debugLine="Private ivVisu As ImageView";
clsexplorer._ivvisu = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_ivvisu",clsexplorer._ivvisu);
 //BA.debugLineNum = 32;BA.debugLine="Private pnlCartouche As Panel";
clsexplorer._pnlcartouche = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlcartouche",clsexplorer._pnlcartouche);
 //BA.debugLineNum = 33;BA.debugLine="Private edtFilename As EditText";
clsexplorer._edtfilename = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edtfilename",clsexplorer._edtfilename);
 //BA.debugLineNum = 34;BA.debugLine="Private btnOK As Button";
clsexplorer._btnok = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnok",clsexplorer._btnok);
 //BA.debugLineNum = 35;BA.debugLine="Private WaitUntilOK As Boolean";
clsexplorer._waituntilok = RemoteObject.createImmutable(false);__ref.setField("_waituntilok",clsexplorer._waituntilok);
 //BA.debugLineNum = 37;BA.debugLine="Private pnlRange As Panel";
clsexplorer._pnlrange = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlrange",clsexplorer._pnlrange);
 //BA.debugLineNum = 38;BA.debugLine="Private pnlDisplay As Panel";
clsexplorer._pnldisplay = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnldisplay",clsexplorer._pnldisplay);
 //BA.debugLineNum = 39;BA.debugLine="Private Anim As Animation";
clsexplorer._anim = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");__ref.setField("_anim",clsexplorer._anim);
 //BA.debugLineNum = 40;BA.debugLine="Private TimeOut As Timer";
clsexplorer._timeout = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_timeout",clsexplorer._timeout);
 //BA.debugLineNum = 41;BA.debugLine="Private Duration As Int";
clsexplorer._duration = RemoteObject.createImmutable(0);__ref.setField("_duration",clsexplorer._duration);
 //BA.debugLineNum = 42;BA.debugLine="Private MaxPos As Int";
clsexplorer._maxpos = RemoteObject.createImmutable(0);__ref.setField("_maxpos",clsexplorer._maxpos);
 //BA.debugLineNum = 43;BA.debugLine="Private bIgnoreEvent As Boolean";
clsexplorer._bignoreevent = RemoteObject.createImmutable(false);__ref.setField("_bignoreevent",clsexplorer._bignoreevent);
 //BA.debugLineNum = 44;BA.debugLine="Private bUserMovingPnl As Boolean";
clsexplorer._busermovingpnl = RemoteObject.createImmutable(false);__ref.setField("_busermovingpnl",clsexplorer._busermovingpnl);
 //BA.debugLineNum = 45;BA.debugLine="Private bWaitForScroll As Boolean";
clsexplorer._bwaitforscroll = RemoteObject.createImmutable(false);__ref.setField("_bwaitforscroll",clsexplorer._bwaitforscroll);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _commonexplorer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CommonExplorer (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("commonexplorer")) return __ref.runUserSub(false, "clsexplorer","commonexplorer", __ref);
 BA.debugLineNum = 416;BA.debugLine="Private Sub CommonExplorer";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 417;BA.debugLine="If FastScrollEnabled Then InitializeScrollPanel";
Debug.ShouldStop(1);
if (__ref.getField(true,"_fastscrollenabled").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_initializescrollpanel");};
 BA.debugLineNum = 419;BA.debugLine="Selection.Canceled = True";
Debug.ShouldStop(4);
__ref.getField(false,"_selection").setField ("Canceled",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 420;BA.debugLine="Selection.ChosenPath = \"\"";
Debug.ShouldStop(8);
__ref.getField(false,"_selection").setField ("ChosenPath",BA.ObjectToString(""));
 BA.debugLineNum = 421;BA.debugLine="Selection.ChosenFile = \"\"";
Debug.ShouldStop(16);
__ref.getField(false,"_selection").setField ("ChosenFile",BA.ObjectToString(""));
 BA.debugLineNum = 422;BA.debugLine="edtFilename.RequestFocus";
Debug.ShouldStop(32);
__ref.getField(false,"_edtfilename").runVoidMethod ("RequestFocus");
 BA.debugLineNum = 424;BA.debugLine="Do While WaitUntilOK";
Debug.ShouldStop(128);
while (__ref.getField(true,"_waituntilok").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 426;BA.debugLine="DoEvents";
Debug.ShouldStop(512);
clsexplorer.__c.runVoidMethodAndSync ("DoEvents");
 }
;
 BA.debugLineNum = 429;BA.debugLine="pnlMasque.RemoveView";
Debug.ShouldStop(4096);
__ref.getField(false,"_pnlmasque").runVoidMethod ("RemoveView");
 BA.debugLineNum = 430;BA.debugLine="pnlMasque = Null";
Debug.ShouldStop(8192);
__ref.getField(false,"_pnlmasque").setObject (clsexplorer.__c.getField(false,"Null"));
 BA.debugLineNum = 431;BA.debugLine="End Sub";
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
public static RemoteObject  _createscaledbitmap(RemoteObject __ref,RemoteObject _original,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateScaledBitmap (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,485);
if (RapidSub.canDelegate("createscaledbitmap")) return __ref.runUserSub(false, "clsexplorer","createscaledbitmap", __ref, _original, _width, _height);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Original", _original);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 485;BA.debugLine="Private Sub CreateScaledBitmap(Original As Bitmap,";
Debug.ShouldStop(16);
 BA.debugLineNum = 486;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(32);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 487;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(64);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 488;BA.debugLine="b = r.RunStaticMethod(\"android.graphics.Bitmap\",";
Debug.ShouldStop(128);
_b.setObject(_r.runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("android.graphics.Bitmap")),(Object)(BA.ObjectToString("createScaledBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_original.getObject()),(_width),(_height),(clsexplorer.__c.getField(true,"True"))})),(Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("android.graphics.Bitmap"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.boolean")}))));
 BA.debugLineNum = 491;BA.debugLine="Return b";
Debug.ShouldStop(1024);
if (true) return _b;
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _displaysize(RemoteObject __ref,RemoteObject _sizeoct) throws Exception{
try {
		Debug.PushSubsStack("DisplaySize (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("displaysize")) return __ref.runUserSub(false, "clsexplorer","displaysize", __ref, _sizeoct);
RemoteObject _txtunits = null;
RemoteObject _unité = RemoteObject.createImmutable(0);
Debug.locals.put("SizeOct", _sizeoct);
 BA.debugLineNum = 85;BA.debugLine="Private Sub DisplaySize(SizeOct As Double) As Stri";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Dim txtUnits(4) As String";
Debug.ShouldStop(2097152);
_txtunits = RemoteObject.createNewArray ("String", new int[] {4}, new Object[]{});Debug.locals.put("txtUnits", _txtunits);
 BA.debugLineNum = 87;BA.debugLine="txtUnits = Array As String(\"bytes\", \"Kb\", \"Mb\", \"";
Debug.ShouldStop(4194304);
_txtunits = RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("bytes"),BA.ObjectToString("Kb"),BA.ObjectToString("Mb"),RemoteObject.createImmutable("Gb")});Debug.locals.put("txtUnits", _txtunits);
 BA.debugLineNum = 88;BA.debugLine="Dim Unité As Int";
Debug.ShouldStop(8388608);
_unité = RemoteObject.createImmutable(0);Debug.locals.put("Unité", _unité);
 BA.debugLineNum = 89;BA.debugLine="Unité = 0";
Debug.ShouldStop(16777216);
_unité = BA.numberCast(int.class, 0);Debug.locals.put("Unité", _unité);
 BA.debugLineNum = 90;BA.debugLine="Do While SizeOct > 1024";
Debug.ShouldStop(33554432);
while (RemoteObject.solveBoolean(">",_sizeoct,BA.numberCast(double.class, 1024))) {
 BA.debugLineNum = 91;BA.debugLine="Unité = Unité + 1";
Debug.ShouldStop(67108864);
_unité = RemoteObject.solve(new RemoteObject[] {_unité,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Unité", _unité);
 BA.debugLineNum = 92;BA.debugLine="SizeOct = SizeOct / 1024";
Debug.ShouldStop(134217728);
_sizeoct = RemoteObject.solve(new RemoteObject[] {_sizeoct,RemoteObject.createImmutable(1024)}, "/",0, 0);Debug.locals.put("SizeOct", _sizeoct);
 }
;
 BA.debugLineNum = 94;BA.debugLine="If SizeOct <> Floor(SizeOct) Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_sizeoct,clsexplorer.__c.runMethod(true,"Floor",(Object)(_sizeoct)))) { 
 BA.debugLineNum = 95;BA.debugLine="Return NumberFormat(SizeOct, 1, 1) & \" \" & txtUn";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.concat(clsexplorer.__c.runMethod(true,"NumberFormat",(Object)(_sizeoct),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(" "),_txtunits.getArrayElement(true,_unité));
 }else {
 BA.debugLineNum = 97;BA.debugLine="Return SizeOct & \" \" & txtUnits(Unité)";
Debug.ShouldStop(1);
if (true) return RemoteObject.concat(_sizeoct,RemoteObject.createImmutable(" "),_txtunits.getArrayElement(true,_unité));
 };
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
public static RemoteObject  _dlg_hasfocus(RemoteObject __ref,RemoteObject _viewtag,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("dlg_HasFocus (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("dlg_hasfocus")) return __ref.runUserSub(false, "clsexplorer","dlg_hasfocus", __ref, _viewtag, _hasfocus);
Debug.locals.put("ViewTag", _viewtag);
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 439;BA.debugLine="Private Sub dlg_HasFocus(ViewTag As Object, HasFoc";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="If Not(HasFocus) Then edtFilename.RequestFocus";
Debug.ShouldStop(8388608);
if (clsexplorer.__c.runMethod(true,"Not",(Object)(_hasfocus)).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_edtfilename").runVoidMethod ("RequestFocus");};
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
public static RemoteObject  _dlg_keypress(RemoteObject __ref,RemoteObject _viewtag,RemoteObject _keycode,RemoteObject _keyevent) throws Exception{
try {
		Debug.PushSubsStack("dlg_KeyPress (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("dlg_keypress")) return __ref.runUserSub(false, "clsexplorer","dlg_keypress", __ref, _viewtag, _keycode, _keyevent);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _keyaction = RemoteObject.createImmutable(0);
Debug.locals.put("ViewTag", _viewtag);
Debug.locals.put("KeyCode", _keycode);
Debug.locals.put("KeyEvent", _keyevent);
 BA.debugLineNum = 444;BA.debugLine="Private Sub dlg_KeyPress(ViewTag As Object, KeyCod";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 445;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(268435456);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 446;BA.debugLine="r.Target = KeyEvent";
Debug.ShouldStop(536870912);
_r.setField ("Target",_keyevent);
 BA.debugLineNum = 447;BA.debugLine="Dim KeyAction As Int = r.RunMethod(\"getAction\")";
Debug.ShouldStop(1073741824);
_keyaction = BA.numberCast(int.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getAction"))));Debug.locals.put("KeyAction", _keyaction);Debug.locals.put("KeyAction", _keyaction);
 BA.debugLineNum = 448;BA.debugLine="Select Case KeyCode";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_keycode,clsexplorer.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK"),clsexplorer.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_MENU"),clsexplorer.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_SEARCH"))) {
case 0: {
 BA.debugLineNum = 450;BA.debugLine="If KeyAction = 1 Then 'ACTION_UP";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_keyaction,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 451;BA.debugLine="If pnlVisu.IsInitialized Then";
Debug.ShouldStop(4);
if (__ref.getField(false,"_pnlvisu").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 452;BA.debugLine="pnlVisu_Close(Null)";
Debug.ShouldStop(8);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_pnlvisu_close",(Object)(clsexplorer.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 454;BA.debugLine="WaitUntilOK = False";
Debug.ShouldStop(32);
__ref.setField ("_waituntilok",clsexplorer.__c.getField(true,"False"));
 };
 };
 BA.debugLineNum = 457;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) return clsexplorer.__c.getField(true,"True");
 break; }
case 1: {
 BA.debugLineNum = 459;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return clsexplorer.__c.getField(true,"True");
 break; }
case 2: {
 BA.debugLineNum = 461;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) return clsexplorer.__c.getField(true,"True");
 break; }
}
;
 BA.debugLineNum = 463;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return clsexplorer.__c.getField(true,"False");
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _explorer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Explorer (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("explorer")) return __ref.runUserSub(false, "clsexplorer","explorer", __ref);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _marginbord = RemoteObject.createImmutable(0);
RemoteObject _margin = RemoteObject.createImmutable(0);
RemoteObject _margincartouche = RemoteObject.createImmutable(0);
RemoteObject _hauteurcartouche = RemoteObject.createImmutable(0);
RemoteObject _largeurbtn = RemoteObject.createImmutable(0);
RemoteObject _cd_pnlcadre = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _cd_pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _largeur = RemoteObject.createImmutable(0);
RemoteObject _hauteur = RemoteObject.createImmutable(0);
RemoteObject _gd_pnlcartouche = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _clrs = null;
 BA.debugLineNum = 232;BA.debugLine="Public Sub Explorer";
Debug.ShouldStop(128);
 BA.debugLineNum = 236;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2048);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 237;BA.debugLine="Dim MarginBord As Int: MarginBord = 3dip";
Debug.ShouldStop(4096);
_marginbord = RemoteObject.createImmutable(0);Debug.locals.put("MarginBord", _marginbord);
 BA.debugLineNum = 237;BA.debugLine="Dim MarginBord As Int: MarginBord = 3dip";
Debug.ShouldStop(4096);
_marginbord = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("MarginBord", _marginbord);
 BA.debugLineNum = 238;BA.debugLine="Dim Margin As Int: Margin = 8dip";
Debug.ShouldStop(8192);
_margin = RemoteObject.createImmutable(0);Debug.locals.put("Margin", _margin);
 BA.debugLineNum = 238;BA.debugLine="Dim Margin As Int: Margin = 8dip";
Debug.ShouldStop(8192);
_margin = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 8)));Debug.locals.put("Margin", _margin);
 BA.debugLineNum = 239;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
Debug.ShouldStop(16384);
_margincartouche = RemoteObject.createImmutable(0);Debug.locals.put("MarginCartouche", _margincartouche);
 BA.debugLineNum = 239;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
Debug.ShouldStop(16384);
_margincartouche = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("MarginCartouche", _margincartouche);
 BA.debugLineNum = 240;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
Debug.ShouldStop(32768);
_hauteurcartouche = RemoteObject.createImmutable(0);Debug.locals.put("HauteurCartouche", _hauteurcartouche);
 BA.debugLineNum = 240;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
Debug.ShouldStop(32768);
_hauteurcartouche = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)));Debug.locals.put("HauteurCartouche", _hauteurcartouche);
 BA.debugLineNum = 241;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
Debug.ShouldStop(65536);
_largeurbtn = RemoteObject.createImmutable(0);Debug.locals.put("LargeurBtn", _largeurbtn);
 BA.debugLineNum = 241;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
Debug.ShouldStop(65536);
_largeurbtn = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)));Debug.locals.put("LargeurBtn", _largeurbtn);
 BA.debugLineNum = 242;BA.debugLine="Dim cd_pnlCadre, cd_pnl As ColorDrawable";
Debug.ShouldStop(131072);
_cd_pnlcadre = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd_pnlCadre", _cd_pnlcadre);
_cd_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd_pnl", _cd_pnl);
 BA.debugLineNum = 244;BA.debugLine="pnlMasque.Initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlmasque").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 245;BA.debugLine="pnlMasque.Color = Colors.Transparent";
Debug.ShouldStop(1048576);
__ref.getField(false,"_pnlmasque").runVoidMethod ("setColor",clsexplorer.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 246;BA.debugLine="r.Target = pnlMasque";
Debug.ShouldStop(2097152);
_r.setField ("Target",(__ref.getField(false,"_pnlmasque").getObject()));
 BA.debugLineNum = 247;BA.debugLine="r.SetOnTouchListener(\"pnl_BlockTouch\")";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl_BlockTouch")));
 BA.debugLineNum = 249;BA.debugLine="pnlCadre.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlcadre").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 250;BA.debugLine="cd_pnlCadre.Initialize(BorderColor, 12)";
Debug.ShouldStop(33554432);
_cd_pnlcadre.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_bordercolor")),(Object)(BA.numberCast(int.class, 12)));
 BA.debugLineNum = 251;BA.debugLine="pnlCadre.Background = cd_pnlCadre";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlcadre").runMethod(false,"setBackground",(_cd_pnlcadre.getObject()));
 BA.debugLineNum = 253;BA.debugLine="pnlFiles.Initialize(\"\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_pnlfiles").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 254;BA.debugLine="cd_pnl.Initialize(BackgroundColor, 10)";
Debug.ShouldStop(536870912);
_cd_pnl.runVoidMethod ("Initialize",(Object)(__ref.getField(true,"_backgroundcolor")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 255;BA.debugLine="pnlFiles.Background = cd_pnl";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlfiles").runMethod(false,"setBackground",(_cd_pnl.getObject()));
 BA.debugLineNum = 256;BA.debugLine="svFichiers.Initialize(-1, 0, \"SVF\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_svfichiers").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("SVF")));
 BA.debugLineNum = 257;BA.debugLine="svFichiers.Color = BackgroundColor";
Debug.ShouldStop(1);
__ref.getField(false,"_svfichiers").runVoidMethod ("setColor",__ref.getField(true,"_backgroundcolor"));
 BA.debugLineNum = 258;BA.debugLine="Dim Largeur, Hauteur As Int";
Debug.ShouldStop(2);
_largeur = RemoteObject.createImmutable(0);Debug.locals.put("Largeur", _largeur);
_hauteur = RemoteObject.createImmutable(0);Debug.locals.put("Hauteur", _hauteur);
 BA.debugLineNum = 259;BA.debugLine="Largeur = DialogRect.Right - DialogRect.Left";
Debug.ShouldStop(4);
_largeur = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialogrect").runMethod(true,"getRight"),__ref.getField(false,"_dialogrect").runMethod(true,"getLeft")}, "-",1, 1);Debug.locals.put("Largeur", _largeur);
 BA.debugLineNum = 260;BA.debugLine="Hauteur = DialogRect.Bottom - DialogRect.Top";
Debug.ShouldStop(8);
_hauteur = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_dialogrect").runMethod(true,"getBottom"),__ref.getField(false,"_dialogrect").runMethod(true,"getTop")}, "-",1, 1);Debug.locals.put("Hauteur", _hauteur);
 BA.debugLineNum = 261;BA.debugLine="pnlFiles.AddView(svFichiers, Margin, Margin, Larg";
Debug.ShouldStop(16);
__ref.getField(false,"_pnlfiles").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_svfichiers").getObject())),(Object)(_margin),(Object)(_margin),(Object)(RemoteObject.solve(new RemoteObject[] {_largeur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_margin}, "*",0, 1))}, "--",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_margin}, "*",0, 1)),_hauteurcartouche}, "---",3, 1)));
 BA.debugLineNum = 262;BA.debugLine="r.Target = svFichiers";
Debug.ShouldStop(32);
_r.setField ("Target",(__ref.getField(false,"_svfichiers").getObject()));
 BA.debugLineNum = 263;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
Debug.ShouldStop(64);
_r.runVoidMethod ("SetOnKeyListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_KeyPress")));
 BA.debugLineNum = 264;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
Debug.ShouldStop(128);
_r.runVoidMethod ("SetOnFocusListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_HasFocus")));
 BA.debugLineNum = 266;BA.debugLine="pnlCartouche.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_pnlcartouche").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 267;BA.debugLine="Dim gd_pnlCartouche As GradientDrawable, Clrs(2)";
Debug.ShouldStop(1024);
_gd_pnlcartouche = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd_pnlCartouche", _gd_pnlcartouche);
_clrs = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("Clrs", _clrs);
 BA.debugLineNum = 268;BA.debugLine="Clrs(0) = Colors.Black";
Debug.ShouldStop(2048);
_clrs.setArrayElement (clsexplorer.__c.getField(false,"Colors").getField(true,"Black"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 269;BA.debugLine="Clrs(1) = BackgroundColor";
Debug.ShouldStop(4096);
_clrs.setArrayElement (__ref.getField(true,"_backgroundcolor"),BA.numberCast(int.class, 1));
 BA.debugLineNum = 270;BA.debugLine="gd_pnlCartouche.Initialize(\"TOP_BOTTOM\", Clrs)";
Debug.ShouldStop(8192);
_gd_pnlcartouche.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_clrs));
 BA.debugLineNum = 271;BA.debugLine="gd_pnlCartouche.CornerRadius = 10";
Debug.ShouldStop(16384);
_gd_pnlcartouche.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, 10));
 BA.debugLineNum = 272;BA.debugLine="pnlCartouche.Background = gd_pnlCartouche";
Debug.ShouldStop(32768);
__ref.getField(false,"_pnlcartouche").runMethod(false,"setBackground",(_gd_pnlcartouche.getObject()));
 BA.debugLineNum = 273;BA.debugLine="edtFilename.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_edtfilename").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 274;BA.debugLine="edtFilename.TextSize = 16";
Debug.ShouldStop(131072);
__ref.getField(false,"_edtfilename").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 275;BA.debugLine="edtFilename.InputType = Bit.Or(edtFilename.InputT";
Debug.ShouldStop(262144);
__ref.getField(false,"_edtfilename").runMethod(true,"setInputType",clsexplorer.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(__ref.getField(false,"_edtfilename").runMethod(true,"getInputType")),(Object)(BA.numberCast(int.class, 0x80000))));
 BA.debugLineNum = 276;BA.debugLine="edtFilename.SingleLine = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_edtfilename").runVoidMethod ("setSingleLine",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 277;BA.debugLine="edtFilename.Wrap = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_edtfilename").runVoidMethod ("setWrap",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 278;BA.debugLine="r.Target = edtFilename";
Debug.ShouldStop(2097152);
_r.setField ("Target",(__ref.getField(false,"_edtfilename").getObject()));
 BA.debugLineNum = 279;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
Debug.ShouldStop(4194304);
_r.runVoidMethod ("SetOnKeyListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_KeyPress")));
 BA.debugLineNum = 280;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
Debug.ShouldStop(8388608);
_r.runVoidMethod ("SetOnFocusListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_HasFocus")));
 BA.debugLineNum = 281;BA.debugLine="pnlCartouche.AddView(edtFilename, MarginCartouche";
Debug.ShouldStop(16777216);
__ref.getField(false,"_pnlcartouche").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_edtfilename").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_margincartouche,clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_margincartouche,clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_largeur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3),_margincartouche}, "*",0, 1)),_largeurbtn}, "---",3, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteurcartouche,_margincartouche}, "-",1, 1)));
 BA.debugLineNum = 282;BA.debugLine="btnOK.Initialize(\"btnOK\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_btnok").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnOK")));
 BA.debugLineNum = 283;BA.debugLine="btnOK.Text = strBtnOKTxt";
Debug.ShouldStop(67108864);
__ref.getField(false,"_btnok").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_strbtnoktxt")));
 BA.debugLineNum = 284;BA.debugLine="pnlCartouche.AddView(btnOK, edtFilename.Width + (";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlcartouche").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnok").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_edtfilename").runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_margincartouche}, "*",0, 1))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_margincartouche,clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),(Object)(_largeurbtn),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteurcartouche,_margincartouche}, "-",1, 1)));
 BA.debugLineNum = 286;BA.debugLine="pnlCadre.AddView(pnlFiles, MarginBord, MarginBord";
Debug.ShouldStop(536870912);
__ref.getField(false,"_pnlcadre").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlfiles").getObject())),(Object)(_marginbord),(Object)(_marginbord),(Object)(RemoteObject.solve(new RemoteObject[] {_largeur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteur,_hauteurcartouche,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1))}, "--",2, 1)));
 BA.debugLineNum = 287;BA.debugLine="pnlCadre.AddView(pnlCartouche, MarginBord, Hauteu";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlcadre").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlcartouche").getObject())),(Object)(_marginbord),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteur,_hauteurcartouche,_marginbord}, "--",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_largeur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1))}, "-",1, 1)),(Object)(_hauteurcartouche));
 BA.debugLineNum = 288;BA.debugLine="pnlMasque.AddView(pnlCadre, DialogRect.Left, Dial";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlmasque").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlcadre").getObject())),(Object)(__ref.getField(false,"_dialogrect").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_dialogrect").runMethod(true,"getTop")),(Object)(_largeur),(Object)(_hauteur));
 BA.debugLineNum = 289;BA.debugLine="actEcran.AddView(pnlMasque, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(1);
__ref.getField(false,"_actecran").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlmasque").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(clsexplorer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(clsexplorer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 291;BA.debugLine="If strChemin.EndsWith(\"/\") And strChemin <> \"/\" T";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_strchemin").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("/")))) && RemoteObject.solveBoolean("!",__ref.getField(true,"_strchemin"),BA.ObjectToString("/"))) { 
__ref.setField ("_strchemin",__ref.getField(true,"_strchemin").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_strchemin").runMethod(true,"length"))));};
 BA.debugLineNum = 292;BA.debugLine="ReadFolder(strChemin)";
Debug.ShouldStop(8);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_readfolder",(Object)(__ref.getField(true,"_strchemin")));
 BA.debugLineNum = 293;BA.debugLine="CommonExplorer";
Debug.ShouldStop(16);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_commonexplorer");
 BA.debugLineNum = 294;BA.debugLine="End Sub";
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
public static RemoteObject  _explorer2(RemoteObject __ref,RemoteObject _darktheme) throws Exception{
try {
		Debug.PushSubsStack("Explorer2 (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("explorer2")) return __ref.runUserSub(false, "clsexplorer","explorer2", __ref, _darktheme);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _marginbord = RemoteObject.createImmutable(0);
RemoteObject _margin = RemoteObject.createImmutable(0);
RemoteObject _margincartouche = RemoteObject.createImmutable(0);
RemoteObject _hauteurcartouche = RemoteObject.createImmutable(0);
RemoteObject _largeurbtn = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _largeur = RemoteObject.createImmutable(0);
RemoteObject _hauteur = RemoteObject.createImmutable(0);
Debug.locals.put("DarkTheme", _darktheme);
 BA.debugLineNum = 326;BA.debugLine="Public Sub Explorer2(DarkTheme As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 330;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(512);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 331;BA.debugLine="Dim MarginBord As Int: MarginBord = 19dip";
Debug.ShouldStop(1024);
_marginbord = RemoteObject.createImmutable(0);Debug.locals.put("MarginBord", _marginbord);
 BA.debugLineNum = 331;BA.debugLine="Dim MarginBord As Int: MarginBord = 19dip";
Debug.ShouldStop(1024);
_marginbord = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 19)));Debug.locals.put("MarginBord", _marginbord);
 BA.debugLineNum = 332;BA.debugLine="Dim Margin As Int: Margin = 4dip";
Debug.ShouldStop(2048);
_margin = RemoteObject.createImmutable(0);Debug.locals.put("Margin", _margin);
 BA.debugLineNum = 332;BA.debugLine="Dim Margin As Int: Margin = 4dip";
Debug.ShouldStop(2048);
_margin = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("Margin", _margin);
 BA.debugLineNum = 333;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
Debug.ShouldStop(4096);
_margincartouche = RemoteObject.createImmutable(0);Debug.locals.put("MarginCartouche", _margincartouche);
 BA.debugLineNum = 333;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
Debug.ShouldStop(4096);
_margincartouche = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)));Debug.locals.put("MarginCartouche", _margincartouche);
 BA.debugLineNum = 334;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
Debug.ShouldStop(8192);
_hauteurcartouche = RemoteObject.createImmutable(0);Debug.locals.put("HauteurCartouche", _hauteurcartouche);
 BA.debugLineNum = 334;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
Debug.ShouldStop(8192);
_hauteurcartouche = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)));Debug.locals.put("HauteurCartouche", _hauteurcartouche);
 BA.debugLineNum = 335;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
Debug.ShouldStop(16384);
_largeurbtn = RemoteObject.createImmutable(0);Debug.locals.put("LargeurBtn", _largeurbtn);
 BA.debugLineNum = 335;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
Debug.ShouldStop(16384);
_largeurbtn = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 70)));Debug.locals.put("LargeurBtn", _largeurbtn);
 BA.debugLineNum = 337;BA.debugLine="pnlMasque.Initialize(\"\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlmasque").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 338;BA.debugLine="Dim id As Int";
Debug.ShouldStop(131072);
_id = RemoteObject.createImmutable(0);Debug.locals.put("id", _id);
 BA.debugLineNum = 339;BA.debugLine="If DarkTheme Then";
Debug.ShouldStop(262144);
if (_darktheme.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 340;BA.debugLine="id = r.GetStaticField(\"android.R$drawable\", \"ale";
Debug.ShouldStop(524288);
_id = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.R$drawable")),(Object)(RemoteObject.createImmutable("alert_dark_frame"))));Debug.locals.put("id", _id);
 }else {
 BA.debugLineNum = 342;BA.debugLine="id = r.GetStaticField(\"android.R$drawable\", \"ale";
Debug.ShouldStop(2097152);
_id = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.R$drawable")),(Object)(RemoteObject.createImmutable("alert_light_frame"))));Debug.locals.put("id", _id);
 };
 BA.debugLineNum = 344;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(8388608);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 345;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(16777216);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 346;BA.debugLine="pnlMasque.Background = r.RunMethod2(\"getDrawable\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlmasque").runMethod(false,"setBackground",(_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_id)),(Object)(RemoteObject.createImmutable("java.lang.int")))));
 BA.debugLineNum = 347;BA.debugLine="r.Target = pnlMasque";
Debug.ShouldStop(67108864);
_r.setField ("Target",(__ref.getField(false,"_pnlmasque").getObject()));
 BA.debugLineNum = 348;BA.debugLine="r.SetOnTouchListener(\"pnl_BlockTouch\")";
Debug.ShouldStop(134217728);
_r.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnl_BlockTouch")));
 BA.debugLineNum = 350;BA.debugLine="BackgroundColor = Colors.Transparent";
Debug.ShouldStop(536870912);
__ref.setField ("_backgroundcolor",clsexplorer.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 351;BA.debugLine="pnlFiles.Initialize(\"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_pnlfiles").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 352;BA.debugLine="pnlFiles.Color = BackgroundColor";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlfiles").runVoidMethod ("setColor",__ref.getField(true,"_backgroundcolor"));
 BA.debugLineNum = 353;BA.debugLine="svFichiers.Initialize(-1, 0, \"SVF\")";
Debug.ShouldStop(1);
__ref.getField(false,"_svfichiers").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("SVF")));
 BA.debugLineNum = 354;BA.debugLine="svFichiers.Color = BackgroundColor";
Debug.ShouldStop(2);
__ref.getField(false,"_svfichiers").runVoidMethod ("setColor",__ref.getField(true,"_backgroundcolor"));
 BA.debugLineNum = 355;BA.debugLine="Dim Largeur, Hauteur As Int";
Debug.ShouldStop(4);
_largeur = RemoteObject.createImmutable(0);Debug.locals.put("Largeur", _largeur);
_hauteur = RemoteObject.createImmutable(0);Debug.locals.put("Hauteur", _hauteur);
 BA.debugLineNum = 356;BA.debugLine="Largeur = 100%x - (2*MarginBord)";
Debug.ShouldStop(8);
_largeur = RemoteObject.solve(new RemoteObject[] {clsexplorer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1))}, "-",1, 1);Debug.locals.put("Largeur", _largeur);
 BA.debugLineNum = 357;BA.debugLine="Hauteur = 100%y - (2*MarginBord)";
Debug.ShouldStop(16);
_hauteur = RemoteObject.solve(new RemoteObject[] {clsexplorer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_marginbord}, "*",0, 1))}, "-",1, 1);Debug.locals.put("Hauteur", _hauteur);
 BA.debugLineNum = 358;BA.debugLine="pnlFiles.AddView(svFichiers, Margin, Margin, Larg";
Debug.ShouldStop(32);
__ref.getField(false,"_pnlfiles").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_svfichiers").getObject())),(Object)(_margin),(Object)(_margin),(Object)(RemoteObject.solve(new RemoteObject[] {_largeur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_margin}, "*",0, 1))}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_margin}, "*",0, 1)),_hauteurcartouche}, "--",2, 1)));
 BA.debugLineNum = 359;BA.debugLine="r.Target = svFichiers";
Debug.ShouldStop(64);
_r.setField ("Target",(__ref.getField(false,"_svfichiers").getObject()));
 BA.debugLineNum = 360;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
Debug.ShouldStop(128);
_r.runVoidMethod ("SetOnKeyListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_KeyPress")));
 BA.debugLineNum = 361;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
Debug.ShouldStop(256);
_r.runVoidMethod ("SetOnFocusListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_HasFocus")));
 BA.debugLineNum = 362;BA.debugLine="If DarkTheme Then";
Debug.ShouldStop(512);
if (_darktheme.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 363;BA.debugLine="FolderTextColor = Colors.White";
Debug.ShouldStop(1024);
__ref.setField ("_foldertextcolor",clsexplorer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 364;BA.debugLine="FileTextColor1 = Colors.ARGB(220, 255, 255, 255)";
Debug.ShouldStop(2048);
__ref.setField ("_filetextcolor1",clsexplorer.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 220)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 365;BA.debugLine="FileTextColor2 = Colors.ARGB(128, 255, 255, 255)";
Debug.ShouldStop(4096);
__ref.setField ("_filetextcolor2",clsexplorer.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 366;BA.debugLine="DividerColor = Colors.DarkGray";
Debug.ShouldStop(8192);
__ref.setField ("_dividercolor",clsexplorer.__c.getField(false,"Colors").getField(true,"DarkGray"));
 }else {
 BA.debugLineNum = 368;BA.debugLine="FolderTextColor = Colors.Black";
Debug.ShouldStop(32768);
__ref.setField ("_foldertextcolor",clsexplorer.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 369;BA.debugLine="FileTextColor1 = Colors.ARGB(200, 0, 0, 0)";
Debug.ShouldStop(65536);
__ref.setField ("_filetextcolor1",clsexplorer.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 370;BA.debugLine="FileTextColor2 = Colors.ARGB(128, 0, 0, 0)";
Debug.ShouldStop(131072);
__ref.setField ("_filetextcolor2",clsexplorer.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 371;BA.debugLine="DividerColor = Colors.LightGray";
Debug.ShouldStop(262144);
__ref.setField ("_dividercolor",clsexplorer.__c.getField(false,"Colors").getField(true,"LightGray"));
 };
 BA.debugLineNum = 374;BA.debugLine="pnlCartouche.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnlcartouche").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 375;BA.debugLine="pnlCartouche.Color = Colors.Transparent";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pnlcartouche").runVoidMethod ("setColor",clsexplorer.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 376;BA.debugLine="edtFilename.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_edtfilename").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 377;BA.debugLine="edtFilename.TextSize = 16";
Debug.ShouldStop(16777216);
__ref.getField(false,"_edtfilename").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 378;BA.debugLine="edtFilename.InputType = Bit.Or(edtFilename.InputT";
Debug.ShouldStop(33554432);
__ref.getField(false,"_edtfilename").runMethod(true,"setInputType",clsexplorer.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(__ref.getField(false,"_edtfilename").runMethod(true,"getInputType")),(Object)(BA.numberCast(int.class, 0x80000))));
 BA.debugLineNum = 379;BA.debugLine="edtFilename.SingleLine = True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_edtfilename").runVoidMethod ("setSingleLine",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 380;BA.debugLine="edtFilename.Wrap = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_edtfilename").runVoidMethod ("setWrap",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 381;BA.debugLine="r.Target = edtFilename";
Debug.ShouldStop(268435456);
_r.setField ("Target",(__ref.getField(false,"_edtfilename").getObject()));
 BA.debugLineNum = 382;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
Debug.ShouldStop(536870912);
_r.runVoidMethod ("SetOnKeyListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_KeyPress")));
 BA.debugLineNum = 383;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
Debug.ShouldStop(1073741824);
_r.runVoidMethod ("SetOnFocusListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("dlg_HasFocus")));
 BA.debugLineNum = 384;BA.debugLine="pnlCartouche.AddView(edtFilename, MarginCartouche";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pnlcartouche").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_edtfilename").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_margincartouche,clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "+",1, 1)),(Object)(_margincartouche),(Object)(RemoteObject.solve(new RemoteObject[] {_largeur,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3),_margincartouche}, "*",0, 1)),_largeurbtn}, "--",2, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteurcartouche,_margincartouche}, "-",1, 1)));
 BA.debugLineNum = 385;BA.debugLine="btnOK.Initialize(\"btnOK\")";
Debug.ShouldStop(1);
__ref.getField(false,"_btnok").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("btnOK")));
 BA.debugLineNum = 386;BA.debugLine="btnOK.Text = strBtnOKTxt";
Debug.ShouldStop(2);
__ref.getField(false,"_btnok").runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_strbtnoktxt")));
 BA.debugLineNum = 387;BA.debugLine="pnlCartouche.AddView(btnOK, edtFilename.Width + (";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlcartouche").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_btnok").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_edtfilename").runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_margincartouche}, "*",0, 1))}, "+",1, 1)),(Object)(_margincartouche),(Object)(_largeurbtn),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteurcartouche,_margincartouche}, "-",1, 1)));
 BA.debugLineNum = 389;BA.debugLine="pnlMasque.AddView(pnlFiles, MarginBord, MarginBor";
Debug.ShouldStop(16);
__ref.getField(false,"_pnlmasque").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlfiles").getObject())),(Object)(_marginbord),(Object)(RemoteObject.solve(new RemoteObject[] {_marginbord,_margin}, "-",1, 1)),(Object)(_largeur),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteur,_hauteurcartouche}, "-",1, 1)));
 BA.debugLineNum = 390;BA.debugLine="pnlMasque.AddView(pnlCartouche, MarginBord, Haute";
Debug.ShouldStop(32);
__ref.getField(false,"_pnlmasque").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlcartouche").getObject())),(Object)(_marginbord),(Object)(RemoteObject.solve(new RemoteObject[] {_hauteur,_hauteurcartouche,__ref.getField(false,"_pnlfiles").runMethod(true,"getTop")}, "-+",2, 1)),(Object)(_largeur),(Object)(_hauteurcartouche));
 BA.debugLineNum = 391;BA.debugLine="actEcran.AddView(pnlMasque, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(64);
__ref.getField(false,"_actecran").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlmasque").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(clsexplorer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(clsexplorer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 393;BA.debugLine="If strChemin.EndsWith(\"/\") And strChemin <> \"/\" T";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_strchemin").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("/")))) && RemoteObject.solveBoolean("!",__ref.getField(true,"_strchemin"),BA.ObjectToString("/"))) { 
__ref.setField ("_strchemin",__ref.getField(true,"_strchemin").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_strchemin").runMethod(true,"length"))));};
 BA.debugLineNum = 394;BA.debugLine="ReadFolder(strChemin)";
Debug.ShouldStop(512);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_readfolder",(Object)(__ref.getField(true,"_strchemin")));
 BA.debugLineNum = 395;BA.debugLine="CommonExplorer";
Debug.ShouldStop(1024);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_commonexplorer");
 BA.debugLineNum = 396;BA.debugLine="End Sub";
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
public static RemoteObject  _explorermulti(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExplorerMulti (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("explorermulti")) return __ref.runUserSub(false, "clsexplorer","explorermulti", __ref);
 BA.debugLineNum = 308;BA.debugLine="Public Sub ExplorerMulti";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="bMultiFolderSelection = bOnlyFolders";
Debug.ShouldStop(1048576);
__ref.setField ("_bmultifolderselection",__ref.getField(true,"_bonlyfolders"));
 BA.debugLineNum = 310;BA.debugLine="bMultiFileSelection = Not(bOnlyFolders)";
Debug.ShouldStop(2097152);
__ref.setField ("_bmultifileselection",clsexplorer.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_bonlyfolders"))));
 BA.debugLineNum = 311;BA.debugLine="Explorer";
Debug.ShouldStop(4194304);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_explorer");
 BA.debugLineNum = 312;BA.debugLine="End Sub";
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
public static RemoteObject  _explorermulti2(RemoteObject __ref,RemoteObject _darktheme) throws Exception{
try {
		Debug.PushSubsStack("ExplorerMulti2 (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,410);
if (RapidSub.canDelegate("explorermulti2")) return __ref.runUserSub(false, "clsexplorer","explorermulti2", __ref, _darktheme);
Debug.locals.put("DarkTheme", _darktheme);
 BA.debugLineNum = 410;BA.debugLine="Public Sub ExplorerMulti2(DarkTheme As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 411;BA.debugLine="bMultiFolderSelection = bOnlyFolders";
Debug.ShouldStop(67108864);
__ref.setField ("_bmultifolderselection",__ref.getField(true,"_bonlyfolders"));
 BA.debugLineNum = 412;BA.debugLine="bMultiFileSelection = Not(bOnlyFolders)";
Debug.ShouldStop(134217728);
__ref.setField ("_bmultifileselection",clsexplorer.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_bonlyfolders"))));
 BA.debugLineNum = 413;BA.debugLine="Explorer2(DarkTheme)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_explorer2",(Object)(_darktheme));
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity,RemoteObject _defaultfolder,RemoteObject _filter,RemoteObject _visupnl,RemoteObject _onlyfolders,RemoteObject _oktext) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "clsexplorer","initialize", __ref, _ba, _activity, _defaultfolder, _filter, _visupnl, _onlyfolders, _oktext);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _ecart = RemoteObject.createImmutable(0);
RemoteObject _strfiltre = RemoteObject.createImmutable("");
RemoteObject _posvirg = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
Debug.locals.put("DefaultFolder", _defaultfolder);
Debug.locals.put("Filter", _filter);
Debug.locals.put("VisuPnl", _visupnl);
Debug.locals.put("OnlyFolders", _onlyfolders);
Debug.locals.put("OkText", _oktext);
 BA.debugLineNum = 55;BA.debugLine="Public Sub Initialize(Activity As Activity, Defaul";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim Ecart As Int: Ecart = 10dip";
Debug.ShouldStop(8388608);
_ecart = RemoteObject.createImmutable(0);Debug.locals.put("Ecart", _ecart);
 BA.debugLineNum = 56;BA.debugLine="Dim Ecart As Int: Ecart = 10dip";
Debug.ShouldStop(8388608);
_ecart = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)));Debug.locals.put("Ecart", _ecart);
 BA.debugLineNum = 57;BA.debugLine="actEcran = Activity";
Debug.ShouldStop(16777216);
__ref.setField ("_actecran",_activity);
 BA.debugLineNum = 58;BA.debugLine="strChemin = DefaultFolder";
Debug.ShouldStop(33554432);
__ref.setField ("_strchemin",_defaultfolder);
 BA.debugLineNum = 59;BA.debugLine="lstFiltre.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lstfiltre").runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="Dim strFiltre As String, PosVirg As Int";
Debug.ShouldStop(134217728);
_strfiltre = RemoteObject.createImmutable("");Debug.locals.put("strFiltre", _strfiltre);
_posvirg = RemoteObject.createImmutable(0);Debug.locals.put("PosVirg", _posvirg);
 BA.debugLineNum = 61;BA.debugLine="strFiltre = Filter.ToLowerCase";
Debug.ShouldStop(268435456);
_strfiltre = _filter.runMethod(true,"toLowerCase");Debug.locals.put("strFiltre", _strfiltre);
 BA.debugLineNum = 62;BA.debugLine="Do While strFiltre.Contains(\",\")";
Debug.ShouldStop(536870912);
while (_strfiltre.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(","))).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 63;BA.debugLine="PosVirg = strFiltre.IndexOf(\",\")";
Debug.ShouldStop(1073741824);
_posvirg = _strfiltre.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable(",")));Debug.locals.put("PosVirg", _posvirg);
 BA.debugLineNum = 64;BA.debugLine="lstFiltre.Add(strFiltre.SubString2(0, PosVirg).T";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lstfiltre").runVoidMethod ("Add",(Object)((_strfiltre.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_posvirg)).runMethod(true,"trim"))));
 BA.debugLineNum = 65;BA.debugLine="strFiltre = strFiltre.SubString(PosVirg + 1)";
Debug.ShouldStop(1);
_strfiltre = _strfiltre.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_posvirg,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("strFiltre", _strfiltre);
 }
;
 BA.debugLineNum = 67;BA.debugLine="lstFiltre.Add(strFiltre.Trim)";
Debug.ShouldStop(4);
__ref.getField(false,"_lstfiltre").runVoidMethod ("Add",(Object)((_strfiltre.runMethod(true,"trim"))));
 BA.debugLineNum = 68;BA.debugLine="bOnlyFolders = OnlyFolders";
Debug.ShouldStop(8);
__ref.setField ("_bonlyfolders",_onlyfolders);
 BA.debugLineNum = 69;BA.debugLine="bVisualiser = VisuPnl";
Debug.ShouldStop(16);
__ref.setField ("_bvisualiser",_visupnl);
 BA.debugLineNum = 70;BA.debugLine="bMultiFolderSelection = False";
Debug.ShouldStop(32);
__ref.setField ("_bmultifolderselection",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="bMultiFileSelection = False";
Debug.ShouldStop(64);
__ref.setField ("_bmultifileselection",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 72;BA.debugLine="strBtnOKTxt = OkText";
Debug.ShouldStop(128);
__ref.setField ("_strbtnoktxt",_oktext);
 BA.debugLineNum = 73;BA.debugLine="FastScrollEnabled = False";
Debug.ShouldStop(256);
__ref.setField ("_fastscrollenabled",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="Ellipsis = True";
Debug.ShouldStop(512);
__ref.setField ("_ellipsis",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 75;BA.debugLine="BorderColor = Colors.RGB(25, 90, 179)";
Debug.ShouldStop(1024);
__ref.setField ("_bordercolor",clsexplorer.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 25)),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.numberCast(int.class, 179))));
 BA.debugLineNum = 76;BA.debugLine="BackgroundColor = Colors.RGB(19, 27, 67)";
Debug.ShouldStop(2048);
__ref.setField ("_backgroundcolor",clsexplorer.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 19)),(Object)(BA.numberCast(int.class, 27)),(Object)(BA.numberCast(int.class, 67))));
 BA.debugLineNum = 77;BA.debugLine="FolderTextColor = Colors.White";
Debug.ShouldStop(4096);
__ref.setField ("_foldertextcolor",clsexplorer.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 78;BA.debugLine="FileTextColor1 = Colors.RGB(116, 172, 232)";
Debug.ShouldStop(8192);
__ref.setField ("_filetextcolor1",clsexplorer.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 116)),(Object)(BA.numberCast(int.class, 172)),(Object)(BA.numberCast(int.class, 232))));
 BA.debugLineNum = 79;BA.debugLine="FileTextColor2 = Colors.Gray";
Debug.ShouldStop(16384);
__ref.setField ("_filetextcolor2",clsexplorer.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 80;BA.debugLine="DividerColor = Colors.DarkGray";
Debug.ShouldStop(32768);
__ref.setField ("_dividercolor",clsexplorer.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 81;BA.debugLine="DialogRect.Initialize(Ecart, Ecart, 100%x - Ecart";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialogrect").runVoidMethod ("Initialize",(Object)(_ecart),(Object)(_ecart),(Object)(RemoteObject.solve(new RemoteObject[] {clsexplorer.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_ecart}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {clsexplorer.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_ecart}, "-",1, 1)));
 BA.debugLineNum = 82;BA.debugLine="WaitUntilOK = True";
Debug.ShouldStop(131072);
__ref.setField ("_waituntilok",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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
public static RemoteObject  _initializefilelist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeFileList (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("initializefilelist")) return __ref.runUserSub(false, "clsexplorer","initializefilelist", __ref);
 BA.debugLineNum = 101;BA.debugLine="Private Sub InitializeFileList";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="lstFichiers.Initialize(Me, svFichiers, \"\", \"lstFi";
Debug.ShouldStop(32);
__ref.getField(false,"_lstfichiers").runClassMethod (com.bcleaner.clschecklist.class, "_initialize",__ref.getField(false, "ba"),(Object)(__ref),(Object)(__ref.getField(false,"_svfichiers")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("lstFichiers_Click")),(Object)(BA.ObjectToString("lstFichiers_LongClick")),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 103;BA.debugLine="lstFichiers.BackgroundColor = BackgroundColor";
Debug.ShouldStop(64);
__ref.getField(false,"_lstfichiers").setField ("_backgroundcolor",__ref.getField(true,"_backgroundcolor"));
 BA.debugLineNum = 104;BA.debugLine="lstFichiers.DividerColor = DividerColor";
Debug.ShouldStop(128);
__ref.getField(false,"_lstfichiers").setField ("_dividercolor",__ref.getField(true,"_dividercolor"));
 BA.debugLineNum = 105;BA.debugLine="svFichiers.VerticalScrollPosition = 0";
Debug.ShouldStop(256);
__ref.getField(false,"_svfichiers").runMethod(true,"setVerticalScrollPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
public static RemoteObject  _initializescrollpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeScrollPanel (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,701);
if (RapidSub.canDelegate("initializescrollpanel")) return __ref.runUserSub(false, "clsexplorer","initializescrollpanel", __ref);
RemoteObject _spwidth = RemoteObject.createImmutable(0);
RemoteObject _spheight = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
 BA.debugLineNum = 701;BA.debugLine="Private Sub InitializeScrollPanel";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 702;BA.debugLine="Dim spWidth As Int = 64dip";
Debug.ShouldStop(536870912);
_spwidth = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)));Debug.locals.put("spWidth", _spwidth);Debug.locals.put("spWidth", _spwidth);
 BA.debugLineNum = 703;BA.debugLine="Dim spHeight As Int = 52dip";
Debug.ShouldStop(1073741824);
_spheight = clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 52)));Debug.locals.put("spHeight", _spheight);Debug.locals.put("spHeight", _spheight);
 BA.debugLineNum = 705;BA.debugLine="pnlRange.Initialize(\"\")";
Debug.ShouldStop(1);
__ref.getField(false,"_pnlrange").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 706;BA.debugLine="pnlFiles.AddView(pnlRange, svFichiers.Left + svFi";
Debug.ShouldStop(2);
__ref.getField(false,"_pnlfiles").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnlrange").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svfichiers").runMethod(true,"getLeft"),__ref.getField(false,"_svfichiers").runMethod(true,"getWidth"),_spwidth}, "+-",2, 1)),(Object)(__ref.getField(false,"_svfichiers").runMethod(true,"getTop")),(Object)(_spwidth),(Object)(__ref.getField(false,"_svfichiers").runMethod(true,"getHeight")));
 BA.debugLineNum = 707;BA.debugLine="pnlRange.Visible = False";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlrange").runMethod(true,"setVisible",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 708;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 709;BA.debugLine="r.Target = pnlRange";
Debug.ShouldStop(16);
_r.setField ("Target",(__ref.getField(false,"_pnlrange").getObject()));
 BA.debugLineNum = 710;BA.debugLine="r.SetOnTouchListener(\"SP_Touch\")";
Debug.ShouldStop(32);
_r.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SP_Touch")));
 BA.debugLineNum = 712;BA.debugLine="pnlDisplay.Initialize(\"\")";
Debug.ShouldStop(128);
__ref.getField(false,"_pnldisplay").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 713;BA.debugLine="pnlRange.AddView(pnlDisplay, 0, 0, spWidth, spHei";
Debug.ShouldStop(256);
__ref.getField(false,"_pnlrange").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_pnldisplay").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_spwidth),(Object)(_spheight));
 BA.debugLineNum = 714;BA.debugLine="pnlDisplay.Background = LoadDrawable(\"scrollbar_h";
Debug.ShouldStop(512);
__ref.getField(false,"_pnldisplay").runMethod(false,"setBackground",(__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_loaddrawable",(Object)(RemoteObject.createImmutable("scrollbar_handle_accelerated_anim2")))));
 BA.debugLineNum = 716;BA.debugLine="r.Target = r.RunStaticMethod(\"android.view.ViewCo";
Debug.ShouldStop(2048);
_r.setField ("Target",_r.runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("android.view.ViewConfiguration")),(Object)(BA.ObjectToString("get")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_r.runMethod(false,"GetContext",__ref.getField(false, "ba")))})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.content.Context")}))));
 BA.debugLineNum = 717;BA.debugLine="Duration = r.RunMethod(\"getScrollDefaultDelay\") +";
Debug.ShouldStop(4096);
__ref.setField ("_duration",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getScrollDefaultDelay")))),clsexplorer.__c.getField(false,"Bit").runMethod(true,"ShiftRight",(Object)(BA.numberCast(int.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getScrollBarFadeDuration"))))),(Object)(BA.numberCast(int.class, 1)))}, "+",1, 0)));
 BA.debugLineNum = 718;BA.debugLine="TimeOut.Initialize(\"TimeOut\", 0)";
Debug.ShouldStop(8192);
__ref.getField(false,"_timeout").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("TimeOut")),(Object)(BA.numberCast(long.class, 0)));
 BA.debugLineNum = 719;BA.debugLine="Anim.InitializeTranslate(\"Anim\", 0, 0, spWidth, 0";
Debug.ShouldStop(16384);
__ref.getField(false,"_anim").runVoidMethod ("InitializeTranslate",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Anim")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _spwidth)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 720;BA.debugLine="Anim.Duration = Duration";
Debug.ShouldStop(32768);
__ref.getField(false,"_anim").runMethod(true,"setDuration",BA.numberCast(long.class, __ref.getField(true,"_duration")));
 BA.debugLineNum = 721;BA.debugLine="Anim.RepeatCount = 0";
Debug.ShouldStop(65536);
__ref.getField(false,"_anim").runMethod(true,"setRepeatCount",BA.numberCast(int.class, 0));
 BA.debugLineNum = 723;BA.debugLine="MaxPos = pnlRange.Height - pnlDisplay.Height";
Debug.ShouldStop(262144);
__ref.setField ("_maxpos",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlrange").runMethod(true,"getHeight"),__ref.getField(false,"_pnldisplay").runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 724;BA.debugLine="bUserMovingPnl = False 'Becomes True when the use";
Debug.ShouldStop(524288);
__ref.setField ("_busermovingpnl",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 725;BA.debugLine="bWaitForScroll = True";
Debug.ShouldStop(1048576);
__ref.setField ("_bwaitforscroll",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 726;BA.debugLine="pnlDisplay.Top = CalcNewTop";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pnldisplay").runMethod(true,"setTop",__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_calcnewtop"));
 BA.debugLineNum = 727;BA.debugLine="End Sub";
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
public static RemoteObject  _isactive(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsActive (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("isactive")) return __ref.runUserSub(false, "clsexplorer","isactive", __ref);
 BA.debugLineNum = 467;BA.debugLine="Public Sub IsActive As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 468;BA.debugLine="Return pnlMasque.IsInitialized";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_pnlmasque").runMethod(true,"IsInitialized");
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isimage(RemoteObject __ref,RemoteObject _nomfichier) throws Exception{
try {
		Debug.PushSubsStack("IsImage (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,478);
if (RapidSub.canDelegate("isimage")) return __ref.runUserSub(false, "clsexplorer","isimage", __ref, _nomfichier);
RemoteObject _minus = RemoteObject.createImmutable("");
Debug.locals.put("NomFichier", _nomfichier);
 BA.debugLineNum = 478;BA.debugLine="Private Sub IsImage(NomFichier As String) As Boole";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 479;BA.debugLine="Dim Minus As String";
Debug.ShouldStop(1073741824);
_minus = RemoteObject.createImmutable("");Debug.locals.put("Minus", _minus);
 BA.debugLineNum = 480;BA.debugLine="Minus = NomFichier.ToLowerCase";
Debug.ShouldStop(-2147483648);
_minus = _nomfichier.runMethod(true,"toLowerCase");Debug.locals.put("Minus", _minus);
 BA.debugLineNum = 481;BA.debugLine="Return (Minus.EndsWith(\".bmp\") OR Minus.EndsWith(";
Debug.ShouldStop(1);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".bmp")))) || RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".gif")))) || RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg")))) || RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))));
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istext(RemoteObject __ref,RemoteObject _nomfichier) throws Exception{
try {
		Debug.PushSubsStack("IsText (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("istext")) return __ref.runUserSub(false, "clsexplorer","istext", __ref, _nomfichier);
RemoteObject _minus = RemoteObject.createImmutable("");
Debug.locals.put("NomFichier", _nomfichier);
 BA.debugLineNum = 549;BA.debugLine="Private Sub IsText(NomFichier As String) As Boolea";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="Dim Minus As String";
Debug.ShouldStop(32);
_minus = RemoteObject.createImmutable("");Debug.locals.put("Minus", _minus);
 BA.debugLineNum = 551;BA.debugLine="Minus = NomFichier.ToLowerCase";
Debug.ShouldStop(64);
_minus = _nomfichier.runMethod(true,"toLowerCase");Debug.locals.put("Minus", _minus);
 BA.debugLineNum = 552;BA.debugLine="Return (Minus.EndsWith(\".css\") OR Minus.EndsWith(";
Debug.ShouldStop(128);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".css")))) || RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".htm")))) || RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html")))) || RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".txt")))) || RemoteObject.solveBoolean(".",_minus.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xml"))))));
 BA.debugLineNum = 554;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loaddrawable(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("LoadDrawable (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,730);
if (RapidSub.canDelegate("loaddrawable")) return __ref.runUserSub(false, "clsexplorer","loaddrawable", __ref, _name);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _id_drawable = RemoteObject.createImmutable(0);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 730;BA.debugLine="Private Sub LoadDrawable(Name As String) As Object";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 731;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(67108864);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 732;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(134217728);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 733;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(268435456);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 734;BA.debugLine="r.Target = r.RunMethod(\"getSystem\")";
Debug.ShouldStop(536870912);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSystem"))));
 BA.debugLineNum = 735;BA.debugLine="Dim ID_Drawable As Int";
Debug.ShouldStop(1073741824);
_id_drawable = RemoteObject.createImmutable(0);Debug.locals.put("ID_Drawable", _id_drawable);
 BA.debugLineNum = 736;BA.debugLine="ID_Drawable = r.RunMethod4(\"getIdentifier\", Array";
Debug.ShouldStop(-2147483648);
_id_drawable = BA.numberCast(int.class, _r.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("getIdentifier")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_name),RemoteObject.createImmutable(("drawable")),(RemoteObject.createImmutable("android"))})),(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("java.lang.String"),BA.ObjectToString("java.lang.String"),RemoteObject.createImmutable("java.lang.String")}))));Debug.locals.put("ID_Drawable", _id_drawable);
 BA.debugLineNum = 738;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(2);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 739;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(4);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 740;BA.debugLine="Return r.RunMethod2(\"getDrawable\", ID_Drawable, \"";
Debug.ShouldStop(8);
if (true) return _r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_id_drawable)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 741;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lstfichiers_click(RemoteObject __ref,RemoteObject _item,RemoteObject _itemtag) throws Exception{
try {
		Debug.PushSubsStack("lstFichiers_Click (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,595);
if (RapidSub.canDelegate("lstfichiers_click")) return __ref.runUserSub(false, "clsexplorer","lstfichiers_click", __ref, _item, _itemtag);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _posslash = RemoteObject.createImmutable(0);
RemoteObject _parentpath = RemoteObject.createImmutable("");
RemoteObject _newpath = RemoteObject.createImmutable("");
RemoteObject _cbx = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("Item", _item);
Debug.locals.put("ItemTag", _itemtag);
 BA.debugLineNum = 595;BA.debugLine="Private Sub lstFichiers_Click(Item As Panel, ItemT";
Debug.ShouldStop(262144);
 BA.debugLineNum = 596;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(524288);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 597;BA.debugLine="If Item.GetView(0) Is CheckBox Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("i",_item.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObjectOrNull(), RemoteObject.createImmutable("android.widget.CheckBox"))) { 
 BA.debugLineNum = 598;BA.debugLine="lbl = Item.GetView(1)";
Debug.ShouldStop(2097152);
_lbl.setObject(_item.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());
 }else {
 BA.debugLineNum = 600;BA.debugLine="lbl = Item.GetView(0)";
Debug.ShouldStop(8388608);
_lbl.setObject(_item.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 };
 BA.debugLineNum = 602;BA.debugLine="If lbl.Text = \"/ ..\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_lbl.runMethod(true,"getText"),BA.ObjectToString("/ .."))) { 
 BA.debugLineNum = 604;BA.debugLine="Dim PosSlash As Int, ParentPath As String";
Debug.ShouldStop(134217728);
_posslash = RemoteObject.createImmutable(0);Debug.locals.put("PosSlash", _posslash);
_parentpath = RemoteObject.createImmutable("");Debug.locals.put("ParentPath", _parentpath);
 BA.debugLineNum = 605;BA.debugLine="PosSlash = strChemin.LastIndexOf(\"/\")";
Debug.ShouldStop(268435456);
_posslash = __ref.getField(true,"_strchemin").runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("/")));Debug.locals.put("PosSlash", _posslash);
 BA.debugLineNum = 606;BA.debugLine="ParentPath = strChemin.SubString2(0, PosSlash)";
Debug.ShouldStop(536870912);
_parentpath = __ref.getField(true,"_strchemin").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_posslash));Debug.locals.put("ParentPath", _parentpath);
 BA.debugLineNum = 607;BA.debugLine="If ParentPath = \"\" Then ParentPath = \"/\"";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_parentpath,BA.ObjectToString(""))) { 
_parentpath = BA.ObjectToString("/");Debug.locals.put("ParentPath", _parentpath);};
 BA.debugLineNum = 608;BA.debugLine="ReadFolder(ParentPath)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_readfolder",(Object)(_parentpath));
 BA.debugLineNum = 609;BA.debugLine="If bOnlyFolders Then";
Debug.ShouldStop(1);
if (__ref.getField(true,"_bonlyfolders").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 610;BA.debugLine="edtFilename.Text = ParentPath";
Debug.ShouldStop(2);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_parentpath));
 BA.debugLineNum = 611;BA.debugLine="edtFilename.RequestFocus";
Debug.ShouldStop(4);
__ref.getField(false,"_edtfilename").runVoidMethod ("RequestFocus");
 }else {
 BA.debugLineNum = 613;BA.debugLine="edtFilename.Text = \"\"";
Debug.ShouldStop(16);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 }else 
{ BA.debugLineNum = 615;BA.debugLine="Else If lbl.Text.StartsWith(\"/ \") Then";
Debug.ShouldStop(64);
if (_lbl.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("/ "))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 617;BA.debugLine="Dim NewPath As String";
Debug.ShouldStop(256);
_newpath = RemoteObject.createImmutable("");Debug.locals.put("NewPath", _newpath);
 BA.debugLineNum = 618;BA.debugLine="If strChemin = \"/\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_strchemin"),BA.ObjectToString("/"))) { 
 BA.debugLineNum = 619;BA.debugLine="NewPath = strChemin & lbl.Text.SubString(2)";
Debug.ShouldStop(1024);
_newpath = RemoteObject.concat(__ref.getField(true,"_strchemin"),_lbl.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("NewPath", _newpath);
 }else {
 BA.debugLineNum = 621;BA.debugLine="NewPath = strChemin & \"/\" & lbl.Text.SubString(";
Debug.ShouldStop(4096);
_newpath = RemoteObject.concat(__ref.getField(true,"_strchemin"),RemoteObject.createImmutable("/"),_lbl.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("NewPath", _newpath);
 };
 BA.debugLineNum = 623;BA.debugLine="ReadFolder(NewPath)";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_readfolder",(Object)(_newpath));
 BA.debugLineNum = 624;BA.debugLine="If bOnlyFolders Then";
Debug.ShouldStop(32768);
if (__ref.getField(true,"_bonlyfolders").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 625;BA.debugLine="edtFilename.Text = NewPath";
Debug.ShouldStop(65536);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_newpath));
 BA.debugLineNum = 626;BA.debugLine="edtFilename.SelectionStart = edtFilename.Text.L";
Debug.ShouldStop(131072);
__ref.getField(false,"_edtfilename").runMethod(true,"setSelectionStart",__ref.getField(false,"_edtfilename").runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 627;BA.debugLine="edtFilename.RequestFocus";
Debug.ShouldStop(262144);
__ref.getField(false,"_edtfilename").runVoidMethod ("RequestFocus");
 }else {
 BA.debugLineNum = 629;BA.debugLine="edtFilename.Text = \"\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 }else {
 BA.debugLineNum = 633;BA.debugLine="If bVisualiser Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_bvisualiser").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 634;BA.debugLine="If IsImage(lbl.Text) Then";
Debug.ShouldStop(33554432);
if (__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_isimage",(Object)(_lbl.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 635;BA.debugLine="AfficherImage(lbl.Text)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_afficherimage",(Object)(_lbl.runMethod(true,"getText")));
 }else 
{ BA.debugLineNum = 636;BA.debugLine="Else If IsText(lbl.Text) Then";
Debug.ShouldStop(134217728);
if (__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_istext",(Object)(_lbl.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 637;BA.debugLine="AfficherTexte(lbl.Text)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_affichertexte",(Object)(_lbl.runMethod(true,"getText")));
 }};
 };
 BA.debugLineNum = 640;BA.debugLine="If bMultiFileSelection Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(true,"_bmultifileselection").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 641;BA.debugLine="Dim cbx As CheckBox";
Debug.ShouldStop(1);
_cbx = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("cbx", _cbx);
 BA.debugLineNum = 642;BA.debugLine="cbx = Item.GetView(0)";
Debug.ShouldStop(2);
_cbx.setObject(_item.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 BA.debugLineNum = 643;BA.debugLine="cbx.Checked = True";
Debug.ShouldStop(4);
_cbx.runMethodAndSync(true,"setChecked",clsexplorer.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 645;BA.debugLine="edtFilename.Text = lbl.Text";
Debug.ShouldStop(16);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_lbl.runMethod(true,"getText")));
 };
 BA.debugLineNum = 647;BA.debugLine="edtFilename.SelectionStart = edtFilename.Text.Le";
Debug.ShouldStop(64);
__ref.getField(false,"_edtfilename").runMethod(true,"setSelectionStart",__ref.getField(false,"_edtfilename").runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 648;BA.debugLine="edtFilename.RequestFocus";
Debug.ShouldStop(128);
__ref.getField(false,"_edtfilename").runVoidMethod ("RequestFocus");
 }};
 BA.debugLineNum = 650;BA.debugLine="End Sub";
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
public static RemoteObject  _lstfichiers_longclick(RemoteObject __ref,RemoteObject _item,RemoteObject _itemtag) throws Exception{
try {
		Debug.PushSubsStack("lstFichiers_LongClick (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,652);
if (RapidSub.canDelegate("lstfichiers_longclick")) return __ref.runUserSub(false, "clsexplorer","lstfichiers_longclick", __ref, _item, _itemtag);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("Item", _item);
Debug.locals.put("ItemTag", _itemtag);
 BA.debugLineNum = 652;BA.debugLine="Private Sub lstFichiers_LongClick(Item As Panel, I";
Debug.ShouldStop(2048);
 BA.debugLineNum = 653;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(4096);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 654;BA.debugLine="If Item.GetView(0) Is CheckBox Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("i",_item.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObjectOrNull(), RemoteObject.createImmutable("android.widget.CheckBox"))) { 
 BA.debugLineNum = 655;BA.debugLine="lbl = Item.GetView(1)";
Debug.ShouldStop(16384);
_lbl.setObject(_item.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());
 }else {
 BA.debugLineNum = 657;BA.debugLine="lbl = Item.GetView(0)";
Debug.ShouldStop(65536);
_lbl.setObject(_item.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 };
 BA.debugLineNum = 659;BA.debugLine="ToastMessageShow(lbl.Text, False)";
Debug.ShouldStop(262144);
clsexplorer.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(_lbl.runMethod(true,"getText"))),(Object)(clsexplorer.__c.getField(true,"False")));
 BA.debugLineNum = 660;BA.debugLine="End Sub";
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
public static RemoteObject  _lstmulti_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("lstMulti_CheckedChange (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,662);
if (RapidSub.canDelegate("lstmulti_checkedchange")) return __ref.runUserSub(false, "clsexplorer","lstmulti_checkedchange", __ref, _checked);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
int _i = 0;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 662;BA.debugLine="Private Sub lstMulti_CheckedChange(Checked As Bool";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 663;BA.debugLine="Dim L As List = lstFichiers.CheckedPanels";
Debug.ShouldStop(4194304);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = __ref.getField(false,"_lstfichiers").runClassMethod (com.bcleaner.clschecklist.class, "_checkedpanels");Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 664;BA.debugLine="Dim pnl As Panel, lbl As Label";
Debug.ShouldStop(8388608);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 665;BA.debugLine="edtFilename.Text = \"\"";
Debug.ShouldStop(16777216);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 666;BA.debugLine="For i = 0 To L.Size - 1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_l.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4); _i = ((int)(0 + _i + step4)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 667;BA.debugLine="If edtFilename.Text <> \"\" Then edtFilename.Text";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_edtfilename").runMethod(true,"getText"),BA.ObjectToString(""))) { 
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_edtfilename").runMethod(true,"getText"),RemoteObject.createImmutable(";"))));};
 BA.debugLineNum = 668;BA.debugLine="pnl = L.Get(i)";
Debug.ShouldStop(134217728);
_pnl.setObject(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 669;BA.debugLine="lbl = pnl.GetView(1)";
Debug.ShouldStop(268435456);
_lbl.setObject(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());
 BA.debugLineNum = 670;BA.debugLine="If lbl.Text.StartsWith(\"/ \") Then";
Debug.ShouldStop(536870912);
if (_lbl.runMethod(true,"getText").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("/ "))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 671;BA.debugLine="If strChemin = \"/\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_strchemin"),BA.ObjectToString("/"))) { 
 BA.debugLineNum = 672;BA.debugLine="edtFilename.Text = edtFilename.Text & strChemi";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_edtfilename").runMethod(true,"getText"),__ref.getField(true,"_strchemin"),_lbl.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))))));
 }else {
 BA.debugLineNum = 674;BA.debugLine="edtFilename.Text = edtFilename.Text & strChemi";
Debug.ShouldStop(2);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_edtfilename").runMethod(true,"getText"),__ref.getField(true,"_strchemin"),RemoteObject.createImmutable("/"),_lbl.runMethod(true,"getText").runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2))))));
 };
 }else {
 BA.debugLineNum = 677;BA.debugLine="edtFilename.Text = edtFilename.Text & lbl.Text";
Debug.ShouldStop(16);
__ref.getField(false,"_edtfilename").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(__ref.getField(false,"_edtfilename").runMethod(true,"getText"),_lbl.runMethod(true,"getText"))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 680;BA.debugLine="edtFilename.SelectionStart = edtFilename.Text.Len";
Debug.ShouldStop(128);
__ref.getField(false,"_edtfilename").runMethod(true,"setSelectionStart",__ref.getField(false,"_edtfilename").runMethod(true,"getText").runMethod(true,"length"));
 BA.debugLineNum = 681;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnl_blocktouch(RemoteObject __ref,RemoteObject _viewtag,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("pnl_BlockTouch (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,434);
if (RapidSub.canDelegate("pnl_blocktouch")) return __ref.runUserSub(false, "clsexplorer","pnl_blocktouch", __ref, _viewtag, _action, _x, _y, _motionevent);
Debug.locals.put("ViewTag", _viewtag);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 434;BA.debugLine="Private Sub pnl_BlockTouch(ViewTag As Object, Acti";
Debug.ShouldStop(131072);
 BA.debugLineNum = 435;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) return clsexplorer.__c.getField(true,"True");
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlvisu_close(RemoteObject __ref,RemoteObject _viewtag) throws Exception{
try {
		Debug.PushSubsStack("pnlVisu_Close (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,472);
if (RapidSub.canDelegate("pnlvisu_close")) return __ref.runUserSub(false, "clsexplorer","pnlvisu_close", __ref, _viewtag);
Debug.locals.put("ViewTag", _viewtag);
 BA.debugLineNum = 472;BA.debugLine="Private Sub pnlVisu_Close(ViewTag As Object)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 473;BA.debugLine="svFichiers.Visible = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_svfichiers").runMethod(true,"setVisible",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 474;BA.debugLine="pnlVisu.RemoveView";
Debug.ShouldStop(33554432);
__ref.getField(false,"_pnlvisu").runVoidMethod ("RemoveView");
 BA.debugLineNum = 475;BA.debugLine="pnlVisu = Null";
Debug.ShouldStop(67108864);
__ref.getField(false,"_pnlvisu").setObject (clsexplorer.__c.getField(false,"Null"));
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
public static RemoteObject  _readfolder(RemoteObject __ref,RemoteObject _chemin) throws Exception{
try {
		Debug.PushSubsStack("ReadFolder (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("readfolder")) return __ref.runUserSub(false, "clsexplorer","readfolder", __ref, _chemin);
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstd = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lblwait = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
int _i = 0;
RemoteObject _nomfichier = RemoteObject.createImmutable("");
int _f = 0;
Debug.locals.put("Chemin", _chemin);
 BA.debugLineNum = 158;BA.debugLine="Private Sub ReadFolder(Chemin As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Dim lst, lstD, lstF As List";
Debug.ShouldStop(1073741824);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
_lstd = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstD", _lstd);
_lstf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstF", _lstf);
 BA.debugLineNum = 160;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 161;BA.debugLine="lst = File.ListFiles(Chemin)";
Debug.ShouldStop(1);
_lst = clsexplorer.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_chemin));Debug.locals.put("lst", _lst);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e5.toString()); BA.debugLineNum = 163;BA.debugLine="lst = Null";
Debug.ShouldStop(4);
_lst.setObject(clsexplorer.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 165;BA.debugLine="If lst.IsInitialized Then";
Debug.ShouldStop(16);
if (_lst.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 166;BA.debugLine="InitializeFileList";
Debug.ShouldStop(32);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_initializefilelist");
 BA.debugLineNum = 167;BA.debugLine="DoEvents";
Debug.ShouldStop(64);
clsexplorer.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 168;BA.debugLine="Dim lblWait As Label";
Debug.ShouldStop(128);
_lblwait = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblWait", _lblwait);
 BA.debugLineNum = 169;BA.debugLine="lblWait.Initialize(\"\")";
Debug.ShouldStop(256);
_lblwait.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 170;BA.debugLine="If lst.Size > 30 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 30))) { 
 BA.debugLineNum = 172;BA.debugLine="lblWait.Gravity = Gravity.CENTER_HORIZONTAL + G";
Debug.ShouldStop(2048);
_lblwait.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {clsexplorer.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),clsexplorer.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 173;BA.debugLine="lblWait.Text = \"Please wait...\"";
Debug.ShouldStop(4096);
_lblwait.runMethod(true,"setText",BA.ObjectToCharSequence("Please wait..."));
 BA.debugLineNum = 174;BA.debugLine="lblWait.TextColor = FileTextColor1";
Debug.ShouldStop(8192);
_lblwait.runMethod(true,"setTextColor",__ref.getField(true,"_filetextcolor1"));
 BA.debugLineNum = 175;BA.debugLine="lblWait.TextSize = 18";
Debug.ShouldStop(16384);
_lblwait.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 176;BA.debugLine="lblWait.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(32768);
_lblwait.runMethod(false,"setTypeface",clsexplorer.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 177;BA.debugLine="pnlFiles.AddView(lblWait, 20dip, pnlFiles.Heigh";
Debug.ShouldStop(65536);
__ref.getField(false,"_pnlfiles").runVoidMethod ("AddView",(Object)((_lblwait.getObject())),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getHeight"),RemoteObject.createImmutable(2),clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 13)))}, "/-",1, 0))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnlfiles").runMethod(true,"getWidth"),clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))}, "-",1, 1)),(Object)(clsexplorer.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 26)))));
 BA.debugLineNum = 178;BA.debugLine="DoEvents";
Debug.ShouldStop(131072);
clsexplorer.__c.runVoidMethodAndSync ("DoEvents");
 };
 BA.debugLineNum = 180;BA.debugLine="lstD.Initialize";
Debug.ShouldStop(524288);
_lstd.runVoidMethod ("Initialize");
 BA.debugLineNum = 181;BA.debugLine="lstF.Initialize";
Debug.ShouldStop(1048576);
_lstf.runVoidMethod ("Initialize");
 BA.debugLineNum = 182;BA.debugLine="If Chemin <> \"/\" Then AddEntry(0, \"/ ..\", \"\", Fa";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",_chemin,BA.ObjectToString("/"))) { 
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_addentry",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("/ ..")),(Object)(BA.ObjectToString("")),(Object)(clsexplorer.__c.getField(true,"False")));};
 BA.debugLineNum = 183;BA.debugLine="For i = 0 To lst.Size - 1";
Debug.ShouldStop(4194304);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 184;BA.debugLine="If File.IsDirectory(Chemin, lst.Get(i)) Then";
Debug.ShouldStop(8388608);
if (clsexplorer.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_chemin),(Object)(BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 185;BA.debugLine="lstD.Add(lst.Get(i))";
Debug.ShouldStop(16777216);
_lstd.runVoidMethod ("Add",(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }else 
{ BA.debugLineNum = 186;BA.debugLine="Else If Not(bOnlyFolders) Then";
Debug.ShouldStop(33554432);
if (clsexplorer.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_bonlyfolders"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 187;BA.debugLine="If lstFiltre.Size = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lstfiltre").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 188;BA.debugLine="lstF.Add(lst.Get(i))";
Debug.ShouldStop(134217728);
_lstf.runVoidMethod ("Add",(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }else {
 BA.debugLineNum = 190;BA.debugLine="Dim NomFichier As String";
Debug.ShouldStop(536870912);
_nomfichier = RemoteObject.createImmutable("");Debug.locals.put("NomFichier", _nomfichier);
 BA.debugLineNum = 191;BA.debugLine="NomFichier = lst.Get(i)";
Debug.ShouldStop(1073741824);
_nomfichier = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("NomFichier", _nomfichier);
 BA.debugLineNum = 192;BA.debugLine="NomFichier = NomFichier.ToLowerCase";
Debug.ShouldStop(-2147483648);
_nomfichier = _nomfichier.runMethod(true,"toLowerCase");Debug.locals.put("NomFichier", _nomfichier);
 BA.debugLineNum = 193;BA.debugLine="For f = 0 To lstFiltre.Size - 1";
Debug.ShouldStop(1);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstfiltre").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_f = 0 ; (step34 > 0 && _f <= limit34) || (step34 < 0 && _f >= limit34); _f = ((int)(0 + _f + step34)) ) {
Debug.locals.put("f", _f);
 BA.debugLineNum = 194;BA.debugLine="If NomFichier.EndsWith(lstFiltre.Get(f)) The";
Debug.ShouldStop(2);
if (_nomfichier.runMethod(true,"endsWith",(Object)(BA.ObjectToString(__ref.getField(false,"_lstfiltre").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _f)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 195;BA.debugLine="lstF.Add(lst.Get(i))";
Debug.ShouldStop(4);
_lstf.runVoidMethod ("Add",(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 196;BA.debugLine="Exit";
Debug.ShouldStop(8);
if (true) break;
 };
 }
}Debug.locals.put("f", _f);
;
 };
 }};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 202;BA.debugLine="lstD.SortCaseInsensitive(True)";
Debug.ShouldStop(512);
_lstd.runVoidMethod ("SortCaseInsensitive",(Object)(clsexplorer.__c.getField(true,"True")));
 BA.debugLineNum = 203;BA.debugLine="For i = 0 To lstD.Size - 1";
Debug.ShouldStop(1024);
{
final int step44 = 1;
final int limit44 = RemoteObject.solve(new RemoteObject[] {_lstd.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44); _i = ((int)(0 + _i + step44)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 204;BA.debugLine="AddEntry(lstFichiers.NumberOfItems, \"/ \" & lstD";
Debug.ShouldStop(2048);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_addentry",(Object)(__ref.getField(false,"_lstfichiers").runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/ "),_lstd.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_bmultifolderselection")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 206;BA.debugLine="lstF.SortCaseInsensitive(True)";
Debug.ShouldStop(8192);
_lstf.runVoidMethod ("SortCaseInsensitive",(Object)(clsexplorer.__c.getField(true,"True")));
 BA.debugLineNum = 207;BA.debugLine="For i = 0 To lstF.Size - 1";
Debug.ShouldStop(16384);
{
final int step48 = 1;
final int limit48 = RemoteObject.solve(new RemoteObject[] {_lstf.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48); _i = ((int)(0 + _i + step48)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 208;BA.debugLine="AddEntry(lstFichiers.NumberOfItems, lstF.Get(i)";
Debug.ShouldStop(32768);
__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_addentry",(Object)(__ref.getField(false,"_lstfichiers").runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems")),(Object)(BA.ObjectToString(_lstf.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_displaysize",(Object)(BA.numberCast(double.class, clsexplorer.__c.getField(false,"File").runMethod(true,"Size",(Object)(_chemin),(Object)(BA.ObjectToString(_lstf.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))))))),(Object)(__ref.getField(true,"_bmultifileselection")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 210;BA.debugLine="lstFichiers.ResizePanel";
Debug.ShouldStop(131072);
__ref.getField(false,"_lstfichiers").runClassMethod (com.bcleaner.clschecklist.class, "_resizepanel");
 BA.debugLineNum = 211;BA.debugLine="strChemin = Chemin";
Debug.ShouldStop(262144);
__ref.setField ("_strchemin",_chemin);
 BA.debugLineNum = 212;BA.debugLine="lblWait.RemoveView";
Debug.ShouldStop(524288);
_lblwait.runVoidMethod ("RemoveView");
 }else {
 BA.debugLineNum = 215;BA.debugLine="ToastMessageShow(\"Unable to access folder\", Fals";
Debug.ShouldStop(4194304);
clsexplorer.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Unable to access folder")),(Object)(clsexplorer.__c.getField(true,"False")));
 BA.debugLineNum = 216;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 218;BA.debugLine="End Sub";
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
public static RemoteObject  _sp_touch(RemoteObject __ref,RemoteObject _viewtag,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("SP_Touch (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,787);
if (RapidSub.canDelegate("sp_touch")) return __ref.runUserSub(false, "clsexplorer","sp_touch", __ref, _viewtag, _action, _x, _y, _motionevent);
Debug.locals.put("ViewTag", _viewtag);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 787;BA.debugLine="Private Sub SP_Touch(ViewTag As Object, Action As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 788;BA.debugLine="If Action = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 789;BA.debugLine="If Y < pnlDisplay.Top OR Y > pnlDisplay.Top + pn";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",_y,BA.numberCast(double.class, __ref.getField(false,"_pnldisplay").runMethod(true,"getTop"))) || RemoteObject.solveBoolean(">",_y,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnldisplay").runMethod(true,"getTop"),__ref.getField(false,"_pnldisplay").runMethod(true,"getHeight")}, "+",1, 1)))) { 
 BA.debugLineNum = 791;BA.debugLine="bIgnoreEvent = True";
Debug.ShouldStop(4194304);
__ref.setField ("_bignoreevent",clsexplorer.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 793;BA.debugLine="bIgnoreEvent = False";
Debug.ShouldStop(16777216);
__ref.setField ("_bignoreevent",clsexplorer.__c.getField(true,"False"));
 };
 };
 BA.debugLineNum = 796;BA.debugLine="If bIgnoreEvent Then Return False";
Debug.ShouldStop(134217728);
if (__ref.getField(true,"_bignoreevent").<Boolean>get().booleanValue()) { 
if (true) return clsexplorer.__c.getField(true,"False");};
 BA.debugLineNum = 798;BA.debugLine="Select Case Action";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_action,BA.numberCast(int.class, 0),BA.numberCast(int.class, 2))) {
case 0: 
case 1: {
 BA.debugLineNum = 800;BA.debugLine="bUserMovingPnl = True";
Debug.ShouldStop(-2147483648);
__ref.setField ("_busermovingpnl",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 801;BA.debugLine="TimeOut.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_timeout").runMethod(true,"setEnabled",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 802;BA.debugLine="Anim.Stop(pnlDisplay)";
Debug.ShouldStop(2);
__ref.getField(false,"_anim").runVoidMethod ("Stop",(Object)((__ref.getField(false,"_pnldisplay").getObject())));
 BA.debugLineNum = 803;BA.debugLine="pnlDisplay.Top = Min(Max(0, Y * (1 - (pnlDispla";
Debug.ShouldStop(4);
__ref.getField(false,"_pnldisplay").runMethod(true,"setTop",BA.numberCast(int.class, clsexplorer.__c.runMethod(true,"Min",(Object)(clsexplorer.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_y,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnldisplay").runMethod(true,"getHeight"),__ref.getField(false,"_pnlrange").runMethod(true,"getHeight")}, "/",0, 0))}, "-",1, 0))}, "*",0, 0)))),(Object)(BA.numberCast(double.class, __ref.getField(true,"_maxpos"))))));
 BA.debugLineNum = 804;BA.debugLine="svFichiers.VerticalScrollPosition = pnlDisplay.";
Debug.ShouldStop(8);
__ref.getField(false,"_svfichiers").runMethod(true,"setVerticalScrollPosition",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_pnldisplay").runMethod(true,"getTop"),__ref.getField(true,"_maxpos"),(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_svfichiers").runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(false,"_svfichiers").runMethod(true,"getHeight")}, "-",1, 1))}, "/*",0, 0)));
 break; }
default: {
 BA.debugLineNum = 806;BA.debugLine="bUserMovingPnl = False";
Debug.ShouldStop(32);
__ref.setField ("_busermovingpnl",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 807;BA.debugLine="TimeOut.Interval = Duration";
Debug.ShouldStop(64);
__ref.getField(false,"_timeout").runMethod(true,"setInterval",BA.numberCast(long.class, __ref.getField(true,"_duration")));
 BA.debugLineNum = 808;BA.debugLine="TimeOut.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_timeout").runMethod(true,"setEnabled",clsexplorer.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 810;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) return clsexplorer.__c.getField(true,"True");
 BA.debugLineNum = 811;BA.debugLine="End Sub";
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
public static RemoteObject  _svf_scrollchanged(RemoteObject __ref,RemoteObject _posx,RemoteObject _posy) throws Exception{
try {
		Debug.PushSubsStack("SVF_ScrollChanged (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,757);
if (RapidSub.canDelegate("svf_scrollchanged")) return __ref.runUserSub(false, "clsexplorer","svf_scrollchanged", __ref, _posx, _posy);
Debug.locals.put("PosX", _posx);
Debug.locals.put("PosY", _posy);
 BA.debugLineNum = 757;BA.debugLine="Private Sub SVF_ScrollChanged(PosX As Int, PosY As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 758;BA.debugLine="If Not(FastScrollEnabled) Then Return";
Debug.ShouldStop(2097152);
if (clsexplorer.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_fastscrollenabled"))).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 760;BA.debugLine="If bWaitForScroll Then";
Debug.ShouldStop(8388608);
if (__ref.getField(true,"_bwaitforscroll").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 762;BA.debugLine="If pnlDisplay.Top = CalcNewTop Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_pnldisplay").runMethod(true,"getTop"),BA.numberCast(double.class, __ref.runClassMethod (com.bcleaner.clsexplorer.class, "_calcnewtop")))) { 
 BA.debugLineNum = 763;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 765;BA.debugLine="bWaitForScroll = False";
Debug.ShouldStop(268435456);
__ref.setField ("_bwaitforscroll",clsexplorer.__c.getField(true,"False"));
 };
 };
 BA.debugLineNum = 769;BA.debugLine="If svFichiers.Panel.Height > svFichiers.Height Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_svfichiers").runMethod(false,"getPanel").runMethod(true,"getHeight"),BA.numberCast(double.class, __ref.getField(false,"_svfichiers").runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 771;BA.debugLine="pnlRange.Visible = True";
Debug.ShouldStop(4);
__ref.getField(false,"_pnlrange").runMethod(true,"setVisible",clsexplorer.__c.getField(true,"True"));
 };
 BA.debugLineNum = 774;BA.debugLine="If Not(bUserMovingPnl) Then";
Debug.ShouldStop(32);
if (clsexplorer.__c.runMethod(true,"Not",(Object)(__ref.getField(true,"_busermovingpnl"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 775;BA.debugLine="TimeOut.Enabled = False";
Debug.ShouldStop(64);
__ref.getField(false,"_timeout").runMethod(true,"setEnabled",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 776;BA.debugLine="Anim.Stop(pnlDisplay)";
Debug.ShouldStop(128);
__ref.getField(false,"_anim").runVoidMethod ("Stop",(Object)((__ref.getField(false,"_pnldisplay").getObject())));
 BA.debugLineNum = 777;BA.debugLine="pnlDisplay.Top = CalcNewTop";
Debug.ShouldStop(256);
__ref.getField(false,"_pnldisplay").runMethod(true,"setTop",__ref.runClassMethod (com.bcleaner.clsexplorer.class, "_calcnewtop"));
 BA.debugLineNum = 778;BA.debugLine="If PosY = svFichiers.VerticalScrollPosition Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_posy,BA.numberCast(double.class, __ref.getField(false,"_svfichiers").runMethod(true,"getVerticalScrollPosition")))) { 
 BA.debugLineNum = 780;BA.debugLine="TimeOut.Interval = Duration";
Debug.ShouldStop(2048);
__ref.getField(false,"_timeout").runMethod(true,"setInterval",BA.numberCast(long.class, __ref.getField(true,"_duration")));
 BA.debugLineNum = 781;BA.debugLine="TimeOut.Enabled = True";
Debug.ShouldStop(4096);
__ref.getField(false,"_timeout").runMethod(true,"setEnabled",clsexplorer.__c.getField(true,"True"));
 BA.debugLineNum = 782;BA.debugLine="bWaitForScroll = True";
Debug.ShouldStop(8192);
__ref.setField ("_bwaitforscroll",clsexplorer.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 785;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timeout_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TimeOut_Tick (clsexplorer) ","clsexplorer",4,__ref.getField(false, "ba"),__ref,748);
if (RapidSub.canDelegate("timeout_tick")) return __ref.runUserSub(false, "clsexplorer","timeout_tick", __ref);
 BA.debugLineNum = 748;BA.debugLine="Private Sub TimeOut_Tick";
Debug.ShouldStop(2048);
 BA.debugLineNum = 749;BA.debugLine="TimeOut.Enabled = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_timeout").runMethod(true,"setEnabled",clsexplorer.__c.getField(true,"False"));
 BA.debugLineNum = 750;BA.debugLine="Anim.Start(pnlDisplay)";
Debug.ShouldStop(8192);
__ref.getField(false,"_anim").runVoidMethod ("Start",(Object)((__ref.getField(false,"_pnldisplay").getObject())));
 BA.debugLineNum = 751;BA.debugLine="End Sub";
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
}