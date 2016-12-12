package com.ots.services;

import java.util.List;

import com.ots.dto.BirthData;

/**
 * 
 * @author domna
 *
 */
public interface LocationService {

	/**
	 * Ανάκτηση λίστας ανθρώπων γεννημένοι στη δοθείσα περιοχή
	 * @param description
	 * @return
	 */
	public List<BirthData> getPersonsBornInLocationByDescription(String description);
}
