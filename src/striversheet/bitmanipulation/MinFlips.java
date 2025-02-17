package striversheet.bitmanipulation;

public class MinFlips {
    static int minFlips(int a, int b) {
        int n= a^b;
        int c=0;
        while(n>=1){
            c=c+(n&1);
            n=n>>1;
        }
        return c;
    }
    public static void main(String[] args) {
        int a=10;
        int b=7;
        System.out.println(minFlips(a,b));
    }
}
