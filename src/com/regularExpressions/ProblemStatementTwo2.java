package com.regularExpressions;

import java.util.regex.Pattern;

public class ProblemStatementTwo2 {

	public static void main(String[] args) {

		// give wrong syntax for regex.
		// run time error - pattern syntax exception
		boolean b1 = Pattern.matches("[789]{1}{0-9]{9]", "7123456789");
		System.out.println(b1);

	}

}
