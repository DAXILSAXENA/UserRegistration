package com.bridgelabz.UserRegistration;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void checkFirstName() {
		UserRegistration object = new UserRegistration();
		String result = object.inputFirstName();
		assertTrue(result.matches("^[A-Z]{1}[a-z]{2,}$"));
	}
}
