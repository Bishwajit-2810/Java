package Patterns_in_java;

import java.util.Scanner;

public class P_09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 2 * m - 1; k > i * 2; k--) {
                System.out.print("*");
            }


            System.out.println();

        }


        sc.close();
    }


}
