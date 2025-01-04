package striversheet.binarysearch;

public class LastOccurrence {
    static int findLast(int[] arr, int target){
        int res = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                res = i;
                break;
            }
        }
        return res;
    }
    static int findLastOptimal(int[] arr, int target){
        int last=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,3,4,6};
        System.out.println("LastOccurrence bruteforce: "+LastOccurrence.findLast(arr,2));
        System.out.println("LastOccurrence optimal: "+LastOccurrence.findLastOptimal(arr,2));
    }
}
