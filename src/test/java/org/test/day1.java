package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class day1 {

	SoftAssert s = new SoftAssert();
	@Test
	public void test() {
		s.assertTrue(true, "verify test ");
		System.out.println("test");
	}

	@Test
	public void test1() {
		s.assertTrue(false, "verify test1 ");
		System.out.println("test1");
	}

	
	@Test
	public void test2() {
		s.assertEquals(10, 10,"verify test2 ");
		System.out.println("test2");
	}

	
	@Test
	public void test3() {
		s.assertEquals(10, 100,"verify test3");
		System.out.println("test3");
	}


	@Test
	public void test4() {
		s.assertEquals("Nisha", "nisha","verify test4");
		System.out.println("test4");
		s.assertAll();
	}
	

	@Test
	public void test5() {
		s.assertEquals("Nisha", "Nisha","verify test5");
		System.out.println("test5");
	}
}
