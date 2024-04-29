// this is a program to implement the selection sort in java
import java.util.*;
import java.io.*;


public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[min_idx]) {
                    min_idx=j;
                }
            }
            if(min_idx !=i) {
                int temp = arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
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
        selectionSort(arr);
        System.out.println("Sorted Array is : ");
        System.out.println(Arrays.toString(arr));
    }
}
