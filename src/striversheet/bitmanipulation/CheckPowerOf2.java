package striversheet.bitmanipulation;

public class CheckPowerOf2 {
    static void isPowerOf2(int n){
        if((n & n-1)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args){
        int n=32;
        isPowerOf2(n);
    }
}
