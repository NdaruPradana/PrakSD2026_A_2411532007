package pekan4_2411532007;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

public class IterasiQueue_2411532007 {
	public static void main (String []args) {
		Queue<String> q_2007 = new LinkedList<>();
		
		q_2007.add("Pratikum");
		q_2007.add("struktur");
		q_2007.add("Data");
		q_2007.add("Dan");
		q_2007.add("Algoritma");
		
		Iterator<String> iterator_2007 = q_2007.iterator();
		
		while(iterator_2007.hasNext()) {
			System.out.print(iterator_2007.next() + " ");
		}
	}
}
