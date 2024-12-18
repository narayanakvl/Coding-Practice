package striversheet.recursion;

import java.util.Arrays;

public class ReverseArray {
    static int[] getArray(int[] arr,int a, int z){
        if(a>z){
            return arr;
        }
        int temp=arr[a];
        arr[a]=arr[z];
        arr[z]=temp;
        return getArray(arr, a+1,z-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(ReverseArray.getArray(arr,0,arr.length-1)));
    }

}
