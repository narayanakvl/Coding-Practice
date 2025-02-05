package striversheet.bitmanipulation;

public class CheckSetOrNot {
    static boolean isSet(int n,int k){
        if((n & 1<<k)>0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n=13;
        System.out.println(isSet(n,1));
    }
}
