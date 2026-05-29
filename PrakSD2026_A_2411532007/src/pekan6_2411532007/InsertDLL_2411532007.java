package pekan6_2411532007;

public class InsertDLL_2411532007 {
	static NodeDLL_2411532007 insertBegin(NodeDLL_2411532007 head2007, int data2007) {
		NodeDLL_2411532007 new_node2007 = new NodeDLL_2411532007(data2007);
		new_node2007.next2007 = head2007;
		
		if (head2007 != null) {
			head2007.prev2007 = new_node2007;
		}
		return new_node2007;
	}
	
	public static NodeDLL_2411532007 insertEnd(NodeDLL_2411532007 head2007, int newData2007) {
		NodeDLL_2411532007 newNode2007 = new NodeDLL_2411532007(newData2007);
		
		if (head2007 == null) {
			head2007 = newNode2007;
		}
		else {
			NodeDLL_2411532007 curr2007 = head2007;
			while (curr2007.next2007 != null) {
				curr2007 = curr2007.next2007; 
			}
			curr2007.next2007 = newNode2007;
			newNode2007.prev2007 = curr2007;
		}
		return head2007;
	}
	
	public static NodeDLL_2411532007 insertAtPosition(NodeDLL_2411532007 head2007, int pos2007, int new_data2007) {
		NodeDLL_2411532007 new_node2007 = new NodeDLL_2411532007(new_data2007);
		if(pos2007 == 1) {
			new_node2007.next2007 = head2007;
			if(head2007 != null) {
				head2007.prev2007 = new_node2007;
			}
			head2007 = new_node2007;
			return head2007;
		}
		NodeDLL_2411532007 curr2007 = head2007;
		for (int i = 1; i < pos2007 - 1 && curr2007 != null; ++i) {
			curr2007 = curr2007.next2007;
		}
		if (curr2007 == null) {
			System.out.println("Posisi tidak ada");
			return head2007;
		}
		new_node2007.prev2007 = curr2007;
		new_node2007.next2007 = curr2007.next2007;
		curr2007.next2007 = new_node2007;
		if (new_node2007.next2007 != null) {
			new_node2007.next2007.prev2007 = new_node2007;
		}
		return head2007;
	}
	
	public static void printList (NodeDLL_2411532007 head2007) {
		NodeDLL_2411532007 curr2007 = head2007;
		while (curr2007 != null) {
			System.out.print(curr2007.data2007 + " <-> ");
			curr2007 = curr2007.next2007;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		NodeDLL_2411532007 head2007 = new NodeDLL_2411532007(2);
		head2007.next2007 = new NodeDLL_2411532007(3);
		head2007.next2007.prev2007 = head2007;
		head2007.next2007.next2007 = new NodeDLL_2411532007(5);
		head2007.next2007.next2007.prev2007 = head2007.next2007;
		
		System.out.print("DLL Awal:");
		printList(head2007);
		head2007 = insertBegin(head2007, 1);
		System.out.print("simpul 1 ditambah di awal: ");
			printList(head2007);
		System.out.print("simpul 6 ditambah di akhir: ");
		int data2007 = 6;
		head2007 = insertEnd(head2007, data2007);
		printList(head2007);
		
		System.out.print("tambah node 4 di posisi 4: ");
		int data22007 = 4;
		int pos2007 = 4;
		head2007 = insertAtPosition(head2007, pos2007,data22007);
		printList(head2007);
	}
}







