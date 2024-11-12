package com.regularExpressions;

import java.util.regex.Pattern;

public class ProblemStatementTwo {

	public static void main(String[] args) {

		// Input should start with 7 or 8 or 9.
		// After that we can have nine digits.

		// true
		boolean b1 = Pattern.matches("[789]{1}[0-9]{9}", "7123456789");
		System.out.println(b1);

		// false
		boolean b2 = Pattern.matches("[789]{1}[0-9]{9}", "7123456789.564rtyry");
		System.out.println(b2);

		// true
		boolean b3 = Pattern.matches("[789]{1}[0-9]{9}", "8123456789");
		System.out.println(b3);

		// true
		boolean b4 = Pattern.matches("[789]{1}[0-9]{9}", "9123456789");
		System.out.println(b4);

		// false
		boolean b5 = Pattern.matches("[789]{1}[0-9]{9}", "7123456789.");
		System.out.println(b5);

		// false
		boolean b6 = Pattern.matches("[789]{1}[0-9]{9}", "7123456789t");
		System.out.println(b6);

		// false
		boolean b7 = Pattern.matches("[789]{1}[0-9]{9}", "6123456789");
		System.out.println(b7);

		// false
		boolean b8 = Pattern.matches("[789]{1}[0-9]{9}", "612345789");
		System.out.println(b8);
	}

}
