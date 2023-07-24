package Recurtion;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //  int m = sc.nextInt();


        printstar(4, 0);

        sc.close();
    }

    static void printstar(int row, int col) {

        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            printstar(row, col + 1);
        } else {
            System.out.println();
            printstar(row - 1, 0);
        }


    }


}
