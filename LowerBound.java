// this is program to solve a question of lower bound or first occurence

import java.util.*;
import java.io.*;

public class LowerBound {

    public static int BinarySearch(int arr[],int target) {
        int low=0, high=arr.length-1; 
        int result=-1;

        while(low<=high) {
            int mid = low+(high-low)/2;
            if(arr[mid]==target) {
                result=mid;
                // travese to the left side of array.
                high = mid-1;
            }
            else if(arr[mid]>target) {
                high=mid-1;
            }
            else {
                low = mid +1;
            }
        }

        return result;
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int elements;
        System.out.println("Enter the number of Elements in Array.: ");
        elements=sc.nextInt();

        int arr[]=new int[elements];

        System.out.println("Enter the Elements of Array.: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target Elements : ");
        int target =sc.nextInt();


        int result = BinarySearch(arr, target);
        if(result==-1) {
            System.out.println("Target element is not present in the Array.");
        }
        else{
            System.out.println("The first Occurence of a Target Element is at :- "+result);
        }

    }
}