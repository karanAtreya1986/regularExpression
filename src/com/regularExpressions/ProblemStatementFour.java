package com.regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemStatementFour {

	public static void main(String[] args) {
		// search and find example

		// in this code, infinite while loop will go on.
		// only difference is, if there is no match, then it will print the no matching
		// sentence.
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
			if (!found) {
				System.out.println("No matching");
			}
		}
	}

}
