package striversheet.arrays;

import java.util.Arrays;

public class LRotateByKmoves {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=2;
        k=k%arr.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<arr.length-k;i++){
            arr[i]=arr[i+k];
        }
        for(int i=0;i<k;i++){
            arr[arr.length-k+i]=temp[i];

        }

        System.out.println(Arrays.toString(arr));
    }
}

