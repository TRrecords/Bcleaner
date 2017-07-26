package com.bcleaner;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clschecklist_subs_0 {


public static RemoteObject  _abortdraganddrop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AbortDragAndDrop (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1052);
if (RapidSub.canDelegate("abortdraganddrop")) return __ref.runUserSub(false, "clschecklist","abortdraganddrop", __ref);
 BA.debugLineNum = 1052;BA.debugLine="Public Sub AbortDragAndDrop()";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1053;BA.debugLine="If DragAndDrop.IsInitialized Then";
Debug.ShouldStop(268435456);
if (__ref.getField(false,"_draganddrop").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1054;BA.debugLine="DragAndDrop.RemoveView";
Debug.ShouldStop(536870912);
__ref.getField(false,"_draganddrop").runVoidMethod ("RemoveView");
 BA.debugLineNum = 1055;BA.debugLine="DragAndDrop = Null";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_draganddrop").setObject (clschecklist.__c.getField(false,"Null"));
 BA.debugLineNum = 1056;BA.debugLine="DragAndDropShadow.RemoveView";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_draganddropshadow").runVoidMethod ("RemoveView");
 BA.debugLineNum = 1057;BA.debugLine="DragAndDropShadow = Null";
Debug.ShouldStop(1);
__ref.getField(false,"_draganddropshadow").setObject (clschecklist.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 1059;BA.debugLine="End Sub";
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
public static RemoteObject  _addcustomitem(RemoteObject __ref,RemoteObject _id,RemoteObject _pnl,RemoteObject _pnlheight) throws Exception{
try {
		Debug.PushSubsStack("AddCustomItem (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("addcustomitem")) return __ref.runUserSub(false, "clschecklist","addcustomitem", __ref, _id, _pnl, _pnlheight);
Debug.locals.put("ID", _id);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("pnlHeight", _pnlheight);
 BA.debugLineNum = 228;BA.debugLine="Public Sub AddCustomItem(ID As Object, pnl As Pane";
Debug.ShouldStop(8);
 BA.debugLineNum = 229;BA.debugLine="If pnl.IsInitialized Then";
Debug.ShouldStop(16);
if (_pnl.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 230;BA.debugLine="pnl.Tag = ID";
Debug.ShouldStop(32);
_pnl.runMethod(false,"setTag",_id);
 BA.debugLineNum = 231;BA.debugLine="AddToSV(pnl, pnlHeight, True)";
Debug.ShouldStop(64);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_addtosv",(Object)(_pnl),(Object)(_pnlheight),(Object)(clschecklist.__c.getField(true,"True")));
 };
 BA.debugLineNum = 233;BA.debugLine="End Sub";
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
public static RemoteObject  _addheader(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddHeader (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("addheader")) return __ref.runUserSub(false, "clschecklist","addheader", __ref, _text);
RemoteObject _pnlh = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblb = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cdh = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 236;BA.debugLine="Public Sub AddHeader(Text As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 237;BA.debugLine="Dim pnlH As Panel: pnlH.Initialize(\"\")";
Debug.ShouldStop(4096);
_pnlh = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlH", _pnlh);
 BA.debugLineNum = 237;BA.debugLine="Dim pnlH As Panel: pnlH.Initialize(\"\")";
Debug.ShouldStop(4096);
_pnlh.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 238;BA.debugLine="Dim lblB As Label: lblB.Initialize(\"\")";
Debug.ShouldStop(8192);
_lblb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblB", _lblb);
 BA.debugLineNum = 238;BA.debugLine="Dim lblB As Label: lblB.Initialize(\"\")";
Debug.ShouldStop(8192);
_lblb.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 239;BA.debugLine="Dim cdH As ColorDrawable";
Debug.ShouldStop(16384);
_cdh = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdH", _cdh);
 BA.debugLineNum = 240;BA.debugLine="cdH.Initialize(Colors.ARGB(100, 30, 30, 30), 10)";
Debug.ShouldStop(32768);
_cdh.runVoidMethod ("Initialize",(Object)(clschecklist.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 100)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.numberCast(int.class, 30)))),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 241;BA.debugLine="lblB.Background = cdH";
Debug.ShouldStop(65536);
_lblb.runMethod(false,"setBackground",(_cdh.getObject()));
 BA.debugLineNum = 242;BA.debugLine="lblB.Text = \"   \" & Text";
Debug.ShouldStop(131072);
_lblb.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("   "),_text)));
 BA.debugLineNum = 243;BA.debugLine="lblB.TextColor = Colors.Black";
Debug.ShouldStop(262144);
_lblb.runMethod(true,"setTextColor",clschecklist.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 244;BA.debugLine="lblB.TextSize = 18";
Debug.ShouldStop(524288);
_lblb.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 245;BA.debugLine="lblB.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(1048576);
_lblb.runMethod(false,"setTypeface",clschecklist.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 246;BA.debugLine="lblB.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(2097152);
_lblb.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 247;BA.debugLine="pnlH.AddView(lblB, 0, 0, getWidth, PanelHeight)";
Debug.ShouldStop(4194304);
_pnlh.runVoidMethod ("AddView",(Object)((_lblb.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getwidth")),(Object)(__ref.getField(true,"_panelheight")));
 BA.debugLineNum = 248;BA.debugLine="AddToSV(pnlH, PanelHeight, False)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_addtosv",(Object)(_pnlh),(Object)(__ref.getField(true,"_panelheight")),(Object)(clschecklist.__c.getField(true,"False")));
 BA.debugLineNum = 249;BA.debugLine="PaintBackground(pnlH, False)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_paintbackground",(Object)(_pnlh),(Object)(clschecklist.__c.getField(true,"False")));
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
public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _id,RemoteObject _checked,RemoteObject _text1,RemoteObject _text2,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("AddItem (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("additem")) return __ref.runUserSub(false, "clschecklist","additem", __ref, _id, _checked, _text1, _text2, _image);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _largeurlabel = RemoteObject.createImmutable(0);
RemoteObject _posx = RemoteObject.createImmutable(0);
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("ID", _id);
Debug.locals.put("Checked", _checked);
Debug.locals.put("Text1", _text1);
Debug.locals.put("Text2", _text2);
Debug.locals.put("Image", _image);
 BA.debugLineNum = 132;BA.debugLine="Public Sub AddItem(ID As Object, Checked As Boolea";
Debug.ShouldStop(8);
 BA.debugLineNum = 133;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
Debug.ShouldStop(16);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 133;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
Debug.ShouldStop(16);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 134;BA.debugLine="Dim chk As CheckBox:	chk.Initialize(\"chbSV\")";
Debug.ShouldStop(32);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chk", _chk);
 BA.debugLineNum = 134;BA.debugLine="Dim chk As CheckBox:	chk.Initialize(\"chbSV\")";
Debug.ShouldStop(32);
_chk.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("chbSV")));
 BA.debugLineNum = 135;BA.debugLine="pnl.Tag = ID";
Debug.ShouldStop(64);
_pnl.runMethod(false,"setTag",_id);
 BA.debugLineNum = 136;BA.debugLine="pnl.AddView(chk, 0, 0, ChkBoxSize, PanelHeight)";
Debug.ShouldStop(128);
_pnl.runVoidMethod ("AddView",(Object)((_chk.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_chkboxsize")),(Object)(__ref.getField(true,"_panelheight")));
 BA.debugLineNum = 137;BA.debugLine="Dim LargeurLabel As Int, PosX As Int";
Debug.ShouldStop(256);
_largeurlabel = RemoteObject.createImmutable(0);Debug.locals.put("LargeurLabel", _largeurlabel);
_posx = RemoteObject.createImmutable(0);Debug.locals.put("PosX", _posx);
 BA.debugLineNum = 138;BA.debugLine="LargeurLabel = 150%x";
Debug.ShouldStop(512);
_largeurlabel = clschecklist.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 150)),__ref.getField(false, "ba"));Debug.locals.put("LargeurLabel", _largeurlabel);
 BA.debugLineNum = 139;BA.debugLine="If Not(Image.IsInitialized) Then";
Debug.ShouldStop(1024);
if (clschecklist.__c.runMethod(true,"Not",(Object)(_image.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 140;BA.debugLine="PosX = ChkBoxSize";
Debug.ShouldStop(2048);
_posx = __ref.getField(true,"_chkboxsize");Debug.locals.put("PosX", _posx);
 }else {
 BA.debugLineNum = 142;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
Debug.ShouldStop(8192);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 142;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
Debug.ShouldStop(8192);
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 143;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(16384);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 144;BA.debugLine="bmp = Image";
Debug.ShouldStop(32768);
_bmp = _image;Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 145;BA.debugLine="If NumberFormat(bmp.Width / bmp.Height, 1, 2) =";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",clschecklist.__c.runMethod(true,"NumberFormat",(Object)(RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_bmp.runMethod(true,"getHeight")}, "/",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))),clschecklist.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))))) { 
 BA.debugLineNum = 147;BA.debugLine="iv.Gravity = Gravity.FILL";
Debug.ShouldStop(262144);
_iv.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"FILL"));
 }else {
 BA.debugLineNum = 150;BA.debugLine="bmp = AdjustBitmap(bmp, BitmapSize, BitmapSize)";
Debug.ShouldStop(2097152);
_bmp = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_adjustbitmap",(Object)(_bmp),(Object)(__ref.getField(true,"_bitmapsize")),(Object)(__ref.getField(true,"_bitmapsize")));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 151;BA.debugLine="iv.Gravity = Gravity.NO_GRAVITY";
Debug.ShouldStop(4194304);
_iv.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"NO_GRAVITY"));
 };
 BA.debugLineNum = 153;BA.debugLine="iv.Bitmap = bmp";
Debug.ShouldStop(16777216);
_iv.runMethod(false,"setBitmap",(_bmp.getObject()));
 BA.debugLineNum = 154;BA.debugLine="pnl.AddView(iv, ChkBoxSize, 0, BitmapSize, Bitma";
Debug.ShouldStop(33554432);
_pnl.runVoidMethod ("AddView",(Object)((_iv.getObject())),(Object)(__ref.getField(true,"_chkboxsize")),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_bitmapsize")),(Object)(__ref.getField(true,"_bitmapsize")));
 BA.debugLineNum = 155;BA.debugLine="PosX = ChkBoxSize + BitmapSize + 5dip";
Debug.ShouldStop(67108864);
_posx = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_chkboxsize"),__ref.getField(true,"_bitmapsize"),clschecklist.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 1);Debug.locals.put("PosX", _posx);
 };
 BA.debugLineNum = 157;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
Debug.ShouldStop(268435456);
_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl1", _lbl1);
 BA.debugLineNum = 157;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
Debug.ShouldStop(268435456);
_lbl1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 158;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(536870912);
_lbl1.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 159;BA.debugLine="lbl1.Text = Text1";
Debug.ShouldStop(1073741824);
_lbl1.runMethod(true,"setText",BA.ObjectToCharSequence(_text1));
 BA.debugLineNum = 160;BA.debugLine="lbl1.TextColor = Colors.White";
Debug.ShouldStop(-2147483648);
_lbl1.runMethod(true,"setTextColor",clschecklist.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 161;BA.debugLine="lbl1.TextSize = 18";
Debug.ShouldStop(1);
_lbl1.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 162;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(2);
_lbl1.runMethod(false,"setTypeface",clschecklist.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 163;BA.debugLine="If Text2 = \"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_text2,BA.ObjectToString(""))) { 
 BA.debugLineNum = 164;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, PanelHe";
Debug.ShouldStop(8);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(_posx),(Object)(BA.numberCast(int.class, 0)),(Object)(_largeurlabel),(Object)(__ref.getField(true,"_panelheight")));
 }else {
 BA.debugLineNum = 166;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, LabelHe";
Debug.ShouldStop(32);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(_posx),(Object)(BA.numberCast(int.class, 0)),(Object)(_largeurlabel),(Object)(__ref.getField(true,"_labelheight")));
 BA.debugLineNum = 167;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
Debug.ShouldStop(64);
_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl2", _lbl2);
 BA.debugLineNum = 167;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
Debug.ShouldStop(64);
_lbl2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 168;BA.debugLine="lbl2.Gravity = Gravity.TOP";
Debug.ShouldStop(128);
_lbl2.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"TOP"));
 BA.debugLineNum = 169;BA.debugLine="lbl2.Text = Text2";
Debug.ShouldStop(256);
_lbl2.runMethod(true,"setText",BA.ObjectToCharSequence(_text2));
 BA.debugLineNum = 170;BA.debugLine="lbl2.TextColor = Colors.LightGray";
Debug.ShouldStop(512);
_lbl2.runMethod(true,"setTextColor",clschecklist.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 171;BA.debugLine="lbl2.TextSize = 16";
Debug.ShouldStop(1024);
_lbl2.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 172;BA.debugLine="lbl2.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(2048);
_lbl2.runMethod(false,"setTypeface",clschecklist.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 173;BA.debugLine="pnl.AddView(lbl2, PosX, LabelHeight, LargeurLabe";
Debug.ShouldStop(4096);
_pnl.runVoidMethod ("AddView",(Object)((_lbl2.getObject())),(Object)(_posx),(Object)(__ref.getField(true,"_labelheight")),(Object)(_largeurlabel),(Object)(__ref.getField(true,"_labelheight")));
 };
 BA.debugLineNum = 175;BA.debugLine="AddToSV(pnl, PanelHeight, True)";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_addtosv",(Object)(_pnl),(Object)(__ref.getField(true,"_panelheight")),(Object)(clschecklist.__c.getField(true,"True")));
 BA.debugLineNum = 176;BA.debugLine="BlockCheckEvent = True";
Debug.ShouldStop(32768);
__ref.setField ("_blockcheckevent",clschecklist.__c.getField(true,"True"));
 BA.debugLineNum = 177;BA.debugLine="chk.Checked = Checked";
Debug.ShouldStop(65536);
_chk.runMethodAndSync(true,"setChecked",_checked);
 BA.debugLineNum = 178;BA.debugLine="BlockCheckEvent = False";
Debug.ShouldStop(131072);
__ref.setField ("_blockcheckevent",clschecklist.__c.getField(true,"False"));
 BA.debugLineNum = 179;BA.debugLine="PaintBackground(pnl, False)";
Debug.ShouldStop(262144);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_paintbackground",(Object)(_pnl),(Object)(clschecklist.__c.getField(true,"False")));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
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
public static RemoteObject  _additemnochkbx(RemoteObject __ref,RemoteObject _id,RemoteObject _text1,RemoteObject _text2,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("AddItemNoChkbx (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("additemnochkbx")) return __ref.runUserSub(false, "clschecklist","additemnochkbx", __ref, _id, _text1, _text2, _image);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _largeurlabel = RemoteObject.createImmutable(0);
RemoteObject _posx = RemoteObject.createImmutable(0);
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _lbl1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lbl2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("ID", _id);
Debug.locals.put("Text1", _text1);
Debug.locals.put("Text2", _text2);
Debug.locals.put("Image", _image);
 BA.debugLineNum = 184;BA.debugLine="Public Sub AddItemNoChkbx(ID As Object, Text1 As S";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 185;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
Debug.ShouldStop(16777216);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 185;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
Debug.ShouldStop(16777216);
_pnl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 186;BA.debugLine="pnl.Tag = ID";
Debug.ShouldStop(33554432);
_pnl.runMethod(false,"setTag",_id);
 BA.debugLineNum = 187;BA.debugLine="Dim LargeurLabel As Int, PosX As Int";
Debug.ShouldStop(67108864);
_largeurlabel = RemoteObject.createImmutable(0);Debug.locals.put("LargeurLabel", _largeurlabel);
_posx = RemoteObject.createImmutable(0);Debug.locals.put("PosX", _posx);
 BA.debugLineNum = 188;BA.debugLine="LargeurLabel = 150%x";
Debug.ShouldStop(134217728);
_largeurlabel = clschecklist.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 150)),__ref.getField(false, "ba"));Debug.locals.put("LargeurLabel", _largeurlabel);
 BA.debugLineNum = 189;BA.debugLine="If Image.IsInitialized Then";
Debug.ShouldStop(268435456);
if (_image.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
Debug.ShouldStop(536870912);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 190;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
Debug.ShouldStop(536870912);
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 191;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(1073741824);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 192;BA.debugLine="bmp = Image";
Debug.ShouldStop(-2147483648);
_bmp = _image;Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 193;BA.debugLine="If NumberFormat(bmp.Width / bmp.Height, 1, 2) =";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",clschecklist.__c.runMethod(true,"NumberFormat",(Object)(RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_bmp.runMethod(true,"getHeight")}, "/",0, 0)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))),clschecklist.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2))))) { 
 BA.debugLineNum = 195;BA.debugLine="iv.Gravity = Gravity.FILL";
Debug.ShouldStop(4);
_iv.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"FILL"));
 }else {
 BA.debugLineNum = 198;BA.debugLine="bmp = AdjustBitmap(bmp, BitmapSize, BitmapSize)";
Debug.ShouldStop(32);
_bmp = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_adjustbitmap",(Object)(_bmp),(Object)(__ref.getField(true,"_bitmapsize")),(Object)(__ref.getField(true,"_bitmapsize")));Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 199;BA.debugLine="iv.Gravity = Gravity.NO_GRAVITY";
Debug.ShouldStop(64);
_iv.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"NO_GRAVITY"));
 };
 BA.debugLineNum = 201;BA.debugLine="iv.Bitmap = bmp";
Debug.ShouldStop(256);
_iv.runMethod(false,"setBitmap",(_bmp.getObject()));
 BA.debugLineNum = 202;BA.debugLine="pnl.AddView(iv, 0, 0, BitmapSize, BitmapSize)";
Debug.ShouldStop(512);
_pnl.runVoidMethod ("AddView",(Object)((_iv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_bitmapsize")),(Object)(__ref.getField(true,"_bitmapsize")));
 BA.debugLineNum = 203;BA.debugLine="PosX = BitmapSize + 5dip";
Debug.ShouldStop(1024);
_posx = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_bitmapsize"),clschecklist.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1);Debug.locals.put("PosX", _posx);
 };
 BA.debugLineNum = 205;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
Debug.ShouldStop(4096);
_lbl1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl1", _lbl1);
 BA.debugLineNum = 205;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
Debug.ShouldStop(4096);
_lbl1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 206;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
Debug.ShouldStop(8192);
_lbl1.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 207;BA.debugLine="lbl1.Text = Text1";
Debug.ShouldStop(16384);
_lbl1.runMethod(true,"setText",BA.ObjectToCharSequence(_text1));
 BA.debugLineNum = 208;BA.debugLine="lbl1.TextColor = Colors.ARGB(150,255,255,255)";
Debug.ShouldStop(32768);
_lbl1.runMethod(true,"setTextColor",clschecklist.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 209;BA.debugLine="lbl1.TextSize = 18";
Debug.ShouldStop(65536);
_lbl1.runMethod(true,"setTextSize",BA.numberCast(float.class, 18));
 BA.debugLineNum = 210;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
Debug.ShouldStop(131072);
_lbl1.runMethod(false,"setTypeface",clschecklist.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"));
 BA.debugLineNum = 211;BA.debugLine="If Text2 = \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_text2,BA.ObjectToString(""))) { 
 BA.debugLineNum = 212;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, PanelHe";
Debug.ShouldStop(524288);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(_posx),(Object)(BA.numberCast(int.class, 0)),(Object)(_largeurlabel),(Object)(__ref.getField(true,"_panelheight")));
 }else {
 BA.debugLineNum = 214;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, LabelHe";
Debug.ShouldStop(2097152);
_pnl.runVoidMethod ("AddView",(Object)((_lbl1.getObject())),(Object)(_posx),(Object)(BA.numberCast(int.class, 0)),(Object)(_largeurlabel),(Object)(__ref.getField(true,"_labelheight")));
 BA.debugLineNum = 215;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
Debug.ShouldStop(4194304);
_lbl2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl2", _lbl2);
 BA.debugLineNum = 215;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
Debug.ShouldStop(4194304);
_lbl2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 216;BA.debugLine="lbl2.Gravity = Gravity.TOP";
Debug.ShouldStop(8388608);
_lbl2.runMethod(true,"setGravity",clschecklist.__c.getField(false,"Gravity").getField(true,"TOP"));
 BA.debugLineNum = 217;BA.debugLine="lbl2.Text = Text2";
Debug.ShouldStop(16777216);
_lbl2.runMethod(true,"setText",BA.ObjectToCharSequence(_text2));
 BA.debugLineNum = 218;BA.debugLine="lbl2.TextColor = Colors.LightGray";
Debug.ShouldStop(33554432);
_lbl2.runMethod(true,"setTextColor",clschecklist.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 219;BA.debugLine="lbl2.TextSize = 16";
Debug.ShouldStop(67108864);
_lbl2.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 220;BA.debugLine="lbl2.Typeface = Typeface.DEFAULT";
Debug.ShouldStop(134217728);
_lbl2.runMethod(false,"setTypeface",clschecklist.__c.getField(false,"Typeface").getField(false,"DEFAULT"));
 BA.debugLineNum = 221;BA.debugLine="pnl.AddView(lbl2, PosX, LabelHeight, LargeurLabe";
Debug.ShouldStop(268435456);
_pnl.runVoidMethod ("AddView",(Object)((_lbl2.getObject())),(Object)(_posx),(Object)(__ref.getField(true,"_labelheight")),(Object)(_largeurlabel),(Object)(__ref.getField(true,"_labelheight")));
 };
 BA.debugLineNum = 223;BA.debugLine="AddToSV(pnl, PanelHeight, True)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_addtosv",(Object)(_pnl),(Object)(__ref.getField(true,"_panelheight")),(Object)(clschecklist.__c.getField(true,"True")));
 BA.debugLineNum = 224;BA.debugLine="PaintBackground(pnl, False)";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_paintbackground",(Object)(_pnl),(Object)(clschecklist.__c.getField(true,"False")));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
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
public static RemoteObject  _addtosv(RemoteObject __ref,RemoteObject _pnl,RemoteObject _pnlheight,RemoteObject _withevents) throws Exception{
try {
		Debug.PushSubsStack("AddToSV (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("addtosv")) return __ref.runUserSub(false, "clschecklist","addtosv", __ref, _pnl, _pnlheight, _withevents);
RemoteObject _pnldiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("pnl", _pnl);
Debug.locals.put("pnlHeight", _pnlheight);
Debug.locals.put("WithEvents", _withevents);
 BA.debugLineNum = 252;BA.debugLine="Private Sub AddToSV(pnl As Panel, pnlHeight As Int";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 254;BA.debugLine="If DividerSize > 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_dividersize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 255;BA.debugLine="Dim pnlDiv As Panel";
Debug.ShouldStop(1073741824);
_pnldiv = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlDiv", _pnldiv);
 BA.debugLineNum = 256;BA.debugLine="pnlDiv.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_pnldiv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 257;BA.debugLine="pnlDiv.Color = DividerColor";
Debug.ShouldStop(1);
_pnldiv.runVoidMethod ("setColor",__ref.getField(true,"_dividercolor"));
 BA.debugLineNum = 258;BA.debugLine="pnl.AddView(pnlDiv, 0, pnlHeight, getWidth, Divi";
Debug.ShouldStop(2);
_pnl.runVoidMethod ("AddView",(Object)((_pnldiv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_pnlheight),(Object)(__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getwidth")),(Object)(__ref.getField(true,"_dividersize")));
 BA.debugLineNum = 259;BA.debugLine="pnlHeight = pnlHeight + DividerSize";
Debug.ShouldStop(4);
_pnlheight = RemoteObject.solve(new RemoteObject[] {_pnlheight,__ref.getField(true,"_dividersize")}, "+",1, 1);Debug.locals.put("pnlHeight", _pnlheight);
 };
 BA.debugLineNum = 263;BA.debugLine="sv.Panel.AddView(pnl, 0, svHeight, getWidth, pnlH";
Debug.ShouldStop(64);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(true,"_svheight")),(Object)(__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getwidth")),(Object)(_pnlheight));
 BA.debugLineNum = 264;BA.debugLine="svHeight = svHeight + pnl.Height";
Debug.ShouldStop(128);
__ref.setField ("_svheight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_svheight"),_pnl.runMethod(true,"getHeight")}, "+",1, 1));
 BA.debugLineNum = 267;BA.debugLine="If Not(WithEvents) Then Return";
Debug.ShouldStop(1024);
if (clschecklist.__c.runMethod(true,"Not",(Object)(_withevents)).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 268;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2048);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 269;BA.debugLine="r.Target = pnl";
Debug.ShouldStop(4096);
_r.setField ("Target",(_pnl.getObject()));
 BA.debugLineNum = 270;BA.debugLine="r.SetOnTouchListener(\"pnlSV_Touch\")";
Debug.ShouldStop(8192);
_r.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlSV_Touch")));
 BA.debugLineNum = 271;BA.debugLine="If sub_Click <> \"\" Then r.SetOnClickListener(\"pnl";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_sub_click"),BA.ObjectToString(""))) { 
_r.runVoidMethod ("SetOnClickListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlSV_Click")));};
 BA.debugLineNum = 272;BA.debugLine="If sub_LongClick <> \"\" Then r.SetOnLongClickListe";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_sub_longclick"),BA.ObjectToString(""))) { 
_r.runVoidMethod ("SetOnLongClickListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlSV_LongClick")));};
 BA.debugLineNum = 273;BA.debugLine="End Sub";
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
public static RemoteObject  _adjustbitmap(RemoteObject __ref,RemoteObject _bmp,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("AdjustBitmap (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("adjustbitmap")) return __ref.runUserSub(false, "clschecklist","adjustbitmap", __ref, _bmp, _width, _height);
RemoteObject _ratiobmp = RemoteObject.createImmutable(0f);
RemoteObject _ratioiv = RemoteObject.createImmutable(0f);
RemoteObject _diviseur = RemoteObject.createImmutable(0f);
Debug.locals.put("bmp", _bmp);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 91;BA.debugLine="Public Sub AdjustBitmap(bmp As Bitmap, Width As In";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 92;BA.debugLine="Dim RatioBmp, RatioIV As Float";
Debug.ShouldStop(134217728);
_ratiobmp = RemoteObject.createImmutable(0f);Debug.locals.put("RatioBmp", _ratiobmp);
_ratioiv = RemoteObject.createImmutable(0f);Debug.locals.put("RatioIV", _ratioiv);
 BA.debugLineNum = 93;BA.debugLine="RatioBmp = bmp.Width / bmp.Height";
Debug.ShouldStop(268435456);
_ratiobmp = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_bmp.runMethod(true,"getHeight")}, "/",0, 0));Debug.locals.put("RatioBmp", _ratiobmp);
 BA.debugLineNum = 94;BA.debugLine="RatioIV = Width / Height";
Debug.ShouldStop(536870912);
_ratioiv = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,_height}, "/",0, 0));Debug.locals.put("RatioIV", _ratioiv);
 BA.debugLineNum = 95;BA.debugLine="Dim Diviseur As Float";
Debug.ShouldStop(1073741824);
_diviseur = RemoteObject.createImmutable(0f);Debug.locals.put("Diviseur", _diviseur);
 BA.debugLineNum = 96;BA.debugLine="If RatioIV > RatioBmp Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_ratioiv,BA.numberCast(double.class, _ratiobmp))) { 
 BA.debugLineNum = 97;BA.debugLine="Diviseur = bmp.Height / Height";
Debug.ShouldStop(1);
_diviseur = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_height}, "/",0, 0));Debug.locals.put("Diviseur", _diviseur);
 BA.debugLineNum = 98;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(bmp.Width /";
Debug.ShouldStop(2);
_bmp = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_createscaledbitmap",(Object)(_bmp),(Object)(BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_diviseur,clschecklist.__c.getField(true,"Density")}, "//",0, 0))))),(Object)(BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_height,clschecklist.__c.getField(true,"Density")}, "/",0, 0))))));Debug.locals.put("bmp", _bmp);
 }else {
 BA.debugLineNum = 100;BA.debugLine="Diviseur = bmp.Width / Width";
Debug.ShouldStop(8);
_diviseur = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_width}, "/",0, 0));Debug.locals.put("Diviseur", _diviseur);
 BA.debugLineNum = 101;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(Width / Dens";
Debug.ShouldStop(16);
_bmp = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_createscaledbitmap",(Object)(_bmp),(Object)(BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_width,clschecklist.__c.getField(true,"Density")}, "/",0, 0))))),(Object)(BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_diviseur,clschecklist.__c.getField(true,"Density")}, "//",0, 0))))));Debug.locals.put("bmp", _bmp);
 };
 BA.debugLineNum = 103;BA.debugLine="Return bmp";
Debug.ShouldStop(64);
if (true) return _bmp;
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
public static RemoteObject  _cancelfilter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CancelFilter (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1250);
if (RapidSub.canDelegate("cancelfilter")) return __ref.runUserSub(false, "clschecklist","cancelfilter", __ref);
RemoteObject _firstpos = RemoteObject.createImmutable(0);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
 BA.debugLineNum = 1250;BA.debugLine="Public Sub CancelFilter()";
Debug.ShouldStop(2);
 BA.debugLineNum = 1251;BA.debugLine="Dim FirstPos As Int, pnl As Panel";
Debug.ShouldStop(4);
_firstpos = RemoteObject.createImmutable(0);Debug.locals.put("FirstPos", _firstpos);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1252;BA.debugLine="FirstPos = -1";
Debug.ShouldStop(8);
_firstpos = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("FirstPos", _firstpos);
 BA.debugLineNum = 1253;BA.debugLine="For i = 0 To NumberOfItems - 1";
Debug.ShouldStop(16);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1254;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(32);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 1255;BA.debugLine="If pnl.Visible = False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(true,"getVisible"),clschecklist.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1256;BA.debugLine="If FirstPos = -1 Then FirstPos = i";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_firstpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_firstpos = BA.numberCast(int.class, _i);Debug.locals.put("FirstPos", _firstpos);};
 BA.debugLineNum = 1257;BA.debugLine="pnl.Visible = True";
Debug.ShouldStop(256);
_pnl.runMethod(true,"setVisible",clschecklist.__c.getField(true,"True"));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1260;BA.debugLine="If FirstPos > -1 Then MoveTopAfterFiltering(First";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_firstpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_movetopafterfiltering",(Object)(_firstpos));};
 BA.debugLineNum = 1261;BA.debugLine="End Sub";
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
public static RemoteObject  _chbsv_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chbSV_CheckedChange (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1158);
if (RapidSub.canDelegate("chbsv_checkedchange")) return __ref.runUserSub(false, "clschecklist","chbsv_checkedchange", __ref, _checked);
RemoteObject _chb = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1158;BA.debugLine="Private Sub chbSV_CheckedChange(Checked As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 1159;BA.debugLine="Dim chb As CheckBox, pnl As Panel";
Debug.ShouldStop(64);
_chb = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chb", _chb);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1160;BA.debugLine="chb = Sender";
Debug.ShouldStop(128);
_chb.setObject(clschecklist.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 1161;BA.debugLine="pnl = FindPanelContaining(chb)";
Debug.ShouldStop(256);
_pnl = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_findpanelcontaining",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _chb.getObject()));Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1162;BA.debugLine="PaintBackground(pnl, HasExtraContent AND Extended";
Debug.ShouldStop(512);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_paintbackground",(Object)(_pnl),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent")) && RemoteObject.solveBoolean("=",__ref.runClassMethod (com.bcleaner.clschecklist.class, "_extendeditemid"),_pnl.runMethod(false,"getTag")))));
 BA.debugLineNum = 1163;BA.debugLine="If BlockCheckEvent Then Return";
Debug.ShouldStop(1024);
if (__ref.getField(true,"_blockcheckevent").<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1164;BA.debugLine="If sub_Check <> \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_sub_check"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1165;BA.debugLine="If SubExists(CallbackMod, sub_Check) Then CallSu";
Debug.ShouldStop(4096);
if (clschecklist.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_check"))).<Boolean>get().booleanValue()) { 
clschecklist.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_check")),(Object)((_chb)),(Object)(_pnl.runMethod(false,"getTag")));};
 };
 BA.debugLineNum = 1167;BA.debugLine="End Sub";
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
public static RemoteObject  _checkallboxes(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("CheckAllBoxes (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,844);
if (RapidSub.canDelegate("checkallboxes")) return __ref.runUserSub(false, "clschecklist","checkallboxes", __ref, _checked);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _chb = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
int _i = 0;
int _p = 0;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 844;BA.debugLine="Public Sub CheckAllBoxes(Checked As Boolean)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 845;BA.debugLine="BlockCheckEvent = True 'We don't want to trigger";
Debug.ShouldStop(4096);
__ref.setField ("_blockcheckevent",clschecklist.__c.getField(true,"True"));
 BA.debugLineNum = 846;BA.debugLine="Dim pnl As Panel, chb As CheckBox";
Debug.ShouldStop(8192);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
_chb = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chb", _chb);
 BA.debugLineNum = 847;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
Debug.ShouldStop(16384);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 848;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(32768);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 849;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
Debug.ShouldStop(65536);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_p = 0 ; (step5 > 0 && _p <= limit5) || (step5 < 0 && _p >= limit5); _p = ((int)(0 + _p + step5)) ) {
Debug.locals.put("p", _p);
 BA.debugLineNum = 850;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
Debug.ShouldStop(131072);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_ischeckbox",(Object)(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 851;BA.debugLine="chb = pnl.GetView(p)";
Debug.ShouldStop(262144);
_chb.setObject(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))).getObject());
 BA.debugLineNum = 852;BA.debugLine="chb.Checked = Checked";
Debug.ShouldStop(524288);
_chb.runMethodAndSync(true,"setChecked",_checked);
 BA.debugLineNum = 853;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("p", _p);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 857;BA.debugLine="BlockCheckEvent = False";
Debug.ShouldStop(16777216);
__ref.setField ("_blockcheckevent",clschecklist.__c.getField(true,"False"));
 BA.debugLineNum = 858;BA.debugLine="End Sub";
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
public static RemoteObject  _checkedlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckedList (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,834);
if (RapidSub.canDelegate("checkedlist")) return __ref.runUserSub(false, "clschecklist","checkedlist", __ref);
 BA.debugLineNum = 834;BA.debugLine="Public Sub CheckedList As List";
Debug.ShouldStop(2);
 BA.debugLineNum = 835;BA.debugLine="Return MakeCheckedList(0)";
Debug.ShouldStop(4);
if (true) return __ref.runClassMethod (com.bcleaner.clschecklist.class, "_makecheckedlist",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 836;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkedpanels(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckedPanels (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,839);
if (RapidSub.canDelegate("checkedpanels")) return __ref.runUserSub(false, "clschecklist","checkedpanels", __ref);
 BA.debugLineNum = 839;BA.debugLine="Public Sub CheckedPanels As List";
Debug.ShouldStop(64);
 BA.debugLineNum = 840;BA.debugLine="Return MakeCheckedList(1)";
Debug.ShouldStop(128);
if (true) return __ref.runClassMethod (com.bcleaner.clschecklist.class, "_makecheckedlist",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 841;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
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
 //BA.debugLineNum = 5;BA.debugLine="Public BackgroundColor As Int";
clschecklist._backgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_backgroundcolor",clschecklist._backgroundcolor);
 //BA.debugLineNum = 6;BA.debugLine="Public CheckedColor As Int";
clschecklist._checkedcolor = RemoteObject.createImmutable(0);__ref.setField("_checkedcolor",clschecklist._checkedcolor);
 //BA.debugLineNum = 7;BA.debugLine="Public DividerColor As Int";
clschecklist._dividercolor = RemoteObject.createImmutable(0);__ref.setField("_dividercolor",clschecklist._dividercolor);
 //BA.debugLineNum = 8;BA.debugLine="Public ExtensionColor As Int";
clschecklist._extensioncolor = RemoteObject.createImmutable(0);__ref.setField("_extensioncolor",clschecklist._extensioncolor);
 //BA.debugLineNum = 9;BA.debugLine="Public FilterResult As Boolean";
clschecklist._filterresult = RemoteObject.createImmutable(false);__ref.setField("_filterresult",clschecklist._filterresult);
 //BA.debugLineNum = 11;BA.debugLine="Private sv As ScrollView2D";
clschecklist._sv = RemoteObject.createNew ("flm.b4a.scrollview2d.ScrollView2DWrapper");__ref.setField("_sv",clschecklist._sv);
 //BA.debugLineNum = 12;BA.debugLine="Private svHeight As Int";
clschecklist._svheight = RemoteObject.createImmutable(0);__ref.setField("_svheight",clschecklist._svheight);
 //BA.debugLineNum = 13;BA.debugLine="Private ExtensionIndex As Int";
clschecklist._extensionindex = RemoteObject.createImmutable(0);__ref.setField("_extensionindex",clschecklist._extensionindex);
 //BA.debugLineNum = 14;BA.debugLine="Private ExtensionView As View";
clschecklist._extensionview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");__ref.setField("_extensionview",clschecklist._extensionview);
 //BA.debugLineNum = 15;BA.debugLine="Private CallbackMod As Object";
clschecklist._callbackmod = RemoteObject.createNew ("Object");__ref.setField("_callbackmod",clschecklist._callbackmod);
 //BA.debugLineNum = 16;BA.debugLine="Private sub_Check, sub_Click, sub_LongClick As St";
clschecklist._sub_check = RemoteObject.createImmutable("");__ref.setField("_sub_check",clschecklist._sub_check);
clschecklist._sub_click = RemoteObject.createImmutable("");__ref.setField("_sub_click",clschecklist._sub_click);
clschecklist._sub_longclick = RemoteObject.createImmutable("");__ref.setField("_sub_longclick",clschecklist._sub_longclick);
 //BA.debugLineNum = 17;BA.debugLine="Private sub_Paint As String";
clschecklist._sub_paint = RemoteObject.createImmutable("");__ref.setField("_sub_paint",clschecklist._sub_paint);
 //BA.debugLineNum = 18;BA.debugLine="Private ModeCheck As Boolean";
clschecklist._modecheck = RemoteObject.createImmutable(false);__ref.setField("_modecheck",clschecklist._modecheck);
 //BA.debugLineNum = 19;BA.debugLine="Private BlockCheckEvent As Boolean";
clschecklist._blockcheckevent = RemoteObject.createImmutable(false);__ref.setField("_blockcheckevent",clschecklist._blockcheckevent);
 //BA.debugLineNum = 20;BA.debugLine="Private PressedPanel As Panel";
clschecklist._pressedpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pressedpanel",clschecklist._pressedpanel);
 //BA.debugLineNum = 21;BA.debugLine="Private PressedDrawable As Object";
clschecklist._presseddrawable = RemoteObject.createNew ("Object");__ref.setField("_presseddrawable",clschecklist._presseddrawable);
 //BA.debugLineNum = 22;BA.debugLine="Private OldBackground As Object";
clschecklist._oldbackground = RemoteObject.createNew ("Object");__ref.setField("_oldbackground",clschecklist._oldbackground);
 //BA.debugLineNum = 23;BA.debugLine="Private DividerSize As Int";
clschecklist._dividersize = RemoteObject.createImmutable(0);__ref.setField("_dividersize",clschecklist._dividersize);
 //BA.debugLineNum = 25;BA.debugLine="Private DragAndDrop, DragAndDropShadow As Panel";
clschecklist._draganddrop = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_draganddrop",clschecklist._draganddrop);
clschecklist._draganddropshadow = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_draganddropshadow",clschecklist._draganddropshadow);
 //BA.debugLineNum = 26;BA.debugLine="Private OriginDDTop, LastY As Int";
clschecklist._originddtop = RemoteObject.createImmutable(0);__ref.setField("_originddtop",clschecklist._originddtop);
clschecklist._lasty = RemoteObject.createImmutable(0);__ref.setField("_lasty",clschecklist._lasty);
 //BA.debugLineNum = 27;BA.debugLine="Private sub_AfterDrop As String";
clschecklist._sub_afterdrop = RemoteObject.createImmutable("");__ref.setField("_sub_afterdrop",clschecklist._sub_afterdrop);
 //BA.debugLineNum = 29;BA.debugLine="Private ChkBoxSize  As Int: ChkBoxSize  = 40dip";
clschecklist._chkboxsize = RemoteObject.createImmutable(0);__ref.setField("_chkboxsize",clschecklist._chkboxsize);
 //BA.debugLineNum = 29;BA.debugLine="Private ChkBoxSize  As Int: ChkBoxSize  = 40dip";
__ref.setField ("_chkboxsize",clschecklist.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))));
 //BA.debugLineNum = 30;BA.debugLine="Private BitmapSize As Int: BitmapSize = 50dip";
clschecklist._bitmapsize = RemoteObject.createImmutable(0);__ref.setField("_bitmapsize",clschecklist._bitmapsize);
 //BA.debugLineNum = 30;BA.debugLine="Private BitmapSize As Int: BitmapSize = 50dip";
__ref.setField ("_bitmapsize",clschecklist.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 //BA.debugLineNum = 31;BA.debugLine="Private LabelHeight  As Int: LabelHeight  = 25dip";
clschecklist._labelheight = RemoteObject.createImmutable(0);__ref.setField("_labelheight",clschecklist._labelheight);
 //BA.debugLineNum = 31;BA.debugLine="Private LabelHeight  As Int: LabelHeight  = 25dip";
__ref.setField ("_labelheight",clschecklist.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 25))));
 //BA.debugLineNum = 32;BA.debugLine="Private PanelHeight As Int: PanelHeight = 2 * Lab";
clschecklist._panelheight = RemoteObject.createImmutable(0);__ref.setField("_panelheight",clschecklist._panelheight);
 //BA.debugLineNum = 32;BA.debugLine="Private PanelHeight As Int: PanelHeight = 2 * Lab";
__ref.setField ("_panelheight",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),__ref.getField(true,"_labelheight")}, "*",0, 1));
 //BA.debugLineNum = 33;BA.debugLine="Private PAINT_DEFAULT As Int: PAINT_DEFAULT = 0";
clschecklist._paint_default = RemoteObject.createImmutable(0);__ref.setField("_paint_default",clschecklist._paint_default);
 //BA.debugLineNum = 33;BA.debugLine="Private PAINT_DEFAULT As Int: PAINT_DEFAULT = 0";
__ref.setField ("_paint_default",BA.numberCast(int.class, 0));
 //BA.debugLineNum = 34;BA.debugLine="Private PAINT_EXTENDED As Int: PAINT_EXTENDED = 1";
clschecklist._paint_extended = RemoteObject.createImmutable(0);__ref.setField("_paint_extended",clschecklist._paint_extended);
 //BA.debugLineNum = 34;BA.debugLine="Private PAINT_EXTENDED As Int: PAINT_EXTENDED = 1";
__ref.setField ("_paint_extended",BA.numberCast(int.class, 1));
 //BA.debugLineNum = 35;BA.debugLine="Private PAINT_CHECKED As Int: PAINT_CHECKED = 2";
clschecklist._paint_checked = RemoteObject.createImmutable(0);__ref.setField("_paint_checked",clschecklist._paint_checked);
 //BA.debugLineNum = 35;BA.debugLine="Private PAINT_CHECKED As Int: PAINT_CHECKED = 2";
__ref.setField ("_paint_checked",BA.numberCast(int.class, 2));
 //BA.debugLineNum = 36;BA.debugLine="Private PAINT_PRESSED As Int: PAINT_PRESSED = 4";
clschecklist._paint_pressed = RemoteObject.createImmutable(0);__ref.setField("_paint_pressed",clschecklist._paint_pressed);
 //BA.debugLineNum = 36;BA.debugLine="Private PAINT_PRESSED As Int: PAINT_PRESSED = 4";
__ref.setField ("_paint_pressed",BA.numberCast(int.class, 4));
 //BA.debugLineNum = 38;BA.debugLine="Type typSortData(Index As Int, Value As Object)";
;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _collapseitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CollapseItem (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,986);
if (RapidSub.canDelegate("collapseitem")) return __ref.runUserSub(false, "clschecklist","collapseitem", __ref);
RemoteObject _extensionheight = RemoteObject.createImmutable(0);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pnldivider = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
 BA.debugLineNum = 986;BA.debugLine="Public Sub CollapseItem";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 987;BA.debugLine="If ExtensionIndex <> -1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_extensionindex"),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 988;BA.debugLine="Dim ExtensionHeight As Int";
Debug.ShouldStop(134217728);
_extensionheight = RemoteObject.createImmutable(0);Debug.locals.put("ExtensionHeight", _extensionheight);
 BA.debugLineNum = 989;BA.debugLine="ExtensionHeight = ExtensionView.Height";
Debug.ShouldStop(268435456);
_extensionheight = __ref.getField(false,"_extensionview").runMethod(true,"getHeight");Debug.locals.put("ExtensionHeight", _extensionheight);
 BA.debugLineNum = 990;BA.debugLine="ExtensionView.RemoveView";
Debug.ShouldStop(536870912);
__ref.getField(false,"_extensionview").runVoidMethod ("RemoveView");
 BA.debugLineNum = 991;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1073741824);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 992;BA.debugLine="pnl = sv.Panel.GetView(ExtensionIndex)";
Debug.ShouldStop(-2147483648);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(__ref.getField(true,"_extensionindex"))).getObject());
 BA.debugLineNum = 993;BA.debugLine="PaintBackground(pnl, False)";
Debug.ShouldStop(1);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_paintbackground",(Object)(_pnl),(Object)(clschecklist.__c.getField(true,"False")));
 BA.debugLineNum = 994;BA.debugLine="pnl.Height = pnl.Height - ExtensionHeight";
Debug.ShouldStop(2);
_pnl.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getHeight"),_extensionheight}, "-",1, 1));
 BA.debugLineNum = 995;BA.debugLine="If DividerSize > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_dividersize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 997;BA.debugLine="Dim pnlDivider As Panel";
Debug.ShouldStop(16);
_pnldivider = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlDivider", _pnldivider);
 BA.debugLineNum = 998;BA.debugLine="pnlDivider = pnl.GetView(pnl.NumberOfViews - 1)";
Debug.ShouldStop(32);
_pnldivider.setObject(_pnl.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());
 BA.debugLineNum = 999;BA.debugLine="pnlDivider.Top = pnl.Height - DividerSize";
Debug.ShouldStop(64);
_pnldivider.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getHeight"),__ref.getField(true,"_dividersize")}, "-",1, 1));
 };
 BA.debugLineNum = 1001;BA.debugLine="svHeight = svHeight - ExtensionHeight";
Debug.ShouldStop(256);
__ref.setField ("_svheight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_svheight"),_extensionheight}, "-",1, 1));
 BA.debugLineNum = 1002;BA.debugLine="sv.Panel.Height = svHeight";
Debug.ShouldStop(512);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(true,"_svheight"));
 BA.debugLineNum = 1003;BA.debugLine="For i = ExtensionIndex + 1 To sv.Panel.NumberOfV";
Debug.ShouldStop(1024);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_extensionindex"),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1004;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(2048);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 1005;BA.debugLine="pnl.Top = pnl.Top - ExtensionHeight";
Debug.ShouldStop(4096);
_pnl.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_extensionheight}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1007;BA.debugLine="ExtensionIndex = -1";
Debug.ShouldStop(16384);
__ref.setField ("_extensionindex",BA.numberCast(int.class, -(double) (0 + 1)));
 };
 BA.debugLineNum = 1009;BA.debugLine="ExtensionView = Null";
Debug.ShouldStop(65536);
__ref.getField(false,"_extensionview").setObject (clschecklist.__c.getField(false,"Null"));
 BA.debugLineNum = 1010;BA.debugLine="End Sub";
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
public static RemoteObject  _commonjump(RemoteObject __ref,RemoteObject _newposition) throws Exception{
try {
		Debug.PushSubsStack("CommonJump (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,738);
if (RapidSub.canDelegate("commonjump")) return __ref.runUserSub(false, "clschecklist","commonjump", __ref, _newposition);
RemoteObject _previousposition = RemoteObject.createImmutable(0);
Debug.locals.put("NewPosition", _newposition);
 BA.debugLineNum = 738;BA.debugLine="Private Sub CommonJump(NewPosition As Int)";
Debug.ShouldStop(2);
 BA.debugLineNum = 740;BA.debugLine="NewPosition = Max(0, NewPosition - 5dip)";
Debug.ShouldStop(8);
_newposition = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_newposition,clschecklist.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 1)))));Debug.locals.put("NewPosition", _newposition);
 BA.debugLineNum = 743;BA.debugLine="Dim PreviousPosition As Int: PreviousPosition = -";
Debug.ShouldStop(64);
_previousposition = RemoteObject.createImmutable(0);Debug.locals.put("PreviousPosition", _previousposition);
 BA.debugLineNum = 743;BA.debugLine="Dim PreviousPosition As Int: PreviousPosition = -";
Debug.ShouldStop(64);
_previousposition = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("PreviousPosition", _previousposition);
 BA.debugLineNum = 744;BA.debugLine="Do Until PreviousPosition = sv.VerticalScrollPosi";
Debug.ShouldStop(128);
while (!(RemoteObject.solveBoolean("=",_previousposition,BA.numberCast(double.class, __ref.getField(false,"_sv").runMethod(true,"getVerticalScrollPosition"))))) {
 BA.debugLineNum = 745;BA.debugLine="PreviousPosition = sv.VerticalScrollPosition";
Debug.ShouldStop(256);
_previousposition = __ref.getField(false,"_sv").runMethod(true,"getVerticalScrollPosition");Debug.locals.put("PreviousPosition", _previousposition);
 BA.debugLineNum = 746;BA.debugLine="sv.VerticalScrollPosition = NewPosition";
Debug.ShouldStop(512);
__ref.getField(false,"_sv").runMethod(true,"setVerticalScrollPosition",_newposition);
 BA.debugLineNum = 747;BA.debugLine="DoEvents";
Debug.ShouldStop(1024);
clschecklist.__c.runVoidMethodAndSync ("DoEvents");
 }
;
 BA.debugLineNum = 749;BA.debugLine="End Sub";
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
public static RemoteObject  _createcheckedstatelist(RemoteObject __ref,RemoteObject _firstposition,RemoteObject _lastposition) throws Exception{
try {
		Debug.PushSubsStack("CreateCheckedStateList (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("createcheckedstatelist")) return __ref.runUserSub(false, "clschecklist","createcheckedstatelist", __ref, _firstposition, _lastposition);
RemoteObject _liste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
int _i = 0;
int _p = 0;
Debug.locals.put("FirstPosition", _firstposition);
Debug.locals.put("LastPosition", _lastposition);
 BA.debugLineNum = 543;BA.debugLine="Public Sub CreateCheckedStateList(FirstPosition As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 544;BA.debugLine="Dim Liste As List: Liste.Initialize";
Debug.ShouldStop(-2147483648);
_liste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Liste", _liste);
 BA.debugLineNum = 544;BA.debugLine="Dim Liste As List: Liste.Initialize";
Debug.ShouldStop(-2147483648);
_liste.runVoidMethod ("Initialize");
 BA.debugLineNum = 545;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(1);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 546;BA.debugLine="Dim pnl As Panel, v As View, c As CheckBox";
Debug.ShouldStop(2);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("c", _c);
 BA.debugLineNum = 547;BA.debugLine="For i = FirstPosition To LastPosition";
Debug.ShouldStop(4);
{
final int step5 = 1;
final int limit5 = _lastposition.<Integer>get().intValue();
for (_i = _firstposition.<Integer>get().intValue() ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 548;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(8);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 549;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
Debug.ShouldStop(16);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_p = 0 ; (step7 > 0 && _p <= limit7) || (step7 < 0 && _p >= limit7); _p = ((int)(0 + _p + step7)) ) {
Debug.locals.put("p", _p);
 BA.debugLineNum = 550;BA.debugLine="v = pnl.GetView(p)";
Debug.ShouldStop(32);
_v = _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p)));Debug.locals.put("v", _v);
 BA.debugLineNum = 551;BA.debugLine="If IsCheckBox(v) Then";
Debug.ShouldStop(64);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_ischeckbox",(Object)(_v)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 552;BA.debugLine="c = v";
Debug.ShouldStop(128);
_c.setObject(_v.getObject());
 BA.debugLineNum = 553;BA.debugLine="Liste.Add(c.Checked)";
Debug.ShouldStop(256);
_liste.runVoidMethod ("Add",(Object)((_c.runMethod(true,"getChecked"))));
 BA.debugLineNum = 554;BA.debugLine="Exit";
Debug.ShouldStop(512);
if (true) break;
 };
 }
}Debug.locals.put("p", _p);
;
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 559;BA.debugLine="Return Liste";
Debug.ShouldStop(16384);
if (true) return _liste;
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createintegerlist(RemoteObject __ref,RemoteObject _viewindexinpanel,RemoteObject _firstposition,RemoteObject _lastposition) throws Exception{
try {
		Debug.PushSubsStack("CreateIntegerList (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,538);
if (RapidSub.canDelegate("createintegerlist")) return __ref.runUserSub(false, "clschecklist","createintegerlist", __ref, _viewindexinpanel, _firstposition, _lastposition);
Debug.locals.put("ViewIndexInPanel", _viewindexinpanel);
Debug.locals.put("FirstPosition", _firstposition);
Debug.locals.put("LastPosition", _lastposition);
 BA.debugLineNum = 538;BA.debugLine="Public Sub CreateIntegerList(ViewIndexInPanel As I";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 539;BA.debugLine="Return MakeValuesListWith(ViewIndexInPanel, First";
Debug.ShouldStop(67108864);
if (true) return __ref.runClassMethod (com.bcleaner.clschecklist.class, "_makevalueslistwith",(Object)(_viewindexinpanel),(Object)(_firstposition),(Object)(_lastposition),(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
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
		Debug.PushSubsStack("CreateScaledBitmap (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("createscaledbitmap")) return __ref.runUserSub(false, "clschecklist","createscaledbitmap", __ref, _original, _width, _height);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Original", _original);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 81;BA.debugLine="Private Sub CreateScaledBitmap(Original As Bitmap,";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(131072);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 83;BA.debugLine="Dim b As Bitmap";
Debug.ShouldStop(262144);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 84;BA.debugLine="b = r.RunStaticMethod(\"android.graphics.Bitmap\",";
Debug.ShouldStop(524288);
_b.setObject(_r.runMethod(false,"RunStaticMethod",(Object)(BA.ObjectToString("android.graphics.Bitmap")),(Object)(BA.ObjectToString("createScaledBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_original.getObject()),(_width),(_height),(clschecklist.__c.getField(true,"True"))})),(Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("android.graphics.Bitmap"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.boolean")}))));
 BA.debugLineNum = 87;BA.debugLine="Return b";
Debug.ShouldStop(4194304);
if (true) return _b;
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtaglist(RemoteObject __ref,RemoteObject _viewindexinpanel,RemoteObject _firstposition,RemoteObject _lastposition) throws Exception{
try {
		Debug.PushSubsStack("CreateTagList (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,526);
if (RapidSub.canDelegate("createtaglist")) return __ref.runUserSub(false, "clschecklist","createtaglist", __ref, _viewindexinpanel, _firstposition, _lastposition);
Debug.locals.put("ViewIndexInPanel", _viewindexinpanel);
Debug.locals.put("FirstPosition", _firstposition);
Debug.locals.put("LastPosition", _lastposition);
 BA.debugLineNum = 526;BA.debugLine="Public Sub CreateTagList(ViewIndexInPanel As Int,";
Debug.ShouldStop(8192);
 BA.debugLineNum = 527;BA.debugLine="Return MakeValuesListWith(ViewIndexInPanel, First";
Debug.ShouldStop(16384);
if (true) return __ref.runClassMethod (com.bcleaner.clschecklist.class, "_makevalueslistwith",(Object)(_viewindexinpanel),(Object)(_firstposition),(Object)(_lastposition),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 528;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextlist(RemoteObject __ref,RemoteObject _viewindexinpanel,RemoteObject _firstposition,RemoteObject _lastposition) throws Exception{
try {
		Debug.PushSubsStack("CreateTextList (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,532);
if (RapidSub.canDelegate("createtextlist")) return __ref.runUserSub(false, "clschecklist","createtextlist", __ref, _viewindexinpanel, _firstposition, _lastposition);
Debug.locals.put("ViewIndexInPanel", _viewindexinpanel);
Debug.locals.put("FirstPosition", _firstposition);
Debug.locals.put("LastPosition", _lastposition);
 BA.debugLineNum = 532;BA.debugLine="Public Sub CreateTextList(ViewIndexInPanel As Int,";
Debug.ShouldStop(524288);
 BA.debugLineNum = 533;BA.debugLine="Return MakeValuesListWith(ViewIndexInPanel, First";
Debug.ShouldStop(1048576);
if (true) return __ref.runClassMethod (com.bcleaner.clschecklist.class, "_makevalueslistwith",(Object)(_viewindexinpanel),(Object)(_firstposition),(Object)(_lastposition),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extendeditemid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExtendedItemID (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1019);
if (RapidSub.canDelegate("extendeditemid")) return __ref.runUserSub(false, "clschecklist","extendeditemid", __ref);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 1019;BA.debugLine="Public Sub ExtendedItemID As Object";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1020;BA.debugLine="If ExtensionView.IsInitialized Then";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_extensionview").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1021;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(268435456);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1022;BA.debugLine="pnl = FindPanelContaining(ExtensionView)";
Debug.ShouldStop(536870912);
_pnl = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_findpanelcontaining",(Object)(__ref.getField(false,"_extensionview")));Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1023;BA.debugLine="Return pnl.Tag";
Debug.ShouldStop(1073741824);
if (true) return _pnl.runMethod(false,"getTag");
 }else {
 BA.debugLineNum = 1025;BA.debugLine="Return Null";
Debug.ShouldStop(1);
if (true) return clschecklist.__c.getField(false,"Null");
 };
 BA.debugLineNum = 1027;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _extenditem(RemoteObject __ref,RemoteObject _itemid,RemoteObject _addedcontent,RemoteObject _contentheight) throws Exception{
try {
		Debug.PushSubsStack("ExtendItem (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,936);
if (RapidSub.canDelegate("extenditem")) return __ref.runUserSub(false, "clschecklist","extenditem", __ref, _itemid, _addedcontent, _contentheight);
RemoteObject _movefollowingpanels = RemoteObject.createImmutable(false);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _pnldivider = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _contentbottom = RemoteObject.createImmutable(0);
RemoteObject _newposition = RemoteObject.createImmutable(0);
Debug.locals.put("ItemID", _itemid);
Debug.locals.put("AddedContent", _addedcontent);
Debug.locals.put("ContentHeight", _contentheight);
 BA.debugLineNum = 936;BA.debugLine="Public Sub ExtendItem(ItemID As Object, AddedConte";
Debug.ShouldStop(128);
 BA.debugLineNum = 937;BA.debugLine="If AddedContent.IsInitialized Then";
Debug.ShouldStop(256);
if (_addedcontent.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 938;BA.debugLine="If HasExtraContent Then CollapseItem";
Debug.ShouldStop(512);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_collapseitem");};
 BA.debugLineNum = 939;BA.debugLine="Dim MoveFollowingPanels As Boolean";
Debug.ShouldStop(1024);
_movefollowingpanels = RemoteObject.createImmutable(false);Debug.locals.put("MoveFollowingPanels", _movefollowingpanels);
 BA.debugLineNum = 940;BA.debugLine="MoveFollowingPanels = False";
Debug.ShouldStop(2048);
_movefollowingpanels = clschecklist.__c.getField(true,"False");Debug.locals.put("MoveFollowingPanels", _movefollowingpanels);
 BA.debugLineNum = 941;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(4096);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 942;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
Debug.ShouldStop(8192);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 943;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(16384);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 944;BA.debugLine="If MoveFollowingPanels Then";
Debug.ShouldStop(32768);
if (_movefollowingpanels.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 945;BA.debugLine="pnl.Top = pnl.Top + ContentHeight";
Debug.ShouldStop(65536);
_pnl.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_contentheight}, "+",1, 1));
 }else 
{ BA.debugLineNum = 946;BA.debugLine="Else If pnl.Tag = Null Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("n",_pnl.runMethod(false,"getTag"))) { 
 BA.debugLineNum = 947;BA.debugLine="Continue ' It's a header";
Debug.ShouldStop(262144);
if (true) continue;
 }else 
{ BA.debugLineNum = 948;BA.debugLine="Else If pnl.Tag = ItemID Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(false,"getTag"),_itemid)) { 
 BA.debugLineNum = 949;BA.debugLine="ExtensionIndex = i";
Debug.ShouldStop(1048576);
__ref.setField ("_extensionindex",BA.numberCast(int.class, _i));
 BA.debugLineNum = 950;BA.debugLine="ExtensionView = AddedContent";
Debug.ShouldStop(2097152);
__ref.setField ("_extensionview",_addedcontent);
 BA.debugLineNum = 951;BA.debugLine="PaintBackground(pnl, True)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_paintbackground",(Object)(_pnl),(Object)(clschecklist.__c.getField(true,"True")));
 BA.debugLineNum = 952;BA.debugLine="If DividerSize > 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_dividersize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 954;BA.debugLine="Dim pnlDivider As Panel";
Debug.ShouldStop(33554432);
_pnldivider = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlDivider", _pnldivider);
 BA.debugLineNum = 955;BA.debugLine="pnlDivider = pnl.GetView(pnl.NumberOfViews -";
Debug.ShouldStop(67108864);
_pnldivider.setObject(_pnl.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());
 BA.debugLineNum = 956;BA.debugLine="pnlDivider.Top = pnl.Height + ContentHeight -";
Debug.ShouldStop(134217728);
_pnldivider.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getHeight"),_contentheight,__ref.getField(true,"_dividersize")}, "+-",2, 1));
 };
 BA.debugLineNum = 958;BA.debugLine="If IsCheckBox(pnl.GetView(0)) Then";
Debug.ShouldStop(536870912);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_ischeckbox",(Object)(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 960;BA.debugLine="pnl.AddView(AddedContent, ChkBoxSize, pnl.Hei";
Debug.ShouldStop(-2147483648);
_pnl.runVoidMethod ("AddView",(Object)((_addedcontent.getObject())),(Object)(__ref.getField(true,"_chkboxsize")),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getHeight"),__ref.getField(true,"_dividersize")}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getwidth"),__ref.getField(true,"_chkboxsize")}, "-",1, 1)),(Object)(_contentheight));
 }else {
 BA.debugLineNum = 962;BA.debugLine="pnl.AddView(AddedContent, 0, pnl.Height - Div";
Debug.ShouldStop(2);
_pnl.runVoidMethod ("AddView",(Object)((_addedcontent.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getHeight"),__ref.getField(true,"_dividersize")}, "-",1, 1)),(Object)(__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getwidth")),(Object)(_contentheight));
 };
 BA.debugLineNum = 964;BA.debugLine="pnl.Height = pnl.Height + ContentHeight";
Debug.ShouldStop(8);
_pnl.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getHeight"),_contentheight}, "+",1, 1));
 BA.debugLineNum = 965;BA.debugLine="svHeight = svHeight + ContentHeight";
Debug.ShouldStop(16);
__ref.setField ("_svheight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_svheight"),_contentheight}, "+",1, 1));
 BA.debugLineNum = 966;BA.debugLine="sv.Panel.Height = svHeight";
Debug.ShouldStop(32);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(true,"_svheight"));
 BA.debugLineNum = 968;BA.debugLine="Dim ContentBottom As Int";
Debug.ShouldStop(128);
_contentbottom = RemoteObject.createImmutable(0);Debug.locals.put("ContentBottom", _contentbottom);
 BA.debugLineNum = 969;BA.debugLine="ContentBottom = pnl.Top + pnl.Height";
Debug.ShouldStop(256);
_contentbottom = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("ContentBottom", _contentbottom);
 BA.debugLineNum = 970;BA.debugLine="If ContentBottom > sv.VerticalScrollPosition +";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",_contentbottom,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(true,"getVerticalScrollPosition"),__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getheight")}, "+",1, 1)))) { 
 BA.debugLineNum = 972;BA.debugLine="Dim NewPosition As Int";
Debug.ShouldStop(2048);
_newposition = RemoteObject.createImmutable(0);Debug.locals.put("NewPosition", _newposition);
 BA.debugLineNum = 973;BA.debugLine="DoEvents";
Debug.ShouldStop(4096);
clschecklist.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 974;BA.debugLine="NewPosition = sv.VerticalScrollPosition + Min";
Debug.ShouldStop(8192);
_newposition = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(true,"getVerticalScrollPosition"),clschecklist.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_contentbottom,__ref.getField(false,"_sv").runMethod(true,"getVerticalScrollPosition"),__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getheight")}, "--",2, 1))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (com.bcleaner.clschecklist.class, "_getheight")))),clschecklist.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 15)))}, "++",2, 0));Debug.locals.put("NewPosition", _newposition);
 BA.debugLineNum = 975;BA.debugLine="CommonJump(NewPosition)";
Debug.ShouldStop(16384);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_commonjump",(Object)(_newposition));
 };
 BA.debugLineNum = 978;BA.debugLine="AddedContent.RequestFocus";
Debug.ShouldStop(131072);
_addedcontent.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 979;BA.debugLine="MoveFollowingPanels = True";
Debug.ShouldStop(262144);
_movefollowingpanels = clschecklist.__c.getField(true,"True");Debug.locals.put("MoveFollowingPanels", _movefollowingpanels);
 }}};
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 983;BA.debugLine="End Sub";
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
public static RemoteObject  _filter(RemoteObject __ref,RemoteObject _viewindexinpanel,RemoteObject _comparisonfunction,RemoteObject _filtertype) throws Exception{
try {
		Debug.PushSubsStack("Filter (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1191);
if (RapidSub.canDelegate("filter")) return __ref.runUserSub(false, "clschecklist","filter", __ref, _viewindexinpanel, _comparisonfunction, _filtertype);
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _firstpos = RemoteObject.createImmutable(0);
RemoteObject _count = RemoteObject.createImmutable(0);
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("ViewIndexInPanel", _viewindexinpanel);
Debug.locals.put("ComparisonFunction", _comparisonfunction);
Debug.locals.put("FilterType", _filtertype);
 BA.debugLineNum = 1191;BA.debugLine="Private Sub Filter(ViewIndexInPanel As Int, Compar";
Debug.ShouldStop(64);
 BA.debugLineNum = 1196;BA.debugLine="If Not(SubExists(CallbackMod, ComparisonFunction)";
Debug.ShouldStop(2048);
if (clschecklist.__c.runMethod(true,"Not",(Object)(clschecklist.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(_comparisonfunction)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1197;BA.debugLine="Log(ComparisonFunction & \" not found\")";
Debug.ShouldStop(4096);
clschecklist.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_comparisonfunction,RemoteObject.createImmutable(" not found"))));
 BA.debugLineNum = 1198;BA.debugLine="Return 0";
Debug.ShouldStop(8192);
if (true) return BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 1200;BA.debugLine="Dim L As List";
Debug.ShouldStop(32768);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("L", _l);
 BA.debugLineNum = 1201;BA.debugLine="If FilterType = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_filtertype,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1202;BA.debugLine="L = CreateTagList(ViewIndexInPanel, 0, NumberOfI";
Debug.ShouldStop(131072);
_l = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_createtaglist",(Object)(_viewindexinpanel),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("L", _l);
 }else {
 BA.debugLineNum = 1204;BA.debugLine="L = CreateTextList(ViewIndexInPanel, 0, NumberOf";
Debug.ShouldStop(524288);
_l = __ref.runClassMethod (com.bcleaner.clschecklist.class, "_createtextlist",(Object)(_viewindexinpanel),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("L", _l);
 };
 BA.debugLineNum = 1206;BA.debugLine="Dim FirstPos, Count As Int";
Debug.ShouldStop(2097152);
_firstpos = RemoteObject.createImmutable(0);Debug.locals.put("FirstPos", _firstpos);
_count = RemoteObject.createImmutable(0);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1207;BA.debugLine="FirstPos = -1";
Debug.ShouldStop(4194304);
_firstpos = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("FirstPos", _firstpos);
 BA.debugLineNum = 1208;BA.debugLine="Dim S As String, pnl As Panel";
Debug.ShouldStop(8388608);
_s = RemoteObject.createImmutable("");Debug.locals.put("S", _s);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1209;BA.debugLine="For i = 0 To L.Size - 1";
Debug.ShouldStop(16777216);
{
final int step14 = 1;
final int limit14 = RemoteObject.solve(new RemoteObject[] {_l.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1210;BA.debugLine="S = L.Get(i)";
Debug.ShouldStop(33554432);
_s = BA.ObjectToString(_l.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("S", _s);
 BA.debugLineNum = 1211;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(67108864);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 1212;BA.debugLine="CallSub3(CallbackMod, ComparisonFunction, pnl.Ta";
Debug.ShouldStop(134217728);
clschecklist.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(_comparisonfunction),(Object)(_pnl.runMethod(false,"getTag")),(Object)((_s)));
 BA.debugLineNum = 1213;BA.debugLine="If FilterResult = True Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_filterresult"),clschecklist.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1214;BA.debugLine="Count = Count + 1";
Debug.ShouldStop(536870912);
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Count", _count);
 BA.debugLineNum = 1215;BA.debugLine="If pnl.Visible = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(true,"getVisible"),clschecklist.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1216;BA.debugLine="If FirstPos = -1 Then FirstPos = i";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_firstpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_firstpos = BA.numberCast(int.class, _i);Debug.locals.put("FirstPos", _firstpos);};
 BA.debugLineNum = 1217;BA.debugLine="pnl.Visible = True";
Debug.ShouldStop(1);
_pnl.runMethod(true,"setVisible",clschecklist.__c.getField(true,"True"));
 };
 }else {
 BA.debugLineNum = 1220;BA.debugLine="If FirstPos = -1 Then FirstPos = i";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_firstpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_firstpos = BA.numberCast(int.class, _i);Debug.locals.put("FirstPos", _firstpos);};
 BA.debugLineNum = 1221;BA.debugLine="pnl.Visible = False";
Debug.ShouldStop(16);
_pnl.runMethod(true,"setVisible",clschecklist.__c.getField(true,"False"));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1224;BA.debugLine="If FirstPos > -1 Then MoveTopAfterFiltering(First";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_firstpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_movetopafterfiltering",(Object)(_firstpos));};
 BA.debugLineNum = 1225;BA.debugLine="Return Count";
Debug.ShouldStop(256);
if (true) return _count;
 BA.debugLineNum = 1226;BA.debugLine="End Sub";
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
public static RemoteObject  _filtertag(RemoteObject __ref,RemoteObject _viewindexinpanel,RemoteObject _comparisonfunction) throws Exception{
try {
		Debug.PushSubsStack("FilterTag (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1232);
if (RapidSub.canDelegate("filtertag")) return __ref.runUserSub(false, "clschecklist","filtertag", __ref, _viewindexinpanel, _comparisonfunction);
Debug.locals.put("ViewIndexInPanel", _viewindexinpanel);
Debug.locals.put("ComparisonFunction", _comparisonfunction);
 BA.debugLineNum = 1232;BA.debugLine="Public Sub FilterTag(ViewIndexInPanel As Int, Comp";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1233;BA.debugLine="Return Filter(ViewIndexInPanel, ComparisonFunctio";
Debug.ShouldStop(65536);
if (true) return __ref.runClassMethod (com.bcleaner.clschecklist.class, "_filter",(Object)(_viewindexinpanel),(Object)(_comparisonfunction),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1234;BA.debugLine="End Sub";
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
public static RemoteObject  _filtertext(RemoteObject __ref,RemoteObject _viewindexinpanel,RemoteObject _comparisonfunction) throws Exception{
try {
		Debug.PushSubsStack("FilterText (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1240);
if (RapidSub.canDelegate("filtertext")) return __ref.runUserSub(false, "clschecklist","filtertext", __ref, _viewindexinpanel, _comparisonfunction);
Debug.locals.put("ViewIndexInPanel", _viewindexinpanel);
Debug.locals.put("ComparisonFunction", _comparisonfunction);
 BA.debugLineNum = 1240;BA.debugLine="Public Sub FilterText(ViewIndexInPanel As Int, Com";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1241;BA.debugLine="Return Filter(ViewIndexInPanel, ComparisonFunctio";
Debug.ShouldStop(16777216);
if (true) return __ref.runClassMethod (com.bcleaner.clschecklist.class, "_filter",(Object)(_viewindexinpanel),(Object)(_comparisonfunction),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 1242;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findpanelcontaining(RemoteObject __ref,RemoteObject _myview) throws Exception{
try {
		Debug.PushSubsStack("FindPanelContaining (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,715);
if (RapidSub.canDelegate("findpanelcontaining")) return __ref.runUserSub(false, "clschecklist","findpanelcontaining", __ref, _myview);
Debug.locals.put("MyView", _myview);
 BA.debugLineNum = 715;BA.debugLine="Public Sub FindPanelContaining(MyView As View) As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 716;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(2048);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 717;BA.debugLine="Return GetParentPanel(MyView)";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.runClassMethod (com.bcleaner.clschecklist.class, "_getparentpanel",(Object)(_myview)).getObject());
 }else {
 BA.debugLineNum = 719;BA.debugLine="Return Null";
Debug.ShouldStop(16384);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), clschecklist.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findpanelwithid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("FindPanelWithID (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,726);
if (RapidSub.canDelegate("findpanelwithid")) return __ref.runUserSub(false, "clschecklist","findpanelwithid", __ref, _id);
int _i = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("ID", _id);
 BA.debugLineNum = 726;BA.debugLine="Public Sub FindPanelWithID(ID As Object) As Object";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 727;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(4194304);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 728;BA.debugLine="For i = 0 To NumberOfItems - 1";
Debug.ShouldStop(8388608);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 729;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(16777216);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 730;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(33554432);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 731;BA.debugLine="If pnl.Tag = ID Then Return pnl";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(false,"getTag"),_id)) { 
if (true) return (_pnl.getObject());};
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 734;BA.debugLine="Return Null";
Debug.ShouldStop(536870912);
if (true) return clschecklist.__c.getField(false,"Null");
 BA.debugLineNum = 735;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirsttext(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetFirstText (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,681);
if (RapidSub.canDelegate("getfirsttext")) return __ref.runUserSub(false, "clschecklist","getfirsttext", __ref, _id);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
int _p = 0;
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("ID", _id);
 BA.debugLineNum = 681;BA.debugLine="Public Sub GetFirstText(ID As Object) As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 682;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(512);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 683;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
Debug.ShouldStop(1024);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 684;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(2048);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 685;BA.debugLine="If pnl.Tag = Null Then Continue";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("n",_pnl.runMethod(false,"getTag"))) { 
if (true) continue;};
 BA.debugLineNum = 686;BA.debugLine="If pnl.Tag = ID Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(false,"getTag"),_id)) { 
 BA.debugLineNum = 687;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
Debug.ShouldStop(16384);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_p = 0 ; (step6 > 0 && _p <= limit6) || (step6 < 0 && _p >= limit6); _p = ((int)(0 + _p + step6)) ) {
Debug.locals.put("p", _p);
 BA.debugLineNum = 688;BA.debugLine="If IsLabel(pnl.GetView(p)) Then";
Debug.ShouldStop(32768);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_islabel",(Object)(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 689;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(65536);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 690;BA.debugLine="lbl = pnl.GetView(p)";
Debug.ShouldStop(131072);
_lbl.setObject(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))).getObject());
 BA.debugLineNum = 691;BA.debugLine="Return lbl.Text";
Debug.ShouldStop(262144);
if (true) return _lbl.runMethod(true,"getText");
 };
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 694;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 697;BA.debugLine="Return \"\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 698;BA.debugLine="End Sub";
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
public static RemoteObject  _getheight(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeight (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,654);
if (RapidSub.canDelegate("getheight")) return __ref.runUserSub(false, "clschecklist","getheight", __ref);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _hauteur = RemoteObject.createImmutable(0);
 BA.debugLineNum = 654;BA.debugLine="Public Sub getHeight As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 655;BA.debugLine="If sv.Height < 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_sv").runMethod(true,"getHeight"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 656;BA.debugLine="Dim r As Reflector, Hauteur As Int";
Debug.ShouldStop(32768);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
_hauteur = RemoteObject.createImmutable(0);Debug.locals.put("Hauteur", _hauteur);
 BA.debugLineNum = 657;BA.debugLine="r.Target = sv";
Debug.ShouldStop(65536);
_r.setField ("Target",(__ref.getField(false,"_sv").getObject()));
 BA.debugLineNum = 658;BA.debugLine="Hauteur = r.RunMethod(\"getHeight\")";
Debug.ShouldStop(131072);
_hauteur = BA.numberCast(int.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getHeight"))));Debug.locals.put("Hauteur", _hauteur);
 BA.debugLineNum = 659;BA.debugLine="If Hauteur = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_hauteur,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 660;BA.debugLine="DoEvents";
Debug.ShouldStop(524288);
clschecklist.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 661;BA.debugLine="Hauteur = r.RunMethod(\"getHeight\")";
Debug.ShouldStop(1048576);
_hauteur = BA.numberCast(int.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getHeight"))));Debug.locals.put("Hauteur", _hauteur);
 };
 BA.debugLineNum = 663;BA.debugLine="Return Hauteur";
Debug.ShouldStop(4194304);
if (true) return _hauteur;
 }else {
 BA.debugLineNum = 665;BA.debugLine="Return sv.Height";
Debug.ShouldStop(16777216);
if (true) return __ref.getField(false,"_sv").runMethod(true,"getHeight");
 };
 BA.debugLineNum = 667;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getparentpanel(RemoteObject __ref,RemoteObject _myview) throws Exception{
try {
		Debug.PushSubsStack("GetParentPanel (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,700);
if (RapidSub.canDelegate("getparentpanel")) return __ref.runUserSub(false, "clschecklist","getparentpanel", __ref, _myview);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _parent = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
Debug.locals.put("MyView", _myview);
 BA.debugLineNum = 700;BA.debugLine="Private Sub GetParentPanel(MyView As View) As View";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 701;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(268435456);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 702;BA.debugLine="Dim v, Parent As View";
Debug.ShouldStop(536870912);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
_parent = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("Parent", _parent);
 BA.debugLineNum = 703;BA.debugLine="r.Target = MyView";
Debug.ShouldStop(1073741824);
_r.setField ("Target",(_myview.getObject()));
 BA.debugLineNum = 704;BA.debugLine="v = r.Target";
Debug.ShouldStop(-2147483648);
_v.setObject(_r.getField(false,"Target"));
 BA.debugLineNum = 705;BA.debugLine="Parent = r.RunMethod(\"getParent\")";
Debug.ShouldStop(1);
_parent.setObject(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParent"))));
 BA.debugLineNum = 706;BA.debugLine="Do While Parent <> sv.Panel";
Debug.ShouldStop(2);
while (RemoteObject.solveBoolean("!",_parent,__ref.getField(false,"_sv").runMethod(false,"getPanel").getObject())) {
 BA.debugLineNum = 707;BA.debugLine="r.Target = Parent";
Debug.ShouldStop(4);
_r.setField ("Target",(_parent.getObject()));
 BA.debugLineNum = 708;BA.debugLine="v = r.Target";
Debug.ShouldStop(8);
_v.setObject(_r.getField(false,"Target"));
 BA.debugLineNum = 709;BA.debugLine="Parent = r.RunMethod(\"getParent\")";
Debug.ShouldStop(16);
_parent.setObject(_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getParent"))));
 }
;
 BA.debugLineNum = 711;BA.debugLine="Return v";
Debug.ShouldStop(64);
if (true) return _v;
 BA.debugLineNum = 712;BA.debugLine="End Sub";
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
public static RemoteObject  _getwidth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWidth (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,637);
if (RapidSub.canDelegate("getwidth")) return __ref.runUserSub(false, "clschecklist","getwidth", __ref);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _largeur = RemoteObject.createImmutable(0);
 BA.debugLineNum = 637;BA.debugLine="Public Sub getWidth As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 638;BA.debugLine="If sv.Width < 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_sv").runMethod(true,"getWidth"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 639;BA.debugLine="Dim r As Reflector, Largeur As Int";
Debug.ShouldStop(1073741824);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
_largeur = RemoteObject.createImmutable(0);Debug.locals.put("Largeur", _largeur);
 BA.debugLineNum = 640;BA.debugLine="r.Target = sv";
Debug.ShouldStop(-2147483648);
_r.setField ("Target",(__ref.getField(false,"_sv").getObject()));
 BA.debugLineNum = 641;BA.debugLine="Largeur = r.RunMethod(\"getWidth\")";
Debug.ShouldStop(1);
_largeur = BA.numberCast(int.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWidth"))));Debug.locals.put("Largeur", _largeur);
 BA.debugLineNum = 642;BA.debugLine="If Largeur = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_largeur,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 643;BA.debugLine="DoEvents";
Debug.ShouldStop(4);
clschecklist.__c.runVoidMethodAndSync ("DoEvents");
 BA.debugLineNum = 644;BA.debugLine="Largeur = r.RunMethod(\"getWidth\")";
Debug.ShouldStop(8);
_largeur = BA.numberCast(int.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWidth"))));Debug.locals.put("Largeur", _largeur);
 };
 BA.debugLineNum = 646;BA.debugLine="Return Largeur";
Debug.ShouldStop(32);
if (true) return _largeur;
 }else {
 BA.debugLineNum = 648;BA.debugLine="Return sv.Width";
Debug.ShouldStop(128);
if (true) return __ref.getField(false,"_sv").runMethod(true,"getWidth");
 };
 BA.debugLineNum = 650;BA.debugLine="End Sub";
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
public static RemoteObject  _hasextracontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HasExtraContent (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1013);
if (RapidSub.canDelegate("hasextracontent")) return __ref.runUserSub(false, "clschecklist","hasextracontent", __ref);
 BA.debugLineNum = 1013;BA.debugLine="Public Sub HasExtraContent As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1014;BA.debugLine="Return (ExtensionIndex <> -1)";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("!",__ref.getField(true,"_extensionindex"),BA.numberCast(double.class, -(double) (0 + 1)))));
 BA.debugLineNum = 1015;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _module,RemoteObject _svlist,RemoteObject _subcheck,RemoteObject _subclick,RemoteObject _sublongclick,RemoteObject _dividerheight) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "clschecklist","initialize", __ref, _ba, _module, _svlist, _subcheck, _subclick, _sublongclick, _dividerheight);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
int _i = 0;
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _id_presseddrawable = RemoteObject.createImmutable(0);
Debug.locals.put("ba", _ba);
Debug.locals.put("Module", _module);
Debug.locals.put("svList", _svlist);
Debug.locals.put("subCheck", _subcheck);
Debug.locals.put("subClick", _subclick);
Debug.locals.put("subLongClick", _sublongclick);
Debug.locals.put("DividerHeight", _dividerheight);
 BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize(Module As Object, svList As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="sv = svList";
Debug.ShouldStop(16384);
__ref.setField ("_sv",_svlist);
 BA.debugLineNum = 48;BA.debugLine="For i = sv.Panel.NumberOfViews-1 To 0 Step -1";
Debug.ShouldStop(32768);
{
final int step2 = (int) (0 + -(double) (0 + 1));
final int limit2 = 0;
for (_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 49;BA.debugLine="sv.Panel.RemoveViewAt(i)";
Debug.ShouldStop(65536);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runVoidMethod ("RemoveViewAt",(Object)(BA.numberCast(int.class, _i)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 51;BA.debugLine="sv.Panel.Height = 0";
Debug.ShouldStop(262144);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 52;BA.debugLine="svHeight = 0";
Debug.ShouldStop(524288);
__ref.setField ("_svheight",BA.numberCast(int.class, 0));
 BA.debugLineNum = 53;BA.debugLine="CallbackMod = Module";
Debug.ShouldStop(1048576);
__ref.setField ("_callbackmod",_module);
 BA.debugLineNum = 54;BA.debugLine="sub_Check = subCheck";
Debug.ShouldStop(2097152);
__ref.setField ("_sub_check",_subcheck);
 BA.debugLineNum = 55;BA.debugLine="sub_Click = subClick";
Debug.ShouldStop(4194304);
__ref.setField ("_sub_click",_subclick);
 BA.debugLineNum = 56;BA.debugLine="sub_LongClick = subLongClick";
Debug.ShouldStop(8388608);
__ref.setField ("_sub_longclick",_sublongclick);
 BA.debugLineNum = 57;BA.debugLine="ModeCheck = (sub_Click = \"\")";
Debug.ShouldStop(16777216);
__ref.setField ("_modecheck",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_sub_click"),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 58;BA.debugLine="BlockCheckEvent = False";
Debug.ShouldStop(33554432);
__ref.setField ("_blockcheckevent",clschecklist.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="DividerSize = DividerHeight";
Debug.ShouldStop(67108864);
__ref.setField ("_dividersize",_dividerheight);
 BA.debugLineNum = 60;BA.debugLine="DividerColor = Colors.ARGB(150, 200, 200, 200)";
Debug.ShouldStop(134217728);
__ref.setField ("_dividercolor",clschecklist.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200))));
 BA.debugLineNum = 61;BA.debugLine="BackgroundColor = Colors.Transparent";
Debug.ShouldStop(268435456);
__ref.setField ("_backgroundcolor",clschecklist.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 62;BA.debugLine="CheckedColor = Colors.Transparent";
Debug.ShouldStop(536870912);
__ref.setField ("_checkedcolor",clschecklist.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 63;BA.debugLine="ExtensionColor = Colors.Transparent";
Debug.ShouldStop(1073741824);
__ref.setField ("_extensioncolor",clschecklist.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 64;BA.debugLine="ExtensionIndex = -1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_extensionindex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 65;BA.debugLine="ExtensionView = Null";
Debug.ShouldStop(1);
__ref.getField(false,"_extensionview").setObject (clschecklist.__c.getField(false,"Null"));
 BA.debugLineNum = 66;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 67;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(4);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 68;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(8);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 69;BA.debugLine="r.Target = r.RunMethod(\"getSystem\")";
Debug.ShouldStop(16);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getSystem"))));
 BA.debugLineNum = 70;BA.debugLine="Dim ID_PressedDrawable As Int";
Debug.ShouldStop(32);
_id_presseddrawable = RemoteObject.createImmutable(0);Debug.locals.put("ID_PressedDrawable", _id_presseddrawable);
 BA.debugLineNum = 71;BA.debugLine="ID_PressedDrawable = r.RunMethod4(\"getIdentifier\"";
Debug.ShouldStop(64);
_id_presseddrawable = BA.numberCast(int.class, _r.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("getIdentifier")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("list_selector_background_pressed")),RemoteObject.createImmutable(("drawable")),(RemoteObject.createImmutable("android"))})),(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("java.lang.String"),BA.ObjectToString("java.lang.String"),RemoteObject.createImmutable("java.lang.String")}))));Debug.locals.put("ID_PressedDrawable", _id_presseddrawable);
 BA.debugLineNum = 73;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(256);
_r.setField ("Target",(_r.runMethod(false,"GetContext",__ref.getField(false, "ba"))));
 BA.debugLineNum = 74;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(512);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 75;BA.debugLine="PressedDrawable = r.RunMethod2(\"getDrawable\", ID_";
Debug.ShouldStop(1024);
__ref.setField ("_presseddrawable",_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("getDrawable")),(Object)(BA.NumberToString(_id_presseddrawable)),(Object)(RemoteObject.createImmutable("java.lang.int"))));
 BA.debugLineNum = 76;BA.debugLine="DragAndDrop = Null";
Debug.ShouldStop(2048);
__ref.getField(false,"_draganddrop").setObject (clschecklist.__c.getField(false,"Null"));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
public static RemoteObject  _ischeckbox(RemoteObject __ref,RemoteObject _myview) throws Exception{
try {
		Debug.PushSubsStack("IsCheckBox (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,803);
if (RapidSub.canDelegate("ischeckbox")) return __ref.runUserSub(false, "clschecklist","ischeckbox", __ref, _myview);
Debug.locals.put("MyView", _myview);
 BA.debugLineNum = 803;BA.debugLine="Private Sub IsCheckBox(MyView As View) As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 804;BA.debugLine="Return (GetType(MyView) = \"android.widget.CheckBo";
Debug.ShouldStop(8);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("=",clschecklist.__c.runMethod(true,"GetType",(Object)((_myview.getObject()))),RemoteObject.createImmutable("android.widget.CheckBox"))));
 BA.debugLineNum = 805;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isedittext(RemoteObject __ref,RemoteObject _myview) throws Exception{
try {
		Debug.PushSubsStack("IsEditText (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,461);
if (RapidSub.canDelegate("isedittext")) return __ref.runUserSub(false, "clschecklist","isedittext", __ref, _myview);
Debug.locals.put("MyView", _myview);
 BA.debugLineNum = 461;BA.debugLine="Private Sub IsEditText(MyView As View) As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 462;BA.debugLine="Return (GetType(MyView) = \"android.widget.EditTex";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("=",clschecklist.__c.runMethod(true,"GetType",(Object)((_myview.getObject()))),RemoteObject.createImmutable("android.widget.EditText"))));
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isfiltered(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("IsFiltered (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1245);
if (RapidSub.canDelegate("isfiltered")) return __ref.runUserSub(false, "clschecklist","isfiltered", __ref, _position);
Debug.locals.put("Position", _position);
 BA.debugLineNum = 1245;BA.debugLine="Public Sub IsFiltered(Position As Int) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1246;BA.debugLine="Return sv.Panel.GetView(Position).Visible";
Debug.ShouldStop(536870912);
if (true) return __ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_position)).runMethod(true,"getVisible");
 BA.debugLineNum = 1247;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _islabel(RemoteObject __ref,RemoteObject _myview) throws Exception{
try {
		Debug.PushSubsStack("IsLabel (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,465);
if (RapidSub.canDelegate("islabel")) return __ref.runUserSub(false, "clschecklist","islabel", __ref, _myview);
Debug.locals.put("MyView", _myview);
 BA.debugLineNum = 465;BA.debugLine="Private Sub IsLabel(MyView As View) As Boolean";
Debug.ShouldStop(65536);
 BA.debugLineNum = 466;BA.debugLine="Return (GetType(MyView) = \"android.widget.TextVie";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("=",clschecklist.__c.runMethod(true,"GetType",(Object)((_myview.getObject()))),RemoteObject.createImmutable("android.widget.TextView"))));
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptoitem(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,770);
if (RapidSub.canDelegate("jumptoitem")) return __ref.runUserSub(false, "clschecklist","jumptoitem", __ref, _id);
RemoteObject _totalheight = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("ID", _id);
 BA.debugLineNum = 770;BA.debugLine="Public Sub JumpToItem(ID As Object) As Panel";
Debug.ShouldStop(2);
 BA.debugLineNum = 771;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(4);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 772;BA.debugLine="Dim TotalHeight As Int";
Debug.ShouldStop(8);
_totalheight = RemoteObject.createImmutable(0);Debug.locals.put("TotalHeight", _totalheight);
 BA.debugLineNum = 773;BA.debugLine="For i = 0 To NumberOfItems - 1";
Debug.ShouldStop(16);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 774;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(32);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 775;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(64);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 776;BA.debugLine="If pnl.Tag <> Null Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_pnl.runMethod(false,"getTag"))) { 
 BA.debugLineNum = 777;BA.debugLine="If pnl.Tag = ID Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(false,"getTag"),_id)) { 
 BA.debugLineNum = 778;BA.debugLine="CommonJump(TotalHeight)";
Debug.ShouldStop(512);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_commonjump",(Object)(_totalheight));
 BA.debugLineNum = 779;BA.debugLine="Return pnl";
Debug.ShouldStop(1024);
if (true) return _pnl;
 };
 };
 BA.debugLineNum = 782;BA.debugLine="TotalHeight = TotalHeight + pnl.Height";
Debug.ShouldStop(8192);
_totalheight = RemoteObject.solve(new RemoteObject[] {_totalheight,_pnl.runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("TotalHeight", _totalheight);
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 785;BA.debugLine="Return Null";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), clschecklist.__c.getField(false,"Null"));
 BA.debugLineNum = 786;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptoposition(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("JumpToPosition (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,755);
if (RapidSub.canDelegate("jumptoposition")) return __ref.runUserSub(false, "clschecklist","jumptoposition", __ref, _position);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Position", _position);
 BA.debugLineNum = 755;BA.debugLine="Public Sub JumpToPosition(Position As Int) As Pane";
Debug.ShouldStop(262144);
 BA.debugLineNum = 756;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(524288);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 757;BA.debugLine="Position = Max(Position, 0)";
Debug.ShouldStop(1048576);
_position = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _position)),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Position", _position);
 BA.debugLineNum = 758;BA.debugLine="Position = Min(Position, NumberOfItems - 1)";
Debug.ShouldStop(2097152);
_position = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _position)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("Position", _position);
 BA.debugLineNum = 759;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(4194304);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 760;BA.debugLine="pnl = sv.Panel.GetView(Position)";
Debug.ShouldStop(8388608);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_position)).getObject());
 BA.debugLineNum = 761;BA.debugLine="CommonJump(pnl.Top)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_commonjump",(Object)(_pnl.runMethod(true,"getTop")));
 BA.debugLineNum = 762;BA.debugLine="Return pnl";
Debug.ShouldStop(33554432);
if (true) return _pnl;
 };
 BA.debugLineNum = 764;BA.debugLine="Return Null";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), clschecklist.__c.getField(false,"Null"));
 BA.debugLineNum = 765;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptoview(RemoteObject __ref,RemoteObject _myview) throws Exception{
try {
		Debug.PushSubsStack("JumpToView (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,790);
if (RapidSub.canDelegate("jumptoview")) return __ref.runUserSub(false, "clschecklist","jumptoview", __ref, _myview);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("MyView", _myview);
 BA.debugLineNum = 790;BA.debugLine="Public Sub JumpToView(MyView As View) As Panel";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 791;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(4194304);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 792;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(8388608);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 793;BA.debugLine="pnl = GetParentPanel(MyView)";
Debug.ShouldStop(16777216);
_pnl.setObject(__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getparentpanel",(Object)(_myview)).getObject());
 BA.debugLineNum = 794;BA.debugLine="CommonJump(pnl.Top)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_commonjump",(Object)(_pnl.runMethod(true,"getTop")));
 BA.debugLineNum = 795;BA.debugLine="Return pnl";
Debug.ShouldStop(67108864);
if (true) return _pnl;
 }else {
 BA.debugLineNum = 797;BA.debugLine="Return Null";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), clschecklist.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 799;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecheckedlist(RemoteObject __ref,RemoteObject _listtype) throws Exception{
try {
		Debug.PushSubsStack("MakeCheckedList (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,807);
if (RapidSub.canDelegate("makecheckedlist")) return __ref.runUserSub(false, "clschecklist","makecheckedlist", __ref, _listtype);
RemoteObject _listecoches = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _p = 0;
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("ListType", _listtype);
 BA.debugLineNum = 807;BA.debugLine="Private Sub MakeCheckedList(ListType As Int) As Li";
Debug.ShouldStop(64);
 BA.debugLineNum = 808;BA.debugLine="Dim ListeCoches As List";
Debug.ShouldStop(128);
_listecoches = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListeCoches", _listecoches);
 BA.debugLineNum = 809;BA.debugLine="ListeCoches.Initialize";
Debug.ShouldStop(256);
_listecoches.runVoidMethod ("Initialize");
 BA.debugLineNum = 810;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(512);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 811;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews-1";
Debug.ShouldStop(1024);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4); _i = ((int)(0 + _i + step4)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 812;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(2048);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 813;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(4096);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 814;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
Debug.ShouldStop(8192);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_p = 0 ; (step7 > 0 && _p <= limit7) || (step7 < 0 && _p >= limit7); _p = ((int)(0 + _p + step7)) ) {
Debug.locals.put("p", _p);
 BA.debugLineNum = 815;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
Debug.ShouldStop(16384);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_ischeckbox",(Object)(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 816;BA.debugLine="Dim chk As CheckBox";
Debug.ShouldStop(32768);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chk", _chk);
 BA.debugLineNum = 817;BA.debugLine="chk = pnl.GetView(p)";
Debug.ShouldStop(65536);
_chk.setObject(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))).getObject());
 BA.debugLineNum = 818;BA.debugLine="If chk.Checked Then";
Debug.ShouldStop(131072);
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 819;BA.debugLine="If ListType = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_listtype,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 820;BA.debugLine="ListeCoches.Add(pnl.Tag)";
Debug.ShouldStop(524288);
_listecoches.runVoidMethod ("Add",(Object)(_pnl.runMethod(false,"getTag")));
 }else {
 BA.debugLineNum = 822;BA.debugLine="ListeCoches.Add(pnl)";
Debug.ShouldStop(2097152);
_listecoches.runVoidMethod ("Add",(Object)((_pnl.getObject())));
 };
 };
 BA.debugLineNum = 825;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 }
}Debug.locals.put("p", _p);
;
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 830;BA.debugLine="Return ListeCoches";
Debug.ShouldStop(536870912);
if (true) return _listecoches;
 BA.debugLineNum = 831;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makevalueslistwith(RemoteObject __ref,RemoteObject _viewindexinpanel,RemoteObject _firstposition,RemoteObject _lastposition,RemoteObject _typeliste) throws Exception{
try {
		Debug.PushSubsStack("MakeValuesListWith (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("makevalueslistwith")) return __ref.runUserSub(false, "clschecklist","makevalueslistwith", __ref, _viewindexinpanel, _firstposition, _lastposition, _typeliste);
RemoteObject _liste = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _e = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _entier = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("ViewIndexInPanel", _viewindexinpanel);
Debug.locals.put("FirstPosition", _firstposition);
Debug.locals.put("LastPosition", _lastposition);
Debug.locals.put("TypeListe", _typeliste);
 BA.debugLineNum = 470;BA.debugLine="Private Sub MakeValuesListWith(ViewIndexInPanel As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 471;BA.debugLine="Dim Liste As List: Liste.Initialize";
Debug.ShouldStop(4194304);
_liste = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Liste", _liste);
 BA.debugLineNum = 471;BA.debugLine="Dim Liste As List: Liste.Initialize";
Debug.ShouldStop(4194304);
_liste.runVoidMethod ("Initialize");
 BA.debugLineNum = 472;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(8388608);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 473;BA.debugLine="If LastPosition > NumberOfItems - 1 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_lastposition,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 474;BA.debugLine="Log(\"LastPosition is beyond the last item\")";
Debug.ShouldStop(33554432);
clschecklist.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("LastPosition is beyond the last item")));
 BA.debugLineNum = 475;BA.debugLine="Return Liste";
Debug.ShouldStop(67108864);
if (true) return _liste;
 };
 BA.debugLineNum = 477;BA.debugLine="Dim pnl As Panel, v As View";
Debug.ShouldStop(268435456);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");Debug.locals.put("v", _v);
 BA.debugLineNum = 478;BA.debugLine="Dim l As Label, e As EditText";
Debug.ShouldStop(536870912);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("l", _l);
_e = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");Debug.locals.put("e", _e);
 BA.debugLineNum = 479;BA.debugLine="Dim entier As Int";
Debug.ShouldStop(1073741824);
_entier = RemoteObject.createImmutable(0);Debug.locals.put("entier", _entier);
 BA.debugLineNum = 480;BA.debugLine="For i = FirstPosition To LastPosition";
Debug.ShouldStop(-2147483648);
{
final int step11 = 1;
final int limit11 = _lastposition.<Integer>get().intValue();
for (_i = _firstposition.<Integer>get().intValue() ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 481;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(1);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 482;BA.debugLine="v = pnl.GetView(ViewIndexInPanel)";
Debug.ShouldStop(2);
_v = _pnl.runMethod(false,"GetView",(Object)(_viewindexinpanel));Debug.locals.put("v", _v);
 BA.debugLineNum = 483;BA.debugLine="If TypeListe = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_typeliste,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 485;BA.debugLine="Liste.Add(v.Tag)";
Debug.ShouldStop(16);
_liste.runVoidMethod ("Add",(Object)(_v.runMethod(false,"getTag")));
 }else 
{ BA.debugLineNum = 486;BA.debugLine="Else If TypeListe = 1 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_typeliste,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 488;BA.debugLine="If Not(v.IsInitialized) Then";
Debug.ShouldStop(128);
if (clschecklist.__c.runMethod(true,"Not",(Object)(_v.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 489;BA.debugLine="Liste.Add(\"\")";
Debug.ShouldStop(256);
_liste.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable(""))));
 }else 
{ BA.debugLineNum = 490;BA.debugLine="Else If IsLabel(v) Then";
Debug.ShouldStop(512);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_islabel",(Object)(_v)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 491;BA.debugLine="l = v";
Debug.ShouldStop(1024);
_l.setObject(_v.getObject());
 BA.debugLineNum = 492;BA.debugLine="Liste.Add(l.Text)";
Debug.ShouldStop(2048);
_liste.runVoidMethod ("Add",(Object)((_l.runMethod(true,"getText"))));
 }else 
{ BA.debugLineNum = 493;BA.debugLine="Else If IsEditText(v) Then";
Debug.ShouldStop(4096);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_isedittext",(Object)(_v)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 494;BA.debugLine="e = v";
Debug.ShouldStop(8192);
_e.setObject(_v.getObject());
 BA.debugLineNum = 495;BA.debugLine="Liste.Add(e.Text)";
Debug.ShouldStop(16384);
_liste.runVoidMethod ("Add",(Object)((_e.runMethod(true,"getText"))));
 }}};
 }else {
 BA.debugLineNum = 499;BA.debugLine="If Not(v.IsInitialized) Then";
Debug.ShouldStop(262144);
if (clschecklist.__c.runMethod(true,"Not",(Object)(_v.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 500;BA.debugLine="Liste.Add(0)";
Debug.ShouldStop(524288);
_liste.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((0))));
 }else 
{ BA.debugLineNum = 501;BA.debugLine="Else If IsLabel(v) Then";
Debug.ShouldStop(1048576);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_islabel",(Object)(_v)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 502;BA.debugLine="l = v";
Debug.ShouldStop(2097152);
_l.setObject(_v.getObject());
 BA.debugLineNum = 503;BA.debugLine="If IsNumber(l.Text) Then";
Debug.ShouldStop(4194304);
if (clschecklist.__c.runMethod(true,"IsNumber",(Object)(_l.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 504;BA.debugLine="entier = Floor(l.Text)";
Debug.ShouldStop(8388608);
_entier = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _l.runMethod(true,"getText")))));Debug.locals.put("entier", _entier);
 BA.debugLineNum = 505;BA.debugLine="Liste.Add(entier)";
Debug.ShouldStop(16777216);
_liste.runVoidMethod ("Add",(Object)((_entier)));
 }else {
 BA.debugLineNum = 507;BA.debugLine="Liste.Add(0)";
Debug.ShouldStop(67108864);
_liste.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((0))));
 };
 }else 
{ BA.debugLineNum = 509;BA.debugLine="Else If IsEditText(v) Then";
Debug.ShouldStop(268435456);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_isedittext",(Object)(_v)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 510;BA.debugLine="e = v";
Debug.ShouldStop(536870912);
_e.setObject(_v.getObject());
 BA.debugLineNum = 511;BA.debugLine="If IsNumber(e.Text) Then";
Debug.ShouldStop(1073741824);
if (clschecklist.__c.runMethod(true,"IsNumber",(Object)(_e.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 512;BA.debugLine="entier = Floor(e.Text)";
Debug.ShouldStop(-2147483648);
_entier = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, _e.runMethod(true,"getText")))));Debug.locals.put("entier", _entier);
 BA.debugLineNum = 513;BA.debugLine="Liste.Add(entier)";
Debug.ShouldStop(1);
_liste.runVoidMethod ("Add",(Object)((_entier)));
 }else {
 BA.debugLineNum = 515;BA.debugLine="Liste.Add(0)";
Debug.ShouldStop(4);
_liste.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable((0))));
 };
 }}};
 }};
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 521;BA.debugLine="Return Liste";
Debug.ShouldStop(256);
if (true) return _liste;
 BA.debugLineNum = 522;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _moveddpanel(RemoteObject __ref,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("MoveDDPanel (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1061);
if (RapidSub.canDelegate("moveddpanel")) return __ref.runUserSub(false, "clschecklist","moveddpanel", __ref, _y);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("Y", _y);
 BA.debugLineNum = 1061;BA.debugLine="Private Sub MoveDDPanel(Y As Int)";
Debug.ShouldStop(16);
 BA.debugLineNum = 1063;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(64);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 1064;BA.debugLine="r.Target = sv";
Debug.ShouldStop(128);
_r.setField ("Target",(__ref.getField(false,"_sv").getObject()));
 BA.debugLineNum = 1065;BA.debugLine="r.RunMethod2(\"requestDisallowInterceptTouchEvent\"";
Debug.ShouldStop(256);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("requestDisallowInterceptTouchEvent")),(Object)(BA.ObjectToString(clschecklist.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 1066;BA.debugLine="DragAndDrop.Top = Min(Max(0, DragAndDrop.Top + Y";
Debug.ShouldStop(512);
__ref.getField(false,"_draganddrop").runMethod(true,"setTop",BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Min",(Object)(clschecklist.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_draganddrop").runMethod(true,"getTop"),_y,__ref.getField(true,"_lasty")}, "+-",2, 1))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(false,"_draganddrop").runMethod(true,"getHeight")}, "-",1, 1))))));
 BA.debugLineNum = 1067;BA.debugLine="If DragAndDrop.Top < sv.VerticalScrollPosition Th";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_draganddrop").runMethod(true,"getTop"),BA.numberCast(double.class, __ref.getField(false,"_sv").runMethod(true,"getVerticalScrollPosition")))) { 
__ref.getField(false,"_sv").runMethod(true,"setVerticalScrollPosition",__ref.getField(false,"_draganddrop").runMethod(true,"getTop"));};
 BA.debugLineNum = 1068;BA.debugLine="If DragAndDrop.Top + DragAndDrop.Height > sv.Vert";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_draganddrop").runMethod(true,"getTop"),__ref.getField(false,"_draganddrop").runMethod(true,"getHeight")}, "+",1, 1),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(true,"getVerticalScrollPosition"),__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getheight")}, "+",1, 1)))) { 
 BA.debugLineNum = 1069;BA.debugLine="sv.VerticalScrollPosition = DragAndDrop.Top + Dr";
Debug.ShouldStop(4096);
__ref.getField(false,"_sv").runMethod(true,"setVerticalScrollPosition",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_draganddrop").runMethod(true,"getTop"),__ref.getField(false,"_draganddrop").runMethod(true,"getHeight"),__ref.runClassMethod (com.bcleaner.clschecklist.class, "_getheight")}, "+-",2, 1));
 };
 BA.debugLineNum = 1071;BA.debugLine="End Sub";
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
public static RemoteObject  _moveitem(RemoteObject __ref,RemoteObject _startposition,RemoteObject _endposition) throws Exception{
try {
		Debug.PushSubsStack("MoveItem (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("moveitem")) return __ref.runUserSub(false, "clschecklist","moveitem", __ref, _startposition, _endposition);
RemoteObject _pnltomove = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pnlheight = RemoteObject.createImmutable(0);
RemoteObject _newtop = RemoteObject.createImmutable(0);
RemoteObject _movefollowingpanels = RemoteObject.createImmutable(false);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _cptbtf = RemoteObject.createImmutable(0);
RemoteObject _cptstb = RemoteObject.createImmutable(0);
Debug.locals.put("StartPosition", _startposition);
Debug.locals.put("EndPosition", _endposition);
 BA.debugLineNum = 287;BA.debugLine="Public Sub MoveItem(StartPosition As Int, EndPosit";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 288;BA.debugLine="If sv.IsInitialized And StartPosition <> EndPosit";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_sv").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("!",_startposition,BA.numberCast(double.class, _endposition))) { 
 BA.debugLineNum = 289;BA.debugLine="If HasExtraContent Then CollapseItem";
Debug.ShouldStop(1);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_collapseitem");};
 BA.debugLineNum = 290;BA.debugLine="StartPosition = Max(0, Min(StartPosition, Number";
Debug.ShouldStop(2);
_startposition = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(clschecklist.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _startposition)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1)))))));Debug.locals.put("StartPosition", _startposition);
 BA.debugLineNum = 291;BA.debugLine="EndPosition = Max(0, Min(EndPosition, NumberOfIt";
Debug.ShouldStop(4);
_endposition = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(clschecklist.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _endposition)),(Object)(BA.numberCast(double.class, __ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems")))))));Debug.locals.put("EndPosition", _endposition);
 BA.debugLineNum = 292;BA.debugLine="Dim pnlToMove As Panel";
Debug.ShouldStop(8);
_pnltomove = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlToMove", _pnltomove);
 BA.debugLineNum = 293;BA.debugLine="pnlToMove = sv.Panel.GetView(StartPosition)";
Debug.ShouldStop(16);
_pnltomove.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_startposition)).getObject());
 BA.debugLineNum = 294;BA.debugLine="Dim PnlHeight, NewTop As Int";
Debug.ShouldStop(32);
_pnlheight = RemoteObject.createImmutable(0);Debug.locals.put("PnlHeight", _pnlheight);
_newtop = RemoteObject.createImmutable(0);Debug.locals.put("NewTop", _newtop);
 BA.debugLineNum = 295;BA.debugLine="PnlHeight = pnlToMove.Height";
Debug.ShouldStop(64);
_pnlheight = _pnltomove.runMethod(true,"getHeight");Debug.locals.put("PnlHeight", _pnlheight);
 BA.debugLineNum = 296;BA.debugLine="NewTop = pnlToMove.Top";
Debug.ShouldStop(128);
_newtop = _pnltomove.runMethod(true,"getTop");Debug.locals.put("NewTop", _newtop);
 BA.debugLineNum = 297;BA.debugLine="Dim MoveFollowingPanels As Boolean";
Debug.ShouldStop(256);
_movefollowingpanels = RemoteObject.createImmutable(false);Debug.locals.put("MoveFollowingPanels", _movefollowingpanels);
 BA.debugLineNum = 298;BA.debugLine="MoveFollowingPanels = False";
Debug.ShouldStop(512);
_movefollowingpanels = clschecklist.__c.getField(true,"False");Debug.locals.put("MoveFollowingPanels", _movefollowingpanels);
 BA.debugLineNum = 299;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 300;BA.debugLine="For i = 0 To NumberOfItems - 1";
Debug.ShouldStop(2048);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13); _i = ((int)(0 + _i + step13)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 301;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(4096);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 302;BA.debugLine="If i = StartPosition Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _startposition))) { 
 BA.debugLineNum = 303;BA.debugLine="MoveFollowingPanels = (EndPosition > StartPosi";
Debug.ShouldStop(16384);
_movefollowingpanels = BA.ObjectToBoolean((RemoteObject.solveBoolean(">",_endposition,BA.numberCast(double.class, _startposition))));Debug.locals.put("MoveFollowingPanels", _movefollowingpanels);
 BA.debugLineNum = 304;BA.debugLine="If Not(MoveFollowingPanels) Then Exit 'Move do";
Debug.ShouldStop(32768);
if (clschecklist.__c.runMethod(true,"Not",(Object)(_movefollowingpanels)).<Boolean>get().booleanValue()) { 
if (true) break;};
 BA.debugLineNum = 305;BA.debugLine="PnlHeight = -PnlHeight 'Panels are moved upwar";
Debug.ShouldStop(65536);
_pnlheight = BA.numberCast(int.class, -(double) (0 + _pnlheight.<Integer>get().intValue()));Debug.locals.put("PnlHeight", _pnlheight);
 }else 
{ BA.debugLineNum = 306;BA.debugLine="Else If i = EndPosition Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, _endposition))) { 
 BA.debugLineNum = 307;BA.debugLine="MoveFollowingPanels = (EndPosition < StartPosi";
Debug.ShouldStop(262144);
_movefollowingpanels = BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_endposition,BA.numberCast(double.class, _startposition))));Debug.locals.put("MoveFollowingPanels", _movefollowingpanels);
 BA.debugLineNum = 308;BA.debugLine="If Not(MoveFollowingPanels) Then Exit 'Move do";
Debug.ShouldStop(524288);
if (clschecklist.__c.runMethod(true,"Not",(Object)(_movefollowingpanels)).<Boolean>get().booleanValue()) { 
if (true) break;};
 BA.debugLineNum = 309;BA.debugLine="NewTop = pnl.Top";
Debug.ShouldStop(1048576);
_newtop = _pnl.runMethod(true,"getTop");Debug.locals.put("NewTop", _newtop);
 BA.debugLineNum = 310;BA.debugLine="pnl.Top = pnl.Top + PnlHeight";
Debug.ShouldStop(2097152);
_pnl.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnlheight}, "+",1, 1));
 }else 
{ BA.debugLineNum = 311;BA.debugLine="Else If MoveFollowingPanels Then";
Debug.ShouldStop(4194304);
if (_movefollowingpanels.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 312;BA.debugLine="If i = EndPosition - 1 Then NewTop = pnl.Top +";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_endposition,RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
_newtop = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight"),_pnlheight}, "++",2, 1);Debug.locals.put("NewTop", _newtop);};
 BA.debugLineNum = 313;BA.debugLine="pnl.Top = pnl.Top + PnlHeight";
Debug.ShouldStop(16777216);
_pnl.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnlheight}, "+",1, 1));
 }}};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 316;BA.debugLine="pnlToMove.Top = NewTop";
Debug.ShouldStop(134217728);
_pnltomove.runMethod(true,"setTop",_newtop);
 BA.debugLineNum = 320;BA.debugLine="Dim CptBtF, CptStB As Int";
Debug.ShouldStop(-2147483648);
_cptbtf = RemoteObject.createImmutable(0);Debug.locals.put("CptBtF", _cptbtf);
_cptstb = RemoteObject.createImmutable(0);Debug.locals.put("CptStB", _cptstb);
 BA.debugLineNum = 321;BA.debugLine="CptBtF = sv.Panel.NumberOfViews - EndPosition -";
Debug.ShouldStop(1);
_cptbtf = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),_endposition,RemoteObject.createImmutable(1)}, "--",2, 1);Debug.locals.put("CptBtF", _cptbtf);
 BA.debugLineNum = 322;BA.debugLine="CptStB = EndPosition - 1";
Debug.ShouldStop(2);
_cptstb = RemoteObject.solve(new RemoteObject[] {_endposition,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("CptStB", _cptstb);
 BA.debugLineNum = 323;BA.debugLine="If Abs(CptBtF) < Abs(CptStB) Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",clschecklist.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _cptbtf))),clschecklist.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _cptstb))))) { 
 BA.debugLineNum = 324;BA.debugLine="If StartPosition < EndPosition Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_startposition,BA.numberCast(double.class, _endposition))) { 
 BA.debugLineNum = 325;BA.debugLine="CptBtF = CptBtF + 1";
Debug.ShouldStop(16);
_cptbtf = RemoteObject.solve(new RemoteObject[] {_cptbtf,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CptBtF", _cptbtf);
 BA.debugLineNum = 326;BA.debugLine="EndPosition = EndPosition - 1";
Debug.ShouldStop(32);
_endposition = RemoteObject.solve(new RemoteObject[] {_endposition,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("EndPosition", _endposition);
 };
 BA.debugLineNum = 328;BA.debugLine="pnlToMove.BringToFront";
Debug.ShouldStop(128);
_pnltomove.runVoidMethod ("BringToFront");
 BA.debugLineNum = 329;BA.debugLine="For i = 1 To CptBtF";
Debug.ShouldStop(256);
{
final int step39 = 1;
final int limit39 = _cptbtf.<Integer>get().intValue();
for (_i = 1 ; (step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39); _i = ((int)(0 + _i + step39)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 330;BA.debugLine="pnl = sv.Panel.GetView(EndPosition)";
Debug.ShouldStop(512);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_endposition)).getObject());
 BA.debugLineNum = 331;BA.debugLine="pnl.BringToFront";
Debug.ShouldStop(1024);
_pnl.runVoidMethod ("BringToFront");
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 334;BA.debugLine="If StartPosition > EndPosition Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_startposition,BA.numberCast(double.class, _endposition))) { 
 BA.debugLineNum = 335;BA.debugLine="CptStB = CptStB + 1";
Debug.ShouldStop(16384);
_cptstb = RemoteObject.solve(new RemoteObject[] {_cptstb,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CptStB", _cptstb);
 BA.debugLineNum = 336;BA.debugLine="EndPosition = EndPosition + 1";
Debug.ShouldStop(32768);
_endposition = RemoteObject.solve(new RemoteObject[] {_endposition,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("EndPosition", _endposition);
 };
 BA.debugLineNum = 338;BA.debugLine="pnlToMove.SendToBack";
Debug.ShouldStop(131072);
_pnltomove.runVoidMethod ("SendToBack");
 BA.debugLineNum = 339;BA.debugLine="For i = 1 To CptStB";
Debug.ShouldStop(262144);
{
final int step49 = 1;
final int limit49 = _cptstb.<Integer>get().intValue();
for (_i = 1 ; (step49 > 0 && _i <= limit49) || (step49 < 0 && _i >= limit49); _i = ((int)(0 + _i + step49)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 340;BA.debugLine="pnl = sv.Panel.GetView(EndPosition - 1)";
Debug.ShouldStop(524288);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_endposition,RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());
 BA.debugLineNum = 341;BA.debugLine="pnl.SendToBack";
Debug.ShouldStop(1048576);
_pnl.runVoidMethod ("SendToBack");
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 345;BA.debugLine="End Sub";
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
public static RemoteObject  _movetodropposition(RemoteObject __ref,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("MoveToDropPosition (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1073);
if (RapidSub.canDelegate("movetodropposition")) return __ref.runUserSub(false, "clschecklist","movetodropposition", __ref, _y);
RemoteObject _startposition = RemoteObject.createImmutable(0);
RemoteObject _endposition = RemoteObject.createImmutable(0);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("Y", _y);
 BA.debugLineNum = 1073;BA.debugLine="Private Sub MoveToDropPosition(Y As Int)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1075;BA.debugLine="DragAndDrop.Top = Min(Max(0, DragAndDrop.Top + Y";
Debug.ShouldStop(262144);
__ref.getField(false,"_draganddrop").runMethod(true,"setTop",BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Min",(Object)(clschecklist.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_draganddrop").runMethod(true,"getTop"),_y,__ref.getField(true,"_lasty")}, "+-",2, 1))))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getHeight"),__ref.getField(false,"_draganddrop").runMethod(true,"getHeight")}, "-",1, 1))))));
 BA.debugLineNum = 1078;BA.debugLine="Dim StartPosition, EndPosition As Int";
Debug.ShouldStop(2097152);
_startposition = RemoteObject.createImmutable(0);Debug.locals.put("StartPosition", _startposition);
_endposition = RemoteObject.createImmutable(0);Debug.locals.put("EndPosition", _endposition);
 BA.debugLineNum = 1079;BA.debugLine="StartPosition = -1";
Debug.ShouldStop(4194304);
_startposition = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("StartPosition", _startposition);
 BA.debugLineNum = 1080;BA.debugLine="EndPosition = -1";
Debug.ShouldStop(8388608);
_endposition = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("EndPosition", _endposition);
 BA.debugLineNum = 1081;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(16777216);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1082;BA.debugLine="For i = 0 To NumberOfItems - 1";
Debug.ShouldStop(33554432);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1083;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(67108864);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 1084;BA.debugLine="If pnl.Top = OriginDDTop Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(true,"getTop"),BA.numberCast(double.class, __ref.getField(true,"_originddtop")))) { 
 BA.debugLineNum = 1085;BA.debugLine="StartPosition = i";
Debug.ShouldStop(268435456);
_startposition = BA.numberCast(int.class, _i);Debug.locals.put("StartPosition", _startposition);
 BA.debugLineNum = 1086;BA.debugLine="If EndPosition <> -1 Then Exit";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",_endposition,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) break;};
 };
 BA.debugLineNum = 1088;BA.debugLine="If DragAndDrop.Top >= pnl.Top AND DragAndDrop.To";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("g",__ref.getField(false,"_draganddrop").runMethod(true,"getTop"),BA.numberCast(double.class, _pnl.runMethod(true,"getTop"))) && RemoteObject.solveBoolean("<",__ref.getField(false,"_draganddrop").runMethod(true,"getTop"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight")}, "+",1, 1)))) { 
 BA.debugLineNum = 1089;BA.debugLine="EndPosition = i";
Debug.ShouldStop(1);
_endposition = BA.numberCast(int.class, _i);Debug.locals.put("EndPosition", _endposition);
 BA.debugLineNum = 1090;BA.debugLine="If StartPosition <> -1 Then Exit";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_startposition,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) break;};
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1095;BA.debugLine="MoveItem(StartPosition, EndPosition)";
Debug.ShouldStop(64);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_moveitem",(Object)(_startposition),(Object)(_endposition));
 BA.debugLineNum = 1096;BA.debugLine="If EndPosition > StartPosition Then EndPosition =";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_endposition,BA.numberCast(double.class, _startposition))) { 
_endposition = RemoteObject.solve(new RemoteObject[] {_endposition,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("EndPosition", _endposition);};
 BA.debugLineNum = 1097;BA.debugLine="If SubExists(CallbackMod, sub_AfterDrop) Then Cal";
Debug.ShouldStop(256);
if (clschecklist.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_afterdrop"))).<Boolean>get().booleanValue()) { 
clschecklist.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_afterdrop")),(Object)((_startposition)),(Object)((_endposition)));};
 BA.debugLineNum = 1100;BA.debugLine="AbortDragAndDrop";
Debug.ShouldStop(2048);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_abortdraganddrop");
 BA.debugLineNum = 1101;BA.debugLine="End Sub";
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
public static RemoteObject  _movetopafterfiltering(RemoteObject __ref,RemoteObject _firstpos) throws Exception{
try {
		Debug.PushSubsStack("MoveTopAfterFiltering (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1171);
if (RapidSub.canDelegate("movetopafterfiltering")) return __ref.runUserSub(false, "clschecklist","movetopafterfiltering", __ref, _firstpos);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _newtop = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("FirstPos", _firstpos);
 BA.debugLineNum = 1171;BA.debugLine="Private Sub MoveTopAfterFiltering(FirstPos As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1173;BA.debugLine="Dim pnl As Panel, NewTop As Int";
Debug.ShouldStop(1048576);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
_newtop = RemoteObject.createImmutable(0);Debug.locals.put("NewTop", _newtop);
 BA.debugLineNum = 1174;BA.debugLine="pnl = sv.Panel.GetView(FirstPos)";
Debug.ShouldStop(2097152);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_firstpos)).getObject());
 BA.debugLineNum = 1175;BA.debugLine="If pnl.Visible Then";
Debug.ShouldStop(4194304);
if (_pnl.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1176;BA.debugLine="NewTop = pnl.Top + pnl.Height";
Debug.ShouldStop(8388608);
_newtop = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("NewTop", _newtop);
 }else {
 BA.debugLineNum = 1178;BA.debugLine="NewTop = pnl.Top";
Debug.ShouldStop(33554432);
_newtop = _pnl.runMethod(true,"getTop");Debug.locals.put("NewTop", _newtop);
 };
 BA.debugLineNum = 1180;BA.debugLine="For i = FirstPos + 1 To NumberOfItems - 1";
Debug.ShouldStop(134217728);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {_firstpos,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ; (step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8); _i = ((int)(0 + _i + step8)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1181;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(268435456);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 1182;BA.debugLine="If pnl.Visible Then";
Debug.ShouldStop(536870912);
if (_pnl.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1183;BA.debugLine="pnl.Top = NewTop";
Debug.ShouldStop(1073741824);
_pnl.runMethod(true,"setTop",_newtop);
 BA.debugLineNum = 1184;BA.debugLine="NewTop = pnl.Top + pnl.Height";
Debug.ShouldStop(-2147483648);
_newtop = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("NewTop", _newtop);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1187;BA.debugLine="svHeight = NewTop";
Debug.ShouldStop(4);
__ref.setField ("_svheight",_newtop);
 BA.debugLineNum = 1188;BA.debugLine="sv.Panel.Height = svHeight";
Debug.ShouldStop(8);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(true,"_svheight"));
 BA.debugLineNum = 1189;BA.debugLine="End Sub";
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
public static RemoteObject  _numberofitems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NumberOfItems (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,670);
if (RapidSub.canDelegate("numberofitems")) return __ref.runUserSub(false, "clschecklist","numberofitems", __ref);
 BA.debugLineNum = 670;BA.debugLine="Public Sub NumberOfItems As Int";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 671;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 672;BA.debugLine="Return sv.Panel.NumberOfViews";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews");
 }else {
 BA.debugLineNum = 674;BA.debugLine="Return 0";
Debug.ShouldStop(2);
if (true) return BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 676;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _paintbackground(RemoteObject __ref,RemoteObject _pnl,RemoteObject _extended) throws Exception{
try {
		Debug.PushSubsStack("PaintBackground (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,898);
if (RapidSub.canDelegate("paintbackground")) return __ref.runUserSub(false, "clschecklist","paintbackground", __ref, _pnl, _extended);
RemoteObject _state = RemoteObject.createImmutable(0);
int _p = 0;
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Extended", _extended);
 BA.debugLineNum = 898;BA.debugLine="Private Sub PaintBackground(pnl As Panel, Extended";
Debug.ShouldStop(2);
 BA.debugLineNum = 899;BA.debugLine="Dim State As Int";
Debug.ShouldStop(4);
_state = RemoteObject.createImmutable(0);Debug.locals.put("State", _state);
 BA.debugLineNum = 900;BA.debugLine="If Extended Then";
Debug.ShouldStop(8);
if (_extended.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 901;BA.debugLine="State = PAINT_EXTENDED";
Debug.ShouldStop(16);
_state = __ref.getField(true,"_paint_extended");Debug.locals.put("State", _state);
 }else {
 BA.debugLineNum = 903;BA.debugLine="State = PAINT_DEFAULT";
Debug.ShouldStop(64);
_state = __ref.getField(true,"_paint_default");Debug.locals.put("State", _state);
 };
 BA.debugLineNum = 905;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
Debug.ShouldStop(256);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_p = 0 ; (step7 > 0 && _p <= limit7) || (step7 < 0 && _p >= limit7); _p = ((int)(0 + _p + step7)) ) {
Debug.locals.put("p", _p);
 BA.debugLineNum = 906;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
Debug.ShouldStop(512);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_ischeckbox",(Object)(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 907;BA.debugLine="Dim chk As CheckBox";
Debug.ShouldStop(1024);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chk", _chk);
 BA.debugLineNum = 908;BA.debugLine="chk = pnl.GetView(p)";
Debug.ShouldStop(2048);
_chk.setObject(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))).getObject());
 BA.debugLineNum = 909;BA.debugLine="If chk.Checked Then State = State + PAINT_CHECK";
Debug.ShouldStop(4096);
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
_state = RemoteObject.solve(new RemoteObject[] {_state,__ref.getField(true,"_paint_checked")}, "+",1, 1);Debug.locals.put("State", _state);};
 BA.debugLineNum = 910;BA.debugLine="Exit";
Debug.ShouldStop(8192);
if (true) break;
 };
 }
}Debug.locals.put("p", _p);
;
 BA.debugLineNum = 913;BA.debugLine="If SubExists(CallbackMod, sub_Paint) Then";
Debug.ShouldStop(65536);
if (clschecklist.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_paint"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 914;BA.debugLine="CallSub3(CallbackMod, sub_Paint, pnl, State)";
Debug.ShouldStop(131072);
clschecklist.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_paint")),(Object)((_pnl)),(Object)((_state)));
 }else {
 BA.debugLineNum = 916;BA.debugLine="Select State";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_state,__ref.getField(true,"_paint_extended"),__ref.getField(true,"_paint_checked"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_paint_checked"),__ref.getField(true,"_paint_extended")}, "+",1, 1))) {
case 0: {
 BA.debugLineNum = 918;BA.debugLine="pnl.Color = ExtensionColor";
Debug.ShouldStop(2097152);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_extensioncolor"));
 break; }
case 1: {
 BA.debugLineNum = 920;BA.debugLine="pnl.Color = CheckedColor";
Debug.ShouldStop(8388608);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_checkedcolor"));
 break; }
case 2: {
 BA.debugLineNum = 922;BA.debugLine="If CheckedColor = Colors.Transparent Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_checkedcolor"),BA.numberCast(double.class, clschecklist.__c.getField(false,"Colors").getField(true,"Transparent")))) { 
 BA.debugLineNum = 923;BA.debugLine="pnl.Color = ExtensionColor";
Debug.ShouldStop(67108864);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_extensioncolor"));
 }else {
 BA.debugLineNum = 925;BA.debugLine="pnl.Color = CheckedColor";
Debug.ShouldStop(268435456);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_checkedcolor"));
 };
 break; }
default: {
 BA.debugLineNum = 928;BA.debugLine="pnl.Color = BackgroundColor";
Debug.ShouldStop(-2147483648);
_pnl.runVoidMethod ("setColor",__ref.getField(true,"_backgroundcolor"));
 break; }
}
;
 };
 BA.debugLineNum = 931;BA.debugLine="End Sub";
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
public static RemoteObject  _pnlsv_click(RemoteObject __ref,RemoteObject _viewtag) throws Exception{
try {
		Debug.PushSubsStack("pnlSV_Click (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1144);
if (RapidSub.canDelegate("pnlsv_click")) return __ref.runUserSub(false, "clschecklist","pnlsv_click", __ref, _viewtag);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("ViewTag", _viewtag);
 BA.debugLineNum = 1144;BA.debugLine="Private Sub pnlSV_Click(ViewTag As Object) As Bool";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1145;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(16777216);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1146;BA.debugLine="pnl = Sender";
Debug.ShouldStop(33554432);
_pnl.setObject(clschecklist.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 1147;BA.debugLine="If SubExists(CallbackMod, sub_Click) Then CallSub";
Debug.ShouldStop(67108864);
if (clschecklist.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_click"))).<Boolean>get().booleanValue()) { 
clschecklist.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_click")),(Object)((_pnl)),(Object)(_pnl.runMethod(false,"getTag")));};
 BA.debugLineNum = 1148;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return clschecklist.__c.getField(true,"True");
 BA.debugLineNum = 1149;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlsv_longclick(RemoteObject __ref,RemoteObject _viewtag) throws Exception{
try {
		Debug.PushSubsStack("pnlSV_LongClick (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1151);
if (RapidSub.canDelegate("pnlsv_longclick")) return __ref.runUserSub(false, "clschecklist","pnlsv_longclick", __ref, _viewtag);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("ViewTag", _viewtag);
 BA.debugLineNum = 1151;BA.debugLine="Private Sub pnlSV_LongClick(ViewTag As Object) As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1152;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(-2147483648);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1153;BA.debugLine="pnl = Sender";
Debug.ShouldStop(1);
_pnl.setObject(clschecklist.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 1154;BA.debugLine="If SubExists(CallbackMod, sub_LongClick) Then Cal";
Debug.ShouldStop(2);
if (clschecklist.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_longclick"))).<Boolean>get().booleanValue()) { 
clschecklist.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_longclick")),(Object)((_pnl)),(Object)(_pnl.runMethod(false,"getTag")));};
 BA.debugLineNum = 1155;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return clschecklist.__c.getField(true,"True");
 BA.debugLineNum = 1156;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pnlsv_touch(RemoteObject __ref,RemoteObject _viewtag,RemoteObject _action,RemoteObject _x,RemoteObject _y,RemoteObject _motionevent) throws Exception{
try {
		Debug.PushSubsStack("pnlSV_Touch (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1105);
if (RapidSub.canDelegate("pnlsv_touch")) return __ref.runUserSub(false, "clschecklist","pnlsv_touch", __ref, _viewtag, _action, _x, _y, _motionevent);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _p = 0;
RemoteObject _chb = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("ViewTag", _viewtag);
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("MotionEvent", _motionevent);
 BA.debugLineNum = 1105;BA.debugLine="Private Sub pnlSV_Touch(ViewTag As Object, Action";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1106;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(131072);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 1107;BA.debugLine="pnl = Sender";
Debug.ShouldStop(262144);
_pnl.setObject(clschecklist.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));
 BA.debugLineNum = 1108;BA.debugLine="If Action <> 2 Then		' <> ACTION_MOVE";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("!",_action,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1109;BA.debugLine="If PressedPanel.IsInitialized Then";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_pressedpanel").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1110;BA.debugLine="PressedPanel.Background = OldBackground";
Debug.ShouldStop(2097152);
__ref.getField(false,"_pressedpanel").runMethod(false,"setBackground",(__ref.getField(false,"_oldbackground")));
 BA.debugLineNum = 1111;BA.debugLine="PressedPanel = Null";
Debug.ShouldStop(4194304);
__ref.getField(false,"_pressedpanel").setObject (clschecklist.__c.getField(false,"Null"));
 };
 };
 BA.debugLineNum = 1114;BA.debugLine="If Action = 0 Then		' = ACTION_DOWN";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1115;BA.debugLine="OldBackground = pnl.Background";
Debug.ShouldStop(67108864);
__ref.setField ("_oldbackground",(_pnl.runMethod(false,"getBackground")));
 BA.debugLineNum = 1116;BA.debugLine="PressedPanel = pnl";
Debug.ShouldStop(134217728);
__ref.setField ("_pressedpanel",_pnl);
 BA.debugLineNum = 1117;BA.debugLine="If SubExists(CallbackMod, sub_Paint) Then";
Debug.ShouldStop(268435456);
if (clschecklist.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_paint"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1118;BA.debugLine="CallSub3(CallbackMod, sub_Paint, pnl, PAINT_PRE";
Debug.ShouldStop(536870912);
clschecklist.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callbackmod")),(Object)(__ref.getField(true,"_sub_paint")),(Object)((_pnl)),(Object)((__ref.getField(true,"_paint_pressed"))));
 }else {
 BA.debugLineNum = 1120;BA.debugLine="PressedPanel.Background = PressedDrawable";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_pressedpanel").runMethod(false,"setBackground",(__ref.getField(false,"_presseddrawable")));
 };
 }else 
{ BA.debugLineNum = 1122;BA.debugLine="Else If Action = 1 Then	' = ACTION_UP";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1123;BA.debugLine="If DragAndDrop.IsInitialized Then";
Debug.ShouldStop(4);
if (__ref.getField(false,"_draganddrop").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1125;BA.debugLine="MoveToDropPosition(Y)";
Debug.ShouldStop(16);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_movetodropposition",(Object)(BA.numberCast(int.class, _y)));
 }else 
{ BA.debugLineNum = 1126;BA.debugLine="Else If ModeCheck Then";
Debug.ShouldStop(32);
if (__ref.getField(true,"_modecheck").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1128;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
Debug.ShouldStop(128);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_p = 0 ; (step21 > 0 && _p <= limit21) || (step21 < 0 && _p >= limit21); _p = ((int)(0 + _p + step21)) ) {
Debug.locals.put("p", _p);
 BA.debugLineNum = 1129;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
Debug.ShouldStop(256);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_ischeckbox",(Object)(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1130;BA.debugLine="Dim chb As CheckBox";
Debug.ShouldStop(512);
_chb = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("chb", _chb);
 BA.debugLineNum = 1131;BA.debugLine="chb = pnl.GetView(p)";
Debug.ShouldStop(1024);
_chb.setObject(_pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _p))).getObject());
 BA.debugLineNum = 1132;BA.debugLine="chb.Checked = Not(chb.Checked)";
Debug.ShouldStop(2048);
_chb.runMethodAndSync(true,"setChecked",clschecklist.__c.runMethod(true,"Not",(Object)(_chb.runMethod(true,"getChecked"))));
 BA.debugLineNum = 1133;BA.debugLine="Exit";
Debug.ShouldStop(4096);
if (true) break;
 };
 }
}Debug.locals.put("p", _p);
;
 }};
 }else 
{ BA.debugLineNum = 1137;BA.debugLine="Else If Action = 2 Then '= ACTION_MOVE";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1138;BA.debugLine="If DragAndDrop.IsInitialized Then MoveDDPanel(Y)";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_draganddrop").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_moveddpanel",(Object)(BA.numberCast(int.class, _y)));};
 }}};
 BA.debugLineNum = 1140;BA.debugLine="LastY = Y";
Debug.ShouldStop(524288);
__ref.setField ("_lasty",BA.numberCast(int.class, _y));
 BA.debugLineNum = 1141;BA.debugLine="Return (sub_Click = \"\" AND sub_LongClick = \"\")";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_sub_click"),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_sub_longclick"),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1142;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeitemat(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("RemoveItemAt (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("removeitemat")) return __ref.runUserSub(false, "clschecklist","removeitemat", __ref, _position);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _removedheight = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("Position", _position);
 BA.debugLineNum = 425;BA.debugLine="Public Sub RemoveItemAt(Position As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 426;BA.debugLine="If sv.IsInitialized And Position < NumberOfItems";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_sv").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("<",_position,BA.numberCast(double.class, __ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems")))) { 
 BA.debugLineNum = 427;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 428;BA.debugLine="pnl = sv.Panel.GetView(Position)";
Debug.ShouldStop(2048);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_position)).getObject());
 BA.debugLineNum = 429;BA.debugLine="If HasExtraContent And ExtendedItemID = pnl.Tag";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent")) && RemoteObject.solveBoolean("=",__ref.runClassMethod (com.bcleaner.clschecklist.class, "_extendeditemid"),_pnl.runMethod(false,"getTag"))) { 
 BA.debugLineNum = 430;BA.debugLine="ExtensionIndex = -1";
Debug.ShouldStop(8192);
__ref.setField ("_extensionindex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 431;BA.debugLine="ExtensionView.RemoveView";
Debug.ShouldStop(16384);
__ref.getField(false,"_extensionview").runVoidMethod ("RemoveView");
 BA.debugLineNum = 432;BA.debugLine="ExtensionView = Null";
Debug.ShouldStop(32768);
__ref.getField(false,"_extensionview").setObject (clschecklist.__c.getField(false,"Null"));
 };
 BA.debugLineNum = 434;BA.debugLine="Dim RemovedHeight As Int";
Debug.ShouldStop(131072);
_removedheight = RemoteObject.createImmutable(0);Debug.locals.put("RemovedHeight", _removedheight);
 BA.debugLineNum = 435;BA.debugLine="RemovedHeight = pnl.Height";
Debug.ShouldStop(262144);
_removedheight = _pnl.runMethod(true,"getHeight");Debug.locals.put("RemovedHeight", _removedheight);
 BA.debugLineNum = 436;BA.debugLine="pnl.RemoveView";
Debug.ShouldStop(524288);
_pnl.runVoidMethod ("RemoveView");
 BA.debugLineNum = 437;BA.debugLine="For i = Position To sv.Panel.NumberOfViews - 1";
Debug.ShouldStop(1048576);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = _position.<Integer>get().intValue() ; (step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12); _i = ((int)(0 + _i + step12)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 438;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(2097152);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 439;BA.debugLine="pnl.Top = pnl.Top - RemovedHeight";
Debug.ShouldStop(4194304);
_pnl.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_removedheight}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 441;BA.debugLine="svHeight = svHeight - RemovedHeight";
Debug.ShouldStop(16777216);
__ref.setField ("_svheight",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_svheight"),_removedheight}, "-",1, 1));
 BA.debugLineNum = 442;BA.debugLine="sv.Panel.Height = svHeight";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(true,"_svheight"));
 };
 BA.debugLineNum = 444;BA.debugLine="End Sub";
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
public static RemoteObject  _removeitemid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("RemoveItemID (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,447);
if (RapidSub.canDelegate("removeitemid")) return __ref.runUserSub(false, "clschecklist","removeitemid", __ref, _id);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
Debug.locals.put("ID", _id);
 BA.debugLineNum = 447;BA.debugLine="Public Sub RemoveItemID(ID As Object)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 448;BA.debugLine="If sv.IsInitialized Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(false,"_sv").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 449;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 450;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
Debug.ShouldStop(2);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 451;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(4);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 452;BA.debugLine="If pnl.Tag = Null Then Continue";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("n",_pnl.runMethod(false,"getTag"))) { 
if (true) continue;};
 BA.debugLineNum = 453;BA.debugLine="If pnl.Tag = ID Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_pnl.runMethod(false,"getTag"),_id)) { 
 BA.debugLineNum = 454;BA.debugLine="RemoveItemAt(i)";
Debug.ShouldStop(32);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_removeitemat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 455;BA.debugLine="Exit";
Debug.ShouldStop(64);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _repaint(RemoteObject __ref,RemoteObject _pnlitem) throws Exception{
try {
		Debug.PushSubsStack("Repaint (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,863);
if (RapidSub.canDelegate("repaint")) return __ref.runUserSub(false, "clschecklist","repaint", __ref, _pnlitem);
RemoteObject _extended = RemoteObject.createImmutable(false);
RemoteObject _pnldivider = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("pnlItem", _pnlitem);
 BA.debugLineNum = 863;BA.debugLine="Public Sub Repaint(pnlItem As Panel)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 864;BA.debugLine="Dim Extended As Boolean";
Debug.ShouldStop(-2147483648);
_extended = RemoteObject.createImmutable(false);Debug.locals.put("Extended", _extended);
 BA.debugLineNum = 865;BA.debugLine="Extended = HasExtraContent AND ExtendedItemID = p";
Debug.ShouldStop(1);
_extended = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent")) && RemoteObject.solveBoolean("=",__ref.runClassMethod (com.bcleaner.clschecklist.class, "_extendeditemid"),_pnlitem.runMethod(false,"getTag")));Debug.locals.put("Extended", _extended);
 BA.debugLineNum = 866;BA.debugLine="PaintBackground(pnlItem, Extended)";
Debug.ShouldStop(2);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_paintbackground",(Object)(_pnlitem),(Object)(_extended));
 BA.debugLineNum = 867;BA.debugLine="If DividerSize > 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_dividersize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 868;BA.debugLine="Dim pnlDivider As Panel";
Debug.ShouldStop(8);
_pnldivider = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnlDivider", _pnldivider);
 BA.debugLineNum = 869;BA.debugLine="If Extended Then";
Debug.ShouldStop(16);
if (_extended.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 870;BA.debugLine="pnlDivider = pnlItem.GetView(pnlItem.NumberOfVi";
Debug.ShouldStop(32);
_pnldivider.setObject(_pnlitem.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_pnlitem.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(2)}, "-",1, 1))).getObject());
 }else {
 BA.debugLineNum = 872;BA.debugLine="pnlDivider = pnlItem.GetView(pnlItem.NumberOfVi";
Debug.ShouldStop(128);
_pnldivider.setObject(_pnlitem.runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_pnlitem.runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());
 };
 BA.debugLineNum = 874;BA.debugLine="pnlDivider.Color = DividerColor";
Debug.ShouldStop(512);
_pnldivider.runVoidMethod ("setColor",__ref.getField(true,"_dividercolor"));
 };
 BA.debugLineNum = 876;BA.debugLine="End Sub";
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
public static RemoteObject  _repaintallitems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RepaintAllItems (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,879);
if (RapidSub.canDelegate("repaintallitems")) return __ref.runUserSub(false, "clschecklist","repaintallitems", __ref);
int _i = 0;
 BA.debugLineNum = 879;BA.debugLine="Public Sub RepaintAllItems";
Debug.ShouldStop(16384);
 BA.debugLineNum = 880;BA.debugLine="For i = 0 To NumberOfItems - 1";
Debug.ShouldStop(32768);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 881;BA.debugLine="Repaint(sv.Panel.GetView(i))";
Debug.ShouldStop(65536);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_repaint",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject()));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 883;BA.debugLine="End Sub";
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
public static RemoteObject  _replaceitem(RemoteObject __ref,RemoteObject _position,RemoteObject _newpanel,RemoteObject _newheight) throws Exception{
try {
		Debug.PushSubsStack("ReplaceItem (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("replaceitem")) return __ref.runUserSub(false, "clschecklist","replaceitem", __ref, _position, _newpanel, _newheight);
RemoteObject _oldpnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Position", _position);
Debug.locals.put("NewPanel", _newpanel);
Debug.locals.put("NewHeight", _newheight);
 BA.debugLineNum = 408;BA.debugLine="Public Sub ReplaceItem(Position As Int, NewPanel A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 410;BA.debugLine="If sv.IsInitialized And NewPanel.IsInitialized Th";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_sv").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",_newpanel.runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 411;BA.debugLine="If HasExtraContent Then CollapseItem";
Debug.ShouldStop(67108864);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_collapseitem");};
 BA.debugLineNum = 412;BA.debugLine="Dim OldPnl As Panel";
Debug.ShouldStop(134217728);
_oldpnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("OldPnl", _oldpnl);
 BA.debugLineNum = 413;BA.debugLine="OldPnl = sv.Panel.GetView(Position)";
Debug.ShouldStop(268435456);
_oldpnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_position)).getObject());
 BA.debugLineNum = 414;BA.debugLine="NewPanel.Tag = OldPnl.Tag";
Debug.ShouldStop(536870912);
_newpanel.runMethod(false,"setTag",_oldpnl.runMethod(false,"getTag"));
 BA.debugLineNum = 415;BA.debugLine="If NewHeight = -1 Then NewHeight = OldPnl.Height";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_newheight,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_newheight = _oldpnl.runMethod(true,"getHeight");Debug.locals.put("NewHeight", _newheight);};
 BA.debugLineNum = 416;BA.debugLine="AddToSV(NewPanel, NewHeight, NewPanel.Tag <> Nul";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_addtosv",(Object)(_newpanel),(Object)(_newheight),(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("N",_newpanel.runMethod(false,"getTag")))));
 BA.debugLineNum = 417;BA.debugLine="RemoveItemAt(Position)";
Debug.ShouldStop(1);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_removeitemat",(Object)(_position));
 BA.debugLineNum = 418;BA.debugLine="MoveItem(NumberOfItems - 1, Position)";
Debug.ShouldStop(2);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_moveitem",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_position));
 };
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizepanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResizePanel (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("resizepanel")) return __ref.runUserSub(false, "clschecklist","resizepanel", __ref);
 BA.debugLineNum = 278;BA.debugLine="Public Sub ResizePanel()";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="CollapseItem";
Debug.ShouldStop(4194304);
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_collapseitem");
 BA.debugLineNum = 280;BA.debugLine="sv.Panel.Height = svHeight";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(true,"setHeight",__ref.getField(true,"_svheight"));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
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
public static RemoteObject  _setonpaintlistener(RemoteObject __ref,RemoteObject _subname) throws Exception{
try {
		Debug.PushSubsStack("SetOnPaintListener (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,894);
if (RapidSub.canDelegate("setonpaintlistener")) return __ref.runUserSub(false, "clschecklist","setonpaintlistener", __ref, _subname);
Debug.locals.put("SubName", _subname);
 BA.debugLineNum = 894;BA.debugLine="Public Sub SetOnPaintListener(SubName As String)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 895;BA.debugLine="sub_Paint = SubName";
Debug.ShouldStop(1073741824);
__ref.setField ("_sub_paint",_subname);
 BA.debugLineNum = 896;BA.debugLine="End Sub";
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
public static RemoteObject  _sortitems(RemoteObject __ref,RemoteObject _valuestosort,RemoteObject _firstposition,RemoteObject _lastposition,RemoteObject _ascendingorder) throws Exception{
try {
		Debug.PushSubsStack("SortItems (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,566);
if (RapidSub.canDelegate("sortitems")) return __ref.runUserSub(false, "clschecklist","sortitems", __ref, _valuestosort, _firstposition, _lastposition, _ascendingorder);
RemoteObject _sortlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _sortdata = RemoteObject.declareNull("com.bcleaner.clschecklist._typsortdata");
RemoteObject _firsttosort = RemoteObject.createImmutable(0);
RemoteObject _lasttosort = RemoteObject.createImmutable(0);
RemoteObject _panellist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totalheight = RemoteObject.createImmutable(0);
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("ValuesToSort", _valuestosort);
Debug.locals.put("FirstPosition", _firstposition);
Debug.locals.put("LastPosition", _lastposition);
Debug.locals.put("AscendingOrder", _ascendingorder);
 BA.debugLineNum = 566;BA.debugLine="Public Sub SortItems(ValuesToSort As List, FirstPo";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 567;BA.debugLine="If ValuesToSort.Size < 2 Or FirstPosition = LastP";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("<",_valuestosort.runMethod(true,"getSize"),BA.numberCast(double.class, 2)) || RemoteObject.solveBoolean("=",_firstposition,BA.numberCast(double.class, _lastposition))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 568;BA.debugLine="If LastPosition - FirstPosition + 1 <> ValuesToSo";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",RemoteObject.solve(new RemoteObject[] {_lastposition,_firstposition,RemoteObject.createImmutable(1)}, "-+",2, 1),BA.numberCast(double.class, _valuestosort.runMethod(true,"getSize")))) { 
 BA.debugLineNum = 569;BA.debugLine="Log(\"Mismatch: \" & ValuesToSort.Size & \" values";
Debug.ShouldStop(16777216);
clschecklist.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Mismatch: "),_valuestosort.runMethod(true,"getSize"),RemoteObject.createImmutable(" values in ValuesToSort and "),(RemoteObject.solve(new RemoteObject[] {_lastposition,_firstposition,RemoteObject.createImmutable(1)}, "-+",2, 1)),RemoteObject.createImmutable(" positions to sort"))));
 BA.debugLineNum = 570;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 572;BA.debugLine="Dim SortList As List: SortList.Initialize";
Debug.ShouldStop(134217728);
_sortlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("SortList", _sortlist);
 BA.debugLineNum = 572;BA.debugLine="Dim SortList As List: SortList.Initialize";
Debug.ShouldStop(134217728);
_sortlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 573;BA.debugLine="For i = FirstPosition To LastPosition";
Debug.ShouldStop(268435456);
{
final int step8 = 1;
final int limit8 = _lastposition.<Integer>get().intValue();
for (_i = _firstposition.<Integer>get().intValue() ; (step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8); _i = ((int)(0 + _i + step8)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 574;BA.debugLine="Dim SortData As typSortData";
Debug.ShouldStop(536870912);
_sortdata = RemoteObject.createNew ("com.bcleaner.clschecklist._typsortdata");Debug.locals.put("SortData", _sortdata);
 BA.debugLineNum = 575;BA.debugLine="SortData.Initialize";
Debug.ShouldStop(1073741824);
_sortdata.runVoidMethod ("Initialize");
 BA.debugLineNum = 576;BA.debugLine="SortData.Index = i";
Debug.ShouldStop(-2147483648);
_sortdata.setField ("Index",BA.numberCast(int.class, _i));
 BA.debugLineNum = 577;BA.debugLine="SortData.Value = ValuesToSort.Get(i - FirstPosit";
Debug.ShouldStop(1);
_sortdata.setField ("Value",_valuestosort.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_firstposition}, "-",1, 1))));
 BA.debugLineNum = 578;BA.debugLine="SortList.Add(SortData)";
Debug.ShouldStop(2);
_sortlist.runVoidMethod ("Add",(Object)((_sortdata)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 580;BA.debugLine="SortList.SortType(\"Value\", AscendingOrder)";
Debug.ShouldStop(8);
_sortlist.runVoidMethod ("SortType",(Object)(BA.ObjectToString("Value")),(Object)(_ascendingorder));
 BA.debugLineNum = 584;BA.debugLine="Dim FirstToSort, LastToSort As Int";
Debug.ShouldStop(128);
_firsttosort = RemoteObject.createImmutable(0);Debug.locals.put("FirstToSort", _firsttosort);
_lasttosort = RemoteObject.createImmutable(0);Debug.locals.put("LastToSort", _lasttosort);
 BA.debugLineNum = 585;BA.debugLine="FirstToSort = -1";
Debug.ShouldStop(256);
_firsttosort = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("FirstToSort", _firsttosort);
 BA.debugLineNum = 586;BA.debugLine="LastToSort = -1";
Debug.ShouldStop(512);
_lasttosort = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("LastToSort", _lasttosort);
 BA.debugLineNum = 587;BA.debugLine="Dim PanelList As List: PanelList.Initialize";
Debug.ShouldStop(1024);
_panellist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("PanelList", _panellist);
 BA.debugLineNum = 587;BA.debugLine="Dim PanelList As List: PanelList.Initialize";
Debug.ShouldStop(1024);
_panellist.runVoidMethod ("Initialize");
 BA.debugLineNum = 588;BA.debugLine="For i = 0 To FirstPosition - 1";
Debug.ShouldStop(2048);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_firstposition,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21); _i = ((int)(0 + _i + step21)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 589;BA.debugLine="PanelList.Add(sv.Panel.GetView(i))";
Debug.ShouldStop(4096);
_panellist.runVoidMethod ("Add",(Object)((__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 591;BA.debugLine="For i = FirstPosition To LastPosition";
Debug.ShouldStop(16384);
{
final int step24 = 1;
final int limit24 = _lastposition.<Integer>get().intValue();
for (_i = _firstposition.<Integer>get().intValue() ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 592;BA.debugLine="Dim SortData As typSortData";
Debug.ShouldStop(32768);
_sortdata = RemoteObject.createNew ("com.bcleaner.clschecklist._typsortdata");Debug.locals.put("SortData", _sortdata);
 BA.debugLineNum = 593;BA.debugLine="SortData = SortList.Get(i - FirstPosition)";
Debug.ShouldStop(65536);
_sortdata = (_sortlist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),_firstposition}, "-",1, 1))));Debug.locals.put("SortData", _sortdata);
 BA.debugLineNum = 594;BA.debugLine="If SortData.Index <> i Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("!",_sortdata.getField(true,"Index"),BA.numberCast(double.class, _i))) { 
 BA.debugLineNum = 595;BA.debugLine="If FirstToSort = -1 Then FirstToSort = i";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_firsttosort,BA.numberCast(double.class, -(double) (0 + 1)))) { 
_firsttosort = BA.numberCast(int.class, _i);Debug.locals.put("FirstToSort", _firsttosort);};
 BA.debugLineNum = 596;BA.debugLine="LastToSort = i";
Debug.ShouldStop(524288);
_lasttosort = BA.numberCast(int.class, _i);Debug.locals.put("LastToSort", _lasttosort);
 };
 BA.debugLineNum = 598;BA.debugLine="PanelList.Add(sv.Panel.GetView(SortData.Index))";
Debug.ShouldStop(2097152);
_panellist.runVoidMethod ("Add",(Object)((__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_sortdata.getField(true,"Index"))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 600;BA.debugLine="If FirstToSort = -1 Then Return";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_firsttosort,BA.numberCast(double.class, -(double) (0 + 1)))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 601;BA.debugLine="For i = LastPosition + 1 To NumberOfItems - 1";
Debug.ShouldStop(16777216);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {_lastposition,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ; (step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34); _i = ((int)(0 + _i + step34)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 602;BA.debugLine="PanelList.Add(sv.Panel.GetView(i))";
Debug.ShouldStop(33554432);
_panellist.runVoidMethod ("Add",(Object)((__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 606;BA.debugLine="If HasExtraContent Then CollapseItem";
Debug.ShouldStop(536870912);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_collapseitem");};
 BA.debugLineNum = 607;BA.debugLine="Dim TotalHeight As Int";
Debug.ShouldStop(1073741824);
_totalheight = RemoteObject.createImmutable(0);Debug.locals.put("TotalHeight", _totalheight);
 BA.debugLineNum = 608;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(-2147483648);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 609;BA.debugLine="If FirstToSort > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_firsttosort,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 610;BA.debugLine="pnl = sv.Panel.GetView(FirstToSort - 1)";
Debug.ShouldStop(2);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_firsttosort,RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());
 BA.debugLineNum = 611;BA.debugLine="TotalHeight = pnl.Top + pnl.Height";
Debug.ShouldStop(4);
_totalheight = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("TotalHeight", _totalheight);
 };
 BA.debugLineNum = 613;BA.debugLine="For i = FirstToSort To LastToSort";
Debug.ShouldStop(16);
{
final int step44 = 1;
final int limit44 = _lasttosort.<Integer>get().intValue();
for (_i = _firsttosort.<Integer>get().intValue() ; (step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44); _i = ((int)(0 + _i + step44)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 614;BA.debugLine="pnl = PanelList.Get(i)";
Debug.ShouldStop(32);
_pnl.setObject(_panellist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 615;BA.debugLine="pnl.Top = TotalHeight";
Debug.ShouldStop(64);
_pnl.runMethod(true,"setTop",_totalheight);
 BA.debugLineNum = 616;BA.debugLine="TotalHeight = pnl.Top + pnl.Height";
Debug.ShouldStop(128);
_totalheight = RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_pnl.runMethod(true,"getHeight")}, "+",1, 1);Debug.locals.put("TotalHeight", _totalheight);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 620;BA.debugLine="If LastToSort < NumberOfItems - FirstToSort Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_lasttosort,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),_firsttosort}, "-",1, 1)))) { 
 BA.debugLineNum = 622;BA.debugLine="For i = 0 To LastToSort";
Debug.ShouldStop(8192);
{
final int step50 = 1;
final int limit50 = _lasttosort.<Integer>get().intValue();
for (_i = 0 ; (step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50); _i = ((int)(0 + _i + step50)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 623;BA.debugLine="pnl = PanelList.Get(LastToSort - i)";
Debug.ShouldStop(16384);
_pnl.setObject(_panellist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_lasttosort,RemoteObject.createImmutable(_i)}, "-",1, 1))));
 BA.debugLineNum = 624;BA.debugLine="pnl.SendToBack";
Debug.ShouldStop(32768);
_pnl.runVoidMethod ("SendToBack");
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 628;BA.debugLine="For i = FirstToSort To NumberOfItems - 1";
Debug.ShouldStop(524288);
{
final int step55 = 1;
final int limit55 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = _firsttosort.<Integer>get().intValue() ; (step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55); _i = ((int)(0 + _i + step55)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 629;BA.debugLine="pnl = PanelList.Get(i)";
Debug.ShouldStop(1048576);
_pnl.setObject(_panellist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 630;BA.debugLine="pnl.BringToFront";
Debug.ShouldStop(2097152);
_pnl.runVoidMethod ("BringToFront");
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 633;BA.debugLine="End Sub";
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
public static RemoteObject  _startdraganddrop(RemoteObject __ref,RemoteObject _pnl,RemoteObject _subafterdrop) throws Exception{
try {
		Debug.PushSubsStack("StartDragAndDrop (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,1034);
if (RapidSub.canDelegate("startdraganddrop")) return __ref.runUserSub(false, "clschecklist","startdraganddrop", __ref, _pnl, _subafterdrop);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
Debug.locals.put("pnl", _pnl);
Debug.locals.put("subAfterDrop", _subafterdrop);
 BA.debugLineNum = 1034;BA.debugLine="Public Sub StartDragAndDrop(pnl As Panel, subAfter";
Debug.ShouldStop(512);
 BA.debugLineNum = 1035;BA.debugLine="If Not(DragAndDrop.IsInitialized) Then";
Debug.ShouldStop(1024);
if (clschecklist.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_draganddrop").runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1036;BA.debugLine="If HasExtraContent Then CollapseItem";
Debug.ShouldStop(2048);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_collapseitem");};
 BA.debugLineNum = 1037;BA.debugLine="DragAndDropShadow.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_draganddropshadow").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1038;BA.debugLine="DragAndDropShadow.Color = Colors.ARGB(128, 128,";
Debug.ShouldStop(8192);
__ref.getField(false,"_draganddropshadow").runVoidMethod ("setColor",clschecklist.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 128))));
 BA.debugLineNum = 1039;BA.debugLine="sv.Panel.AddView(DragAndDropShadow, pnl.Left, pn";
Debug.ShouldStop(16384);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_draganddropshadow").getObject())),(Object)(_pnl.runMethod(true,"getLeft")),(Object)(_pnl.runMethod(true,"getTop")),(Object)(_pnl.runMethod(true,"getWidth")),(Object)(_pnl.runMethod(true,"getHeight")));
 BA.debugLineNum = 1040;BA.debugLine="DragAndDrop.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_draganddrop").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1041;BA.debugLine="DragAndDrop.SetBackgroundImage(ViewToBmp(pnl))";
Debug.ShouldStop(65536);
__ref.getField(false,"_draganddrop").runVoidMethod ("SetBackgroundImage",(Object)((__ref.runClassMethod (com.bcleaner.clschecklist.class, "_viewtobmp",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _pnl.getObject())).getObject())));
 BA.debugLineNum = 1042;BA.debugLine="sv.Panel.AddView(DragAndDrop, pnl.Left, pnl.Top,";
Debug.ShouldStop(131072);
__ref.getField(false,"_sv").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_draganddrop").getObject())),(Object)(_pnl.runMethod(true,"getLeft")),(Object)(_pnl.runMethod(true,"getTop")),(Object)(_pnl.runMethod(true,"getWidth")),(Object)(_pnl.runMethod(true,"getHeight")));
 BA.debugLineNum = 1043;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(262144);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 1044;BA.debugLine="r.Target = DragAndDrop";
Debug.ShouldStop(524288);
_r.setField ("Target",(__ref.getField(false,"_draganddrop").getObject()));
 BA.debugLineNum = 1045;BA.debugLine="r.SetOnTouchListener(\"pnlSV_Touch\")";
Debug.ShouldStop(1048576);
_r.runVoidMethod ("SetOnTouchListener",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pnlSV_Touch")));
 BA.debugLineNum = 1046;BA.debugLine="OriginDDTop = pnl.Top";
Debug.ShouldStop(2097152);
__ref.setField ("_originddtop",_pnl.runMethod(true,"getTop"));
 BA.debugLineNum = 1047;BA.debugLine="sub_AfterDrop = subAfterDrop";
Debug.ShouldStop(4194304);
__ref.setField ("_sub_afterdrop",_subafterdrop);
 };
 BA.debugLineNum = 1049;BA.debugLine="End Sub";
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
public static RemoteObject  _swapitems(RemoteObject __ref,RemoteObject _positem1,RemoteObject _positem2) throws Exception{
try {
		Debug.PushSubsStack("SwapItems (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("swapitems")) return __ref.runUserSub(false, "clschecklist","swapitems", __ref, _positem1, _positem2);
RemoteObject _posmin = RemoteObject.createImmutable(0);
RemoteObject _posmax = RemoteObject.createImmutable(0);
RemoteObject _pmin = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pmax = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tmptop = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _delta = RemoteObject.createImmutable(0);
Debug.locals.put("PosItem1", _positem1);
Debug.locals.put("PosItem2", _positem2);
 BA.debugLineNum = 348;BA.debugLine="Public Sub SwapItems(PosItem1 As Int, PosItem2 As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="If sv.IsInitialized And PosItem1 <> PosItem2 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_sv").runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("!",_positem1,BA.numberCast(double.class, _positem2))) { 
 BA.debugLineNum = 350;BA.debugLine="If HasExtraContent Then CollapseItem";
Debug.ShouldStop(536870912);
if (__ref.runClassMethod (com.bcleaner.clschecklist.class, "_hasextracontent").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (com.bcleaner.clschecklist.class, "_collapseitem");};
 BA.debugLineNum = 351;BA.debugLine="Dim PosMin, PosMax As Int";
Debug.ShouldStop(1073741824);
_posmin = RemoteObject.createImmutable(0);Debug.locals.put("PosMin", _posmin);
_posmax = RemoteObject.createImmutable(0);Debug.locals.put("PosMax", _posmax);
 BA.debugLineNum = 352;BA.debugLine="PosMin = Min(PosItem1, PosItem2)";
Debug.ShouldStop(-2147483648);
_posmin = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, _positem1)),(Object)(BA.numberCast(double.class, _positem2))));Debug.locals.put("PosMin", _posmin);
 BA.debugLineNum = 353;BA.debugLine="PosMax = Max(PosItem1, PosItem2)";
Debug.ShouldStop(1);
_posmax = BA.numberCast(int.class, clschecklist.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _positem1)),(Object)(BA.numberCast(double.class, _positem2))));Debug.locals.put("PosMax", _posmax);
 BA.debugLineNum = 354;BA.debugLine="If PosMax > NumberOfItems - 1 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_posmax,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 355;BA.debugLine="Log(\"Error: position after the last item\")";
Debug.ShouldStop(4);
clschecklist.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error: position after the last item")));
 BA.debugLineNum = 356;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 358;BA.debugLine="Dim pMin, pMax, pnl As Panel";
Debug.ShouldStop(32);
_pmin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pMin", _pmin);
_pmax = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pMax", _pmax);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 359;BA.debugLine="pMin = sv.Panel.GetView(PosMin)";
Debug.ShouldStop(64);
_pmin.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_posmin)).getObject());
 BA.debugLineNum = 360;BA.debugLine="pMax = sv.Panel.GetView(PosMax)";
Debug.ShouldStop(128);
_pmax.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_posmax)).getObject());
 BA.debugLineNum = 361;BA.debugLine="Dim tmpTop As Int";
Debug.ShouldStop(256);
_tmptop = RemoteObject.createImmutable(0);Debug.locals.put("tmpTop", _tmptop);
 BA.debugLineNum = 362;BA.debugLine="tmpTop = pMin.Top";
Debug.ShouldStop(512);
_tmptop = _pmin.runMethod(true,"getTop");Debug.locals.put("tmpTop", _tmptop);
 BA.debugLineNum = 363;BA.debugLine="pMin.Top = pMax.Top";
Debug.ShouldStop(1024);
_pmin.runMethod(true,"setTop",_pmax.runMethod(true,"getTop"));
 BA.debugLineNum = 364;BA.debugLine="pMax.Top = tmpTop";
Debug.ShouldStop(2048);
_pmax.runMethod(true,"setTop",_tmptop);
 BA.debugLineNum = 369;BA.debugLine="If PosMax < NumberOfItems - PosMax Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_posmax,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),_posmax}, "-",1, 1)))) { 
 BA.debugLineNum = 370;BA.debugLine="pMin.SendToBack";
Debug.ShouldStop(131072);
_pmin.runVoidMethod ("SendToBack");
 BA.debugLineNum = 371;BA.debugLine="For i = PosMin + 1 To PosMax - 1";
Debug.ShouldStop(262144);
{
final int step19 = 1;
final int limit19 = RemoteObject.solve(new RemoteObject[] {_posmax,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {_posmin,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ; (step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19); _i = ((int)(0 + _i + step19)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 372;BA.debugLine="pnl = sv.Panel.GetView(PosMax - 1)";
Debug.ShouldStop(524288);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_posmax,RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());
 BA.debugLineNum = 373;BA.debugLine="pnl.SendToBack";
Debug.ShouldStop(1048576);
_pnl.runVoidMethod ("SendToBack");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 375;BA.debugLine="pMax.SendToBack";
Debug.ShouldStop(4194304);
_pmax.runVoidMethod ("SendToBack");
 BA.debugLineNum = 376;BA.debugLine="For i = 0 To PosMin - 1";
Debug.ShouldStop(8388608);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_posmin,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 377;BA.debugLine="pnl = sv.Panel.GetView(PosMax)";
Debug.ShouldStop(16777216);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_posmax)).getObject());
 BA.debugLineNum = 378;BA.debugLine="pnl.SendToBack";
Debug.ShouldStop(33554432);
_pnl.runVoidMethod ("SendToBack");
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 381;BA.debugLine="pMax.BringToFront";
Debug.ShouldStop(268435456);
_pmax.runVoidMethod ("BringToFront");
 BA.debugLineNum = 382;BA.debugLine="For i = PosMin + 1 To PosMax - 1";
Debug.ShouldStop(536870912);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {_posmax,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {_posmin,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ; (step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30); _i = ((int)(0 + _i + step30)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 383;BA.debugLine="pnl = sv.Panel.GetView(PosMin + 1)";
Debug.ShouldStop(1073741824);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(RemoteObject.solve(new RemoteObject[] {_posmin,RemoteObject.createImmutable(1)}, "+",1, 1))).getObject());
 BA.debugLineNum = 384;BA.debugLine="pnl.BringToFront";
Debug.ShouldStop(-2147483648);
_pnl.runVoidMethod ("BringToFront");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 386;BA.debugLine="pMin.BringToFront";
Debug.ShouldStop(2);
_pmin.runVoidMethod ("BringToFront");
 BA.debugLineNum = 387;BA.debugLine="For i = PosMax + 1 To NumberOfItems - 1";
Debug.ShouldStop(4);
{
final int step35 = 1;
final int limit35 = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (com.bcleaner.clschecklist.class, "_numberofitems"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {_posmax,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ; (step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35); _i = ((int)(0 + _i + step35)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 388;BA.debugLine="pnl = sv.Panel.GetView(PosMin)";
Debug.ShouldStop(8);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(_posmin)).getObject());
 BA.debugLineNum = 389;BA.debugLine="pnl.BringToFront";
Debug.ShouldStop(16);
_pnl.runVoidMethod ("BringToFront");
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 394;BA.debugLine="Dim Delta As Int";
Debug.ShouldStop(512);
_delta = RemoteObject.createImmutable(0);Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 395;BA.debugLine="If pMin.Height <> pMax.Height Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("!",_pmin.runMethod(true,"getHeight"),BA.numberCast(double.class, _pmax.runMethod(true,"getHeight")))) { 
 BA.debugLineNum = 396;BA.debugLine="Delta = pMin.Height - pMax.Height";
Debug.ShouldStop(2048);
_delta = RemoteObject.solve(new RemoteObject[] {_pmin.runMethod(true,"getHeight"),_pmax.runMethod(true,"getHeight")}, "-",1, 1);Debug.locals.put("Delta", _delta);
 BA.debugLineNum = 397;BA.debugLine="For i = PosMin + 1 To PosMax";
Debug.ShouldStop(4096);
{
final int step43 = 1;
final int limit43 = _posmax.<Integer>get().intValue();
for (_i = RemoteObject.solve(new RemoteObject[] {_posmin,RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue() ; (step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43); _i = ((int)(0 + _i + step43)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 398;BA.debugLine="pnl = sv.Panel.GetView(i)";
Debug.ShouldStop(8192);
_pnl.setObject(__ref.getField(false,"_sv").runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).getObject());
 BA.debugLineNum = 399;BA.debugLine="pnl.Top = pnl.Top - Delta";
Debug.ShouldStop(16384);
_pnl.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {_pnl.runMethod(true,"getTop"),_delta}, "-",1, 1));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 403;BA.debugLine="End Sub";
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
public static RemoteObject  _viewtobmp(RemoteObject __ref,RemoteObject _myview) throws Exception{
try {
		Debug.PushSubsStack("ViewToBmp (clschecklist) ","clschecklist",3,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("viewtobmp")) return __ref.runUserSub(false, "clschecklist","viewtobmp", __ref, _myview);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _r1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _r2 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _args = null;
RemoteObject _types = null;
Debug.locals.put("MyView", _myview);
 BA.debugLineNum = 107;BA.debugLine="Private Sub ViewToBmp(MyView As View) As Bitmap";
Debug.ShouldStop(1024);
 BA.debugLineNum = 109;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(4096);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 110;BA.debugLine="Dim c As Canvas";
Debug.ShouldStop(8192);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("c", _c);
 BA.debugLineNum = 111;BA.debugLine="bmp.InitializeMutable(MyView.Width, MyView.Height";
Debug.ShouldStop(16384);
_bmp.runVoidMethod ("InitializeMutable",(Object)(_myview.runMethod(true,"getWidth")),(Object)(_myview.runMethod(true,"getHeight")));
 BA.debugLineNum = 112;BA.debugLine="c.Initialize2(bmp)";
Debug.ShouldStop(32768);
_c.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 114;BA.debugLine="Dim r1, r2 As Reflector";
Debug.ShouldStop(131072);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r1", _r1);
_r2 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r2", _r2);
 BA.debugLineNum = 115;BA.debugLine="r1.Target = MyView";
Debug.ShouldStop(262144);
_r1.setField ("Target",(_myview.getObject()));
 BA.debugLineNum = 116;BA.debugLine="r2.Target = c";
Debug.ShouldStop(524288);
_r2.setField ("Target",(_c));
 BA.debugLineNum = 117;BA.debugLine="r2.Target = r2.GetField(\"canvas\")";
Debug.ShouldStop(1048576);
_r2.setField ("Target",_r2.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("canvas"))));
 BA.debugLineNum = 119;BA.debugLine="Dim args(1) As Object";
Debug.ShouldStop(4194304);
_args = RemoteObject.createNewArray ("Object", new int[] {1}, new Object[]{});Debug.locals.put("args", _args);
 BA.debugLineNum = 120;BA.debugLine="Dim types(1) As String";
Debug.ShouldStop(8388608);
_types = RemoteObject.createNewArray ("String", new int[] {1}, new Object[]{});Debug.locals.put("types", _types);
 BA.debugLineNum = 121;BA.debugLine="args(0) = r2.Target";
Debug.ShouldStop(16777216);
_args.setArrayElement (_r2.getField(false,"Target"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 122;BA.debugLine="types(0) = \"android.graphics.Canvas\"";
Debug.ShouldStop(33554432);
_types.setArrayElement (BA.ObjectToString("android.graphics.Canvas"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 123;BA.debugLine="r1.RunMethod4(\"draw\", args, types)";
Debug.ShouldStop(67108864);
_r1.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("draw")),(Object)(_args),(Object)(_types));
 BA.debugLineNum = 125;BA.debugLine="Return c.Bitmap";
Debug.ShouldStop(268435456);
if (true) return _c.runMethod(false,"getBitmap");
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
}