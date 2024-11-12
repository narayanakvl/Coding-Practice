package striversheet;

public class PalindromeCheck {
    public boolean isPalindrome(int n){
        if(n<0){
            return false;
        }
        int temp=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return temp==rev;
    }
    public static void main(String[] args) {
        PalindromeCheck pc = new PalindromeCheck();
        System.out.println(pc.isPalindrome(101));
    }
}
