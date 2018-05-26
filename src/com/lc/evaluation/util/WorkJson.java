package com.lc.evaluation.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class WorkJson {

	public static Gson gsonH = new GsonBuilder()
			.serializeNulls()
			.disableHtmlEscaping().create();
	
	public static String toJsonDisableHtmlEscaping(Object obj){
		return gsonH.toJson(obj).replaceAll("null", "\"\"");
	}
	
}
