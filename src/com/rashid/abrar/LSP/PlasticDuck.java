package com.rashid.abrar.LSP;

import java.util.*;



class Duck{
	
	public void quack() {
		System.out.println("quaaakkk....quak...quaaaak");
	}
	
	
	public void fly() {
		//logic about flying 
	}
}

class RealDuck extends Duck{
	
	
}

public class PlasticDuck extends Duck{

	
	public void flyWithBattery() {
		//gaining power from batteries
		// artificial flying
	}
	
	@Override
	public void fly() {
		flyWithBattery();
	}


	
	



	public static void main(String[] args) {
		
		Duck duck1 = new RealDuck();
		Duck duck2 = new RealDuck();
		Duck duck3 = new PlasticDuck();
		
		
		List<Duck> ducks = new ArrayList<Duck>();
		
		for(Duck duck: ducks) {
				duck.fly();
		}
		
	}

}









