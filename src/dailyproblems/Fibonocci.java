package dailyproblems;

public class Fibonocci {
    public static void main(String[] args) {
        int n=10;
        int num1=0;
        int num2=1;
        System.out.print(num1+" "+num2);
        for(int i=0;i<n;i++){
            int temp= num1+num2;
            System.out.print(" "+temp);
            num1=num2;
            num2=temp;

        }
    }
}
