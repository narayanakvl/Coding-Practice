package striversheet.arrays;

public class LargestInArray {
    public int getLargeNumber(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={1,4,2,6,8,34,75,2,4};
        LargestInArray la = new LargestInArray();
        int n = la.getLargeNumber(arr);
        System.out.println(n);
    }
}
