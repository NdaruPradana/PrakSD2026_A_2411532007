package pekan4_2411532007;

import java.util.Queue;
import java.util.LinkedList;

public class QueueLinkedList_2411532007 {
	public static void main (String [] args) {
		Queue<Integer> q_2007 = new LinkedList<>();
		
		for ( int i = 0; i < 6; i++) 
			q_2007.add(i);
		
		System.out.println("Element Antrian " + q_2007);
		
		int hapus_2007 = q_2007.remove();
		
		System.out.println("Hapus Elemen = " + hapus_2007);
		System.out.println(q_2007);
		
		int depan_2007 = q_2007.peek();
		System.out.println("Kepala antrian = " + depan_2007);
		
		int banyak_2007 = q_2007.size();
		System.out.println("Size antrian = " + banyak_2007);
	}
}
