package striversheet.arrays.medium;

public class MaximunProfit {
    static int maxProfit(int[] arr) {
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(MaximunProfit.maxProfit(arr));
    }
}
