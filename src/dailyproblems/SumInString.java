package dailyproblems;

public class SumInString {
    int getSum(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)) {
                sum = sum + Character.getNumericValue(c);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String s="sadshjb1344g";
        SumInString ss=new SumInString();
        System.out.println(ss.getSum(s));
    }
}
