package dailyproblems;

public class DigitalRoot {
    public static void main(String[] args) {
        //formula: 1 + (n-1) % 9
        int n=1235;
        while(n>=10){
            int sum=0;
            while(n>0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            n=sum;

        }
        System.out.println(n);

    }
}

