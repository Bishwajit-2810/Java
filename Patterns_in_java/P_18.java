package Patterns_in_java;

import java.util.Scanner;

public class P_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i * 2; j++) {

                System.out.print(" ");

            }
            for (int j = 0; j < m - i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < m - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < i * 2; j++) {

                System.out.print(" ");

            }
            for (int j = 0; j < m - i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
        sc.close();
    }
}
