/**
 * Creates an element which is used to be added into a hash table
 * The element is a book
 * It contains information book title, ISBN Number
 * 
 */
import java.util.*;

public class HashElement {

    String book; 
    String isbn; 
    Boolean delete; 
    
    public HashElement (String book, String isbn){
        this.book = book; 
        this.isbn = isbn; 
        delete = false; 
    }

    public String getBook(){
        return book; 
    }

    public void setBook(String book){
        this.book = book; 
    }

    public String getISBN(){
        return isbn; 
    }

    public void setISBN(String isbn){
        this.isbn = isbn; 
    }

    public String toString(){
        String str = "Book name: " + book + " ISBN Number: " + isbn; 
        return str; 
    }

    public boolean isDeleted(){
        return delete; 
    }

    public void setDeleteMarker(boolean param){
        delete = param; 
    }
}