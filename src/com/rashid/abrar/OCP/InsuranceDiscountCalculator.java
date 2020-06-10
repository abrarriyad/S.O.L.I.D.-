package com.rashid.abrar.OCP;

public class InsuranceDiscountCalculator {

	public int calculateDiscount(CustomerProfile customer) {
		if (customer.isLoyalCustomer()) {
			return 20;
		}
		return 0;
	}

}



