import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class HashDriver{
    
    public static void main(String[] args) {

        HashTable hashTable = new HashTable(); 
        HashElement hashElement8 = new HashElement("book8", "8888888888"); 
        HashElement hashElement2 = new HashElement("book2", "2222222222");
        HashElement hashElement3 = new HashElement("book3", "3333333333");
        HashElement hashElement10 = new HashElement("book10", "101011111");
        HashElement hashElement7 = new HashElement("book7", "7777777777");
        HashElement hashElement9 = new HashElement("book9", "9999999999");
        HashElement hashElement5 = new HashElement("book5", "5555555555");
        HashElement hashElement1 = new HashElement("book1", "1111111111");
        HashElement hashElement6 = new HashElement("book6", "6666666666");
        HashElement hashElement4 = new HashElement("book4", "4444444444"); 

        System.out.println("Hash Table should be empty meaning size is 0 | Hash table size = " + hashTable.size());
        System.out.println("Testing Hash Tabble without collision"); 
        hashTable.addHashElement(hashElement5); 
        hashTable.addHashElement(hashElement3); 
        hashTable.addHashElement(hashElement2); 
        hashTable.addHashElement(hashElement10); 
        hashTable.addHashElement(hashElement6); 
        hashTable.addHashElement(hashElement9); 
        System.out.println(hashTable.toString()); 

        System.out.println("Adding element with hash value 1111111111 to cause collision"); 
        System.out.println("The new element should sit on index 4"); 
        hashTable.addHashElement(hashElement1); 
        System.out.println(hashTable.toString()); 

        System.out.println("Creating a second hash table with the same value but chaning order of hash input"); 
        HashTable hashTable2 = new HashTable(); 
        hashTable2.addHashElement(hashElement5); 
        hashTable2.addHashElement(hashElement3); 
        hashTable2.addHashElement(hashElement2); 
        hashTable2.addHashElement(hashElement1); 
        hashTable2.addHashElement(hashElement6); 
        hashTable2.addHashElement(hashElement9); 
        hashTable2.addHashElement(hashElement10); 
        System.out.println(hashTable2.toString()); 

        hashTable.addHashElement(hashElement8);
        hashTable.addHashElement(hashElement7);
        hashTable.addHashElement(hashElement4);
        System.out.println("Adding three new hash element to trigger resize");
        System.out.println("The size of hashtable should be 10 | hash table size = " + hashTable.size());
        System.out.println(hashTable.toString());

        System.out.println("Removing a hash elemtent with ISBN 9461643843 that does not exist | It should not impact hash table"); 
        System.out.println("Removing the hash table with ISBN 6666666666"); 
        hashTable.remove("9461643843"); 
        HashElement temp =  hashTable.remove("6666666666"); 
        System.out.println("Delete book title should be book6 | deleted book title = " + temp.getBook());
        System.out.println("After removing an element size should be 9 | size = " + hashTable.size()); 
        System.out.println(hashTable.toString()); 
 
        System.out.println("Search for non-existent Book title with ISBN 6666666666"); 
        String str = hashTable.find("6666666666"); 
        System.out.println("Title book should not exist | Title book found = " + str); 
        System.out.println(); 
        System.out.println("Find for book title with ISBN 4444444444"); 
        str = hashTable.find("4444444444"); 
        System.out.println("The result for ISBN 4444444444 should be book4 | book title = " + str); 
    }

}