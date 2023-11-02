public class EvenDigits {

    // Find the even numbers in the given array .

    public static void main(String[] args) {
        int[] nums = {12,345, 2,6,7896};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(nums[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean even(int num) {
        return num % 2 == 0;
    }
}

