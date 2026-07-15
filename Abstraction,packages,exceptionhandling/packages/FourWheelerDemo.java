abstract class Vehicle {


    abstract String getModelName();

    abstract String getRegistrationNumber();

    abstract String getOwnerName();

}



class Logan extends Vehicle {


    public String getModelName(){

        return "Logan Car";

    }


    public String getRegistrationNumber(){

        return "TS1111";

    }


    public String getOwnerName(){

        return "Kiran";

    }


    public int speed(){

        return 120;

    }


    public int gps(){

        return 1;

    }

}



class Ford extends Vehicle {


    public String getModelName(){

        return "Ford Car";

    }


    public String getRegistrationNumber(){

        return "TS2222";

    }


    public String getOwnerName(){

        return "John";

    }


    public int speed(){

        return 140;

    }


    public int tempControl(){

        return 1;

    }

}



public class FourWheelerDemo {


    public static void main(String[] args) {


        Logan l = new Logan();

        System.out.println(l.getModelName());
        System.out.println("Speed : " + l.speed());
        System.out.println("GPS : " + l.gps());



        Ford f = new Ford();

        System.out.println(f.getModelName());
        System.out.println("Speed : " + f.speed());
        System.out.println("Temperature Control : "
                + f.tempControl());

    }

}