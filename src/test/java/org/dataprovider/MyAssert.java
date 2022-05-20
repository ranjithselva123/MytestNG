package org.dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAssert {
	@Test
	private void username() {
		System.out.println("username");
		System.out.println("**");
	}
	@Test(groups="signup")
	private void mobile() {
		System.out.println("mobile no");
	}
	@Test
	private void password() {
		System.out.println("password");
	}
	@Test(groups="signup")
	private void lastname() {
		System.out.println("lastname");
	}
	@Test
	private void loginbtn() {
		System.out.println("login");
	}
	@Test(groups="signup")
	private void firstname() {
		System.out.println("firstname");
	}
	@Test(groups="signup")
	private void signup() {
		Assert.assertTrue(false, "verify btnsignup");
		System.out.println("signup");
	}
	@Test(dependsOnMethods ="signup")
	private void englishlink() {
		System.out.println("link english");
	}
}
