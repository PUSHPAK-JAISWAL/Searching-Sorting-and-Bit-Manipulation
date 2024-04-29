// this is a program to implement Bubble sort in java

import java.util.*;
import java.io.*;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            boolean swap = false;
            // for every iteration we get the bigest element at the end.
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]>arr[j+1]) {
                    // swap between the arr
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swap = true;
                }
            }

            if(!swap) {
                break;
            }
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
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

        bubbleSort(arr);
    }
}
