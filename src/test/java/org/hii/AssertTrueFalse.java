package org.hii;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueFalse {

	boolean v=false;
	
	@Test
	private void check() {
		/*//Here condtion true but arguments of boolean v=false s0 error if boolean value will give true will executed
		Assert.assertTrue(v, "This is not valid");
*/		
		//Here condition false and also arguments of boolean also flase so executed if boolean value will give true error
		Assert.assertFalse(v, "This is valid");
	}
}

