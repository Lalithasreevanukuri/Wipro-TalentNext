import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("MAIN MENU");
            System.out.println("1. Interest Calculator - SB");
            System.out.println("2. Interest Calculator - FD");
            System.out.println("3. Interest Calculator - RD");
            System.out.println("4. Exit");

            System.out.print("Enter your option (1..4): ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter the Average amount in your account: ");
                        double sbAmount = sc.nextDouble();

                        if (sbAmount < 0)
                            throw new InvalidAmountException("Invalid Amount. Please enter non-negative value.");

                        System.out.print("Enter Account Type (Normal/NRI): ");
                        String type = sc.next();

                        SBAccount sb = new SBAccount(sbAmount, type);

                        System.out.println("Interest gained: Rs. " + sb.calculateInterest());

                        break;

                    case 2:

                        System.out.print("Enter the FD amount: ");
                        double fdAmount = sc.nextDouble();

                        if (fdAmount < 0)
                            throw new InvalidAmountException("Invalid Amount. Please enter non-negative value.");

                        System.out.print("Enter the number of days: ");
                        int days = sc.nextInt();

                        if (days < 0)
                            throw new InvalidAmountException("Invalid Number of days. Please enter non-negative values.");

                        System.out.print("Enter your age: ");
                        int age = sc.nextInt();

                        if (age < 0)
                            throw new InvalidAmountException("Invalid Age. Please enter non-negative value.");

                        FDAccount fd = new FDAccount(fdAmount, days, age);

                        System.out.println("Interest gained is: Rs. " + fd.calculateInterest());

                        break;

                    case 3:

                        System.out.print("Enter Monthly Amount: ");
                        double monthly = sc.nextDouble();

                        if (monthly < 0)
                            throw new InvalidAmountException("Invalid Monthly Amount.");

                        System.out.print("Enter Number of Months (6/9/12/15/18/21): ");
                        int months = sc.nextInt();

                        if (months < 0)
                            throw new InvalidAmountException("Invalid Months.");

                        System.out.print("Enter your age: ");
                        int rdAge = sc.nextInt();

                        if (rdAge < 0)
                            throw new InvalidAmountException("Invalid Age.");

                        RDAccount rd = new RDAccount(monthly, months, rdAge);

                        System.out.println("Interest gained is: Rs. " + rd.calculateInterest());

                        break;

                    case 4:

                        System.out.println("Thank You.");
                        sc.close();
                        System.exit(0);

                    default:

                        System.out.println("Invalid Choice.");

                }

            } catch (InvalidAmountException e) {

                System.out.println(e.getMessage());

            }

            System.out.println();

        }

    }
}