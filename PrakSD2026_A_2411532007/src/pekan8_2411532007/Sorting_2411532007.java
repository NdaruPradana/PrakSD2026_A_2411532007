package pekan8_2411532007;


public class Sorting_2411532007 {
	Lagu_2411532007[] listLagu_2007 = new Lagu_2411532007[20];
	int jumlah_2007 = 0;

	public void inputData_2007() {
		listLagu_2007[0] = new Lagu_2411532007("Neon Rain", "Neoni", 165);
		listLagu_2007[1] = new Lagu_2411532007("Take Off", "Quavo & Offset", 195);
		listLagu_2007[2] = new Lagu_2411532007("Fake It", "Seether", 235);
		listLagu_2007[3] = new Lagu_2411532007("Anti Hero", "Taylor Swift", 200);
		listLagu_2007[4] = new Lagu_2411532007("Back To Be Friend", "Noah Cyrus", 210);
		listLagu_2007[5] = new Lagu_2411532007("Stay With Me", "Sam Smith", 172);
		listLagu_2007[6] = new Lagu_2411532007("Clarity", "Zedd ft. Foxes", 271);
		jumlah_2007 = 7;
	}

	public void tampilData_2007() {
		for (int i_2007 = 0; i_2007 < jumlah_2007; ++i_2007) {
			System.out.println((i_2007 + 1) + ". " + listLagu_2007[i_2007].toString_2007());
		}
	}
	
	static void swap_2007(Lagu_2411532007[] arr_2007, int i_2007, int j_2007) {
		Lagu_2411532007 temp_2007 = arr_2007[i_2007];
		arr_2007[i_2007] = arr_2007[j_2007];
		arr_2007[j_2007] = temp_2007;
	}

	static void medianOfThree_2007(Lagu_2411532007[] arr_2007, int low_2007, int high_2007) {
		int mid_2007 = low_2007 + (high_2007 - low_2007) / 2;

		if (arr_2007[low_2007].getD_2007() > arr_2007[mid_2007].getD_2007()) {
			swap_2007(arr_2007, low_2007, mid_2007);
		}
		if (arr_2007[low_2007].getD_2007() > arr_2007[high_2007].getD_2007()) {
			swap_2007(arr_2007, low_2007, high_2007);
		}
		if (arr_2007[mid_2007].getD_2007() > arr_2007[high_2007].getD_2007()) {
			swap_2007(arr_2007, mid_2007, high_2007);
		}
		swap_2007(arr_2007, mid_2007, high_2007);
	}

	static int partition_2007(Lagu_2411532007[] arr_2007, int low_2007, int high_2007) {
		medianOfThree_2007(arr_2007, low_2007, high_2007);

		int pivot_2007 = arr_2007[high_2007].getD_2007(); 
		int i_2007 = (low_2007 - 1);

		for (int j_2007 = low_2007; j_2007 <= high_2007 - 1; j_2007++) {
			if (arr_2007[j_2007].getD_2007() < pivot_2007) {
				i_2007++;
				swap_2007(arr_2007, i_2007, j_2007);
			}
		}
		swap_2007(arr_2007, i_2007 + 1, high_2007);
		return (i_2007 + 1);
	}

	static void quickSort_2007(Lagu_2411532007[] arr_2007, int low_2007, int high_2007) {
		if (low_2007 < high_2007) {
			int pi_2007 = partition_2007(arr_2007, low_2007, high_2007);
			quickSort_2007(arr_2007, low_2007, pi_2007 - 1);
			quickSort_2007(arr_2007, pi_2007 + 1, high_2007);
		}
	}

	public void quickSort_2007() {
		if (jumlah_2007 > 1) {
			quickSort_2007(listLagu_2007, 0, jumlah_2007 - 1);
		}
	}

	public static void main(String[] args) {
		Sorting_2411532007 playlist_2007 = new Sorting_2411532007();

		System.out.println("=== Sorting Playlist NIM: 2411532007 ===");
		System.out.println("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): 2");
		playlist_2007.inputData_2007();

		System.out.println("\nData Sebelum Sorting:");
		playlist_2007.tampilData_2007();

		playlist_2007.quickSort_2007();

		System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
		playlist_2007.tampilData_2007();
	}
}