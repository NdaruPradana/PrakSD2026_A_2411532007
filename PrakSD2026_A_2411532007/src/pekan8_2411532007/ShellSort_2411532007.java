package pekan8_2411532007;

public class ShellSort_2411532007 {
	public static void ShellSort_2007(int[] A_2007) {
		int n_2007 = A_2007.length;
		int gap_2007 = n_2007/2;
		while (gap_2007 > 0) {
			for (int i_2007 = gap_2007; i_2007 < n_2007; i_2007++) {
				int temp_2007 = A_2007[i_2007];
				int j_2007 = i_2007;
				while (j_2007 >= gap_2007 && A_2007[j_2007 - gap_2007] > temp_2007) {
					A_2007[j_2007] = A_2007[j_2007 - gap_2007];
					j_2007 = j_2007 - gap_2007;
				}
				A_2007[j_2007] = temp_2007;
			}
			gap_2007 = gap_2007 / 2;
		}
	}
	
	public static void main (String[] args) {
		int[] data_2007 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum : ");
		printArray_2007(data_2007);
		
		ShellSort_2007(data_2007);

		System.out.print("Sesudah (Shell Sort) : ");
		printArray_2007(data_2007);
	}
	
	public static void printArray_2007 (int[] arr_2007) {
		for ( int i_2007 : arr_2007) System.out.print(i_2007 + " ");
		System.out.println();
	}
	
}
