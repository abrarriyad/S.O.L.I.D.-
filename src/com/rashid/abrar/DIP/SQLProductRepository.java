package com.rashid.abrar.DIP;

import java.util.*;

public class SQLProductRepository implements ProductRepository {

	public List<String> getAllProductNames() {

		return Arrays.asList("soap", "toothpaste");
	}

}


