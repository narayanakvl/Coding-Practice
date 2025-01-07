package striversheet.binarysearch;
public class MinInRotatedArray {
    static int findMin(int[] arr){
        int low=0,high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans,arr[low]);
                low=mid+1;
            }else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
                }
            }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr={5,0,1,2,3};
       System.out.println("Minimum element is "+MinInRotatedArray.findMin(arr));
    }
}
