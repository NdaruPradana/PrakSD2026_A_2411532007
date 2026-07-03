package pekan5_2411532007;

public class TambahSLL_2411532007 {
	
	public static NodeSLL_2411532007 insertAtFront_2007(NodeSLL_2411532007 head_2007, int value_2007) {
		NodeSLL_2411532007 new_node_2007 = new NodeSLL_2411532007(value_2007);
		new_node_2007.next_2007 = head_2007;
		return new_node_2007;
	}
	// fungsi menambahkan node di akhir SLL
		public static NodeSLL_2411532007 insertAtEnd_2007(NodeSLL_2411532007 head_2007, int value_2007) {
			// buat sebuah node dengan sebuah nilai
			NodeSLL_2411532007 newNode_2007 = new NodeSLL_2411532007(value_2007);
			// jika list kosong maka node jadi head
			if (head_2007 == null) {
				return newNode_2007;
			}
		// simpan head ke variabel sementara
			NodeSLL_2411532007 last_2007 = head_2007;
			// telusuri ke node akhir
			while (last_2007.next_2007 != null) {
				last_2007 = last_2007.next_2007;
			}
			// ubah pointer 
			last_2007.next_2007 = newNode_2007;
			return head_2007;
		}
		
		static NodeSLL_2411532007 GetNode_2007(int data_2007) {
			return new NodeSLL_2411532007(data_2007);
		}
		
		static NodeSLL_2411532007 insertPos_2007(NodeSLL_2411532007 headNode_2007, int position_2007, int value_2007) {
			NodeSLL_2411532007 head_2007 = headNode_2007;
			if (position_2007 < 1) {
				System.out.print("Invalid position");
			}
			if (position_2007 == 1) {
				NodeSLL_2411532007 new_node_2007 = new NodeSLL_2411532007(value_2007);
				new_node_2007.next_2007 = head_2007;
				return new_node_2007;
			} else {
				while (position_2007-- != 0) {
					if (position_2007 == 1) {
						NodeSLL_2411532007 newNode_2007 = GetNode_2007(value_2007);
						newNode_2007.next_2007 = headNode_2007.next_2007;
						headNode_2007.next_2007 = newNode_2007;
						break;
					}
					headNode_2007 = headNode_2007.next_2007;
				}
			if (position_2007 != 1) 
			System.out.print("Posisi di luar jangkauan"); 
			}
			return head_2007;
			}
			
		public static void printList_2007(NodeSLL_2411532007 head_2007) {
			NodeSLL_2411532007 curr_2007 = head_2007;
				while (curr_2007.next_2007 != null) {
					System.out.print(curr_2007.data_2007 + "-->");
					curr_2007 = curr_2007.next_2007;
			}
			if (curr_2007.next_2007 == null) {
				System.out.print(curr_2007.data_2007);
			}
			System.out.println();
		}
		
		public static void main (String[] args) {
			// buat linked list 2->3->5->6
			NodeSLL_2411532007 head_2007 = new NodeSLL_2411532007(2);
			head_2007.next_2007 = new NodeSLL_2411532007(3);
			head_2007.next_2007.next_2007 = new NodeSLL_2411532007(5);
			head_2007.next_2007.next_2007.next_2007 = new NodeSLL_2411532007(6);
			
			// cetak list asli
			System.out.print("Senarai berantai awal:");
			printList_2007(head_2007);
			
			// tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan: ");
			int data_2007 = 1;
			head_2007 = insertAtFront_2007(head_2007, data_2007);
			
			// cetak update list
			printList_2007(head_2007);
			
			// tambahkan node baru di belakang 
			System.out.print("tambah 1 simpul di belakang: ");
			int data2_2007 = 7;
			head_2007 = insertAtEnd_2007(head_2007, data2_2007);
			
			// cetak update list 
			printList_2007(head_2007);
			System.out.print("tambah 1 simpul ke data 4: ");
			int data3_2007 = 4;
			int pos_2007 = 4;
			head_2007 = insertPos_2007(head_2007, pos_2007, data3_2007);
			
			// cetak update list
			printList_2007(head_2007);
			
		}
				
}
