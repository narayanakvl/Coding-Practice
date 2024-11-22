package striversheet.arrays;

import java.util.Arrays;

public class LeftRotateArray {
    public int[] rotateArray(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            arr1[i]=arr[i+1];
            if(arr.length-2==i){
                arr1[i+1]=arr[0];
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,9,5,2};
        LeftRotateArray lr = new LeftRotateArray();
        System.out.println(Arrays.toString(lr.rotateArray(arr)));
    }
}
