package pekan5_2411532007;

public class HapusSLL_2411532007 {
	public static NodeSLL_2411532007 deleteHead(NodeSLL_2411532007 head2007) {
		if (head2007 == null)
			return null;
		
		head2007 = head2007.next2007;
		return head2007;
	}
	public static NodeSLL_2411532007 removeLastNode(NodeSLL_2411532007 head2007) {
		if ( head2007 == null) {
			return null;
		}
		
		NodeSLL_2411532007 secondLast = head2007;
		while (secondLast.next2007.next2007 != null) {
			secondLast = secondLast.next2007;
		}
		secondLast.next2007 = null;
		return head2007;
	}
	
	public static NodeSLL_2411532007 deleteNode(NodeSLL_2411532007 head2007,int position2007) {
		NodeSLL_2411532007 temp = head2007;
		NodeSLL_2411532007 prev = null;
		
		if (temp == null)
			return head2007;
		
		if (position2007 == 1) {
			head2007 = temp.next2007;
			return head2007;
		}
		for (int i = 1; temp != null && i < position2007; i++) {
			prev = temp;
			temp = temp.next2007;
		}
		if (temp != null) {
			prev.next2007 = temp.next2007;
		}
		else {
			System.out.println("Data tidak ada"); }
			return head2007;
		}
		
		public static void printList (NodeSLL_2411532007 head2007) {
			NodeSLL_2411532007 curr = head2007;
			while (curr.next2007 != null) {
				System.out.print(curr.data2007+"-->");
				curr = curr.next2007; }
				if (curr.next2007==null) {
					System.out.println(curr.data2007);	}
				System.out.println();	}
				
				
				public static void main(String[] args) {
					
					NodeSLL_2411532007 head2007 = new NodeSLL_2411532007(1);
					head2007.next2007 = new NodeSLL_2411532007(2);
					head2007.next2007.next2007 = new NodeSLL_2411532007(3);
					head2007.next2007.next2007.next2007 = new NodeSLL_2411532007(4);
					head2007.next2007.next2007.next2007.next2007 = new NodeSLL_2411532007(5);
					head2007.next2007.next2007.next2007.next2007.next2007 = new NodeSLL_2411532007(6);
					
					System.out.println("list awal: ");
					printList(head2007);
					
					head2007 = deleteHead(head2007);
					System.out.println("List setelah head dihapus: ");
					printList(head2007);
					
					head2007 = removeLastNode(head2007);
					System.out.println("List setelah simpul terakhir di hapus: ");
					printList(head2007);
					
					int position2007 = 2;
					head2007 = deleteNode(head2007, position2007);
					
					System.out.println("List setelah posisi 2 dihapus: ");
					printList(head2007);
	}
}
