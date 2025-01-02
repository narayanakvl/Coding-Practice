package striversheet.binarysearch;

public class FloorAndCeil {
    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length- 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= x) {
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
    static int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] >= x) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={3, 4, 4, 7, 8, 10};
        int target=5;
        System.out.println("Floor is: "+FloorAndCeil.findFloor(arr,target));
        System.out.println("Ciel is: "+FloorAndCeil.findCeil(arr,target));
    }
}
