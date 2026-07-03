package pekan6_2411532007;

public class InsertDLL_2411532007 {
	static NodeDLL_2411532007 insertBegin_2007(NodeDLL_2411532007 head_2007, int data_2007) {
		NodeDLL_2411532007 new_node_2007 = new NodeDLL_2411532007(data_2007);
		new_node_2007.next_2007 = head_2007;
		
		if (head_2007 != null) {
			head_2007.prev_2007 = new_node_2007;
		}
		return new_node_2007;
	}
	
	public static NodeDLL_2411532007 insertEnd_2007(NodeDLL_2411532007 head_2007, int newData_2007) {
		NodeDLL_2411532007 newNode_2007 = new NodeDLL_2411532007(newData_2007);
		
		if ( head_2007 == null ) {
			head_2007 = newNode_2007;
		}
		
		else {
			NodeDLL_2411532007 curr_2007 = head_2007;
			while (curr_2007.next_2007 != null) {
				curr_2007 = curr_2007.next_2007;
			}
			curr_2007.next_2007 = newNode_2007;
			newNode_2007.prev_2007 = curr_2007;
		}
		
		return head_2007;
	}
	
	public static NodeDLL_2411532007 insertAtPosition_2007(NodeDLL_2411532007 head_2007, int pos_2007, int new_data_2007) {
		NodeDLL_2411532007 new_node_2007 = new NodeDLL_2411532007(new_data_2007);
		if (pos_2007 == 1 ) {
			new_node_2007.next_2007 = head_2007;
			if (head_2007 != null) {
				head_2007.prev_2007 = new_node_2007;
			}
			head_2007 = new_node_2007;
			return head_2007;
		}
		NodeDLL_2411532007 curr_2007 = head_2007;
		
		for ( int i = 1; i < pos_2007 - 1 && curr_2007 != null; i++) {
			curr_2007 = curr_2007.next_2007;
		}
		
		if (curr_2007 == null ) {
			System.out.println("Posisi Tidak Ada");
			return head_2007;
		}
		new_node_2007.prev_2007 = curr_2007;
		new_node_2007.next_2007 = curr_2007.next_2007;
		curr_2007.next_2007 = new_node_2007;
		
		if ( new_node_2007.next_2007 != null) {
			new_node_2007.next_2007.prev_2007 = new_node_2007;
		}
		return head_2007;
	}
	
	public static void printList_2007(NodeDLL_2411532007 head_2007) {
		NodeDLL_2411532007 curr_2007 = head_2007;
		while ( curr_2007 != null) {
			System.out.print(curr_2007.data_2007 + " <-> ");
			curr_2007 = curr_2007.next_2007;
		}
		System.out.println();
	}
	
	public static void main (String args[]) {
		NodeDLL_2411532007 head_2007 = new NodeDLL_2411532007(2);
		head_2007.next_2007 = new NodeDLL_2411532007(3);
		head_2007.next_2007.prev_2007 = head_2007;
		head_2007.next_2007.next_2007 = new NodeDLL_2411532007(5);
		head_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007;
		
		System.out.print("DLL Awal: ");
		printList_2007(head_2007);
		head_2007 = insertBegin_2007(head_2007, 1);
		System.out.print("Simpul 1 ditambah di awal: ");
		
		printList_2007(head_2007);
		
		System.out.print("Simpul 6 ditambah di akhir: ");
		int data_2007 = 6;
		head_2007 = insertEnd_2007(head_2007, data_2007);
		printList_2007(head_2007);
		
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_2007 = 4;
		int pos_2007 = 4;
		head_2007 = insertAtPosition_2007(head_2007, pos_2007, data2_2007);
		printList_2007(head_2007);
	}
}
