package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionBasicWorking2 {

	public static void main(String[] args) {

		Pattern p1 = Pattern.compile(".o");

		// dot represents number also.
		Matcher m1 = p1.matcher("3o");

		boolean b1 = m1.matches();
		System.out.println(b1);
	}

}
