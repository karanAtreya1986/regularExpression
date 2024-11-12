package com.regularExpressions;

import java.util.regex.Pattern;

public class GiveLength {

	public static void main(String[] args) {

		// {} – used to give the length.

		// in this case it will search for a-z, A-Z, 0-9 and the total length of string
		// has to be 6 characters.

		// returns true
		boolean b1 = Pattern.matches("[a-zA-Z0-9]{6}", "abcd24");
		System.out.println(b1);

		// returns true
		boolean b2 = Pattern.matches("[a-zA-Z0-9]{6}", "98ERTY");
		System.out.println(b2);

		// returns true
		boolean b3 = Pattern.matches("[a-zA-Z0-9]{6}", "TYbhHj");
		System.out.println(b3);

		// returns true
		boolean b4 = Pattern.matches("[a-zA-Z0-9]{6}", "543534");
		System.out.println(b4);

		// returns false
		boolean b5 = Pattern.matches("[a-zA-Z0-9]{6}", "5435534");
		System.out.println(b5);

		// returns false
		boolean b6 = Pattern.matches("[a-zA-Z0-9]{6}", "TYbhHtyj");
		System.out.println(b6);

		// returns false
		boolean b7 = Pattern.matches("[a-zA-Z0-9]{6}", "TYbh4545Htyj");
		System.out.println(b7);

		// returns false as characters not in list.
		boolean b8 = Pattern.matches("[a-zA-Z0-9]{6}", "TYbh4%$#%$#%545Htyj");
		System.out.println(b8);
	}

}
