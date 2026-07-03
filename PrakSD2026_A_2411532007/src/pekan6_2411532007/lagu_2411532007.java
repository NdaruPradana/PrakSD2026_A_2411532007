package pekan6_2411532007;

public class lagu_2411532007 {
	String judul_2007;
	String penyanyi_2007;
	lagu_2411532007 next_2007;
	lagu_2411532007 prev_2007;
	
	 public lagu_2411532007(String j_2007, String p_2007) {
		 this.judul_2007 = j_2007;
		 this.penyanyi_2007 = p_2007;
		 this.next_2007 = null;
		 this.prev_2007 = null;
	 }
	 
	 public void setJ_2007(String j_2007) {
		 this.judul_2007 = j_2007;
	 }
	 
	 public void setP_2007(String p_2007) {
		 this.penyanyi_2007 = p_2007;
	 }
	 
	 public String getj_2007() {
		 return judul_2007;
	 }
	 
	 public String getp_2007() {
		 return penyanyi_2007;
	 }
}
