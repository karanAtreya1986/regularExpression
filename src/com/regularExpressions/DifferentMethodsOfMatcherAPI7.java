package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DifferentMethodsOfMatcherAPI7 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("a*b");

		Matcher m = p.matcher("aabCoreaba-ba&bbbab^a");

		String toReplaceOriginalString = "====";

		StringBuffer sb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(sb, toReplaceOriginalString);
		}

		StringBuffer sb1 = m.appendTail(sb);

		// writing tostring() or not doesnt matter as stringbuffer doesnt return object
		// address.
		System.out.println(sb1.toString());

	}
}
