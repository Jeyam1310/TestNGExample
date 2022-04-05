package org.hii;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEqualNotEqual {

	String n ="Agni";
	
	@Test
	private void check() {
		/*if (n.equals("Agni")) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}*/
		
		//Above string value is Agni but here agni
		/*Assert.assertEquals(n, "agni");*/
		
		//Above string value is Agni but here agni so condition failed and also checking is NOtEqual so executed
		/*Assert.assertNotEquals(n, "agni");*/
		
		
				
	}
}
