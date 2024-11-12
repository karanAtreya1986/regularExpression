package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentMethodsOfMatcherAPI {

	public static void main(String[] args) {

		// we want to search for "A" in the string or word.
		// \\b means from start till end of the word. \\b also known as word boundaries.
		// In between word we need to search for capital letter "A".
		// case sensitive is maintained here also.
		// Double \\b is written because it will consider space also and accordingly
		// takes action.
		// This means that there is space before A and after A. you need to capture only
		// A’s.
		Pattern p = Pattern.compile("\\bA\\b");
		Matcher m = p.matcher("A a A A A ab AB A a A a");

		int count = 0;

		// Find()- Keep searching for all matches till end of the file or string.
		// start() - will return the index where the match was found.
		// end() - will return the next index after the matched index indicating end.
		// find(), start(), end() are also known as index methods because they deal with
		// indexes.

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
