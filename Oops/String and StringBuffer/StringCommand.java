public class StringCommand {
    public static void main(String args[]) {

        if (args.length != 1) {
            System.out.println("Please enter one argument.");
        } else {
            System.out.println("Welcome " + args[0]);
        }

    }
}
