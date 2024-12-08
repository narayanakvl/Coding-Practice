package striversheet.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    static List<Integer> findLeaders(int[] arr){
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    break;
                }
                if(j==arr.length-1){
                    ls.add(arr[i]);
                }
            }

        }
        ls.add(arr[arr.length-1]);
        return ls;
    }
    static List<Integer> findLeadersOptimal(int[] arr){
        List<Integer> ls = new ArrayList<>();
        int max=arr[arr.length-1];
        ls.add(max);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                ls.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(ls);
        return ls;
    }

    public static void main(String[] args) {
        int[] arr ={10, 22, 12, 3, 0, 6};
        System.out.println("Bruteforce approach : "+LeadersInArray.findLeaders(arr));
        System.out.println("Optimal Approach : "+LeadersInArray.findLeadersOptimal(arr));
    }
}
