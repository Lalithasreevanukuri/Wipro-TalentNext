import java.util.Random;


abstract class Compartment {

    public abstract String notice();

}


class FirstClass extends Compartment {

    public String notice() {
        return "First Class Compartment: Comfortable seats available";
    }
}


class Ladies extends Compartment {

    public String notice() {
        return "Ladies Compartment: Reserved for ladies";
    }
}


class General extends Compartment {

    public String notice() {
        return "General Compartment: Open for all passengers";
    }
}


class Luggage extends Compartment {

    public String notice() {
        return "Luggage Compartment: Store luggage here";
    }
}



public class TestCompartment {

    public static void main(String[] args) {


        Compartment compartment[] = new Compartment[10];

        Random r = new Random();


        for(int i=0;i<10;i++) {

            int choice = r.nextInt(4)+1;


            switch(choice) {

                case 1:
                    compartment[i] = new FirstClass();
                    break;

                case 2:
                    compartment[i] = new Ladies();
                    break;

                case 3:
                    compartment[i] = new General();
                    break;

                case 4:
                    compartment[i] = new Luggage();
                    break;

            }


            System.out.println("Compartment "
                    + (i+1) + ": "
                    + compartment[i].notice());

        }

    }
}