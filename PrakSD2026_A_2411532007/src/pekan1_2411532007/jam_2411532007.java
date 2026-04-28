package pekan1_2411532007;


public final class jam_2411532007 {
	private int hh; // 0..23
	private int mm; // 0..59
	private int ss; // 0..59
	
	// --- validator ---
	public static boolean isValid(int h, int m,int s) {
		return(0 <= h && h <=23) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
	}
	
	// --- Konstruktor/Kreator ---
	public jam_2411532007(int h, int m, int s) {
		this.hh = h; this.mm = m; this.ss = s;
	}
	
	// --- Selektor ---
	public int getHour() { return hh; }
	public int getMinute() { return mm; }
	public int getSecond() { return ss; }
	
	// --- Mutator ---
	public void setHour(int h) {this.hh = h; }
	public void setMinute(int m) {this.mm = m; }
	public void setSecond(int s) {this.ss = s; }
	
	// --- konversi ---
	public int toSeconds( ) { return hh * 3600 + mm * 60 + ss; }
	public static jam_2411532007 fromSeconds(int total) {
		if (total < 0) throw new IllegalArgumentException("detik negatif");
		total %= 24 * 3600; // wrap 24 jam
		int h = total / 3600; total %= 3600;
		int m = total / 60; int s = total % 60;
		return new jam_2411532007(h, m, s);
	}
	
	// --- Relasional ---
	public int compareTo(jam_2411532007 other) { return Integer.compare(this.toSeconds(), other.toSeconds()); }
	public boolean equals(Object o) {
		if (!(o instanceof jam_2411532007 j)) return false;
		return hh == j.hh && mm== j.mm && ss == j.ss;
	}
	public int hashCode() { return java.util.Objects.hash(hh, mm, ss); }
	
	// --- Aritmatika ---
	public jam_2411532007 plus(jam_2411532007 other ) {return fromSeconds(this.toSeconds() + other.toSeconds());}
	public jam_2411532007 minus(jam_2411532007 other) {return fromSeconds(Math.floorMod(this.toSeconds() - other.toSeconds(), 24*3600)); }
	public jam_2411532007 nextSecond() { return fromSeconds(this.toSeconds() + 1);}
	public jam_2411532007 nextNSecond(int n) { return fromSeconds(this.toSeconds() + Math.max(0, n));}
	public jam_2411532007 prevSecond(int n ) { return fromSeconds(Math.floorMod(this.toSeconds() - Math.max(0, n), 24*3600)); }
	
	// --- Durasi (detik) -- bisa negatif jika this > other? sesuai spesifikasi durasi(JAw, JAkh)
	public static int durasiDetik(jam_2411532007 jaw, jam_2411532007 jakh) {return jakh.toSeconds() - jaw.toSeconds(); }
	//overriding ke string
	public String toString( ) {return String.format("%02d;%02d;%02d", hh, mm, ss);}
	
}











