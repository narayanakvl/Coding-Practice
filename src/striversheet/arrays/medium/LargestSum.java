package striversheet.arrays.medium;

public class LargestSum {
    public static int getSum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                max=Math.max(sum,max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,3,-2,4,-1};
        System.out.println(LargestSum.getSum(arr));
    }
}

