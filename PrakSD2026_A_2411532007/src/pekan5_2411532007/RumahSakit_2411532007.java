package pekan5_2411532007;

import java.util.Scanner;


public class RumahSakit_2411532007 {
	private static int count_2007 = 0;
	
	public static Pasien_2411532007 DaftarkanPasien_2007(Pasien_2411532007 item_2007, String n_2007, String k_2007 ) {
		count_2007++;
		Pasien_2411532007  node_2007 = new Pasien_2411532007(count_2007, n_2007, k_2007 );
		
		if (item_2007 == null ) {
			return node_2007;
		}
		
		Pasien_2411532007 L_2007 = item_2007;
		
		while (L_2007.next_2007 != null) {
			L_2007 = L_2007.next_2007;
		}
		
		L_2007.next_2007 = node_2007;
		return item_2007;
	}
	
	public static Pasien_2411532007 PanggilPasien_2007(Pasien_2411532007 item_2007) {
		if (item_2007 == null ) {
			return null;
		}
		
		System.out.println("Dipanggil Pasien");
		System.out.println("No Antrian: " + item_2007.getA_2007());
		System.out.println("Nama: " + item_2007.getN_2007());
		System.out.println("Keluhan/Penyakit: " + item_2007.getK_2007());
		System.out.println("");
		
		item_2007 = item_2007.next_2007;
		return item_2007;
	}
	
	public static void TampilkanAntrian_2007(Pasien_2411532007 item_2007) {
		Pasien_2411532007 c_2007 = item_2007;
		int posisi_2007 = 1;
		
		while (c_2007 != null) {
			System.out.println("Posisi " + posisi_2007);
			System.out.println("No Antrian: " + c_2007.getA_2007());
			System.out.println("Nama: " + c_2007.getN_2007());
			System.out.println("Keluhan/Penyakit: " + c_2007.getK_2007());
			System.out.println("");
			c_2007 = c_2007.next_2007;
			posisi_2007++;
			
		}
	}
	
	public static boolean CariPasien_2007(Pasien_2411532007 item_2007, String n_2007) {
		Pasien_2411532007 c_2007 = item_2007;
		while (c_2007 != null) {
			if (c_2007.nama_2007.equalsIgnoreCase(n_2007)) {
				System.out.println("No Antrian: " + c_2007.getA_2007());
				System.out.println("Nama: " + c_2007.getN_2007());
				System.out.println("Keluhan/Penyakit: " + c_2007.getK_2007());
				System.out.println("");
				return true;
			}
			c_2007 = c_2007.next_2007;
		}
		System.out.println("tidak ada pasien dengan nama yang kamu inputkan");
		return false;
	}
	
	public static void CekStatusAntrian_2007(Pasien_2411532007 item_2007) {
		if ( item_2007 == null) {
			System.out.println("Antrian Kosong");
			return;
		}
		
		int ttl_2007 = 0;
		Pasien_2411532007 c_2007 = item_2007;
		while (c_2007 != null) {
			ttl_2007++;
			c_2007 = c_2007.next_2007;
		}
		
		System.out.println("Jumlah Pasien: " + ttl_2007);
		System.out.println("Pasien Terdepan");
		System.out.println("No Antrian: " + item_2007.getA_2007());
		System.out.println("Nama: " + item_2007.getN_2007());
		System.out.println("Keluhan/Penyakit: " + item_2007.getK_2007());
		System.out.println("");
	}
	
	
	
	 public static void main(String[] args) {
	        Scanner scanner_2007 = new Scanner(System.in);
	        Pasien_2411532007 o_2007 = null;
	        
	        int pilihan_2007 = 0;
	        
	        do {
	            System.out.println("\n=== Antrian Rumah Sakit Nim:2411532007 ===");
	            System.out.println("1. Daftarkan Pasien");
	            System.out.println("2. Panggil Pasien");
	            System.out.println("3. Tampilkan Antrian");
	            System.out.println("4. Cari Pasien");
	            System.out.println("5. Cek Status Antrian");
	            System.out.println("6. Keluar");
	            System.out.print("Pilihan: ");
	            
	            if (scanner_2007.hasNextInt()) {
	                pilihan_2007 = scanner_2007.nextInt();
	                scanner_2007.nextLine();
	            } else {
	                System.out.println("Input tidak valid. Masukkan angka.");
	                scanner_2007.nextLine();
	                continue;
	            }

	            switch (pilihan_2007) {
	                case 1:
	                    System.out.print("Masukkan nama pasien: ");
	                    String nama_2007 = scanner_2007.nextLine();
	                    System.out.print("Masukkan keluhan: ");
	                    String penyakit_2007 = scanner_2007.nextLine();
	                    
	                    o_2007 = DaftarkanPasien_2007(o_2007, nama_2007, penyakit_2007);
	                    System.out.print("Pasien berhasil didaftarkan dengan no. antrian: " + count_2007 + "\n");
//	                    
	                    break;
	                    
	                case 2:
	                    o_2007 = PanggilPasien_2007(o_2007);
	                    break;
	                    
	                case 3:
	                	 	TampilkanAntrian_2007(o_2007);
	                    break;
	                    
	                case 4:
	                    System.out.print("Masukkan nama pasien yang dicari: ");
	                    String n_2007 = scanner_2007.nextLine();
	                    CariPasien_2007(o_2007, n_2007);
	                    break;
	                    
	                case 5:
	                		CekStatusAntrian_2007(o_2007);
	                		break;
	                		
	                case 6:
	                    System.out.println("Program selesai");
	                    break;
	                    
	                default:
	                    System.out.println("Pilihan tidak valid.");
	                    break;
	            }
	        } while (pilihan_2007 != 6);
	        
	        scanner_2007.close();
	    }
}
