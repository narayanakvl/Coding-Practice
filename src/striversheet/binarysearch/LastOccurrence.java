package striversheet.binarysearch;

public class LastOccurrence {
    static int findLast(int[] arr, int target){
        int res = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,6};
        System.out.println(LastOccurrence.findLast(arr,2));
    }
}
