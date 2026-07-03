package pekan3_2411532007;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2411532007 {
	 private Stack<Website_2411532007> history_2007 = new Stack<>();
	 private Scanner input = new Scanner(System.in);
	 
	 public void KunjungiWeb_2007(Website_2411532007 w) {
	     history_2007.push(w);
	 }
	 
	 public void back_2007() {
	     if (history_2007.isEmpty()) {
	        System.out.println("\nStack kosong. Tidak ada halaman untuk dikembalikan.\n");
	        return;
	     }
	     
	     if (history_2007.size() == 1) {
	            System.out.println("\nTidak ada halaman sebelumnya. Anda sudah di halaman pertama.\n");
	            return;
	     }
	     
	     history_2007.pop();
	     
	     Website_2411532007 a_2007 = history_2007.peek();
	     
	     System.out.println("\nKembali ke page: " + a_2007.getJ_2007() + "\n");
	 }
	 
	 public void LihatHalamanSaatIni_2007() {
	      if (history_2007.isEmpty()) {
	          System.out.println("\nTidak ada halaman yang sedang dibuka.\n");
	          return;
	       }
	      
	       Website_2411532007 b_2007 = history_2007.peek();
	       System.out.println("\nHalaman saat ini: " + b_2007.getJ_2007());
	       System.out.println("URL: " + b_2007.getUrl_2007() + "\n");
	 }
	 
	 public void tampilkanHistory_2007() {
	        System.out.println("\n=== Riwayat Penjelajahan (History) ===");
	        
	        if (history_2007.isEmpty()) {
	            System.out.println("History kosong. Belum ada website yang dikunjungi.\n");
	            return;
	        }
	        
	        System.out.println("Total halaman dalam history: " + history_2007.size());
	        System.out.println("-------------------------------------------");
	        
	       
	        int no = 1;
	    
	        for (Website_2411532007 website : history_2007) {
	            System.out.println(no + ". " + website.getJ_2007());
	            System.out.println("   URL: " + website.getUrl_2007());
	            System.out.println();
	            no++;
	        }
	        
	        System.out.println("-------------------------------------------\n");
	    }
	 
	 
	 
	 public void tampilkanMenu() {
	        System.out.println("=== Browser History NIM: 2411532007 ===\n");
	        System.out.println("1. Kunjungi Website (Push)");
	        System.out.println("2. Tombol Back (Pop)");
	        System.out.println("3. Lihat Halaman Aktif (Peek)");
	        System.out.println("4. Tampilkan History");
	        System.out.println("5. Keluar");
	        System.out.print("Pilihan: ");
	 }
	 
	 
	 public void jalankan() {
	        boolean berjalan_2007 = true;
	        
	        while (berjalan_2007) {
	            tampilkanMenu();
	            int pilihan_2007 = input.nextInt();
	            input.nextLine();
	            
	            switch (pilihan_2007) {
	                case 1:
	                    System.out.print("\nMasukkan Judul: ");
	                    String judul = input.nextLine();
	                    
	                    System.out.print("Masukkan URL: ");
	                    String url = input.nextLine();
	                    
	                    Website_2411532007 website = new Website_2411532007(judul, url);
	                    KunjungiWeb_2007(website);
	                    
	                    System.out.println("\nBerhasil mengunjungi halaman!\n");
	                    break;
	                    
	                case 2:
	                    back_2007();
	                    break;
	                    
	                case 3:
	                    LihatHalamanSaatIni_2007();
	                    break;
	                    
	                case 4:
	                    tampilkanHistory_2007();
	                    break;
	                    
	                case 5:
	                    System.out.println("\nTerima kasih telah menggunakan browser ini!");
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
	        Browser_2411532007 browser_2007 = new Browser_2411532007();
	        browser_2007.jalankan();
	    }
	 
}
