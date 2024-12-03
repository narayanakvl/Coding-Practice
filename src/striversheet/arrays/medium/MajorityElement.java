package striversheet.arrays.medium;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,1,1};
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=i;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c=c+1;
                }
            }
            if(c>arr.length/2){
                System.out.println(arr[i]);
            }
        }
    }
}
