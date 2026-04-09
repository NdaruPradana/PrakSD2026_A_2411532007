package pekan3_2411532007;

import java.util.Scanner;
import java.util.Stack;

public class NilaiMaksimum_2411532007 {
	public static int max_2007(Stack<Integer> s_2007) {
		Stack<Integer> backup_2007 = new Stack<Integer>();
		int maxValue = s_2007.pop();
		backup_2007.push(maxValue);
		while (!s_2007.isEmpty()) {
			int next_2007 = s_2007.pop();
			backup_2007.push(next_2007);
			maxValue = Math.max(maxValue, next_2007);
		}
		while (!backup_2007.isEmpty()) {
			s_2007.push(backup_2007.pop());
		}
		return maxValue;
		
	}
	public static void main(String[] args) {
		Stack<Integer> s_2007 = new Stack<Integer>();
		s_2007.push(70);
		s_2007.push(12);
		s_2007.push(20);
		System.out.println("isi stack "+s_2007);
		System.out.println("Stack Teratas "+s_2007.peek());
		System.out.println("Nilai maksimum" +max_2007(s_2007));
	}
}
