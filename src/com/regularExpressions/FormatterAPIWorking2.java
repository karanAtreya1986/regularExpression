package com.regularExpressions;

import java.util.Formatter;

public class FormatterAPIWorking2 {

	// when the values are not in the order which the format expects.
	// here first is string, second if digit, third is float.
	// we get run time error - illegal format conversion exception.

	public static void main(String[] args) {

		Formatter formatterValue = new Formatter();
		formatterValue.format("%s guys how are you %d, i am fine %f", 234234234, "tiger", 2344.23432f);
		System.out.println(formatterValue);

	}

}
