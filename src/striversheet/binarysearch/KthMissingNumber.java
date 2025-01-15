package striversheet.binarysearch;

import java.util.ArrayList;
import java.util.List;
public class KthMissingNumber {

    static boolean contains(int[] arr,int target){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
    static int getNumber(int[] arr,int k){
        int ans=0;
        List<Integer> lt = new ArrayList<>();
        for(int i=1;i<=arr[arr.length-1];i++){
            if(!contains(arr,i)){
                lt.add(i);
            }
        }
        return lt.get(k-1);
    }

    public static void main(String[] args) {
        int[] arr ={4,5,6,7,8,10};
        System.out.println(getNumber(arr,3));
    }
}
