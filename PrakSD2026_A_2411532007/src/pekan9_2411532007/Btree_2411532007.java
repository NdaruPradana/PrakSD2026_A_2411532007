package pekan9_2411532007;

public class Btree_2411532007 {
	private Node_2411532007 root_2007;
	private Node_2411532007 currentNode_2007;
	
	public Btree_2411532007() {
		root_2007 = null;
	}
	
	public boolean search_2007(int data_2007) {
		return search_2007(root_2007, data_2007);
	}
	
	private boolean search_2007(Node_2411532007 node_2007, int data_2007) {
		if (node_2007.getData_2007() == data_2007)
			return true;
		if (node_2007.getLeft_2007() != null)
			if (search_2007(node_2007.getLeft_2007(), data_2007))
				return true;
		if (node_2007.getRight_2007() != null)
			if (search_2007(node_2007.getRight_2007(), data_2007))
				return true;
		return false;
	}
	
	public void printInorder_2007() {
		root_2007.printInorder_2007(root_2007);
	}
	
	public void printPreorder_2007() {
		root_2007.printPreorder_2007(root_2007);
	}
	public void printPostorder_2007() {
		root_2007.printPostorder_2007(root_2007);
	}
	
	public Node_2411532007 getRoot_2007() {
		return root_2007;
	}
	
	public boolean isEmpty_2007() {
		return root_2007 == null;
	}
	
	public int countNodes_2007() {
		return countNodes_2007(root_2007);
	}
	
	private int countNodes_2007(Node_2411532007 node_2007) {
		int count_2007 = 1;
		if ( node_2007 == null) {
			return 0;
		} else {
			count_2007 += countNodes_2007(node_2007.getLeft_2007());
			count_2007 += countNodes_2007(node_2007.getRight_2007());
			return count_2007;
		}
	}
	
	public void print_2007() {
		root_2007.print_2007();
	}
	
	public Node_2411532007 getCurrent_2007() {
		return currentNode_2007;
	}
	
	public void setCurrent_2007(Node_2411532007 node_2007) {
		this.currentNode_2007 = node_2007;
	}
	
	public void setRoot_2007(Node_2411532007 root_2007) {
		this.root_2007 = root_2007;
	}
}
