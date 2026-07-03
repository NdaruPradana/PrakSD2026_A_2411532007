package pekan9_2411532007;

public class Node_2411532007 {
	int data_2007;
	Node_2411532007 left_2007;
	Node_2411532007 right_2007;
	
	public Node_2411532007(int data_2007) {
		this.data_2007 = data_2007;
		left_2007 = null;
		right_2007 = null;
	}
	
	public void setLeft_2007(Node_2411532007 node_2007) {
		if ( left_2007 == null ) {
			left_2007 = node_2007;
		}
	}
	
	public void setRight_2007(Node_2411532007 node_2007) {
		if (right_2007 == null ) {
			right_2007 = node_2007;
		}
	}
	
	public Node_2411532007 getLeft_2007() {
		return left_2007;
	}
	
	public Node_2411532007 getRight_2007() {
		return right_2007;
	}
	
	public int getData_2007() {
		return data_2007;
	}
	
	public void setData_2007(int data_2007) {
		this.data_2007 = data_2007;
	}
	
	void printPreorder_2007(Node_2411532007 node_2007) {
		if(node_2007 == null ) {
			return;
		}
		System.out.print(node_2007.data_2007 + " ");
		printPreorder_2007(node_2007.left_2007);
		printPreorder_2007(node_2007.right_2007);
	}
	
	void printPostorder_2007(Node_2411532007 node_2007) {
		if(node_2007 == null ) {
			return;
		}
		printPostorder_2007(node_2007.left_2007);
		printPostorder_2007(node_2007.right_2007);
		System.out.print(node_2007.data_2007 + " ");
	}
	
	void printInorder_2007(Node_2411532007 node_2007) {
		if(node_2007 == null ) {
			return;
		}
		printInorder_2007(node_2007.left_2007);
		System.out.print(node_2007.data_2007 + " ");
		printInorder_2007(node_2007.right_2007);
	}
	
	public String print_2007() {
		return this.print_2007("", true, "");
	}
	
	
	public String print_2007(String prefix_2007, boolean isTail_2007, String sb_2007) {
		if (right_2007 != null ) {
			right_2007.print_2007(prefix_2007 + (isTail_2007 ? "| ": " "), false, sb_2007);
		}
		System.out.println( prefix_2007 + (isTail_2007 ? "\\-- ": "/-- ") + data_2007);
		if (left_2007 != null) {
			left_2007.print_2007(prefix_2007 + (isTail_2007 ? "  ": "| "), true, sb_2007);
		}
		return sb_2007;
	}
}
