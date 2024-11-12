package com.regularExpressions;

import java.util.regex.Pattern;

public class CharacterClasses {

	public static void main(String[] args) {

		// inside [] -- matches only one characer, either "a or m or n".
		// in the string, where we search if there is only one character and it matches
		// either "a" or "m" or "n".
		// [] – whatever is there in square bracket, only one of them should be present
		// in the input string. If more alphabets match, then it returns false.

		// There cannot be more than one character in string.

		// here we have "abcd" so false.
		boolean b1 = Pattern.matches("[amn]", "abcd");
		System.out.println(b1);

		// here we have "abcdmn" so false.
		boolean b2 = Pattern.matches("[amn]", "abcdmn");
		System.out.println(b2);

		// here we have "amn" so false.
		boolean b3 = Pattern.matches("[amn]", "amn");
		System.out.println(b3);

		// here we have only "a" so true.
		boolean b4 = Pattern.matches("[amn]", "a");
		System.out.println(b4);

		// here we have only "n" so true.
		boolean b5 = Pattern.matches("[amn]", "n");
		System.out.println(b5);

		// here we have only "mn" so false.
		boolean b6 = Pattern.matches("[amn]", "mn");
		System.out.println(b6);

		// here we have only "ammaa" so false.
		boolean b7 = Pattern.matches("[amn]", "ammaa");
		System.out.println(b7);
	}

}
