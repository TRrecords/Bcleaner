package com.cleanerb.de.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_ta2{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("sb1").vw.setTop((int)((0d * scale)));
views.get("sb1").vw.setHeight((int)((11d / 100 * height) - ((0d * scale))));
views.get("sb1").vw.setLeft((int)((0d * scale)));
views.get("sb1").vw.setWidth((int)((100d / 100 * width) - ((0d * scale))));
views.get("lv5").vw.setLeft((int)((3d * scale)));
views.get("lv5").vw.setWidth((int)((99d / 100 * width) - ((3d * scale))));
views.get("lv5").vw.setTop((int)((11d / 100 * height)));
views.get("lv5").vw.setHeight((int)((997d / 100 * height) - ((11d / 100 * height))));

}
}