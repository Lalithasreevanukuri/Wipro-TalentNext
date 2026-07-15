class Fruit {

    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {

    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    public void eat() {
        System.out.println("Apple tastes sweet");
    }
}

class Orange extends Fruit {

    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    public void eat() {
        System.out.println("Orange tastes sour");
    }
}

public class FruitTest {

    public static void main(String[] args) {

        Fruit f1 = new Apple("Apple", "Sweet", "Medium");
        Fruit f2 = new Orange("Orange", "Sour", "Medium");

        f1.eat();
        f2.eat();
    }
}