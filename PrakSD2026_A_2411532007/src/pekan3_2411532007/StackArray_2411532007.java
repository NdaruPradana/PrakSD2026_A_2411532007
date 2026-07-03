package pekan3_2411532007;

public class StackArray_2411532007 {
	static final int MAX_2007 = 1000;
	int top_2007;
	int a_2007[] = new int [MAX_2007];
	
	boolean isEmpty_2007() {return (top_2007 < 0);}
	
	StackArray_2411532007() {top_2007 = -1 ;}
	
	boolean push_2007(int x) {
		if ( top_2007 >= (MAX_2007 - 1)) {
			System.out.println("Stack Overflow");		
			return false;
		}
		else {
			a_2007[++top_2007] = x;
			System.out.println(x + "dimasukkan ke dalam stack");		
			return true;
		}
	}
	
	int pop_2007() {
		if ( top_2007 < 0) {
			System.out.println("Stack Overflow");		
			return 0;
		}
		else {
			int x_2007 = a_2007[top_2007--];
			return x_2007;
		}
	}
	
	int peek_2007() {
		if (top_2007 < 0) {
			System.out.println("Stack underflow");		
			return 0;
		} 
		else {
			int x_2007 = a_2007[top_2007];
			return x_2007;
		}
	}
	
	void print_2007() {
		for ( int i = top_2007; i > -1; i--) {
			System.out.print (" "+ a_2007[i]);
		}
	}
}
