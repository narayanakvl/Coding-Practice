package striversheet.bitmanipulation;

public class SwapNumbers {
    static void swapNumbers(int a, int b) {
        System.out.println("before swap a= "+a+" b= "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap a= "+a+" b= "+b);
    }
    public static void main(String[] args) {
        swapNumbers(1,2);
    }
}
