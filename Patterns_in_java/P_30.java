package Patterns_in_java;

import java.util.Scanner;

public class P_30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < m - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 0; k--) {
                System.out.print(k + 1);

            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l + 1);
            }

            System.out.println();
        }
        sc.close();
    }

}
