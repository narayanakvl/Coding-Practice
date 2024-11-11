package striversheet;

public class ReverseDigits {
    public static void main(String[] args) {
        int n=12312300;
        int k=0;
        while(n!=0){
            int r = n%10;
            n=n/10;
            k = (k * 10) + r;
        }
        System.out.println(k);
    }
}
