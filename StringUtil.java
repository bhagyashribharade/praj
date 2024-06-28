package AirlineManagementSystem;

public class StringUtil {
	 public static int countOccurrences(String str, char ch) {
	     int count = 0;
	     for (char c : str.toCharArray()) {
	         if (c == ch) {
	             count++;
	         }
	     }
	     return count;
	 }

	 public static String reverseString(String str) {
	     return new StringBuilder(str).reverse().toString();
	 }

	 public static boolean isPalindrome(String str) {
	     String reversed = reverseString(str);
	     return str.equals(reversed);
	 }

	 public static String capitalizeWords(String str) {
	     String[] words = str.split(" ");
	     StringBuilder capitalizedStr = new StringBuilder();
	     for (String word : words) {
	         capitalizedStr.append(Character.toUpperCase(word.charAt(0)))
	                 .append(word.substring(1)).append(" ");
	     }
	     return capitalizedStr.toString().trim();
	 }
	
	
	
	
}
