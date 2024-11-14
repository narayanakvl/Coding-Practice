package striversheet;

public class PrimeCheck {

    boolean isPrimeBrute(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c=c+1;
            }
        }
        return c>2?false:true;
    }
    boolean isPrimeOptimal(int n){
        int c=0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                c=c+1;
                if(i*i!=n){
                    c=c+1;
                }
            }
        }
        return c>2?false:true;
    }

    public static void main(String[] args) {
        PrimeCheck pc = new PrimeCheck();
        System.out.println("Bruteforce approach : "+pc.isPrimeBrute(10));
        System.out.println("Optimal approach : " +pc.isPrimeOptimal(10) );
    }
}
