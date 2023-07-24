package Patterns_in_java;

import java.util.Scanner;

public class P_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 1; i < 2 * m; i++) {
            int c;

            if (i > m) c = 2 * m - i;
            else c = i;

            for (int j = 1; j <= m - c; j++) {
                System.out.print(" ");
            }

            for (int k = c; k >= 1; k--) {
                System.out.print(k);
            }
            for (int k = 2; k <= c; k++) {
                System.out.print(k);
            }


            System.out.println();

        }


        sc.close();
    }


}
