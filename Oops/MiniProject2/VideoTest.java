public class VideoTest {

    public static void main(String[] args) {

        Video v = new Video("Java Tutorial");

        System.out.println(v.getName());

        v.doCheckout();

        System.out.println("Checkout: " + v.getCheckout());

        v.receiveRating(5);

        System.out.println("Rating: " + v.getRating());

    }
}