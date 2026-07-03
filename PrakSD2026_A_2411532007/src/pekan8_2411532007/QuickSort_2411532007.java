package pekan8_2411532007;

public class QuickSort_2411532007 {
	static void swap_2007(int[] arr_2007, int i_2007, int j_2007) {
		int temp_2007 = arr_2007[i_2007];
		arr_2007[i_2007] = arr_2007[j_2007];
		arr_2007[j_2007] = temp_2007;
	}

	static void medianOfThree_2007(int[] arr_2007, int low_2007, int high_2007) {
		int mid_2007 = low_2007 + (high_2007 - low_2007) / 2;

		if (arr_2007[low_2007] > arr_2007[mid_2007]) {
			swap_2007(arr_2007, low_2007, mid_2007);
		}
		if (arr_2007[low_2007] > arr_2007[high_2007]) {
			swap_2007(arr_2007, low_2007, high_2007);
		}
		if (arr_2007[mid_2007] > arr_2007[high_2007]) {
			swap_2007(arr_2007, mid_2007, high_2007);
		}
		swap_2007(arr_2007, mid_2007, high_2007);
	}
	
	static int partition_2007(int[] arr_2007, int low_2007, int high_2007) {
		
		medianOfThree_2007(arr_2007, low_2007, high_2007);

		int pivot_2007	= arr_2007[high_2007];
		int i_2007		= (low_2007 - 1);

		for (int j_2007 = low_2007; j_2007 <= high_2007 - 1; j_2007++) {
			
			if (arr_2007[j_2007] < pivot_2007) {
				
				i_2007++;
				swap_2007(arr_2007, i_2007, j_2007);
			}
		}
		swap_2007(arr_2007, i_2007 + 1, high_2007); 
		return (i_2007 + 1);
	}
	
	public static void quickSort_2007(int[] arr_2007, int low_2007, int high_2007) {
		if (low_2007 < high_2007) {
			int pi_2007 = partition_2007(arr_2007, low_2007, high_2007);
			quickSort_2007(arr_2007, low_2007, pi_2007 - 1);
			quickSort_2007(arr_2007, pi_2007 + 1, high_2007); 
		}
	}

	public static void printArr_2007(int[] arr_2007) {
		for (int i_2007 = 0; i_2007 < arr_2007.length; i_2007++) {
			System.out.print(arr_2007[i_2007] + " "); 
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		int[] arr_2007 = {10, 7, 8, 9, 1, 5};
		int N_2007 = arr_2007.length;
		printArr_2007(arr_2007);
		
		quickSort_2007(arr_2007, 0, N_2007 - 1);
		
		System.out.print("Data Terurut quicksort: ");
		printArr_2007(arr_2007);
	}

}
