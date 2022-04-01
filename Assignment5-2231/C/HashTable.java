/**
 * T00665076
 * Moein Sharifi Moghaddam
 * 
 * Creates A Customized HashTable as specified in Assignment 5 part C
 * 
 */


import java.util.*; 

public class HashTable{

    private HashElement[] HashArray;  
    int threshold; 
    int numCount;  

    private double load_factor = 0.70; 
    private int capacity = 11; 
    
    public HashTable(){

        HashArray = new HashElement[capacity]; 
        threshold =  (int)(capacity * load_factor); 
        numCount = 0; 
    }

    // returns true if number of element hit threshold capacity
    // returns false otherwise
    private boolean isFull(){
        return (threshold == numCount); 
    }

    // expand the size of hashArray once threshold
    private void expandCapacity(){

        //HashElement[] temp1 = new HashElement[capacity]; 
        HashElement[] temp2 = Arrays.copyOf(HashArray, HashArray.length); 
        HashArray = Arrays.copyOf(HashArray, nextPrime(2*capacity)); 

        capacity = nextPrime(2*capacity); 
        threshold = (int)(capacity * load_factor); 
        numCount = 0; 
        // free hasharray up
        for(int i = 0; i < HashArray.length; i++){
            HashArray[i] = null; 
        }
    
        for(int i = 0; i < temp2.length; i++){
            if(temp2[i] != null && temp2[i].isDeleted() == false){
                int index = hashFunction(temp2[i].getISBN());
                int temp = hashFunction(temp2[i].getISBN());
        
                while(HashArray[temp] != null){
        
                    if(index == HashArray.length -1){
                        temp = -1; 
                    }
                    temp = temp + 1; 
                    index = temp;  
                }
                HashArray[index] = temp2[i]; 
                numCount++; 
            }
        }
    }

    // returns an index value of hash key
    public int hashFunction(String isbn){

        String str = isbn; 
        str = str.substring(str.length() - 3, str.length() ); 
        int integer = Integer.parseInt(str); 
        int index = Math.abs(integer) % capacity; 
        return index; 
    }

    // adds a hash element into the hash table
    public void addHashElement(HashElement element){

        if(isFull()){
            expandCapacity();
        }

        int index = hashFunction(element.getISBN());
        int temp = hashFunction(element.getISBN());

        while(HashArray[temp] != null){

            if(index == HashArray.length -1){
                temp = -1; 
            }
            temp = temp + 1; 
            index = temp;  
        }
        HashArray[index] = element; 
        numCount++; 
    }

    // returns the next available prime number bigger than @param param
    public int nextPrime (int param){
        int integer = param; 
        integer++; 
        for(int i = 2; i < integer; i++){

            if(integer % i == 0){
                integer++; 
                i = 2; 
            }
        }
        return integer; 
    }

    // returns a string of the hash table
    public String toString(){
        String s="";
        for(int i = 0; i < HashArray.length; i++){
          if(HashArray[i] == null || HashArray[i].isDeleted() == true){
            s+= ("index: " + i + ", element:  null\n");
          }else{
            s+= ("index: " + i + ", element: "+ HashArray[i].toString() +"\n");
          }
        }
        return s;
    }

    // returns size of hash table
    public int size(){
        return numCount; 
    }

    // return the book title of a given key(isbn number)
    public String find (String key){
        int index = hashFunction(key); 
        String title = ""; 
        
        try{
            for(int i = index; i < HashArray.length; i++){

                if(HashArray[i].getISBN() == key && HashArray[i].isDeleted() == false){
                    title = HashArray[i].getBook(); 
                    break; 
                } 

                if(i == HashArray.length - 1){
                    i = -1; 
                }

                if(i == index - 1 ){
                    title = "Title Book Does Not Exist"; 
                    break; 
                }
                
            }
            
        } catch (NullPointerException e){
            title = "Title Book Does Not Exist"; 
        }
        return title; 
    }

    // removes an element based on the key(isbn number)
    public HashElement remove(String key){

        HashElement element = new HashElement("DNA", "DNA"); 
        try{
            int index = hashFunction(key); 
            while(HashArray[index] != null){

                if(HashArray[index].isDeleted() == false & HashArray[index].getISBN() == key){
                    HashArray[index].setDeleteMarker(true);
                    element = HashArray[index]; 
                    numCount--; 
                }
                index++; 
                if(index == HashArray.length){
                    index = 0; 
                }
            }

            return element; 
        } catch (NullPointerException e){
            System.out.println("Intended Items to Remove Does Not Exist");
            return element;  
        }
    }

}