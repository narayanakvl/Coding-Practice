package striversheet.bitmanipulation;

public class CountSetBits {
    static int countSetBits(int n){
        int c=0;
        while(n>=1){
            c=c+(n&1);
            n=n>>1;
        }
        return c;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println(countSetBits(n));
    }
}
