package com.bcleaner;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class setanimation {
private static setanimation mostCurrent = new setanimation();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _setanimat = "";
public com.bcleaner.main _main = null;
public com.bcleaner.starter _starter = null;
public static String  _setanimati(anywheresoftware.b4a.BA _ba,String _inanimation,String _outanimation) throws Exception{
RDebugUtils.currentModule="setanimation";
if (Debug.shouldDelegate(null, "setanimati"))
	return (String) Debug.delegate(null, "setanimati", new Object[] {_ba,_inanimation,_outanimation});
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
String _package = "";
int _in = 0;
int _out = 0;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub SetAnimati(InAnimation As String, OutAnimation";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="Dim package As String";
_package = "";
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Dim in, out As Int";
_in = 0;
_out = 0;
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="package = r.GetStaticField(\"anywheresoftware.b4a.";
_package = BA.ObjectToString(_r.GetStaticField("anywheresoftware.b4a.BA","packageName"));
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="in = r.GetStaticField(package & \".R$anim\", InAnim";
_in = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_inanimation)));
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="out = r.GetStaticField(package & \".R$anim\", OutAn";
_out = (int)(BA.ObjectToNumber(_r.GetStaticField(_package+".R$anim",_outanimation)));
RDebugUtils.currentLine=11141127;
 //BA.debugLineNum = 11141127;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity((_ba.processBA == null ? _ba : _ba.processBA)));
RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="r.RunMethod4(\"overridePendingTransition\", Array A";
_r.RunMethod4("overridePendingTransition",new Object[]{(Object)(_in),(Object)(_out)},new String[]{"java.lang.int","java.lang.int"});
RDebugUtils.currentLine=11141130;
 //BA.debugLineNum = 11141130;BA.debugLine="End Sub";
return "";
}
}