package pekan7_2411532007;

public class SelectionSort_2411532007 {
	public static void selectionSort_2411532007(int[] arr) {
		int n2007 = arr.length;
		for (int i = 0;i < n2007; i++) {
			int minIndex2007 = i;
			for (int j= i + 1; j < n2007; j++) {
				if (arr[j] < arr[minIndex2007]) {
					minIndex2007 = j;
				}
			}
			int temp2007 = arr[i];
			arr[i] = arr[minIndex2007];
			arr[minIndex2007] = temp2007;
		}
	}
	
	public static void main(String[] args) {
		int arr2007[] = {23, 78, 45, 8, 32, 56, 1};
		int n2007 = arr2007.length;
		System.out.printf("array yang belum terurut:\n");
		for (int i2007 = 0; i2007 < n2007; i2007++)
			System.out.print(arr2007[i2007] + " ");
		System.out.println("");
		selectionSort_2411532007(arr2007);
		System.out.printf("array yang terurut:\n");
		for (int i2007 = 0; i2007 < n2007; i2007++)
			System.out.print(arr2007[i2007] + " ");
		System.out.println("");
	}
}
