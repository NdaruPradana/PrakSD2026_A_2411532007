package pekan6_2411532007;

public class PenulusuranDLL_2411532007 {
	static void forwardTransversal_2007(NodeDLL_2411532007 head_2007) {
		NodeDLL_2411532007 curr_2007 = head_2007;
		
		while (curr_2007 != null ) {
			System.out.print(curr_2007.data_2007 + " <-> ");
			curr_2007 = curr_2007.next_2007;
		}
		
		System.out.println();
	}
	
	static void backwardTransversal_2007(NodeDLL_2411532007 tail_2007) {
		NodeDLL_2411532007 curr_2007 = tail_2007;
		
		while (curr_2007 != null ) {
			System.out.print(curr_2007.data_2007 + " <-> ");
			curr_2007 = curr_2007.prev_2007;
		}
		System.out.println();
	}
	
	public static void main ( String[] args) {
		NodeDLL_2411532007 head_2007 = new NodeDLL_2411532007(1);
		NodeDLL_2411532007 second_2007 = new NodeDLL_2411532007(2);
		NodeDLL_2411532007 third_2007 = new NodeDLL_2411532007(3);
		
		head_2007.next_2007 = second_2007;
		second_2007.prev_2007 = head_2007;
		second_2007.next_2007 = third_2007;
		third_2007.prev_2007 = second_2007;
		
		System.out.println("Penulusuran Maju:");
		forwardTransversal_2007(head_2007);
		
		System.out.println("Penulusuran Mundur:");
		backwardTransversal_2007(third_2007);
		
	}
}
