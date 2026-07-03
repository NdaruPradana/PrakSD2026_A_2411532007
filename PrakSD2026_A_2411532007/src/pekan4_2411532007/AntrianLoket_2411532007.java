package pekan4_2411532007;
import java.util.Scanner;

public class AntrianLoket_2411532007 {
    
    int front_2007;
    int rear_2007;
    int max_2007;
    String queue_2007[];

    public AntrianLoket_2411532007(int kapasitas) {
        this.max_2007 = kapasitas;
        this.queue_2007 = new String[max_2007];
        this.front_2007 = 0;
        this.rear_2007 = -1;
    }


    public boolean isEmpty() {
        return rear_2007 < front_2007;
    }

    public boolean isFull() {
        return rear_2007 == max_2007 - 1;
    }

    public void enqueue(String data) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear_2007++;
        queue_2007[rear_2007] = data;
        System.out.println("Data berhasil ditambahkan ke antrian");
    }

    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println(queue_2007[front_2007] + " telah dilayani");
        front_2007++;
        
        if (isEmpty()) {
            front_2007 = 0;
            rear_2007 = -1;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Isi antrian:");
        for (int i = front_2007; i <= rear_2007; i++) {
            System.out.println((i - front_2007 + 1) + ". " + queue_2007[i]);
        }
    }

    public void reverse() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        int left = front_2007;
        int right = rear_2007;
        
        while (left < right) {
            String temp = queue_2007[left];
            queue_2007[left] = queue_2007[right];
            queue_2007[right] = temp;
            left++;
            right--;
        }
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianLoket_2411532007 antrian = new AntrianLoket_2411532007(10);
        
        int pilihan_2007 = 0;
        
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            if (scanner.hasNextInt()) {
                pilihan_2007 = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.nextLine();
                continue;
            }

            switch (pilihan_2007) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    antrian.enqueue(nama);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.display();
                    break;
                case 4:
                    antrian.reverse();
                    break;
                case 5:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan_2007 != 5);
        
        scanner.close();
    }
}