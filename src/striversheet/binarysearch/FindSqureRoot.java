package striversheet.binarysearch;

public class FindSqureRoot {
    static int findSqrt(int target){
        int ans=-1;
        for(int i=1;i<=target;i++){
            if(i*i<=target){
                ans=i;
            }
        }
        return ans;
    }
    static int findSqrtOptimal(int target){
        int ans=-1;
        int low=1;
        int high=target;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=target){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Brute force approach: "+findSqrt(1000));
        System.out.println("Optimal approach: "+findSqrtOptimal(1000));
    }
}
