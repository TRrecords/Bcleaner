package com.bcleaner;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clsexplorer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.bcleaner.clsexplorer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.bcleaner.clsexplorer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _typresult{
public boolean IsInitialized;
public boolean Canceled;
public String ChosenPath;
public String ChosenFile;
public void Initialize() {
IsInitialized = true;
Canceled = false;
ChosenPath = "";
ChosenFile = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public int _bordercolor = 0;
public int _backgroundcolor = 0;
public int _foldertextcolor = 0;
public int _filetextcolor1 = 0;
public int _filetextcolor2 = 0;
public int _dividercolor = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _dialogrect = null;
public boolean _fastscrollenabled = false;
public com.bcleaner.clsexplorer._typresult _selection = null;
public boolean _ellipsis = false;
public anywheresoftware.b4a.objects.ActivityWrapper _actecran = null;
public String _strchemin = "";
public anywheresoftware.b4a.objects.collections.List _lstfiltre = null;
public boolean _bonlyfolders = false;
public boolean _bvisualiser = false;
public boolean _bmultifolderselection = false;
public boolean _bmultifileselection = false;
public String _strbtnoktxt = "";
public anywheresoftware.b4a.objects.PanelWrapper _pnlmasque = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcadre = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlfiles = null;
public flm.b4a.scrollview2d.ScrollView2DWrapper _svfichiers = null;
public com.bcleaner.clschecklist _lstfichiers = null;
public int _itemheight = 0;
public anywheresoftware.b4a.objects.PanelWrapper _pnlvisu = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblvisu = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ivvisu = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcartouche = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edtfilename = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnok = null;
public boolean _waituntilok = false;
public anywheresoftware.b4a.objects.PanelWrapper _pnlrange = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldisplay = null;
public anywheresoftware.b4a.objects.AnimationWrapper _anim = null;
public anywheresoftware.b4a.objects.Timer _timeout = null;
public int _duration = 0;
public int _maxpos = 0;
public boolean _bignoreevent = false;
public boolean _busermovingpnl = false;
public boolean _bwaitforscroll = false;
public com.bcleaner.main _main = null;
public com.bcleaner.starter _starter = null;
public com.bcleaner.setanimation _setanimation = null;
public String  _addentry(com.bcleaner.clsexplorer __ref,int _id,String _text1,String _text2,boolean _withcheckbox) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "addentry"))
	return (String) Debug.delegate(ba, "addentry", new Object[] {_id,_text1,_text2,_withcheckbox});
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _margin = 0;
int _posx = 0;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
int _largeurlabel = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl2 = null;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub AddEntry(ID As Int, Text1 As String, T";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Dim pnl As Panel: pnl.Initialize(\"\")";
_pnl.Initialize(ba,"");
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Dim Margin As Int: Margin = 5dip";
_margin = 0;
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Dim Margin As Int: Margin = 5dip";
_margin = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Dim PosX As Int: PosX = Margin";
_posx = 0;
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Dim PosX As Int: PosX = Margin";
_posx = _margin;
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Dim chk As CheckBox";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="If WithCheckbox Then";
if (_withcheckbox) { 
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="chk.Initialize(\"lstMulti\")";
_chk.Initialize(ba,"lstMulti");
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="pnl.AddView(chk, PosX, 0, 40dip, itemHeight)";
_pnl.AddView((android.view.View)(_chk.getObject()),_posx,(int) (0),__c.DipToCurrent((int) (40)),__ref._itemheight);
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="PosX = chk.Width + chk.Left";
_posx = (int) (_chk.getWidth()+_chk.getLeft());
 };
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="Dim LargeurLabel As Int";
_largeurlabel = 0;
RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="LargeurLabel = svFichiers.Width - PosX - Margin";
_largeurlabel = (int) (__ref._svfichiers.getWidth()-_posx-_margin);
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
_lbl1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="Dim lbl1 As Label: lbl1.Initialize(\"\")";
_lbl1.Initialize(ba,"");
RDebugUtils.currentLine=9240591;
 //BA.debugLineNum = 9240591;BA.debugLine="lbl1.Gravity = Gravity.CENTER_VERTICAL";
_lbl1.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=9240592;
 //BA.debugLineNum = 9240592;BA.debugLine="lbl1.Text = Text1";
_lbl1.setText(BA.ObjectToCharSequence(_text1));
RDebugUtils.currentLine=9240593;
 //BA.debugLineNum = 9240593;BA.debugLine="lbl1.TextSize = 18";
_lbl1.setTextSize((float) (18));
RDebugUtils.currentLine=9240594;
 //BA.debugLineNum = 9240594;BA.debugLine="If Text2 = \"\" Then";
if ((_text2).equals("")) { 
RDebugUtils.currentLine=9240596;
 //BA.debugLineNum = 9240596;BA.debugLine="lbl1.TextColor = FolderTextColor";
_lbl1.setTextColor(__ref._foldertextcolor);
RDebugUtils.currentLine=9240597;
 //BA.debugLineNum = 9240597;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT_BOLD";
_lbl1.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=9240598;
 //BA.debugLineNum = 9240598;BA.debugLine="pnl.AddView(lbl1, PosX, 2dip, LargeurLabel, item";
_pnl.AddView((android.view.View)(_lbl1.getObject()),_posx,__c.DipToCurrent((int) (2)),_largeurlabel,(int) (__ref._itemheight-__c.DipToCurrent((int) (4))));
 }else {
RDebugUtils.currentLine=9240601;
 //BA.debugLineNum = 9240601;BA.debugLine="lbl1.TextColor = FileTextColor1";
_lbl1.setTextColor(__ref._filetextcolor1);
RDebugUtils.currentLine=9240602;
 //BA.debugLineNum = 9240602;BA.debugLine="lbl1.Typeface = Typeface.DEFAULT";
_lbl1.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=9240603;
 //BA.debugLineNum = 9240603;BA.debugLine="pnl.AddView(lbl1, PosX, 2dip, LargeurLabel, Bit.";
_pnl.AddView((android.view.View)(_lbl1.getObject()),_posx,__c.DipToCurrent((int) (2)),_largeurlabel,__c.Bit.ShiftRight(__ref._itemheight,(int) (1)));
RDebugUtils.currentLine=9240605;
 //BA.debugLineNum = 9240605;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
_lbl2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9240605;
 //BA.debugLineNum = 9240605;BA.debugLine="Dim lbl2 As Label: lbl2.Initialize(\"\")";
_lbl2.Initialize(ba,"");
RDebugUtils.currentLine=9240606;
 //BA.debugLineNum = 9240606;BA.debugLine="lbl2.Gravity = Gravity.TOP";
_lbl2.setGravity(__c.Gravity.TOP);
RDebugUtils.currentLine=9240607;
 //BA.debugLineNum = 9240607;BA.debugLine="lbl2.Text = Text2";
_lbl2.setText(BA.ObjectToCharSequence(_text2));
RDebugUtils.currentLine=9240608;
 //BA.debugLineNum = 9240608;BA.debugLine="lbl2.TextColor = FileTextColor2";
_lbl2.setTextColor(__ref._filetextcolor2);
RDebugUtils.currentLine=9240609;
 //BA.debugLineNum = 9240609;BA.debugLine="lbl2.TextSize = 14";
_lbl2.setTextSize((float) (14));
RDebugUtils.currentLine=9240610;
 //BA.debugLineNum = 9240610;BA.debugLine="lbl2.Typeface = Typeface.DEFAULT";
_lbl2.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=9240611;
 //BA.debugLineNum = 9240611;BA.debugLine="pnl.AddView(lbl2, PosX, lbl1.Top + lbl1.Height,";
_pnl.AddView((android.view.View)(_lbl2.getObject()),_posx,(int) (_lbl1.getTop()+_lbl1.getHeight()),_largeurlabel,(int) (__ref._itemheight-_lbl1.getTop()-_lbl1.getHeight()));
 };
RDebugUtils.currentLine=9240614;
 //BA.debugLineNum = 9240614;BA.debugLine="If Ellipsis Then";
if (__ref._ellipsis) { 
RDebugUtils.currentLine=9240615;
 //BA.debugLineNum = 9240615;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=9240616;
 //BA.debugLineNum = 9240616;BA.debugLine="r.Target = lbl1";
_r.Target = (Object)(_lbl1.getObject());
RDebugUtils.currentLine=9240617;
 //BA.debugLineNum = 9240617;BA.debugLine="r.RunMethod2(\"setLines\", 1, \"java.lang.int\")";
_r.RunMethod2("setLines",BA.NumberToString(1),"java.lang.int");
RDebugUtils.currentLine=9240618;
 //BA.debugLineNum = 9240618;BA.debugLine="r.RunMethod2(\"setHorizontallyScrolling\", True, \"";
_r.RunMethod2("setHorizontallyScrolling",BA.ObjectToString(__c.True),"java.lang.boolean");
RDebugUtils.currentLine=9240619;
 //BA.debugLineNum = 9240619;BA.debugLine="r.RunMethod2(\"setEllipsize\", \"MIDDLE\", \"android.";
_r.RunMethod2("setEllipsize","MIDDLE","android.text.TextUtils$TruncateAt");
 };
RDebugUtils.currentLine=9240622;
 //BA.debugLineNum = 9240622;BA.debugLine="lstFichiers.AddCustomItem(ID, pnl, itemHeight)";
__ref._lstfichiers._addcustomitem(null,(Object)(_id),_pnl,__ref._itemheight);
RDebugUtils.currentLine=9240623;
 //BA.debugLineNum = 9240623;BA.debugLine="End Sub";
return "";
}
public String  _afficherimage(com.bcleaner.clsexplorer __ref,String _image) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "afficherimage"))
	return (String) Debug.delegate(ba, "afficherimage", new Object[] {_image});
int _marge = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
float _ratiobmp = 0f;
float _ratioimg = 0f;
float _diviseur = 0f;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub AfficherImage(Image As String)";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim Marge As Int: Marge = 2dip";
_marge = 0;
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim Marge As Int: Marge = 2dip";
_marge = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="pnlVisu.Initialize(\"\")";
__ref._pnlvisu.Initialize(ba,"");
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="pnlVisu.Color = Colors.Transparent";
__ref._pnlvisu.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="ivVisu.Initialize(\"\")";
__ref._ivvisu.Initialize(ba,"");
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="pnlVisu.AddView(ivVisu, 0, 0, pnlFiles.Width - (2";
__ref._pnlvisu.AddView((android.view.View)(__ref._ivvisu.getObject()),(int) (0),(int) (0),(int) (__ref._pnlfiles.getWidth()-(2*_marge)),(int) (__ref._pnlfiles.getHeight()-(2*_marge)));
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="lblVisu.Initialize(\"\")";
__ref._lblvisu.Initialize(ba,"");
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="lblVisu.Text = \"Please wait...\"";
__ref._lblvisu.setText(BA.ObjectToCharSequence("Please wait..."));
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="lblVisu.TextColor = FileTextColor1";
__ref._lblvisu.setTextColor(__ref._filetextcolor1);
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="lblVisu.TextSize = 18";
__ref._lblvisu.setTextSize((float) (18));
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="lblVisu.Typeface = Typeface.DEFAULT_BOLD";
__ref._lblvisu.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=10158091;
 //BA.debugLineNum = 10158091;BA.debugLine="pnlVisu.AddView(lblVisu, 10dip, 10dip, pnlFiles.W";
__ref._pnlvisu.AddView((android.view.View)(__ref._lblvisu.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),(int) (__ref._pnlfiles.getWidth()-(2*_marge)-__c.DipToCurrent((int) (20))),__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=10158092;
 //BA.debugLineNum = 10158092;BA.debugLine="pnlFiles.AddView(pnlVisu, Marge, Marge, pnlFiles.";
__ref._pnlfiles.AddView((android.view.View)(__ref._pnlvisu.getObject()),_marge,_marge,(int) (__ref._pnlfiles.getWidth()-(2*_marge)),(int) (__ref._pnlfiles.getHeight()-(2*_marge)));
RDebugUtils.currentLine=10158093;
 //BA.debugLineNum = 10158093;BA.debugLine="svFichiers.Visible = False";
__ref._svfichiers.setVisible(__c.False);
RDebugUtils.currentLine=10158094;
 //BA.debugLineNum = 10158094;BA.debugLine="DoEvents: DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=10158094;
 //BA.debugLineNum = 10158094;BA.debugLine="DoEvents: DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=10158095;
 //BA.debugLineNum = 10158095;BA.debugLine="Try";
try {RDebugUtils.currentLine=10158096;
 //BA.debugLineNum = 10158096;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10158097;
 //BA.debugLineNum = 10158097;BA.debugLine="bmp.InitializeSample(strChemin, Image, pnlVisu.W";
_bmp.InitializeSample(__ref._strchemin,_image,__ref._pnlvisu.getWidth(),__ref._pnlvisu.getHeight());
RDebugUtils.currentLine=10158098;
 //BA.debugLineNum = 10158098;BA.debugLine="If bmp.Height <= pnlVisu.Height AND bmp.Width <=";
if (_bmp.getHeight()<=__ref._pnlvisu.getHeight() && _bmp.getWidth()<=__ref._pnlvisu.getWidth()) { 
RDebugUtils.currentLine=10158100;
 //BA.debugLineNum = 10158100;BA.debugLine="ivVisu.Gravity = Gravity.CENTER";
__ref._ivvisu.setGravity(__c.Gravity.CENTER);
 }else {
RDebugUtils.currentLine=10158102;
 //BA.debugLineNum = 10158102;BA.debugLine="Dim RatioBmp, RatioImg As Float";
_ratiobmp = 0f;
_ratioimg = 0f;
RDebugUtils.currentLine=10158103;
 //BA.debugLineNum = 10158103;BA.debugLine="RatioBmp = bmp.Width / bmp.Height";
_ratiobmp = (float) (_bmp.getWidth()/(double)_bmp.getHeight());
RDebugUtils.currentLine=10158104;
 //BA.debugLineNum = 10158104;BA.debugLine="RatioImg = pnlVisu.Width / pnlVisu.Height";
_ratioimg = (float) (__ref._pnlvisu.getWidth()/(double)__ref._pnlvisu.getHeight());
RDebugUtils.currentLine=10158105;
 //BA.debugLineNum = 10158105;BA.debugLine="If NumberFormat(RatioBmp, 1, 2) = NumberFormat(";
if ((__c.NumberFormat(_ratiobmp,(int) (1),(int) (2))).equals(__c.NumberFormat(_ratioimg,(int) (1),(int) (2)))) { 
RDebugUtils.currentLine=10158107;
 //BA.debugLineNum = 10158107;BA.debugLine="ivVisu.Gravity = Gravity.FILL";
__ref._ivvisu.setGravity(__c.Gravity.FILL);
 }else {
RDebugUtils.currentLine=10158110;
 //BA.debugLineNum = 10158110;BA.debugLine="Dim Diviseur As Float";
_diviseur = 0f;
RDebugUtils.currentLine=10158111;
 //BA.debugLineNum = 10158111;BA.debugLine="If RatioImg > RatioBmp Then";
if (_ratioimg>_ratiobmp) { 
RDebugUtils.currentLine=10158112;
 //BA.debugLineNum = 10158112;BA.debugLine="Diviseur = bmp.Height / pnlVisu.Height";
_diviseur = (float) (_bmp.getHeight()/(double)__ref._pnlvisu.getHeight());
RDebugUtils.currentLine=10158113;
 //BA.debugLineNum = 10158113;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(bmp.Width";
_bmp = __ref._createscaledbitmap(null,_bmp,(int) (__c.Round(_bmp.getWidth()/(double)_diviseur/(double)__c.Density)),(int) (__c.Round(__ref._pnlvisu.getHeight()/(double)__c.Density)));
 }else {
RDebugUtils.currentLine=10158116;
 //BA.debugLineNum = 10158116;BA.debugLine="Diviseur = bmp.Width / pnlVisu.Width";
_diviseur = (float) (_bmp.getWidth()/(double)__ref._pnlvisu.getWidth());
RDebugUtils.currentLine=10158117;
 //BA.debugLineNum = 10158117;BA.debugLine="bmp = CreateScaledBitmap(bmp, Round(pnlVisu.W";
_bmp = __ref._createscaledbitmap(null,_bmp,(int) (__c.Round(__ref._pnlvisu.getWidth()/(double)__c.Density)),(int) (__c.Round(_bmp.getHeight()/(double)_diviseur/(double)__c.Density)));
 };
RDebugUtils.currentLine=10158120;
 //BA.debugLineNum = 10158120;BA.debugLine="ivVisu.Gravity = Gravity.NO_GRAVITY";
__ref._ivvisu.setGravity(__c.Gravity.NO_GRAVITY);
 };
 };
RDebugUtils.currentLine=10158123;
 //BA.debugLineNum = 10158123;BA.debugLine="ivVisu.Bitmap = bmp";
__ref._ivvisu.setBitmap((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=10158124;
 //BA.debugLineNum = 10158124;BA.debugLine="lblVisu.Text = \"\"";
__ref._lblvisu.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10158125;
 //BA.debugLineNum = 10158125;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10158126;
 //BA.debugLineNum = 10158126;BA.debugLine="r.Target = pnlVisu";
_r.Target = (Object)(__ref._pnlvisu.getObject());
RDebugUtils.currentLine=10158127;
 //BA.debugLineNum = 10158127;BA.debugLine="r.SetOnClickListener(\"pnlVisu_Close\") 'We cannot";
_r.SetOnClickListener(ba,"pnlVisu_Close");
 } 
       catch (Exception e46) {
			ba.setLastException(e46);RDebugUtils.currentLine=10158129;
 //BA.debugLineNum = 10158129;BA.debugLine="Msgbox(LastException.Message, \"Oooops\")";
__c.Msgbox(BA.ObjectToCharSequence(__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Oooops"),ba);
RDebugUtils.currentLine=10158130;
 //BA.debugLineNum = 10158130;BA.debugLine="pnlVisu_Close(Null)";
__ref._pnlvisu_close(null,__c.Null);
 };
RDebugUtils.currentLine=10158132;
 //BA.debugLineNum = 10158132;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _createscaledbitmap(com.bcleaner.clsexplorer __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _original,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "createscaledbitmap"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "createscaledbitmap", new Object[] {_original,_width,_height});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub CreateScaledBitmap(Original As Bitmap,";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="b = r.RunStaticMethod(\"android.graphics.Bitmap\",";
_b.setObject((android.graphics.Bitmap)(_r.RunStaticMethod("android.graphics.Bitmap","createScaledBitmap",new Object[]{(Object)(_original.getObject()),(Object)(_width),(Object)(_height),(Object)(__c.True)},new String[]{"android.graphics.Bitmap","java.lang.int","java.lang.int","java.lang.boolean"})));
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="End Sub";
return null;
}
public String  _pnlvisu_close(com.bcleaner.clsexplorer __ref,Object _viewtag) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "pnlvisu_close"))
	return (String) Debug.delegate(ba, "pnlvisu_close", new Object[] {_viewtag});
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub pnlVisu_Close(ViewTag As Object)";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="svFichiers.Visible = True";
__ref._svfichiers.setVisible(__c.True);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="pnlVisu.RemoveView";
__ref._pnlvisu.RemoveView();
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="pnlVisu = Null";
__ref._pnlvisu.setObject((android.view.ViewGroup)(__c.Null));
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="End Sub";
return "";
}
public String  _affichertexte(com.bcleaner.clsexplorer __ref,String _texte) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "affichertexte"))
	return (String) Debug.delegate(ba, "affichertexte", new Object[] {_texte});
int _marge = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _contenu = null;
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _reader = null;
String _ligne = "";
int _cpt = 0;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub AfficherTexte(Texte As String)";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim Marge As Int: Marge = 2dip";
_marge = 0;
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim Marge As Int: Marge = 2dip";
_marge = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="pnlVisu.Initialize(\"\")";
__ref._pnlvisu.Initialize(ba,"");
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="lblVisu.Initialize(\"\")";
__ref._lblvisu.Initialize(ba,"");
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="pnlVisu.AddView(lblVisu, 10dip, 10dip, pnlFiles.W";
__ref._pnlvisu.AddView((android.view.View)(__ref._lblvisu.getObject()),__c.DipToCurrent((int) (10)),__c.DipToCurrent((int) (10)),(int) (__ref._pnlfiles.getWidth()-(2*_marge)-__c.DipToCurrent((int) (20))),(int) (__ref._pnlfiles.getHeight()-(2*_marge)-__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="pnlFiles.AddView(pnlVisu, Marge, Marge, pnlFiles.";
__ref._pnlfiles.AddView((android.view.View)(__ref._pnlvisu.getObject()),_marge,_marge,(int) (__ref._pnlfiles.getWidth()-(2*_marge)),(int) (__ref._pnlfiles.getHeight()-(2*_marge)));
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="pnlVisu.Color = Colors.Transparent";
__ref._pnlvisu.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="svFichiers.Visible = False";
__ref._svfichiers.setVisible(__c.False);
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="lblVisu.TextColor = FileTextColor1";
__ref._lblvisu.setTextColor(__ref._filetextcolor1);
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="lblVisu.TextSize = 16";
__ref._lblvisu.setTextSize((float) (16));
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="lblVisu.Typeface = Typeface.DEFAULT";
__ref._lblvisu.setTypeface(__c.Typeface.DEFAULT);
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="Try";
try {RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="Dim Contenu As StringBuilder: Contenu.Initialize";
_contenu = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="Dim Contenu As StringBuilder: Contenu.Initialize";
_contenu.Initialize();
RDebugUtils.currentLine=10289165;
 //BA.debugLineNum = 10289165;BA.debugLine="Dim Reader As TextReader, Ligne As String, Cpt A";
_reader = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
_ligne = "";
_cpt = 0;
RDebugUtils.currentLine=10289166;
 //BA.debugLineNum = 10289166;BA.debugLine="Reader.Initialize(File.OpenInput(strChemin, Text";
_reader.Initialize((java.io.InputStream)(__c.File.OpenInput(__ref._strchemin,_texte).getObject()));
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="Ligne = Reader.ReadLine";
_ligne = _reader.ReadLine();
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="Do While Ligne <> Null";
while (_ligne!= null) {
RDebugUtils.currentLine=10289169;
 //BA.debugLineNum = 10289169;BA.debugLine="Cpt = Cpt + 1";
_cpt = (int) (_cpt+1);
RDebugUtils.currentLine=10289170;
 //BA.debugLineNum = 10289170;BA.debugLine="If Cpt > 50 Then";
if (_cpt>50) { 
RDebugUtils.currentLine=10289171;
 //BA.debugLineNum = 10289171;BA.debugLine="Contenu.Append(\"--- Lines after 50 are skipped";
_contenu.Append("--- Lines after 50 are skipped ---");
RDebugUtils.currentLine=10289172;
 //BA.debugLineNum = 10289172;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=10289174;
 //BA.debugLineNum = 10289174;BA.debugLine="Contenu.Append(Ligne).Append(CRLF)";
_contenu.Append(_ligne).Append(__c.CRLF);
RDebugUtils.currentLine=10289175;
 //BA.debugLineNum = 10289175;BA.debugLine="Ligne = Reader.ReadLine";
_ligne = _reader.ReadLine();
 }
;
RDebugUtils.currentLine=10289177;
 //BA.debugLineNum = 10289177;BA.debugLine="Reader.Close";
_reader.Close();
RDebugUtils.currentLine=10289178;
 //BA.debugLineNum = 10289178;BA.debugLine="lblVisu.Text = Contenu";
__ref._lblvisu.setText(BA.ObjectToCharSequence(_contenu.getObject()));
RDebugUtils.currentLine=10289179;
 //BA.debugLineNum = 10289179;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10289180;
 //BA.debugLineNum = 10289180;BA.debugLine="r.Target = pnlVisu";
_r.Target = (Object)(__ref._pnlvisu.getObject());
RDebugUtils.currentLine=10289181;
 //BA.debugLineNum = 10289181;BA.debugLine="r.SetOnClickListener(\"pnlVisu_Close\") 'We cannot";
_r.SetOnClickListener(ba,"pnlVisu_Close");
 } 
       catch (Exception e33) {
			ba.setLastException(e33);RDebugUtils.currentLine=10289183;
 //BA.debugLineNum = 10289183;BA.debugLine="Msgbox(LastException.Message, \"Oooops\")";
__c.Msgbox(BA.ObjectToCharSequence(__c.LastException(ba).getMessage()),BA.ObjectToCharSequence("Oooops"),ba);
RDebugUtils.currentLine=10289184;
 //BA.debugLineNum = 10289184;BA.debugLine="Reader.Close";
_reader.Close();
RDebugUtils.currentLine=10289185;
 //BA.debugLineNum = 10289185;BA.debugLine="pnlVisu_Close(Null)";
__ref._pnlvisu_close(null,__c.Null);
 };
RDebugUtils.currentLine=10289187;
 //BA.debugLineNum = 10289187;BA.debugLine="End Sub";
return "";
}
public String  _anim_animationend(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "anim_animationend"))
	return (String) Debug.delegate(ba, "anim_animationend", null);
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub Anim_AnimationEnd";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="pnlRange.Visible = False";
__ref._pnlrange.setVisible(__c.False);
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return "";
}
public String  _btnok_click(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "btnok_click"))
	return (String) Debug.delegate(ba, "btnok_click", null);
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub btnOK_Click";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Selection.Canceled = False";
__ref._selection.Canceled = __c.False;
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="If bOnlyFolders Then";
if (__ref._bonlyfolders) { 
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="If edtFilename.Text = \"\" Then";
if ((__ref._edtfilename.getText()).equals("")) { 
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Selection.ChosenPath = strChemin";
__ref._selection.ChosenPath = __ref._strchemin;
 }else {
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Selection.ChosenPath = edtFilename.Text";
__ref._selection.ChosenPath = __ref._edtfilename.getText();
 };
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Selection.ChosenFile = \"\"";
__ref._selection.ChosenFile = "";
 }else {
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Selection.ChosenPath = strChemin";
__ref._selection.ChosenPath = __ref._strchemin;
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="Selection.ChosenFile = edtFilename.Text";
__ref._selection.ChosenFile = __ref._edtfilename.getText();
 };
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="WaitUntilOK = False";
__ref._waituntilok = __c.False;
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="End Sub";
return "";
}
public int  _calcnewtop(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "calcnewtop"))
	return (Integer) Debug.delegate(ba, "calcnewtop", null);
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub CalcNewTop As Int";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Return (svFichiers.VerticalScrollPosition / (svFi";
if (true) return (int) ((__ref._svfichiers.getVerticalScrollPosition()/(double)(__ref._svfichiers.getPanel().getHeight()-__ref._svfichiers.getHeight())*__ref._maxpos));
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Type typResult(Canceled As Boolean, ChosenPath As";
;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Public BorderColor, BackgroundColor As Int";
_bordercolor = 0;
_backgroundcolor = 0;
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="Public FolderTextColor As Int";
_foldertextcolor = 0;
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="Public FileTextColor1, FileTextColor2 As Int";
_filetextcolor1 = 0;
_filetextcolor2 = 0;
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Public DividerColor As Int";
_dividercolor = 0;
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="Public DialogRect As Rect";
_dialogrect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="Public FastScrollEnabled As Boolean";
_fastscrollenabled = false;
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="Public Selection As typResult";
_selection = new com.bcleaner.clsexplorer._typresult();
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="Public Ellipsis As Boolean";
_ellipsis = false;
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="Private actEcran As Activity";
_actecran = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="Private strChemin As String";
_strchemin = "";
RDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="Private lstFiltre As List";
_lstfiltre = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="Private bOnlyFolders As Boolean";
_bonlyfolders = false;
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="Private bVisualiser As Boolean";
_bvisualiser = false;
RDebugUtils.currentLine=8978448;
 //BA.debugLineNum = 8978448;BA.debugLine="Private bMultiFolderSelection As Boolean";
_bmultifolderselection = false;
RDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="Private bMultiFileSelection As Boolean";
_bmultifileselection = false;
RDebugUtils.currentLine=8978450;
 //BA.debugLineNum = 8978450;BA.debugLine="Private strBtnOKTxt As String";
_strbtnoktxt = "";
RDebugUtils.currentLine=8978452;
 //BA.debugLineNum = 8978452;BA.debugLine="Private pnlMasque As Panel";
_pnlmasque = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8978453;
 //BA.debugLineNum = 8978453;BA.debugLine="Private pnlCadre As Panel";
_pnlcadre = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8978454;
 //BA.debugLineNum = 8978454;BA.debugLine="Private pnlFiles As Panel";
_pnlfiles = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8978455;
 //BA.debugLineNum = 8978455;BA.debugLine="Private svFichiers As ScrollView2D";
_svfichiers = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=8978456;
 //BA.debugLineNum = 8978456;BA.debugLine="Private lstFichiers As ClsCheckList";
_lstfichiers = new com.bcleaner.clschecklist();
RDebugUtils.currentLine=8978457;
 //BA.debugLineNum = 8978457;BA.debugLine="Private itemHeight As Int: itemHeight = 55dip";
_itemheight = 0;
RDebugUtils.currentLine=8978457;
 //BA.debugLineNum = 8978457;BA.debugLine="Private itemHeight As Int: itemHeight = 55dip";
__ref._itemheight = __c.DipToCurrent((int) (55));
RDebugUtils.currentLine=8978458;
 //BA.debugLineNum = 8978458;BA.debugLine="Private pnlVisu As Panel";
_pnlvisu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8978459;
 //BA.debugLineNum = 8978459;BA.debugLine="Private lblVisu As Label";
_lblvisu = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8978460;
 //BA.debugLineNum = 8978460;BA.debugLine="Private ivVisu As ImageView";
_ivvisu = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=8978461;
 //BA.debugLineNum = 8978461;BA.debugLine="Private pnlCartouche As Panel";
_pnlcartouche = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8978462;
 //BA.debugLineNum = 8978462;BA.debugLine="Private edtFilename As EditText";
_edtfilename = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8978463;
 //BA.debugLineNum = 8978463;BA.debugLine="Private btnOK As Button";
_btnok = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=8978464;
 //BA.debugLineNum = 8978464;BA.debugLine="Private WaitUntilOK As Boolean";
_waituntilok = false;
RDebugUtils.currentLine=8978466;
 //BA.debugLineNum = 8978466;BA.debugLine="Private pnlRange As Panel";
_pnlrange = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8978467;
 //BA.debugLineNum = 8978467;BA.debugLine="Private pnlDisplay As Panel";
_pnldisplay = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8978468;
 //BA.debugLineNum = 8978468;BA.debugLine="Private Anim As Animation";
_anim = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=8978469;
 //BA.debugLineNum = 8978469;BA.debugLine="Private TimeOut As Timer";
_timeout = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=8978470;
 //BA.debugLineNum = 8978470;BA.debugLine="Private Duration As Int";
_duration = 0;
RDebugUtils.currentLine=8978471;
 //BA.debugLineNum = 8978471;BA.debugLine="Private MaxPos As Int";
_maxpos = 0;
RDebugUtils.currentLine=8978472;
 //BA.debugLineNum = 8978472;BA.debugLine="Private bIgnoreEvent As Boolean";
_bignoreevent = false;
RDebugUtils.currentLine=8978473;
 //BA.debugLineNum = 8978473;BA.debugLine="Private bUserMovingPnl As Boolean";
_busermovingpnl = false;
RDebugUtils.currentLine=8978474;
 //BA.debugLineNum = 8978474;BA.debugLine="Private bWaitForScroll As Boolean";
_bwaitforscroll = false;
RDebugUtils.currentLine=8978475;
 //BA.debugLineNum = 8978475;BA.debugLine="End Sub";
return "";
}
public String  _commonexplorer(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "commonexplorer"))
	return (String) Debug.delegate(ba, "commonexplorer", null);
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub CommonExplorer";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="If FastScrollEnabled Then InitializeScrollPanel";
if (__ref._fastscrollenabled) { 
__ref._initializescrollpanel(null);};
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Selection.Canceled = True";
__ref._selection.Canceled = __c.True;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Selection.ChosenPath = \"\"";
__ref._selection.ChosenPath = "";
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Selection.ChosenFile = \"\"";
__ref._selection.ChosenFile = "";
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="edtFilename.RequestFocus";
__ref._edtfilename.RequestFocus();
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Do While WaitUntilOK";
while (__ref._waituntilok) {
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="DoEvents";
__c.DoEvents();
 }
;
RDebugUtils.currentLine=9633805;
 //BA.debugLineNum = 9633805;BA.debugLine="pnlMasque.RemoveView";
__ref._pnlmasque.RemoveView();
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="pnlMasque = Null";
__ref._pnlmasque.setObject((android.view.ViewGroup)(__c.Null));
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="End Sub";
return "";
}
public String  _initializescrollpanel(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "initializescrollpanel"))
	return (String) Debug.delegate(ba, "initializescrollpanel", null);
int _spwidth = 0;
int _spheight = 0;
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub InitializeScrollPanel";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim spWidth As Int = 64dip";
_spwidth = __c.DipToCurrent((int) (64));
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Dim spHeight As Int = 52dip";
_spheight = __c.DipToCurrent((int) (52));
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="pnlRange.Initialize(\"\")";
__ref._pnlrange.Initialize(ba,"");
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="pnlFiles.AddView(pnlRange, svFichiers.Left + svFi";
__ref._pnlfiles.AddView((android.view.View)(__ref._pnlrange.getObject()),(int) (__ref._svfichiers.getLeft()+__ref._svfichiers.getWidth()-_spwidth),__ref._svfichiers.getTop(),_spwidth,__ref._svfichiers.getHeight());
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="pnlRange.Visible = False";
__ref._pnlrange.setVisible(__c.False);
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="r.Target = pnlRange";
_r.Target = (Object)(__ref._pnlrange.getObject());
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="r.SetOnTouchListener(\"SP_Touch\")";
_r.SetOnTouchListener(ba,"SP_Touch");
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="pnlDisplay.Initialize(\"\")";
__ref._pnldisplay.Initialize(ba,"");
RDebugUtils.currentLine=10616844;
 //BA.debugLineNum = 10616844;BA.debugLine="pnlRange.AddView(pnlDisplay, 0, 0, spWidth, spHei";
__ref._pnlrange.AddView((android.view.View)(__ref._pnldisplay.getObject()),(int) (0),(int) (0),_spwidth,_spheight);
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="pnlDisplay.Background = LoadDrawable(\"scrollbar_h";
__ref._pnldisplay.setBackground((android.graphics.drawable.Drawable)(__ref._loaddrawable(null,"scrollbar_handle_accelerated_anim2")));
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="r.Target = r.RunStaticMethod(\"android.view.ViewCo";
_r.Target = _r.RunStaticMethod("android.view.ViewConfiguration","get",new Object[]{(Object)(_r.GetContext(ba))},new String[]{"android.content.Context"});
RDebugUtils.currentLine=10616848;
 //BA.debugLineNum = 10616848;BA.debugLine="Duration = r.RunMethod(\"getScrollDefaultDelay\") +";
__ref._duration = (int) ((double)(BA.ObjectToNumber(_r.RunMethod("getScrollDefaultDelay")))+__c.Bit.ShiftRight((int)(BA.ObjectToNumber(_r.RunMethod("getScrollBarFadeDuration"))),(int) (1)));
RDebugUtils.currentLine=10616849;
 //BA.debugLineNum = 10616849;BA.debugLine="TimeOut.Initialize(\"TimeOut\", 0)";
__ref._timeout.Initialize(ba,"TimeOut",(long) (0));
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="Anim.InitializeTranslate(\"Anim\", 0, 0, spWidth, 0";
__ref._anim.InitializeTranslate(ba,"Anim",(float) (0),(float) (0),(float) (_spwidth),(float) (0));
RDebugUtils.currentLine=10616851;
 //BA.debugLineNum = 10616851;BA.debugLine="Anim.Duration = Duration";
__ref._anim.setDuration((long) (__ref._duration));
RDebugUtils.currentLine=10616852;
 //BA.debugLineNum = 10616852;BA.debugLine="Anim.RepeatCount = 0";
__ref._anim.setRepeatCount((int) (0));
RDebugUtils.currentLine=10616854;
 //BA.debugLineNum = 10616854;BA.debugLine="MaxPos = pnlRange.Height - pnlDisplay.Height";
__ref._maxpos = (int) (__ref._pnlrange.getHeight()-__ref._pnldisplay.getHeight());
RDebugUtils.currentLine=10616855;
 //BA.debugLineNum = 10616855;BA.debugLine="bUserMovingPnl = False 'Becomes True when the use";
__ref._busermovingpnl = __c.False;
RDebugUtils.currentLine=10616856;
 //BA.debugLineNum = 10616856;BA.debugLine="bWaitForScroll = True";
__ref._bwaitforscroll = __c.True;
RDebugUtils.currentLine=10616857;
 //BA.debugLineNum = 10616857;BA.debugLine="pnlDisplay.Top = CalcNewTop";
__ref._pnldisplay.setTop(__ref._calcnewtop(null));
RDebugUtils.currentLine=10616858;
 //BA.debugLineNum = 10616858;BA.debugLine="End Sub";
return "";
}
public String  _displaysize(com.bcleaner.clsexplorer __ref,double _sizeoct) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "displaysize"))
	return (String) Debug.delegate(ba, "displaysize", new Object[] {_sizeoct});
String[] _txtunits = null;
int _unité = 0;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub DisplaySize(SizeOct As Double) As Stri";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Dim txtUnits(4) As String";
_txtunits = new String[(int) (4)];
java.util.Arrays.fill(_txtunits,"");
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="txtUnits = Array As String(\"bytes\", \"Kb\", \"Mb\", \"";
_txtunits = new String[]{"bytes","Kb","Mb","Gb"};
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Dim Unité As Int";
_unité = 0;
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Unité = 0";
_unité = (int) (0);
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Do While SizeOct > 1024";
while (_sizeoct>1024) {
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="Unité = Unité + 1";
_unité = (int) (_unité+1);
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="SizeOct = SizeOct / 1024";
_sizeoct = _sizeoct/(double)1024;
 }
;
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="If SizeOct <> Floor(SizeOct) Then";
if (_sizeoct!=__c.Floor(_sizeoct)) { 
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="Return NumberFormat(SizeOct, 1, 1) & \" \" & txtUn";
if (true) return __c.NumberFormat(_sizeoct,(int) (1),(int) (1))+" "+_txtunits[_unité];
 }else {
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="Return SizeOct & \" \" & txtUnits(Unité)";
if (true) return BA.NumberToString(_sizeoct)+" "+_txtunits[_unité];
 };
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="End Sub";
return "";
}
public String  _dlg_hasfocus(com.bcleaner.clsexplorer __ref,Object _viewtag,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "dlg_hasfocus"))
	return (String) Debug.delegate(ba, "dlg_hasfocus", new Object[] {_viewtag,_hasfocus});
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub dlg_HasFocus(ViewTag As Object, HasFoc";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="If Not(HasFocus) Then edtFilename.RequestFocus";
if (__c.Not(_hasfocus)) { 
__ref._edtfilename.RequestFocus();};
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return "";
}
public boolean  _dlg_keypress(com.bcleaner.clsexplorer __ref,Object _viewtag,int _keycode,Object _keyevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "dlg_keypress"))
	return (Boolean) Debug.delegate(ba, "dlg_keypress", new Object[] {_viewtag,_keycode,_keyevent});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _keyaction = 0;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub dlg_KeyPress(ViewTag As Object, KeyCod";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="r.Target = KeyEvent";
_r.Target = _keyevent;
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="Dim KeyAction As Int = r.RunMethod(\"getAction\")";
_keyaction = (int)(BA.ObjectToNumber(_r.RunMethod("getAction")));
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Select Case KeyCode";
switch (BA.switchObjectToInt(_keycode,__c.KeyCodes.KEYCODE_BACK,__c.KeyCodes.KEYCODE_MENU,__c.KeyCodes.KEYCODE_SEARCH)) {
case 0: {
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="If KeyAction = 1 Then 'ACTION_UP";
if (_keyaction==1) { 
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="If pnlVisu.IsInitialized Then";
if (__ref._pnlvisu.IsInitialized()) { 
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="pnlVisu_Close(Null)";
__ref._pnlvisu_close(null,__c.Null);
 }else {
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="WaitUntilOK = False";
__ref._waituntilok = __c.False;
 };
 };
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
case 1: {
RDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
case 2: {
RDebugUtils.currentLine=9830417;
 //BA.debugLineNum = 9830417;BA.debugLine="Return True";
if (true) return __c.True;
 break; }
}
;
RDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=9830420;
 //BA.debugLineNum = 9830420;BA.debugLine="End Sub";
return false;
}
public String  _explorer(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "explorer"))
	return (String) Debug.delegate(ba, "explorer", null);
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _marginbord = 0;
int _margin = 0;
int _margincartouche = 0;
int _hauteurcartouche = 0;
int _largeurbtn = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd_pnlcadre = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd_pnl = null;
int _largeur = 0;
int _hauteur = 0;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gd_pnlcartouche = null;
int[] _clrs = null;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub Explorer";
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Dim MarginBord As Int: MarginBord = 3dip";
_marginbord = 0;
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Dim MarginBord As Int: MarginBord = 3dip";
_marginbord = __c.DipToCurrent((int) (3));
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="Dim Margin As Int: Margin = 8dip";
_margin = 0;
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="Dim Margin As Int: Margin = 8dip";
_margin = __c.DipToCurrent((int) (8));
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
_margincartouche = 0;
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
_margincartouche = __c.DipToCurrent((int) (4));
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
_hauteurcartouche = 0;
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
_hauteurcartouche = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
_largeurbtn = 0;
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
_largeurbtn = __c.DipToCurrent((int) (70));
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="Dim cd_pnlCadre, cd_pnl As ColorDrawable";
_cd_pnlcadre = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd_pnl = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="pnlMasque.Initialize(\"\")";
__ref._pnlmasque.Initialize(ba,"");
RDebugUtils.currentLine=9371661;
 //BA.debugLineNum = 9371661;BA.debugLine="pnlMasque.Color = Colors.Transparent";
__ref._pnlmasque.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="r.Target = pnlMasque";
_r.Target = (Object)(__ref._pnlmasque.getObject());
RDebugUtils.currentLine=9371663;
 //BA.debugLineNum = 9371663;BA.debugLine="r.SetOnTouchListener(\"pnl_BlockTouch\")";
_r.SetOnTouchListener(ba,"pnl_BlockTouch");
RDebugUtils.currentLine=9371665;
 //BA.debugLineNum = 9371665;BA.debugLine="pnlCadre.Initialize(\"\")";
__ref._pnlcadre.Initialize(ba,"");
RDebugUtils.currentLine=9371666;
 //BA.debugLineNum = 9371666;BA.debugLine="cd_pnlCadre.Initialize(BorderColor, 12)";
_cd_pnlcadre.Initialize(__ref._bordercolor,(int) (12));
RDebugUtils.currentLine=9371667;
 //BA.debugLineNum = 9371667;BA.debugLine="pnlCadre.Background = cd_pnlCadre";
__ref._pnlcadre.setBackground((android.graphics.drawable.Drawable)(_cd_pnlcadre.getObject()));
RDebugUtils.currentLine=9371669;
 //BA.debugLineNum = 9371669;BA.debugLine="pnlFiles.Initialize(\"\")";
__ref._pnlfiles.Initialize(ba,"");
RDebugUtils.currentLine=9371670;
 //BA.debugLineNum = 9371670;BA.debugLine="cd_pnl.Initialize(BackgroundColor, 10)";
_cd_pnl.Initialize(__ref._backgroundcolor,(int) (10));
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="pnlFiles.Background = cd_pnl";
__ref._pnlfiles.setBackground((android.graphics.drawable.Drawable)(_cd_pnl.getObject()));
RDebugUtils.currentLine=9371672;
 //BA.debugLineNum = 9371672;BA.debugLine="svFichiers.Initialize(-1, 0, \"SVF\")";
__ref._svfichiers.Initialize(ba,(int) (-1),(int) (0),"SVF");
RDebugUtils.currentLine=9371673;
 //BA.debugLineNum = 9371673;BA.debugLine="svFichiers.Color = BackgroundColor";
__ref._svfichiers.setColor(__ref._backgroundcolor);
RDebugUtils.currentLine=9371674;
 //BA.debugLineNum = 9371674;BA.debugLine="Dim Largeur, Hauteur As Int";
_largeur = 0;
_hauteur = 0;
RDebugUtils.currentLine=9371675;
 //BA.debugLineNum = 9371675;BA.debugLine="Largeur = DialogRect.Right - DialogRect.Left";
_largeur = (int) (__ref._dialogrect.getRight()-__ref._dialogrect.getLeft());
RDebugUtils.currentLine=9371676;
 //BA.debugLineNum = 9371676;BA.debugLine="Hauteur = DialogRect.Bottom - DialogRect.Top";
_hauteur = (int) (__ref._dialogrect.getBottom()-__ref._dialogrect.getTop());
RDebugUtils.currentLine=9371677;
 //BA.debugLineNum = 9371677;BA.debugLine="pnlFiles.AddView(svFichiers, Margin, Margin, Larg";
__ref._pnlfiles.AddView((android.view.View)(__ref._svfichiers.getObject()),_margin,_margin,(int) (_largeur-(2*_marginbord)-(2*_margin)),(int) (_hauteur-(2*_marginbord)-(2*_margin)-_hauteurcartouche));
RDebugUtils.currentLine=9371678;
 //BA.debugLineNum = 9371678;BA.debugLine="r.Target = svFichiers";
_r.Target = (Object)(__ref._svfichiers.getObject());
RDebugUtils.currentLine=9371679;
 //BA.debugLineNum = 9371679;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
_r.SetOnKeyListener(ba,"dlg_KeyPress");
RDebugUtils.currentLine=9371680;
 //BA.debugLineNum = 9371680;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
_r.SetOnFocusListener(ba,"dlg_HasFocus");
RDebugUtils.currentLine=9371682;
 //BA.debugLineNum = 9371682;BA.debugLine="pnlCartouche.Initialize(\"\")";
__ref._pnlcartouche.Initialize(ba,"");
RDebugUtils.currentLine=9371683;
 //BA.debugLineNum = 9371683;BA.debugLine="Dim gd_pnlCartouche As GradientDrawable, Clrs(2)";
_gd_pnlcartouche = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
_clrs = new int[(int) (2)];
;
RDebugUtils.currentLine=9371684;
 //BA.debugLineNum = 9371684;BA.debugLine="Clrs(0) = Colors.Black";
_clrs[(int) (0)] = __c.Colors.Black;
RDebugUtils.currentLine=9371685;
 //BA.debugLineNum = 9371685;BA.debugLine="Clrs(1) = BackgroundColor";
_clrs[(int) (1)] = __ref._backgroundcolor;
RDebugUtils.currentLine=9371686;
 //BA.debugLineNum = 9371686;BA.debugLine="gd_pnlCartouche.Initialize(\"TOP_BOTTOM\", Clrs)";
_gd_pnlcartouche.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_clrs);
RDebugUtils.currentLine=9371687;
 //BA.debugLineNum = 9371687;BA.debugLine="gd_pnlCartouche.CornerRadius = 10";
_gd_pnlcartouche.setCornerRadius((float) (10));
RDebugUtils.currentLine=9371688;
 //BA.debugLineNum = 9371688;BA.debugLine="pnlCartouche.Background = gd_pnlCartouche";
__ref._pnlcartouche.setBackground((android.graphics.drawable.Drawable)(_gd_pnlcartouche.getObject()));
RDebugUtils.currentLine=9371689;
 //BA.debugLineNum = 9371689;BA.debugLine="edtFilename.Initialize(\"\")";
__ref._edtfilename.Initialize(ba,"");
RDebugUtils.currentLine=9371690;
 //BA.debugLineNum = 9371690;BA.debugLine="edtFilename.TextSize = 16";
__ref._edtfilename.setTextSize((float) (16));
RDebugUtils.currentLine=9371691;
 //BA.debugLineNum = 9371691;BA.debugLine="edtFilename.InputType = Bit.Or(edtFilename.InputT";
__ref._edtfilename.setInputType(__c.Bit.Or(__ref._edtfilename.getInputType(),(int) (0x80000)));
RDebugUtils.currentLine=9371692;
 //BA.debugLineNum = 9371692;BA.debugLine="edtFilename.SingleLine = True";
__ref._edtfilename.setSingleLine(__c.True);
RDebugUtils.currentLine=9371693;
 //BA.debugLineNum = 9371693;BA.debugLine="edtFilename.Wrap = False";
__ref._edtfilename.setWrap(__c.False);
RDebugUtils.currentLine=9371694;
 //BA.debugLineNum = 9371694;BA.debugLine="r.Target = edtFilename";
_r.Target = (Object)(__ref._edtfilename.getObject());
RDebugUtils.currentLine=9371695;
 //BA.debugLineNum = 9371695;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
_r.SetOnKeyListener(ba,"dlg_KeyPress");
RDebugUtils.currentLine=9371696;
 //BA.debugLineNum = 9371696;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
_r.SetOnFocusListener(ba,"dlg_HasFocus");
RDebugUtils.currentLine=9371697;
 //BA.debugLineNum = 9371697;BA.debugLine="pnlCartouche.AddView(edtFilename, MarginCartouche";
__ref._pnlcartouche.AddView((android.view.View)(__ref._edtfilename.getObject()),(int) (_margincartouche+__c.DipToCurrent((int) (1))),(int) (_margincartouche+__c.DipToCurrent((int) (1))),(int) (_largeur-(2*_marginbord)-(3*_margincartouche)-_largeurbtn),(int) (_hauteurcartouche-_margincartouche));
RDebugUtils.currentLine=9371698;
 //BA.debugLineNum = 9371698;BA.debugLine="btnOK.Initialize(\"btnOK\")";
__ref._btnok.Initialize(ba,"btnOK");
RDebugUtils.currentLine=9371699;
 //BA.debugLineNum = 9371699;BA.debugLine="btnOK.Text = strBtnOKTxt";
__ref._btnok.setText(BA.ObjectToCharSequence(__ref._strbtnoktxt));
RDebugUtils.currentLine=9371700;
 //BA.debugLineNum = 9371700;BA.debugLine="pnlCartouche.AddView(btnOK, edtFilename.Width + (";
__ref._pnlcartouche.AddView((android.view.View)(__ref._btnok.getObject()),(int) (__ref._edtfilename.getWidth()+(2*_margincartouche)),(int) (_margincartouche+__c.DipToCurrent((int) (1))),_largeurbtn,(int) (_hauteurcartouche-_margincartouche));
RDebugUtils.currentLine=9371702;
 //BA.debugLineNum = 9371702;BA.debugLine="pnlCadre.AddView(pnlFiles, MarginBord, MarginBord";
__ref._pnlcadre.AddView((android.view.View)(__ref._pnlfiles.getObject()),_marginbord,_marginbord,(int) (_largeur-(2*_marginbord)),(int) (_hauteur-_hauteurcartouche-(2*_marginbord)));
RDebugUtils.currentLine=9371703;
 //BA.debugLineNum = 9371703;BA.debugLine="pnlCadre.AddView(pnlCartouche, MarginBord, Hauteu";
__ref._pnlcadre.AddView((android.view.View)(__ref._pnlcartouche.getObject()),_marginbord,(int) (_hauteur-_hauteurcartouche-_marginbord),(int) (_largeur-(2*_marginbord)),_hauteurcartouche);
RDebugUtils.currentLine=9371704;
 //BA.debugLineNum = 9371704;BA.debugLine="pnlMasque.AddView(pnlCadre, DialogRect.Left, Dial";
__ref._pnlmasque.AddView((android.view.View)(__ref._pnlcadre.getObject()),__ref._dialogrect.getLeft(),__ref._dialogrect.getTop(),_largeur,_hauteur);
RDebugUtils.currentLine=9371705;
 //BA.debugLineNum = 9371705;BA.debugLine="actEcran.AddView(pnlMasque, 0, 0, 100%x, 100%y)";
__ref._actecran.AddView((android.view.View)(__ref._pnlmasque.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=9371707;
 //BA.debugLineNum = 9371707;BA.debugLine="If strChemin.EndsWith(\"/\") And strChemin <> \"/\" T";
if (__ref._strchemin.endsWith("/") && (__ref._strchemin).equals("/") == false) { 
__ref._strchemin = __ref._strchemin.substring((int) (0),__ref._strchemin.length());};
RDebugUtils.currentLine=9371708;
 //BA.debugLineNum = 9371708;BA.debugLine="ReadFolder(strChemin)";
__ref._readfolder(null,__ref._strchemin);
RDebugUtils.currentLine=9371709;
 //BA.debugLineNum = 9371709;BA.debugLine="CommonExplorer";
__ref._commonexplorer(null);
RDebugUtils.currentLine=9371710;
 //BA.debugLineNum = 9371710;BA.debugLine="End Sub";
return "";
}
public String  _readfolder(com.bcleaner.clsexplorer __ref,String _chemin) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "readfolder"))
	return (String) Debug.delegate(ba, "readfolder", new Object[] {_chemin});
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.List _lstd = null;
anywheresoftware.b4a.objects.collections.List _lstf = null;
anywheresoftware.b4a.objects.LabelWrapper _lblwait = null;
int _i = 0;
String _nomfichier = "";
int _f = 0;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub ReadFolder(Chemin As String)";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Dim lst, lstD, lstF As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lstd = new anywheresoftware.b4a.objects.collections.List();
_lstf = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Try";
try {RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="lst = File.ListFiles(Chemin)";
_lst = __c.File.ListFiles(_chemin);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="lst = Null";
_lst.setObject((java.util.List)(__c.Null));
 };
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="If lst.IsInitialized Then";
if (_lst.IsInitialized()) { 
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="InitializeFileList";
__ref._initializefilelist(null);
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="DoEvents";
__c.DoEvents();
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="Dim lblWait As Label";
_lblwait = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9306123;
 //BA.debugLineNum = 9306123;BA.debugLine="lblWait.Initialize(\"\")";
_lblwait.Initialize(ba,"");
RDebugUtils.currentLine=9306124;
 //BA.debugLineNum = 9306124;BA.debugLine="If lst.Size > 30 Then";
if (_lst.getSize()>30) { 
RDebugUtils.currentLine=9306126;
 //BA.debugLineNum = 9306126;BA.debugLine="lblWait.Gravity = Gravity.CENTER_HORIZONTAL + G";
_lblwait.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=9306127;
 //BA.debugLineNum = 9306127;BA.debugLine="lblWait.Text = \"Please wait...\"";
_lblwait.setText(BA.ObjectToCharSequence("Please wait..."));
RDebugUtils.currentLine=9306128;
 //BA.debugLineNum = 9306128;BA.debugLine="lblWait.TextColor = FileTextColor1";
_lblwait.setTextColor(__ref._filetextcolor1);
RDebugUtils.currentLine=9306129;
 //BA.debugLineNum = 9306129;BA.debugLine="lblWait.TextSize = 18";
_lblwait.setTextSize((float) (18));
RDebugUtils.currentLine=9306130;
 //BA.debugLineNum = 9306130;BA.debugLine="lblWait.Typeface = Typeface.DEFAULT_BOLD";
_lblwait.setTypeface(__c.Typeface.DEFAULT_BOLD);
RDebugUtils.currentLine=9306131;
 //BA.debugLineNum = 9306131;BA.debugLine="pnlFiles.AddView(lblWait, 20dip, pnlFiles.Heigh";
__ref._pnlfiles.AddView((android.view.View)(_lblwait.getObject()),__c.DipToCurrent((int) (20)),(int) (__ref._pnlfiles.getHeight()/(double)2-__c.DipToCurrent((int) (13))),(int) (__ref._pnlfiles.getWidth()-__c.DipToCurrent((int) (40))),__c.DipToCurrent((int) (26)));
RDebugUtils.currentLine=9306132;
 //BA.debugLineNum = 9306132;BA.debugLine="DoEvents";
__c.DoEvents();
 };
RDebugUtils.currentLine=9306134;
 //BA.debugLineNum = 9306134;BA.debugLine="lstD.Initialize";
_lstd.Initialize();
RDebugUtils.currentLine=9306135;
 //BA.debugLineNum = 9306135;BA.debugLine="lstF.Initialize";
_lstf.Initialize();
RDebugUtils.currentLine=9306136;
 //BA.debugLineNum = 9306136;BA.debugLine="If Chemin <> \"/\" Then AddEntry(0, \"/ ..\", \"\", Fa";
if ((_chemin).equals("/") == false) { 
__ref._addentry(null,(int) (0),"/ ..","",__c.False);};
RDebugUtils.currentLine=9306137;
 //BA.debugLineNum = 9306137;BA.debugLine="For i = 0 To lst.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_lst.getSize()-1);
for (_i = (int) (0) ; (step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24); _i = ((int)(0 + _i + step24)) ) {
RDebugUtils.currentLine=9306138;
 //BA.debugLineNum = 9306138;BA.debugLine="If File.IsDirectory(Chemin, lst.Get(i)) Then";
if (__c.File.IsDirectory(_chemin,BA.ObjectToString(_lst.Get(_i)))) { 
RDebugUtils.currentLine=9306139;
 //BA.debugLineNum = 9306139;BA.debugLine="lstD.Add(lst.Get(i))";
_lstd.Add(_lst.Get(_i));
 }else 
{RDebugUtils.currentLine=9306140;
 //BA.debugLineNum = 9306140;BA.debugLine="Else If Not(bOnlyFolders) Then";
if (__c.Not(__ref._bonlyfolders)) { 
RDebugUtils.currentLine=9306141;
 //BA.debugLineNum = 9306141;BA.debugLine="If lstFiltre.Size = 0 Then";
if (__ref._lstfiltre.getSize()==0) { 
RDebugUtils.currentLine=9306142;
 //BA.debugLineNum = 9306142;BA.debugLine="lstF.Add(lst.Get(i))";
_lstf.Add(_lst.Get(_i));
 }else {
RDebugUtils.currentLine=9306144;
 //BA.debugLineNum = 9306144;BA.debugLine="Dim NomFichier As String";
_nomfichier = "";
RDebugUtils.currentLine=9306145;
 //BA.debugLineNum = 9306145;BA.debugLine="NomFichier = lst.Get(i)";
_nomfichier = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=9306146;
 //BA.debugLineNum = 9306146;BA.debugLine="NomFichier = NomFichier.ToLowerCase";
_nomfichier = _nomfichier.toLowerCase();
RDebugUtils.currentLine=9306147;
 //BA.debugLineNum = 9306147;BA.debugLine="For f = 0 To lstFiltre.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (__ref._lstfiltre.getSize()-1);
for (_f = (int) (0) ; (step34 > 0 && _f <= limit34) || (step34 < 0 && _f >= limit34); _f = ((int)(0 + _f + step34)) ) {
RDebugUtils.currentLine=9306148;
 //BA.debugLineNum = 9306148;BA.debugLine="If NomFichier.EndsWith(lstFiltre.Get(f)) The";
if (_nomfichier.endsWith(BA.ObjectToString(__ref._lstfiltre.Get(_f)))) { 
RDebugUtils.currentLine=9306149;
 //BA.debugLineNum = 9306149;BA.debugLine="lstF.Add(lst.Get(i))";
_lstf.Add(_lst.Get(_i));
RDebugUtils.currentLine=9306150;
 //BA.debugLineNum = 9306150;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 };
 }};
 }
};
RDebugUtils.currentLine=9306156;
 //BA.debugLineNum = 9306156;BA.debugLine="lstD.SortCaseInsensitive(True)";
_lstd.SortCaseInsensitive(__c.True);
RDebugUtils.currentLine=9306157;
 //BA.debugLineNum = 9306157;BA.debugLine="For i = 0 To lstD.Size - 1";
{
final int step44 = 1;
final int limit44 = (int) (_lstd.getSize()-1);
for (_i = (int) (0) ; (step44 > 0 && _i <= limit44) || (step44 < 0 && _i >= limit44); _i = ((int)(0 + _i + step44)) ) {
RDebugUtils.currentLine=9306158;
 //BA.debugLineNum = 9306158;BA.debugLine="AddEntry(lstFichiers.NumberOfItems, \"/ \" & lstD";
__ref._addentry(null,__ref._lstfichiers._numberofitems(null),"/ "+BA.ObjectToString(_lstd.Get(_i)),"",__ref._bmultifolderselection);
 }
};
RDebugUtils.currentLine=9306160;
 //BA.debugLineNum = 9306160;BA.debugLine="lstF.SortCaseInsensitive(True)";
_lstf.SortCaseInsensitive(__c.True);
RDebugUtils.currentLine=9306161;
 //BA.debugLineNum = 9306161;BA.debugLine="For i = 0 To lstF.Size - 1";
{
final int step48 = 1;
final int limit48 = (int) (_lstf.getSize()-1);
for (_i = (int) (0) ; (step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48); _i = ((int)(0 + _i + step48)) ) {
RDebugUtils.currentLine=9306162;
 //BA.debugLineNum = 9306162;BA.debugLine="AddEntry(lstFichiers.NumberOfItems, lstF.Get(i)";
__ref._addentry(null,__ref._lstfichiers._numberofitems(null),BA.ObjectToString(_lstf.Get(_i)),__ref._displaysize(null,__c.File.Size(_chemin,BA.ObjectToString(_lstf.Get(_i)))),__ref._bmultifileselection);
 }
};
RDebugUtils.currentLine=9306164;
 //BA.debugLineNum = 9306164;BA.debugLine="lstFichiers.ResizePanel";
__ref._lstfichiers._resizepanel(null);
RDebugUtils.currentLine=9306165;
 //BA.debugLineNum = 9306165;BA.debugLine="strChemin = Chemin";
__ref._strchemin = _chemin;
RDebugUtils.currentLine=9306166;
 //BA.debugLineNum = 9306166;BA.debugLine="lblWait.RemoveView";
_lblwait.RemoveView();
 }else {
RDebugUtils.currentLine=9306169;
 //BA.debugLineNum = 9306169;BA.debugLine="ToastMessageShow(\"Unable to access folder\", Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("Unable to access folder"),__c.False);
RDebugUtils.currentLine=9306170;
 //BA.debugLineNum = 9306170;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9306172;
 //BA.debugLineNum = 9306172;BA.debugLine="End Sub";
return "";
}
public String  _explorer2(com.bcleaner.clsexplorer __ref,boolean _darktheme) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "explorer2"))
	return (String) Debug.delegate(ba, "explorer2", new Object[] {_darktheme});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _marginbord = 0;
int _margin = 0;
int _margincartouche = 0;
int _hauteurcartouche = 0;
int _largeurbtn = 0;
int _id = 0;
int _largeur = 0;
int _hauteur = 0;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub Explorer2(DarkTheme As Boolean)";
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Dim MarginBord As Int: MarginBord = 19dip";
_marginbord = 0;
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Dim MarginBord As Int: MarginBord = 19dip";
_marginbord = __c.DipToCurrent((int) (19));
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="Dim Margin As Int: Margin = 4dip";
_margin = 0;
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="Dim Margin As Int: Margin = 4dip";
_margin = __c.DipToCurrent((int) (4));
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
_margincartouche = 0;
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="Dim MarginCartouche As Int: MarginCartouche = 4di";
_margincartouche = __c.DipToCurrent((int) (4));
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
_hauteurcartouche = 0;
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="Dim HauteurCartouche As Int: HauteurCartouche = 5";
_hauteurcartouche = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
_largeurbtn = 0;
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="Dim LargeurBtn As Int: LargeurBtn = 70dip";
_largeurbtn = __c.DipToCurrent((int) (70));
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="pnlMasque.Initialize(\"\")";
__ref._pnlmasque.Initialize(ba,"");
RDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="Dim id As Int";
_id = 0;
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="If DarkTheme Then";
if (_darktheme) { 
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="id = r.GetStaticField(\"android.R$drawable\", \"ale";
_id = (int)(BA.ObjectToNumber(_r.GetStaticField("android.R$drawable","alert_dark_frame")));
 }else {
RDebugUtils.currentLine=9502736;
 //BA.debugLineNum = 9502736;BA.debugLine="id = r.GetStaticField(\"android.R$drawable\", \"ale";
_id = (int)(BA.ObjectToNumber(_r.GetStaticField("android.R$drawable","alert_light_frame")));
 };
RDebugUtils.currentLine=9502738;
 //BA.debugLineNum = 9502738;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=9502740;
 //BA.debugLineNum = 9502740;BA.debugLine="pnlMasque.Background = r.RunMethod2(\"getDrawable\"";
__ref._pnlmasque.setBackground((android.graphics.drawable.Drawable)(_r.RunMethod2("getDrawable",BA.NumberToString(_id),"java.lang.int")));
RDebugUtils.currentLine=9502741;
 //BA.debugLineNum = 9502741;BA.debugLine="r.Target = pnlMasque";
_r.Target = (Object)(__ref._pnlmasque.getObject());
RDebugUtils.currentLine=9502742;
 //BA.debugLineNum = 9502742;BA.debugLine="r.SetOnTouchListener(\"pnl_BlockTouch\")";
_r.SetOnTouchListener(ba,"pnl_BlockTouch");
RDebugUtils.currentLine=9502744;
 //BA.debugLineNum = 9502744;BA.debugLine="BackgroundColor = Colors.Transparent";
__ref._backgroundcolor = __c.Colors.Transparent;
RDebugUtils.currentLine=9502745;
 //BA.debugLineNum = 9502745;BA.debugLine="pnlFiles.Initialize(\"\")";
__ref._pnlfiles.Initialize(ba,"");
RDebugUtils.currentLine=9502746;
 //BA.debugLineNum = 9502746;BA.debugLine="pnlFiles.Color = BackgroundColor";
__ref._pnlfiles.setColor(__ref._backgroundcolor);
RDebugUtils.currentLine=9502747;
 //BA.debugLineNum = 9502747;BA.debugLine="svFichiers.Initialize(-1, 0, \"SVF\")";
__ref._svfichiers.Initialize(ba,(int) (-1),(int) (0),"SVF");
RDebugUtils.currentLine=9502748;
 //BA.debugLineNum = 9502748;BA.debugLine="svFichiers.Color = BackgroundColor";
__ref._svfichiers.setColor(__ref._backgroundcolor);
RDebugUtils.currentLine=9502749;
 //BA.debugLineNum = 9502749;BA.debugLine="Dim Largeur, Hauteur As Int";
_largeur = 0;
_hauteur = 0;
RDebugUtils.currentLine=9502750;
 //BA.debugLineNum = 9502750;BA.debugLine="Largeur = 100%x - (2*MarginBord)";
_largeur = (int) (__c.PerXToCurrent((float) (100),ba)-(2*_marginbord));
RDebugUtils.currentLine=9502751;
 //BA.debugLineNum = 9502751;BA.debugLine="Hauteur = 100%y - (2*MarginBord)";
_hauteur = (int) (__c.PerYToCurrent((float) (100),ba)-(2*_marginbord));
RDebugUtils.currentLine=9502752;
 //BA.debugLineNum = 9502752;BA.debugLine="pnlFiles.AddView(svFichiers, Margin, Margin, Larg";
__ref._pnlfiles.AddView((android.view.View)(__ref._svfichiers.getObject()),_margin,_margin,(int) (_largeur-(2*_margin)),(int) (_hauteur-(2*_margin)-_hauteurcartouche));
RDebugUtils.currentLine=9502753;
 //BA.debugLineNum = 9502753;BA.debugLine="r.Target = svFichiers";
_r.Target = (Object)(__ref._svfichiers.getObject());
RDebugUtils.currentLine=9502754;
 //BA.debugLineNum = 9502754;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
_r.SetOnKeyListener(ba,"dlg_KeyPress");
RDebugUtils.currentLine=9502755;
 //BA.debugLineNum = 9502755;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
_r.SetOnFocusListener(ba,"dlg_HasFocus");
RDebugUtils.currentLine=9502756;
 //BA.debugLineNum = 9502756;BA.debugLine="If DarkTheme Then";
if (_darktheme) { 
RDebugUtils.currentLine=9502757;
 //BA.debugLineNum = 9502757;BA.debugLine="FolderTextColor = Colors.White";
__ref._foldertextcolor = __c.Colors.White;
RDebugUtils.currentLine=9502758;
 //BA.debugLineNum = 9502758;BA.debugLine="FileTextColor1 = Colors.ARGB(220, 255, 255, 255)";
__ref._filetextcolor1 = __c.Colors.ARGB((int) (220),(int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=9502759;
 //BA.debugLineNum = 9502759;BA.debugLine="FileTextColor2 = Colors.ARGB(128, 255, 255, 255)";
__ref._filetextcolor2 = __c.Colors.ARGB((int) (128),(int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=9502760;
 //BA.debugLineNum = 9502760;BA.debugLine="DividerColor = Colors.DarkGray";
__ref._dividercolor = __c.Colors.DarkGray;
 }else {
RDebugUtils.currentLine=9502762;
 //BA.debugLineNum = 9502762;BA.debugLine="FolderTextColor = Colors.Black";
__ref._foldertextcolor = __c.Colors.Black;
RDebugUtils.currentLine=9502763;
 //BA.debugLineNum = 9502763;BA.debugLine="FileTextColor1 = Colors.ARGB(200, 0, 0, 0)";
__ref._filetextcolor1 = __c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=9502764;
 //BA.debugLineNum = 9502764;BA.debugLine="FileTextColor2 = Colors.ARGB(128, 0, 0, 0)";
__ref._filetextcolor2 = __c.Colors.ARGB((int) (128),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=9502765;
 //BA.debugLineNum = 9502765;BA.debugLine="DividerColor = Colors.LightGray";
__ref._dividercolor = __c.Colors.LightGray;
 };
RDebugUtils.currentLine=9502768;
 //BA.debugLineNum = 9502768;BA.debugLine="pnlCartouche.Initialize(\"\")";
__ref._pnlcartouche.Initialize(ba,"");
RDebugUtils.currentLine=9502769;
 //BA.debugLineNum = 9502769;BA.debugLine="pnlCartouche.Color = Colors.Transparent";
__ref._pnlcartouche.setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=9502770;
 //BA.debugLineNum = 9502770;BA.debugLine="edtFilename.Initialize(\"\")";
__ref._edtfilename.Initialize(ba,"");
RDebugUtils.currentLine=9502771;
 //BA.debugLineNum = 9502771;BA.debugLine="edtFilename.TextSize = 16";
__ref._edtfilename.setTextSize((float) (16));
RDebugUtils.currentLine=9502772;
 //BA.debugLineNum = 9502772;BA.debugLine="edtFilename.InputType = Bit.Or(edtFilename.InputT";
__ref._edtfilename.setInputType(__c.Bit.Or(__ref._edtfilename.getInputType(),(int) (0x80000)));
RDebugUtils.currentLine=9502773;
 //BA.debugLineNum = 9502773;BA.debugLine="edtFilename.SingleLine = True";
__ref._edtfilename.setSingleLine(__c.True);
RDebugUtils.currentLine=9502774;
 //BA.debugLineNum = 9502774;BA.debugLine="edtFilename.Wrap = False";
__ref._edtfilename.setWrap(__c.False);
RDebugUtils.currentLine=9502775;
 //BA.debugLineNum = 9502775;BA.debugLine="r.Target = edtFilename";
_r.Target = (Object)(__ref._edtfilename.getObject());
RDebugUtils.currentLine=9502776;
 //BA.debugLineNum = 9502776;BA.debugLine="r.SetOnKeyListener(\"dlg_KeyPress\")";
_r.SetOnKeyListener(ba,"dlg_KeyPress");
RDebugUtils.currentLine=9502777;
 //BA.debugLineNum = 9502777;BA.debugLine="r.SetOnFocusListener(\"dlg_HasFocus\")";
_r.SetOnFocusListener(ba,"dlg_HasFocus");
RDebugUtils.currentLine=9502778;
 //BA.debugLineNum = 9502778;BA.debugLine="pnlCartouche.AddView(edtFilename, MarginCartouche";
__ref._pnlcartouche.AddView((android.view.View)(__ref._edtfilename.getObject()),(int) (_margincartouche+__c.DipToCurrent((int) (1))),_margincartouche,(int) (_largeur-(3*_margincartouche)-_largeurbtn),(int) (_hauteurcartouche-_margincartouche));
RDebugUtils.currentLine=9502779;
 //BA.debugLineNum = 9502779;BA.debugLine="btnOK.Initialize(\"btnOK\")";
__ref._btnok.Initialize(ba,"btnOK");
RDebugUtils.currentLine=9502780;
 //BA.debugLineNum = 9502780;BA.debugLine="btnOK.Text = strBtnOKTxt";
__ref._btnok.setText(BA.ObjectToCharSequence(__ref._strbtnoktxt));
RDebugUtils.currentLine=9502781;
 //BA.debugLineNum = 9502781;BA.debugLine="pnlCartouche.AddView(btnOK, edtFilename.Width + (";
__ref._pnlcartouche.AddView((android.view.View)(__ref._btnok.getObject()),(int) (__ref._edtfilename.getWidth()+(2*_margincartouche)),_margincartouche,_largeurbtn,(int) (_hauteurcartouche-_margincartouche));
RDebugUtils.currentLine=9502783;
 //BA.debugLineNum = 9502783;BA.debugLine="pnlMasque.AddView(pnlFiles, MarginBord, MarginBor";
__ref._pnlmasque.AddView((android.view.View)(__ref._pnlfiles.getObject()),_marginbord,(int) (_marginbord-_margin),_largeur,(int) (_hauteur-_hauteurcartouche));
RDebugUtils.currentLine=9502784;
 //BA.debugLineNum = 9502784;BA.debugLine="pnlMasque.AddView(pnlCartouche, MarginBord, Haute";
__ref._pnlmasque.AddView((android.view.View)(__ref._pnlcartouche.getObject()),_marginbord,(int) (_hauteur-_hauteurcartouche+__ref._pnlfiles.getTop()),_largeur,_hauteurcartouche);
RDebugUtils.currentLine=9502785;
 //BA.debugLineNum = 9502785;BA.debugLine="actEcran.AddView(pnlMasque, 0, 0, 100%x, 100%y)";
__ref._actecran.AddView((android.view.View)(__ref._pnlmasque.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=9502787;
 //BA.debugLineNum = 9502787;BA.debugLine="If strChemin.EndsWith(\"/\") And strChemin <> \"/\" T";
if (__ref._strchemin.endsWith("/") && (__ref._strchemin).equals("/") == false) { 
__ref._strchemin = __ref._strchemin.substring((int) (0),__ref._strchemin.length());};
RDebugUtils.currentLine=9502788;
 //BA.debugLineNum = 9502788;BA.debugLine="ReadFolder(strChemin)";
__ref._readfolder(null,__ref._strchemin);
RDebugUtils.currentLine=9502789;
 //BA.debugLineNum = 9502789;BA.debugLine="CommonExplorer";
__ref._commonexplorer(null);
RDebugUtils.currentLine=9502790;
 //BA.debugLineNum = 9502790;BA.debugLine="End Sub";
return "";
}
public String  _explorermulti(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "explorermulti"))
	return (String) Debug.delegate(ba, "explorermulti", null);
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub ExplorerMulti";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="bMultiFolderSelection = bOnlyFolders";
__ref._bmultifolderselection = __ref._bonlyfolders;
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="bMultiFileSelection = Not(bOnlyFolders)";
__ref._bmultifileselection = __c.Not(__ref._bonlyfolders);
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Explorer";
__ref._explorer(null);
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="End Sub";
return "";
}
public String  _explorermulti2(com.bcleaner.clsexplorer __ref,boolean _darktheme) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "explorermulti2"))
	return (String) Debug.delegate(ba, "explorermulti2", new Object[] {_darktheme});
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub ExplorerMulti2(DarkTheme As Boolean)";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="bMultiFolderSelection = bOnlyFolders";
__ref._bmultifolderselection = __ref._bonlyfolders;
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="bMultiFileSelection = Not(bOnlyFolders)";
__ref._bmultifileselection = __c.Not(__ref._bonlyfolders);
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Explorer2(DarkTheme)";
__ref._explorer2(null,_darktheme);
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.bcleaner.clsexplorer __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,String _defaultfolder,String _filter,boolean _visupnl,boolean _onlyfolders,String _oktext) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_defaultfolder,_filter,_visupnl,_onlyfolders,_oktext});
int _ecart = 0;
String _strfiltre = "";
int _posvirg = 0;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub Initialize(Activity As Activity, Defaul";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim Ecart As Int: Ecart = 10dip";
_ecart = 0;
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim Ecart As Int: Ecart = 10dip";
_ecart = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="actEcran = Activity";
__ref._actecran = _activity;
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="strChemin = DefaultFolder";
__ref._strchemin = _defaultfolder;
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="lstFiltre.Initialize";
__ref._lstfiltre.Initialize();
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Dim strFiltre As String, PosVirg As Int";
_strfiltre = "";
_posvirg = 0;
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="strFiltre = Filter.ToLowerCase";
_strfiltre = _filter.toLowerCase();
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Do While strFiltre.Contains(\",\")";
while (_strfiltre.contains(",")) {
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="PosVirg = strFiltre.IndexOf(\",\")";
_posvirg = _strfiltre.indexOf(",");
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="lstFiltre.Add(strFiltre.SubString2(0, PosVirg).T";
__ref._lstfiltre.Add((Object)(_strfiltre.substring((int) (0),_posvirg).trim()));
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="strFiltre = strFiltre.SubString(PosVirg + 1)";
_strfiltre = _strfiltre.substring((int) (_posvirg+1));
 }
;
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="lstFiltre.Add(strFiltre.Trim)";
__ref._lstfiltre.Add((Object)(_strfiltre.trim()));
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="bOnlyFolders = OnlyFolders";
__ref._bonlyfolders = _onlyfolders;
RDebugUtils.currentLine=9043982;
 //BA.debugLineNum = 9043982;BA.debugLine="bVisualiser = VisuPnl";
__ref._bvisualiser = _visupnl;
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="bMultiFolderSelection = False";
__ref._bmultifolderselection = __c.False;
RDebugUtils.currentLine=9043984;
 //BA.debugLineNum = 9043984;BA.debugLine="bMultiFileSelection = False";
__ref._bmultifileselection = __c.False;
RDebugUtils.currentLine=9043985;
 //BA.debugLineNum = 9043985;BA.debugLine="strBtnOKTxt = OkText";
__ref._strbtnoktxt = _oktext;
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="FastScrollEnabled = False";
__ref._fastscrollenabled = __c.False;
RDebugUtils.currentLine=9043987;
 //BA.debugLineNum = 9043987;BA.debugLine="Ellipsis = True";
__ref._ellipsis = __c.True;
RDebugUtils.currentLine=9043988;
 //BA.debugLineNum = 9043988;BA.debugLine="BorderColor = Colors.RGB(25, 90, 179)";
__ref._bordercolor = __c.Colors.RGB((int) (25),(int) (90),(int) (179));
RDebugUtils.currentLine=9043989;
 //BA.debugLineNum = 9043989;BA.debugLine="BackgroundColor = Colors.RGB(19, 27, 67)";
__ref._backgroundcolor = __c.Colors.RGB((int) (19),(int) (27),(int) (67));
RDebugUtils.currentLine=9043990;
 //BA.debugLineNum = 9043990;BA.debugLine="FolderTextColor = Colors.White";
__ref._foldertextcolor = __c.Colors.White;
RDebugUtils.currentLine=9043991;
 //BA.debugLineNum = 9043991;BA.debugLine="FileTextColor1 = Colors.RGB(116, 172, 232)";
__ref._filetextcolor1 = __c.Colors.RGB((int) (116),(int) (172),(int) (232));
RDebugUtils.currentLine=9043992;
 //BA.debugLineNum = 9043992;BA.debugLine="FileTextColor2 = Colors.Gray";
__ref._filetextcolor2 = __c.Colors.Gray;
RDebugUtils.currentLine=9043993;
 //BA.debugLineNum = 9043993;BA.debugLine="DividerColor = Colors.DarkGray";
__ref._dividercolor = __c.Colors.DarkGray;
RDebugUtils.currentLine=9043994;
 //BA.debugLineNum = 9043994;BA.debugLine="DialogRect.Initialize(Ecart, Ecart, 100%x - Ecart";
__ref._dialogrect.Initialize(_ecart,_ecart,(int) (__c.PerXToCurrent((float) (100),ba)-_ecart),(int) (__c.PerYToCurrent((float) (100),ba)-_ecart));
RDebugUtils.currentLine=9043995;
 //BA.debugLineNum = 9043995;BA.debugLine="WaitUntilOK = True";
__ref._waituntilok = __c.True;
RDebugUtils.currentLine=9043996;
 //BA.debugLineNum = 9043996;BA.debugLine="End Sub";
return "";
}
public String  _initializefilelist(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "initializefilelist"))
	return (String) Debug.delegate(ba, "initializefilelist", null);
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub InitializeFileList";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="lstFichiers.Initialize(Me, svFichiers, \"\", \"lstFi";
__ref._lstfichiers._initialize(null,ba,this,__ref._svfichiers,"","lstFichiers_Click","lstFichiers_LongClick",__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="lstFichiers.BackgroundColor = BackgroundColor";
__ref._lstfichiers._backgroundcolor = __ref._backgroundcolor;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="lstFichiers.DividerColor = DividerColor";
__ref._lstfichiers._dividercolor = __ref._dividercolor;
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="svFichiers.VerticalScrollPosition = 0";
__ref._svfichiers.setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="End Sub";
return "";
}
public Object  _loaddrawable(com.bcleaner.clsexplorer __ref,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "loaddrawable"))
	return (Object) Debug.delegate(ba, "loaddrawable", new Object[] {_name});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
int _id_drawable = 0;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub LoadDrawable(Name As String) As Object";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="r.Target = r.RunMethod(\"getSystem\")";
_r.Target = _r.RunMethod("getSystem");
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Dim ID_Drawable As Int";
_id_drawable = 0;
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="ID_Drawable = r.RunMethod4(\"getIdentifier\", Array";
_id_drawable = (int)(BA.ObjectToNumber(_r.RunMethod4("getIdentifier",new Object[]{(Object)(_name),(Object)("drawable"),(Object)("android")},new String[]{"java.lang.String","java.lang.String","java.lang.String"})));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="r.Target = r.GetContext";
_r.Target = (Object)(_r.GetContext(ba));
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
_r.Target = _r.RunMethod("getResources");
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="Return r.RunMethod2(\"getDrawable\", ID_Drawable, \"";
if (true) return _r.RunMethod2("getDrawable",BA.NumberToString(_id_drawable),"java.lang.int");
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="End Sub";
return null;
}
public boolean  _isactive(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "isactive"))
	return (Boolean) Debug.delegate(ba, "isactive", null);
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Public Sub IsActive As Boolean";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Return pnlMasque.IsInitialized";
if (true) return __ref._pnlmasque.IsInitialized();
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="End Sub";
return false;
}
public boolean  _isimage(com.bcleaner.clsexplorer __ref,String _nomfichier) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "isimage"))
	return (Boolean) Debug.delegate(ba, "isimage", new Object[] {_nomfichier});
String _minus = "";
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub IsImage(NomFichier As String) As Boole";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim Minus As String";
_minus = "";
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Minus = NomFichier.ToLowerCase";
_minus = _nomfichier.toLowerCase();
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Return (Minus.EndsWith(\".bmp\") OR Minus.EndsWith(";
if (true) return (_minus.endsWith(".bmp") || _minus.endsWith(".gif") || _minus.endsWith(".jpg") || _minus.endsWith(".png"));
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="End Sub";
return false;
}
public boolean  _istext(com.bcleaner.clsexplorer __ref,String _nomfichier) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "istext"))
	return (Boolean) Debug.delegate(ba, "istext", new Object[] {_nomfichier});
String _minus = "";
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub IsText(NomFichier As String) As Boolea";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim Minus As String";
_minus = "";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Minus = NomFichier.ToLowerCase";
_minus = _nomfichier.toLowerCase();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Return (Minus.EndsWith(\".css\") OR Minus.EndsWith(";
if (true) return (_minus.endsWith(".css") || _minus.endsWith(".htm") || _minus.endsWith(".html") || _minus.endsWith(".txt") || _minus.endsWith(".xml"));
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="End Sub";
return false;
}
public String  _lstfichiers_click(com.bcleaner.clsexplorer __ref,anywheresoftware.b4a.objects.PanelWrapper _item,Object _itemtag) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "lstfichiers_click"))
	return (String) Debug.delegate(ba, "lstfichiers_click", new Object[] {_item,_itemtag});
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
int _posslash = 0;
String _parentpath = "";
String _newpath = "";
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbx = null;
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub lstFichiers_Click(Item As Panel, ItemT";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="If Item.GetView(0) Is CheckBox Then";
if (_item.GetView((int) (0)).getObjectOrNull() instanceof android.widget.CheckBox) { 
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="lbl = Item.GetView(1)";
_lbl.setObject((android.widget.TextView)(_item.GetView((int) (1)).getObject()));
 }else {
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="lbl = Item.GetView(0)";
_lbl.setObject((android.widget.TextView)(_item.GetView((int) (0)).getObject()));
 };
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="If lbl.Text = \"/ ..\" Then";
if ((_lbl.getText()).equals("/ ..")) { 
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="Dim PosSlash As Int, ParentPath As String";
_posslash = 0;
_parentpath = "";
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="PosSlash = strChemin.LastIndexOf(\"/\")";
_posslash = __ref._strchemin.lastIndexOf("/");
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="ParentPath = strChemin.SubString2(0, PosSlash)";
_parentpath = __ref._strchemin.substring((int) (0),_posslash);
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="If ParentPath = \"\" Then ParentPath = \"/\"";
if ((_parentpath).equals("")) { 
_parentpath = "/";};
RDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="ReadFolder(ParentPath)";
__ref._readfolder(null,_parentpath);
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="If bOnlyFolders Then";
if (__ref._bonlyfolders) { 
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="edtFilename.Text = ParentPath";
__ref._edtfilename.setText(BA.ObjectToCharSequence(_parentpath));
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="edtFilename.RequestFocus";
__ref._edtfilename.RequestFocus();
 }else {
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="edtFilename.Text = \"\"";
__ref._edtfilename.setText(BA.ObjectToCharSequence(""));
 };
 }else 
{RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="Else If lbl.Text.StartsWith(\"/ \") Then";
if (_lbl.getText().startsWith("/ ")) { 
RDebugUtils.currentLine=10354710;
 //BA.debugLineNum = 10354710;BA.debugLine="Dim NewPath As String";
_newpath = "";
RDebugUtils.currentLine=10354711;
 //BA.debugLineNum = 10354711;BA.debugLine="If strChemin = \"/\" Then";
if ((__ref._strchemin).equals("/")) { 
RDebugUtils.currentLine=10354712;
 //BA.debugLineNum = 10354712;BA.debugLine="NewPath = strChemin & lbl.Text.SubString(2)";
_newpath = __ref._strchemin+_lbl.getText().substring((int) (2));
 }else {
RDebugUtils.currentLine=10354714;
 //BA.debugLineNum = 10354714;BA.debugLine="NewPath = strChemin & \"/\" & lbl.Text.SubString(";
_newpath = __ref._strchemin+"/"+_lbl.getText().substring((int) (2));
 };
RDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="ReadFolder(NewPath)";
__ref._readfolder(null,_newpath);
RDebugUtils.currentLine=10354717;
 //BA.debugLineNum = 10354717;BA.debugLine="If bOnlyFolders Then";
if (__ref._bonlyfolders) { 
RDebugUtils.currentLine=10354718;
 //BA.debugLineNum = 10354718;BA.debugLine="edtFilename.Text = NewPath";
__ref._edtfilename.setText(BA.ObjectToCharSequence(_newpath));
RDebugUtils.currentLine=10354719;
 //BA.debugLineNum = 10354719;BA.debugLine="edtFilename.SelectionStart = edtFilename.Text.L";
__ref._edtfilename.setSelectionStart(__ref._edtfilename.getText().length());
RDebugUtils.currentLine=10354720;
 //BA.debugLineNum = 10354720;BA.debugLine="edtFilename.RequestFocus";
__ref._edtfilename.RequestFocus();
 }else {
RDebugUtils.currentLine=10354722;
 //BA.debugLineNum = 10354722;BA.debugLine="edtFilename.Text = \"\"";
__ref._edtfilename.setText(BA.ObjectToCharSequence(""));
 };
 }else {
RDebugUtils.currentLine=10354726;
 //BA.debugLineNum = 10354726;BA.debugLine="If bVisualiser Then";
if (__ref._bvisualiser) { 
RDebugUtils.currentLine=10354727;
 //BA.debugLineNum = 10354727;BA.debugLine="If IsImage(lbl.Text) Then";
if (__ref._isimage(null,_lbl.getText())) { 
RDebugUtils.currentLine=10354728;
 //BA.debugLineNum = 10354728;BA.debugLine="AfficherImage(lbl.Text)";
__ref._afficherimage(null,_lbl.getText());
 }else 
{RDebugUtils.currentLine=10354729;
 //BA.debugLineNum = 10354729;BA.debugLine="Else If IsText(lbl.Text) Then";
if (__ref._istext(null,_lbl.getText())) { 
RDebugUtils.currentLine=10354730;
 //BA.debugLineNum = 10354730;BA.debugLine="AfficherTexte(lbl.Text)";
__ref._affichertexte(null,_lbl.getText());
 }};
 };
RDebugUtils.currentLine=10354733;
 //BA.debugLineNum = 10354733;BA.debugLine="If bMultiFileSelection Then";
if (__ref._bmultifileselection) { 
RDebugUtils.currentLine=10354734;
 //BA.debugLineNum = 10354734;BA.debugLine="Dim cbx As CheckBox";
_cbx = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=10354735;
 //BA.debugLineNum = 10354735;BA.debugLine="cbx = Item.GetView(0)";
_cbx.setObject((android.widget.CheckBox)(_item.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=10354736;
 //BA.debugLineNum = 10354736;BA.debugLine="cbx.Checked = True";
_cbx.setChecked(__c.True);
 }else {
RDebugUtils.currentLine=10354738;
 //BA.debugLineNum = 10354738;BA.debugLine="edtFilename.Text = lbl.Text";
__ref._edtfilename.setText(BA.ObjectToCharSequence(_lbl.getText()));
 };
RDebugUtils.currentLine=10354740;
 //BA.debugLineNum = 10354740;BA.debugLine="edtFilename.SelectionStart = edtFilename.Text.Le";
__ref._edtfilename.setSelectionStart(__ref._edtfilename.getText().length());
RDebugUtils.currentLine=10354741;
 //BA.debugLineNum = 10354741;BA.debugLine="edtFilename.RequestFocus";
__ref._edtfilename.RequestFocus();
 }};
RDebugUtils.currentLine=10354743;
 //BA.debugLineNum = 10354743;BA.debugLine="End Sub";
return "";
}
public String  _lstfichiers_longclick(com.bcleaner.clsexplorer __ref,anywheresoftware.b4a.objects.PanelWrapper _item,Object _itemtag) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "lstfichiers_longclick"))
	return (String) Debug.delegate(ba, "lstfichiers_longclick", new Object[] {_item,_itemtag});
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub lstFichiers_LongClick(Item As Panel, I";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="If Item.GetView(0) Is CheckBox Then";
if (_item.GetView((int) (0)).getObjectOrNull() instanceof android.widget.CheckBox) { 
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="lbl = Item.GetView(1)";
_lbl.setObject((android.widget.TextView)(_item.GetView((int) (1)).getObject()));
 }else {
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="lbl = Item.GetView(0)";
_lbl.setObject((android.widget.TextView)(_item.GetView((int) (0)).getObject()));
 };
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="ToastMessageShow(lbl.Text, False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(_lbl.getText()),__c.False);
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="End Sub";
return "";
}
public String  _lstmulti_checkedchange(com.bcleaner.clsexplorer __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "lstmulti_checkedchange"))
	return (String) Debug.delegate(ba, "lstmulti_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
int _i = 0;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub lstMulti_CheckedChange(Checked As Bool";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim L As List = lstFichiers.CheckedPanels";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = __ref._lstfichiers._checkedpanels(null);
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim pnl As Panel, lbl As Label";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="edtFilename.Text = \"\"";
__ref._edtfilename.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="For i = 0 To L.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_l.getSize()-1);
for (_i = (int) (0) ; (step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4); _i = ((int)(0 + _i + step4)) ) {
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="If edtFilename.Text <> \"\" Then edtFilename.Text";
if ((__ref._edtfilename.getText()).equals("") == false) { 
__ref._edtfilename.setText(BA.ObjectToCharSequence(__ref._edtfilename.getText()+";"));};
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="pnl = L.Get(i)";
_pnl.setObject((android.view.ViewGroup)(_l.Get(_i)));
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="lbl = pnl.GetView(1)";
_lbl.setObject((android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="If lbl.Text.StartsWith(\"/ \") Then";
if (_lbl.getText().startsWith("/ ")) { 
RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="If strChemin = \"/\" Then";
if ((__ref._strchemin).equals("/")) { 
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="edtFilename.Text = edtFilename.Text & strChemi";
__ref._edtfilename.setText(BA.ObjectToCharSequence(__ref._edtfilename.getText()+__ref._strchemin+_lbl.getText().substring((int) (2))));
 }else {
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="edtFilename.Text = edtFilename.Text & strChemi";
__ref._edtfilename.setText(BA.ObjectToCharSequence(__ref._edtfilename.getText()+__ref._strchemin+"/"+_lbl.getText().substring((int) (2))));
 };
 }else {
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="edtFilename.Text = edtFilename.Text & lbl.Text";
__ref._edtfilename.setText(BA.ObjectToCharSequence(__ref._edtfilename.getText()+_lbl.getText()));
 };
 }
};
RDebugUtils.currentLine=10485778;
 //BA.debugLineNum = 10485778;BA.debugLine="edtFilename.SelectionStart = edtFilename.Text.Len";
__ref._edtfilename.setSelectionStart(__ref._edtfilename.getText().length());
RDebugUtils.currentLine=10485779;
 //BA.debugLineNum = 10485779;BA.debugLine="End Sub";
return "";
}
public boolean  _pnl_blocktouch(com.bcleaner.clsexplorer __ref,Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "pnl_blocktouch"))
	return (Boolean) Debug.delegate(ba, "pnl_blocktouch", new Object[] {_viewtag,_action,_x,_y,_motionevent});
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub pnl_BlockTouch(ViewTag As Object, Acti";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
return false;
}
public boolean  _sp_touch(com.bcleaner.clsexplorer __ref,Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "sp_touch"))
	return (Boolean) Debug.delegate(ba, "sp_touch", new Object[] {_viewtag,_action,_x,_y,_motionevent});
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub SP_Touch(ViewTag As Object, Action As";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="If Action = 0 Then";
if (_action==0) { 
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="If Y < pnlDisplay.Top OR Y > pnlDisplay.Top + pn";
if (_y<__ref._pnldisplay.getTop() || _y>__ref._pnldisplay.getTop()+__ref._pnldisplay.getHeight()) { 
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="bIgnoreEvent = True";
__ref._bignoreevent = __c.True;
 }else {
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="bIgnoreEvent = False";
__ref._bignoreevent = __c.False;
 };
 };
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="If bIgnoreEvent Then Return False";
if (__ref._bignoreevent) { 
if (true) return __c.False;};
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Select Case Action";
switch (_action) {
case 0: 
case 2: {
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="bUserMovingPnl = True";
__ref._busermovingpnl = __c.True;
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="TimeOut.Enabled = False";
__ref._timeout.setEnabled(__c.False);
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="Anim.Stop(pnlDisplay)";
__ref._anim.Stop((android.view.View)(__ref._pnldisplay.getObject()));
RDebugUtils.currentLine=11010064;
 //BA.debugLineNum = 11010064;BA.debugLine="pnlDisplay.Top = Min(Max(0, Y * (1 - (pnlDispla";
__ref._pnldisplay.setTop((int) (__c.Min(__c.Max(0,_y*(1-(__ref._pnldisplay.getHeight()/(double)__ref._pnlrange.getHeight()))),__ref._maxpos)));
RDebugUtils.currentLine=11010065;
 //BA.debugLineNum = 11010065;BA.debugLine="svFichiers.VerticalScrollPosition = pnlDisplay.";
__ref._svfichiers.setVerticalScrollPosition((int) (__ref._pnldisplay.getTop()/(double)__ref._maxpos*(__ref._svfichiers.getPanel().getHeight()-__ref._svfichiers.getHeight())));
 break; }
default: {
RDebugUtils.currentLine=11010067;
 //BA.debugLineNum = 11010067;BA.debugLine="bUserMovingPnl = False";
__ref._busermovingpnl = __c.False;
RDebugUtils.currentLine=11010068;
 //BA.debugLineNum = 11010068;BA.debugLine="TimeOut.Interval = Duration";
__ref._timeout.setInterval((long) (__ref._duration));
RDebugUtils.currentLine=11010069;
 //BA.debugLineNum = 11010069;BA.debugLine="TimeOut.Enabled = True";
__ref._timeout.setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=11010071;
 //BA.debugLineNum = 11010071;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=11010072;
 //BA.debugLineNum = 11010072;BA.debugLine="End Sub";
return false;
}
public String  _svf_scrollchanged(com.bcleaner.clsexplorer __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "svf_scrollchanged"))
	return (String) Debug.delegate(ba, "svf_scrollchanged", new Object[] {_posx,_posy});
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub SVF_ScrollChanged(PosX As Int, PosY As";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="If Not(FastScrollEnabled) Then Return";
if (__c.Not(__ref._fastscrollenabled)) { 
if (true) return "";};
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="If bWaitForScroll Then";
if (__ref._bwaitforscroll) { 
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="If pnlDisplay.Top = CalcNewTop Then";
if (__ref._pnldisplay.getTop()==__ref._calcnewtop(null)) { 
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="bWaitForScroll = False";
__ref._bwaitforscroll = __c.False;
 };
 };
RDebugUtils.currentLine=10944524;
 //BA.debugLineNum = 10944524;BA.debugLine="If svFichiers.Panel.Height > svFichiers.Height Th";
if (__ref._svfichiers.getPanel().getHeight()>__ref._svfichiers.getHeight()) { 
RDebugUtils.currentLine=10944526;
 //BA.debugLineNum = 10944526;BA.debugLine="pnlRange.Visible = True";
__ref._pnlrange.setVisible(__c.True);
 };
RDebugUtils.currentLine=10944529;
 //BA.debugLineNum = 10944529;BA.debugLine="If Not(bUserMovingPnl) Then";
if (__c.Not(__ref._busermovingpnl)) { 
RDebugUtils.currentLine=10944530;
 //BA.debugLineNum = 10944530;BA.debugLine="TimeOut.Enabled = False";
__ref._timeout.setEnabled(__c.False);
RDebugUtils.currentLine=10944531;
 //BA.debugLineNum = 10944531;BA.debugLine="Anim.Stop(pnlDisplay)";
__ref._anim.Stop((android.view.View)(__ref._pnldisplay.getObject()));
RDebugUtils.currentLine=10944532;
 //BA.debugLineNum = 10944532;BA.debugLine="pnlDisplay.Top = CalcNewTop";
__ref._pnldisplay.setTop(__ref._calcnewtop(null));
RDebugUtils.currentLine=10944533;
 //BA.debugLineNum = 10944533;BA.debugLine="If PosY = svFichiers.VerticalScrollPosition Then";
if (_posy==__ref._svfichiers.getVerticalScrollPosition()) { 
RDebugUtils.currentLine=10944535;
 //BA.debugLineNum = 10944535;BA.debugLine="TimeOut.Interval = Duration";
__ref._timeout.setInterval((long) (__ref._duration));
RDebugUtils.currentLine=10944536;
 //BA.debugLineNum = 10944536;BA.debugLine="TimeOut.Enabled = True";
__ref._timeout.setEnabled(__c.True);
RDebugUtils.currentLine=10944537;
 //BA.debugLineNum = 10944537;BA.debugLine="bWaitForScroll = True";
__ref._bwaitforscroll = __c.True;
 };
 };
RDebugUtils.currentLine=10944540;
 //BA.debugLineNum = 10944540;BA.debugLine="End Sub";
return "";
}
public String  _timeout_tick(com.bcleaner.clsexplorer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsexplorer";
if (Debug.shouldDelegate(ba, "timeout_tick"))
	return (String) Debug.delegate(ba, "timeout_tick", null);
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub TimeOut_Tick";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="TimeOut.Enabled = False";
__ref._timeout.setEnabled(__c.False);
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Anim.Start(pnlDisplay)";
__ref._anim.Start((android.view.View)(__ref._pnldisplay.getObject()));
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="End Sub";
return "";
}
}