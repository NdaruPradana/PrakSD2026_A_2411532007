package pekan5_2411532007;

public class HapusSLL_2411532007 {
	// fungsi untuk menghapus head
	public static NodeSLL_2411532007 deleteHead_2007(NodeSLL_2411532007 head_2007) {
		// jika SLL kosong
		if (head_2007 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_2007 = head_2007.next_2007;
		// return head baru
		return head_2007;
	}
	// fungsi menghapus node terakhir SLL
	public static NodeSLL_2411532007 removeLastNode_2007(NodeSLL_2411532007 head_2007) {
		// jika list kosong, return null
		if (head_2007 == null) {
			return null;
		}
		// jika list satu node, hapus node dan return null
		if (head_2007.next_2007 == null) {
			return null;
		}
		// temukan node terakhir ke dua
		NodeSLL_2411532007 secondLast_2007 = head_2007;
		while (secondLast_2007.next_2007.next_2007 != null) {
			secondLast_2007 = secondLast_2007.next_2007;
		}
		// hapus node terakhir
		secondLast_2007.next_2007 = null;
		return head_2007;
	}
	// fungsi menghapus node di posisi tertentu
	public static NodeSLL_2411532007 deleteNode_2007(NodeSLL_2411532007 head_2007, int position_2007) {
		NodeSLL_2411532007 temp_2007 = head_2007;
		NodeSLL_2411532007 prev_2007 = null;
		// jika linked list null
		if (temp_2007 == null)
			return head_2007;
		// kasus 1: head dihapus
		if (position_2007 == 1) {
			head_2007 = temp_2007.next_2007;
			return head_2007;
		}
		// kasus 2: menghapus node di tengah
		// telusuri ke node yang di hapus
	for (int i_2007 = 1; temp_2007 != null && i_2007 < position_2007; i_2007++) {
		prev_2007 = temp_2007;
		temp_2007 = temp_2007.next_2007;
	}
	// jika ditemukan, hapus node
	if (temp_2007 != null) {
		prev_2007.next_2007 = temp_2007.next_2007;
	} else {
		System.out.println("Data tidak ada");
	}
		return head_2007;
	}
	// fungsi mencetak SLL
	public static void printList_2007(NodeSLL_2411532007 head_2007) {
		NodeSLL_2411532007 curr_2007 = head_2007;
		while (curr_2007.next_2007 != null) {
			System.out.print(curr_2007.data_2007+"-->");
			curr_2007 = curr_2007.next_2007;
		}
		if (curr_2007.next_2007 == null) {
			System.out.print(curr_2007.data_2007);
		}
		System.out.println();
	
	}
	// kelas main
	public static void main(String[] args) {
		// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
		NodeSLL_2411532007 head_2007 = new NodeSLL_2411532007(1);
		head_2007.next_2007 = new NodeSLL_2411532007(2);
		head_2007.next_2007.next_2007 = new NodeSLL_2411532007(3);
		head_2007.next_2007.next_2007.next_2007 = new NodeSLL_2411532007(4);
		head_2007.next_2007.next_2007.next_2007.next_2007 = new NodeSLL_2411532007(5);
		head_2007.next_2007.next_2007.next_2007.next_2007.next_2007 = new NodeSLL_2411532007(6);
		// cetak list awal 
		System.out.println("list awal: ");
		printList_2007(head_2007);
		
		//hapus head
		head_2007 = deleteHead_2007(head_2007);
		System.out.println("List setelah head dihapus: ");
		printList_2007(head_2007);
		
		//hapus node terakhir
		head_2007 = removeLastNode_2007(head_2007);
		System.out.println("List setelah simpul terakhir di hapus: ");
		printList_2007(head_2007);
		
		// deleting node at position 2
		int position_2007 = 2;
		head_2007 = deleteNode_2007(head_2007, position_2007);
		
		// print list after deletion
		System.out.println("List setelah posisi 2 dihapus: ");
		printList_2007(head_2007);
	}
}
