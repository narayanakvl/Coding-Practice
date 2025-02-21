package striversheet.bitmanipulation;

public class XorOfNumbers {
    static int xorTillN(int n){
        int xor=0;
        if(n%4==0){
            return n;
        }else if(n%4==1){
            return 0;
        }else if(n%4==2){
            return n-1;
        }else if(n%4==3){
            return 0;
        }else{
            return n;
        }
    }
    static int xorFromLTOR(int l,int r){
        return xorTillN(l-1)^xorTillN(r);
    }
    public static void main(String[] args) {
        System.out.println(xorTillN(10));
        System.out.println(xorFromLTOR(1,10));
    }
}
