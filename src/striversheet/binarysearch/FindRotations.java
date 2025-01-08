package striversheet.binarysearch;

public class FindRotations {
    static int findKRotations(int[] arr){
        int low=0,high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ans=arr[low];
                    res=low;
                }
                low=mid+1;
            }else{
                if(arr[mid]<ans){
                    ans=arr[mid];
                    res=mid;
                }
                high=mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={4,5,6,1,2,3};
        System.out.println("Number is Rotations = "+FindRotations.findKRotations(arr));
    }
}
