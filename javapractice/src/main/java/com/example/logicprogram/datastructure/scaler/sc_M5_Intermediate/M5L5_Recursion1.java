package com.example.logicprogram.datastructure.scaler.sc_M5_Intermediate;

public class M5L5_Recursion1 {

    public static void main(String[] args) {


        //show(5);
        //System.out.println(sumNatural(5));
        System.out.println(fib(5));

        // Check Palindrome using recursion
        String x = "abcdcbaa";
        System.out.println(isPalindrome(x,0, x.length()-1));
    }

    private static int sumNatural(int n){
        if(n==1)
            return 1;
        System.out.println(n);
        return sumNatural(n-1) + n;
    }

    // Print all numbers till n in increment order
    public static int show(int n) {

        if (n == 1) {
            return 1;
        }
        return show(n - 1);
        //System.out.println(n);
    }

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    // Using Loop
    public int powMethod1(int x, int n, int d) {
        long a = x;
        long res = 1L;
        while (n > 0) {
            if (n % 2 == 1) {
                res *= a;
                res %= d;
            }
            a *= a;
            a %= d;
            n = n >> 1;
        }
        res = (res + d) % d;
        return (int) res;
    }

    // Power type 4 problem
    // Using Recursive Call
    public int powMethod2(int A, int B, int C) {
        if(A == 0)
            return 0;
        if(B == 0)
            return 1;
        long ans = powMethod2(A, B / 2, C);
        ans = (ans * ans) % C;
        if(B % 2 == 1)
            ans = (ans * A);
        ans = (ans + C) % C;
        return (int)ans;
    }

    /*
    * Problem Description
    * Given a number A, check if it is a magic number or not.
    * A number is said to be a magic number if the sum of its digits is calculated till a single digit
    * recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then
    * the number is a magic number.
    * */
    public int solveMagicNumber(int A) {
        if (A < 10) {
            return (A == 1) ? 1 : 0;
        }
        int digit_sum = 0;
        while (A > 0) {
            digit_sum += A % 10;
            A /= 10;
        }
        return solveMagicNumber(digit_sum);
    }

    public static boolean isPalindrome(String s, int i, int j){
        if(i >= j)
            return true;
        if(s.charAt(i) != s.charAt(j))
            return false;
        return isPalindrome(s, i+1, j-1);
    }

}
