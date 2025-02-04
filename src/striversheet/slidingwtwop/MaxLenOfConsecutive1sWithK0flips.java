package striversheet.slidingwtwop;

public class MaxLenOfConsecutive1sWithK0flips {
    static int getMaxLen(int[] arr,int k){
        int maxLen=0;
        for(int i=0;i<arr.length;i++){
            int zeroes=0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    zeroes++;
                }
                if(zeroes<=k){
                    int len=j-i+1;
                    maxLen=Math.max(maxLen,len);
                }else{
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,0,0,1,1,1,1,1,0};
        System.out.println(getMaxLen(arr,2));
    }
}
