package pekan9_2411532007;

public class BtreeDriver_2411532007 {

	public static void main(String[] args) {
		
		Btree_2411532007 tree_2007 = new Btree_2411532007();
		System.out.print("Jumlah Simpul awal pohon: ");
		System.out.println(tree_2007.countNodes_2007());
		
		Node_2411532007 root_2007 = new Node_2411532007(1);
		
		tree_2007.setRoot_2007(root_2007);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_2007.countNodes_2007());
		Node_2411532007 node2_2007 = new Node_2411532007(2);
		Node_2411532007 node3_2007 = new Node_2411532007(3);
		Node_2411532007 node4_2007 = new Node_2411532007(4);
		Node_2411532007 node5_2007 = new Node_2411532007(5);
		Node_2411532007 node6_2007 = new Node_2411532007(6);
		Node_2411532007 node7_2007 = new Node_2411532007(7);
		Node_2411532007 node8_2007 = new Node_2411532007(8);
		Node_2411532007 node9_2007 = new Node_2411532007(9);
		root_2007.setLeft_2007(node2_2007);
		node2_2007.setLeft_2007(node4_2007);
		node2_2007.setRight_2007(node5_2007);
		node4_2007.setRight_2007(node8_2007);
		root_2007.setRight_2007(node3_2007);
		node3_2007.setLeft_2007(node6_2007);
		node3_2007.setRight_2007(node7_2007);
		node6_2007.setLeft_2007(node9_2007);
		
		tree_2007.setCurrent_2007(tree_2007.getRoot_2007());
		System.out.println("menampilkan simpul terakhir: ");
		System.out.println(tree_2007.getCurrent_2007().getData_2007());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
		System.out.println(tree_2007.countNodes_2007());
		System.out.println("InOrder: ");
		tree_2007.printInorder_2007();
		System.out.println("\nPreorder: ");
		tree_2007.printPreorder_2007();
		System.out.println("\nPostorder: ");
		tree_2007.printPostorder_2007();
		System.out.println("\nMenampilkan simpul dalam bentuk pohon");
		tree_2007.print_2007();
	}

}
