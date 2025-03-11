package com.bbva.wikj.lib.r889.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class WIKJR889Impl extends WIKJR889Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR889Impl.class);


	public Map<String, Object> executeSelect(String userid) {
		return this.jdbcUtils.queryForMap("query.query1", userid);
	}

	public int executeInsert(Map<String, Object> args) {
		return this.jdbcUtils.update("query.query2", args);
	}
}
