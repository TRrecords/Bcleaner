package com.bcleaner;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clschecklist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.bcleaner.clschecklist");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.bcleaner.clschecklist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _typsortdata{
public boolean IsInitialized;
public int Index;
public Object Value;
public void Initialize() {
IsInitialized = true;
Index = 0;
Value = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public int _backgroundcolor = 0;
public int _checkedcolor = 0;
public int _dividercolor = 0;
public int _extensioncolor = 0;
public boolean _filterresult = false;
public flm.b4a.scrollview2d.ScrollView2DWrapper _sv = null;
public int _svheight = 0;
public int _extensionindex = 0;
public anywheresoftware.b4a.objects.ConcreteViewWrapper _extensionview = null;
public Object _callbackmod = null;
public String _sub_check = "";
public String _sub_click = "";
public String _sub_longclick = "";
public String _sub_paint = "";
public boolean _modecheck = false;
public boolean _blockcheckevent = false;
public anywheresoftware.b4a.objects.PanelWrapper _pressedpanel = null;
public Object _presseddrawable = null;
public Object _oldbackground = null;
public int _dividersize = 0;
public anywheresoftware.b4a.objects.PanelWrapper _draganddrop = null;
public anywheresoftware.b4a.objects.PanelWrapper _draganddropshadow = null;
public int _originddtop = 0;
public int _lasty = 0;
public String _sub_afterdrop = "";
public int _chkboxsize = 0;
public int _bitmapsize = 0;
public int _labelheight = 0;
public int _panelheight = 0;
public int _paint_default = 0;
public int _paint_extended = 0;
public int _paint_checked = 0;
public int _paint_pressed = 0;
public com.bcleaner.main _main = null;
public com.bcleaner.starter _starter = null;
public com.bcleaner.setanimation _setanimation = null;
public String  _abortdraganddrop(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "abortdraganddrop"))
	return (String) Debug.delegate(ba, "abortdraganddrop", null);
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub AbortDragAndDrop()";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If DragAndDrop.IsInitialized Then";
if (__ref._draganddrop.IsInitialized()) { 
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="DragAndDrop.RemoveView";
__ref._draganddrop.RemoveView();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="DragAndDrop = Null";
__ref._draganddrop.setObject((android.view.ViewGroup)(__c.Null));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="DragAndDropShadow.RemoveView";
__ref._draganddropshadow.RemoveView();
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="DragAndDropShadow = Null";
__ref._draganddropshadow.setObject((android.view.ViewGroup)(__c.Null));
 };
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="End Sub";
return "";
}
public String  _addcustomitem(com.bcleaner.clschecklist __ref,Object _id,anywheresoftware.b4a.objects.PanelWrapper _pnl,int _pnlheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "addcustomitem"))
	return (String) Debug.delegate(ba, "addcustomitem", new Object[] {_id,_pnl,_pnlheight});
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub AddCustomItem(ID As Object, pnl As Pane";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If pnl.IsInitialized Then";
if (_pnl.IsInitialized()) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="pnl.Tag = ID";
_pnl.setTag(_id);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="AddToSV(pnl, pnlHeight, True)";
__ref._addtosv(null,_pnl,_pnlheight,__c.True);
 };
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="End Sub";
return "";
}
public String  _addtosv(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl,int _pnlheight,boolean _withevents) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "addtosv"))
	return (String) Debug.delegate(ba, "addtosv", new Object[] {_pnl,_pnlheight,_withevents});
anywheresoftware.b4a.objects.PanelWrapper _pnldiv = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Private Sub AddToSV(pnl As Panel, pnlHeight As Int";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="If DividerSize > 0 Then";
if (__ref._dividersize>0) { 
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim pnlDiv As Panel";
_pnldiv = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="pnlDiv.Initialize(\"\")";
_pnldiv.Initialize(ba,"");
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="pnlDiv.Color = DividerColor";
_pnldiv.setColor(__ref._dividercolor);
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="pnl.AddView(pnlDiv, 0, pnlHeight, getWidth, Divi";
_pnl.AddView((android.view.View)(_pnldiv.getObject()),(int) (0),_pnlheight,__ref._getwidth(null),__ref._dividersize);
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="pnlHeight = pnlHeight + DividerSize";
_pnlheight = (int) (_pnlheight+__ref._dividersize);
 };
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="sv.Panel.AddView(pnl, 0, svHeight, getWidth, pnlH";
__ref._sv.getPanel().AddView((android.view.View)(_pnl.getObject()),(int) (0),__ref._svheight,__ref._getwidth(null),_pnlheight);
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="svHeight = svHeight + pnl.Height";
__ref._svheight = (int) (__ref._svheight+_pnl.getHeight());
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="If Not(WithEvents) Then Return";
if (__c.Not(_withevents)) { 
if (true) return "";};
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="r.Target = pnl";
_r.Target = (Object)(_pnl.getObject());
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="r.SetOnTouchListener(\"pnlSV_Touch\")";
_r.SetOnTouchListener(ba,"pnlSV_Touch");
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="If sub_Click <> \"\" Then r.SetOnClickListener(\"pnl";
if ((__ref._sub_click).equals("") == false) { 
_r.SetOnClickListener(ba,"pnlSV_Click");};
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="If sub_LongClick <> \"\" Then r.SetOnLongClickListe";
if ((__ref._sub_longclick).equals("") == false) { 
_r.SetOnLongClickListener(ba,"pnlSV_LongClick");};
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="End Sub";
return "";
}
public String  _addheader(com.bcleaner.clschecklist __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "addheader"))
	return (String) Debug.delegate(ba, "addheader", new Object[] {_text});
anywheresoftware.b4a.objects.PanelWrapper _pnlh = null;
anywheresoftware.b4a.objects.LabelWrapper _lblb = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdh = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub AddHeader(Text As String)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim pnlH As Panel: pnlH.Initialize(\"\")";
_pnlh = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim pnlH As Panel: pnlH.Initialize(\"\")";
_pnlh.Initialize(ba,"");
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim lblB As Label: lblB.Initialize(\"\")";
_lblb = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim lblB As Label: lblB.Initialize(\"\")";
_lblb.Initialize(ba,"");
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Dim cdH As ColorDrawable";
_cdh = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="cdH.Initialize(Colors.ARGB(100, 30, 30, 30), 10)";
_cdh.Initialize(__c.Colors.ARGB((int) (100),(int) (30),(int) (30),(int) (30)),(int) (10));
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="lblB.Background = cdH";
_lblb.setBackground((android.graphics.drawable.Drawable)(_cdh.getObject()));
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="lblB.Text = \"   \" & Text";
_lblb.setText(BA.ObjectToCharSequence("   "+_text));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="lblB.TextColor = Colors.Black";
_lblb.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="lblB.TextSize = 18";
_lblb.setTextSize((float) (18));
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="lblB.Typeface = Typeface.DEFAULT_BOLD";
_lblb.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="lblB.Gravity = Gravity.CENTER_VERTICAL";
_lblb.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="pnlH.AddView(lblB, 0, 0, getWidth, PanelHeight)";
_pnlh.AddView((android.view.View)(_lblb.getObject()),(int) (0),(int) (0),__ref._getwidth(null),__ref._panelheight);
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="AddToSV(pnlH, PanelHeight, False)";
__ref._addtosv(null,_pnlh,__ref._panelheight,__c.False);
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="PaintBackground(pnlH, False)";
__ref._paintbackground(null,_pnlh,__c.False);
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="End Sub";
return "";
}
public int  _getwidth(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "getwidth"))
	return (Integer) Debug.delegate(ba, "getwidth", null);
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _largeur = 0;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="If sv.Width < 0 Then";
if (__ref._sv.getWidth()<0) { 
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim r As Reflector, Largeur As Int";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
_largeur = 0;
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="r.Target = sv";
_r.Target = (Object)(__ref._sv.getObject());
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Largeur = r.RunMethod(\"getWidth\")";
_largeur = (int)(BA.ObjectToNumber(_r.RunMethod("getWidth")));
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="If Largeur = 0 Then";
if (_largeur==0) { 
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Largeur = r.RunMethod(\"getWidth\")";
_largeur = (int)(BA.ObjectToNumber(_r.RunMethod("getWidth")));
 };
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="Return Largeur";
if (true) return _largeur;
 }else {
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Return sv.Width";
if (true) return __ref._sv.getWidth();
 };
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="End Sub";
return 0;
}
public String  _paintbackground(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl,boolean _extended) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "paintbackground"))
	return (String) Debug.delegate(ba, "paintbackground", new Object[] {_pnl,_extended});
int _state = 0;
int _p = 0;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub PaintBackground(pnl As Panel, Extended";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim State As Int";
_state = 0;
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="If Extended Then";
if (_extended) { 
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="State = PAINT_EXTENDED";
_state = __ref._paint_extended;
 }else {
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="State = PAINT_DEFAULT";
_state = __ref._paint_default;
 };
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
{
final int step7 = 1;
final int limit7 = (int) (_pnl.getNumberOfViews()-1);
for (_p = (int) (0) ; (step7 > 0 && _p <= limit7) || (step7 < 0 && _p >= limit7); _p = ((int)(0 + _p + step7)) ) {
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
if (__ref._ischeckbox(null,_pnl.GetView(_p))) { 
RDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="Dim chk As CheckBox";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="chk = pnl.GetView(p)";
_chk.setObject((android.widget.CheckBox)(_pnl.GetView(_p).getObject()));
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="If chk.Checked Then State = State + PAINT_CHECK";
if (_chk.getChecked()) { 
_state = (int) (_state+__ref._paint_checked);};
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="If SubExists(CallbackMod, sub_Paint) Then";
if (__c.SubExists(ba,__ref._callbackmod,__ref._sub_paint)) { 
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="CallSub3(CallbackMod, sub_Paint, pnl, State)";
__c.CallSubNew3(ba,__ref._callbackmod,__ref._sub_paint,(Object)(_pnl),(Object)(_state));
 }else {
RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="Select State";
switch (BA.switchObjectToInt(_state,__ref._paint_extended,__ref._paint_checked,(int) (__ref._paint_checked+__ref._paint_extended))) {
case 0: {
RDebugUtils.currentLine=5111828;
 //BA.debugLineNum = 5111828;BA.debugLine="pnl.Color = ExtensionColor";
_pnl.setColor(__ref._extensioncolor);
 break; }
case 1: {
RDebugUtils.currentLine=5111830;
 //BA.debugLineNum = 5111830;BA.debugLine="pnl.Color = CheckedColor";
_pnl.setColor(__ref._checkedcolor);
 break; }
case 2: {
RDebugUtils.currentLine=5111832;
 //BA.debugLineNum = 5111832;BA.debugLine="If CheckedColor = Colors.Transparent Then";
if (__ref._checkedcolor==__c.Colors.Transparent) { 
RDebugUtils.currentLine=5111833;
 //BA.debugLineNum = 5111833;BA.debugLine="pnl.Color = ExtensionColor";
_pnl.setColor(__ref._extensioncolor);
 }else {
RDebugUtils.currentLine=5111835;
 //BA.debugLineNum = 5111835;BA.debugLine="pnl.Color = CheckedColor";
_pnl.setColor(__ref._checkedcolor);
 };
 break; }
default: {
RDebugUtils.currentLine=5111838;
 //BA.debugLineNum = 5111838;BA.debugLine="pnl.Color = BackgroundColor";
_pnl.setColor(__ref._backgroundcolor);
 break; }
}
;
 };
RDebugUtils.currentLine=5111841;
 //BA.debugLineNum = 5111841;BA.debugLine="End Sub";
return "";
}
public String  _additem(com.bcleaner.clschecklist __ref,Object _id,boolean _checked,String _text1,String _text2,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "additem"))
	return (String) Debug.delegate(ba, "additem", new Object[] {_id,_checked,_text1,_text2,_image});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
int _largeurlabel = 0;
int _posx = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl2 = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub AddItem(ID As Object, Checked As Boolea";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
_pnl.Initialize(ba,"");
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim chk As CheckBox:	chk.Initialize(\"chbSV\")";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim chk As CheckBox:	chk.Initialize(\"chbSV\")";
_chk.Initialize(ba,"chbSV");
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="pnl.Tag = ID";
_pnl.setTag(_id);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="pnl.AddView(chk, 0, 0, ChkBoxSize, PanelHeight)";
_pnl.AddView((android.view.View)(_chk.getObject()),(int) (0),(int) (0),__ref._chkboxsize,__ref._panelheight);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Dim LargeurLabel As Int, PosX As Int";
_largeurlabel = 0;
_posx = 0;
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="LargeurLabel = 150%x";
_largeurlabel = __c.PerXToCurrent((float) (150),ba);
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="If Not(Image.IsInitialized) Then";
if (__c.Not(_image.IsInitialized())) { 
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="PosX = ChkBoxSize";
_posx = __ref._chkboxsize;
 }else {
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="bmp = Image";
_bmp = _image;
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="If NumberFormat(bmp.Width / bmp.Height, 1, 2) =";
if ((__c.NumberFormat(_bmp.getWidth()/(double)_bmp.getHeight(),(int) (1),(int) (2))).equals(__c.NumberFormat(1,(int) (1),(int) (2)))) { 
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="iv.Gravity = Gravity.FILL";
_iv.setGravity(__c.Gravity.FILL);
 }else {
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="bmp = AdjustBitmap(bmp, BitmapSize, BitmapSize)";
_bmp = __ref._adjustbitmap(null,_bmp,__ref._bitmapsize,__ref._bitmapsize);
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="iv.Gravity = Gravity.NO_GRAVITY";
_iv.setGravity(__c.Gravity.NO_GRAVITY);
 };
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="iv.Bitmap = bmp";
_iv.setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="pnl.AddView(iv, ChkBoxSize, 0, BitmapSize, Bitma";
_pnl.AddView((android.view.View)(_iv.getObject()),__ref._chkboxsize,(int) (0),__ref._bitmapsize,__ref._bitmapsize);
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="PosX = ChkBoxSize + BitmapSize + 5dip";
_posx = (int) (__ref._chkboxsize+__ref._bitmapsize+__c.DipToCurrent((int) (5)));
 };
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
_lbl1.Initialize(ba,"");
RDebugUtils.currentLine=2621466;
 //BA.debugLineNum = 2621466;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
_lbl1.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="lbl1.Text = Text1";
_lbl1.setText(BA.ObjectToCharSequence(_text1));
RDebugUtils.currentLine=2621468;
 //BA.debugLineNum = 2621468;BA.debugLine="lbl1.TextColor = Colors.White";
_lbl1.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2621469;
 //BA.debugLineNum = 2621469;BA.debugLine="lbl1.TextSize = 18";
_lbl1.setTextSize((float) (18));
RDebugUtils.currentLine=2621470;
 //BA.debugLineNum = 2621470;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
_lbl1.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2621471;
 //BA.debugLineNum = 2621471;BA.debugLine="If Text2 = \"\" Then";
if ((_text2).equals("")) { 
RDebugUtils.currentLine=2621472;
 //BA.debugLineNum = 2621472;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, PanelHe";
_pnl.AddView((android.view.View)(_lbl1.getObject()),_posx,(int) (0),_largeurlabel,__ref._panelheight);
 }else {
RDebugUtils.currentLine=2621474;
 //BA.debugLineNum = 2621474;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, LabelHe";
_pnl.AddView((android.view.View)(_lbl1.getObject()),_posx,(int) (0),_largeurlabel,__ref._labelheight);
RDebugUtils.currentLine=2621475;
 //BA.debugLineNum = 2621475;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2621475;
 //BA.debugLineNum = 2621475;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
_lbl2.Initialize(ba,"");
RDebugUtils.currentLine=2621476;
 //BA.debugLineNum = 2621476;BA.debugLine="lbl2.Gravity = Gravity.TOP";
_lbl2.setGravity(__c.Gravity.TOP);
RDebugUtils.currentLine=2621477;
 //BA.debugLineNum = 2621477;BA.debugLine="lbl2.Text = Text2";
_lbl2.setText(BA.ObjectToCharSequence(_text2));
RDebugUtils.currentLine=2621478;
 //BA.debugLineNum = 2621478;BA.debugLine="lbl2.TextColor = Colors.LightGray";
_lbl2.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2621479;
 //BA.debugLineNum = 2621479;BA.debugLine="lbl2.TextSize = 16";
_lbl2.setTextSize((float) (16));
RDebugUtils.currentLine=2621480;
 //BA.debugLineNum = 2621480;BA.debugLine="lbl2.Typeface = Typeface.DEFAULT";
_lbl2.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=2621481;
 //BA.debugLineNum = 2621481;BA.debugLine="pnl.AddView(lbl2, PosX, LabelHeight, LargeurLabe";
_pnl.AddView((android.view.View)(_lbl2.getObject()),_posx,__ref._labelheight,_largeurlabel,__ref._labelheight);
 };
RDebugUtils.currentLine=2621483;
 //BA.debugLineNum = 2621483;BA.debugLine="AddToSV(pnl, PanelHeight, True)";
__ref._addtosv(null,_pnl,__ref._panelheight,__c.True);
RDebugUtils.currentLine=2621484;
 //BA.debugLineNum = 2621484;BA.debugLine="BlockCheckEvent = True";
__ref._blockcheckevent = __c.True;
RDebugUtils.currentLine=2621485;
 //BA.debugLineNum = 2621485;BA.debugLine="chk.Checked = Checked";
_chk.setChecked(_checked);
RDebugUtils.currentLine=2621486;
 //BA.debugLineNum = 2621486;BA.debugLine="BlockCheckEvent = False";
__ref._blockcheckevent = __c.False;
RDebugUtils.currentLine=2621487;
 //BA.debugLineNum = 2621487;BA.debugLine="PaintBackground(pnl, False)";
__ref._paintbackground(null,_pnl,__c.False);
RDebugUtils.currentLine=2621488;
 //BA.debugLineNum = 2621488;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _adjustbitmap(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "adjustbitmap"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "adjustbitmap", new Object[] {_bmp,_width,_height});
float _ratiobmp = 0f;
float _ratioiv = 0f;
float _diviseur = 0f;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub AdjustBitmap(bmp As Bitmap, Width As In";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim RatioBmp, RatioIV As Float";
_ratiobmp = 0f;
_ratioiv = 0f;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="RatioBmp = bmp.Width / bmp.Height";
_ratiobmp = (float) (_bmp.getWidth()/(double)_bmp.getHeight());
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="RatioIV = Width / Height";
_ratioiv = (float) (_width/(double)_height);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim Diviseur As Float";
_diviseur = 0f;
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="If RatioIV > RatioBmp Then";
if (_ratioiv>_ratiobmp) { 
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Diviseur = bmp.Height / Height";
_diviseur = (float) (_bmp.getHeight()/(double)_height);
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(bmp.Width /";
_bmp = __ref._createscaledbitmap(null,_bmp,(int) (__c.Round(_bmp.getWidth()/(double)_diviseur/(double)__c.Density)),(int) (__c.Round(_height/(double)__c.Density)));
 }else {
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Diviseur = bmp.Width / Width";
_diviseur = (float) (_bmp.getWidth()/(double)_width);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(Width / Dens";
_bmp = __ref._createscaledbitmap(null,_bmp,(int) (__c.Round(_width/(double)__c.Density)),(int) (__c.Round(_bmp.getHeight()/(double)_diviseur/(double)__c.Density)));
 };
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="End Sub";
return null;
}
public String  _additemnochkbx(com.bcleaner.clschecklist __ref,Object _id,String _text1,String _text2,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "additemnochkbx"))
	return (String) Debug.delegate(ba, "additemnochkbx", new Object[] {_id,_text1,_text2,_image});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _largeurlabel = 0;
int _posx = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl2 = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub AddItemNoChkbx(ID As Object, Text1 As S";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
_pnl.Initialize(ba,"");
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="pnl.Tag = ID";
_pnl.setTag(_id);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim LargeurLabel As Int, PosX As Int";
_largeurlabel = 0;
_posx = 0;
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="LargeurLabel = 150%x";
_largeurlabel = __c.PerXToCurrent((float) (150),ba);
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="If Image.IsInitialized Then";
if (_image.IsInitialized()) { 
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Dim iv As ImageView: iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="bmp = Image";
_bmp = _image;
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="If NumberFormat(bmp.Width / bmp.Height, 1, 2) =";
if ((__c.NumberFormat(_bmp.getWidth()/(double)_bmp.getHeight(),(int) (1),(int) (2))).equals(__c.NumberFormat(1,(int) (1),(int) (2)))) { 
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="iv.Gravity = Gravity.FILL";
_iv.setGravity(__c.Gravity.FILL);
 }else {
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="bmp = AdjustBitmap(bmp, BitmapSize, BitmapSize)";
_bmp = __ref._adjustbitmap(null,_bmp,__ref._bitmapsize,__ref._bitmapsize);
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="iv.Gravity = Gravity.NO_GRAVITY";
_iv.setGravity(__c.Gravity.NO_GRAVITY);
 };
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="iv.Bitmap = bmp";
_iv.setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="pnl.AddView(iv, 0, 0, BitmapSize, BitmapSize)";
_pnl.AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),__ref._bitmapsize,__ref._bitmapsize);
RDebugUtils.currentLine=2686995;
 //BA.debugLineNum = 2686995;BA.debugLine="PosX = BitmapSize + 5dip";
_posx = (int) (__ref._bitmapsize+__c.DipToCurrent((int) (5)));
 };
RDebugUtils.currentLine=2686997;
 //BA.debugLineNum = 2686997;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2686997;
 //BA.debugLineNum = 2686997;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
_lbl1.Initialize(ba,"");
RDebugUtils.currentLine=2686998;
 //BA.debugLineNum = 2686998;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
_lbl1.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=2686999;
 //BA.debugLineNum = 2686999;BA.debugLine="lbl1.Text = Text1";
_lbl1.setText(BA.ObjectToCharSequence(_text1));
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="lbl1.TextColor = Colors.ARGB(150,255,255,255)";
_lbl1.setTextColor(__c.Colors.ARGB((int) (150),(int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=2687001;
 //BA.debugLineNum = 2687001;BA.debugLine="lbl1.TextSize = 18";
_lbl1.setTextSize((float) (18));
RDebugUtils.currentLine=2687002;
 //BA.debugLineNum = 2687002;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
_lbl1.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=2687003;
 //BA.debugLineNum = 2687003;BA.debugLine="If Text2 = \"\" Then";
if ((_text2).equals("")) { 
RDebugUtils.currentLine=2687004;
 //BA.debugLineNum = 2687004;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, PanelHe";
_pnl.AddView((android.view.View)(_lbl1.getObject()),_posx,(int) (0),_largeurlabel,__ref._panelheight);
 }else {
RDebugUtils.currentLine=2687006;
 //BA.debugLineNum = 2687006;BA.debugLine="pnl.AddView(lbl1, PosX, 0, LargeurLabel, LabelHe";
_pnl.AddView((android.view.View)(_lbl1.getObject()),_posx,(int) (0),_largeurlabel,__ref._labelheight);
RDebugUtils.currentLine=2687007;
 //BA.debugLineNum = 2687007;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2687007;
 //BA.debugLineNum = 2687007;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
_lbl2.Initialize(ba,"");
RDebugUtils.currentLine=2687008;
 //BA.debugLineNum = 2687008;BA.debugLine="lbl2.Gravity = Gravity.TOP";
_lbl2.setGravity(__c.Gravity.TOP);
RDebugUtils.currentLine=2687009;
 //BA.debugLineNum = 2687009;BA.debugLine="lbl2.Text = Text2";
_lbl2.setText(BA.ObjectToCharSequence(_text2));
RDebugUtils.currentLine=2687010;
 //BA.debugLineNum = 2687010;BA.debugLine="lbl2.TextColor = Colors.LightGray";
_lbl2.setTextColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2687011;
 //BA.debugLineNum = 2687011;BA.debugLine="lbl2.TextSize = 16";
_lbl2.setTextSize((float) (16));
RDebugUtils.currentLine=2687012;
 //BA.debugLineNum = 2687012;BA.debugLine="lbl2.Typeface = Typeface.DEFAULT";
_lbl2.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=2687013;
 //BA.debugLineNum = 2687013;BA.debugLine="pnl.AddView(lbl2, PosX, LabelHeight, LargeurLabe";
_pnl.AddView((android.view.View)(_lbl2.getObject()),_posx,__ref._labelheight,_largeurlabel,__ref._labelheight);
 };
RDebugUtils.currentLine=2687015;
 //BA.debugLineNum = 2687015;BA.debugLine="AddToSV(pnl, PanelHeight, True)";
__ref._addtosv(null,_pnl,__ref._panelheight,__c.True);
RDebugUtils.currentLine=2687016;
 //BA.debugLineNum = 2687016;BA.debugLine="PaintBackground(pnl, False)";
__ref._paintbackground(null,_pnl,__c.False);
RDebugUtils.currentLine=2687017;
 //BA.debugLineNum = 2687017;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _createscaledbitmap(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _original,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "createscaledbitmap"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "createscaledbitmap", new Object[] {_original,_width,_height});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub CreateScaledBitmap(Original As Bitmap,";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="b = r.RunStaticMethod(\"android.graphics.Bitmap\",";
_b.setObject((android.graphics.Bitmap)(_r.RunStaticMethod("android.graphics.Bitmap","createScaledBitmap",new Object[]{(Object)(_original.getObject()),(Object)(_width),(Object)(_height),(Object)(__c.True)},new String[]{"android.graphics.Bitmap","java.lang.int","java.lang.int","java.lang.boolean"})));
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="End Sub";
return null;
}
public String  _cancelfilter(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "cancelfilter"))
	return (String) Debug.delegate(ba, "cancelfilter", null);
int _firstpos = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Public Sub CancelFilter()";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim FirstPos As Int, pnl As Panel";
_firstpos = 0;
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="FirstPos = -1";
_firstpos = (int) (-1);
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="For i = 0 To NumberOfItems - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (0) ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="If pnl.Visible = False Then";
if (_pnl.getVisible()==__c.False) { 
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="If FirstPos = -1 Then FirstPos = i";
if (_firstpos==-1) { 
_firstpos = _i;};
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="pnl.Visible = True";
_pnl.setVisible(__c.True);
 };
 }
};
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="If FirstPos > -1 Then MoveTopAfterFiltering(First";
if (_firstpos>-1) { 
__ref._movetopafterfiltering(null,_firstpos);};
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="End Sub";
return "";
}
public int  _numberofitems(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "numberofitems"))
	return (Integer) Debug.delegate(ba, "numberofitems", null);
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub NumberOfItems As Int";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Return sv.Panel.NumberOfViews";
if (true) return __ref._sv.getPanel().getNumberOfViews();
 }else {
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="End Sub";
return 0;
}
public String  _movetopafterfiltering(com.bcleaner.clschecklist __ref,int _firstpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "movetopafterfiltering"))
	return (String) Debug.delegate(ba, "movetopafterfiltering", new Object[] {_firstpos});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _newtop = 0;
int _i = 0;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Private Sub MoveTopAfterFiltering(FirstPos As Int)";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim pnl As Panel, NewTop As Int";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_newtop = 0;
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="pnl = sv.Panel.GetView(FirstPos)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_firstpos).getObject()));
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="If pnl.Visible Then";
if (_pnl.getVisible()) { 
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="NewTop = pnl.Top + pnl.Height";
_newtop = (int) (_pnl.getTop()+_pnl.getHeight());
 }else {
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="NewTop = pnl.Top";
_newtop = _pnl.getTop();
 };
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="For i = FirstPos + 1 To NumberOfItems - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (_firstpos+1) ; (step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8); _i = ((int)(0 + _i + step8)) ) {
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="If pnl.Visible Then";
if (_pnl.getVisible()) { 
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="pnl.Top = NewTop";
_pnl.setTop(_newtop);
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="NewTop = pnl.Top + pnl.Height";
_newtop = (int) (_pnl.getTop()+_pnl.getHeight());
 };
 }
};
RDebugUtils.currentLine=5963792;
 //BA.debugLineNum = 5963792;BA.debugLine="svHeight = NewTop";
__ref._svheight = _newtop;
RDebugUtils.currentLine=5963793;
 //BA.debugLineNum = 5963793;BA.debugLine="sv.Panel.Height = svHeight";
__ref._sv.getPanel().setHeight(__ref._svheight);
RDebugUtils.currentLine=5963794;
 //BA.debugLineNum = 5963794;BA.debugLine="End Sub";
return "";
}
public String  _chbsv_checkedchange(com.bcleaner.clschecklist __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "chbsv_checkedchange"))
	return (String) Debug.delegate(ba, "chbsv_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chb = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Private Sub chbSV_CheckedChange(Checked As Boolean";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim chb As CheckBox, pnl As Panel";
_chb = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="chb = Sender";
_chb.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="pnl = FindPanelContaining(chb)";
_pnl = __ref._findpanelcontaining(null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_chb.getObject())));
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="PaintBackground(pnl, HasExtraContent AND Extended";
__ref._paintbackground(null,_pnl,__ref._hasextracontent(null) && (__ref._extendeditemid(null)).equals(_pnl.getTag()));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="If BlockCheckEvent Then Return";
if (__ref._blockcheckevent) { 
if (true) return "";};
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="If sub_Check <> \"\" Then";
if ((__ref._sub_check).equals("") == false) { 
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="If SubExists(CallbackMod, sub_Check) Then CallSu";
if (__c.SubExists(ba,__ref._callbackmod,__ref._sub_check)) { 
__c.CallSubNew3(ba,__ref._callbackmod,__ref._sub_check,(Object)(_chb),_pnl.getTag());};
 };
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _findpanelcontaining(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _myview) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "findpanelcontaining"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "findpanelcontaining", new Object[] {_myview});
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub FindPanelContaining(MyView As View) As";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Return GetParentPanel(MyView)";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._getparentpanel(null,_myview).getObject()));
 }else {
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Null));
 };
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="End Sub";
return null;
}
public boolean  _hasextracontent(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "hasextracontent"))
	return (Boolean) Debug.delegate(ba, "hasextracontent", null);
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub HasExtraContent As Boolean";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Return (ExtensionIndex <> -1)";
if (true) return (__ref._extensionindex!=-1);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return false;
}
public Object  _extendeditemid(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "extendeditemid"))
	return (Object) Debug.delegate(ba, "extendeditemid", null);
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub ExtendedItemID As Object";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="If ExtensionView.IsInitialized Then";
if (__ref._extensionview.IsInitialized()) { 
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="pnl = FindPanelContaining(ExtensionView)";
_pnl = __ref._findpanelcontaining(null,__ref._extensionview);
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Return pnl.Tag";
if (true) return _pnl.getTag();
 }else {
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Return Null";
if (true) return __c.Null;
 };
RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="End Sub";
return null;
}
public String  _checkallboxes(com.bcleaner.clschecklist __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "checkallboxes"))
	return (String) Debug.delegate(ba, "checkallboxes", new Object[] {_checked});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chb = null;
int _i = 0;
int _p = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub CheckAllBoxes(Checked As Boolean)";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="BlockCheckEvent = True 'We don't want to trigger";
__ref._blockcheckevent = __c.True;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim pnl As Panel, chb As CheckBox";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_chb = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0) ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (_pnl.getNumberOfViews()-1);
for (_p = (int) (0) ; (step5 > 0 && _p <= limit5) || (step5 < 0 && _p >= limit5); _p = ((int)(0 + _p + step5)) ) {
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
if (__ref._ischeckbox(null,_pnl.GetView(_p))) { 
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="chb = pnl.GetView(p)";
_chb.setObject((android.widget.CheckBox)(_pnl.GetView(_p).getObject()));
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="chb.Checked = Checked";
_chb.setChecked(_checked);
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="BlockCheckEvent = False";
__ref._blockcheckevent = __c.False;
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="End Sub";
return "";
}
public boolean  _ischeckbox(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _myview) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "ischeckbox"))
	return (Boolean) Debug.delegate(ba, "ischeckbox", new Object[] {_myview});
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Private Sub IsCheckBox(MyView As View) As Boolean";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Return (GetType(MyView) = \"android.widget.CheckBo";
if (true) return ((__c.GetType((Object)(_myview.getObject()))).equals("android.widget.CheckBox"));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _checkedlist(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "checkedlist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "checkedlist", null);
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub CheckedList As List";
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Return MakeCheckedList(0)";
if (true) return __ref._makecheckedlist(null,(int) (0));
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _makecheckedlist(com.bcleaner.clschecklist __ref,int _listtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "makecheckedlist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "makecheckedlist", new Object[] {_listtype});
anywheresoftware.b4a.objects.collections.List _listecoches = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _p = 0;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Private Sub MakeCheckedList(ListType As Int) As Li";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim ListeCoches As List";
_listecoches = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="ListeCoches.Initialize";
_listecoches.Initialize();
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0) ; (step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4); _i = ((int)(0 + _i + step4)) ) {
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
{
final int step7 = 1;
final int limit7 = (int) (_pnl.getNumberOfViews()-1);
for (_p = (int) (0) ; (step7 > 0 && _p <= limit7) || (step7 < 0 && _p >= limit7); _p = ((int)(0 + _p + step7)) ) {
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
if (__ref._ischeckbox(null,_pnl.GetView(_p))) { 
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Dim chk As CheckBox";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="chk = pnl.GetView(p)";
_chk.setObject((android.widget.CheckBox)(_pnl.GetView(_p).getObject()));
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="If chk.Checked Then";
if (_chk.getChecked()) { 
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="If ListType = 0 Then";
if (_listtype==0) { 
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="ListeCoches.Add(pnl.Tag)";
_listecoches.Add(_pnl.getTag());
 }else {
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="ListeCoches.Add(pnl)";
_listecoches.Add((Object)(_pnl.getObject()));
 };
 };
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=4653079;
 //BA.debugLineNum = 4653079;BA.debugLine="Return ListeCoches";
if (true) return _listecoches;
RDebugUtils.currentLine=4653080;
 //BA.debugLineNum = 4653080;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _checkedpanels(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "checkedpanels"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "checkedpanels", null);
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub CheckedPanels As List";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Return MakeCheckedList(1)";
if (true) return __ref._makecheckedlist(null,(int) (1));
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Public BackgroundColor As Int";
_backgroundcolor = 0;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Public CheckedColor As Int";
_checkedcolor = 0;
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Public DividerColor As Int";
_dividercolor = 0;
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="Public ExtensionColor As Int";
_extensioncolor = 0;
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Public FilterResult As Boolean";
_filterresult = false;
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="Private sv As ScrollView2D";
_sv = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Private svHeight As Int";
_svheight = 0;
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="Private ExtensionIndex As Int";
_extensionindex = 0;
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Private ExtensionView As View";
_extensionview = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="Private CallbackMod As Object";
_callbackmod = new Object();
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="Private sub_Check, sub_Click, sub_LongClick As St";
_sub_check = "";
_sub_click = "";
_sub_longclick = "";
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="Private sub_Paint As String";
_sub_paint = "";
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Private ModeCheck As Boolean";
_modecheck = false;
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="Private BlockCheckEvent As Boolean";
_blockcheckevent = false;
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="Private PressedPanel As Panel";
_pressedpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="Private PressedDrawable As Object";
_presseddrawable = new Object();
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="Private OldBackground As Object";
_oldbackground = new Object();
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="Private DividerSize As Int";
_dividersize = 0;
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="Private DragAndDrop, DragAndDropShadow As Panel";
_draganddrop = new anywheresoftware.b4a.objects.PanelWrapper();
_draganddropshadow = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="Private OriginDDTop, LastY As Int";
_originddtop = 0;
_lasty = 0;
RDebugUtils.currentLine=2293784;
 //BA.debugLineNum = 2293784;BA.debugLine="Private sub_AfterDrop As String";
_sub_afterdrop = "";
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="Private ChkBoxSize  As Int: ChkBoxSize  = 40dip";
_chkboxsize = 0;
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="Private ChkBoxSize  As Int: ChkBoxSize  = 40dip";
__ref._chkboxsize = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="Private BitmapSize As Int: BitmapSize = 50dip";
_bitmapsize = 0;
RDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="Private BitmapSize As Int: BitmapSize = 50dip";
__ref._bitmapsize = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=2293788;
 //BA.debugLineNum = 2293788;BA.debugLine="Private LabelHeight  As Int: LabelHeight  = 25dip";
_labelheight = 0;
RDebugUtils.currentLine=2293788;
 //BA.debugLineNum = 2293788;BA.debugLine="Private LabelHeight  As Int: LabelHeight  = 25dip";
__ref._labelheight = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="Private PanelHeight As Int: PanelHeight = 2 * Lab";
_panelheight = 0;
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="Private PanelHeight As Int: PanelHeight = 2 * Lab";
__ref._panelheight = (int) (2*__ref._labelheight);
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="Private PAINT_DEFAULT As Int: PAINT_DEFAULT = 0";
_paint_default = 0;
RDebugUtils.currentLine=2293790;
 //BA.debugLineNum = 2293790;BA.debugLine="Private PAINT_DEFAULT As Int: PAINT_DEFAULT = 0";
__ref._paint_default = (int) (0);
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="Private PAINT_EXTENDED As Int: PAINT_EXTENDED = 1";
_paint_extended = 0;
RDebugUtils.currentLine=2293791;
 //BA.debugLineNum = 2293791;BA.debugLine="Private PAINT_EXTENDED As Int: PAINT_EXTENDED = 1";
__ref._paint_extended = (int) (1);
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="Private PAINT_CHECKED As Int: PAINT_CHECKED = 2";
_paint_checked = 0;
RDebugUtils.currentLine=2293792;
 //BA.debugLineNum = 2293792;BA.debugLine="Private PAINT_CHECKED As Int: PAINT_CHECKED = 2";
__ref._paint_checked = (int) (2);
RDebugUtils.currentLine=2293793;
 //BA.debugLineNum = 2293793;BA.debugLine="Private PAINT_PRESSED As Int: PAINT_PRESSED = 4";
_paint_pressed = 0;
RDebugUtils.currentLine=2293793;
 //BA.debugLineNum = 2293793;BA.debugLine="Private PAINT_PRESSED As Int: PAINT_PRESSED = 4";
__ref._paint_pressed = (int) (4);
RDebugUtils.currentLine=2293795;
 //BA.debugLineNum = 2293795;BA.debugLine="Type typSortData(Index As Int, Value As Object)";
;
RDebugUtils.currentLine=2293796;
 //BA.debugLineNum = 2293796;BA.debugLine="End Sub";
return "";
}
public String  _collapseitem(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "collapseitem"))
	return (String) Debug.delegate(ba, "collapseitem", null);
int _extensionheight = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.PanelWrapper _pnldivider = null;
int _i = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub CollapseItem";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If ExtensionIndex <> -1 Then";
if (__ref._extensionindex!=-1) { 
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Dim ExtensionHeight As Int";
_extensionheight = 0;
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="ExtensionHeight = ExtensionView.Height";
_extensionheight = __ref._extensionview.getHeight();
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="ExtensionView.RemoveView";
__ref._extensionview.RemoveView();
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="pnl = sv.Panel.GetView(ExtensionIndex)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(__ref._extensionindex).getObject()));
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="PaintBackground(pnl, False)";
__ref._paintbackground(null,_pnl,__c.False);
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="pnl.Height = pnl.Height - ExtensionHeight";
_pnl.setHeight((int) (_pnl.getHeight()-_extensionheight));
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="If DividerSize > 0 Then";
if (__ref._dividersize>0) { 
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="Dim pnlDivider As Panel";
_pnldivider = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="pnlDivider = pnl.GetView(pnl.NumberOfViews - 1)";
_pnldivider.setObject((android.view.ViewGroup)(_pnl.GetView((int) (_pnl.getNumberOfViews()-1)).getObject()));
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="pnlDivider.Top = pnl.Height - DividerSize";
_pnldivider.setTop((int) (_pnl.getHeight()-__ref._dividersize));
 };
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="svHeight = svHeight - ExtensionHeight";
__ref._svheight = (int) (__ref._svheight-_extensionheight);
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="sv.Panel.Height = svHeight";
__ref._sv.getPanel().setHeight(__ref._svheight);
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="For i = ExtensionIndex + 1 To sv.Panel.NumberOfV";
{
final int step16 = 1;
final int limit16 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (__ref._extensionindex+1) ; (step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16); _i = ((int)(0 + _i + step16)) ) {
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="pnl.Top = pnl.Top - ExtensionHeight";
_pnl.setTop((int) (_pnl.getTop()-_extensionheight));
 }
};
RDebugUtils.currentLine=5242901;
 //BA.debugLineNum = 5242901;BA.debugLine="ExtensionIndex = -1";
__ref._extensionindex = (int) (-1);
 };
RDebugUtils.currentLine=5242903;
 //BA.debugLineNum = 5242903;BA.debugLine="ExtensionView = Null";
__ref._extensionview.setObject((android.view.View)(__c.Null));
RDebugUtils.currentLine=5242904;
 //BA.debugLineNum = 5242904;BA.debugLine="End Sub";
return "";
}
public String  _commonjump(com.bcleaner.clschecklist __ref,int _newposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "commonjump"))
	return (String) Debug.delegate(ba, "commonjump", new Object[] {_newposition});
int _previousposition = 0;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Private Sub CommonJump(NewPosition As Int)";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="NewPosition = Max(0, NewPosition - 5dip)";
_newposition = (int) (__c.Max(0,_newposition-__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Dim PreviousPosition As Int: PreviousPosition = -";
_previousposition = 0;
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Dim PreviousPosition As Int: PreviousPosition = -";
_previousposition = (int) (-1);
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="Do Until PreviousPosition = sv.VerticalScrollPosi";
while (!(_previousposition==__ref._sv.getVerticalScrollPosition())) {
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="PreviousPosition = sv.VerticalScrollPosition";
_previousposition = __ref._sv.getVerticalScrollPosition();
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="sv.VerticalScrollPosition = NewPosition";
__ref._sv.setVerticalScrollPosition(_newposition);
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="DoEvents";
__c.DoEvents();
 }
;
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _createcheckedstatelist(com.bcleaner.clschecklist __ref,int _firstposition,int _lastposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "createcheckedstatelist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createcheckedstatelist", new Object[] {_firstposition,_lastposition});
anywheresoftware.b4a.objects.collections.List _liste = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _c = null;
int _i = 0;
int _p = 0;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub CreateCheckedStateList(FirstPosition As";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim Liste As List: Liste.Initialize";
_liste = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim Liste As List: Liste.Initialize";
_liste.Initialize();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Dim pnl As Panel, v As View, c As CheckBox";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_c = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="For i = FirstPosition To LastPosition";
{
final int step5 = 1;
final int limit5 = _lastposition;
for (_i = _firstposition ; (step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5); _i = ((int)(0 + _i + step5)) ) {
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
{
final int step7 = 1;
final int limit7 = (int) (_pnl.getNumberOfViews()-1);
for (_p = (int) (0) ; (step7 > 0 && _p <= limit7) || (step7 < 0 && _p >= limit7); _p = ((int)(0 + _p + step7)) ) {
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="v = pnl.GetView(p)";
_v = _pnl.GetView(_p);
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="If IsCheckBox(v) Then";
if (__ref._ischeckbox(null,_v)) { 
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="c = v";
_c.setObject((android.widget.CheckBox)(_v.getObject()));
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="Liste.Add(c.Checked)";
_liste.Add((Object)(_c.getChecked()));
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 };
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="Return Liste";
if (true) return _liste;
RDebugUtils.currentLine=3735569;
 //BA.debugLineNum = 3735569;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createintegerlist(com.bcleaner.clschecklist __ref,int _viewindexinpanel,int _firstposition,int _lastposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "createintegerlist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createintegerlist", new Object[] {_viewindexinpanel,_firstposition,_lastposition});
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub CreateIntegerList(ViewIndexInPanel As I";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Return MakeValuesListWith(ViewIndexInPanel, First";
if (true) return __ref._makevalueslistwith(null,_viewindexinpanel,_firstposition,_lastposition,(int) (2));
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _makevalueslistwith(com.bcleaner.clschecklist __ref,int _viewindexinpanel,int _firstposition,int _lastposition,int _typeliste) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "makevalueslistwith"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "makevalueslistwith", new Object[] {_viewindexinpanel,_firstposition,_lastposition,_typeliste});
anywheresoftware.b4a.objects.collections.List _liste = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.EditTextWrapper _e = null;
int _entier = 0;
int _i = 0;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Private Sub MakeValuesListWith(ViewIndexInPanel As";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim Liste As List: Liste.Initialize";
_liste = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim Liste As List: Liste.Initialize";
_liste.Initialize();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="If LastPosition > NumberOfItems - 1 Then";
if (_lastposition>__ref._numberofitems(null)-1) { 
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="Log(\"LastPosition is beyond the last item\")";
__c.Log("LastPosition is beyond the last item");
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Return Liste";
if (true) return _liste;
 };
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="Dim pnl As Panel, v As View";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Dim l As Label, e As EditText";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_e = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="Dim entier As Int";
_entier = 0;
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="For i = FirstPosition To LastPosition";
{
final int step11 = 1;
final int limit11 = _lastposition;
for (_i = _firstposition ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="v = pnl.GetView(ViewIndexInPanel)";
_v = _pnl.GetView(_viewindexinpanel);
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="If TypeListe = 0 Then";
if (_typeliste==0) { 
RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="Liste.Add(v.Tag)";
_liste.Add(_v.getTag());
 }else 
{RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="Else If TypeListe = 1 Then";
if (_typeliste==1) { 
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="If Not(v.IsInitialized) Then";
if (__c.Not(_v.IsInitialized())) { 
RDebugUtils.currentLine=3473427;
 //BA.debugLineNum = 3473427;BA.debugLine="Liste.Add(\"\")";
_liste.Add((Object)(""));
 }else 
{RDebugUtils.currentLine=3473428;
 //BA.debugLineNum = 3473428;BA.debugLine="Else If IsLabel(v) Then";
if (__ref._islabel(null,_v)) { 
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="l = v";
_l.setObject((android.widget.TextView)(_v.getObject()));
RDebugUtils.currentLine=3473430;
 //BA.debugLineNum = 3473430;BA.debugLine="Liste.Add(l.Text)";
_liste.Add((Object)(_l.getText()));
 }else 
{RDebugUtils.currentLine=3473431;
 //BA.debugLineNum = 3473431;BA.debugLine="Else If IsEditText(v) Then";
if (__ref._isedittext(null,_v)) { 
RDebugUtils.currentLine=3473432;
 //BA.debugLineNum = 3473432;BA.debugLine="e = v";
_e.setObject((android.widget.EditText)(_v.getObject()));
RDebugUtils.currentLine=3473433;
 //BA.debugLineNum = 3473433;BA.debugLine="Liste.Add(e.Text)";
_liste.Add((Object)(_e.getText()));
 }}};
 }else {
RDebugUtils.currentLine=3473437;
 //BA.debugLineNum = 3473437;BA.debugLine="If Not(v.IsInitialized) Then";
if (__c.Not(_v.IsInitialized())) { 
RDebugUtils.currentLine=3473438;
 //BA.debugLineNum = 3473438;BA.debugLine="Liste.Add(0)";
_liste.Add((Object)(0));
 }else 
{RDebugUtils.currentLine=3473439;
 //BA.debugLineNum = 3473439;BA.debugLine="Else If IsLabel(v) Then";
if (__ref._islabel(null,_v)) { 
RDebugUtils.currentLine=3473440;
 //BA.debugLineNum = 3473440;BA.debugLine="l = v";
_l.setObject((android.widget.TextView)(_v.getObject()));
RDebugUtils.currentLine=3473441;
 //BA.debugLineNum = 3473441;BA.debugLine="If IsNumber(l.Text) Then";
if (__c.IsNumber(_l.getText())) { 
RDebugUtils.currentLine=3473442;
 //BA.debugLineNum = 3473442;BA.debugLine="entier = Floor(l.Text)";
_entier = (int) (__c.Floor((double)(Double.parseDouble(_l.getText()))));
RDebugUtils.currentLine=3473443;
 //BA.debugLineNum = 3473443;BA.debugLine="Liste.Add(entier)";
_liste.Add((Object)(_entier));
 }else {
RDebugUtils.currentLine=3473445;
 //BA.debugLineNum = 3473445;BA.debugLine="Liste.Add(0)";
_liste.Add((Object)(0));
 };
 }else 
{RDebugUtils.currentLine=3473447;
 //BA.debugLineNum = 3473447;BA.debugLine="Else If IsEditText(v) Then";
if (__ref._isedittext(null,_v)) { 
RDebugUtils.currentLine=3473448;
 //BA.debugLineNum = 3473448;BA.debugLine="e = v";
_e.setObject((android.widget.EditText)(_v.getObject()));
RDebugUtils.currentLine=3473449;
 //BA.debugLineNum = 3473449;BA.debugLine="If IsNumber(e.Text) Then";
if (__c.IsNumber(_e.getText())) { 
RDebugUtils.currentLine=3473450;
 //BA.debugLineNum = 3473450;BA.debugLine="entier = Floor(e.Text)";
_entier = (int) (__c.Floor((double)(Double.parseDouble(_e.getText()))));
RDebugUtils.currentLine=3473451;
 //BA.debugLineNum = 3473451;BA.debugLine="Liste.Add(entier)";
_liste.Add((Object)(_entier));
 }else {
RDebugUtils.currentLine=3473453;
 //BA.debugLineNum = 3473453;BA.debugLine="Liste.Add(0)";
_liste.Add((Object)(0));
 };
 }}};
 }};
 }
};
 };
RDebugUtils.currentLine=3473459;
 //BA.debugLineNum = 3473459;BA.debugLine="Return Liste";
if (true) return _liste;
RDebugUtils.currentLine=3473460;
 //BA.debugLineNum = 3473460;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createtaglist(com.bcleaner.clschecklist __ref,int _viewindexinpanel,int _firstposition,int _lastposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "createtaglist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createtaglist", new Object[] {_viewindexinpanel,_firstposition,_lastposition});
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub CreateTagList(ViewIndexInPanel As Int,";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Return MakeValuesListWith(ViewIndexInPanel, First";
if (true) return __ref._makevalueslistwith(null,_viewindexinpanel,_firstposition,_lastposition,(int) (0));
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _createtextlist(com.bcleaner.clschecklist __ref,int _viewindexinpanel,int _firstposition,int _lastposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "createtextlist"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "createtextlist", new Object[] {_viewindexinpanel,_firstposition,_lastposition});
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub CreateTextList(ViewIndexInPanel As Int,";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Return MakeValuesListWith(ViewIndexInPanel, First";
if (true) return __ref._makevalueslistwith(null,_viewindexinpanel,_firstposition,_lastposition,(int) (1));
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="End Sub";
return null;
}
public String  _extenditem(com.bcleaner.clschecklist __ref,Object _itemid,anywheresoftware.b4a.objects.ConcreteViewWrapper _addedcontent,int _contentheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "extenditem"))
	return (String) Debug.delegate(ba, "extenditem", new Object[] {_itemid,_addedcontent,_contentheight});
boolean _movefollowingpanels = false;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnldivider = null;
int _contentbottom = 0;
int _newposition = 0;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub ExtendItem(ItemID As Object, AddedConte";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If AddedContent.IsInitialized Then";
if (_addedcontent.IsInitialized()) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="If HasExtraContent Then CollapseItem";
if (__ref._hasextracontent(null)) { 
__ref._collapseitem(null);};
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="Dim MoveFollowingPanels As Boolean";
_movefollowingpanels = false;
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="MoveFollowingPanels = False";
_movefollowingpanels = __c.False;
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="If MoveFollowingPanels Then";
if (_movefollowingpanels) { 
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="pnl.Top = pnl.Top + ContentHeight";
_pnl.setTop((int) (_pnl.getTop()+_contentheight));
 }else 
{RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="Else If pnl.Tag = Null Then";
if (_pnl.getTag()== null) { 
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Continue ' It's a header";
if (true) continue;
 }else 
{RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="Else If pnl.Tag = ItemID Then";
if ((_pnl.getTag()).equals(_itemid)) { 
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="ExtensionIndex = i";
__ref._extensionindex = _i;
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="ExtensionView = AddedContent";
__ref._extensionview = _addedcontent;
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="PaintBackground(pnl, True)";
__ref._paintbackground(null,_pnl,__c.True);
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="If DividerSize > 0 Then";
if (__ref._dividersize>0) { 
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="Dim pnlDivider As Panel";
_pnldivider = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="pnlDivider = pnl.GetView(pnl.NumberOfViews -";
_pnldivider.setObject((android.view.ViewGroup)(_pnl.GetView((int) (_pnl.getNumberOfViews()-1)).getObject()));
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="pnlDivider.Top = pnl.Height + ContentHeight -";
_pnldivider.setTop((int) (_pnl.getHeight()+_contentheight-__ref._dividersize));
 };
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="If IsCheckBox(pnl.GetView(0)) Then";
if (__ref._ischeckbox(null,_pnl.GetView((int) (0)))) { 
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="pnl.AddView(AddedContent, ChkBoxSize, pnl.Hei";
_pnl.AddView((android.view.View)(_addedcontent.getObject()),__ref._chkboxsize,(int) (_pnl.getHeight()-__ref._dividersize),(int) (__ref._getwidth(null)-__ref._chkboxsize),_contentheight);
 }else {
RDebugUtils.currentLine=5177370;
 //BA.debugLineNum = 5177370;BA.debugLine="pnl.AddView(AddedContent, 0, pnl.Height - Div";
_pnl.AddView((android.view.View)(_addedcontent.getObject()),(int) (0),(int) (_pnl.getHeight()-__ref._dividersize),__ref._getwidth(null),_contentheight);
 };
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="pnl.Height = pnl.Height + ContentHeight";
_pnl.setHeight((int) (_pnl.getHeight()+_contentheight));
RDebugUtils.currentLine=5177373;
 //BA.debugLineNum = 5177373;BA.debugLine="svHeight = svHeight + ContentHeight";
__ref._svheight = (int) (__ref._svheight+_contentheight);
RDebugUtils.currentLine=5177374;
 //BA.debugLineNum = 5177374;BA.debugLine="sv.Panel.Height = svHeight";
__ref._sv.getPanel().setHeight(__ref._svheight);
RDebugUtils.currentLine=5177376;
 //BA.debugLineNum = 5177376;BA.debugLine="Dim ContentBottom As Int";
_contentbottom = 0;
RDebugUtils.currentLine=5177377;
 //BA.debugLineNum = 5177377;BA.debugLine="ContentBottom = pnl.Top + pnl.Height";
_contentbottom = (int) (_pnl.getTop()+_pnl.getHeight());
RDebugUtils.currentLine=5177378;
 //BA.debugLineNum = 5177378;BA.debugLine="If ContentBottom > sv.VerticalScrollPosition +";
if (_contentbottom>__ref._sv.getVerticalScrollPosition()+__ref._getheight(null)) { 
RDebugUtils.currentLine=5177380;
 //BA.debugLineNum = 5177380;BA.debugLine="Dim NewPosition As Int";
_newposition = 0;
RDebugUtils.currentLine=5177381;
 //BA.debugLineNum = 5177381;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=5177382;
 //BA.debugLineNum = 5177382;BA.debugLine="NewPosition = sv.VerticalScrollPosition + Min";
_newposition = (int) (__ref._sv.getVerticalScrollPosition()+__c.Min(_contentbottom-__ref._sv.getVerticalScrollPosition()-__ref._getheight(null),__ref._getheight(null))+__c.DipToCurrent((int) (15)));
RDebugUtils.currentLine=5177383;
 //BA.debugLineNum = 5177383;BA.debugLine="CommonJump(NewPosition)";
__ref._commonjump(null,_newposition);
 };
RDebugUtils.currentLine=5177386;
 //BA.debugLineNum = 5177386;BA.debugLine="AddedContent.RequestFocus";
_addedcontent.RequestFocus();
RDebugUtils.currentLine=5177387;
 //BA.debugLineNum = 5177387;BA.debugLine="MoveFollowingPanels = True";
_movefollowingpanels = __c.True;
 }}};
 }
};
 };
RDebugUtils.currentLine=5177391;
 //BA.debugLineNum = 5177391;BA.debugLine="End Sub";
return "";
}
public int  _getheight(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "getheight"))
	return (Integer) Debug.delegate(ba, "getheight", null);
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _hauteur = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If sv.Height < 0 Then";
if (__ref._sv.getHeight()<0) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim r As Reflector, Hauteur As Int";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
_hauteur = 0;
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="r.Target = sv";
_r.Target = (Object)(__ref._sv.getObject());
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Hauteur = r.RunMethod(\"getHeight\")";
_hauteur = (int)(BA.ObjectToNumber(_r.RunMethod("getHeight")));
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="If Hauteur = 0 Then";
if (_hauteur==0) { 
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Hauteur = r.RunMethod(\"getHeight\")";
_hauteur = (int)(BA.ObjectToNumber(_r.RunMethod("getHeight")));
 };
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Return Hauteur";
if (true) return _hauteur;
 }else {
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="Return sv.Height";
if (true) return __ref._sv.getHeight();
 };
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="End Sub";
return 0;
}
public int  _filter(com.bcleaner.clschecklist __ref,int _viewindexinpanel,String _comparisonfunction,int _filtertype) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "filter"))
	return (Integer) Debug.delegate(ba, "filter", new Object[] {_viewindexinpanel,_comparisonfunction,_filtertype});
anywheresoftware.b4a.objects.collections.List _l = null;
int _firstpos = 0;
int _count = 0;
String _s = "";
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Private Sub Filter(ViewIndexInPanel As Int, Compar";
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="If Not(SubExists(CallbackMod, ComparisonFunction)";
if (__c.Not(__c.SubExists(ba,__ref._callbackmod,_comparisonfunction))) { 
RDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Log(ComparisonFunction & \" not found\")";
__c.Log(_comparisonfunction+" not found");
RDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="If FilterType = 0 Then";
if (_filtertype==0) { 
RDebugUtils.currentLine=6029323;
 //BA.debugLineNum = 6029323;BA.debugLine="L = CreateTagList(ViewIndexInPanel, 0, NumberOfI";
_l = __ref._createtaglist(null,_viewindexinpanel,(int) (0),(int) (__ref._numberofitems(null)-1));
 }else {
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="L = CreateTextList(ViewIndexInPanel, 0, NumberOf";
_l = __ref._createtextlist(null,_viewindexinpanel,(int) (0),(int) (__ref._numberofitems(null)-1));
 };
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="Dim FirstPos, Count As Int";
_firstpos = 0;
_count = 0;
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="FirstPos = -1";
_firstpos = (int) (-1);
RDebugUtils.currentLine=6029329;
 //BA.debugLineNum = 6029329;BA.debugLine="Dim S As String, pnl As Panel";
_s = "";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="For i = 0 To L.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_l.getSize()-1);
for (_i = (int) (0) ; (step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14); _i = ((int)(0 + _i + step14)) ) {
RDebugUtils.currentLine=6029331;
 //BA.debugLineNum = 6029331;BA.debugLine="S = L.Get(i)";
_s = BA.ObjectToString(_l.Get(_i));
RDebugUtils.currentLine=6029332;
 //BA.debugLineNum = 6029332;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="CallSub3(CallbackMod, ComparisonFunction, pnl.Ta";
__c.CallSubNew3(ba,__ref._callbackmod,_comparisonfunction,_pnl.getTag(),(Object)(_s));
RDebugUtils.currentLine=6029334;
 //BA.debugLineNum = 6029334;BA.debugLine="If FilterResult = True Then";
if (__ref._filterresult==__c.True) { 
RDebugUtils.currentLine=6029335;
 //BA.debugLineNum = 6029335;BA.debugLine="Count = Count + 1";
_count = (int) (_count+1);
RDebugUtils.currentLine=6029336;
 //BA.debugLineNum = 6029336;BA.debugLine="If pnl.Visible = False Then";
if (_pnl.getVisible()==__c.False) { 
RDebugUtils.currentLine=6029337;
 //BA.debugLineNum = 6029337;BA.debugLine="If FirstPos = -1 Then FirstPos = i";
if (_firstpos==-1) { 
_firstpos = _i;};
RDebugUtils.currentLine=6029338;
 //BA.debugLineNum = 6029338;BA.debugLine="pnl.Visible = True";
_pnl.setVisible(__c.True);
 };
 }else {
RDebugUtils.currentLine=6029341;
 //BA.debugLineNum = 6029341;BA.debugLine="If FirstPos = -1 Then FirstPos = i";
if (_firstpos==-1) { 
_firstpos = _i;};
RDebugUtils.currentLine=6029342;
 //BA.debugLineNum = 6029342;BA.debugLine="pnl.Visible = False";
_pnl.setVisible(__c.False);
 };
 }
};
RDebugUtils.currentLine=6029345;
 //BA.debugLineNum = 6029345;BA.debugLine="If FirstPos > -1 Then MoveTopAfterFiltering(First";
if (_firstpos>-1) { 
__ref._movetopafterfiltering(null,_firstpos);};
RDebugUtils.currentLine=6029346;
 //BA.debugLineNum = 6029346;BA.debugLine="Return Count";
if (true) return _count;
RDebugUtils.currentLine=6029347;
 //BA.debugLineNum = 6029347;BA.debugLine="End Sub";
return 0;
}
public int  _filtertag(com.bcleaner.clschecklist __ref,int _viewindexinpanel,String _comparisonfunction) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "filtertag"))
	return (Integer) Debug.delegate(ba, "filtertag", new Object[] {_viewindexinpanel,_comparisonfunction});
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Public Sub FilterTag(ViewIndexInPanel As Int, Comp";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Return Filter(ViewIndexInPanel, ComparisonFunctio";
if (true) return __ref._filter(null,_viewindexinpanel,_comparisonfunction,(int) (0));
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="End Sub";
return 0;
}
public int  _filtertext(com.bcleaner.clschecklist __ref,int _viewindexinpanel,String _comparisonfunction) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "filtertext"))
	return (Integer) Debug.delegate(ba, "filtertext", new Object[] {_viewindexinpanel,_comparisonfunction});
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Public Sub FilterText(ViewIndexInPanel As Int, Com";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Return Filter(ViewIndexInPanel, ComparisonFunctio";
if (true) return __ref._filter(null,_viewindexinpanel,_comparisonfunction,(int) (1));
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _getparentpanel(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _myview) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "getparentpanel"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "getparentpanel", new Object[] {_myview});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.ConcreteViewWrapper _parent = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Private Sub GetParentPanel(MyView As View) As View";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim v, Parent As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_parent = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="r.Target = MyView";
_r.Target = (Object)(_myview.getObject());
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="v = r.Target";
_v.setObject((android.view.View)(_r.Target));
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="Parent = r.RunMethod(\"getParent\")";
_parent.setObject((android.view.View)(_r.RunMethod("getParent")));
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Do While Parent <> sv.Panel";
while ((_parent).equals((android.view.View)(__ref._sv.getPanel().getObject())) == false) {
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="r.Target = Parent";
_r.Target = (Object)(_parent.getObject());
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="v = r.Target";
_v.setObject((android.view.View)(_r.Target));
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="Parent = r.RunMethod(\"getParent\")";
_parent.setObject((android.view.View)(_r.RunMethod("getParent")));
 }
;
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="Return v";
if (true) return _v;
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="End Sub";
return null;
}
public Object  _findpanelwithid(com.bcleaner.clschecklist __ref,Object _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "findpanelwithid"))
	return (Object) Debug.delegate(ba, "findpanelwithid", new Object[] {_id});
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub FindPanelWithID(ID As Object) As Object";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="For i = 0 To NumberOfItems - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (0) ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="If pnl.Tag = ID Then Return pnl";
if ((_pnl.getTag()).equals(_id)) { 
if (true) return (Object)(_pnl.getObject());};
 }
};
 };
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="End Sub";
return null;
}
public String  _getfirsttext(com.bcleaner.clschecklist __ref,Object _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "getfirsttext"))
	return (String) Debug.delegate(ba, "getfirsttext", new Object[] {_id});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _p = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub GetFirstText(ID As Object) As String";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0) ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="If pnl.Tag = Null Then Continue";
if (_pnl.getTag()== null) { 
if (true) continue;};
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="If pnl.Tag = ID Then";
if ((_pnl.getTag()).equals(_id)) { 
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
{
final int step6 = 1;
final int limit6 = (int) (_pnl.getNumberOfViews()-1);
for (_p = (int) (0) ; (step6 > 0 && _p <= limit6) || (step6 < 0 && _p >= limit6); _p = ((int)(0 + _p + step6)) ) {
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="If IsLabel(pnl.GetView(p)) Then";
if (__ref._islabel(null,_pnl.GetView(_p))) { 
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="lbl = pnl.GetView(p)";
_lbl.setObject((android.widget.TextView)(_pnl.GetView(_p).getObject()));
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="Return lbl.Text";
if (true) return _lbl.getText();
 };
 }
};
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="End Sub";
return "";
}
public boolean  _islabel(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _myview) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "islabel"))
	return (Boolean) Debug.delegate(ba, "islabel", new Object[] {_myview});
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Private Sub IsLabel(MyView As View) As Boolean";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return (GetType(MyView) = \"android.widget.TextVie";
if (true) return ((__c.GetType((Object)(_myview.getObject()))).equals("android.widget.TextView"));
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return false;
}
public String  _initialize(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.BA _ba,Object _module,flm.b4a.scrollview2d.ScrollView2DWrapper _svlist,String _subcheck,String _subclick,String _sublongclick,int _dividerheight) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_module,_svlist,_subcheck,_subclick,_sublongclick,_dividerheight});
int _i = 0;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _id_presseddrawable = 0;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub Initialize(Module As Object, svList As";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="sv = svList";
__ref._sv = _svlist;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="For i = sv.Panel.NumberOfViews-1 To 0 Step -1";
{
final int step2 = (int) (-1);
final int limit2 = (int) (0);
for (_i = (int) (__ref._sv.getPanel().getNumberOfViews()-1) ; (step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2); _i = ((int)(0 + _i + step2)) ) {
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="sv.Panel.RemoveViewAt(i)";
__ref._sv.getPanel().RemoveViewAt(_i);
 }
};
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="sv.Panel.Height = 0";
__ref._sv.getPanel().setHeight((int) (0));
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="svHeight = 0";
__ref._svheight = (int) (0);
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="CallbackMod = Module";
__ref._callbackmod = _module;
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="sub_Check = subCheck";
__ref._sub_check = _subcheck;
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="sub_Click = subClick";
__ref._sub_click = _subclick;
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="sub_LongClick = subLongClick";
__ref._sub_longclick = _sublongclick;
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="ModeCheck = (sub_Click = \"\")";
__ref._modecheck = ((__ref._sub_click).equals(""));
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="BlockCheckEvent = False";
__ref._blockcheckevent = __c.False;
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="DividerSize = DividerHeight";
__ref._dividersize = _dividerheight;
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="DividerColor = Colors.ARGB(150, 200, 200, 200)";
__ref._dividercolor = __c.Colors.ARGB((int) (150),(int) (200),(int) (200),(int) (200));
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="BackgroundColor = Colors.Transparent";
__ref._backgroundcolor = __c.Colors.Transparent;
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="CheckedColor = Colors.Transparent";
__ref._checkedcolor = __c.Colors.Transparent;
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="ExtensionColor = Colors.Transparent";
__ref._extensioncolor = __c.Colors.Transparent;
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="ExtensionIndex = -1";
__ref._extensionindex = (int) (-1);
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="ExtensionView = Null";
__ref._extensionview.setObject((android.view.View)(__c.Null));
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="r.Target = r.RunMethod(\"getSystem\")";
_r.Target = _r.RunMethod("getSystem");
RDebugUtils.currentLine=2359320;
 //BA.debugLineNum = 2359320;BA.debugLine="Dim ID_PressedDrawable As Int";
_id_presseddrawable = 0;
RDebugUtils.currentLine=2359321;
 //BA.debugLineNum = 2359321;BA.debugLine="ID_PressedDrawable = r.RunMethod4(\"getIdentifier\"";
_id_presseddrawable = (int)(BA.ObjectToNumber(_r.RunMethod4("getIdentifier",new Object[]{(Object)("list_selector_background_pressed"),(Object)("drawable"),(Object)("android")},new String[]{"java.lang.String","java.lang.String","java.lang.String"})));
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=2359324;
 //BA.debugLineNum = 2359324;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=2359325;
 //BA.debugLineNum = 2359325;BA.debugLine="PressedDrawable = r.RunMethod2(\"getDrawable\", ID_";
__ref._presseddrawable = _r.RunMethod2("getDrawable",BA.NumberToString(_id_presseddrawable),"java.lang.int");
RDebugUtils.currentLine=2359326;
 //BA.debugLineNum = 2359326;BA.debugLine="DragAndDrop = Null";
__ref._draganddrop.setObject((android.view.ViewGroup)(__c.Null));
RDebugUtils.currentLine=2359327;
 //BA.debugLineNum = 2359327;BA.debugLine="End Sub";
return "";
}
public boolean  _isedittext(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _myview) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "isedittext"))
	return (Boolean) Debug.delegate(ba, "isedittext", new Object[] {_myview});
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Private Sub IsEditText(MyView As View) As Boolean";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Return (GetType(MyView) = \"android.widget.EditTex";
if (true) return ((__c.GetType((Object)(_myview.getObject()))).equals("android.widget.EditText"));
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="End Sub";
return false;
}
public boolean  _isfiltered(com.bcleaner.clschecklist __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "isfiltered"))
	return (Boolean) Debug.delegate(ba, "isfiltered", new Object[] {_position});
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub IsFiltered(Position As Int) As Boolean";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Return sv.Panel.GetView(Position).Visible";
if (true) return __ref._sv.getPanel().GetView(_position).getVisible();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.PanelWrapper  _jumptoitem(com.bcleaner.clschecklist __ref,Object _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "jumptoitem"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "jumptoitem", new Object[] {_id});
int _totalheight = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub JumpToItem(ID As Object) As Panel";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Dim TotalHeight As Int";
_totalheight = 0;
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="For i = 0 To NumberOfItems - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (0) ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="If pnl.Tag <> Null Then";
if (_pnl.getTag()!= null) { 
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="If pnl.Tag = ID Then";
if ((_pnl.getTag()).equals(_id)) { 
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="CommonJump(TotalHeight)";
__ref._commonjump(null,_totalheight);
RDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="Return pnl";
if (true) return _pnl;
 };
 };
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="TotalHeight = TotalHeight + pnl.Height";
_totalheight = (int) (_totalheight+_pnl.getHeight());
 }
};
 };
RDebugUtils.currentLine=4456463;
 //BA.debugLineNum = 4456463;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Null));
RDebugUtils.currentLine=4456464;
 //BA.debugLineNum = 4456464;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _jumptoposition(com.bcleaner.clschecklist __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "jumptoposition"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "jumptoposition", new Object[] {_position});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub JumpToPosition(Position As Int) As Pane";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Position = Max(Position, 0)";
_position = (int) (__c.Max(_position,0));
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="Position = Min(Position, NumberOfItems - 1)";
_position = (int) (__c.Min(_position,__ref._numberofitems(null)-1));
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="pnl = sv.Panel.GetView(Position)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_position).getObject()));
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="CommonJump(pnl.Top)";
__ref._commonjump(null,_pnl.getTop());
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Return pnl";
if (true) return _pnl;
 };
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Null));
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _jumptoview(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _myview) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "jumptoview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "jumptoview", new Object[] {_myview});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub JumpToView(MyView As View) As Panel";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="pnl = GetParentPanel(MyView)";
_pnl.setObject((android.view.ViewGroup)(__ref._getparentpanel(null,_myview).getObject()));
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="CommonJump(pnl.Top)";
__ref._commonjump(null,_pnl.getTop());
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="Return pnl";
if (true) return _pnl;
 }else {
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Null));
 };
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="End Sub";
return null;
}
public String  _moveddpanel(com.bcleaner.clschecklist __ref,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "moveddpanel"))
	return (String) Debug.delegate(ba, "moveddpanel", new Object[] {_y});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub MoveDDPanel(Y As Int)";
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="r.Target = sv";
_r.Target = (Object)(__ref._sv.getObject());
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="r.RunMethod2(\"requestDisallowInterceptTouchEvent\"";
_r.RunMethod2("requestDisallowInterceptTouchEvent",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="DragAndDrop.Top = Min(Max(0, DragAndDrop.Top + Y";
__ref._draganddrop.setTop((int) (__c.Min(__c.Max(0,__ref._draganddrop.getTop()+_y-__ref._lasty),__ref._sv.getPanel().getHeight()-__ref._draganddrop.getHeight())));
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="If DragAndDrop.Top < sv.VerticalScrollPosition Th";
if (__ref._draganddrop.getTop()<__ref._sv.getVerticalScrollPosition()) { 
__ref._sv.setVerticalScrollPosition(__ref._draganddrop.getTop());};
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="If DragAndDrop.Top + DragAndDrop.Height > sv.Vert";
if (__ref._draganddrop.getTop()+__ref._draganddrop.getHeight()>__ref._sv.getVerticalScrollPosition()+__ref._getheight(null)) { 
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="sv.VerticalScrollPosition = DragAndDrop.Top + Dr";
__ref._sv.setVerticalScrollPosition((int) (__ref._draganddrop.getTop()+__ref._draganddrop.getHeight()-__ref._getheight(null)));
 };
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="End Sub";
return "";
}
public String  _moveitem(com.bcleaner.clschecklist __ref,int _startposition,int _endposition) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "moveitem"))
	return (String) Debug.delegate(ba, "moveitem", new Object[] {_startposition,_endposition});
anywheresoftware.b4a.objects.PanelWrapper _pnltomove = null;
int _pnlheight = 0;
int _newtop = 0;
boolean _movefollowingpanels = false;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
int _cptbtf = 0;
int _cptstb = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub MoveItem(StartPosition As Int, EndPosit";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="If sv.IsInitialized And StartPosition <> EndPosit";
if (__ref._sv.IsInitialized() && _startposition!=_endposition) { 
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If HasExtraContent Then CollapseItem";
if (__ref._hasextracontent(null)) { 
__ref._collapseitem(null);};
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="StartPosition = Max(0, Min(StartPosition, Number";
_startposition = (int) (__c.Max(0,__c.Min(_startposition,__ref._numberofitems(null)-1)));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="EndPosition = Max(0, Min(EndPosition, NumberOfIt";
_endposition = (int) (__c.Max(0,__c.Min(_endposition,__ref._numberofitems(null))));
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim pnlToMove As Panel";
_pnltomove = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="pnlToMove = sv.Panel.GetView(StartPosition)";
_pnltomove.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_startposition).getObject()));
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Dim PnlHeight, NewTop As Int";
_pnlheight = 0;
_newtop = 0;
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="PnlHeight = pnlToMove.Height";
_pnlheight = _pnltomove.getHeight();
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="NewTop = pnlToMove.Top";
_newtop = _pnltomove.getTop();
RDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="Dim MoveFollowingPanels As Boolean";
_movefollowingpanels = false;
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="MoveFollowingPanels = False";
_movefollowingpanels = __c.False;
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="For i = 0 To NumberOfItems - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (0) ; (step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13); _i = ((int)(0 + _i + step13)) ) {
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="If i = StartPosition Then";
if (_i==_startposition) { 
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="MoveFollowingPanels = (EndPosition > StartPosi";
_movefollowingpanels = (_endposition>_startposition);
RDebugUtils.currentLine=3014673;
 //BA.debugLineNum = 3014673;BA.debugLine="If Not(MoveFollowingPanels) Then Exit 'Move do";
if (__c.Not(_movefollowingpanels)) { 
if (true) break;};
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="PnlHeight = -PnlHeight 'Panels are moved upwar";
_pnlheight = (int) (-_pnlheight);
 }else 
{RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="Else If i = EndPosition Then";
if (_i==_endposition) { 
RDebugUtils.currentLine=3014676;
 //BA.debugLineNum = 3014676;BA.debugLine="MoveFollowingPanels = (EndPosition < StartPosi";
_movefollowingpanels = (_endposition<_startposition);
RDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="If Not(MoveFollowingPanels) Then Exit 'Move do";
if (__c.Not(_movefollowingpanels)) { 
if (true) break;};
RDebugUtils.currentLine=3014678;
 //BA.debugLineNum = 3014678;BA.debugLine="NewTop = pnl.Top";
_newtop = _pnl.getTop();
RDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="pnl.Top = pnl.Top + PnlHeight";
_pnl.setTop((int) (_pnl.getTop()+_pnlheight));
 }else 
{RDebugUtils.currentLine=3014680;
 //BA.debugLineNum = 3014680;BA.debugLine="Else If MoveFollowingPanels Then";
if (_movefollowingpanels) { 
RDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="If i = EndPosition - 1 Then NewTop = pnl.Top +";
if (_i==_endposition-1) { 
_newtop = (int) (_pnl.getTop()+_pnl.getHeight()+_pnlheight);};
RDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="pnl.Top = pnl.Top + PnlHeight";
_pnl.setTop((int) (_pnl.getTop()+_pnlheight));
 }}};
 }
};
RDebugUtils.currentLine=3014685;
 //BA.debugLineNum = 3014685;BA.debugLine="pnlToMove.Top = NewTop";
_pnltomove.setTop(_newtop);
RDebugUtils.currentLine=3014689;
 //BA.debugLineNum = 3014689;BA.debugLine="Dim CptBtF, CptStB As Int";
_cptbtf = 0;
_cptstb = 0;
RDebugUtils.currentLine=3014690;
 //BA.debugLineNum = 3014690;BA.debugLine="CptBtF = sv.Panel.NumberOfViews - EndPosition -";
_cptbtf = (int) (__ref._sv.getPanel().getNumberOfViews()-_endposition-1);
RDebugUtils.currentLine=3014691;
 //BA.debugLineNum = 3014691;BA.debugLine="CptStB = EndPosition - 1";
_cptstb = (int) (_endposition-1);
RDebugUtils.currentLine=3014692;
 //BA.debugLineNum = 3014692;BA.debugLine="If Abs(CptBtF) < Abs(CptStB) Then";
if (__c.Abs(_cptbtf)<__c.Abs(_cptstb)) { 
RDebugUtils.currentLine=3014693;
 //BA.debugLineNum = 3014693;BA.debugLine="If StartPosition < EndPosition Then";
if (_startposition<_endposition) { 
RDebugUtils.currentLine=3014694;
 //BA.debugLineNum = 3014694;BA.debugLine="CptBtF = CptBtF + 1";
_cptbtf = (int) (_cptbtf+1);
RDebugUtils.currentLine=3014695;
 //BA.debugLineNum = 3014695;BA.debugLine="EndPosition = EndPosition - 1";
_endposition = (int) (_endposition-1);
 };
RDebugUtils.currentLine=3014697;
 //BA.debugLineNum = 3014697;BA.debugLine="pnlToMove.BringToFront";
_pnltomove.BringToFront();
RDebugUtils.currentLine=3014698;
 //BA.debugLineNum = 3014698;BA.debugLine="For i = 1 To CptBtF";
{
final int step39 = 1;
final int limit39 = _cptbtf;
for (_i = (int) (1) ; (step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39); _i = ((int)(0 + _i + step39)) ) {
RDebugUtils.currentLine=3014699;
 //BA.debugLineNum = 3014699;BA.debugLine="pnl = sv.Panel.GetView(EndPosition)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_endposition).getObject()));
RDebugUtils.currentLine=3014700;
 //BA.debugLineNum = 3014700;BA.debugLine="pnl.BringToFront";
_pnl.BringToFront();
 }
};
 }else {
RDebugUtils.currentLine=3014703;
 //BA.debugLineNum = 3014703;BA.debugLine="If StartPosition > EndPosition Then";
if (_startposition>_endposition) { 
RDebugUtils.currentLine=3014704;
 //BA.debugLineNum = 3014704;BA.debugLine="CptStB = CptStB + 1";
_cptstb = (int) (_cptstb+1);
RDebugUtils.currentLine=3014705;
 //BA.debugLineNum = 3014705;BA.debugLine="EndPosition = EndPosition + 1";
_endposition = (int) (_endposition+1);
 };
RDebugUtils.currentLine=3014707;
 //BA.debugLineNum = 3014707;BA.debugLine="pnlToMove.SendToBack";
_pnltomove.SendToBack();
RDebugUtils.currentLine=3014708;
 //BA.debugLineNum = 3014708;BA.debugLine="For i = 1 To CptStB";
{
final int step49 = 1;
final int limit49 = _cptstb;
for (_i = (int) (1) ; (step49 > 0 && _i <= limit49) || (step49 < 0 && _i >= limit49); _i = ((int)(0 + _i + step49)) ) {
RDebugUtils.currentLine=3014709;
 //BA.debugLineNum = 3014709;BA.debugLine="pnl = sv.Panel.GetView(EndPosition - 1)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView((int) (_endposition-1)).getObject()));
RDebugUtils.currentLine=3014710;
 //BA.debugLineNum = 3014710;BA.debugLine="pnl.SendToBack";
_pnl.SendToBack();
 }
};
 };
 };
RDebugUtils.currentLine=3014714;
 //BA.debugLineNum = 3014714;BA.debugLine="End Sub";
return "";
}
public String  _movetodropposition(com.bcleaner.clschecklist __ref,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "movetodropposition"))
	return (String) Debug.delegate(ba, "movetodropposition", new Object[] {_y});
int _startposition = 0;
int _endposition = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub MoveToDropPosition(Y As Int)";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="DragAndDrop.Top = Min(Max(0, DragAndDrop.Top + Y";
__ref._draganddrop.setTop((int) (__c.Min(__c.Max(0,__ref._draganddrop.getTop()+_y-__ref._lasty),__ref._sv.getPanel().getHeight()-__ref._draganddrop.getHeight())));
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Dim StartPosition, EndPosition As Int";
_startposition = 0;
_endposition = 0;
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="StartPosition = -1";
_startposition = (int) (-1);
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="EndPosition = -1";
_endposition = (int) (-1);
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="For i = 0 To NumberOfItems - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="If pnl.Top = OriginDDTop Then";
if (_pnl.getTop()==__ref._originddtop) { 
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="StartPosition = i";
_startposition = _i;
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="If EndPosition <> -1 Then Exit";
if (_endposition!=-1) { 
if (true) break;};
 };
RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="If DragAndDrop.Top >= pnl.Top AND DragAndDrop.To";
if (__ref._draganddrop.getTop()>=_pnl.getTop() && __ref._draganddrop.getTop()<_pnl.getTop()+_pnl.getHeight()) { 
RDebugUtils.currentLine=5636112;
 //BA.debugLineNum = 5636112;BA.debugLine="EndPosition = i";
_endposition = _i;
RDebugUtils.currentLine=5636113;
 //BA.debugLineNum = 5636113;BA.debugLine="If StartPosition <> -1 Then Exit";
if (_startposition!=-1) { 
if (true) break;};
 };
 }
};
RDebugUtils.currentLine=5636118;
 //BA.debugLineNum = 5636118;BA.debugLine="MoveItem(StartPosition, EndPosition)";
__ref._moveitem(null,_startposition,_endposition);
RDebugUtils.currentLine=5636119;
 //BA.debugLineNum = 5636119;BA.debugLine="If EndPosition > StartPosition Then EndPosition =";
if (_endposition>_startposition) { 
_endposition = (int) (_endposition-1);};
RDebugUtils.currentLine=5636120;
 //BA.debugLineNum = 5636120;BA.debugLine="If SubExists(CallbackMod, sub_AfterDrop) Then Cal";
if (__c.SubExists(ba,__ref._callbackmod,__ref._sub_afterdrop)) { 
__c.CallSubNew3(ba,__ref._callbackmod,__ref._sub_afterdrop,(Object)(_startposition),(Object)(_endposition));};
RDebugUtils.currentLine=5636123;
 //BA.debugLineNum = 5636123;BA.debugLine="AbortDragAndDrop";
__ref._abortdraganddrop(null);
RDebugUtils.currentLine=5636124;
 //BA.debugLineNum = 5636124;BA.debugLine="End Sub";
return "";
}
public boolean  _pnlsv_click(com.bcleaner.clschecklist __ref,Object _viewtag) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "pnlsv_click"))
	return (Boolean) Debug.delegate(ba, "pnlsv_click", new Object[] {_viewtag});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub pnlSV_Click(ViewTag As Object) As Bool";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="If SubExists(CallbackMod, sub_Click) Then CallSub";
if (__c.SubExists(ba,__ref._callbackmod,__ref._sub_click)) { 
__c.CallSubNew3(ba,__ref._callbackmod,__ref._sub_click,(Object)(_pnl),_pnl.getTag());};
RDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="End Sub";
return false;
}
public boolean  _pnlsv_longclick(com.bcleaner.clschecklist __ref,Object _viewtag) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "pnlsv_longclick"))
	return (Boolean) Debug.delegate(ba, "pnlsv_longclick", new Object[] {_viewtag});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Private Sub pnlSV_LongClick(ViewTag As Object) As";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="If SubExists(CallbackMod, sub_LongClick) Then Cal";
if (__c.SubExists(ba,__ref._callbackmod,__ref._sub_longclick)) { 
__c.CallSubNew3(ba,__ref._callbackmod,__ref._sub_longclick,(Object)(_pnl),_pnl.getTag());};
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="End Sub";
return false;
}
public boolean  _pnlsv_touch(com.bcleaner.clschecklist __ref,Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "pnlsv_touch"))
	return (Boolean) Debug.delegate(ba, "pnlsv_touch", new Object[] {_viewtag,_action,_x,_y,_motionevent});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _p = 0;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chb = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub pnlSV_Touch(ViewTag As Object, Action";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="pnl = Sender";
_pnl.setObject((android.view.ViewGroup)(__c.Sender(ba)));
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="If Action <> 2 Then		' <> ACTION_MOVE";
if (_action!=2) { 
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="If PressedPanel.IsInitialized Then";
if (__ref._pressedpanel.IsInitialized()) { 
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="PressedPanel.Background = OldBackground";
__ref._pressedpanel.setBackground((android.graphics.drawable.Drawable)(__ref._oldbackground));
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="PressedPanel = Null";
__ref._pressedpanel.setObject((android.view.ViewGroup)(__c.Null));
 };
 };
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="If Action = 0 Then		' = ACTION_DOWN";
if (_action==0) { 
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="OldBackground = pnl.Background";
__ref._oldbackground = (Object)(_pnl.getBackground());
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="PressedPanel = pnl";
__ref._pressedpanel = _pnl;
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="If SubExists(CallbackMod, sub_Paint) Then";
if (__c.SubExists(ba,__ref._callbackmod,__ref._sub_paint)) { 
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="CallSub3(CallbackMod, sub_Paint, pnl, PAINT_PRE";
__c.CallSubNew3(ba,__ref._callbackmod,__ref._sub_paint,(Object)(_pnl),(Object)(__ref._paint_pressed));
 }else {
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="PressedPanel.Background = PressedDrawable";
__ref._pressedpanel.setBackground((android.graphics.drawable.Drawable)(__ref._presseddrawable));
 };
 }else 
{RDebugUtils.currentLine=5701649;
 //BA.debugLineNum = 5701649;BA.debugLine="Else If Action = 1 Then	' = ACTION_UP";
if (_action==1) { 
RDebugUtils.currentLine=5701650;
 //BA.debugLineNum = 5701650;BA.debugLine="If DragAndDrop.IsInitialized Then";
if (__ref._draganddrop.IsInitialized()) { 
RDebugUtils.currentLine=5701652;
 //BA.debugLineNum = 5701652;BA.debugLine="MoveToDropPosition(Y)";
__ref._movetodropposition(null,(int) (_y));
 }else 
{RDebugUtils.currentLine=5701653;
 //BA.debugLineNum = 5701653;BA.debugLine="Else If ModeCheck Then";
if (__ref._modecheck) { 
RDebugUtils.currentLine=5701655;
 //BA.debugLineNum = 5701655;BA.debugLine="For p = 0 To pnl.NumberOfViews - 1";
{
final int step21 = 1;
final int limit21 = (int) (_pnl.getNumberOfViews()-1);
for (_p = (int) (0) ; (step21 > 0 && _p <= limit21) || (step21 < 0 && _p >= limit21); _p = ((int)(0 + _p + step21)) ) {
RDebugUtils.currentLine=5701656;
 //BA.debugLineNum = 5701656;BA.debugLine="If IsCheckBox(pnl.GetView(p)) Then";
if (__ref._ischeckbox(null,_pnl.GetView(_p))) { 
RDebugUtils.currentLine=5701657;
 //BA.debugLineNum = 5701657;BA.debugLine="Dim chb As CheckBox";
_chb = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=5701658;
 //BA.debugLineNum = 5701658;BA.debugLine="chb = pnl.GetView(p)";
_chb.setObject((android.widget.CheckBox)(_pnl.GetView(_p).getObject()));
RDebugUtils.currentLine=5701659;
 //BA.debugLineNum = 5701659;BA.debugLine="chb.Checked = Not(chb.Checked)";
_chb.setChecked(__c.Not(_chb.getChecked()));
RDebugUtils.currentLine=5701660;
 //BA.debugLineNum = 5701660;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }};
 }else 
{RDebugUtils.currentLine=5701664;
 //BA.debugLineNum = 5701664;BA.debugLine="Else If Action = 2 Then '= ACTION_MOVE";
if (_action==2) { 
RDebugUtils.currentLine=5701665;
 //BA.debugLineNum = 5701665;BA.debugLine="If DragAndDrop.IsInitialized Then MoveDDPanel(Y)";
if (__ref._draganddrop.IsInitialized()) { 
__ref._moveddpanel(null,(int) (_y));};
 }}};
RDebugUtils.currentLine=5701667;
 //BA.debugLineNum = 5701667;BA.debugLine="LastY = Y";
__ref._lasty = (int) (_y);
RDebugUtils.currentLine=5701668;
 //BA.debugLineNum = 5701668;BA.debugLine="Return (sub_Click = \"\" AND sub_LongClick = \"\")";
if (true) return ((__ref._sub_click).equals("") && (__ref._sub_longclick).equals(""));
RDebugUtils.currentLine=5701669;
 //BA.debugLineNum = 5701669;BA.debugLine="End Sub";
return false;
}
public String  _removeitemat(com.bcleaner.clschecklist __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "removeitemat"))
	return (String) Debug.delegate(ba, "removeitemat", new Object[] {_position});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _removedheight = 0;
int _i = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub RemoveItemAt(Position As Int)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If sv.IsInitialized And Position < NumberOfItems";
if (__ref._sv.IsInitialized() && _position<__ref._numberofitems(null)) { 
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="pnl = sv.Panel.GetView(Position)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_position).getObject()));
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="If HasExtraContent And ExtendedItemID = pnl.Tag";
if (__ref._hasextracontent(null) && (__ref._extendeditemid(null)).equals(_pnl.getTag())) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="ExtensionIndex = -1";
__ref._extensionindex = (int) (-1);
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="ExtensionView.RemoveView";
__ref._extensionview.RemoveView();
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="ExtensionView = Null";
__ref._extensionview.setObject((android.view.View)(__c.Null));
 };
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="Dim RemovedHeight As Int";
_removedheight = 0;
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="RemovedHeight = pnl.Height";
_removedheight = _pnl.getHeight();
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="pnl.RemoveView";
_pnl.RemoveView();
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="For i = Position To sv.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = _position ; (step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12); _i = ((int)(0 + _i + step12)) ) {
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="pnl.Top = pnl.Top - RemovedHeight";
_pnl.setTop((int) (_pnl.getTop()-_removedheight));
 }
};
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="svHeight = svHeight - RemovedHeight";
__ref._svheight = (int) (__ref._svheight-_removedheight);
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="sv.Panel.Height = svHeight";
__ref._sv.getPanel().setHeight(__ref._svheight);
 };
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="End Sub";
return "";
}
public String  _removeitemid(com.bcleaner.clschecklist __ref,Object _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "removeitemid"))
	return (String) Debug.delegate(ba, "removeitemid", new Object[] {_id});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _i = 0;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub RemoveItemID(ID As Object)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="If sv.IsInitialized Then";
if (__ref._sv.IsInitialized()) { 
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="For i = 0 To sv.Panel.NumberOfViews - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._sv.getPanel().getNumberOfViews()-1);
for (_i = (int) (0) ; (step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3); _i = ((int)(0 + _i + step3)) ) {
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="If pnl.Tag = Null Then Continue";
if (_pnl.getTag()== null) { 
if (true) continue;};
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="If pnl.Tag = ID Then";
if ((_pnl.getTag()).equals(_id)) { 
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="RemoveItemAt(i)";
__ref._removeitemat(null,_i);
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="End Sub";
return "";
}
public String  _repaint(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.PanelWrapper _pnlitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "repaint"))
	return (String) Debug.delegate(ba, "repaint", new Object[] {_pnlitem});
boolean _extended = false;
anywheresoftware.b4a.objects.PanelWrapper _pnldivider = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Repaint(pnlItem As Panel)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim Extended As Boolean";
_extended = false;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Extended = HasExtraContent AND ExtendedItemID = p";
_extended = __ref._hasextracontent(null) && (__ref._extendeditemid(null)).equals(_pnlitem.getTag());
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="PaintBackground(pnlItem, Extended)";
__ref._paintbackground(null,_pnlitem,_extended);
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="If DividerSize > 0 Then";
if (__ref._dividersize>0) { 
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="Dim pnlDivider As Panel";
_pnldivider = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="If Extended Then";
if (_extended) { 
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="pnlDivider = pnlItem.GetView(pnlItem.NumberOfVi";
_pnldivider.setObject((android.view.ViewGroup)(_pnlitem.GetView((int) (_pnlitem.getNumberOfViews()-2)).getObject()));
 }else {
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="pnlDivider = pnlItem.GetView(pnlItem.NumberOfVi";
_pnldivider.setObject((android.view.ViewGroup)(_pnlitem.GetView((int) (_pnlitem.getNumberOfViews()-1)).getObject()));
 };
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="pnlDivider.Color = DividerColor";
_pnldivider.setColor(__ref._dividercolor);
 };
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="End Sub";
return "";
}
public String  _repaintallitems(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "repaintallitems"))
	return (String) Debug.delegate(ba, "repaintallitems", null);
int _i = 0;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub RepaintAllItems";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="For i = 0 To NumberOfItems - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (0) ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Repaint(sv.Panel.GetView(i))";
__ref._repaint(null,(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject())));
 }
};
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="End Sub";
return "";
}
public String  _replaceitem(com.bcleaner.clschecklist __ref,int _position,anywheresoftware.b4a.objects.PanelWrapper _newpanel,int _newheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "replaceitem"))
	return (String) Debug.delegate(ba, "replaceitem", new Object[] {_position,_newpanel,_newheight});
anywheresoftware.b4a.objects.PanelWrapper _oldpnl = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub ReplaceItem(Position As Int, NewPanel A";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If sv.IsInitialized And NewPanel.IsInitialized Th";
if (__ref._sv.IsInitialized() && _newpanel.IsInitialized()) { 
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="If HasExtraContent Then CollapseItem";
if (__ref._hasextracontent(null)) { 
__ref._collapseitem(null);};
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Dim OldPnl As Panel";
_oldpnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="OldPnl = sv.Panel.GetView(Position)";
_oldpnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_position).getObject()));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="NewPanel.Tag = OldPnl.Tag";
_newpanel.setTag(_oldpnl.getTag());
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="If NewHeight = -1 Then NewHeight = OldPnl.Height";
if (_newheight==-1) { 
_newheight = _oldpnl.getHeight();};
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="AddToSV(NewPanel, NewHeight, NewPanel.Tag <> Nul";
__ref._addtosv(null,_newpanel,_newheight,_newpanel.getTag()!= null);
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="RemoveItemAt(Position)";
__ref._removeitemat(null,_position);
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="MoveItem(NumberOfItems - 1, Position)";
__ref._moveitem(null,(int) (__ref._numberofitems(null)-1),_position);
 };
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="End Sub";
return "";
}
public String  _resizepanel(com.bcleaner.clschecklist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "resizepanel"))
	return (String) Debug.delegate(ba, "resizepanel", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub ResizePanel()";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="CollapseItem";
__ref._collapseitem(null);
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="sv.Panel.Height = svHeight";
__ref._sv.getPanel().setHeight(__ref._svheight);
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return "";
}
public String  _setonpaintlistener(com.bcleaner.clschecklist __ref,String _subname) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "setonpaintlistener"))
	return (String) Debug.delegate(ba, "setonpaintlistener", new Object[] {_subname});
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub SetOnPaintListener(SubName As String)";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="sub_Paint = SubName";
__ref._sub_paint = _subname;
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public String  _sortitems(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.collections.List _valuestosort,int _firstposition,int _lastposition,boolean _ascendingorder) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "sortitems"))
	return (String) Debug.delegate(ba, "sortitems", new Object[] {_valuestosort,_firstposition,_lastposition,_ascendingorder});
anywheresoftware.b4a.objects.collections.List _sortlist = null;
int _i = 0;
com.bcleaner.clschecklist._typsortdata _sortdata = null;
int _firsttosort = 0;
int _lasttosort = 0;
anywheresoftware.b4a.objects.collections.List _panellist = null;
int _totalheight = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub SortItems(ValuesToSort As List, FirstPo";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If ValuesToSort.Size < 2 Or FirstPosition = LastP";
if (_valuestosort.getSize()<2 || _firstposition==_lastposition) { 
if (true) return "";};
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="If LastPosition - FirstPosition + 1 <> ValuesToSo";
if (_lastposition-_firstposition+1!=_valuestosort.getSize()) { 
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Log(\"Mismatch: \" & ValuesToSort.Size & \" values";
__c.Log("Mismatch: "+BA.NumberToString(_valuestosort.getSize())+" values in ValuesToSort and "+BA.NumberToString((_lastposition-_firstposition+1))+" positions to sort");
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Dim SortList As List: SortList.Initialize";
_sortlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Dim SortList As List: SortList.Initialize";
_sortlist.Initialize();
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="For i = FirstPosition To LastPosition";
{
final int step8 = 1;
final int limit8 = _lastposition;
for (_i = _firstposition ; (step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8); _i = ((int)(0 + _i + step8)) ) {
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="Dim SortData As typSortData";
_sortdata = new com.bcleaner.clschecklist._typsortdata();
RDebugUtils.currentLine=3801097;
 //BA.debugLineNum = 3801097;BA.debugLine="SortData.Initialize";
_sortdata.Initialize();
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="SortData.Index = i";
_sortdata.Index = _i;
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="SortData.Value = ValuesToSort.Get(i - FirstPosit";
_sortdata.Value = _valuestosort.Get((int) (_i-_firstposition));
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="SortList.Add(SortData)";
_sortlist.Add((Object)(_sortdata));
 }
};
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="SortList.SortType(\"Value\", AscendingOrder)";
_sortlist.SortType("Value",_ascendingorder);
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="Dim FirstToSort, LastToSort As Int";
_firsttosort = 0;
_lasttosort = 0;
RDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="FirstToSort = -1";
_firsttosort = (int) (-1);
RDebugUtils.currentLine=3801108;
 //BA.debugLineNum = 3801108;BA.debugLine="LastToSort = -1";
_lasttosort = (int) (-1);
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="Dim PanelList As List: PanelList.Initialize";
_panellist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="Dim PanelList As List: PanelList.Initialize";
_panellist.Initialize();
RDebugUtils.currentLine=3801110;
 //BA.debugLineNum = 3801110;BA.debugLine="For i = 0 To FirstPosition - 1";
{
final int step21 = 1;
final int limit21 = (int) (_firstposition-1);
for (_i = (int) (0) ; (step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21); _i = ((int)(0 + _i + step21)) ) {
RDebugUtils.currentLine=3801111;
 //BA.debugLineNum = 3801111;BA.debugLine="PanelList.Add(sv.Panel.GetView(i))";
_panellist.Add((Object)(__ref._sv.getPanel().GetView(_i).getObject()));
 }
};
RDebugUtils.currentLine=3801113;
 //BA.debugLineNum = 3801113;BA.debugLine="For i = FirstPosition To LastPosition";
{
final int step24 = 1;
final int limit24 = _lastposition;
for (_i = _firstposition ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
RDebugUtils.currentLine=3801114;
 //BA.debugLineNum = 3801114;BA.debugLine="Dim SortData As typSortData";
_sortdata = new com.bcleaner.clschecklist._typsortdata();
RDebugUtils.currentLine=3801115;
 //BA.debugLineNum = 3801115;BA.debugLine="SortData = SortList.Get(i - FirstPosition)";
_sortdata = (com.bcleaner.clschecklist._typsortdata)(_sortlist.Get((int) (_i-_firstposition)));
RDebugUtils.currentLine=3801116;
 //BA.debugLineNum = 3801116;BA.debugLine="If SortData.Index <> i Then";
if (_sortdata.Index!=_i) { 
RDebugUtils.currentLine=3801117;
 //BA.debugLineNum = 3801117;BA.debugLine="If FirstToSort = -1 Then FirstToSort = i";
if (_firsttosort==-1) { 
_firsttosort = _i;};
RDebugUtils.currentLine=3801118;
 //BA.debugLineNum = 3801118;BA.debugLine="LastToSort = i";
_lasttosort = _i;
 };
RDebugUtils.currentLine=3801120;
 //BA.debugLineNum = 3801120;BA.debugLine="PanelList.Add(sv.Panel.GetView(SortData.Index))";
_panellist.Add((Object)(__ref._sv.getPanel().GetView(_sortdata.Index).getObject()));
 }
};
RDebugUtils.currentLine=3801122;
 //BA.debugLineNum = 3801122;BA.debugLine="If FirstToSort = -1 Then Return";
if (_firsttosort==-1) { 
if (true) return "";};
RDebugUtils.currentLine=3801123;
 //BA.debugLineNum = 3801123;BA.debugLine="For i = LastPosition + 1 To NumberOfItems - 1";
{
final int step34 = 1;
final int limit34 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (_lastposition+1) ; (step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34); _i = ((int)(0 + _i + step34)) ) {
RDebugUtils.currentLine=3801124;
 //BA.debugLineNum = 3801124;BA.debugLine="PanelList.Add(sv.Panel.GetView(i))";
_panellist.Add((Object)(__ref._sv.getPanel().GetView(_i).getObject()));
 }
};
RDebugUtils.currentLine=3801128;
 //BA.debugLineNum = 3801128;BA.debugLine="If HasExtraContent Then CollapseItem";
if (__ref._hasextracontent(null)) { 
__ref._collapseitem(null);};
RDebugUtils.currentLine=3801129;
 //BA.debugLineNum = 3801129;BA.debugLine="Dim TotalHeight As Int";
_totalheight = 0;
RDebugUtils.currentLine=3801130;
 //BA.debugLineNum = 3801130;BA.debugLine="Dim pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3801131;
 //BA.debugLineNum = 3801131;BA.debugLine="If FirstToSort > 0 Then";
if (_firsttosort>0) { 
RDebugUtils.currentLine=3801132;
 //BA.debugLineNum = 3801132;BA.debugLine="pnl = sv.Panel.GetView(FirstToSort - 1)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView((int) (_firsttosort-1)).getObject()));
RDebugUtils.currentLine=3801133;
 //BA.debugLineNum = 3801133;BA.debugLine="TotalHeight = pnl.Top + pnl.Height";
_totalheight = (int) (_pnl.getTop()+_pnl.getHeight());
 };
RDebugUtils.currentLine=3801135;
 //BA.debugLineNum = 3801135;BA.debugLine="For i = FirstToSort To LastToSort";
{
final int step44 = 1;
final int limit44 = _lasttosort;
for (_i = _firsttosort ; (step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44); _i = ((int)(0 + _i + step44)) ) {
RDebugUtils.currentLine=3801136;
 //BA.debugLineNum = 3801136;BA.debugLine="pnl = PanelList.Get(i)";
_pnl.setObject((android.view.ViewGroup)(_panellist.Get(_i)));
RDebugUtils.currentLine=3801137;
 //BA.debugLineNum = 3801137;BA.debugLine="pnl.Top = TotalHeight";
_pnl.setTop(_totalheight);
RDebugUtils.currentLine=3801138;
 //BA.debugLineNum = 3801138;BA.debugLine="TotalHeight = pnl.Top + pnl.Height";
_totalheight = (int) (_pnl.getTop()+_pnl.getHeight());
 }
};
RDebugUtils.currentLine=3801142;
 //BA.debugLineNum = 3801142;BA.debugLine="If LastToSort < NumberOfItems - FirstToSort Then";
if (_lasttosort<__ref._numberofitems(null)-_firsttosort) { 
RDebugUtils.currentLine=3801144;
 //BA.debugLineNum = 3801144;BA.debugLine="For i = 0 To LastToSort";
{
final int step50 = 1;
final int limit50 = _lasttosort;
for (_i = (int) (0) ; (step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50); _i = ((int)(0 + _i + step50)) ) {
RDebugUtils.currentLine=3801145;
 //BA.debugLineNum = 3801145;BA.debugLine="pnl = PanelList.Get(LastToSort - i)";
_pnl.setObject((android.view.ViewGroup)(_panellist.Get((int) (_lasttosort-_i))));
RDebugUtils.currentLine=3801146;
 //BA.debugLineNum = 3801146;BA.debugLine="pnl.SendToBack";
_pnl.SendToBack();
 }
};
 }else {
RDebugUtils.currentLine=3801150;
 //BA.debugLineNum = 3801150;BA.debugLine="For i = FirstToSort To NumberOfItems - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._numberofitems(null)-1);
for (_i = _firsttosort ; (step55 > 0 && _i <= limit55) || (step55 < 0 && _i >= limit55); _i = ((int)(0 + _i + step55)) ) {
RDebugUtils.currentLine=3801151;
 //BA.debugLineNum = 3801151;BA.debugLine="pnl = PanelList.Get(i)";
_pnl.setObject((android.view.ViewGroup)(_panellist.Get(_i)));
RDebugUtils.currentLine=3801152;
 //BA.debugLineNum = 3801152;BA.debugLine="pnl.BringToFront";
_pnl.BringToFront();
 }
};
 };
RDebugUtils.currentLine=3801155;
 //BA.debugLineNum = 3801155;BA.debugLine="End Sub";
return "";
}
public String  _startdraganddrop(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.PanelWrapper _pnl,String _subafterdrop) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "startdraganddrop"))
	return (String) Debug.delegate(ba, "startdraganddrop", new Object[] {_pnl,_subafterdrop});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub StartDragAndDrop(pnl As Panel, subAfter";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If Not(DragAndDrop.IsInitialized) Then";
if (__c.Not(__ref._draganddrop.IsInitialized())) { 
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If HasExtraContent Then CollapseItem";
if (__ref._hasextracontent(null)) { 
__ref._collapseitem(null);};
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="DragAndDropShadow.Initialize(\"\")";
__ref._draganddropshadow.Initialize(ba,"");
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="DragAndDropShadow.Color = Colors.ARGB(128, 128,";
__ref._draganddropshadow.setColor(__c.Colors.ARGB((int) (128),(int) (128),(int) (128),(int) (128)));
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="sv.Panel.AddView(DragAndDropShadow, pnl.Left, pn";
__ref._sv.getPanel().AddView((android.view.View)(__ref._draganddropshadow.getObject()),_pnl.getLeft(),_pnl.getTop(),_pnl.getWidth(),_pnl.getHeight());
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="DragAndDrop.Initialize(\"\")";
__ref._draganddrop.Initialize(ba,"");
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="DragAndDrop.SetBackgroundImage(ViewToBmp(pnl))";
__ref._draganddrop.SetBackgroundImage((android.graphics.Bitmap)(__ref._viewtobmp(null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_pnl.getObject()))).getObject()));
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="sv.Panel.AddView(DragAndDrop, pnl.Left, pnl.Top,";
__ref._sv.getPanel().AddView((android.view.View)(__ref._draganddrop.getObject()),_pnl.getLeft(),_pnl.getTop(),_pnl.getWidth(),_pnl.getHeight());
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="r.Target = DragAndDrop";
_r.Target = (Object)(__ref._draganddrop.getObject());
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="r.SetOnTouchListener(\"pnlSV_Touch\")";
_r.SetOnTouchListener(ba,"pnlSV_Touch");
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="OriginDDTop = pnl.Top";
__ref._originddtop = _pnl.getTop();
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="sub_AfterDrop = subAfterDrop";
__ref._sub_afterdrop = _subafterdrop;
 };
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _viewtobmp(com.bcleaner.clschecklist __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _myview) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "viewtobmp"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "viewtobmp", new Object[] {_myview});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _c = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r1 = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r2 = null;
Object[] _args = null;
String[] _types = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Private Sub ViewToBmp(MyView As View) As Bitmap";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="Dim c As Canvas";
_c = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="bmp.InitializeMutable(MyView.Width, MyView.Height";
_bmp.InitializeMutable(_myview.getWidth(),_myview.getHeight());
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="c.Initialize2(bmp)";
_c.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Dim r1, r2 As Reflector";
_r1 = new anywheresoftware.b4a.agraham.reflection.Reflection();
_r2 = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="r1.Target = MyView";
_r1.Target = (Object)(_myview.getObject());
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="r2.Target = c";
_r2.Target = (Object)(_c);
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="r2.Target = r2.GetField(\"canvas\")";
_r2.Target = _r2.GetField("canvas");
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="Dim args(1) As Object";
_args = new Object[(int) (1)];
{
int d0 = _args.length;
for (int i0 = 0;i0 < d0;i0++) {
_args[i0] = new Object();
}
}
;
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="Dim types(1) As String";
_types = new String[(int) (1)];
java.util.Arrays.fill(_types,"");
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="args(0) = r2.Target";
_args[(int) (0)] = _r2.Target;
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="types(0) = \"android.graphics.Canvas\"";
_types[(int) (0)] = "android.graphics.Canvas";
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="r1.RunMethod4(\"draw\", args, types)";
_r1.RunMethod4("draw",_args,_types);
RDebugUtils.currentLine=2555922;
 //BA.debugLineNum = 2555922;BA.debugLine="Return c.Bitmap";
if (true) return _c.getBitmap();
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="End Sub";
return null;
}
public String  _swapitems(com.bcleaner.clschecklist __ref,int _positem1,int _positem2) throws Exception{
__ref = this;
RDebugUtils.currentModule="clschecklist";
if (Debug.shouldDelegate(ba, "swapitems"))
	return (String) Debug.delegate(ba, "swapitems", new Object[] {_positem1,_positem2});
int _posmin = 0;
int _posmax = 0;
anywheresoftware.b4a.objects.PanelWrapper _pmin = null;
anywheresoftware.b4a.objects.PanelWrapper _pmax = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _tmptop = 0;
int _i = 0;
int _delta = 0;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub SwapItems(PosItem1 As Int, PosItem2 As";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="If sv.IsInitialized And PosItem1 <> PosItem2 Then";
if (__ref._sv.IsInitialized() && _positem1!=_positem2) { 
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If HasExtraContent Then CollapseItem";
if (__ref._hasextracontent(null)) { 
__ref._collapseitem(null);};
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim PosMin, PosMax As Int";
_posmin = 0;
_posmax = 0;
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="PosMin = Min(PosItem1, PosItem2)";
_posmin = (int) (__c.Min(_positem1,_positem2));
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="PosMax = Max(PosItem1, PosItem2)";
_posmax = (int) (__c.Max(_positem1,_positem2));
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="If PosMax > NumberOfItems - 1 Then";
if (_posmax>__ref._numberofitems(null)-1) { 
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Log(\"Error: position after the last item\")";
__c.Log("Error: position after the last item");
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="Dim pMin, pMax, pnl As Panel";
_pmin = new anywheresoftware.b4a.objects.PanelWrapper();
_pmax = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="pMin = sv.Panel.GetView(PosMin)";
_pmin.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_posmin).getObject()));
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="pMax = sv.Panel.GetView(PosMax)";
_pmax.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_posmax).getObject()));
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="Dim tmpTop As Int";
_tmptop = 0;
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="tmpTop = pMin.Top";
_tmptop = _pmin.getTop();
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="pMin.Top = pMax.Top";
_pmin.setTop(_pmax.getTop());
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="pMax.Top = tmpTop";
_pmax.setTop(_tmptop);
RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="If PosMax < NumberOfItems - PosMax Then";
if (_posmax<__ref._numberofitems(null)-_posmax) { 
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="pMin.SendToBack";
_pmin.SendToBack();
RDebugUtils.currentLine=3080215;
 //BA.debugLineNum = 3080215;BA.debugLine="For i = PosMin + 1 To PosMax - 1";
{
final int step19 = 1;
final int limit19 = (int) (_posmax-1);
for (_i = (int) (_posmin+1) ; (step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19); _i = ((int)(0 + _i + step19)) ) {
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="pnl = sv.Panel.GetView(PosMax - 1)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView((int) (_posmax-1)).getObject()));
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="pnl.SendToBack";
_pnl.SendToBack();
 }
};
RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="pMax.SendToBack";
_pmax.SendToBack();
RDebugUtils.currentLine=3080220;
 //BA.debugLineNum = 3080220;BA.debugLine="For i = 0 To PosMin - 1";
{
final int step24 = 1;
final int limit24 = (int) (_posmin-1);
for (_i = (int) (0) ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
RDebugUtils.currentLine=3080221;
 //BA.debugLineNum = 3080221;BA.debugLine="pnl = sv.Panel.GetView(PosMax)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_posmax).getObject()));
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="pnl.SendToBack";
_pnl.SendToBack();
 }
};
 }else {
RDebugUtils.currentLine=3080225;
 //BA.debugLineNum = 3080225;BA.debugLine="pMax.BringToFront";
_pmax.BringToFront();
RDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="For i = PosMin + 1 To PosMax - 1";
{
final int step30 = 1;
final int limit30 = (int) (_posmax-1);
for (_i = (int) (_posmin+1) ; (step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30); _i = ((int)(0 + _i + step30)) ) {
RDebugUtils.currentLine=3080227;
 //BA.debugLineNum = 3080227;BA.debugLine="pnl = sv.Panel.GetView(PosMin + 1)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView((int) (_posmin+1)).getObject()));
RDebugUtils.currentLine=3080228;
 //BA.debugLineNum = 3080228;BA.debugLine="pnl.BringToFront";
_pnl.BringToFront();
 }
};
RDebugUtils.currentLine=3080230;
 //BA.debugLineNum = 3080230;BA.debugLine="pMin.BringToFront";
_pmin.BringToFront();
RDebugUtils.currentLine=3080231;
 //BA.debugLineNum = 3080231;BA.debugLine="For i = PosMax + 1 To NumberOfItems - 1";
{
final int step35 = 1;
final int limit35 = (int) (__ref._numberofitems(null)-1);
for (_i = (int) (_posmax+1) ; (step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35); _i = ((int)(0 + _i + step35)) ) {
RDebugUtils.currentLine=3080232;
 //BA.debugLineNum = 3080232;BA.debugLine="pnl = sv.Panel.GetView(PosMin)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_posmin).getObject()));
RDebugUtils.currentLine=3080233;
 //BA.debugLineNum = 3080233;BA.debugLine="pnl.BringToFront";
_pnl.BringToFront();
 }
};
 };
RDebugUtils.currentLine=3080238;
 //BA.debugLineNum = 3080238;BA.debugLine="Dim Delta As Int";
_delta = 0;
RDebugUtils.currentLine=3080239;
 //BA.debugLineNum = 3080239;BA.debugLine="If pMin.Height <> pMax.Height Then";
if (_pmin.getHeight()!=_pmax.getHeight()) { 
RDebugUtils.currentLine=3080240;
 //BA.debugLineNum = 3080240;BA.debugLine="Delta = pMin.Height - pMax.Height";
_delta = (int) (_pmin.getHeight()-_pmax.getHeight());
RDebugUtils.currentLine=3080241;
 //BA.debugLineNum = 3080241;BA.debugLine="For i = PosMin + 1 To PosMax";
{
final int step43 = 1;
final int limit43 = _posmax;
for (_i = (int) (_posmin+1) ; (step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43); _i = ((int)(0 + _i + step43)) ) {
RDebugUtils.currentLine=3080242;
 //BA.debugLineNum = 3080242;BA.debugLine="pnl = sv.Panel.GetView(i)";
_pnl.setObject((android.view.ViewGroup)(__ref._sv.getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=3080243;
 //BA.debugLineNum = 3080243;BA.debugLine="pnl.Top = pnl.Top - Delta";
_pnl.setTop((int) (_pnl.getTop()-_delta));
 }
};
 };
 };
RDebugUtils.currentLine=3080247;
 //BA.debugLineNum = 3080247;BA.debugLine="End Sub";
return "";
}
}