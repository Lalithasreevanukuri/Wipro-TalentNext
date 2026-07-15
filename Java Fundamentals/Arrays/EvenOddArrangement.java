import java.util.Arrays;

public class EvenOddArrangement {
    public static void main(String[] args) {
        int[] numbers = {1, 0, 1, 0, 0, 1, 1};
        int[] result = evenOdd(numbers);
        System.out.println(Arrays.toString(result));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        int start = evenIndex;
        int end = nums.length - 1;
        while (start < end) {
            int temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }

        return result;
    }
}
