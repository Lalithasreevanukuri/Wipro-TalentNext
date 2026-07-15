class Compartment {

    double height;
    double width;
    double breadth;


    Compartment(double height, double width, double breadth) {

        this.height = height;
        this.width = width;
        this.breadth = breadth;

    }


    void display() {

        System.out.println("Height : " + height);
        System.out.println("Width : " + width);
        System.out.println("Breadth : " + breadth);

    }

}



public class ShipCompartmentDemo {


    public static void main(String[] args) {


        Compartment c =
                new Compartment(20,30,40);


        System.out.println("Ship Compartment Details");

        c.display();

    }

}