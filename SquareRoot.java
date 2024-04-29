// this is a program to solve the square root of a array problem

import java.util.*;
import java.io.*;

public class SquareRoot {
    public static int findSquareRoot(int nums) {
        int low=0,high=nums,result=-1;

        while (low<=high) {
            int mid=low+(high-low)/2;
            int val=mid*mid;

            if(val==nums) {
                return mid;
            }
            else if(val<nums) {
                result = mid;
                low=mid+1;

            }
            else {
                high=mid+1;
            }
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Which you want the Square root. : ");
        int num=sc.nextInt();


        int result = findSquareRoot(num);
        System.out.println("Square root of a given Number is : "+result);
    }
}