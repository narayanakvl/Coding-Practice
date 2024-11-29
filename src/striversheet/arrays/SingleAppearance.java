package striversheet.arrays;
//Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
public class SingleAppearance {
    public int findSingleNumber(int[] arr){
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c=c+1;
                }
            }
            if(c==1){
                return arr[i];
            }
        }
        return -1;
    }
    public int usingXorOptimal(int[] arr){
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String[] args){
        int[] arr ={1,2,2,3,3,1,4,5,4};
        SingleAppearance sa = new SingleAppearance();
        System.out.println("Using bruteforce: "+sa.findSingleNumber(arr));
        System.out.println("Using Xor Optimal: "+sa.usingXorOptimal(arr));
    }
}
