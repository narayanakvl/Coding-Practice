package striversheet.recursion;

public class SumOfNumbers {
    static int s=0;
    static void getSum(int i, int n){
        if(i>n){
            System.out.println(s);
            return;
        }
        s=s+i;
        getSum(i+1,n);
    }
    //using function
    static int  getSumByFunction(int n){
        if(n==0){
            return 0;
        }
        return n+getSumByFunction(n-1);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.print("By using parameters: ");
        SumOfNumbers.getSum(1,n);
        System.out.println("By using function: "+ SumOfNumbers.getSumByFunction(n));
    }
}
