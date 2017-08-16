package com.cleanerb.de.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_ta1{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("lv4").vw.setLeft((int)((1d * scale)));
views.get("lv4").vw.setWidth((int)((99d / 100 * width) - ((1d * scale))));
views.get("lv4").vw.setTop((int)((1d * scale)));
views.get("lv4").vw.setHeight((int)((99d / 100 * height) - ((1d * scale))));

}
}