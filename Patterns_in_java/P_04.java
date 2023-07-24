package Patterns_in_java;

import java.util.Scanner;

public class P_04 {
    public static void main(String[] args) {
        System.out.print("enter the number : ");

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 1; i < m; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);


            }
            System.out.println();


        }
        sc.close();

    }


}
