abstract class Vehicle {


    abstract String getModelName();

    abstract String getRegistrationNumber();

    abstract String getOwnerName();

}



class Hero extends Vehicle {


    public String getModelName(){

        return "Hero Bike";

    }


    public String getRegistrationNumber(){

        return "AP1234";

    }


    public String getOwnerName(){

        return "Lalitha";

    }


    public int getSpeed(){

        return 80;

    }


    public void radio(){

        System.out.println("Radio working");

    }

}



class Honda extends Vehicle {


    public String getModelName(){

        return "Honda Bike";

    }


    public String getRegistrationNumber(){

        return "AP5678";

    }


    public String getOwnerName(){

        return "Ravi";

    }


    public int getSpeed(){

        return 100;

    }


    public void cdplayer(){

        System.out.println("CD Player working");

    }

}




public class AutomobileDemo {


    public static void main(String[] args) {


        Hero h = new Hero();

        System.out.println(h.getModelName());
        System.out.println(h.getSpeed());
        h.radio();



        Honda ho = new Honda();

        System.out.println(ho.getModelName());
        System.out.println(ho.getSpeed());
        ho.cdplayer();


    }

}
