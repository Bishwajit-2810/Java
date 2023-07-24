package Recurtion;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int n = fibo(m);
        System.out.println(n);
        sc.close();

    }

    static int fibo(int m) {
        //base conditions
        if (m == 0 || m == 1) {
            return m;
        }
        return fibo(m - 2) + fibo(m - 1);


    }



}
