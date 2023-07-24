package Patterns_in_java;

import java.util.Scanner;

public class P_07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }


            for (int j = i; j < m; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        sc.close();
    }


}






