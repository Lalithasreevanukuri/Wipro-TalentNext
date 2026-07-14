public class ReverseFourNumbers {

    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Enter exactly 4 integer values");
            return;
        }

        int[] values = new int[4];

        for (int i = 0; i < values.length; i++) {

            try {
                values[i] = Integer.valueOf(args[i]);
            } 
            catch (Exception e) {
                System.out.println("Invalid input. Enter only integers");
                return;
            }
        }

        System.out.println("Original Array:");
        display(values);

        System.out.println("Reverse Array:");

        for (int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }

    static void display(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }
}
