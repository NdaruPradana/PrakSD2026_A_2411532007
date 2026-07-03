package pekan2_2411532007;
import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2411532007 {
	private ArrayList<Musik_2411532007> playlist_2007 = new ArrayList<>();
	private Scanner input = new Scanner(System.in);
	
	public void tambahLagu_2007(Musik_2411532007 lagu) {
        playlist_2007.add(lagu);
    }
	
	public void lihatPlaylist_2007() {
        if (playlist_2007.isEmpty()) {
            System.out.println("\nPlaylist kosong. Belum ada lagu yang ditambahkan.\n");
            return;
        }
        System.out.println("\n=== Daftar Playlist ===");
        for (int i = 0; i < playlist_2007.size(); i++) {
            System.out.println((i + 1) + ". " + playlist_2007.get(i));
        }
        System.out.println("=======================\n");
    }
	
	public void hapusLagu_2007(int index) {
        if (playlist_2007.isEmpty()) {
            System.out.println("\nTidak ada lagu yang ingin dihapus.\n");
            return;
        }
        
        if (index < 1 || index > playlist_2007.size()) {
            System.out.println("\nIndex tidak valid. Silakan pilih antara 1 dan " + playlist_2007.size() + ".\n");
            return;
        }
        Musik_2411532007 dihapus = playlist_2007.remove(index - 1);
        System.out.println("\nLagu '" + dihapus.getJudulLagu_2007() + "' berhasil dihapus.\n");
    }
	
	public int cekKapasitas_2007() {
        return playlist_2007.size();
    }
	
	public void tampilkanMenu_2007() {
        System.out.println("=== Playlist Manager NIM: 2411532007 ===\n");
        System.out.println("1. Tambah Lagu");
        System.out.println("2. Lihat Playlist");
        System.out.println("3. Hapus Lagu");
        System.out.println("4. Cek Kapasitas Playlist");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");
    }
	
	public void jalankan_2007() {
        boolean berjalan_2007 = true;
        
        while (berjalan_2007) {
            tampilkanMenu_2007();
            int pilihan_2007 = input.nextInt();
            input.nextLine();
            
            switch (pilihan_2007) {
                case 1:
                    System.out.print("\nMasukkan Judul Lagu: ");
                    String judul = input.nextLine();
                    
                    System.out.print("Masukkan Nama Penyanyi: ");
                    String penyanyi = input.nextLine();
                    
                    System.out.print("Masukkan Durasi (detik): ");
                    int durasi = input.nextInt();
                    input.nextLine();
                    
                    Musik_2411532007 laguBaru = new Musik_2411532007(judul, penyanyi, durasi);
                    tambahLagu_2007(laguBaru);
                    System.out.println("\nLagu berhasil ditambahkan!\n");
                    break;
                    
                case 2:
                    lihatPlaylist_2007();
                    break;
                    
                case 3:
                    lihatPlaylist_2007();
                    System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
                    int idx = input.nextInt();
                    input.nextLine();
                    hapusLagu_2007(idx);
                    break;
                    
                case 4:
                    System.out.println("\nKapasitas Playlist saat ini: " + cekKapasitas_2007() + " lagu.\n");
                    break;
                    
                case 5:
                    System.out.println("\nTerima kasih telah menggunakan Playlist Manager!");
                    berjalan_2007 = false;
                    break;
                    
                default:
                    System.out.println("\nPilihan tidak valid. Silakan coba lagi.\n");
                    break;
            }
        }
        input.close();
    }
	
	public static void main(String[] args) {
        Playlist_2411532007 lagu_2007 = new Playlist_2411532007();
        lagu_2007.jalankan_2007();
    }
	
}
