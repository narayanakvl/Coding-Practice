package striversheet.arrays;

public class MissingNumber {

    public static int findNumOptimal(int[] arr){
        int i1 = (arr.length + 2) / 2;
        int sum1=(arr.length+1)*i1;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2=sum2+arr[i];
        }
        return sum1-sum2;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,5};
        System.out.println(MissingNumber.findNumOptimal(arr));
//
//        for(int i=1;i<arr.length;i++){
//            if(arr[i-1]!=i){
//                System.out.println(i);
//            }
//        }
    }
}
