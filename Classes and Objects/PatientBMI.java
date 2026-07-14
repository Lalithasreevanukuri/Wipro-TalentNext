class Patient {
    String patientName;
    double height;
    double weight;

    Patient(String patientName, double height, double weight) {
        this.patientName = patientName;
        this.height = height;
        this.weight = weight;
    }

    double computeBMI() {
        return weight / (height * height);
    }
}

public class PatientBMI {
    public static void main(String[] args) {
        Patient p = new Patient("Lalitha", 1.65, 55);

        System.out.println("Patient Name: " + p.patientName);
        System.out.println("Height: " + p.height + " meters");
        System.out.println("Weight: " + p.weight + " kg");
        System.out.println("BMI: " + p.computeBMI());
    }
}
