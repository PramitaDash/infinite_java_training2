package com.java.example;

public class VowelConsonant {
	
	public static void main(String[] args) {

        char ch = 'i';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )//The `if` statement begins here. It checks whether the character `ch` is equal to any of the vowel characters ('a', 'e', 'i', 'o', 'u'). The logical OR (`||`) operator is used to connect multiple conditions. If `ch` matches any of these characters, the condition is true.
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }

}
