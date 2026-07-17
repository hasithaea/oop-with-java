class Book {
    String title;
    String author;
    int price;

    Book(String title, String author, int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Title: " + author);
        System.out.println("Price: " + price);
    }
}

public class Main_book{
    public static void main (String[] args){

        Book b1 = new Book("Clean Code", "Robert Matrin", 4500);
        Book b2 = new Book("Effective Java", "Joshua Bloach", 6500);

        b1.display();
        System.out.println();
        b2.display();
    }
}