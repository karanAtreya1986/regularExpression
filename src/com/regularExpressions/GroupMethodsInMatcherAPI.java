package com.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupMethodsInMatcherAPI {
	// Whatever is there inside () is group.
	// (.*) - first group - it means any damn thing can come.
	// (\\d) - second group -- it means only digits can come.

	public static void main(String[] args) {

		// The regular expression (.*)(\\d)(.*) includes three groups:
		// Group 1 (.*): The first part (.*) matches any sequence of characters (even an
		// empty string).
		// Group 2 (\\d): The second part (\\d) matches a single digit.
		// \\d represents a digit, and \\d is double-escaped for Java strings.
		// Group 3 (.*): The third part (.*) again matches any sequence of characters
		// after the digit.
		// Together, this pattern will match any substring that contains at least one
		// digit and will split the match into three groups: everything before the
		// digit, the digit itself, and everything after the digit.

//		m1.groupCount() returns the number of groups in the pattern, 
		// excluding the entire match (total groups: 3).
//		m1.group(0) gives the entire matched substring, known as Group 0.
		// m1.group(1) returns the content matched by the first capturing group (.*),
		// which is the part before the first digit.
//m1.group(2) returns the second capturing group (\\d), which is the digit.
		// m1.group(3) would return the third group if accessed, though here the code
		// only accesses group(2).

		// total number of groups 3
		// asasa EWRWER 23424 @#$#@$ ##@$2323213WEQWQEewrrwrw // full match (Group 0)
		// asasa EWRWER 23424 @#$#@$ ##@$ // Group 1 (before the first digit)
		// 2 // Group 2 (the first digit found)

		// Capturing Only the First Digit: When the Matcher encounters a sequence like
		// 23424, it matches only the first 2 because \\d doesn’t look for more than one
		// digit. The remaining 3424 is included in Group 3 as part of (.*).

		// To capture multiple digits in Group 2 (e.g., 23424 instead of just 2), you
		// can modify the regular expression to allow for multiple digits:

		// String patternString = "(.*)(\\d+)(.*)";

		// Explanation of Updated Regular Expression
		// (.*)(\\d+)(.*):
		// (.*) (Group 1): Matches any characters before the sequence of digits.
		// (\\d+) (Group 2): Matches one or more digits because \\d+ means "one or more
		// digits."
		// (.*) (Group 3): Matches any characters after the sequence of digits.

		// String patternString = "(.*)(\\d+)(.*)";
		// String lineString = "asasa EWRWER 23424 @#$#@$ ##@$2323213WEQWQEewrrwrw";
		// Then Group 2 would capture the full 23424 instead of just 2.
		// This would produce output similar to:
		// total number of groups 3
		// asasa EWRWER 23424 @#$#@$ ##@$2323213WEQWQEewrrwrw // full match (Group 0)
		// asasa EWRWER // Group 1 (text before digits)
		// 23424 // Group 2 (sequence of digits)
		// @#$#@$ ##@$2323213WEQWQEewrrwrw // Group 3 (text after digits)

		// Now, Group 2 correctly captures 23424 as the full digit sequence.

//		The reason the first group ((.*)) doesn't stop at the first digit (2) 
		// is because of how the .* portion of the regular expression works. Here’s a
		// detailed explanation:
//
//		Explanation of (.*)(\\d)(.*)
//		(.*) (Group 1): .* is a greedy quantifier that matches any number of 
		// characters (even zero), including digits and non-digit characters.
		// Being greedy, it tries to match as much of the string as possible
		// while still allowing the rest of the pattern to match.
//		(\\d) (Group 2): \\d matches exactly one digit. This is the digit 
		// that appears immediately after whatever .* captures.
//		(.*) (Group 3): The final .* matches everything that comes after 
		// the single digit in Group 2.
//		Why Group 1 Doesn’t Stop at the First 2
//		In a greedy regular expression like this, .* in Group 1 tries to 
		// match as much as it can. The regex engine first attempts to consume
		// the entire string with .* in Group 1. However, it needs to
		// allow room for Group 2 to match one digit, so it backtracks
		// just enough to leave one digit (the first 2) for Group 2 to match.
//
//		As a result:
//
//		Group 1 matches "asasa EWRWER 2342", taking as much as possible
		// while leaving the first 2 for Group 2.
//		Group 2 captures the first 2.
//		Group 3 captures everything after that, which would be
		// "3424 @#$#@$ ##@$2323213WEQWQEewrrwrw".
//		Solution: Making the First Group Non-Greedy
//		If you want Group 1 to stop as soon as it encounters the first 
		// digit, you can modify .* to be non-greedy by adding ?, like this:

//		String patternString = "(.*?)(\\d)(.*)";

//		(.*?) (Group 1) now matches any number of characters but does
		// so in a non-greedy manner. It captures as few characters as
		// possible before allowing the next part of the pattern (\\d)
		// to match the first digit.
//		With this modified pattern, Group 1 will stop as soon as it 
		// encounters the first digit.
//
//		Expected Output with Non-Greedy Pattern
//		With the non-greedy version (.*?)(\\d)(.*), the output would look like:

//		total number of groups 3
//		asasa EWRWER 23424 @#$#@$ ##@$2323213WEQWQEewrrwrw   // Full match (Group 0)
//		asasa EWRWER                                         // Group 1 (stopping before first digit)
//		2                                                    // Group 2 (first digit)
//		3424 @#$#@$ ##@$2323213WEQWQEewrrwrw                 // Group 3 (remaining text)

//		This makes Group 1 capture up to the first digit without being greedy.

		String patternString = "(.*)(\\d)(.*)";
		String lineString = "asasa EWRWER 23424 @#$#@$ ##@$2323213WEQWQEewrrwrw";

		Pattern p1 = Pattern.compile(patternString);
		Matcher m1 = p1.matcher(lineString);

		while (m1.find()) {
			// Returns the number of capturing groups in this matcher's pattern.
			int i1 = m1.groupCount();
			System.out.println("total number of groups " + i1);
			String groupZero = m1.group(0);
			System.out.println("group zero is " + groupZero);
			String groupOne = m1.group(1);
			System.out.println("group one is " + groupOne);
			String groupTwo = m1.group(2);
			System.out.println("group two is " + groupTwo);
			String groupThree = m1.group(3);
			System.out.println("group three is " + groupThree);

		}
	}

}
