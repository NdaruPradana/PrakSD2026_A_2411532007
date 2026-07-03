package pekan2_2411532007;

public class Musik_2411532007 {
	 private String judulLagu_2007;
	 private String penyanyi_2007;
	 private int durasi_2007;
	 
	 public Musik_2411532007(String judul, String penyanyi, int durasi) {
	        this.judulLagu_2007 = judul;
	        this.penyanyi_2007 = penyanyi;
	        this.durasi_2007 = durasi;
	  }
	 
	 public void setJudulLagu_2007(String j) { this.judulLagu_2007 = j; }
	 public void setPenyanyi_2007(String p) { this.penyanyi_2007 = p; }
	 public void setDurasi_2007(int d) { this.durasi_2007 = d; }
	 
	 public String getJudulLagu_2007() { return judulLagu_2007; }
	 public String getPenyanyi_2007() { return penyanyi_2007; }
	 public int getDurasi_2007() { return durasi_2007; }
	 
	 public String toString() {
	        return judulLagu_2007 + " - " + penyanyi_2007 + " (" + durasi_2007 + " detik)";
	   }
}
