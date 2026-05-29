package pekan7_2411532007;

public class BubleSort_2411532007 {
	public static void bubbleSort(int[] arr) {
		int n2007 = arr.length;
		for (int i2007 = 0; i2007 < n2007;i2007++) {
			for (int j2007 = 0; j2007 < n2007 - i2007 - 1; j2007++) {
				if (arr[j2007] > arr[j2007 + 1]) {
					int temp2007 = arr[j2007];
					arr[j2007] = arr [j2007 + 1];
					arr[j2007 + 1] = temp2007;
				//	System.out.println("data:"+ arr[j2007] + " " + arr[j2007 + 1]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1 };
		int n2007 = arr.length;
		System.out.print("array yang belum terurut:");
		for (int i2007 = 0; i2007 < n2007; i2007++)
			System.out.print(arr[i2007] + " ");
		System.out.println("");
		bubbleSort(arr);
		System.out.print("array yang terurut menggunakan BUbbleSort:");
		for (int i2007 = 0; i2007 < n2007; i2007++)
			System.out.print(arr[i2007] + " ");
		System.out.println("");
	}
}
