package striversheet.binarysearch;

public class SearchRotatedArray {
    static int findElement(int[] arr,int target){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
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
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(SearchRotatedArray.findElement(arr,6));
    }
}
