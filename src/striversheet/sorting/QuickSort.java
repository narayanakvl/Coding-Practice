package striversheet.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    static void quickSortAlgo(List<Integer> arr, int low,int high){
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSortAlgo(arr, low, pIndex - 1);
            quickSortAlgo(arr, pIndex + 1, high);
        }
    }
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }
            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        quickSortAlgo(arr, 0, arr.size() - 1);
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 1, 3});
        QuickSort.quickSort(arr);
        System.out.println(arr);
    }
}
