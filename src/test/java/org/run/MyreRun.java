package org.run;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyreRun {
	@Test
	private void test() {
		Assert.assertTrue(true);
	}
	@Test
	private void test1() {
		Assert.assertTrue(true);
	}
	@Test(retryAnalyzer = ManualRerun.class )
	private void test2() {
		Assert.assertTrue(false);
	}
	@Test
	private void test3() {
		Assert.assertTrue(true);
	}
	@Test(retryAnalyzer = ManualRerun.class )
	private void test4() {
		Assert.assertTrue(false);
	}
	@Test
	private void test5() {
		Assert.assertTrue(true);
	}
}
