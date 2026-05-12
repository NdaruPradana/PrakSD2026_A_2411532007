package pekan5_2411532007;

public class PencarianSLL_2411532007 {
	static boolean searchKey(NodeSLL_2411532007 head2007,int key2007) {
		NodeSLL_2411532007 curr = head2007;
		while (curr != null) {
			if (curr.data2007 == key2007)
				return true;
					curr = curr.next2007;
		}
		return false;
	}
	
	public static void traversal (NodeSLL_2411532007 head2007) {
		NodeSLL_2411532007 curr = head2007;
		
		while (curr != null) {
			System.out.print(" " + curr.data2007);
			curr = curr.next2007;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeSLL_2411532007 head2007 = new NodeSLL_2411532007(14);
		head2007.next2007 = new NodeSLL_2411532007(21);
		head2007.next2007.next2007 = new NodeSLL_2411532007(13);
		head2007.next2007.next2007.next2007 = new NodeSLL_2411532007(30);
		head2007.next2007.next2007.next2007.next2007 = new NodeSLL_2411532007(10);
		System.out.print("Penelusuran SLL : ");
		traversal(head2007);
		
		int key2007 = 30;
		System.out.println("cari data "+key2007+ " = ");
		if (searchKey(head2007, key2007))
			System.out.println("ketemu");
		else
			System.out.println("tidak ada");
		
	}
}
