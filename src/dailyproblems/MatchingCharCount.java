package dailyproblems;

public class MatchingCharCount {
    public static void main(String[] args){
        String str1="abcdefgh";
        String str2="abkdiufh";
        int count=0;
        int len=Math.min(str1.length(),str2.length());
        for(int i=0;i<len;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                count++;
            }
        }
        System.out.println("count is : "+count);
    }
}
