package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentMethodsOfMatcherAPI5 {

	public static void main(String[] args) {

		// this is the pattern we are looking for:
		// Pattern Explanation:
		// a* means zero or more occurrences of the letter "a".
		// b is the character "b".
		// Together, a*b matches any sequence with zero or more "a"s directly followed
		// by a single "b".
		// This pattern can match just "b", "ab", "aab", "aaab", etc.
		Pattern p = Pattern.compile("a*b");

		// we have to search in this string if the pattern is present.
		Matcher m = p.matcher("aabCoreaba-ba&bbbab^a");

		// this is the replacement string for the pattern combination.
		// whenever the pattern is found in matcher string, then immediately replace the
		// pattern by "====".
		String toReplaceOriginalString = "====";

		// we will use append method to replace.
		// for append method we need to use stringbuffer, because normal String does not
		// have append method as its immutable.
		// printing stringbufffer directly prints the value not object address.
		StringBuffer sb = new StringBuffer();

		// search the entire length of string and perform the replacement.
		while (m.find()) {
			m.appendReplacement(sb, toReplaceOriginalString);
		}

		System.out.println(sb);

	}
}
