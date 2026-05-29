package pekan6_2411532007;

public class HapusDLL_2411532007 {
	public static NodeDLL_2411532007 delhead(NodeDLL_2411532007 head2007) {
		if (head2007 == null) {
			return null; }
		NodeDLL_2411532007 temp = head2007;
		head2007 = head2007.next2007;
		if (head2007 != null) {
			head2007.prev2007 = null;
		}
		return head2007;
		}
		
		public static NodeDLL_2411532007 delLast (NodeDLL_2411532007 head2007) {
			if (head2007 == null) {
				return null;
			}
			if (head2007.next2007 == null) {
				return null;
			}
			NodeDLL_2411532007 curr2007 = head2007;
			while (curr2007.next2007 != null) {
				curr2007 = curr2007.next2007;
			}
			
			if(curr2007.prev2007 != null) {
				curr2007.prev2007.next2007 = null;
			}
			return head2007;
		}
		public static NodeDLL_2411532007 delpos(NodeDLL_2411532007 head2007, int pos2007) {
			if (head2007 == null) {
				return head2007;
			}
			NodeDLL_2411532007 curr2007 = head2007;
			for (int i = 1; curr2007 != null && i < pos2007; ++i) {
				curr2007 = curr2007.next2007;
			}
			if (curr2007 == null) {
				return head2007;
			}
			if(curr2007.prev2007 != null) {
				curr2007.prev2007.next2007 = curr2007.next2007;
			}
			if(curr2007.next2007 != null) {
				curr2007.next2007.prev2007 = curr2007.prev2007;
			}
			
			if(head2007 == curr2007) {
				head2007 = curr2007.next2007;
			}
			return head2007;
		}
		public static void printList(NodeDLL_2411532007 head2007) {
			NodeDLL_2411532007 curr2007 = head2007;
			while (curr2007 != null) {
				System.out.print(curr2007.data2007 + " <-> ");
				curr2007 = curr2007.next2007;
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			NodeDLL_2411532007 head2007 = new NodeDLL_2411532007(1);
			head2007.next2007 = new NodeDLL_2411532007(2);
			head2007.next2007.prev2007 = head2007;
			head2007.next2007.next2007 = new NodeDLL_2411532007(3);
			head2007.next2007.next2007.prev2007 = head2007.next2007;
			head2007.next2007.next2007.next2007 = new NodeDLL_2411532007(4);
			head2007.next2007.next2007.next2007.prev2007 = head2007.next2007.next2007;
			head2007.next2007.next2007.next2007.next2007 = new NodeDLL_2411532007 (5);
			head2007.next2007.next2007.next2007.next2007.prev2007 = head2007.next2007.next2007.next2007;
			
			System.out.print("Dll Awal: ");
			printList(head2007);
			
			System.out.print("Setelah head dihapus: ");
			head2007 = delhead(head2007);
			printList(head2007);
			
			System.out.print("Setelah node terakhir dihapus: ");
			head2007 = delLast(head2007);
			printList(head2007);
			
			System.out.print("menghapus node ke 2: ");
			head2007 = delpos(head2007, 2);
			
			printList(head2007);
		}
	}








