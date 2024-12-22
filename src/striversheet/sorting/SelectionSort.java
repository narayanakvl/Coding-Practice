package striversheet.sorting;

import java.util.Arrays;

public class SelectionSort {
    static int[] sortedArray(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,6,2,1,4,8,2,1,5,10,0};
        System.out.println(Arrays.toString(SelectionSort.sortedArray(arr)));
    }
}
