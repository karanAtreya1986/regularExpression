//package com.regularExpressions;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class DifferentMethodsOfMatcherAPI8 {
//
//	public static void main(String[] args) {
//
//		Pattern p = Pattern.compile("a*b");
//
//		Matcher m = p.matcher("aabCoreaba-ba&bbbab^a");
//
//		String toReplaceOriginalString = "====";
//
//		String sb = new String();
//
//		while (m.find()) {
//
//			// compile error if we try to use append on string and not string buffer-
//			// The method appendReplacement(StringBuffer, String) in the type Matcher is not
//			// applicable for the arguments (String, String)
////			m.appendReplacement(sb, toReplaceOriginalString);
//		}
//
//		// compile error if we try to use appendtail() on string.
//		// The method appendTail(StringBuffer) in the type Matcher is not applicable for
//		// the arguments (String)
////		StringBuffer sb1 = m.appendTail(sb);
//
//		System.out.println(sb1.toString());
//
//	}
//}
