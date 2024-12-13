package striversheet.recursion;

public class PrintName {
    static void printName(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("kvl");
        printName(i+1,n);
    }

    public static void main(String[] args) {
        int n=5;
        printName(1,n);
    }
}
