package pekan2_2411532007;

public class DaftarKataDriver_2411532007 {
	public static void main ( String [] args) {
		DaftarKata_2411532007 al = new DaftarKata_2411532007();
		
		al.tambah_2411532007("kami");
		al.tambah_2411532007("Informatika");
		
		al.tambahPada_2411532007(1, "Mahasiswa");
		
		System.out.println("Awal    :" + al);
		
		al.ubahElemen_2411532007(1, "Departemen");
		System.out.println("Setelah Ubah:" + al);
		
		String terhapus = al.hapusElemen_2411532007(0);
		System.out.println("Terhapus   :" + terhapus);
		System.out.println("Setelah Hapus   :" + al);
		
		System.out.println("Iterasi");
		al.iterasiCetak_2411532007();
		System.out.println("");
	}
}
