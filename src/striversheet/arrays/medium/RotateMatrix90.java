package striversheet.arrays.medium;

import java.util.Arrays;

public class RotateMatrix90 {
    static int[][] rotate(int[][] arr){
        int n=arr.length;
        int[][] arr1=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr1[j][n-1-i]=arr[i][j];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.deepToString(RotateMatrix90.rotate(arr)));
    }
}
