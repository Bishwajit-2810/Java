package Patterns_in_java;

import java.util.Scanner;

public class P_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;

        System.out.print("enter number : ");
        m = sc.nextInt();

        for (int i = 0; i < 2 * m ; i++) {
            int a;
            if(i>m)
            {

                a=2*m-i-1;
            }else {


                a=i;

            }


            for (int j = 0;j<a ; j++) {
                System.out.print("*");


        }
            System.out.println();


    }
        sc.close();
}

}
