package com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistration {
	Scanner scan = new Scanner(System.in);

	String inputFirstName() {
		System.out.println("Enter First Name");
		String firstname = scan.next();
		return firstname;
	}

	String inputLastName() {
		System.out.println("Enter Last Name");
		String lastname = scan.next();
		return lastname;

	}

	String inputEmail() {
		System.out.println("Enter Email Id");
		String email = scan.next();
		return email;

	}
}
