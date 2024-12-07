package final_project3;

import java.util.ArrayList;

/**
 *
 * @author massi
 */
public class Library {
private ArrayList<Book> books;

//Default Constructor
public Library(){ 
books = new ArrayList<>();
books.add(new Book("Book 1","Author 1",20.99,"Publisher 1","978-1-111-11111-1"));
books.add(new Book("Book 2","Author 2",21.99,"Publisher 2","978-1-111-11111-2"));
books.add(new Book("Book 3","Author 3",22.99,"Publisher 3","978-1-111-11111-3"));
books.add(new Book("Book 4","Author 4",23.99,"Publisher 4","978-1-111-11111-4"));
books.add(new Book("Book 5","Author 5",24.99,"Publisher 5","978-1-111-11111-5"));
    }
//Constructor with ArrayList
public Library(ArrayList<Book> books){
    this.books = books;
    }
//Copy Constructor
public Library(Library copy){
    this.books = new ArrayList<>(copy.books);
    }
//Search book method that detects keywords
public ArrayList<Book> searchBook(String keyword){
    ArrayList<Book> result = new ArrayList<>();
    for(Book book : books){
        if(book.getTitle().contains(keyword)|| book.getAuthor().contains(keyword)){
            result.add(book);
            }
        }
    return result;
    }
//Equals method
public boolean equals(Library copy){
    return this.books.equals(copy.books);
    }

//toString method
public String toDtring(){
    StringBuilder stringBuilder = new StringBuilder();
    for(Book book : books){
        stringBuilder.append(book.toString()).append("\n\n");
        }
    return stringBuilder.toString();
    }
//Getter and Setter
public ArrayList<Book> getBooks(){
return books;
    }
public void setBooks(ArrayList<Book> books){
    this.books = books;
    }   
}
