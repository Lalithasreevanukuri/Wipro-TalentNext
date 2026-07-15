abstract class GeneralBank {

    abstract double getSavingsInterestRate();

    abstract double getFixedDepositInterestRate();
}


class ICICIBank extends GeneralBank {

    public double getSavingsInterestRate() {
        return 4.0;
    }

    public double getFixedDepositInterestRate() {
        return 8.5;
    }
}


class KotMBank extends GeneralBank {

    public double getSavingsInterestRate() {
        return 6.0;
    }

    public double getFixedDepositInterestRate() {
        return 9.0;
    }
}


public class BankTest {

    public static void main(String[] args) {

        ICICIBank i = new ICICIBank();

        System.out.println("ICICI Savings Interest: "
                + i.getSavingsInterestRate() + "%");

        System.out.println("ICICI FD Interest: "
                + i.getFixedDepositInterestRate() + "%");


        KotMBank k = new KotMBank();

        System.out.println("KotM Savings Interest: "
                + k.getSavingsInterestRate() + "%");

        System.out.println("KotM FD Interest: "
                + k.getFixedDepositInterestRate() + "%");


        GeneralBank g = new KotMBank();

        System.out.println("\nGeneralBank reference pointing to KotM");

        System.out.println("Savings Interest: "
                + g.getSavingsInterestRate());

        System.out.println("FD Interest: "
                + g.getFixedDepositInterestRate());


        g = new ICICIBank();

        System.out.println("\nGeneralBank reference pointing to ICICI");

        System.out.println("Savings Interest: "
                + g.getSavingsInterestRate());

        System.out.println("FD Interest: "
                + g.getFixedDepositInterestRate());

    }
}