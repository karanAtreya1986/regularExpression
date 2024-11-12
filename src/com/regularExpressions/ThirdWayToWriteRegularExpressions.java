package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdWayToWriteRegularExpressions {

	public static void main(String[] args) {

		// super short way to write regex.
		// third way of writing directly.
		boolean b1 = Pattern.matches(".o", "Co");

		System.out.println(b1);
	}

}
