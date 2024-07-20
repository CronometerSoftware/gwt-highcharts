package com.cronometer.gwt.highcharts.client;

import com.google.gwt.json.client.JSONNumber;
import com.google.gwt.json.client.JSONString;
import com.google.gwt.json.client.JSONObject;

public class PatternFill {

   private JSONObject patternObject = new JSONObject();

   public PatternFill() {
   }

   public PatternFill setPath(String path, String pathFill) {
      JSONObject pathObject = new JSONObject();
      pathObject.put("d", new JSONString(path));
      pathObject.put("fill", new JSONString(pathFill));
      patternObject.put("path", pathObject);
      return this;
   }

   public PatternFill setWidth(int width) {
      patternObject.put("width", new JSONNumber(width));
      return this;
   }

   public PatternFill setHeight(int height) {
      patternObject.put("height", new JSONNumber(height));
      return this;
   }

   public PatternFill setColor(String color) {
      patternObject.put("color", new JSONString(color));
      return this;
   }

   public PatternFill setOpacity(double opacity) {
      patternObject.put("opacity", new JSONNumber(opacity));
      return this;
   }

   public JSONObject getPatternObject() {
      return patternObject;
   }
}