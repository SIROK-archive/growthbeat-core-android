package com.growthbeat.utils;

import org.json.JSONObject;

public class JSONObjectUtils {

	public static boolean hasAndIsNotNull(JSONObject jsonObject, String name) {
		return (jsonObject.has(name) && !jsonObject.isNull(name));
	}

}
