package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentMethodsOfMatcherAPI2 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\bA\\b");
		// lets not give space in matcher string
		// we will get blank output, because single capital letter A is not present
		// individually with spacing.
		// only if it finds the word "A" then it will return output.
		Matcher m = p.matcher("AaAAAabABAaAa");

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
