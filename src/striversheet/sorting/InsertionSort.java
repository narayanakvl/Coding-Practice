package striversheet.sorting;

import java.util.Arrays;

public class InsertionSort {
    static int[] getArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,4,2,6,5};
        System.out.println(Arrays.toString(InsertionSort.getArray(arr)));
    }
}
