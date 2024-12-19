package striversheet.recursion;

public class StringPalindrome {
    static void isPalindrome(int l,String str,String result){
        if(str.length()==result.length()){
            if(str.equals(result)){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
            return;
        }
        result=result+str.charAt(l-1);
        l--;
        isPalindrome(l,str,result);
    }
    static void isPalindromeBetter(String str,String result){
        if(str.length()<=result.length()){
            if(str.equals(result) || str.equals(result.substring(0,result.length()-1))){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }
            return;
        }
        result=result+str.charAt(str.length()-1);
        String str1=str.substring(0,str.length()-1);
        isPalindromeBetter(str1,result);
    }
    static void isPalindromeOptimal(int i,String str){
        if(i>str.length()/2){
            System.out.println("Yes");
            return;
        }
        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            System.out.println("No");
            return;
        }
        isPalindromeOptimal(i+1,str);
    }
    public static void main(String[] args) {
        String str="abaaba";
        String result="";
        System.out.print("Bruteforce approach: ");
        StringPalindrome.isPalindrome(str.length(),str,result);
        System.out.print("Better approach: ");
        StringPalindrome.isPalindromeBetter(str,result);
        System.out.print("Optimal approach: ");
        StringPalindrome.isPalindromeOptimal(0,str);
    }
}
