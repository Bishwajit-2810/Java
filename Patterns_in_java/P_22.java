package Patterns_in_java;

import java.util.Scanner;

public class P_22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();
        int var = 1;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j <= i; j++) {
                if (var % 2 == 0) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(1 + " ");
                }

                var++;

            }

            System.out.println();

        }

        sc.close();
    }

}
