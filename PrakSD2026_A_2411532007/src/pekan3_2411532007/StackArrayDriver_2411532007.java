package pekan3_2411532007;

public class StackArrayDriver_2411532007 {
	public static void main (String []args) {
		StackArray_2411532007 s_2007 = new StackArray_2411532007();
		
		s_2007.push_2007(10);
		s_2007.push_2007(20);
		s_2007.push_2007(30);
		System.out.println(s_2007.pop_2007() + "dikeluarkan dari stack ");
		System.out.println("Elemen teratas adalah " + s_2007.peek_2007());
		System.out.print("Element pada stack");
		s_2007.print_2007();
	}
}
