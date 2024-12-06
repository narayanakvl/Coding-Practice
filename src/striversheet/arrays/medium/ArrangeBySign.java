package striversheet.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrangeBySign {
    static int[] arrangeArray(int[] arr) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int num : arr) {
            if (num > 0) {
                positives.add(num);
            } else if (num < 0) {
                negatives.add(num);
            }
        }

        int[] result = new int[arr.length];
        int index = 0;
        for (int i = 0; i < positives.size(); i++) {
            result[index++] = positives.get(i);
            result[index++] = negatives.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-3,-1,-2,3};
        System.out.println(Arrays.toString(arrangeArray(arr)));
    }
}
