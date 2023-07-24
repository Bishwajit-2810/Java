package Patterns_in_java;

import java.util.Scanner;

public class P_12
{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();


        for (int i = 0; i < m; i++) {
            for (int j = m; j > m - i; j--) {

                System.out.print(" ");

            }
            for (int k = 0; k < m - i; k++) {

                System.out.print("* ");
            }


            System.out.println();

        }
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < m - i-1; j++) {

                System.out.print(" ");


            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }


            System.out.println();

        }


        sc.close();
    }











}
