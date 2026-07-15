import java.util.Arrays;

public class MiddleElementsArray {

    public static void main(String[] args) {

        int[] firstArray = {1, 2, 3};
        int[] secondArray = {4, 5, 6};

        int[] output = getMiddleValues(firstArray, secondArray);

        System.out.println("Middle elements: " + Arrays.toString(output));
    }

    public static int[] getMiddleValues(int[] first, int[] second) {

        int[] middle = new int[2];

        middle[0] = first[first.length / 2];
        middle[1] = second[second.length / 2];

        return middle;
    }
}
