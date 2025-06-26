package com.example.logicprogram.datastructure.scaler;

import java.util.Arrays;

public class UtilDS {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] rev = reverseEntireArrayItself(arr);
        System.out.println("Rev = " + Arrays.toString(rev));
    }

    private static int[] reverseEntireArrayItself(int[] arr){

        int startIndex = 0;
        int endIndex = arr.length-1;
        while (startIndex<endIndex){

            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;

            startIndex++;
            endIndex--;
        }

        return arr;
    }

    // Armstrong Number
    public static int solve(int A) {

        //int aa = a%10; // last
        int power = 1; // digit count
        int x = A;
        while(x>=10){
            x /= 10;
            power++;
        }

        double ans = 0;
        while(A>=10){
            x = 0;
            x = A%10; // Gives last digit
            A /= 10; // Remove A's last digit
            ans = ans + Math.pow(x, power);
        }
        ans = ans + Math.pow(A, power); // Take last digit
        return (int)ans;
    }
}
