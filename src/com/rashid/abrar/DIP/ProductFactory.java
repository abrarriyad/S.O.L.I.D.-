package com.rashid.abrar.DIP;

public class ProductFactory {
	
	public static ProductRepository create() {
		return new SQLProductRepository();
	}

}


