package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentMethodsOfMatcherAPI9 {

	// good way to write regex code.
	// Define it explicitly at top and then use inside method.

	static final String REGEX = "\\bA\\b";
	static final String INPUT = "A a A A A ab AB A a A a";

	public static void main(String[] args) {

		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);

		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("Match found and Counter incremented to " + count);
			int i1 = m.start();
			System.out.println("Index at where match is found " + i1);
			int j = m.end();
			System.out.println("End value is --> index after the matched element " + j);
		}
	}

}
