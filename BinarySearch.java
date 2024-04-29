// this is a class to test the use of binary search

import java.util.*;
import java.io.*;

public class BinarySearch {

    public static int binarySearch(int arr[],int target) {
        int low=0;int high=arr.length-1;

        while(low<=high) {
            int mid=low+(high-low)/2;

            if(arr[mid]==target) {
                return mid;
            }
            if(arr[mid]<target) {
                low= mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.println("Enter the Number of Elements Present in the Array.: ");
        n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter the Elements of the Array.: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the The Target Element.: ");
        int target=sc.nextInt();

        int index=binarySearch(arr,target);

        if(index!=-1) {
            System.out.println("The Element is present at index.: "+index);
        }
        else {
            System.out.println("The Element is not present in the Array.!");
        }

    }
}
