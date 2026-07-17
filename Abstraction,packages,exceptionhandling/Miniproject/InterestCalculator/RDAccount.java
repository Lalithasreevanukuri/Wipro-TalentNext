class RDAccount extends Account {

    int noOfMonths;
    double monthlyAmount;
    int age;

    public RDAccount(double monthlyAmount, int noOfMonths, int age) {
        this.monthlyAmount = monthlyAmount;
        this.noOfMonths = noOfMonths;
        this.age = age;
    }

    @Override
    double calculateInterest() {

        switch (noOfMonths) {

            case 6:
                interestRate = (age >= 60) ? 8.0 : 7.5;
                break;

            case 9:
                interestRate = (age >= 60) ? 8.25 : 7.75;
                break;

            case 12:
                interestRate = (age >= 60) ? 8.5 : 8.0;
                break;

            case 15:
                interestRate = (age >= 60) ? 8.75 : 8.25;
                break;

            case 18:
                interestRate = (age >= 60) ? 9.0 : 8.5;
                break;

            case 21:
                interestRate = (age >= 60) ? 9.25 : 8.75;
                break;

            default:
                interestRate = 0;
        }

        return monthlyAmount * noOfMonths * interestRate / 100;
    }
}