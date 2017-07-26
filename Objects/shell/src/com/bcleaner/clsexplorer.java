
package com.bcleaner;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clsexplorer {
    public static RemoteObject myClass;
	public clsexplorer() {
	}
    public static PCBA staticBA = new PCBA(null, clsexplorer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _bordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _foldertextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _filetextcolor1 = RemoteObject.createImmutable(0);
public static RemoteObject _filetextcolor2 = RemoteObject.createImmutable(0);
public static RemoteObject _dividercolor = RemoteObject.createImmutable(0);
public static RemoteObject _dialogrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
public static RemoteObject _fastscrollenabled = RemoteObject.createImmutable(false);
public static RemoteObject _selection = RemoteObject.declareNull("com.bcleaner.clsexplorer._typresult");
public static RemoteObject _ellipsis = RemoteObject.createImmutable(false);
public static RemoteObject _actecran = RemoteObject.declareNull("anywheresoftware.b4a.objects.ActivityWrapper");
public static RemoteObject _strchemin = RemoteObject.createImmutable("");
public static RemoteObject _lstfiltre = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _bonlyfolders = RemoteObject.createImmutable(false);
public static RemoteObject _bvisualiser = RemoteObject.createImmutable(false);
public static RemoteObject _bmultifolderselection = RemoteObject.createImmutable(false);
public static RemoteObject _bmultifileselection = RemoteObject.createImmutable(false);
public static RemoteObject _strbtnoktxt = RemoteObject.createImmutable("");
public static RemoteObject _pnlmasque = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlcadre = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnlfiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _svfichiers = RemoteObject.declareNull("flm.b4a.scrollview2d.ScrollView2DWrapper");
public static RemoteObject _lstfichiers = RemoteObject.declareNull("com.bcleaner.clschecklist");
public static RemoteObject _itemheight = RemoteObject.createImmutable(0);
public static RemoteObject _pnlvisu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblvisu = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _ivvisu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _pnlcartouche = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _edtfilename = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnok = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _waituntilok = RemoteObject.createImmutable(false);
public static RemoteObject _pnlrange = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnldisplay = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _anim = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _timeout = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _duration = RemoteObject.createImmutable(0);
public static RemoteObject _maxpos = RemoteObject.createImmutable(0);
public static RemoteObject _bignoreevent = RemoteObject.createImmutable(false);
public static RemoteObject _busermovingpnl = RemoteObject.createImmutable(false);
public static RemoteObject _bwaitforscroll = RemoteObject.createImmutable(false);
public static com.bcleaner.main _main = null;
public static com.bcleaner.starter _starter = null;
public static com.bcleaner.setanimation _setanimation = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"actEcran",_ref.getField(false, "_actecran"),"Anim",_ref.getField(false, "_anim"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"bIgnoreEvent",_ref.getField(false, "_bignoreevent"),"bMultiFileSelection",_ref.getField(false, "_bmultifileselection"),"bMultiFolderSelection",_ref.getField(false, "_bmultifolderselection"),"bOnlyFolders",_ref.getField(false, "_bonlyfolders"),"BorderColor",_ref.getField(false, "_bordercolor"),"btnOK",_ref.getField(false, "_btnok"),"bUserMovingPnl",_ref.getField(false, "_busermovingpnl"),"bVisualiser",_ref.getField(false, "_bvisualiser"),"bWaitForScroll",_ref.getField(false, "_bwaitforscroll"),"DialogRect",_ref.getField(false, "_dialogrect"),"DividerColor",_ref.getField(false, "_dividercolor"),"Duration",_ref.getField(false, "_duration"),"edtFilename",_ref.getField(false, "_edtfilename"),"Ellipsis",_ref.getField(false, "_ellipsis"),"FastScrollEnabled",_ref.getField(false, "_fastscrollenabled"),"FileTextColor1",_ref.getField(false, "_filetextcolor1"),"FileTextColor2",_ref.getField(false, "_filetextcolor2"),"FolderTextColor",_ref.getField(false, "_foldertextcolor"),"itemHeight",_ref.getField(false, "_itemheight"),"ivVisu",_ref.getField(false, "_ivvisu"),"lblVisu",_ref.getField(false, "_lblvisu"),"lstFichiers",_ref.getField(false, "_lstfichiers"),"lstFiltre",_ref.getField(false, "_lstfiltre"),"MaxPos",_ref.getField(false, "_maxpos"),"pnlCadre",_ref.getField(false, "_pnlcadre"),"pnlCartouche",_ref.getField(false, "_pnlcartouche"),"pnlDisplay",_ref.getField(false, "_pnldisplay"),"pnlFiles",_ref.getField(false, "_pnlfiles"),"pnlMasque",_ref.getField(false, "_pnlmasque"),"pnlRange",_ref.getField(false, "_pnlrange"),"pnlVisu",_ref.getField(false, "_pnlvisu"),"Selection",_ref.getField(false, "_selection"),"strBtnOKTxt",_ref.getField(false, "_strbtnoktxt"),"strChemin",_ref.getField(false, "_strchemin"),"svFichiers",_ref.getField(false, "_svfichiers"),"TimeOut",_ref.getField(false, "_timeout"),"WaitUntilOK",_ref.getField(false, "_waituntilok")};
}
}