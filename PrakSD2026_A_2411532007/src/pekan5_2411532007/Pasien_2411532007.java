package pekan5_2411532007;

public class Pasien_2411532007 {
	String nama_2007;
	String keluhan_2007;
	int Antrian_2007;
	
	Pasien_2411532007 next_2007;
	
	public Pasien_2411532007(int a, String n, String k) {
		this.Antrian_2007 = a;
		this.nama_2007 = n;
		this.keluhan_2007 = k;
		this.next_2007 = null;
	}
	
	public void setN_2007( String n){
		this.nama_2007 = n;
	}
	
	public void setK_2007( String k){
		this.keluhan_2007 = k;
	}
	
	public void setA_2007( int a){
		this.Antrian_2007 = a;
	}
	
	public String getN_2007() {
		return nama_2007;
	}
	
	public String getK_2007() {
		return keluhan_2007;
	}
	
	public int getA_2007() {
		return Antrian_2007;
	}
	
}
