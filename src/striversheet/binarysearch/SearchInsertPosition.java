package striversheet.binarysearch;

public class SearchInsertPosition {
    static int getIndex(int[] arr,int target){
        int low= 0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,6};
        int target=4;
        System.out.println(target+" should be placed in "+SearchInsertPosition.getIndex(arr,target)+" index");
    }
}
