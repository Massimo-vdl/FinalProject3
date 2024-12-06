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

public Library(ArrayList<Book> books){
    this.books = books;
    }
}
