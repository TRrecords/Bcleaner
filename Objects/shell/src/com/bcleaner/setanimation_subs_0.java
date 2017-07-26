package com.bcleaner;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class setanimation_subs_0 {


public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Dim setanimat As String";
setanimation._setanimat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setanimati(RemoteObject _ba,RemoteObject _inanimation,RemoteObject _outanimation) throws Exception{
try {
		Debug.PushSubsStack("SetAnimati (setanimation) ","setanimation",5,_ba,setanimation.mostCurrent,10);
if (RapidSub.canDelegate("setanimati")) return setanimation.remoteMe.runUserSub(false, "setanimation","setanimati", _ba, _inanimation, _outanimation);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _package = RemoteObject.createImmutable("");
RemoteObject _in = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(0);
;
Debug.locals.put("InAnimation", _inanimation);
Debug.locals.put("OutAnimation", _outanimation);
 BA.debugLineNum = 10;BA.debugLine="Sub SetAnimati(InAnimation As String, OutAnimation";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1024);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 12;BA.debugLine="Dim package As String";
Debug.ShouldStop(2048);
_package = RemoteObject.createImmutable("");Debug.locals.put("package", _package);
 BA.debugLineNum = 13;BA.debugLine="Dim in, out As Int";
Debug.ShouldStop(4096);
_in = RemoteObject.createImmutable(0);Debug.locals.put("in", _in);
_out = RemoteObject.createImmutable(0);Debug.locals.put("out", _out);
 BA.debugLineNum = 14;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
Debug.ShouldStop(8192);
_package = BA.ObjectToString(_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("anywheresoftware.b4a.BA")),(Object)(RemoteObject.createImmutable("packageName"))));Debug.locals.put("package", _package);
 BA.debugLineNum = 15;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
Debug.ShouldStop(16384);
_in = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_inanimation)));Debug.locals.put("in", _in);
 BA.debugLineNum = 16;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
Debug.ShouldStop(32768);
_out = BA.numberCast(int.class, _r.runMethod(false,"GetStaticField",(Object)(RemoteObject.concat(_package,RemoteObject.createImmutable(".R$anim"))),(Object)(_outanimation)));Debug.locals.put("out", _out);
 BA.debugLineNum = 17;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(65536);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 18;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
Debug.ShouldStop(131072);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("overridePendingTransition")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_in),(_out)})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
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
}