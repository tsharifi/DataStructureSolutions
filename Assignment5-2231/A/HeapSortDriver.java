
public class HeapSortDriver {
    public static void main(String[] args){

        HeapSort<Integer> heap_array = new HeapSort<Integer>(); 
        Integer[] integer1 = {1,2,3,4,5,6,7,8,9,10}; 
        Integer[] integer2 = {20, 80, 11, 50, 10, 8, 91, 150, 26, 18};
        Integer[] integer3 = {51 , 1 , 0, 10, 1, 1, 0, 41, 100, 101};

        // printing initial data set test cases
        System.out.println("Print Initial Date Sets: "); 
        System.out.println(); 
        System.out.println("Data Set 1"); 
        System.out.println("----------"); 
        System.out.println(heap_array.toString(integer1)); 
        System.out.println("Data Set 2"); 
        System.out.println("----------"); 
        System.out.println(heap_array.toString(integer2)); 
        System.out.println("Data Set 3"); 
        System.out.println("----------"); 
        System.out.println(heap_array.toString(integer3)); 

        // heapsort all data sets 
        heap_array.heapSort(integer1);
        heap_array.heapSort(integer2);
        heap_array.heapSort(integer3);
        
        // print heapsort result after datasets perform heapsort 
        System.out.println("Print Data Sets after HeapSort: "); 
        System.out.println(); 
        System.out.println("Data Set 1"); 
        System.out.println("----------"); 
        System.out.println(heap_array.toString(integer1));

        System.out.println("Data Set 2"); 
        System.out.println("----------"); 
        System.out.println(heap_array.toString(integer2));

        System.out.println("Data Set 3"); 
        System.out.println("----------"); 
        System.out.println(heap_array.toString(integer3));
    }
}
