package pekan3_2411532007;

public class stackArrayDriver_2411532007 {
	public static void main(String[] args) {
		stackArray_2411532007 s = new stackArray_2411532007();
		s.push_2007(10);
		s.push_2007(20);
		s.push_2007(30);
		System.out.println(s.pop_2007() + " dikeluarkan dari stack");
		System.out.println("Elemen teratas adalah :" +s.peek_2007());
		System.out.println("Elemen pada stack :");
		s.print_2007();
	}
}
