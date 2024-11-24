package striversheet.arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
    public int[] moveZeroes(int[] arr){
        int[] arr1 = new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) {
                arr1[j] = arr[i];
                j = j + 1;
            }
        }
        return arr1;
    }
    public int[] moveZeroesOptimal(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==0){
            return arr;
        }
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j=j+1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,0,4,6,0,7,0};
        MoveZeroesToEnd mz = new MoveZeroesToEnd();
        System.out.println(Arrays.toString(mz.moveZeroes(arr)));
        System.out.println(Arrays.toString(mz.moveZeroesOptimal(arr)));
    }
}
