package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionBasicWorking5 {

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile(".o");

		// note that java is case sensitive.
		// capital O and small o is not same, so output is false.
		Matcher m1 = p1.matcher("RO");
		boolean b1 = m1.matches();
		System.out.println(b1);
	}

}
