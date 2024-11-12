package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondWayToWriteRegularExpressions {

	public static void main(String[] args) {

		// write in one liner form.
		// this is another way to write regex.
		boolean b1 = Pattern.compile(".o").matcher("Co").matches();

		System.out.println(b1);
	}

}
