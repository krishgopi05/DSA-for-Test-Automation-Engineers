public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,5,7,8,23,33,44,67,77,88,99,110,210,234,345,456,566};
        int target = 543;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }

    static int BinarySearch (int [] arr,int target){

        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;

    }
}

