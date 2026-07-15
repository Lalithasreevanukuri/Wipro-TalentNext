class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {

        super(message);

    }

}


public class AgeValidation {


    public static void main(String args[]) {


        try {


            String name = args[0];

            int age = Integer.parseInt(args[1]);


            if(age < 18 || age >= 60) {

                throw new InvalidAgeException(
                    "Age should be between 18 and 60");

            }


            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Valid age");


        }

        catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Please provide name and age");

        }


        catch(NumberFormatException e) {

            System.out.println("Age should be a number");

        }


        catch(InvalidAgeException e) {

            System.out.println(e.getMessage());

        }


    }
}