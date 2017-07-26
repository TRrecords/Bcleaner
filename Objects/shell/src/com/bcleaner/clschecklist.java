
package com.bcleaner;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clschecklist {
    public static RemoteObject myClass;
	public clschecklist() {
	}
    public static PCBA staticBA = new PCBA(null, clschecklist.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _checkedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _dividercolor = RemoteObject.createImmutable(0);
public static RemoteObject _extensioncolor = RemoteObject.createImmutable(0);
public static RemoteObject _filterresult = RemoteObject.createImmutable(false);
public static RemoteObject _sv = RemoteObject.declareNull("flm.b4a.scrollview2d.ScrollView2DWrapper");
public static RemoteObject _svheight = RemoteObject.createImmutable(0);
public static RemoteObject _extensionindex = RemoteObject.createImmutable(0);
public static RemoteObject _extensionview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
public static RemoteObject _callbackmod = RemoteObject.declareNull("Object");
public static RemoteObject _sub_check = RemoteObject.createImmutable("");
public static RemoteObject _sub_click = RemoteObject.createImmutable("");
public static RemoteObject _sub_longclick = RemoteObject.createImmutable("");
public static RemoteObject _sub_paint = RemoteObject.createImmutable("");
public static RemoteObject _modecheck = RemoteObject.createImmutable(false);
public static RemoteObject _blockcheckevent = RemoteObject.createImmutable(false);
public static RemoteObject _pressedpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _presseddrawable = RemoteObject.declareNull("Object");
public static RemoteObject _oldbackground = RemoteObject.declareNull("Object");
public static RemoteObject _dividersize = RemoteObject.createImmutable(0);
public static RemoteObject _draganddrop = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _draganddropshadow = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _originddtop = RemoteObject.createImmutable(0);
public static RemoteObject _lasty = RemoteObject.createImmutable(0);
public static RemoteObject _sub_afterdrop = RemoteObject.createImmutable("");
public static RemoteObject _chkboxsize = RemoteObject.createImmutable(0);
public static RemoteObject _bitmapsize = RemoteObject.createImmutable(0);
public static RemoteObject _labelheight = RemoteObject.createImmutable(0);
public static RemoteObject _panelheight = RemoteObject.createImmutable(0);
public static RemoteObject _paint_default = RemoteObject.createImmutable(0);
public static RemoteObject _paint_extended = RemoteObject.createImmutable(0);
public static RemoteObject _paint_checked = RemoteObject.createImmutable(0);
public static RemoteObject _paint_pressed = RemoteObject.createImmutable(0);
public static com.bcleaner.main _main = null;
public static com.bcleaner.starter _starter = null;
public static com.bcleaner.setanimation _setanimation = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"BitmapSize",_ref.getField(false, "_bitmapsize"),"BlockCheckEvent",_ref.getField(false, "_blockcheckevent"),"CallbackMod",_ref.getField(false, "_callbackmod"),"CheckedColor",_ref.getField(false, "_checkedcolor"),"ChkBoxSize",_ref.getField(false, "_chkboxsize"),"DividerColor",_ref.getField(false, "_dividercolor"),"DividerSize",_ref.getField(false, "_dividersize"),"DragAndDrop",_ref.getField(false, "_draganddrop"),"DragAndDropShadow",_ref.getField(false, "_draganddropshadow"),"ExtensionColor",_ref.getField(false, "_extensioncolor"),"ExtensionIndex",_ref.getField(false, "_extensionindex"),"ExtensionView",_ref.getField(false, "_extensionview"),"FilterResult",_ref.getField(false, "_filterresult"),"LabelHeight",_ref.getField(false, "_labelheight"),"LastY",_ref.getField(false, "_lasty"),"ModeCheck",_ref.getField(false, "_modecheck"),"OldBackground",_ref.getField(false, "_oldbackground"),"OriginDDTop",_ref.getField(false, "_originddtop"),"PAINT_CHECKED",_ref.getField(false, "_paint_checked"),"PAINT_DEFAULT",_ref.getField(false, "_paint_default"),"PAINT_EXTENDED",_ref.getField(false, "_paint_extended"),"PAINT_PRESSED",_ref.getField(false, "_paint_pressed"),"PanelHeight",_ref.getField(false, "_panelheight"),"PressedDrawable",_ref.getField(false, "_presseddrawable"),"PressedPanel",_ref.getField(false, "_pressedpanel"),"sub_AfterDrop",_ref.getField(false, "_sub_afterdrop"),"sub_Check",_ref.getField(false, "_sub_check"),"sub_Click",_ref.getField(false, "_sub_click"),"sub_LongClick",_ref.getField(false, "_sub_longclick"),"sub_Paint",_ref.getField(false, "_sub_paint"),"sv",_ref.getField(false, "_sv"),"svHeight",_ref.getField(false, "_svheight")};
}
}