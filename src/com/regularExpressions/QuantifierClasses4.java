package com.regularExpressions;

import java.util.regex.Pattern;

public class QuantifierClasses4 {

	public static void main(String[] args) {

		// only one character can match zero or infinite times.
		// either "a or m or n" in string can be present zero or infinite times.
		// any other character in string will straight away make it false.

		// not matching with pattern rule so false.
		boolean b1 = Pattern.matches("[amn]*", "abcd");
		System.out.println(b1);

		// not matching with pattern rule so false.
		boolean b2 = Pattern.matches("[amn]*", "abcdmn");
		System.out.println(b2);

		// matching with pattern rule so true.
		boolean b3 = Pattern.matches("[amn]*", "amn");
		System.out.println(b3);

		// matching with pattern rule so true.
		boolean b4 = Pattern.matches("[amn]*", "a");
		System.out.println(b4);

		// matching with pattern rule so true.
		boolean b5 = Pattern.matches("[amn]*", "n");
		System.out.println(b5);

		// matching with pattern rule so true.
		boolean b6 = Pattern.matches("[amn]*", "mn");
		System.out.println(b6);

		// matching with pattern rule so true.
		boolean b7 = Pattern.matches("[amn]*", "ammaa");
		System.out.println(b7);

		// here its false because not matching the rules.
		boolean b8 = Pattern.matches("[amn]*", "yuytu56756546%^%^#$%%");
		System.out.println(b8);

		// value will be true as the rules.
		boolean b9 = Pattern.matches("[amn]*", "b");
		System.out.println(b9);

		// value will be true as the rules.
		boolean b10 = Pattern.matches("[amn]*", "");
		System.out.println(b10);

		// value will be true as the rules.
		boolean b11 = Pattern.matches("[amn]*", "aaaa");
		System.out.println(b11);
	}

}
