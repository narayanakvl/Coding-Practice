package striversheet.sorting;

import java.util.Arrays;

public class BubbleSort {
    static int[] getSortedArray(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,5,7,2,4,3,6};
        System.out.println(Arrays.toString(BubbleSort.getSortedArray(arr)));
    }
}
