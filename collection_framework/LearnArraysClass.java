import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        int arr[] = { 15, 2, 2, 2, 513, 45643, 67655, 9896, 2317, 8, 9, 1430 };
        System.out.println(Arrays.toString(arr));

        // sort the array
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // binary search
        int index = Arrays.binarySearch(arr, 9896);
        System.out.println(index);

        // fill array with a value
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));

    }
}
