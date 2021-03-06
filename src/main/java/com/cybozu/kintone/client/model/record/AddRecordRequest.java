/**
 * MIT License
 *
 * Copyright (c) 2018 Cybozu
 * https://github.com/kintone/kintone-java-sdk/blob/master/LICENSE
 */

package com.cybozu.kintone.client.model.record;

import java.util.HashMap;

import com.cybozu.kintone.client.model.record.field.FieldValue;

public class AddRecordRequest {

	private Integer app;
	private HashMap<String, FieldValue> record;

	/**
	 * Constructor
	 * @param app
	 * @param record
	 */
	public AddRecordRequest(Integer app, HashMap<String, FieldValue> record) {
		this.app = app;
		this.record = record;
	}
}
