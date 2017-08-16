package com.cleanerb.de.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 3;BA.debugLine="toolbar.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("toolbar").vw.setLeft((int)((0d * scale)));
views.get("toolbar").vw.setWidth((int)((100d / 100 * width) - ((0d * scale))));
//BA.debugLineNum = 4;BA.debugLine="toolbar.Top=0dip"[1/General script]
views.get("toolbar").vw.setTop((int)((0d * scale)));
//BA.debugLineNum = 5;BA.debugLine="toolbar.Height=53dip"[1/General script]
views.get("toolbar").vw.setHeight((int)((53d * scale)));
//BA.debugLineNum = 6;BA.debugLine="tab1.SetTopAndBottom(10%y,65%y)"[1/General script]
views.get("tab1").vw.setTop((int)((10d / 100 * height)));
views.get("tab1").vw.setHeight((int)((65d / 100 * height) - ((10d / 100 * height))));
//BA.debugLineNum = 7;BA.debugLine="Panel2.SetTopAndBottom(65%y,99%y)"[1/General script]
views.get("panel2").vw.setTop((int)((65d / 100 * height)));
views.get("panel2").vw.setHeight((int)((99d / 100 * height) - ((65d / 100 * height))));
//BA.debugLineNum = 8;BA.debugLine="Cbutton.SetTopAndBottom(68%y,95%y)"[1/General script]
views.get("cbutton").vw.setTop((int)((68d / 100 * height)));
views.get("cbutton").vw.setHeight((int)((95d / 100 * height) - ((68d / 100 * height))));
//BA.debugLineNum = 9;BA.debugLine="Cbutton.SetLeftAndRight(60%x,95%x)"[1/General script]
views.get("cbutton").vw.setLeft((int)((60d / 100 * width)));
views.get("cbutton").vw.setWidth((int)((95d / 100 * width) - ((60d / 100 * width))));
//BA.debugLineNum = 10;BA.debugLine="Cbutton.Right=67%X"[1/General script]
views.get("cbutton").vw.setLeft((int)((67d / 100 * width) - (views.get("cbutton").vw.getWidth())));
//BA.debugLineNum = 11;BA.debugLine="Label4.Right=65%X"[1/General script]
views.get("label4").vw.setLeft((int)((65d / 100 * width) - (views.get("label4").vw.getWidth())));
//BA.debugLineNum = 13;BA.debugLine="Label4.SetTopAndBottom(75%y,87%y)"[1/General script]
views.get("label4").vw.setTop((int)((75d / 100 * height)));
views.get("label4").vw.setHeight((int)((87d / 100 * height) - ((75d / 100 * height))));
//BA.debugLineNum = 14;BA.debugLine="afb1.SetTopAndBottom(60%y,70%y)"[1/General script]
views.get("afb1").vw.setTop((int)((60d / 100 * height)));
views.get("afb1").vw.setHeight((int)((70d / 100 * height) - ((60d / 100 * height))));
//BA.debugLineNum = 15;BA.debugLine="afb1.Height=130dip"[1/General script]
views.get("afb1").vw.setHeight((int)((130d * scale)));
//BA.debugLineNum = 16;BA.debugLine="afb1.Width=130dip"[1/General script]
views.get("afb1").vw.setWidth((int)((130d * scale)));
//BA.debugLineNum = 17;BA.debugLine="afb1.Top=67%y"[1/General script]
views.get("afb1").vw.setTop((int)((67d / 100 * height)));
//BA.debugLineNum = 18;BA.debugLine="afb1.Left=30%x"[1/General script]
views.get("afb1").vw.setLeft((int)((30d / 100 * width)));

}
}