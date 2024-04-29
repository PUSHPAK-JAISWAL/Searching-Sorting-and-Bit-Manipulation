// this is a program to show the use of insertion sort in java 

import java.util.*;
import java.io.*;

public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]) {
                // swap the elements
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements;
        System.out.println("Enter the Number of Elements. : ");
        elements = sc.nextInt();
        int arr[]=new int[elements];
        System.out.println("Enter the Elements of the Array. : ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt(); 
        }
        insertionSort(arr);
        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));
    }
}