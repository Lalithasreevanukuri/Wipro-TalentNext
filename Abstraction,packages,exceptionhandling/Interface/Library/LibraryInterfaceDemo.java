public class LibraryInterfaceDemo {


    public static void main(String[] args) {


        KidUser kid = new KidUser(10,"Kids");

        kid.registerAccount();

        kid.requestBook();



        System.out.println();



        AdultUser adult = new AdultUser(25,"Fiction");

        adult.registerAccount();

        adult.requestBook();


    }

}