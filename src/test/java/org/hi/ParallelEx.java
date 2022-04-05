package org.hi;

import org.testng.annotations.Test;

import base.BaseC;

public class ParallelEx extends BaseC{

	@Test
	private void openGoogle() {
			getDriver();
			loadUrl("https://www.google.com/");
	}
	@Test
	private void openBing() {
			getDriver();
			loadUrl("https://www.bing.com/");
	}
	
	
}
