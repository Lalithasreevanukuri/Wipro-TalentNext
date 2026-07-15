import java.util.Arrays;

public class RemoveTenArray {
    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2};

        int[] updatedArray = removeTen(arr);

        System.out.println("Array after removing 10: " + Arrays.toString(updatedArray));
    }

    static int[] removeTen(int[] arr) {

        int[] newArray = new int[arr.length];
        int position = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 10) {
                newArray[position] = arr[i];
                position++;
            }
        }

        return newArray;
    }
}
