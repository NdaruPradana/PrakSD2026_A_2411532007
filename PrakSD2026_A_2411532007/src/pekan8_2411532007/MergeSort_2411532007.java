package pekan8_2411532007;

public class MergeSort_2411532007 {
	void Merge_2007(int arr_2007[], int l_2007, int m_2007, int r_2007) {
		int n1_2007 = m_2007 - l_2007 + 1;
		int n2_2007 = r_2007 - m_2007;
		
		int L_2007[] = new int[n1_2007];
		int R_2007[] = new int[n2_2007];
		
		for (int i_2007 = 0; i_2007 < n1_2007; ++i_2007) {
			L_2007[i_2007] = arr_2007[l_2007 + i_2007];
		}
		
		for (int j_2007 = 0; j_2007 < n2_2007; ++j_2007) {
			R_2007[j_2007] = arr_2007[m_2007 + 1 + j_2007]; 
		}
		
		int i_2007 = 0, j_2007 = 0;
		
		int k_2007 = l_2007; 
		
		while(i_2007 < n1_2007 && j_2007 < n2_2007) {
			if (L_2007[i_2007] <= R_2007[j_2007]) {
				arr_2007[k_2007] = L_2007[i_2007];
				i_2007++;
			} else {
				arr_2007[k_2007] = R_2007[j_2007];
				j_2007 ++;
			}
			k_2007++;
		}
		
		while (i_2007 < n1_2007) {
			arr_2007[k_2007] = L_2007[i_2007];
			i_2007++;
			k_2007++;
		}
		
		while (j_2007 < n2_2007) {
			arr_2007[k_2007] = R_2007[j_2007];
			j_2007++;
			k_2007++;
		}
	}
	
	void sort_2007(int arr[], int l_2007, int r_2007) {
		if (l_2007 < r_2007) {
			
			int m_2007 = (l_2007 + r_2007) / 2;
			
			sort_2007(arr, l_2007, m_2007);
			sort_2007(arr, m_2007 + 1, r_2007); 
			
			Merge_2007(arr, l_2007, m_2007, r_2007);
		}
	}

	
	static void printArray_2007(int arr_2007[]) {
		int n_2007 = arr_2007.length;
		for (int i_2007 = 0; i_2007 < n_2007; i_2007++) {
			System.out.print(arr_2007[i_2007] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr_2007[] = {12, 11, 13, 5, 6, 7};
		System.out.println("Sebelum Terurut");
		printArray_2007(arr_2007);
		MergeSort_2411532007 ob_2007 = new MergeSort_2411532007();
		ob_2007.sort_2007(arr_2007, 0, arr_2007.length - 1);
		System.out.println("\nSudah Terurut menggunakan merge sort");
		printArray_2007(arr_2007);
		
	}
	
	
}
