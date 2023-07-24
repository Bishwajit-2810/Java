package Patterns_in_java;

import java.util.Scanner;

public class P_25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < m - i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < m; k++) {
                if (i == 0 || k == 0 || i == m - 1 || k == m - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

        sc.close();
    }

}
