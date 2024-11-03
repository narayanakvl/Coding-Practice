package dailyproblems;

import java.math.*;

public class ArmstrongCheck {
    public static void main(String[] args) {
        int n=153;
        int len= (int)Math.floor(Math.log10(Math.abs(n)))+1;
        System.out.print(len);
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit = temp%10;
            temp=temp/10;
            sum=sum+(int)Math.pow(digit,len);
        }
        if(n==sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
