package com.regularExpressions;

import java.util.regex.Pattern;

public class CharacterClasses3 {

	public static void main(String[] args) {

		// only character allowed in string.
		// only one character to be matched.
		// Only alphabets are allowed.
		// They include a-z and A-Z.

		// since string is more than one character, so false.
		boolean b1 = Pattern.matches("[a-zA-Z]", "abcd");
		System.out.println(b1);

		// since string is more than one character, so false.
		boolean b2 = Pattern.matches("[a-zA-Z]", "abcdmn");
		System.out.println(b2);

		// since string is more than one character, so false.
		boolean b3 = Pattern.matches("[a-zA-Z]", "amn");
		System.out.println(b3);

		// since string is equal to one character, so true.
		boolean b4 = Pattern.matches("[a-zA-Z]", "a");
		System.out.println(b4);

		// since string is equal to one character, so true.
		boolean b5 = Pattern.matches("[a-zA-Z]", "n");
		System.out.println(b5);

		// since string is more than one character, so false.
		boolean b6 = Pattern.matches("[a-zA-Z]", "mn");
		System.out.println(b6);

		// since string is more than one character, so false.
		boolean b7 = Pattern.matches("[a-zA-Z]", "ammaa");
		System.out.println(b7);

		// since string is more than one character, so false.
		boolean b8 = Pattern.matches("[a-zA-Z]", "yuytu56756546%^%^#$%%");
		System.out.println(b8);

		// here we get true, because string is of one character.
		// also we need to match strings which are in a-z or A-Z
		boolean b9 = Pattern.matches("[a-zA-Z]", "b");
		System.out.println(b9);
	}

}
