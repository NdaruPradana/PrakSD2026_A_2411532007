package pekan6_2411532007;

public class HapusDLL_2411532007 {
	public static NodeDLL_2411532007 delHead_2007(NodeDLL_2411532007 head_2007) {
		if ( head_2007 == null ) {
			return null;
		}
		
		NodeDLL_2411532007 temp_2007 = head_2007;
		head_2007 = head_2007.next_2007;
		
		if ( head_2007 != null ) {
			head_2007.prev_2007 = null;
		}
		
		return head_2007;
	}
	
	public static NodeDLL_2411532007 delLast_2007(NodeDLL_2411532007 head_2007) {
		if ( head_2007 == null ) {
			return null;
		}
		if ( head_2007.next_2007 == null ) {
			return null;
		}
		
		NodeDLL_2411532007 curr_2007 = head_2007;
		while ( curr_2007.next_2007 != null) {
			curr_2007 = curr_2007.next_2007;
		}
		
		if (curr_2007.prev_2007 != null ) {
			curr_2007.prev_2007.next_2007 = null;
		}
		
		return head_2007;
	}
	
	public static NodeDLL_2411532007 delPos_2007(NodeDLL_2411532007 head_2007, int pos_2007) {
		if ( head_2007 == null ) {
			return head_2007;
		}
		NodeDLL_2411532007 curr_2007 = head_2007;
		
		for ( int i = 1; curr_2007 != null && i < pos_2007; i++) {
			curr_2007 = curr_2007.next_2007;
		}
		
		if ( curr_2007 == null ) {
			return head_2007;
		}
		
		if ( curr_2007.prev_2007 != null) {
			curr_2007.prev_2007.next_2007 = curr_2007.next_2007;
		}
		
		if ( curr_2007.next_2007 != null) {
			curr_2007.next_2007.prev_2007 = curr_2007.prev_2007;
		}
		
		if ( head_2007 == curr_2007) {
			head_2007 = curr_2007.next_2007;
		}
		
		return head_2007;
	}
	
	public static void printList_2007(NodeDLL_2411532007 head_2007) {
		NodeDLL_2411532007 curr_2007 = head_2007;
		while (curr_2007 != null) {
			System.out.print(curr_2007.data_2007 + " <-> ");
			curr_2007 = curr_2007.next_2007;
		}
		System.out.println();
	}
	
	public static void main ( String [] args) {
		NodeDLL_2411532007 head_2007 = new NodeDLL_2411532007(1);
		head_2007.next_2007 = new NodeDLL_2411532007(2);
		head_2007.next_2007.prev_2007 = head_2007;
		head_2007.next_2007.next_2007 = new NodeDLL_2411532007(3);
		head_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007;
		head_2007.next_2007.next_2007.next_2007 = new NodeDLL_2411532007(4);
		head_2007.next_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007.next_2007;
		head_2007.next_2007.next_2007.next_2007.next_2007 = new NodeDLL_2411532007(5);
		head_2007.next_2007.next_2007.next_2007.next_2007.prev_2007 = head_2007.next_2007.next_2007.next_2007;
		
		System.out.print("DLL Awal: ");
		printList_2007(head_2007);
		
		System.out.print("Setelah head Dihapus: ");
		head_2007 = delHead_2007(head_2007);
		printList_2007(head_2007);
		
		System.out.print("Setelah node terakhir Dihapus: ");
		head_2007 = delLast_2007(head_2007);
		printList_2007(head_2007);
		
		System.out.print("Menghapus node ke 2: ");
		head_2007 = delPos_2007(head_2007, 2);
		printList_2007(head_2007);
	}
}
