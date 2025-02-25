package striversheet.advancedmaths;
//to print prime numbers till n using Sieve of Eratosthenes Algorithm
public class SieveOfEratosthenes {
    static void printPrime(int n) {
        int[] arr = new int[n+1];
        for (int i = 2; i <= n; i++) {
            arr[i] = 1;
        }
        for (int i = 2; i*i <= n; i++) {
            if(arr[i] == 1){
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = 0;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(arr[i] == 1){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        int n=2;
        printPrime(n);
    }
}
