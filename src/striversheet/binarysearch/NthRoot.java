package striversheet.binarysearch;

public class NthRoot {
    static int findRoot(int N,int M){
        for(int i=1;i<=M;i++){
            if(findPower(N,i)==M){
                return i;
            }
        }
        return -1;
    }
    static int findPower(int N,int i){
        int ans=i;
        for(int j=1;j<N;j++){
            ans=ans*i;
        }
        return ans;
    }
    static int findRootOptimal(int N,int M){
        int low=1, high=M;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int pow=findPower(N,mid);
            if(pow==M){
                return mid;
            }else if(pow>M){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return  ans;
    }
    public static void main(String[] args){
        System.out.println("Brute force approach: "+findRoot(3,64));
        System.out.println("Optimal approach: "+findRootOptimal(3,64));
    }
}
