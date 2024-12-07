package striversheet.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
//If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).

public class NextPermutation {
    static ArrayList<Integer> getPermutation(ArrayList<Integer> al){
        int n=al.size();
        int in = -1;
        for(int i=n-1;i>0;i--){
            if(al.get(i)>al.get(i-1)){
                in=i-1;
                break;
            }
        }
        if(in==-1){
            Collections.reverse(al);
            return al;
        }
        for(int i=n-1;i>in;i--){
            if(al.get(in)<al.get(i)){
                int temp=al.get(in);
                al.set(in,al.get(i));
                al.set(i,temp);
                break;
            }
        }

        List<Integer> subList= al.subList(in+1,n);
        Collections.reverse(subList);
        return al;

    }

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(2, 1, 5, 4, 3, 0, 0));
        System.out.println(NextPermutation.getPermutation(al));
    }
}
