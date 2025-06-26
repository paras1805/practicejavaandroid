package com.example.logicprogram.datastructure.scaler.sc_M5_Intermediate;

import java.util.Arrays;

public class M5L2_String {


    // Every string stored as ascii value in computer
    // 'A' -> 'Z' : 65 to 90
    // 'a' -> 'z' : 97 to 122
    // '0' -> '9' : 48 to 57


    // Convert char to asci
    // char i = '9'
    // what is i + '8' ?

    // Ques :  sort string bbaacdd ?

    // Substring
    // Ques : check if a substring is a palindrome or not ?

    // Ques :  Calculate the length of longest palindrome substring.

    // Ques :  If middle element of palindrome is known, can you find the length id palindrome.
    // Idea 1 : for odd length -> take one middle element
    // Idea 2 : for even length -> take P1 and P2 mid elements.

    public static void main(String[] args) {

        char a = '9'; // ASCII 9 is 57
        char ch = (char) (a + 8);  // 57+8 => 65 = A
        System.out.println("ASCII = " + ch);


        // Toggle every bit
        String x = "aNaCoNdA";
        System.out.println("Toggle Every Char -- " + toggleStringBit(x));
    }

    public static String toggleStringBit(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            ch[i] = (char) (ch[i]^(1<<5));
        }
        return String.copyValueOf(ch);
    }
}
