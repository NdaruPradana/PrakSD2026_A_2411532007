package pekan7_2411532007;

public class SelectionSort_2411532007 {
	public static void SelectionSort_2411532007(int[] arr_2007) {
		int n_2007 = arr_2007.length;
		for ( int i_2007 = 0; i_2007 < n_2007; i_2007++) {
			int minIndex_2007 = i_2007;
			for ( int j_2007 = i_2007 + 1; j_2007 < n_2007; j_2007++) {
				if ( arr_2007[j_2007] < arr_2007[minIndex_2007] ) {
					minIndex_2007 = j_2007;
				}
			}
			int temp_2007 = arr_2007[i_2007];
			arr_2007[i_2007] = arr_2007[minIndex_2007];
			arr_2007[minIndex_2007] = temp_2007;
		}
	}
	
	public static void main( String[] args ) {
		int arr_2007[] = {23, 78, 45, 8, 32, 56, 1};
		int n_2007 = arr_2007.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i = 0; i < n_2007; i++) {
			System.out.print(arr_2007[i ] + " ");
		}
		System.out.println("");
		SelectionSort_2411532007(arr_2007);
		System.out.printf("array yang sudah terurut:\n");
		for (int i = 0; i < n_2007; i++) {
			System.out.print(arr_2007[i ] + " ");
		}
		System.out.println("");
	}
}
