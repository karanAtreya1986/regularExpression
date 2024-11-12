package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentMethodsOfMatcherAPI3 {

	public static void main(String[] args) {

		// we want to search for Replacement word.
		// Replacement word is the pattern to be matched.
		Pattern p = Pattern.compile("Replacement");

		// replace the Replacement word
		// we give the sentence on which the pattern to be applied.
		Matcher m = p.matcher("Matcher replacement Replacement methods Replacement");

		String toReplaceOriginalString = "Hello guys";

		// replaceall() will replace all occurrences.
		System.out.println(m.replaceAll(toReplaceOriginalString));

	}
}
