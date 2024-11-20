package striversheet.arrays;

public class SortedArrayCheck {
    public boolean isSorted(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,5,4};
        SortedArrayCheck sa=new SortedArrayCheck();
        boolean result = sa.isSorted(arr);
        System.out.println(result);
    }
}
