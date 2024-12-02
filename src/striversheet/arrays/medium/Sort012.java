package striversheet.arrays.medium;

import java.util.Arrays;

public class Sort012 {
    public int[] sortArray(int[] arr){
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                a++;
            }else if(arr[i]==1){
                b++;
            }else{
                c++;
            }
        }
        for(int j=0;j<a;j++){
            arr[j]=0;
        }
        for(int k=a;k<a+b;k++){
            arr[k]=1;
        }
        for(int l=a+b;l<a+b+c;l++){
            arr[l]=2;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,0,0,0,2};
        Sort012 s = new Sort012();
        System.out.println(Arrays.toString(s.sortArray(arr)));


    }
}
