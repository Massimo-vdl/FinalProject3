package final_project3;

import java.util.Locale;

/**
 *
 * @author massi
 */
public class Book {
private String title;
private String author;
private double price;
private String publisher;
private String Isbn;
//Default constructor
public Book(){
    this.title = "to be confirmed";
    this.author = "to be confirmed";
    this.price = 0;
    this.publisher = "to be confirmed";
    this.Isbn = "to be confirmed";
    }
//Constructor with only title data type
public Book(String title){
    this.title = title;
    this.author = "to be confirmed";
    this.price = 0;
    this.publisher = "to be confirmed";
    this.Isbn = "to be confirmed";
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
public int checkIsbnStatus(){
    if(Isbn.length() == 10){ //Isbn 10
        return 0;
        }
    if(Isbn.length() == 17){//Isbn 13
        return 1;
        } 
    return -1; //invalid Isbn
    }

public void toTitleCase(){
    title = toTitleCase(title);
    author = toTitleCase(author);
    }

private String toTitleCase(String text){
String[] words = text.split(" "); //Every time a space is entered it is a new word
    StringBuilder titleCase = new StringBuilder();
        for(String word : words){
        if(word.isEmpty()){//Converting the first letter of every word into a Capitol letter
            titleCase.append(word.substring(0, 1).toUpperCase(Locale.ROOT))
                    .append(word.substring(1).toLowerCase(Locale.ROOT)).append(" ");
            }
        }
    return titleCase.toString().trim();
    }
public String toString(){
    return String.format("Title: %s\nAuthor: %s\nPrice: %d\nPublisher: %s\nIsbn: %s\n"
        , title, author, price, publisher, Isbn);
    }
//Equals method
public boolean equals(Book copy){
    return this.title.equals(copy.title) && this.author.equals(copy.author) && this.Isbn.equals(copy.Isbn);
    }
//Clone method
public Book clone(){
    return new Book(this);
    }
//Getters and Setters
public String getTitle(){ return title;
    }
public void setTitle(String title){ this.title = title;
    }

public String getAuthor(){ return author;
    }
public void setAuthor(String author){ this.author = author;
    }

public double getPrice(){ return price;
    }     
public void setPrice(double price){ this.price = price;
    }  
        
public String getPublisher(){ return publisher;
    }
public void setPublisher(String publisher){ this.publisher = publisher;
    }

public String getIsbn(){ return Isbn;
    }
public void setIsbn(String Isbn){ this.Isbn = Isbn;
    }        
}




