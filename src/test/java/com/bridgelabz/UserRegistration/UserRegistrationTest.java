package com.bridgelabz.UserRegistration;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void checkFirstName() {
		UserRegistration object = new UserRegistration();
		String result = object.inputFirstName();
		assertTrue(result.matches("^[A-Z]{1}[a-z]{2,}$"));
	}

	@After
	public void checkLastName() {
		UserRegistration object = new UserRegistration();
		String result = object.inputLastName();
		assertTrue(result.matches("^[A-Z]{1}[a-z]{2,}$"));
	}

}
