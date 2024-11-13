package striversheet;

public class Gcd {
    public static void main(String[] args) {
        int n1=8;
        int n2=10;
        int l= (n1 > n2) ? n2 : n1;
        int g=1;
        for(int i=2;i<=l;i++){
            if(n1%i==0 && n2%i==0){
                g=i;
            }
        }
        System.out.println(g);


    }
}
