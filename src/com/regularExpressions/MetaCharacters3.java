package com.regularExpressions;

import java.util.regex.Pattern;

public class MetaCharacters3 {

	public static void main(String[] args) {

		// D means only one non digit can match.
		// special characters are also considered.
		// digits will return false.
		// more than one character in string will return false.

		boolean b1 = Pattern.matches("\\D", "abc");
		System.out.println(b1);

		boolean b11 = Pattern.matches("\\D", "");
		System.out.println(b11);

		boolean b111 = Pattern.matches("\\D", "WERERW");
		System.out.println(b111);

		boolean b1111 = Pattern.matches("\\D", "ewreEWREWR324234@#$#@$");
		System.out.println(b1111);

		boolean b11111 = Pattern.matches("\\D", "a");
		System.out.println(b11111);

		boolean b111111 = Pattern.matches("\\D", "&");
		System.out.println(b111111);

		boolean b1111111 = Pattern.matches("\\D", "6");
		System.out.println(b1111111);

		boolean b11111111 = Pattern.matches("\\D", "643242343");
		System.out.println(b11111111);

		boolean b111111111 = Pattern.matches("\\D", "6432.42343");
		System.out.println(b111111111);

		boolean b1111111111 = Pattern.matches("\\D", "66");
		System.out.println(b1111111111);

		boolean b11111111111 = Pattern.matches("\\D", "yy");
		System.out.println(b11111111111);
	}

}
