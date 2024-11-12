package com.regularExpressions;

import java.util.regex.Pattern;

public class CharacterClasses2 {

	public static void main(String[] args) {

		// None of the characters present in the bracket should match. If there are no
		// characters from brackets in string, then it returns true, else even if one of
		// the characters from bracket present in string, then it returns false.

		// we need to match for only one character.

		// since string is more than one character, so false.
		boolean b1 = Pattern.matches("[^amn]", "abcd");
		System.out.println(b1);

		// since string is more than one character, so false.
		boolean b2 = Pattern.matches("[^amn]", "abcdmn");
		System.out.println(b2);

		// since string is more than one character, so false.
		boolean b3 = Pattern.matches("[^amn]", "amn");
		System.out.println(b3);

		// since string is more than one character, so false.
		boolean b4 = Pattern.matches("[^amn]", "a");
		System.out.println(b4);

		// since string is more than one character, so false.
		boolean b5 = Pattern.matches("[^amn]", "n");
		System.out.println(b5);

		// since string is more than one character, so false.
		boolean b6 = Pattern.matches("[^amn]", "mn");
		System.out.println(b6);

		// since string is more than one character, so false.
		boolean b7 = Pattern.matches("[^amn]", "ammaa");
		System.out.println(b7);

		// since string is more than one character, so false.
		boolean b8 = Pattern.matches("[^amn]", "yuytu56756546%^%^#$%%");
		System.out.println(b8);

		// here we get true, because string is of one character.
		// also we need to match strings which do not contain either "a or m or n".
		boolean b9 = Pattern.matches("[^amn]", "b");
		System.out.println(b9);
	}

}
