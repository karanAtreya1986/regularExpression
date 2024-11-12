package com.regularExpressions;

import java.util.regex.Pattern;

public class MetaCharacters2 {

	public static void main(String[] args) {

		// d can take in integer numbers only, even decimals return false.
		// * means zero or infinite times.

		boolean b1 = Pattern.matches("\\d*", "abc");
		System.out.println(b1);

		boolean b11 = Pattern.matches("\\d*", "");
		System.out.println(b11);

		boolean b111 = Pattern.matches("\\d*", "WERERW");
		System.out.println(b111);

		boolean b1111 = Pattern.matches("\\d*", "ewreEWREWR324234@#$#@$");
		System.out.println(b1111);

		boolean b11111 = Pattern.matches("\\d*", "a");
		System.out.println(b11111);

		boolean b111111 = Pattern.matches("\\d*", "&");
		System.out.println(b111111);

		boolean b1111111 = Pattern.matches("\\d*", "6");
		System.out.println(b1111111);

		boolean b11111111 = Pattern.matches("\\d*", "643242343");
		System.out.println(b11111111);

		boolean b111111111 = Pattern.matches("\\d*", "6432.42343");
		System.out.println(b111111111);

		boolean b1111111111 = Pattern.matches("\\d*", "66");
		System.out.println(b1111111111);

		boolean b11111111111 = Pattern.matches("\\d*", "yy");
		System.out.println(b11111111111);
	}

}
