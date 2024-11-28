package striversheet.arrays;
//Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
public class MaxConsecutiveOnes {
    public int getCount(int[] arr) {
        int c = 0;
        int mc = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                c=c+1;
            }else{
                if(mc<c){
                    mc=c;
                    c=0;
                }else{
                    c=0;
                }
            }
        }
        return Math.max(mc, c);
    }
    public static void main(String[] args){
        int[] arr= {1,1,0,1,0,1,1,1,1,0};
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        System.out.println(mco.getCount(arr));
    }
}
