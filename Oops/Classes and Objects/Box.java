public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double calculateVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box myBox = new Box(10.5, 5.0, 4.2);
        double volume = myBox.calculateVolume();
        System.out.println(volume);
    }
}

