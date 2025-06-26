package com.example.logicprogram.datastructure;


public class RunTest {

    public static void main(String[] args) {

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
