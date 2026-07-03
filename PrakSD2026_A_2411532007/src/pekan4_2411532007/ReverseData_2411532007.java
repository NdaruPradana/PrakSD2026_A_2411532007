package pekan4_2411532007;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ReverseData_2411532007 {
	public static void main (String []args) {
		Queue<Integer> q_2007 = new LinkedList<Integer>();
		
		q_2007.add(1);
		q_2007.add(2);
		q_2007.add(3);
		
		System.out.println("sebelum reverse " + q_2007 );
		
		Stack<Integer> s_2007 = new Stack<Integer>();
		
		while(!q_2007.isEmpty()) {
			s_2007.push(q_2007.remove());
		}
		
		while(!s_2007.isEmpty()) {
			q_2007.add(s_2007.pop());
		}
		System.out.println("Sesudah reverse= " + q_2007);
		
	}
}
