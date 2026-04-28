package pekan4_2411532007;

import java.util.*;

public class IterasiQueue_2411532007 {
	public static void main (String args[]) {
		Queue<String> q2007 = new LinkedList<>();
		
		q2007.add("Praktikum");
		q2007.add("Struktur");
		q2007.add("Data");
		q2007.add("Dan");
		q2007.add("Algoritma");
		Iterator<String> iterator = q2007.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}
}
