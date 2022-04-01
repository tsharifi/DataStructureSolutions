// Moein Sharifi Moghaddam
// T00665076



import java.util.concurrent.CountDownLatch;
import java.lang.System;
import java.util.Arrays;

/**
 * Sorting demonstrates sorting and searching on an array 
 * of objects.
 *
 * @author Java Foundations
 * @version 4.0 
 */
public class Sorting 
{
	/**
	 * Sorts the specified array of integers using the selection
	 * sort algorithm.
	 *
	 * @param data the array to be sorted
	 */

	
		int count_Comparison = 0; 
		int count_Swap = 0; 
		boolean doesSwap = false; 
		
	
	
	public static <T extends Comparable<T>> 
	void selectionSort(T[] data)
	{
		int min;
		T temp;

		for (int index = 0; index < data.length - 1; index++)
		{
			min = index;
			for (int scan = index + 1; scan < data.length; scan++)
				if (data[scan].compareTo(data[min]) < 0)
					min = scan;

			swap(data, min, index);
		}
	}

	/**
	 * Swaps to elements in an array. Used by various sorting algorithms.
	 * 
	 * @param data   the array in which the elements are swapped
	 * @param index1 the index of the first element to be swapped
	 * @param index2 the index of the second element to be swapped
	 */
	private static <T extends Comparable<T>> 
	void swap(T[] data, int index1, int index2)
	{
		T temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}

	/**
	 * Sorts the specified array of objects using an insertion
	 * sort algorithm.                                
	 *
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> 
	void insertionSort(T[] data)
	{
		for (int index = 1; index < data.length; index++)
		{
			T key = data[index];
			int position = index;

			// shift larger values to the right 
			while (position > 0 && data[position-1].compareTo(key) > 0)
			{
				data[position] = data[position - 1];
				position--;
			}

			data[position] = key;
		}
	}

	/**
	 * Sorts the specified array of objects using a bubble sort
	 * algorithm.
	 *
	 * @param data the array to be sorted
	 */
	public <T extends Comparable<T>> 
	void bubbleSort(T[] data)
	{
		int position, scan; 
		count_Comparison = 0;
		count_Swap = 0;

		// Implements bubble srot to the list
		for (position =  data.length - 1; position >= 0; position--)
		{
			for (scan = 0; scan <= position - 1; scan++)
			{	
				
				count_Comparison++; // records the number of comparisons made 
				if (data[scan].compareTo(data[scan + 1]) > 0)
					swap(data, scan, scan + 1);
					count_Swap++; // records the number of swaps made 
			}
		}

	}
	/**
	 * Sorts the specified array of objects using a bubble sort
	 * algorithm.
	 *
	 * @param data the array to be sorted
	 */
	public <T extends Comparable<T>> 
	void bubbleSort(T[] data, print output)
	{
		int position, scan; 
		count_Comparison = 0;
		count_Swap = 0;
		
		// Implements bubble srot to the list
		for (position =  data.length - 1; position >= 0; position--)
		{
			for (scan = 0; scan <= position - 1; scan++)
			{	
				
				count_Comparison++; // records the number of comparisons made 
				if (data[scan].compareTo(data[scan + 1]) > 0)
					swap(data, scan, scan + 1);
					count_Swap++; // records the number of swaps made 
			}
			output.print_list(data);
		}

	}

	/**
	 * Sorts the specified array of objects using the quick sort algorithm.
	 * 
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>> 
	void quickSort(T[] data)
	{
		quickSort(data, 0, data.length - 1);
	}

	/**
	 * Recursively sorts a range of objects in the specified array using the
	 * quick sort algorithm. 
	 * 
	 * @param data the array to be sorted
	 * @param min  the minimum index in the range to be sorted
	 * @param max  the maximum index in the range to be sorted
	 */
	private static <T extends Comparable<T>> 
	void quickSort(T[] data, int min, int max)
	{
		if (min < max)
		{
			// create partitions
			int indexofpartition = partition(data, min, max);

			// sort the left partition (lower values)
			quickSort(data, min, indexofpartition - 1);

			// sort the right partition (higher values)
			quickSort(data, indexofpartition + 1, max);
		}
	}

	/**
	 * Used by the quick sort algorithm to find the partition.
	 * 
	 * @param data the array to be sorted
	 * @param min  the minimum index in the range to be sorted
	 * @param max  the maximum index in the range to be sorted
	 */
	private static <T extends Comparable<T>> 
	int partition(T[] data, int min, int max)
	{
		T partitionelement;
		int left, right;
		int middle = (min + max) / 2;

		// use the middle data value as the partition element
		partitionelement = data[middle];
		
		// move it out of the way for now
		swap(data, middle, min);

		left = min;
		right = max;

		while (left < right)
		{
			// search for an element that is > the partition element
			while (left < right && data[left].compareTo(partitionelement) <= 0)
				left++;

			// search for an element that is < the partition element
			while (data[right].compareTo(partitionelement) > 0)
				right--;

			// swap the elements
			if (left < right)
				swap(data, left, right);
		}

		// move the partition element into place
		swap(data, min, right);

		return right;
	}
	
	/**
	 * Sorts the specified array of objects using the merge sort
	 * algorithm.
	 *
	 * @param data the array to be sorted
	 */
	public static <T extends Comparable<T>>
	void mergeSort(T[] data)
	{
		mergeSort(data, 0, data.length - 1);
	}

	/**
	 * Recursively sorts a range of objects in the specified array using the
	 * merge sort algorithm.
	 *
	 * @param data the array to be sorted
	 * @param min  the index of the first element 
	 * @param max  the index of the last element
	 */
	private static <T extends Comparable<T>>
	void mergeSort(T[] data, int min, int max)
	{
		if (min < max)
		{
			int mid = (min + max) / 2;
			mergeSort(data, min, mid);
			mergeSort(data, mid + 1, max);
			merge(data, min, mid, max);
		}
	}

	/**
	 * Merges two sorted subarrays of the specified array.
	 *
	 * @param data the array to be sorted
	 * @param first the beginning index of the first subarray 
	 * @param mid the ending index fo the first subarray
	 * @param last the ending index of the second subarray
	 */
	@SuppressWarnings("unchecked")
	private static <T extends Comparable<T>>
	void merge(T[] data, int first, int mid, int last)
	{
		T[] temp = (T[])(new Comparable[data.length]);

		int first1 = first, last1 = mid;  // endpoints of first subarray
		int first2 = mid + 1, last2 = last;  // endpoints of second subarray
		int index = first1;  // next index open in temp array

		//  Copy smaller item from each subarray into temp until one
		//  of the subarrays is exhausted
		while (first1 <= last1 && first2 <= last2)
		{
			if (data[first1].compareTo(data[first2]) < 0)
			{
				temp[index] = data[first1];
				first1++;
			}
			else
			{
				temp[index] = data[first2];
				first2++;
			}
			index++;
		}

		//  Copy remaining elements from first subarray, if any
		while (first1 <= last1)
		{
			temp[index] = data[first1];
			first1++;
			index++;
		}

		//  Copy remaining elements from second subarray, if any
		while (first2 <= last2)
		{
			temp[index] = data[first2];
			first2++;
			index++;
		}

		//  Copy merged data into original array
		for (index = first; index <= last; index++)
			data[index] = temp[index];
	}

	
	public <T extends Comparable<T>>
	void shellSort (T[] data, int size)
	{
		int gap = size / 2; 
		count_Comparison = 0; 
		count_Swap = 0; 

		while (gap >= 1){
		
			boolean swapflag = true; 
			while (swapflag == true)
			{
				swapflag = false;
				for (int initializer = 0; initializer < size - gap; initializer++) {
					count_Comparison++; 
					if (data[initializer].compareTo(data[initializer + gap]) > 0) {
						swap (data, initializer, initializer + gap);
						swapflag = true; 
						count_Swap++; 
						doesSwap = true; 
					}

					doesSwap = false; 
				}
			}
			gap = gap / 2;
		} 
	}

	
	public <T extends Comparable<T>>
	void shellSort (T[] data, int size, print output)
	{
		int gap = size / 2; 
		count_Comparison = 0; 
		count_Swap = 0; 
		output.print_list(data);
		while (gap >= 1){
		
			boolean swapflag = true; 
			while (swapflag == true)
			{
				swapflag = false;
				for (int initializer = 0; initializer < size - gap; initializer++) {
					count_Comparison++; 
					if (data[initializer].compareTo(data[initializer + gap]) > 0) {
						swap (data, initializer, initializer + gap);
						swapflag = true; 
						count_Swap++; 
						output.print_list(data); 
					}
				}
			}
			gap = gap / 2;
		} 

	}


	/**
	 * Sorts the specified array of objects using a bubble sort
	 * algorithm.
	 *
	 * @param data the array to be sorted
	 */
	public <T extends Comparable<T>> 
	void bubbleSort2(T[] data,print output)
	{
		int position, scan;
		boolean exit = false; 
		count_Comparison = 0; 
		count_Swap = 0; 
		for (position =  data.length - 1; position >= 0 && exit == false; position--)
		{
			boolean swapflag = true; 

			for (scan = 0; scan <= position - 1; scan++)
			{
				count_Comparison++; 
				if (data[scan].compareTo(data[scan + 1]) > 0)
				{
					swap(data, scan, scan + 1);
					swapflag = false; 
					count_Swap++; 
					
				}
				
			}
			if (swapflag == true)
			{
				exit = true; 
				
			}
			print.print_list(data); 
		}

	}

	/**
	 * Sorts the specified array of objects using a bubble sort
	 * algorithm.
	 *
	 * @param data the array to be sorted
	 */
	public <T extends Comparable<T>> 
	void bubbleSort2(T[] data)
	{
		int position, scan;
		boolean exit = false; 
		count_Comparison = 0; 
		count_Swap = 0; 

		for (position =  data.length - 1; position >= 0 && exit == false; position--)
		{
			boolean swapflag = true; 
			for (scan = 0; scan <= position - 1; scan++)
			{
				count_Comparison++; 
				if (data[scan].compareTo(data[scan + 1]) > 0)
				{
					swap(data, scan, scan + 1);
					swapflag = false; 
					count_Swap++; 
					
				}
				
			}
			if (swapflag == true)
			{
				exit = true; 
				
			}
		}

	}


	// return the most updated swap count called on a sort function
	public int get_swapCount()
	{
		return count_Swap; 
	}

	// return the most updated comparison count called on a sort function
	public int get_omparisonCount()
	{
		return count_Comparison; 
	}		
}
