package striversheet.recursion;

public class Fibonacci {
    static int getSeries(int n){
        if(n<=1){
            return n;
        }
        int first = getSeries(n-1);
        int slast = getSeries(n-2);
        return first+slast;
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(Fibonacci.getSeries(n));
    }
}
