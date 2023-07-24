package Patterns_in_java;

import java.util.Scanner;

public class P_31_Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < 2 * m - 1; i++) {

            for (int j = 0; j < 2 * m - 1; j++) {

                int val = m - Math.min((Math.min(i, j)), (Math.min(2 * m - 2 - j, 2 * m - 2 - i)));
                System.out.print(val + " ");


            }


            System.out.println();
        }
        sc.close();
    }


}
