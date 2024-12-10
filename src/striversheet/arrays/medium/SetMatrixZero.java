package striversheet.arrays.medium;

import java.util.Arrays;

public class SetMatrixZero {
    static int[][] setZero(int[][] arr) {
        int n = arr.length;
        int m =arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < m; k++) {
                        if (arr[i][k] != 0)
                            arr[i][k] = -1;
                    }
                    for (int l = 0; l < n; l++) {
                        if (arr[l][j] != 0)
                            arr[l][j] = -1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }
    static int[][] setZeroBetter(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int[] r=new int[n];
        int[] c=new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]==1 || c[j]==1){
                    arr[i][j]=0;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] arr1 ={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("Brute force approach: "+Arrays.deepToString(SetMatrixZero.setZero(arr)));
        System.out.println("Better approach: "+Arrays.deepToString(SetMatrixZero.setZeroBetter(arr1)));
    }
}
