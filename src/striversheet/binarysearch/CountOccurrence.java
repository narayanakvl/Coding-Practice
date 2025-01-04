package striversheet.binarysearch;

public class CountOccurrence {
    static int getCount(int[] arr, int target){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans++;
            }
        }
        return ans;
    }
    static int firstOccurrence(int[] arr, int target){
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] arr, int target){
        int ans=-1;
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    static int getCountOptimal(int[] arr, int target){
        return lastOccurrence(arr,target)-firstOccurrence(arr,target)+1;
    }
    public static void main(String[] args){
        int[] arr={1,2,2,2,2,3,4,5,5,6};
        System.out.println("Bruteforce approach: "+CountOccurrence.getCount(arr,2));
        System.out.println("Optimal approach: "+CountOccurrence.getCountOptimal(arr,2));
    }
}
