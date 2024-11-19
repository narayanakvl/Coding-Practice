package striversheet.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,9,1,3,9,3,63,3,1};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int smax=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(smax<arr[i] && arr[i]<max ){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
