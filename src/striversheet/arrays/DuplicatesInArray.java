package striversheet.arrays;

import java.util.HashSet;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,5};
        HashSet<Integer> hs = new HashSet<>();
        for(int n:arr){
            hs.add(n);
        }
        System.out.println(hs);
    }
}
