package Recurtion;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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

        selectionsort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void selectionsort(int[] arr, int i, int j, int max) {

        if (i == 0) {
            return;

        }
        if (i > j) {
            if (arr[j] > arr[max]) {
                selectionsort(arr, i, j + 1, j);
            } else {
                selectionsort(arr, i, j + 1, max);
            }


        } else {

            int temp = arr[max];
            arr[max] = arr[i - 1];
            arr[i - 1] = temp;
            selectionsort(arr, i - 1, 0, 0);
        }


    }
}
