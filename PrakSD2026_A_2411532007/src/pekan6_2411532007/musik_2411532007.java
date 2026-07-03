package pekan6_2411532007;
import java.util.Scanner;

public class musik_2411532007 {
    
    public static lagu_2411532007 tambahLagu_2007(lagu_2411532007 l_2007, String j_2007, String p_2007) {
        lagu_2411532007 lg_2007 = new lagu_2411532007(j_2007, p_2007);
        
        if (l_2007 == null) return lg_2007;
        
        lagu_2411532007 curr_2007 = l_2007;
        while (curr_2007.next_2007 != null) {
            curr_2007 = curr_2007.next_2007;
        }
        
        curr_2007.next_2007 = lg_2007;
        lg_2007.prev_2007 = curr_2007;
        return l_2007;
    }

    public static lagu_2411532007 hapusLaguAwal_2007(lagu_2411532007 l_2007) {
        if (l_2007 == null) {
            return null;
        }
        
        lagu_2411532007 temp_2007 = l_2007;
        l_2007 = l_2007.next_2007;
        
        if (l_2007 != null) {
            l_2007.prev_2007 = null;
        }
        
        temp_2007.next_2007 = null;
        return l_2007;
    }

    public static void tampilMaju_2007(lagu_2411532007 l_2007) {
        if (l_2007 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        
        lagu_2411532007 curr_2007 = l_2007;
        while (curr_2007 != null) {
            System.out.print(curr_2007.getj_2007() + " " + curr_2007.getp_2007() + " <-> ");
            curr_2007 = curr_2007.next_2007;
        }
        System.out.println();
    }

    public static void tampilMundur_2007(lagu_2411532007 l_2007) {
        if (l_2007 == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        
        lagu_2411532007 curr_2007 = l_2007;
        while (curr_2007.next_2007 != null) {
            curr_2007 = curr_2007.next_2007;
        }
        
        while (curr_2007 != null) {
            System.out.print(curr_2007.getj_2007() + " " + curr_2007.getp_2007() + " <-> ");
            curr_2007 = curr_2007.prev_2007;
        }
        System.out.println();
    }

    public static boolean cariLagu_2007(lagu_2411532007 l_2007, String j_2007) {
        lagu_2411532007 curr_2007 = l_2007;
        while (curr_2007 != null) {
            if (curr_2007.judul_2007.equalsIgnoreCase(j_2007)) {
                System.out.println("Judul Lagu: " + curr_2007.getj_2007());
                System.out.println("Penyanyi  : " + curr_2007.getp_2007());
                return true;
            }
            curr_2007 = curr_2007.next_2007;
        }
        System.out.println("tidak ada lagu yang anda cari di playlist");
        return false;
    }

    public static void main(String[] args) {
        lagu_2411532007 item_2007 = null;
        Scanner input_2007 = new Scanner(System.in);
        int pilihan_2007 = 0;
        
        do {
            System.out.println("\n=== playlist Musik Nim:2411532007 ===");
            System.out.println("1. Tambah lagu");
            System.out.println("2. Hapus lagu awal");
            System.out.println("3. lihat playlist (maju)");
            System.out.println("4. lihat playlist (mundur)");
            System.out.println("5. Cari lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            
            if (input_2007.hasNextInt()) {
                pilihan_2007 = input_2007.nextInt();
                input_2007.nextLine();
            } else {
                System.out.println("Input tidak valid. Masukkan angka.");
                input_2007.nextLine();
                continue;
            }
            
            switch (pilihan_2007) {
                case 1:
                    System.out.print("Masukkan Judul lagu: ");
                    String j_2007 = input_2007.nextLine();
                    System.out.print("Masukkan Nama Penyanyi: ");
                    String p_2007 = input_2007.nextLine();
                    
                    item_2007 = tambahLagu_2007(item_2007, j_2007, p_2007);
                    System.out.println("lagu berhasil ditambahkan");
                    break;
                    
                case 2:
                    item_2007 = hapusLaguAwal_2007(item_2007);
                    break;
                    
                case 3:
                    tampilMaju_2007(item_2007);
                    break;
                    
                case 4:
                    tampilMundur_2007(item_2007);
                    break;
                    
                case 5:
                    System.out.print("Masukkan judul lagu yang dicari: ");
                    String i_2007 = input_2007.nextLine();
                    cariLagu_2007(item_2007, i_2007);
                    break;
                    
                case 6:
                    System.out.println("Program selesai");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            
        } while (pilihan_2007 != 6);
        
        input_2007.close();
    }
}