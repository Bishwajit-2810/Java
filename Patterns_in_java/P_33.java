package Patterns_in_java;

import java.util.Scanner;

public class P_33 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("enter number : ");
        m = sc.nextInt();
        int a = 1;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j <= i; j++) {
                if (a % 2 == 0) {
                    System.out.print(Character.toString('A' + a - 1) + " ");
                } else {
                    System.out.print(Character.toString('a' + a - 1) + " ");
                }
                a++;
            }


            System.out.println();
        }


        sc.close();
    }


}
