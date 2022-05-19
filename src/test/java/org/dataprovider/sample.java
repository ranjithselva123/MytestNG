package org.dataprovider;

import org.testng.annotations.Test;

public class sample {
	@Test
	private void username() {
		System.out.println("username");
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
		System.out.println("signup");
	}
}
