package com.luckyend.flatmapper;

import java.util.Map;

public interface FlatMapper<R> {

	R convertFromFlatMap(Map<String, Object> flatMapFrom);

	R convertFromFlatMap(Map<String, Object> flatMapFrom, boolean createCopy);

	Map<String, Object> convertToFlatMap(R jsonFrom);
	
}