package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentMethodsOfMatcherAPI6 {

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

		// why we need this line.
		// if we dont write, the output is just the string where all the matches have
		// happened until last.
		// what if there were some characters in end which did not match, but they were
		// not shown in earlier code as this step was not written.
		// Since the code does not include m.appendTail(sb); at the end, the output may
		// not contain the parts of the original string after the last match. Here’s how
		// it works with and without appendTail():
		// Without appendTail(): Only the modified segments up to the last match are
		// printed, possibly truncating the original string.
		// With appendTail(): Adding m.appendTail(sb); after the loop will ensure any
		// remaining text is appended, so the output shows the full modified string with
		// replacements.
		StringBuffer sb1 = m.appendTail(sb);

		System.out.println(sb1);

	}
}
