package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionBasicWorking3 {

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile(".o");

		// dot represents special character also.
		Matcher m1 = p1.matcher("^o");

		boolean b1 = m1.matches();
		System.out.println(b1);
	}

}
