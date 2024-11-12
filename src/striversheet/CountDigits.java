package striversheet;

public class CountDigits {
    public static void main(String[] args) {
        //bruteforce approach
        int n=12345;
        int c=0;
        while(n!=0){
           n=n/10;
           c++;
        }
        System.out.println("through bruteforce approach "+ c);
        //optimal approach
        int k=12345;
        int r = (int) (Math.log10(k))+1;
        System.out.println("through optimal approach "+ r);
    }
}
