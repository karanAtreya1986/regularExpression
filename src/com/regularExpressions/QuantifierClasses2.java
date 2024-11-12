package com.regularExpressions;

import java.util.regex.Pattern;

public class QuantifierClasses2 {

	public static void main(String[] args) {

		// + says the value can come minimum once or infinite times.

		// matching with pattern rule so true.
		boolean b1 = Pattern.matches("[a-zA-Z]+", "abcd");
		System.out.println(b1);

		// matching with pattern rule so true.
		boolean b2 = Pattern.matches("[a-zA-Z]+", "abcdmn");
		System.out.println(b2);

		// matching with pattern rule so true.
		boolean b3 = Pattern.matches("[a-zA-Z]+", "amn");
		System.out.println(b3);

		// matching with pattern rule so true.
		boolean b4 = Pattern.matches("[a-zA-Z]+", "a");
		System.out.println(b4);

		// matching with pattern rule so true.
		boolean b5 = Pattern.matches("[a-zA-Z]+", "n");
		System.out.println(b5);

		// matching with pattern rule so true.
		boolean b6 = Pattern.matches("[a-zA-Z]+", "mn");
		System.out.println(b6);

		// matching with pattern rule so true.
		boolean b7 = Pattern.matches("[a-zA-Z]+", "ammaa");
		System.out.println(b7);

		// here its false because only a-z, A-Z are allowed once or infinite times.
		boolean b8 = Pattern.matches("[a-zA-Z]+", "yuytu56756546%^%^#$%%");
		System.out.println(b8);

		// here we get true, because string is of one character.
		boolean b9 = Pattern.matches("[a-zA-Z]+", "b");
		System.out.println(b9);

		// here we get false because the characters a-z or A-Z can occur once or
		// infinite times.
		boolean b10 = Pattern.matches("[a-zA-Z]+", "");
		System.out.println(b10);

		// value will be true as the rules.
		boolean b11 = Pattern.matches("[a-zA-Z]+", "aaaa");
		System.out.println(b11);
	}

}
