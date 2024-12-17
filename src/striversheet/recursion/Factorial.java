package striversheet.recursion;

public class Factorial {
    static int getFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*getFactorial(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(Factorial.getFactorial(n));
    }
}
