package striversheet.recursion;

public class Recursion {
    static int count=0;
    static void recursiveFn(){
        if(count==3){
            return;
        }
        System.out.println(count);
        count++;
        recursiveFn();
    }

    public static void main(String[] args) {
        recursiveFn();
    }
}
