package striversheet.bitmanipulation;

public class Divide2Integers {
    static int divide(int dividend, int divisor) {
        boolean negative = false;
        if(dividend<0 && divisor>0 || dividend>0 && divisor<0){
            negative=true;
        }
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int temp = dividend;
        int ans=0;
        while(temp>=divisor){
           int cnt=0;
           while(temp<=(divisor<<cnt+1)){
               cnt++;
           }
           temp=temp-(divisor * )
           ans=ans+(1<<cnt);
        }
        return negative?-ans:ans;
    }
    public static void main(String[] args) {
        int dividend = 22;
        int divisor = 3;
        System.out.println(divide(dividend,divisor));
    }
}
