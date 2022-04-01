import java.util.*;

public class driver {


    public static void main (String[] args)
    {
        // Variables Used to handle overflow and underflow edge cases 
		int MAX = 2147483647;
		int MIN = -214748364;

        Sorting sort = new Sorting(); 
        print output = new print(); 

		System.out.println("\nSort Testing Only works With Integers in the range of " + MIN + " And " + MAX + "\n\n");
        System.out.println("Question One tests:"); 
        System.out.println("-------------------\n\n"); 
        
		// For the pupose of Part one of questio asking also for 20 integer list for testing: 
		// creates manually a list of already defined 20 element integer list. 
		// test and report the analysis twice. the first time with the list unsorted and second time sorted. 
		Integer[] default_data_20i = {16, 15, 2, 19, 8, 20, 11, 13, 5, 6,
			3 , 7, 1, 14, 9, 12, 17, 18, 10, 4}; 

        // manually create a list of 10 elements for testing purposes
		Integer[] default_data_10i = {5, 8, 3, 4, 9, 1, 10, 2, 6, 7};
        // question default test case list array
        Integer[] default_data_sample = {9, 6, 8, 12, 3, 1, 7}; 

        // create a coppy of each arrays with index 10 20 and the default sample on the question
        Integer[] shell_sample = Arrays.copyOf(default_data_sample, default_data_sample.length); 
        Integer[] shell_10i = Arrays.copyOf(default_data_10i, default_data_10i.length); 
        Integer[] shell_20i = Arrays.copyOf(default_data_20i, default_data_20i.length);

        
        System.out.println("Question sample default test case:\n");
        sort.shellSort(shell_sample, shell_sample.length, output);
        System.out.println("10 Integer test case:\n");
        sort.shellSort(shell_10i, shell_10i.length, output);
        System.out.println("\n"); 
        System.out.println("20 Integer test case:\n");
        sort.shellSort(shell_20i, shell_20i.length, output);
        System.out.println("\n"); 

        


        //Question Part 2 
        System.out.println("Question 2 tests"); 
        System.out.println("----------------\n\n"); 
        Integer[] bubble_10i = Arrays.copyOf(default_data_10i, default_data_10i.length); 
        System.out.println("Bubble Sort 10 Integer unsorted test case:\n"); 
        sort.bubbleSort(bubble_10i, output); 
        System.out.println("\n"); 
        System.out.println("Bubble Sort 10 Integer Sorted test case:\n"); 
        sort.bubbleSort(bubble_10i, output); 
        System.out.println("\n"); 

        // qusetion 2 10 integer test case for bubblesort2
        bubble_10i = Arrays.copyOf(default_data_10i, default_data_10i.length); 
        System.out.println("Bubble Sort2 10 Integer unsorted test case:\n"); 
        sort.bubbleSort2(bubble_10i, output); 
        System.out.println("\n"); 
        System.out.println("Bubble Sort2 10 Integer Sorted test case:\n"); 
        sort.bubbleSort2(bubble_10i, output); 
        System.out.println("\n"); 
    
        // System.out.println("Testing Shell Sort with Random 20 Integer Element List");
		// System.out.println("______________________________________________________\n");
        // System.out.println("Pring of 20 indexed Listed Unsorted\n"); 
        // print_list(default_data_20i); 
        // sort.shellSort (default_data_20i, default_data_20i.length);
        // System.out.println("20 Indexed list Sorted:\n");
        // System.out.println("_______________________"); 
        // print_list(default_data_20i); 
		// System.out.println("Testing Shell Sort with Already Sorted 20 Integer Element List");
		// System.out.println("______________________________________________________________\n"); 
		// sort.shellSort (default_data_20i, default_data_20i.length);

		// manually create a list of 100 elements for testing purposes 
		Integer[] default_data_100i = {-6, 53, 46, 50, 16, 59, 51, 15, 42, 34,
			65,    2,   81,   19,   88,   78,   37,    8,   57,   35,
			69,   20,   11,   94,   66,   13,    5,   33,   77,   47,
			84,   82,    6,   29,   60,   21,  100,   55,   64,   75,
			40,   76,   70,   91,   22,   26,   62,    3,    7,   96,
			 1,   52,   14,   74,   79,    9,   39,   24,   90,   41,
			36,   56,   63,   12,   17,   80,   18,   44,   58,   10,
			28,   98,   95,   71,   38,   48,   86,   67,   54,   85,
			73,   32,   92,   25,   72,   27,   93,   23,   31,   30,
			83,   99,   43,   49,   68,   45,   61,   87,    -30,   89}; 
        

		// creating copies of my default 100 element list for testing each sorting algorithm. 
		Integer[] data_copy_bubbleSort_100i = Arrays.copyOf(default_data_100i, default_data_100i.length);
		Integer[] data_copy_shellSort_100i= Arrays.copyOf(default_data_100i, default_data_100i.length);
		Integer[] data_copy_bubbleSort2_100i = Arrays.copyOf(default_data_100i, default_data_100i.length);

		/*
			executing each sorting algorith using default 100 element list. 
			print the result and analysis of each sorting method
			executes each sorting algorithm twice. the first time it executes the list unsorted. 
			the second time execute the mehtod with already sorted list. 
		*/

        System.out.println("Question 3 Tests"); 
        System.out.println("----------------\n\n"); 
        System.out.println("Print of randomly generated list of 100 indexed number list for bubble sort is:");
        System.out.println("_____________________________________________________________\n"); 
        output.print_list(data_copy_bubbleSort_100i); 
		System.out.println("Testing Bubble Sort with Random unsorted 100 Integer Element List");
		System.out.println("_________________________________________________________________\n"); 

        // recording start of exution time
		long start = System.nanoTime();
        sort.bubbleSort(data_copy_bubbleSort_100i);
        // calculates and records the exucation time of bubble sort algorithm 
		long finish = System.nanoTime(); 
		long time_elapse = finish - start;
		output.print_list(data_copy_bubbleSort_100i);
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse); 
		System.out.println("Testing Bubble Sort with Already Sorted 100 Integer Elements List");
		System.out.println("_________________________________________________________________\n"); 
        start = System.nanoTime();
		sort.bubbleSort(data_copy_bubbleSort_100i); 
        finish = System.nanoTime(); 
		time_elapse = finish - start;
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);

        
        System.out.println("Chosen randomly generated list of 100 indexed number list is:");
        System.out.println("_____________________________________________________________\n"); 
        output.print_list(data_copy_shellSort_100i);   
		System.out.println("Testing Shell Sort with Random 100 Integer Element List");
		System.out.println("_______________________________________________________\n"); 
        start = System.nanoTime();
		sort.shellSort(data_copy_shellSort_100i, data_copy_shellSort_100i.length); 
        finish = System.nanoTime(); 
		time_elapse = finish - start;
        output.print_list(data_copy_shellSort_100i); 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);
		System.out.println("Testing Shell Sort with Already Sorted 100 Integer Elements List");
		System.out.println("________________________________________________________________\n");
        start = System.nanoTime();
		sort.shellSort(data_copy_shellSort_100i, data_copy_shellSort_100i.length); 
        finish = System.nanoTime(); 
		time_elapse = finish - start;
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);

        System.out.println("Chosen randomly generated list of 100 indexed number list for modified bubble sort is:");
        System.out.println("_____________________________________________________________\n"); 
        output.print_list(data_copy_bubbleSort2_100i);
		System.out.println("Testing Bubble Sort2 with Random 100 Integer Element List");
		System.out.println("_________________________________________________________\n"); 
        start = System.nanoTime(); 
		sort.bubbleSort2(data_copy_bubbleSort2_100i); 
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_list(data_copy_bubbleSort2_100i); 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);
		System.out.println("Testing Bubble Sort2 with Already Sorted 100 Integer Elements List");
		System.out.println("__________________________________________________________________\n");
        start = System.nanoTime(); 
		sort.bubbleSort2(data_copy_bubbleSort2_100i); 
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);

		// manually create a list of 10 elements for testing purposes
		//Integer[] default_data_10i = {5, 8, 3, 4, 9, 1, 10, 2, 6, 7};

		// creats copies of my default 10 element list for testing each sorting algorithm. 
		Integer[] data_copy_bubbleSort_10i = Arrays.copyOf(default_data_10i, default_data_10i.length);
		Integer[] data_copy_shellSort_10i= Arrays.copyOf(default_data_10i, default_data_10i.length);
		Integer[] data_copy_bubbleSort2_10i = Arrays.copyOf(default_data_10i, default_data_10i.length);

		/*
			executing each sorting algorith using default 10 element list. 
			print the result and analysis of each sorting method
			executes each sorting algorithm twice. the first time it executes the list unsorted. 
			the second time execute the mehtod with already sorted list. 
		*/	
        
        System.out.println("Chosen randomly generated list of 10 indexed number list for bubble sort is:");
        System.out.println("_____________________________________________________________\n"); 
        output.print_list(data_copy_bubbleSort_10i);
		System.out.println("Testing Bubble Sort with Random 10 Integer Element List");
		System.out.println("_______________________________________________________\n"); 	
        start = System.nanoTime(); 
		sort.bubbleSort(data_copy_bubbleSort_10i);
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_list(data_copy_bubbleSort_10i); 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);
		System.out.println("Testing Bubble Sort with Already Sorted 10 Integer Element List");
		System.out.println("_______________________________________________________________\n");
        start = System.nanoTime(); 
		sort.bubbleSort(data_copy_bubbleSort_10i); 
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);
        

        System.out.println("Chosen randomly generated list of 10 indexed number list for shell sort is:");
        System.out.println("_____________________________________________________________\n"); 
        output.print_list(data_copy_shellSort_10i);
		System.out.println("Testing Shell Sort with Random 10 Integer Element List");
		System.out.println("_______________________________________________________\n"); 	
        start = System.nanoTime(); 
		sort.shellSort(data_copy_shellSort_10i, data_copy_shellSort_10i.length);
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_list(data_copy_shellSort_10i); 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);
		System.out.println("Testing Shell Sort with Already Sorted 10 Integer Element List");
		System.out.println("_______________________________________________________________\n");
        start = System.nanoTime(); 
		sort.shellSort(data_copy_shellSort_10i, data_copy_shellSort_10i.length); 
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);

        System.out.println("Chosen randomly generated list of 10 indexed number list for modified bubble sort2 is:");
        System.out.println("_____________________________________________________________\n"); 
        output.print_list(data_copy_bubbleSort2_10i);
		System.out.println("Testing Bubble Sort2 with Random 10 Integer Element List");
		System.out.println("_______________________________________________________\n"); 	
        start = System.nanoTime(); 
		sort.bubbleSort2(data_copy_bubbleSort2_10i);
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_list(data_copy_bubbleSort2_10i); 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);
		System.out.println("Testing Bubble Sort2 with Already Sorted 10 Integer Element List");
		System.out.println("_______________________________________________________________\n");
        start = System.nanoTime(); 
		sort.bubbleSort2(data_copy_bubbleSort2_10i); 
        finish = System.nanoTime(); 
        time_elapse = finish - start; 
        output.print_result(sort.get_omparisonCount(), sort.get_swapCount(), time_elapse);
       
    }
}