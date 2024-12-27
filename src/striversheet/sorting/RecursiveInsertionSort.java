package striversheet.sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    static void insertionSort(int[] arr,int i){
        if(i==arr.length){
            return;
        }
        int j=i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
        insertionSort(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr={5,2,1,3,6,4};
        RecursiveInsertionSort.insertionSort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
}
