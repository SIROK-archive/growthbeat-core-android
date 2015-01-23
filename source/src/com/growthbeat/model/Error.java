package com.growthbeat.model;

import org.json.JSONException;
import org.json.JSONObject;

import com.growthbeat.utils.JSONObjectUtils;

public class Error extends Model {

	private int code;
	private String message;

	public Error() {
		super();
	}

	public Error(int code, String message) {
		this();
		setCode(code);
		setMessage(message);
	}

	public Error(JSONObject jsonObject) {
		this();
		setJsonObject(jsonObject);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public JSONObject getJsonObject() {
		return null;
	}

	@Override
	public void setJsonObject(JSONObject jsonObject) {

		try {
			if (JSONObjectUtils.hasAndIsNotNull(jsonObject, "code"))
				setCode(jsonObject.getInt("code"));
			if (JSONObjectUtils.hasAndIsNotNull(jsonObject, "message"))
				setMessage(jsonObject.getString("message"));
		} catch (JSONException e) {
			throw new IllegalArgumentException("Failed to parse JSON.");
		}

	}

}