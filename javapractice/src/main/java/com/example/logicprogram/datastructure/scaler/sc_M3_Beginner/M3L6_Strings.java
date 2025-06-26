package com.example.logicprogram.datastructure.scaler.sc_M3_Beginner;

public class M3L6_Strings {

    public static void main(String[] args) {

        // Char Data Type

        // Every value is stored in the form of binary terms, and each binary term represented by numbers. These numbering is common
        // every where in the world. This representation of numbers is called ASCII representation.

        /*
         * 1) char x = 'b' + 'a'
         * 'a' -> ASCII value is 97
         * 'b' -> ASCII value is 98
         * 'c' -> ASCII value is 99
         * */


        char x = 'A' + 1;
        System.out.println(x);   // OUTPUT : B

        char y = 'a' + 1;
        System.out.println(y);   // OUTPUT : b

        // We can directly append char's in string using "+" or we can use StringBuilder
        String s = "" + 'a';
        s = s + 'b';
        System.out.println(s);   // OUTPUT : ab


        // String Data Type
        // String is a sequence set of characters.
        // or String is a array of characters.

        // So basically we can convert string to char array.

        // Q 1. Given a string, count the number of capital letters in a string.
        // I/P : Hello Paras Mani -> 3
        // I/P : paras mani -> 0
        // Hint : ASCII value range 'A' to 'Z' -> 65 to 90
        int count = getCapitalLettersCount("ParasMani Sharma");
        System.out.println("Count = " + count);

        // Q 2. Write a fn, that return a reverse of a string.
        // Easy way : Follow Right -> Left Approach
        // Can we do solve by iterating Left -> Right Approach ?
        String rev = getReverseString("ParasMani Sharma");
        System.out.println("Reverse = " + rev);

        // Q 3. Check is string is Palindrome
        // A palindrome string is a string that is the same when reversed.
        // A palindrome string is a string that reads the same when read out from
        // left to right or right to left.
        //boolean isPalindrome = isPalindrome("ParasMani Sharma");
        boolean isPalindrome = isPalindrome("NitiN");
        System.out.println("Mom isPalindrome = " + isPalindrome);
    }

    public static int getCapitalLettersCount(String str){

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch  = str.charAt(i);
            //if(ch >= 65 && ch <= 90) {        //or
            if(ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }

    public static String getReverseString(String str) {

        // Right to Left Approach
        /*StringBuilder rev = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        return rev.toString();*/

        // Can we do solve by iterating Left -> Right Approach ?
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            //rev = str.charAt(i) + rev;
            rev.insert(0, str.charAt(i)); // Shift and Insert item at 0 position
        }
        return rev.toString();
    }

    public static boolean isPalindrome(String str){
        String reversed = getReverseString(str.toLowerCase());
        return str.equalsIgnoreCase(reversed);
    }
}
