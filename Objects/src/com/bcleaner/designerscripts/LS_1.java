package com.bcleaner.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[1/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="Panel1.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("panel1").vw.setLeft((int)((0d * scale)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d * scale))));
//BA.debugLineNum = 4;BA.debugLine="Panel2.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("panel2").vw.setLeft((int)((0d * scale)));
views.get("panel2").vw.setWidth((int)((100d / 100 * width) - ((0d * scale))));
//BA.debugLineNum = 5;BA.debugLine="Panel1.SetTopAndBottom(40dip,75%y)"[1/General script]
views.get("panel1").vw.setTop((int)((40d * scale)));
views.get("panel1").vw.setHeight((int)((75d / 100 * height) - ((40d * scale))));
//BA.debugLineNum = 6;BA.debugLine="Panel2.SetTopAndBottom(70%y,100%y)"[1/General script]
views.get("panel2").vw.setTop((int)((70d / 100 * height)));
views.get("panel2").vw.setHeight((int)((100d / 100 * height) - ((70d / 100 * height))));
//BA.debugLineNum = 7;BA.debugLine="cb1.SetLeftAndRight(22%x,77%x)"[1/General script]
views.get("cb1").vw.setLeft((int)((22d / 100 * width)));
views.get("cb1").vw.setWidth((int)((77d / 100 * width) - ((22d / 100 * width))));
//BA.debugLineNum = 8;BA.debugLine="pg.SetLeftAndRight(10%x,90%x)"[1/General script]
views.get("pg").vw.setLeft((int)((10d / 100 * width)));
views.get("pg").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 9;BA.debugLine="cb1.SetTopAndBottom(5%y,48%y)"[1/General script]
views.get("cb1").vw.setTop((int)((5d / 100 * height)));
views.get("cb1").vw.setHeight((int)((48d / 100 * height) - ((5d / 100 * height))));
//BA.debugLineNum = 10;BA.debugLine="pg.SetTopAndBottom(10%y,70%y)"[1/General script]
views.get("pg").vw.setTop((int)((10d / 100 * height)));
views.get("pg").vw.setHeight((int)((70d / 100 * height) - ((10d / 100 * height))));
//BA.debugLineNum = 11;BA.debugLine="Label1.SetLeftAndRight(1%x,99%x)"[1/General script]
views.get("label1").vw.setLeft((int)((1d / 100 * width)));
views.get("label1").vw.setWidth((int)((99d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 12;BA.debugLine="Label1.Height=40dip"[1/General script]
views.get("label1").vw.setHeight((int)((40d * scale)));
//BA.debugLineNum = 13;BA.debugLine="Label1.Top=285dip"[1/General script]
views.get("label1").vw.setTop((int)((285d * scale)));
//BA.debugLineNum = 14;BA.debugLine="Label2.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("label2").vw.setLeft((int)((0d * scale)));
views.get("label2").vw.setWidth((int)((100d / 100 * width) - ((0d * scale))));
//BA.debugLineNum = 15;BA.debugLine="Label3.SetLeftAndRight(0dip,100%x)"[1/General script]
views.get("label3").vw.setLeft((int)((0d * scale)));
views.get("label3").vw.setWidth((int)((100d / 100 * width) - ((0d * scale))));

}
}