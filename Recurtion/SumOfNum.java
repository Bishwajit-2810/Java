package Recurtion;

import java.util.Scanner;

public class SumOfNum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        System.out.println(sum(m));
        sc.close();

    }

    static int sum(int m) {
        if (m == 0) {
            return 0;

        }

        return m + sum(m - 1);


    }


}







