import java.util.Scanner;

public class ArrayIndexException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter the number of elements in the array");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter the elements in the array");

            for(int i=0;i<size;i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter the index of the array element you want to access");
            int index = sc.nextInt();

            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");

        }
        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getClass().getName());

        }

        sc.close();
    }
}