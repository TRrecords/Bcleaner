
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

public class setanimation implements IRemote{
	public static setanimation mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public setanimation() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, setanimation.class);
    static {
		mostCurrent = new setanimation();
        remoteMe = RemoteObject.declareNull("com.bcleaner.setanimation");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("setanimation"), "com.bcleaner.setanimation");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("com.bcleaner.setanimation"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _setanimat = RemoteObject.createImmutable("");
public static com.bcleaner.main _main = null;
public static com.bcleaner.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Main",Debug.moduleToString(com.bcleaner.main.class),"setanimat",setanimation._setanimat,"Starter",Debug.moduleToString(com.bcleaner.starter.class)};
}
}