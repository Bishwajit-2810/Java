package Patterns_in_java;

import java.util.Scanner;

public class P_35 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();
        for (int i = 0; i < m; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }

            for (int k = 0; k < m - i - 1; k++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 0; j--) {
                System.out.print(j + 1);

            }


            System.out.println();
        }
        sc.close();
    }


}
