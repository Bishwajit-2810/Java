package Patterns_in_java;

import java.util.Scanner;

public class P_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();
        int num = 0;
        int num2 = m * (m + 1) - m + 1;
        int var3 = m * (m + 1) - m + 1;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < m - i; k++) {
                num++;
                System.out.print(num + " ");
            }
            System.out.print(" ");
            if (i != 0) {
                var3 = var3 - m + i;
            }
            num2 = var3;
            for (int l = 0; l < m - i; l++) {
                System.out.print(num2 + " ");
                num2++;


            }


            System.out.println();


        }
        sc.close();

    }


}
