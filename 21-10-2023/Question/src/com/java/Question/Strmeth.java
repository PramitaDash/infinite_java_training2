package com.java.exa;

public class Strmeth {
	
	public static String isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return str;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome"+str);
		return str;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        String result = isPalindrome(input);
    }

}
