package pekan5_2411532007;

public class TambahSLL_2411532007 {
	public static NodeSLL_2411532007 insertAtFront(NodeSLL_2411532007 head2007, int value2007) {
		NodeSLL_2411532007 new_node2007 = new NodeSLL_2411532007(value2007);
		new_node2007.next2007 = head2007;
		return new_node2007;
	}
	
	public static NodeSLL_2411532007 insertAtEnd(NodeSLL_2411532007 head2007,int value2007) {
		
		NodeSLL_2411532007 newNode2007 = new NodeSLL_2411532007(value2007);
		if (head2007 == null) {
			return newNode2007;
		}
		
		NodeSLL_2411532007 last = head2007;
		while (last.next2007 != null) {
			last = last.next2007;
		}
		last.next2007 = newNode2007;
		return head2007;
	}
	static NodeSLL_2411532007 GetNode(int data2007) {
		return new NodeSLL_2411532007(data2007);
	}
	
	static NodeSLL_2411532007 insertPos (NodeSLL_2411532007 headNode2007, int position2007,int value2007) {
		NodeSLL_2411532007 head2007 = headNode2007;
		if (position2007 < 1)
			System.out.print("invalid position");
		if(position2007 == 1) {
			NodeSLL_2411532007 new_node2007 = new NodeSLL_2411532007(value2007);
			new_node2007.next2007 = head2007;
			return new_node2007;
		} else {
			while (position2007-- != 0) {
				if(position2007 == 1) {
					NodeSLL_2411532007 newNode2007 = GetNode(value2007);
					newNode2007.next2007 = headNode2007.next2007;
					headNode2007.next2007 = newNode2007;
					break;
				}
				headNode2007 = headNode2007.next2007;
			}
			if (position2007 != 1)
				System.out.print("Posisi diluar jangkauan");}
			return head2007;
		}
	
		public static void printList (NodeSLL_2411532007 head2007) {
				NodeSLL_2411532007 curr = head2007;
			while (curr.next2007 != null) {
				System.out.print(curr.data2007+"-->");
				curr = curr.next2007;
			}
			if (curr.next2007==null) {
				System.out.print(curr.data2007); }
				System.out.println();
			}
			public static void main(String[] args) {
				NodeSLL_2411532007 head2007 = new NodeSLL_2411532007(2);
				head2007.next2007 = new NodeSLL_2411532007(3);
				head2007.next2007.next2007 = new NodeSLL_2411532007(5);
				head2007.next2007.next2007.next2007 = new NodeSLL_2411532007(6);
				
				System.out.print("Senarai berantai awal:");
				printList(head2007);
				
				System.out.print("tambah 2 simpul didepan:");
				int data2007 = 1;
				head2007 = insertAtFront(head2007, data2007);
				printList(head2007);
				
				System.out.println("tambah 1 simpul di belakang: ");
				int data22007 = 7;
				head2007 = insertAtEnd(head2007, data22007);
				printList(head2007);
				
				System.out.print("tambah 1 simpul ke data 4: ");
				int data32007 = 4;
				int pos2007 = 4;
				head2007 = insertPos(head2007,pos2007,data32007);
				printList(head2007);
				
			
			}

}
	
