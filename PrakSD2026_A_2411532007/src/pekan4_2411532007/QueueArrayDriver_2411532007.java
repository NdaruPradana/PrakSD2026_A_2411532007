package pekan4_2411532007;

public class QueueArrayDriver_2411532007 {
	public static void main ( String [] args) {
		QueueArray_2411532007 queue_2007 = new QueueArray_2411532007(1000);
		
		queue_2007.enqueue_2007(10);
		queue_2007.enqueue_2007(20);
		queue_2007.enqueue_2007(30);
		queue_2007.enqueue_2007(40);
		
		System.out.println("item di depan " + queue_2007.front_2007());
		System.out.println("item di paling belakang " + queue_2007.rear_2007());
		System.out.println("tampilkan queue");
		
		queue_2007.display_2007();
		
		System.out.println();
		System.out.println(queue_2007.dequeue_2007() + " dihapus dari queue");
		System.out.println("item di depan :" + queue_2007.front_2007());
		System.out.println("item di  belakang :" + queue_2007.rear_2007());
		
		System.out.println("tampilkan queue setelah dihapus");
		queue_2007.display_2007();
	}
}
