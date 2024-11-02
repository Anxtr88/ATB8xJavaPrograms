package oct.ex_14102024.Abstraction;

//Book class which has an abstract method getDetails(),name, author, price.
//PrintMyBook class that inherits from the Book class.
//
//abstract
//
//Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");


public class Task {
    public static void main(String[] args) {
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 100);
        myBook.getDetails();

    }
}
abstract class Book{
    String name;
    String author;
    int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    abstract void getDetails();
}

class PrintMyBook extends Book{

    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name+", "+author+", "+price);
//        System.out.println(author);
//        System.out.println(price);

    }
}


