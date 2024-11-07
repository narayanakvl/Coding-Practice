package dailyproblems;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        //Brute force
        // int[] ar=new int[2];
        // for(int i=0;i<nums.length-1 ;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             ar[0]=i;
        //             ar[1]=j;
        //         }
        //     }

        // }
        // return ar;

        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ar = new int[2];

        for(int j=0;j<nums.length;j++){
            if(hm.containsKey(target-nums[j])){
                ar[1]=j;
                ar[0]=hm.get(target-nums[j]);
            }
            hm.put(nums[j],j);
        }

        return ar;



    }

    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target=9;
        TwoSum twoSum = new TwoSum();
        int[] m = twoSum.twoSum(nums, target);
        for (int a:m){
            System.out.println(a);
        }

    }
}
