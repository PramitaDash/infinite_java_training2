package cm.java.reg;

import java.util.regex.Pattern;

public class RegEx2 {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".h", "ch"));
		System.out.println(Pattern.matches("..f..i..", "infinite"));
		System.out.println(Pattern.matches("[aeiou]", "a"));
		System.out.println(Pattern.matches("[aeiou]", "s"));
//		Write an expression contain 2 word start with pqr and next char
//		is vowel
		System.out.println(Pattern.matches("[^aeiou]", "a"));
		System.out.println(Pattern.matches("[^aeiou]", "z"));
		System.out.println(Pattern.matches("[abcd]+", "anccddd"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "Hello"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "Pramita"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "Pramita123"));
//      validate MobileNo
		System.out.println(Pattern.matches("[0-9]{10}", "9861181097"));
		System.out.println(Pattern.matches("[0-9]{10}", "986118109"));
		System.out.println(Pattern.matches("[0-9]{10}", "ABCD1234"));
		System.out.println(Pattern.matches("[0-9]{4}\s[0-9]{4}\s[0-4]{4}", "1234 1234 1234"));
		System.out.println(Pattern.matches("[0-9]{4}\s[0-9]{4}\s[0-4]{4}", "123412341234"));
		System.out.println(Pattern.matches("[0-9]{4}\s[0-9]{4}\s[0-4]{4}", "123 123 123"));
		System.out.println(Pattern.matches("[+][9][1]-[0-9]{10}", "+91-9861181097"));
		System.out.println(Pattern.matches("\\d{5}", "12345"));
		System.out.println(Pattern.matches("\\D+", "12345"));
		System.out.println(Pattern.matches("\\D+", "ABCD@#$$%"));
		System.out.println(Pattern.matches("\\S+", "HiHow"));
		System.out.println(Pattern.matches("\\S+", "Hi How"));
		String regex = "^(?=.*[0-9])"
				+ "(?=.*[a-z])(?=.*[A-Z])"
				+"(?=.*[@#$%^&*+=])"
				+"(?=\\S+&"
		
	

	}}
