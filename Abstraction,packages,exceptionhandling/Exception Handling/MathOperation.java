public class MathOperation {

    public static void main(String args[]) {

        try {

            int arr[] = new int[5];

            int sum = 0;

            for(int i=0;i<5;i++) {

                arr[i] = Integer.parseInt(args[i]);
                sum = sum + arr[i];

            }

            double average = sum / 5.0;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);

        }

        catch(NumberFormatException e) {

            System.out.println("Number format exception");

        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Please enter exactly 5 numbers");

        }

        catch(Exception e) {

            System.out.println("Exception occurred");

        }
    }
}