package pekan6_2411532007;

public class PenelusuranDLL_2411532007 {
	static void forwardTraversal2007 (NodeDLL_2411532007 head2007) {
		NodeDLL_2411532007 curr2007 = head2007;
		while (curr2007 != null) {
			System.out.print(curr2007.data2007 + " <-> ");
			curr2007 = curr2007.next2007;
		}
		System.out.println();
	}
	static void backwardTraversal2007(NodeDLL_2411532007 tail2007) {
		NodeDLL_2411532007 curr2007 = tail2007;
		while (curr2007 != null) {
			System.out.print(curr2007.data2007 +" <-> ");
			curr2007 = curr2007.prev2007;
		}
		System.out.println();
	}
	public static void main (String[] args) {
		NodeDLL_2411532007 head2007 = new NodeDLL_2411532007(1);
		NodeDLL_2411532007 second2007 = new NodeDLL_2411532007(2);
		NodeDLL_2411532007 third2007 = new NodeDLL_2411532007(3);
		
		head2007.next2007 = second2007;
		second2007.prev2007 = head2007;
		second2007.next2007 = third2007;
		third2007.prev2007 = second2007;
		
		System.out.println("Penelusuran Maju: ");
		forwardTraversal2007 (head2007);
		
		System.out.println("Penelususran mundur: ");
		backwardTraversal2007(third2007);
	}
}
