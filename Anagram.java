package test5;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		System.out.println("Please enter first string");
		str1 = sc.nextLine();
		str1 = ifContainsIndia(str1, sc);
		System.out.println("Please enter second string");
		str2 = sc.nextLine();
		str2 = ifContainsIndia(str2, sc);

		char a[] = str1.toCharArray();
		char b[] = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result = Arrays.equals(a, b);

		String outputString = result ? "String are Anagram" : "Strings are not anagram";
		System.out.println(outputString);
	}

	private static String ifContainsIndia(String str1, Scanner sc) {
		boolean matchString = true;
		while (matchString) {
			if (str1.toUpperCase().contains("INDIA")) {
				System.out.println("The word india is not allowed\nPlease re-enter the string");
				str1 = sc.nextLine();
			} else {
				matchString = false;
			}
		}
		return str1;
	}
}