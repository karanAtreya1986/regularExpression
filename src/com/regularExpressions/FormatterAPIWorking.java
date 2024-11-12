package com.regularExpressions;

import java.util.Formatter;

public class FormatterAPIWorking {

	// Formatter is part of java.util package.
	// %s means strings.
	// %d means digits.
	// %f means float values.

	// Formatter class returns formatted output.

	// It can format numbers, string, time, date, digit or decimal values.

	public static void main(String[] args) {

		Formatter formatterValue = new Formatter();
		formatterValue.format("%s guys how are you %d, i am fine %f", "tiger", 234234234, 2344.23432f);
		System.out.println(formatterValue);

	}

}
