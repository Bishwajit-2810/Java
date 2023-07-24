package Recurtion;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheArrayIsSortedOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the array is  : ");

        System.out.println(Arrays.toString(arr));

        System.out.println("the array is assorted : " + sorted(arr, 0));


        sc.close();


    }

    static boolean sorted(int[] arr, int i) {
        if (arr[i] == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] && sorted(arr, i + 1);


    }


}