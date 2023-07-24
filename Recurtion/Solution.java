// question from leetcode
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/


package Recurtion;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println(numberOfSteps(m));
        sc.close();


    }
    public static int numberOfSteps(int num) {
            return helper(num,0);
    }
    private static int helper(int num,int count){
        if (num==0){

            return count;
        }
        if(num%2==0){
            return helper((num/2),count+1);
        }
        else{
            return helper((num-1),count+1);
        }




    }


}