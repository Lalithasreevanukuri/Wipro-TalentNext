public class LargestNumberInArray {

    public static void main(String[] args) {

        if (args.length != 9) {
            System.out.println("Enter exactly 9 integer values");
            return;
        }

        int[] data = new int[9];

        for (int i = 0; i < data.length; i++) {

            try {
                data[i] = Integer.valueOf(args[i]);
            }
            catch (NumberFormatException e) {
                System.out.println("Only integer values are allowed");
                return;
            }
        }

        System.out.println("Entered Array:");

        for (int i = 0; i < data.length; i++) {

            System.out.print(data[i] + " ");

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }

        int largest = findLargest(data);

        System.out.println("Largest number in the array is: " + largest);
    }

    static int findLargest(int[] numbers) {

        int largestValue = numbers[0];

        for (int value : numbers) {

            if (value > largestValue) {
                largestValue = value;
            }
        }

        return largestValue;
    }
}
