import java.util.Scanner;


class NegativeMarkException extends Exception {

    NegativeMarkException(String msg) {
        super(msg);
    }

}


class MarkRangeException extends Exception {

    MarkRangeException(String msg) {
        super(msg);
    }

}


public class StudentMarks {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        try {

            System.out.println("Enter student name");
            String name = sc.nextLine();

            int total = 0;


            for(int i=1;i<=3;i++) {

                System.out.println("Enter mark " + i);

                int mark = Integer.parseInt(sc.nextLine());


                if(mark < 0)
                    throw new NegativeMarkException("Marks cannot be negative");


                if(mark > 100)
                    throw new MarkRangeException("Marks should be between 0 and 100");


                total += mark;
            }


            System.out.println("Average = " + total/3.0);

        }

        catch(NumberFormatException e) {

            System.out.println("Invalid number format");

        }

        catch(Exception e) {

            System.out.println(e.getMessage());

        }


        sc.close();

    }
}