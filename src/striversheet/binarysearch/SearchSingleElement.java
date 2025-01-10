package striversheet.binarysearch;

public class SearchSingleElement{
    static int getSingleElement(int[] arr){
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,5,5};
        System.out.println(SearchSingleElement.getSingleElement(arr));
    }
}