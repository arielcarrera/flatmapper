package com.luckyend.flatmapper.functions;

import java.util.Map;
import java.util.function.Function;

public interface FunctionMapFactory<R> {

	Map<String, Function<String[], R>> getFunctionMap();
	
}