package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionBasicWorking4 {

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile(".o");

		// dot means only one character.
		// more than one character means regular expression not matched and we get
		// false.
//		Matcher m1 = p1.matcher("reo");
//		Matcher m1 = p1.matcher("34o");
//		Matcher m1 = p1.matcher("$%o");
//		Matcher m1 = p1.matcher("a4o");
//		Matcher m1 = p1.matcher("a&o");
//		Matcher m1 = p1.matcher("1ao");
//		Matcher m1 = p1.matcher("1(o");
//		Matcher m1 = p1.matcher("(ao");
		Matcher m1 = p1.matcher("&3o");
		boolean b1 = m1.matches();
		System.out.println(b1);
	}

}
