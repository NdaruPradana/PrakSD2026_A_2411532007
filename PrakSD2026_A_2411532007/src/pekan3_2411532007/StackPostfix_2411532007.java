package pekan3_2411532007;
import java.util.Stack;
import java.util.Scanner;

public class StackPostfix_2411532007 {
	public static int postfixEvaluate_2007(String expression) {
		Stack<Integer> s_2007 = new Stack<Integer>();
		Scanner input_2007 = new Scanner(expression);
		
		while ( input_2007.hasNext()) {
			
			if (input_2007.hasNextInt()) {
				s_2007.push(input_2007.nextInt());
			}
			else {
				String operator_2007 = input_2007.next();
				int operand2_2007 = s_2007.pop();
				int operand1_2007 = s_2007.pop();
				
				if (operator_2007.equals("+")) {
					s_2007.push(operand1_2007 + operand2_2007);
				} else if (operator_2007.equals("-")) {
					s_2007.push(operand1_2007 - operand2_2007);
				} else if (operator_2007.equals("*")) {
					s_2007.push(operand1_2007 * operand2_2007);
				} else if (operator_2007.equals("/")) {
					s_2007.push(operand1_2007 / operand2_2007);
				}
			}
		}
		
		input_2007.close();
		return s_2007.pop();
	}
	
	public static void main(String [] args) {
		System.out.println("Hasil postfix= " + postfixEvaluate_2007("5 2 4 * + 7 -"));
	}
}
