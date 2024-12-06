package final_project3;

/**
 *
 * @author massi
 */
public class Book {
String title;
String author;
double price;
String publisher;
String Isbn;
//Default constructor
public Book(){
    this.title = "";
    this.author = "";
    this.price = 0;
    this.publisher = "";
    this.Isbn = "";
    }
//Constructor with only title data type
public Book(String title){
    this.title = title;
    this.author = "";
    this.price = 0;
    this.publisher = "";
    this.Isbn = "";
    }
//Constructor with all data types
public Book(String title, String author, double price, String publisher, String Isbn){
    this.title = title;
    this.author = author;
    this.price = price;
    this.publisher = publisher;
    this.Isbn = Isbn;
    }
//Copy constructor
public Book(Book copy){
    this.title = copy.title;
    this.author = copy.author;
    this.price = copy.price;
    this.publisher = copy.publisher;
    this.Isbn = copy.Isbn;
    }
}
