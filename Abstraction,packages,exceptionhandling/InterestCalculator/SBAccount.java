class SBAccount extends Account {

    String accountType;

    public SBAccount(double amount, String accountType) {
        this.amount = amount;
        this.accountType = accountType;
    }

    @Override
    double calculateInterest() {

        if (accountType.equalsIgnoreCase("Normal")) {
            interestRate = 4;
        } else if (accountType.equalsIgnoreCase("NRI")) {
            interestRate = 6;
        }

        return amount * interestRate / 100;
    }
}
