package Patterns_in_java;

import java.util.Scanner;

public class P_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        sc.close();
    }
}
