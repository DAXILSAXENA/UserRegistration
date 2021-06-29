package com.bridgelabz.UserRegistration;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {

	@Before
	public void checkFirstName() {
		UserRegistration object = new UserRegistration();
		String result = object.inputFirstName();
		assertTrue(result.matches("^[A-Z]{1}[a-z]{2,}$"));
	}

	@Test
	public void checkLastName() {
		UserRegistration object = new UserRegistration();
		String result = object.inputLastName();
		assertTrue(result.matches("^[A-Z]{1}[a-z]{2,}$"));
	}

	@After
	public void checkEmail() {
		UserRegistration object = new UserRegistration();
		String result = object.inputEmail();
		assertTrue(result.matches("[A-Za-z0-9._+%-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,4}"));
	}

}
