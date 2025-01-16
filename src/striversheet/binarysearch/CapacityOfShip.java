package striversheet.binarysearch;

import java.util.Arrays;
import java.util.Collections;

public class CapacityOfShip {
    static int findCapacity(int[] arr,int d){
        int low= Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<arr.length;i++){
            high=high+arr[i];
            low=Math.max(low,arr[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int n=findDays(arr,mid);
            if(n<=d) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    static int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public static void main(String[] args) {
        int[] arr={5,4,5,2,3,4,5,6};
        System.out.println(findCapacity(arr,5));
    }
}
