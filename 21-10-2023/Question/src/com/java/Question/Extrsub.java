package com.java.exa;

public class Extrsub {
	
	public static String extractSubstring(String text, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > text.length()) {
            return "Invalid indices.";
        }
        return text.substring(startIndex, endIndex);
    }

    public static void main(String[] args) {
        String input = "Jitendrasahoooioih";
        int start = 7;
        int end = 12;
        String result = extractSubstring(input, start, end);
        System.out.println("Substring: " + result);
    }

}
