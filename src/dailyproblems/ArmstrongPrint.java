package dailyproblems;

import static java.lang.Math.*;
import static java.lang.Math.log10;

public class ArmstrongPrint {
    public static void main(String[] args) {
        int n=20000000;


        for(int i=0;i<n;i++){
            int temp=i;
            int num=i;
            int sum =0;
            int len=(int) floor(log10(temp))+1;
            while(num>0){
                int digit=num%10;
                num=num/10;
                sum=sum+(int) pow(digit,len);
                if(sum==temp){
                    System.out.print(temp+" ");
                }
            }
        }

    }
}
