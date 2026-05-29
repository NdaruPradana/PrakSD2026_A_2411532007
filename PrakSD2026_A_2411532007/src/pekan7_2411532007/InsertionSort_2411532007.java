package pekan7_2411532007;

public class InsertionSort_2411532007 {
	public static void insertionSort_2411532007 (int[] arr2007) {
		int n2007 = arr2007.length;
		for (int i2007=1; i2007 < n2007; i2007++) {
			int key2007 = arr2007[i2007];
			int j2007 = i2007 - 1;
			while (j2007 >= 0 && arr2007[j2007] > key2007) {
				arr2007[j2007 + 1] = arr2007[j2007];
				j2007--;
			}
			arr2007[j2007 + 1] = key2007;
		}
	}
	
	public static void main(String[] args) {
		int arr2007[] = { 23, 78, 45 ,8 , 32, 56, 1};
		int n2007  = arr2007.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i2007 = 0; i2007 < n2007; i2007++)
			System.out.print(arr2007[i2007] + " ");
		System.out.println("");
		insertionSort_2411532007(arr2007);
		System.out.printf("array yang terurut:\n");
		for (int i2007 = 0; i2007 < n2007; i2007++)
			System.out.print(arr2007[i2007] + " ");
		System.out.println("");
	}
}
