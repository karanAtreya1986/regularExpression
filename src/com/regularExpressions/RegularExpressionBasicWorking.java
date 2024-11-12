package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionBasicWorking {

	// Just remember two apis – pattern api and matcher api.
	// Regex comes from java.util package.

	public static void main(String[] args) {

		// . means any alphabet can come in its place.
		// o means after the alphabet only "o" can come.
		// only two alphabets can come in this example.

		// pattern is final class, so no object can be created of it.
		// give the pattern to search.
		Pattern p1 = Pattern.compile(".o");
		// use matcher to match with the pattern.
		// here we give the data to match.
		Matcher m1 = p1.matcher("Co");
		// returns true or false denoting match successful or not.
		boolean b1 = m1.matches();
		System.out.println(b1);
	}

}
