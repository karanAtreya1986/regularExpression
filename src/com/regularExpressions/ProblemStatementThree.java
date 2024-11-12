package com.regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemStatementThree {

	public static void main(String[] args) {
		// search and find example

		// this code will go into infinite loop, because when we enter invalid scenario
		// like the first case where java is in small casing, it will keep running the
		// infinite while loop.
		// we need to add stopping condition.

		// Scanner comes from java.util package.

		Scanner sc = new Scanner(System.in);
		boolean found = false;

		while (true) {
			System.out.println("Enter the term to search");
			Pattern p1 = Pattern.compile(sc.nextLine());
			System.out.println("Enter the matcher where we need to search for it");
			Matcher m1 = p1.matcher(sc.nextLine());
			while (m1.find()) {
				String s1 = m1.group();
				System.out.println("found match at group " + s1);
				int i1 = m1.start();
				System.out.println("starting index of the match is " + i1);
				int i2 = m1.end();
				System.out.println("ending index of the match is " + i2);
			}
		}
	}

}
