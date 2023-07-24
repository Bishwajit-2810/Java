package Recurtion;

import java.util.Scanner;

public class PrintNumber {
    static int n = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        print1(m);
        print2(m);
        sc.close();
    }

    static void print1(int m) {
        //base conditions
        if (m < 1) {
            return;
        }

        print1(m - 1);

        System.out.println(m);
    }

    static void print2(int m) {
        //base conditions
        if (m < 1) {
            return;
        }
        System.out.println(m);
        print2(m - 1);


    }


}
