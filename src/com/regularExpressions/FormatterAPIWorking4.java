package com.regularExpressions;

import java.util.Formatter;

public class FormatterAPIWorking4 {

	// we can use out method of formatter for printing also.
	// it returns appendable object.
	// we can either directly print the appendable object because it does not return
	// memory address.
	// we can also use tostring() method to print the appendable object.

	// To print the formatter output use out() method.
	public static void main(String[] args) {

		Formatter formatterValue = new Formatter();
		formatterValue.format("%s guys how are you %d, i am fine %f", "tiger", 23432432, 345435.345435f);
		Appendable f1 = formatterValue.out();
		System.out.println(f1);
		System.out.println(f1.toString());

	}

}
