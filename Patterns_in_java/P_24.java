package Patterns_in_java;

import java.util.Scanner;

public class P_24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i <= m; i++) {
            System.out.print("*");
            for (int j = 2; j < i + 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * m - 2 * i; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j = 2; j < i + 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = m; i >= 0; i--) {
            System.out.print("*");
            for (int j = 2; j < i + 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * m - 2 * i; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            for (int j = 2; j < i + 1; j++) {
                System.out.print(" ");
            }
            if (i != 0) {
                System.out.print("*");
            }

            System.out.println();

        }
        sc.close();
    }

}
