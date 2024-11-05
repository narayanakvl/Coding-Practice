package dailyproblems;

public class PerfectNumber {
    public static void main(String[] args) {
        int n=6;
        int sum=1;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(sum==n){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}