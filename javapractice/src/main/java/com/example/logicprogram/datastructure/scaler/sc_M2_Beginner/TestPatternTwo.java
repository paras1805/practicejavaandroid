package com.example.logicprogram.datastructure.scaler.sc_M2_Beginner;

public class TestPatternTwo {

    public static void main(String[] args) {

        /*
         Print :
           ***
           **
           *
        * */

        int N = 4;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }

        /*
         Print :
           *
           **
           ***
        * */

        System.out.println();
        System.out.println();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }


        /*
         Print : N=4
           *---*
           *---*
           *---*
           *---*
        * */

        System.out.println();
        System.out.println();
        /*for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N+1; j++) {
                if(j == 1 || j == N+1){
                    System.out.print("x");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }*/

        // or

        for (int i = 1; i <= N; i++) {
            System.out.print("x");
            for (int j = 1; j <= N-1; j++) {
                System.out.print("-");
            }
            System.out.print("x");
            System.out.println();
        }

        /*
         Print :
           *---*
           *--*
           *-*
           **
        * */

        System.out.println();
        System.out.println();
        for (int i = 1; i <= N; i++) {
            System.out.print("x");
            for (int j = 1; j <= N-i; j++) {
                System.out.print("-");
            }
            System.out.print("x");
            System.out.println();
        }

        /*
         Print :
           *
           *2
           *2*
           *2*4
           *2*4*
           *2*4*6
        * */
        System.out.println();
        System.out.println();
        for (int i = 1; i <= N; i++) {
            int n = 1;
            for (int j = 1; j <= i; j++) {
                if(j % 2 == 0) {
                    n = n*2;
                    System.out.print(n);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        /*
         Print :
           1
           2  3
           4  5  6
           7  8  9  10
           11 12 13 14 15
        * */
        System.out.println();
        System.out.println();
        int n = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }

        /*
         Print :
           - - - *
           - - * *
           - * * *
           * * * *
        * */
        System.out.println();
        System.out.println();
        for (int i = 1; i <= N; i++) {
            int startPos = N-i + 1;
            for (int j = 1; j <= N; j++) {
                if(j >= startPos){
                    System.out.print("*");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        /*
         Print :
           * * * * * * * * * *
           * * * * - - * * * *
           * * * - - - - * * *
           * * - - - - - - * *
           * - - - - - - - - *
        * */

        System.out.println();
        System.out.println();
        /*int startPos = N; int endPos = N+1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N * 2; j++) {
                if(i != 1 && j >= startPos && j <= endPos){
                    System.out.print(" - ");
                } else {
                    System.out.print(" * ");
                }
            }
            if(i != 1) {
                startPos--;
                endPos++;
            }

            System.out.println();
        }*/


        /*
           *
          ***
         *****
        *******
        */

        /*N = 4;
        int startPos = N; int endPos = N+1-1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N * 2; j++) {
                if(j >= startPos && j <= endPos){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            startPos--;
            endPos++;

            System.out.println();
        }*/

        /*
            *
           ***
          *****
         *******
         */

        //N = 8;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        /*
             * * * *
              * * *
               * *
                *
         */

        System.out.println(" ");
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }



        //////////

        System.out.println();
        System.out.println();
        int rows = 4; // You can change the number of rows here

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next line
        }
    }


}


