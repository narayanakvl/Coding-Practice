package striversheet.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    static List<List<Integer>> powerSet(int[] arr) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i <= (1<<arr.length)-1; i++) {
            List<Integer> lt=new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                if((i & (1<<j))!=0){
                    lt.add(arr[j]);
                }
            }
            res.add(lt);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,4,3};
        System.out.println(powerSet(arr));
    }
}
