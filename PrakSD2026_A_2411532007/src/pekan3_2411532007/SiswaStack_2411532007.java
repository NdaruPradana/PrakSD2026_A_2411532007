package pekan3_2411532007;

import java.util.ArrayList;

class Siswa_2007 {
	String nama_2007;
	int nim_2007;
	
	public Siswa_2007(String nama_2007, int nim_2007) {
		this.nama_2007 = nama_2007;
		this.nim_2007 = nim_2007;
	}
	
	public String toString() {
		return "Nim: "+ nim_2007 + ", Nama: " + nama_2007;
	}
}
public class SiswaStack_2411532007 {
	private ArrayList<Siswa_2007> stack_2007;
	
	public SiswaStack_2411532007() {
		stack_2007 = new ArrayList<>();
	}
	
	public void push(Siswa_2007 mhs_2007) {
		stack_2007.add(mhs_2007);
	}
	
	public Siswa_2007 pop() {
		if (!isEmpty_2007()) {
			return stack_2007.remove(stack_2007.size() - 1);
		}
		return null;
		
	}
	
	public Siswa_2007 peek() {
		if (!isEmpty_2007()) {
			return stack_2007.get(stack_2007.size() - 1);
		}
		return null;
	}
	
	public boolean isEmpty_2007() {
		return stack_2007.isEmpty();
	}
	
	public void tampilkanSiswa_2007() {
		for (int i =stack_2007.size() - 1; i >= 0; i--) {
			System.out.println(stack_2007.get(i));
		}
	}
	public static void main (String[] args) {
		SiswaStack_2411532007 studentStack_2007 = new SiswaStack_2411532007();
		
		Siswa_2007 mhs1_2007 = new Siswa_2007("Ali", 1);
		Siswa_2007 mhs2_2007 = new Siswa_2007("Boby", 2);
		Siswa_2007 mhs3_2007 = new Siswa_2007("Charles", 3);
		
		studentStack_2007.push(mhs1_2007);
		studentStack_2007.push(mhs2_2007);
		studentStack_2007.push(mhs3_2007);
		
		System.out.println("Siswa di dalam stack:");
		studentStack_2007.tampilkanSiswa_2007();
		
		System.out.println("siswa teratas " +studentStack_2007.peek());
		System.out.println("mengeluarkan siswa teratas dari stack: " + studentStack_2007.pop());
		System.out.println("daftar siswa setelah di pop :");
		studentStack_2007.tampilkanSiswa_2007();
		
	}
}
