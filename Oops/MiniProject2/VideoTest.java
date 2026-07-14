public class VideoTest {
    public static void main(String[] args) {
        Video video = new Video("Avatar");

        System.out.println("Name: " + video.getName());

        video.doCheckout();
        System.out.println("Checked Out: " + video.getCheckout());

        video.receiveRating(4);
        System.out.println("Rating: " + video.getRating());

        video.doReturn();
        System.out.println("Checked Out: " + video.getCheckout());
    }
}