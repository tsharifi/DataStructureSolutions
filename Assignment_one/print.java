import java.util.*; 

public class print
{
    public static <T extends Comparable<T>>
	void print_list(T[] data)
	{
		for (int i = 0; i < data.length ; i++)
		{
			if (i == 0) 
			{
				System.out.print("{" + data[i] + ", "); 
			}
			else if (i % 10 == 0 && i != data.length)
			{
				System.out.print("\n" + data[i] + ", ");
			} else if (i == data.length-1) 
			{
				System.out.print(data[i] + "}\n"); 
			} else 
			{
				System.out.print(data[i] + ", ");
			}
        }
	    System.out.println("\n"); 
	}

	public static void print_result(int count_Comparison, int count_Swap, long time_elapse)
	{
		
    	// Print the report inclding Total Tally of Comparisons, Swaps and time exucation
		String comparison_report = "Total Tally of Comparisons:  " + count_Comparison + "\n"; 
		String swap_report = "Total Tally of Swaps:  " + count_Swap + "\n"; 
		String exe_time_report = "Total Execution Time in Nano-second: " + time_elapse + "\n"; 
		System.out.print(comparison_report + swap_report + exe_time_report + "\n\n");	
	}

}