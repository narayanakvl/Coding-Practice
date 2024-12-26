package striversheet.sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    static void bubbleSort(int[] arr,int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr={2,6,3,1,4,5};
        RecursiveBubbleSort.bubbleSort(arr,arr.length);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
