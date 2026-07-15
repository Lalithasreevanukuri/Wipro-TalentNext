public class OnlyOneFourArray {

    public static void main(String[] args) {

        int[] arr = {1, 4, 1, 4};

        boolean status = checkOnlyOneFour(arr);

        System.out.println("Array contains only 1 and 4: " + status);
    }

    public static boolean checkOnlyOneFour(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }
        }

        return true;
    }
}
