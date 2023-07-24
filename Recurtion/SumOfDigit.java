package Recurtion;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.println(sums(m));
        sc.close();

    }

    static int sums(int m) {
        if (m == 0) {
            return 0;
        }
        return m % 10 + sums(m / 10);


    }
}
