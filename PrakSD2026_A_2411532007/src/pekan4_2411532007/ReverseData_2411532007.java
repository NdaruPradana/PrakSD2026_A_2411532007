package pekan4_2411532007;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseData_2411532007 {
	public static void main(String[] args) {
		Queue<Integer> q2007 = new LinkedList<Integer>();
		q2007.add(1);
		q2007.add(2);
		q2007.add(3);
		System.out.println("sebelum reverse" + q2007);
		Stack<Integer> s2007 = new Stack<Integer>();
		while (!q2007.isEmpty()) {
			s2007.push(q2007.remove());
			
		}
		while (!s2007.isEmpty()) {
			q2007.add(s2007.pop());
		}
		System.out.println("sesudah reverse = " + q2007);
			
	}
}
