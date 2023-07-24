package Recurtion;

import java.util.Scanner;

public class LinearSearch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            System.out.print("find the number you want : ");
            int k = sc.nextInt();

            System.out.println("your data is in index : " + (linearSearch(arr, 0, k) + 1));
        }

    }

    static int linearSearch(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }


        if (arr[i] == key) {
            return i;
        } else {
            return linearSearch(arr, i + 1, key);
        }


    }


}
