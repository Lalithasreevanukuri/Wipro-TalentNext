class Author {
    String name;
    String email;
    char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jk@email.com", 'f');
        Book book1 = new Book("Harry Potter", author1, 29.99, 100);

        System.out.println("Book Name: " + book1.getName());
        System.out.println("Price: " + book1.getPrice());
        System.out.println("Quantity in Stock: " + book1.getQtyInStock());
        System.out.println("Author Name: " + book1.getAuthor().name);
        System.out.println("Author Email: " + book1.getAuthor().email);
        System.out.println("Author Gender: " + book1.getAuthor().gender);
    }
}


