package com.regularExpressions;

import java.util.Formatter;

public class FormatterAPIWorking3 {

	// when we give less than the required values which the format expects.
	// we get run time exception called as missing format argument exception.
	public static void main(String[] args) {

		Formatter formatterValue = new Formatter();
		formatterValue.format("%s guys how are you %d, i am fine %f", "tiger", 23432432);
		System.out.println(formatterValue);

	}

}
