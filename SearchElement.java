public class SearchElement {
    public static void main(String[] args) {

        int[] arr = {1, 4, 34, 56, 7};

        if (args.length != 1) {
            System.out.println("Please enter a number.");
            return;
        }

        int search = Integer.parseInt(args[0]);

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
