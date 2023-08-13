package Recurtion;

import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("find the number you want : ");
        int k = sc.nextInt();

        System.out.println(binarySearch(arr, 0, arr.length - 1, k));
        sc.close();
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        //base conditions
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] > target) {

            return binarySearch(arr, 0, mid - 1, target);

        } else {
            return binarySearch(arr, mid + 1, end, target);
        }


    }


}






