package org.parameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test
	private void username() {
		System.out.println("login username");
	}

	@Test(groups = "signup")
	private void firstName() {
		System.out.println("signup firstName");
	}

	@Test
	private void password() {
		System.out.println("login password");
	}

	@Test(groups = "signup")
	private void lastName() {
		System.out.println("signup lastName");
	}

	@Test
	private void btnLogin() {
		System.out.println("login btnLogin");
	}

	@Test
	private void tamilLink() {
		System.out.println("link tamil");
	}

	@Test(groups = "signup")
	private void mobile() {
		System.out.println("signup mobile");
	}

	@Test(groups = "signup")
	private void btnSignup() {
		Assert.assertTrue(false, "verify btnsignup");
		System.out.println("signup btnSignup");
	}

	@Test(dependsOnMethods="btnSignup")
	private void englishLink() {
		System.out.println("link englisj");
	}

}
