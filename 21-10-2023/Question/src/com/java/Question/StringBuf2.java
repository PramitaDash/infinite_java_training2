package com.java.exa;

public class StringBuf2 {
	
	public static void main(String[] args) {
        String originalString = "Hello, world!";
        
        StringBuffer stringBuffer = new StringBuffer(originalString);
        
        for (int i = 0; i < stringBuffer.length(); i++) {
            char c = stringBuffer.charAt(i);
            if (isVowel(c)) {
                stringBuffer.deleteCharAt(i);
                i--; 
            }
        }
        
        
        String stringWithoutVowels = stringBuffer.toString();
        
        System.out.println("Original String: " + originalString);
        System.out.println("String without Vowels: " + stringWithoutVowels);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); 
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
