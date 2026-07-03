package pekan5_2411532007;

public class PencarianSLL_2411532007 {
	static boolean searchKey_2007(NodeSLL_2411532007 head_2007, int key_2007) {
		NodeSLL_2411532007 curr_2007 = head_2007;
		while (curr_2007 != null) {
			if (curr_2007.data_2007 == key_2007)
				return true;
			curr_2007 = curr_2007.next_2007;
		}
		return false;
	}
	
	public static void traversal_2007(NodeSLL_2411532007 head_2007) {
		// mulai dari head
		NodeSLL_2411532007 curr_2007 = head_2007;
		while (curr_2007 != null) {
			System.out.print(" " + curr_2007.data_2007);
			curr_2007 = curr_2007.next_2007;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeSLL_2411532007 head_2007 = new NodeSLL_2411532007(14);
		head_2007.next_2007 = new NodeSLL_2411532007(21);
		head_2007.next_2007.next_2007 = new NodeSLL_2411532007(13);
		head_2007.next_2007.next_2007.next_2007 = new NodeSLL_2411532007(30);
		head_2007.next_2007.next_2007.next_2007.next_2007 = new NodeSLL_2411532007(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2007(head_2007);
		// data yang akan dicari
		int key_2007 = 30;
		System.out.print("cari data " +key_2007+ " = ");
		if (searchKey_2007(head_2007, key_2007))
			System.out.println("ketemu");
		else 
			System.out.println("tidak ada");
	} 

}
