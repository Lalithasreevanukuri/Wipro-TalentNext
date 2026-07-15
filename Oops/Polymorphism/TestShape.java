class Shape {

    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void erase() {
        System.out.println("Erasing Shape");
    }
}


class Circle extends Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void erase() {
        System.out.println("Erasing Circle");
    }
}


public class TestShape {

    public static void main(String[] args) {

        Shape s = new Shape();

        s.draw();
        s.erase();


        Shape c = new Circle();   // Runtime polymorphism

        c.draw();
        c.erase();

    }
}