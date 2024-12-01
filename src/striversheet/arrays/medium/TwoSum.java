package striversheet.arrays.medium;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr,int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int r1=0;
        int r2=0;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        for(int j=0;j<arr.length;j++){
            if(hm.containsKey(k-arr[j])){
                r1=arr[j];
                r2=arr[hm.get(k-arr[j])];
                break;
            }
        }
        return new int[]{r1,r2};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k=3;
        TwoSum t=new TwoSum();
        int[] ar=t.twoSum(arr,k);
        for(int i:ar){
            System.out.println(i);
        }
    }
}
