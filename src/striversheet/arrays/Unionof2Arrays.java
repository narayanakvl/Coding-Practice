package striversheet.arrays;

import java.util.HashSet;

public class Unionof2Arrays {
    public HashSet<Integer> findUnion(int[] arr1,int[] arr2){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        return hs;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,2,3,7,9};
        int[] arr2 = {1,2,3,4,5,7};
        Unionof2Arrays un = new Unionof2Arrays();
        System.out.println(un.findUnion(arr1,arr2));
    }
}
