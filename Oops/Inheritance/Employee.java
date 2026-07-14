class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Smith", 75000.0, 2022, "NI123456D");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Start Year: " + emp.getStartYear());
        System.out.println("Insurance Number: " + emp.getNationalInsuranceNumber());
    }
}