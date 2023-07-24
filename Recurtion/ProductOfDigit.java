package Recurtion;

import java.util.Scanner;

public class ProductOfDigit {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.println(prod(m));
        sc.close();

    }

    static int prod(int m) {
        if (m % 10 == m) {
            return m;
        }
        return m % 10 * prod(m / 10);


    }
}
