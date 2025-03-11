package com.bbva.wikj.lib.r888.impl;

import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WIKJR888Impl extends WIKJR888Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR888Impl.class);

	@Override
	public DtoOut execute(DtoIn dtoIn) {
		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();
		args.put("id", dtoIn.getId());
		args.put("id", dtoIn.getNuip());
		args.put("id", dtoIn.getFullname());
		args.put("id", dtoIn.getPhone());
		args.put("id", dtoIn.getAddress());
		int result = this.wikjR889.executeInsert(args);
		if(result == 1) {
			System.out.println("Tipo de dtoIn.getId(): " + (dtoIn.getId() != null ? dtoIn.getId().getClass() : "null"));
			Map<String, Object> response = this.wikjR889.executeSelect(dtoIn.getId());
			dtoOut.setId(((Number) response.get("id")).longValue());
			dtoOut.setNuip(((Number) response.get("nuip")).intValue());
			dtoOut.setFullname(response.get("full_name").toString());
			dtoOut.setPhone(response.get("phone").toString());
			dtoOut.setAddress(response.get("address").toString());

		}
		return dtoOut;
	}
}
