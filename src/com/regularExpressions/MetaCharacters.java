package com.regularExpressions;

import java.util.regex.Pattern;

public class MetaCharacters {

	public static void main(String[] args) {

		// \\d – any digit between 0-9. Only one digit at a time.
		// \\D – any non digit allowed.

		// In reality we need to use quantifiers to use regex effectively.

		// \\d will return true if we get exactly one digit.
		// if more than one digit we get false.
		// \\d will return false if we add strings.

		boolean b1 = Pattern.matches("\\d", "abc");
		System.out.println(b1);

		boolean b11 = Pattern.matches("\\d", "");
		System.out.println(b11);

		boolean b111 = Pattern.matches("\\d", "WERERW");
		System.out.println(b111);

		boolean b1111 = Pattern.matches("\\d", "ewreEWREWR324234@#$#@$");
		System.out.println(b1111);

		boolean b11111 = Pattern.matches("\\d", "a");
		System.out.println(b11111);

		boolean b111111 = Pattern.matches("\\d", "&");
		System.out.println(b111111);

		boolean b1111111 = Pattern.matches("\\d", "6");
		System.out.println(b1111111);

		boolean b11111111 = Pattern.matches("\\d", "643242343");
		System.out.println(b11111111);

		boolean b111111111 = Pattern.matches("\\d", "6432.42343");
		System.out.println(b111111111);

		boolean b1111111111 = Pattern.matches("\\d", "66");
		System.out.println(b1111111111);

		boolean b11111111111 = Pattern.matches("\\d", "yy");
		System.out.println(b11111111111);
	}

}
