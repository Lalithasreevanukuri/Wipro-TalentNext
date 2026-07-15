class Employee implements Cloneable {
    String name;
    int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void display(String label) {
        System.out.println(label + " -> ID: " + id + ", Name: " + name);
    }
}
public class Clonetest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("Mickey", 101);
            System.out.println("--- Before Modification ---");
            original.display("Original");
            Employee cloned = (Employee) original.clone();
            cloned.display("Cloned");
            original.name = "Donald";
            original.id = 202;
            original.display("Original (Modified)");
            cloned.display("Cloned (Unchanged) ");
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}