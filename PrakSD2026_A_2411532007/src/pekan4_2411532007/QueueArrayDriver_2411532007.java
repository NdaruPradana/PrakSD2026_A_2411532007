package pekan4_2411532007;

public class QueueArrayDriver_2411532007 {
	public static void main(String[] args) {
		QueueArray_2411532007 queue2007 = new QueueArray_2411532007(1000);
		queue2007.enqueue2007(10);
		queue2007.enqueue2007(20);
		queue2007.enqueue2007(30);
		queue2007.enqueue2007(40);
		System.out.println("Item di depan " + queue2007.front2007());
		System.out.println("Item paling belakang "+ queue2007.rear2007());
		System.out.println("tampilan queue");
		queue2007.display2007();
		System.out.println();
		System.out.println(queue2007.dequeue2007() + " dihapus dari queue");
		System.out.println("Item di depan "+ queue2007.front2007());
		System.out.println("Item dibelakang: " + queue2007.rear2007());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue2007.display2007();
		
	}
}
