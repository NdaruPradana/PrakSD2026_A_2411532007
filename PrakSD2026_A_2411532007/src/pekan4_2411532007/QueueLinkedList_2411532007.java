package pekan4_2411532007;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2411532007 {
	public static void main(String[] args) {
		Queue<Integer> q2007 = new LinkedList<>();
		for (int i = 0; i < 6; i++)
			q2007.add(i);
		
		System.out.println("Elemen Antrian " + q2007);
		
		int hapus2007 = q2007.remove();
		System.out.println("Hapus elemen = " + hapus2007);
		System.out.println(q2007);
		
		int depan2007 = q2007.peek();
		System.out.println("Kepala Antrian = " + depan2007);
		
		int banyak2007 = q2007.size();
		System.out.println("Size Antrian = " + banyak2007);
	}
}
