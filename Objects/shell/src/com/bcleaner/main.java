
package com.bcleaner;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "com.bcleaner.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pak = RemoteObject.declareNull("anywheresoftware.b4a.phone.PackageManagerWrapper");
public static RemoteObject _cc = RemoteObject.declareNull("anywheresoftware.b4a.cachecleaner.CacheCleaner");
public static RemoteObject _t1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _os = RemoteObject.declareNull("com.rootsoft.oslibrary.OSLibrary");
public static RemoteObject _args = null;
public static RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
public static RemoteObject _obj2 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
public static RemoteObject _obj3 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _flags = RemoteObject.createImmutable(0);
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _apath = RemoteObject.createImmutable("");
public static RemoteObject _l = RemoteObject.createImmutable("");
public static RemoteObject _types = null;
public static RemoteObject _packname = RemoteObject.createImmutable("");
public static RemoteObject _icon = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
public static RemoteObject _ac = RemoteObject.declareNull("de.amberhome.objects.appcompat.AppCompatBase");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _toolbar = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACToolbarLightWrapper");
public static RemoteObject _abhelper = RemoteObject.declareNull("de.amberhome.objects.appcompat.ACActionBar");
public static RemoteObject _cb1 = RemoteObject.declareNull("com.circlebuttonwrapper.CircleButtonWrapper");
public static RemoteObject _mcl = RemoteObject.declareNull("com.tchart.materialcolors.MaterialColors");
public static RemoteObject _lw3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _applist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _catlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mathlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _pg = RemoteObject.declareNull("de.donmanfred.pgWheel");
public static RemoteObject _cinfo = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomDialog");
public static RemoteObject _counter = RemoteObject.createImmutable(0);
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _date = RemoteObject.createImmutable("");
public static RemoteObject _time = RemoteObject.createImmutable("");
public static RemoteObject _kvst = RemoteObject.declareNull("com.bcleaner.keyvaluestore");
public static RemoteObject _kvsdata = RemoteObject.declareNull("com.bcleaner.keyvaluestore");
public static RemoteObject _kvsmat = RemoteObject.declareNull("com.bcleaner.keyvaluestore");
public static RemoteObject _dia = RemoteObject.declareNull("de.donmanfred.AlertDialogBuilder");
public static RemoteObject _dia2 = RemoteObject.declareNull("de.donmanfred.AlertDialogBuilder");
public static RemoteObject _dia3 = RemoteObject.declareNull("de.donmanfred.AlertDialogBuilder");
public static RemoteObject _shader = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
public static RemoteObject _draw = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _tmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _storage = RemoteObject.declareNull("MLfiles.Fileslib.MLfiles");
public static com.bcleaner.starter _starter = null;
public static com.bcleaner.setanimation _setanimation = null;
  public Object[] GetGlobals() {
		return new Object[] {"ABHelper",main.mostCurrent._abhelper,"ac",main.mostCurrent._ac,"Activity",main.mostCurrent._activity,"apath",main.mostCurrent._apath,"applist",main.mostCurrent._applist,"args",main.mostCurrent._args,"catlist",main.mostCurrent._catlist,"cb1",main.mostCurrent._cb1,"cc",main._cc,"cinfo",main.mostCurrent._cinfo,"counter",main._counter,"date",main.mostCurrent._date,"dia",main.mostCurrent._dia,"dia2",main.mostCurrent._dia2,"dia3",main.mostCurrent._dia3,"draw",main.mostCurrent._draw,"flags",main._flags,"icon",main.mostCurrent._icon,"kvsdata",main.mostCurrent._kvsdata,"kvsmat",main.mostCurrent._kvsmat,"kvst",main.mostCurrent._kvst,"l",main.mostCurrent._l,"Label1",main.mostCurrent._label1,"Label2",main.mostCurrent._label2,"Label3",main.mostCurrent._label3,"lw3",main.mostCurrent._lw3,"mathlist",main.mostCurrent._mathlist,"mcl",main.mostCurrent._mcl,"name",main.mostCurrent._name,"Obj1",main.mostCurrent._obj1,"Obj2",main.mostCurrent._obj2,"Obj3",main.mostCurrent._obj3,"os",main._os,"packName",main.mostCurrent._packname,"pak",main._pak,"Panel1",main.mostCurrent._panel1,"Panel2",main.mostCurrent._panel2,"pg",main.mostCurrent._pg,"SetAnimation",Debug.moduleToString(com.bcleaner.setanimation.class),"shader",main.mostCurrent._shader,"size",main._size,"Starter",Debug.moduleToString(com.bcleaner.starter.class),"storage",main.mostCurrent._storage,"t1",main._t1,"time",main.mostCurrent._time,"tmp",main.mostCurrent._tmp,"toolbar",main.mostCurrent._toolbar,"Types",main.mostCurrent._types};
}
}