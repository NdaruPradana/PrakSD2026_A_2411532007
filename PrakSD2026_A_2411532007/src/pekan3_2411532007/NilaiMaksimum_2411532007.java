package pekan3_2411532007;
import java.util.Stack;
import java.util.Scanner;


public class NilaiMaksimum_2411532007 {
	public static int max_2007(Stack<Integer> s_2007) {
		Stack<Integer> backup_2007 = new Stack<Integer>();
		int maxValue_2007 = s_2007.pop();
		backup_2007.push(maxValue_2007);
		
		while ( !s_2007.isEmpty()) {
			int next_2007 = s_2007.pop();
			backup_2007.push(next_2007);
			maxValue_2007 = Math.max(maxValue_2007, next_2007);
		}
		
		while (!backup_2007.isEmpty()) {
			s_2007.push(backup_2007.pop());
		}
		return maxValue_2007;
	}
	
	public static void main (String []args) {
		Stack<Integer> s_2007 = new Stack<Integer>();
		s_2007.push(70);
		s_2007.push(12);
		s_2007.push(20);
		
		System.out.println("isi Stack " + s_2007);
		System.out.println("Stack teratas " + s_2007.peek());
		System.out.println("Nilai teratas " + max_2007(s_2007));
		
	}
} 
