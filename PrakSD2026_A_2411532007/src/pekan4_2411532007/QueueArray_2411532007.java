package pekan4_2411532007;

import java.util.Queue;

public class QueueArray_2411532007 {
	int front_2007, rear_2007, size_2007;
	int capacity_2007;
	int array_2007[];
	
	public QueueArray_2411532007(int capacity) {
		this.capacity_2007 = capacity;
		front_2007 = this.size_2007 = 0;
		rear_2007 = capacity - 1;
		array_2007 = new int [this.capacity_2007];
	}
	
	boolean isFull_2007(QueueArray_2411532007 queue) {
		return (queue.size_2007 == queue.capacity_2007);
	}
	
	boolean isEmpty_2007 (QueueArray_2411532007 queue) {
		return (queue.size_2007 == 0);
	}
	
	void enqueue_2007(int item_2007) {
		if (isFull_2007(this))
			return;
		this.rear_2007 = (this.rear_2007 + 1) % this.capacity_2007;
		this.array_2007[this.rear_2007 ] = item_2007;
		this.size_2007 = this.size_2007 + 1;
		System.out.println(item_2007 + " enqueued to queue");
	}
	
	int dequeue_2007() {
		if(isEmpty_2007(this)) 
			return Integer.MIN_VALUE;
		int item_2007 = this.array_2007[this.front_2007];
		this.front_2007 = (this.front_2007 + 1) % this.capacity_2007;
		this.size_2007 = this.size_2007 - 1;
		return item_2007;
	}
	
	int front_2007() {
		if (isEmpty_2007(this))
			return Integer.MIN_VALUE;
		
		return this.array_2007[this.front_2007];
	}
	
	int rear_2007() {
		if (isEmpty_2007(this))
			return Integer.MIN_VALUE;
		return this.array_2007[this.rear_2007];
	}
	
	void display_2007() {
		int i;
		if (front_2007 == rear_2007) {
			System.out.printf("\nantrian kosong\n");
			return;
		}
		
		for ( i = front_2007; i < rear_2007; i++) {
			System.out.printf(" %d <--", array_2007[i]);
		}
		
		return;
	}
	
}
