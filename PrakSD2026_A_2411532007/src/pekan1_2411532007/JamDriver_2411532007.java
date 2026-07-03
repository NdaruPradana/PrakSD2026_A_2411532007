package pekan1_2411532007;

public class JamDriver_2411532007 {

	public static void main(String[] args) {
		Jam_2411532007 a = new Jam_2411532007(23, 59, 50);
		Jam_2411532007 b = new Jam_2411532007(0, 0, 15);
		
		System.out.println("a     =" + a);
		System.out.println("b     =" + b);
		System.out.println("a+b   =" + a.plus(b));
		System.out.println("next 20s =" + a.nextNSeconds(20));
		System.out.println("durasi (a,b) =" + Jam_2411532007.durasiDetik(a, b));
		System.out.println("a compare to b =" + a.compareTo(b));

	}

}
