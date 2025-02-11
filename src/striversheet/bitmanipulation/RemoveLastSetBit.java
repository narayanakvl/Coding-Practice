package striversheet.bitmanipulation;

public class RemoveLastSetBit {
    static int removeLastSetBit(int n) {
        n=(n&n-1);
        return n;
    }
    public static void main(String[] args) {
        System.out.println(removeLastSetBit(3));
    }
}
