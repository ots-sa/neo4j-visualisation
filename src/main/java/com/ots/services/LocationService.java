package com.ots.services;

import java.util.List;
import java.util.Set;

import com.ots.core.domain.Person;
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
