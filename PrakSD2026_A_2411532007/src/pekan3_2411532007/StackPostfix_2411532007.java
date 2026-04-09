package pekan3_2411532007;

import java.util.Scanner;
import java.util.Stack;

public class StackPostfix_2411532007 {
	public static int postfixEvaluate_2007(String expression) {
		Stack<Integer> s_2007 = new Stack<Integer>();
		Scanner input = new Scanner(expression);
		while (input.hasNext()) {
			if (input.hasNextInt()) {
				s_2007.push(input.nextInt());
			} else {
				String operator_2007 = input.next();
				int operand2_2007 = s_2007.pop();
				int operand1_2007 = s_2007.pop();
				if (operator_2007.equals("+")) {
					s_2007.push(operand1_2007 + operand2_2007);
				} else if (operator_2007.equals("-")) {
					s_2007.push(operand1_2007 - operand2_2007);
				} else if (operator_2007.equals("*")) {
					s_2007.push(operand1_2007 * operand2_2007);
				} else {
					s_2007.push(operand1_2007 / operand2_2007);
				} 
			}
		}
		input.close();
		return s_2007.pop();
	}
	public static void main(String[] args) {
		System.out.println("hasil postfix= "+postfixEvaluate_2007("5 2 4 * + 7 -"));
	}
}
