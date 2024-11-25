package striversheet.arrays;

public class LinearSearch {
    public int getElementIndex(int n,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
        int[] arr = {1,2,3,4,5};
        int n=3;
        LinearSearch ls = new LinearSearch();
        System.out.println(ls.getElementIndex(n,arr));
    }
}
