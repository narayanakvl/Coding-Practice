package striversheet.binarysearch;

public class BinarySearch {
    static int getElementIndex(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target){
                high=mid-1;
            }
            if(arr[mid]<target){
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(BinarySearch.getElementIndex(arr,4));
    }
}
