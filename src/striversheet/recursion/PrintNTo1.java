package striversheet.recursion;

public class PrintNTo1 {
    static void print(int i,int n){
        if(i>n) return;
        System.out.println(n);
        print(i,n-1);
    }

    public static void main(String[] args) {
        int n=5;
        print(1,n);
    }
}
