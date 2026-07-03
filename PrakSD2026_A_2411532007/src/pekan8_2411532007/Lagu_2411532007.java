package pekan8_2411532007;

public class Lagu_2411532007 {
	private String judul_2007;
	private String penyanyi_2007;
	private int durasi_2007;
	
	public Lagu_2411532007(String j_2007, String p_2007, int d_2007 ) {
		this.judul_2007 = j_2007;
		this.penyanyi_2007 = p_2007;
		this.durasi_2007 = d_2007;
	}
	
    public String getJ_2007() {return judul_2007;}
	public String getP_2007() {return penyanyi_2007;}
	public int getD_2007() {return durasi_2007;}
	
	public void setJ_2007(String j_2007) {
		this.judul_2007 = j_2007;
	}
	
	public void setP_2007(String p_2007) {
		this.penyanyi_2007 = p_2007;
	}
	
	public void setD_2007(int d_2007) {
		this.durasi_2007 = d_2007;
	}
	
	public String toString_2007() {
		return judul_2007 + " - " + penyanyi_2007 + " (" + durasi_2007 + " detik)";
	}
	

}
