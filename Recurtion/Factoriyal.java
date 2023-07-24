package Recurtion;

import java.util.Scanner;

public class Factoriyal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(factoriyal(m));


        sc.close();
    }

    static int factoriyal(int m) {
        if (m == 1) {
            return 1;

        }

        return m * factoriyal(m - 1);


    }


}








