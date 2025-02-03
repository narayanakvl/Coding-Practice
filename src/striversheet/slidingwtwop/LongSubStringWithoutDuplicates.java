package striversheet.slidingwtwop;

import java.util.HashSet;

public class LongSubStringWithoutDuplicates {
    static int findMaxLength(String str){
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            HashSet<Character> st = new HashSet<>();
            for(int j=i;j<str.length();j++){
                if(st.contains(str.charAt(j))){
                    break;
                }
                st.add(str.charAt(j));
            }
            maxLen=Math.max(maxLen,st.size());
        }
        return maxLen;
    }
    public static void main(String[] args){
        String str="abcabdf";
        System.out.println(findMaxLength(str));
    }
}
