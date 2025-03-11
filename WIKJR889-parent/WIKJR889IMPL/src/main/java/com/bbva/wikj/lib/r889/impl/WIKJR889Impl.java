package com.bbva.wikj.lib.r889.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigDecimal;
import java.util.Map;

public class WIKJR889Impl extends WIKJR889Abstract {  // Si hereda de WIKJR889Abstract

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR889Impl.class);

	@Override
	public Map<String, Object> executeSelect(Long id) {
		Map<String, Object> response = this.jdbcUtils.queryForMap("query.query1", id);

		// Convertir `ID` y `NUIP` de BigDecimal a Long si es necesario
		if (response.get("ID") instanceof BigDecimal) {
			response.put("ID", ((BigDecimal) response.get("ID")).longValue());
		}
		if (response.get("NUIP") instanceof BigDecimal) {
			response.put("NUIP", ((BigDecimal) response.get("NUIP")).longValue());
		}

		return response;
	}

	@Override
	public int executeInsert(Map<String, Object> args) {
		return this.jdbcUtils.update("query.query2", args);
	}
}
