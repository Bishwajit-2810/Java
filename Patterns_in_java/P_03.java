package Patterns_in_java;

import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {
        System.out.print("enter the number : ");

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = m; j > i; j--) {

                System.out.print("*");

            }
            System.out.println();

        }
        sc.close();
    }

}
