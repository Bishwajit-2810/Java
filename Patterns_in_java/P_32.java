package Patterns_in_java;

import java.util.Scanner;

public class P_32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();
        int a = m;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print(Character.toString('A' + a - 1 + j) + " ");

            }

            a = m - i - 1;


            System.out.println();
        }
        sc.close();
    }

}
