package Recurtion;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m;
        int count = 0;
        while (n != 0) {

            n = n / 10;
            count++;

        }

        System.out.println(reverseNum(m, count - 1));
        sc.close();

    }

    static int reverseNum(int m, int n) {
        if (m == 0) {
            return 0;
        }

        return (int) ((m % 10) * Math.pow(10, n) + reverseNum(m / 10, n - 1));
    }


}
