package striversheet.binarysearch;

public class LowerBound {
    static int getLowerBound(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return arr.length-1;
    }
    static int getLowerBoundOptimal(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
        }
        if(ans==-1) return arr.length-1;
        else return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("LowerBound bruteforce approach: "+LowerBound.getLowerBound(arr,4));
        System.out.println("LowerBound optimal approach: "+LowerBound.getLowerBoundOptimal(arr,4));
    }
}
