
package com.bcleaner;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class keyvaluestore {
    public static RemoteObject myClass;
	public keyvaluestore() {
	}
    public static PCBA staticBA = new PCBA(null, keyvaluestore.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql1 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _tempfile = RemoteObject.createImmutable("");
public static com.bcleaner.main _main = null;
public static com.bcleaner.starter _starter = null;
public static com.bcleaner.setanimation _setanimation = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"sql1",_ref.getField(false, "_sql1"),"tempFile",_ref.getField(false, "_tempfile"),"tempFolder",_ref.getField(false, "_tempfolder")};
}
}