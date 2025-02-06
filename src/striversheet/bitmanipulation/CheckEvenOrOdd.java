package striversheet.bitmanipulation;

public class CheckEvenOrOdd {
    static void isEvenOdd(int n){
        if((n & 1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        int n=10;
        isEvenOdd(n);
    }
}
