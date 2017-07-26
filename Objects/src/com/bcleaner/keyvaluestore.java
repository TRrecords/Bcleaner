package com.bcleaner;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class keyvaluestore extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.bcleaner.keyvaluestore");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.bcleaner.keyvaluestore.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public String _tempfolder = "";
public String _tempfile = "";
public com.bcleaner.main _main = null;
public com.bcleaner.starter _starter = null;
public com.bcleaner.setanimation _setanimation = null;
public String  _initialize(com.bcleaner.keyvaluestore __ref,anywheresoftware.b4a.BA _ba,String _dir,String _filename) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba,_dir,_filename});
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize (Dir As String, FileName As";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (__ref._sql1.IsInitialized()) { 
__ref._sql1.Close();};
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="sql1.Initialize(Dir, FileName, True)";
__ref._sql1.Initialize(_dir,_filename,__c.True);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="CreateTable";
__ref._createtable(null);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public boolean  _putsimple(com.bcleaner.keyvaluestore __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putsimple"))
	return (Boolean) Debug.delegate(ba, "putsimple", new Object[] {_key,_value});
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub PutSimple(Key As String, Value As Objec";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Try";
try {RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="insertQuery(Key, Value)";
__ref._insertquery(null,_key,_value);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="End Sub";
return false;
}
public String  _deleteall(com.bcleaner.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "deleteall"))
	return (String) Debug.delegate(ba, "deleteall", null);
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub DeleteAll";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="sql1.ExecNonQuery(\"DROP TABLE main\")";
__ref._sql1.ExecNonQuery("DROP TABLE main");
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="CreateTable";
__ref._createtable(null);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _listkeys(com.bcleaner.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "listkeys"))
	return (anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listkeys", null);
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
anywheresoftware.b4a.objects.collections.List _res = null;
int _row = 0;
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub ListKeys As List";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim c As Cursor = sql1.ExecQuery(\"SELECT key FROM";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c.setObject((android.database.Cursor)(__ref._sql1.ExecQuery("SELECT key FROM main")));
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="For row = 0 To c.RowCount - 1";
{
final int step4 = 1;
final int limit4 = (int) (_c.getRowCount()-1);
for (_row = (int) (0) ; (step4 > 0 && _row <= limit4) || (step4 < 0 && _row >= limit4); _row = ((int)(0 + _row + step4)) ) {
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="c.Position = row";
_c.setPosition(_row);
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="res.Add(c.GetString2(0))";
_res.Add((Object)(_c.GetString2((int) (0))));
 }
};
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="End Sub";
return null;
}
public String  _getsimple(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getsimple"))
	return (String) Debug.delegate(ba, "getsimple", new Object[] {_key});
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
String _res = "";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub GetSimple(Key As String) As String";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If c.RowCount = 0 Then Return \"\"";
if (_c.getRowCount()==0) { 
if (true) return "";};
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim res As String = c.GetString2(0)";
_res = _c.GetString2((int) (0));
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.bcleaner.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Private sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Private tempFolder = File.DirInternalCache, tempF";
_tempfolder = __c.File.getDirInternalCache();
_tempfile = "key_value_temp.dat";
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _close(com.bcleaner.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "close"))
	return (String) Debug.delegate(ba, "close", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="sql1.Close";
__ref._sql1.Close();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public boolean  _complete(com.bcleaner.keyvaluestore __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "complete"))
	return (Boolean) Debug.delegate(ba, "complete", new Object[] {_success});
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub complete(success As Boolean) As Boolea";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="If success Then";
if (_success) { 
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="sql1.TransactionSuccessful";
__ref._sql1.TransactionSuccessful();
 }else {
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="Log(\"Error saving object: \" & LastException)";
__c.Log("Error saving object: "+BA.ObjectToString(__c.LastException(getActivityBA())));
 };
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="sql1.EndTransaction";
__ref._sql1.EndTransaction();
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Return success";
if (true) return _success;
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
return false;
}
public boolean  _containskey(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "containskey"))
	return (Boolean) Debug.delegate(ba, "containskey", new Object[] {_key});
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub ContainsKey(Key As String) As Boolean";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Return sql1.ExecQuerySingleResult2(\"SELECT count(";
if (true) return (double)(Double.parseDouble(__ref._sql1.ExecQuerySingleResult2("SELECT count(key) FROM main WHERE key = ?",new String[]{_key})))>0;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return false;
}
public String  _createtable(com.bcleaner.keyvaluestore __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "createtable"))
	return (String) Debug.delegate(ba, "createtable", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub CreateTable";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="sql1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS mai";
__ref._sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS main(key TEXT PRIMARY KEY, value NONE)");
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getbitmap"))
	return (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", new Object[] {_key});
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub GetBitmap(Key As String) As Bitmap";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="If c.RowCount = 0 Then Return b";
if (_c.getRowCount()==0) { 
if (true) return _b;};
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
_in.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="b.Initialize2(In)";
_b.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.sql.SQL.CursorWrapper  _getcursor(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getcursor"))
	return (anywheresoftware.b4a.sql.SQL.CursorWrapper) Debug.delegate(ba, "getcursor", new Object[] {_key});
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub getCursor(Key As String) As Cursor";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Return sql1.ExecQuery2(\"SELECT value FROM main WH";
if (true) return (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(__ref._sql1.ExecQuery2("SELECT value FROM main WHERE key = ?",new String[]{_key})));
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
return null;
}
public Object  _getencryptedobject(com.bcleaner.keyvaluestore __ref,String _key,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getencryptedobject"))
	return (Object) Debug.delegate(ba, "getencryptedobject", new Object[] {_key,_password});
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub GetEncryptedObject(Key As String, Passw";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Return getObjectInternal(Key, True, Password)";
if (true) return __ref._getobjectinternal(null,_key,__c.True,_password);
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return null;
}
public Object  _getobjectinternal(com.bcleaner.keyvaluestore __ref,String _key,boolean _decrypt,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getobjectinternal"))
	return (Object) Debug.delegate(ba, "getobjectinternal", new Object[] {_key,_decrypt,_password});
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
byte[] _buffer = null;
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
Object _res = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Private Sub getObjectInternal(Key As String, decry";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If c.RowCount = 0 Then Return Null";
if (_c.getRowCount()==0) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="raf.Initialize3(buffer, False)";
_raf.Initialize3(_buffer,__c.False);
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Dim res As Object";
_res = new Object();
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="If decrypt Then";
if (_decrypt) { 
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="res = raf.ReadEncryptedObject(password, raf.Curr";
_res = _raf.ReadEncryptedObject(_password,_raf.CurrentPosition);
 }else {
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="res = raf.ReadObject(raf.CurrentPosition)";
_res = _raf.ReadObject(_raf.CurrentPosition);
 };
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="raf.Close";
_raf.Close();
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getinputstream"))
	return (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", new Object[] {_key});
anywheresoftware.b4a.sql.SQL.CursorWrapper _c = null;
byte[] _buffer = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub GetInputStream(Key As String) As InputS";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim c As Cursor = getCursor(Key)";
_c = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_c = __ref._getcursor(null,_key);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If c.RowCount = 0 Then Return Null";
if (_c.getRowCount()==0) { 
if (true) return (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(__c.Null));};
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="c.Position = 0";
_c.setPosition((int) (0));
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim buffer() As Byte = c.GetBlob2(0)";
_buffer = _c.GetBlob2((int) (0));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="In.InitializeFromBytesArray(buffer, 0, buffer.Len";
_in.InitializeFromBytesArray(_buffer,(int) (0),_buffer.length);
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="c.Close";
_c.Close();
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="End Sub";
return null;
}
public Object  _getobject(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "getobject"))
	return (Object) Debug.delegate(ba, "getobject", new Object[] {_key});
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub GetObject(Key As String) As Object";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Return getObjectInternal(Key, False, \"\")";
if (true) return __ref._getobjectinternal(null,_key,__c.False,"");
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return null;
}
public String  _insertquery(com.bcleaner.keyvaluestore __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "insertquery"))
	return (String) Debug.delegate(ba, "insertquery", new Object[] {_key,_value});
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub insertQuery(Key As String, Value As Ob";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="sql1.ExecNonQuery2(\"INSERT INTO main VALUES(?, ?)";
__ref._sql1.ExecNonQuery2("INSERT INTO main VALUES(?, ?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key),_value}));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public boolean  _putbitmap(com.bcleaner.keyvaluestore __ref,String _key,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putbitmap"))
	return (Boolean) Debug.delegate(ba, "putbitmap", new Object[] {_key,_value});
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub PutBitmap(Key As String, Value As Bitma";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim b As Bitmap = Value";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_b = _value;
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="b.WriteToStream(out, 100, \"PNG\")";
_b.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
__ref._insertquery(null,_key,(Object)(_out.ToBytesArray()));
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="End Sub";
return false;
}
public String  _start(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "start"))
	return (String) Debug.delegate(ba, "start", new Object[] {_key});
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Private Sub start (Key As String)";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="sql1.BeginTransaction";
__ref._sql1.BeginTransaction();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
__ref._sql1.ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return "";
}
public boolean  _putencyptedobject(com.bcleaner.keyvaluestore __ref,String _key,Object _value,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putencyptedobject"))
	return (Boolean) Debug.delegate(ba, "putencyptedobject", new Object[] {_key,_value,_password});
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub PutEncyptedObject(Key As String, Value";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return putObjectInternal(Key, Value, True, Passwo";
if (true) return __ref._putobjectinternal(null,_key,_value,__c.True,_password);
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return false;
}
public boolean  _putobjectinternal(com.bcleaner.keyvaluestore __ref,String _key,Object _value,boolean _encrypt,String _password) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putobjectinternal"))
	return (Boolean) Debug.delegate(ba, "putobjectinternal", new Object[] {_key,_value,_encrypt,_password});
anywheresoftware.b4a.randomaccessfile.RandomAccessFile _raf = null;
byte[] _buffer = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Private Sub putObjectInternal(Key As String, Value";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Try";
try {RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Dim raf As RandomAccessFile";
_raf = new anywheresoftware.b4a.randomaccessfile.RandomAccessFile();
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="File.Delete(tempFolder, tempFile)";
__c.File.Delete(__ref._tempfolder,__ref._tempfile);
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="raf.Initialize(tempFolder, tempFile, False)";
_raf.Initialize(__ref._tempfolder,__ref._tempfile,__c.False);
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="If encrypt Then";
if (_encrypt) { 
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="raf.WriteEncryptedObject(Value, password, raf.C";
_raf.WriteEncryptedObject(_value,_password,_raf.CurrentPosition);
 }else {
RDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="raf.WriteObject(Value, True, raf.CurrentPositio";
_raf.WriteObject(_value,__c.True,_raf.CurrentPosition);
 };
RDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="raf.Flush";
_raf.Flush();
RDebugUtils.currentLine=2228236;
 //BA.debugLineNum = 2228236;BA.debugLine="Dim buffer(raf.CurrentPosition) As Byte";
_buffer = new byte[(int) (_raf.CurrentPosition)];
;
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="raf.ReadBytes(buffer, 0, buffer.Length, 0)";
_raf.ReadBytes(_buffer,(int) (0),_buffer.length,(long) (0));
RDebugUtils.currentLine=2228238;
 //BA.debugLineNum = 2228238;BA.debugLine="raf.Close";
_raf.Close();
RDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="insertQuery(Key, buffer)";
__ref._insertquery(null,_key,(Object)(_buffer));
RDebugUtils.currentLine=2228240;
 //BA.debugLineNum = 2228240;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=2228242;
 //BA.debugLineNum = 2228242;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=2228244;
 //BA.debugLineNum = 2228244;BA.debugLine="End Sub";
return false;
}
public boolean  _putinputstream(com.bcleaner.keyvaluestore __ref,String _key,anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putinputstream"))
	return (Boolean) Debug.delegate(ba, "putinputstream", new Object[] {_key,_value});
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub PutInputStream(Key As String, Value As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="start(Key)";
__ref._start(null,_key);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="out.InitializeToBytesArray(100)";
_out.InitializeToBytesArray((int) (100));
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="File.Copy2(Value, out)";
__c.File.Copy2((java.io.InputStream)(_value.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Value.Close";
_value.Close();
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="insertQuery(Key, out.ToBytesArray)";
__ref._insertquery(null,_key,(Object)(_out.ToBytesArray()));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Return complete(True)";
if (true) return __ref._complete(null,__c.True);
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="Return complete(False)";
if (true) return __ref._complete(null,__c.False);
 };
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="End Sub";
return false;
}
public boolean  _putobject(com.bcleaner.keyvaluestore __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "putobject"))
	return (Boolean) Debug.delegate(ba, "putobject", new Object[] {_key,_value});
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub PutObject(Key As String, Value As Objec";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return putObjectInternal(Key, Value, False, \"\")";
if (true) return __ref._putobjectinternal(null,_key,_value,__c.False,"");
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return false;
}
public String  _remove(com.bcleaner.keyvaluestore __ref,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="keyvaluestore";
if (Debug.shouldDelegate(ba, "remove"))
	return (String) Debug.delegate(ba, "remove", new Object[] {_key});
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub Remove(Key As String)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="sql1.ExecNonQuery2(\"DELETE FROM main WHERE key =";
__ref._sql1.ExecNonQuery2("DELETE FROM main WHERE key = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_key)}));
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
}