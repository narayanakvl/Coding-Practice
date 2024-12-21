package striversheet;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    static void countFrequency(int[] arr){
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            int count=0;
            for(int j=0;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println("count of "+arr[i] +" is " +count);
        }

    }
    static void countFreqOptimal(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }else{
                mp.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            System.out.println("Count of "+entry.getKey()+" is "+entry.getValue());
        }
    }
    public static void main(String[] args){
        int[] arr ={1,2,1,3,4,2,3,6,4};
        System.out.println("Bruteforce Approach");
        Frequency.countFrequency(arr);
        System.out.println("Optimal approach");
        Frequency.countFreqOptimal(arr);
    }
}
