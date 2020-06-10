package com.rashid.abrar.DIP;

public class ProductCatalog {
	
	public void listAllProduct() {
		
		ProductRepository productRepository = ProductFactory.create();
		
		productRepository.getAllProductNames();
		//list all products here
	}

}




