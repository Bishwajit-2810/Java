package Recurtion;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("before sort : ");

        System.out.println(Arrays.toString(arr));
        System.out.println("after sort : ");

        bubblesort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void bubblesort(int[] arr, int i, int j) {

        if (i == 0) {
            return;

        }
        if (i > j) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
            bubblesort(arr, i, j + 1);


        } else {
            bubblesort(arr, i - 1, 0);
        }


    }
}