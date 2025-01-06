package striversheet.binarysearch;

public class SearchRotatedArrayII {
    static boolean isPresent(int[] arr,int target){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                continue;
            }
            if(arr[mid]>=arr[low]){
                if(arr[low]<=target && arr[mid]>target){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[high]>=target && arr[mid]<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,3,3,3,3};
        System.out.println(SearchRotatedArrayII.isPresent(arr,1));
    }
}
