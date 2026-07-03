package pekan2_2411532007;
import java.util.ArrayList;

public class DaftarKata_2411532007 {
	private final ArrayList<String> data;
	
	public DaftarKata_2411532007(){
		this.data = new ArrayList<String>();
	}
	
	public void tambah_2411532007(String elemen) {
		data.add(elemen);
	}
	
	public void tambahPada_2411532007(int index, String elemen) {
		data.add(index, elemen);
	}
	
	public void ubahElemen_2411532007(int index, String nilaiBaru) {
		data.set(index, nilaiBaru);
	}
	
	public String hapusElemen_2411532007(int index) {
		return data.remove(index);
	}
	
	public void iterasiCetak_2411532007() {
		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i) + " ");
		}
	}
	
	public String get_2411532007(int index) {
		return data.get(index);
	}
	
	public String toString() {
		return data.toString();
	}
}
