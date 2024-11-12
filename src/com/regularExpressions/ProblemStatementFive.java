package com.regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProblemStatementFive {

	public static void main(String[] args) {
		// search and find example

		// how to gracefully exit the loop.
		Scanner sc = new Scanner(System.in);
		boolean found = false;

		while (true) {
			System.out.println("Enter the term to search");
			String s1 = sc.nextLine();
			if (s1.equalsIgnoreCase("exit")) {
				System.out.println("Exiting the program ...........");
				break;
			}
			Pattern p1 = Pattern.compile(s1);

			System.out.println("Enter the matcher where we need to search for it");
			Matcher m1 = p1.matcher(sc.nextLine());
			while (m1.find()) {
				// this will group the word java
				String s2 = m1.group();
				System.out.println("found match at group " + s2);
				// gives the start index of Java
				// this will keep running for all the occurrences of the word.
				int i1 = m1.start();
				System.out.println("starting index of the match is " + i1);
				// gives one index after java word.
				// this will keep running for all the occurrences of the word.
				int i2 = m1.end();
				System.out.println("ending index of the match is " + i2);
			}
			if (!found) {
				System.out.println("No matching");
			}
		}

		sc.close();
	}

}
