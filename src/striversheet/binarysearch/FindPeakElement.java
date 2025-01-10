package striversheet.binarysearch;

public class FindPeakElement {
    static int findPeak(int[] arr){
        for(int i=0;i<arr.length;i++){
            if((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 || arr[i+1]<arr[i])) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,3,3,6,5};
        System.out.println(findPeak(arr));
    }
}

