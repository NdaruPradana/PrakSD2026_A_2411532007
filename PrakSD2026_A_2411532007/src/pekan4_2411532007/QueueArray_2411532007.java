package pekan4_2411532007;

public class QueueArray_2411532007 {
	int front2007, rear2007, size2007;
	int capacity2007;
	int array2007[];
	
	public QueueArray_2411532007(int capacity2007) {
		this.capacity2007 = capacity2007;
		front2007 = this.size2007 = 0;
		rear2007 = capacity2007 - 1;
		array2007 = new int[this.capacity2007];
	}
	
	boolean isFull(QueueArray_2411532007 queue) {
		return (queue.size2007 == queue.capacity2007);
	}
	
	boolean isEmpty(QueueArray_2411532007 queue) {
		return (queue.size2007 == 0);
	}
	
	void enqueue2007(int item2007) {
		if (isFull(this))
				return;
		this.rear2007 = (this.rear2007 + 1) % this.capacity2007;
		this.array2007[this.rear2007] = item2007;
		this.size2007 = this.size2007 + 1;
		System.out.println(item2007 + " enqueued to queue");
	}
	
	int dequeue2007() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item2007 = this.array2007[this.front2007];
		this.front2007 = (this.front2007 + 1) % this.capacity2007;
		this.size2007 = this.size2007 - 1;
		return item2007;
	}
	int front2007() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.array2007[this.front2007];
	}
	int rear2007() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array2007[this.rear2007];
	}
	
	void display2007() {
		int i2007;
		if (front2007 == rear2007) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		return;
	}
}
