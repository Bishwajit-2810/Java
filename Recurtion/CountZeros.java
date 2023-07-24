package Recurtion;

import java.util.Scanner;

public class CountZeros {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int count = 0;

        System.out.println(counter(m, count));
        sc.close();

    }

    static int counter(int m, int count) {

        if (m == 0) {
            return count;
        }

        if (m % 10 == 0) {
            return counter(m / 10, count + 1);
        }
        return counter(m / 10, count);


    }


}
