package striversheet.arrays;

public class LongestSubArray {
    public static int getLongestSubArray(int[] arr,int k){
        int len=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i;j<arr.length;j++){
                s=s+arr[j];
                if(s==k){
                    len=(Math.max(len,j-i+1));
                }
            }
        }
        return len;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,2,3,1,5,1};
        int k=10;
        int x = getLongestSubArray(arr,k);
        System.out.println(x);
    }
}
