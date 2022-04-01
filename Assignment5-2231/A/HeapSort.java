//import jsjf.ArrayHeap;
import java.util.*; 

/**
 * HeapSort sorts a given array of Comparable objects using a heap.
 * 
 * T00665076
 * Moein Sharifi Moghaddam
 * 
 * Reference: https://www.geeksforgeeks.org/heap-sort/
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class HeapSort<T>
{
	/**
	 * Sorts the specified array using a Heap
	 *
	 * @param data the data to be added to the heapsort
	 */
	public <T extends Comparable<T>>
	void heapSort(T[] data) 
	{

		int n = data.length;
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(data, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            T temp = data[0];
            data[0] = data[i];
            data[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(data, i, 0);
        }
	}

 	// To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
	private <T extends Comparable<T>>
	void heapify(T[] data, int n, int i){
		int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && data[l].compareTo(data[largest]) > 0)
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && data[r].compareTo(data[largest]) > 0)
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            T swap = data[i];
            data[i] = data[largest];
            data[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(data, n, largest);
        }
	}

	public String toString(T[] data){
		String result = "";
        
        for(int scan = 0; scan < data.length; scan++)
        {
            result += data[scan] + "\n";
        }
        
        return result;  
	}
}