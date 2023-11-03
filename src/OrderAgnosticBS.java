public class OrderAgnosticBS {

    public static void main(String[] args) {
        int [] arr = {98,87,76,65,54,43,32,21,11,9,8,6,5,3,2,1};
        int target = 3;
        int ans = OrderAgBinSearch(arr,target);
        System.out.println(ans);

    }

    static int OrderAgBinSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        // Arrays.sort(arr);
        // To check if the array is sorted in ascending or descending order.

        boolean issort = arr[start]<arr[end];


        while(start <= end) {

            int mid = start + (end-start)/2;

            if (target == arr[mid]){
                return mid;
            }
            if (issort){
                if (target < arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}

