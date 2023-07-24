package Recurtion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("before reverse : ");

        System.out.println(Arrays.toString(arr));


        int i = 0;
        System.out.println("after reverse : ");

        reverse(arr, i);

        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void reverse(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
        reverse(arr, i + 1);


    }


}
