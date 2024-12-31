package striversheet.binarysearch;

public class UpperBound {
    static int getUpperBound(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>target){
                return i;
            }
        }
        return 0;
    }
    static int getUpperBoundOptimal(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(ans==-1) return arr.length-1;
        else return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,9,15,19};
        System.out.println("Upper Bound bruteforce: "+UpperBound.getUpperBound(arr,16));
        System.out.println("Upper Bound optimal: "+UpperBound.getUpperBoundOptimal(arr,16));
    }
}
