package striversheet.arrays.medium;

import java.util.*;

public class LongConsecutiveSequence {
    static int findConsecutives(ArrayList<Integer> al){
        int longest=1;
        for(int i=0;i<al.size();i++){
            int x=al.get(i);
            int c=1;
            while(al.contains(x+1)){
                c=c+1;
                x=x+1;
            }
            longest = Math.max(longest,c);
        }
        return longest;
    }

    static int longSequenceOptimal(ArrayList<Integer> al){
        Set<Integer> st = new HashSet<>(al);
        int longest =1;
        for(int i:st){
            if(!st.contains(i-1)){
                int c=1;
                int x=i;
                while(st.contains(x+1)){
                    c=c+1;
                    x=x+1;
                }
                longest=Math.max(longest,c);
            }
        }
        return longest;
    }
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(2, 1, 5,3,6,7,0,4));
        System.out.println("Brute force approach : "+LongConsecutiveSequence.findConsecutives(al));
        System.out.println("Optimal approach : "+LongConsecutiveSequence.longSequenceOptimal(al));
    }
}
