package pekan2_2411532007;

public class Mahasiswa_2411532007 {
	String nama;
	String nim;
	String prodi;
	
	Mahasiswa_2411532007(String nama, String nim, String prodi){
		this.nama = nama;
		this.nim = nim;
		this.prodi = prodi;
	}
	
	public String toString() {
		return "NIM:" + nim + ", Nama: " + nama + ", Prodi :" + prodi;
	}
}
