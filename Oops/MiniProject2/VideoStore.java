public class VideoStore {

    private Video[] store;
    private int count;

    public VideoStore() {
        store = new Video[10];
        count = 0;
    }

    public void addVideo(String name) {

        if (count == store.length) {
            System.out.println("Inventory is full. Cannot add more videos.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Video already exists.");
                return;
            }
        }

        store[count] = new Video(name);
        count++;

        System.out.println("Video \"" + name + "\" added successfully.");
    }


    public void doCheckout(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                if (store[i].getCheckout()) {
                    System.out.println("Video \"" + name + "\" is already checked out.");
                } else {
                    store[i].doCheckout();
                    System.out.println("Video \"" + name + "\" checked out successfully.");
                }
                return;
            }
        }

        System.out.println("Video not found.");
    }


    public void doReturn(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                if (!store[i].getCheckout()) {
                    System.out.println("Video \"" + name + "\" is already returned.");
                } else {
                    store[i].doReturn();
                    System.out.println("Video \"" + name + "\" returned successfully.");
                }
                return;
            }
        }

        System.out.println("Video not found.");
    }


    public void receiveRating(String name, int rating) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {

                store[i].receiveRating(rating);

                System.out.println("Rating \"" + rating +
                        "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }

        System.out.println("Video not found.");
    }


    public void listInventory() {

        System.out.println("-----------------------------------------------");
        System.out.println("Video Name\t\tCheckout Status\t\tRating");
        System.out.println("-----------------------------------------------");

        if (count == 0) {
            System.out.println("Inventory is empty.");
        }

        for (int i = 0; i < count; i++) {

            System.out.println(store[i].getName()
                    + "\t\t"
                    + store[i].getCheckout()
                    + "\t\t"
                    + store[i].getRating());
        }

        System.out.println("-----------------------------------------------");
    }
}