import java.util.Scanner;

public class Tugas1TiketBioskop09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTiket = 0;
        double totalHarga = 0;
        final int HARGA_TIKET = 50000;

        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            int jumlahTiket = scanner.nextInt();

            
            if (jumlahTiket == 0) {
                break;
            }

            
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan kembali.");
                continue;
            }

            
            double hargaTiket = HARGA_TIKET * jumlahTiket;

            if (jumlahTiket > 10) {
                hargaTiket *= 0.85; 
            } else if (jumlahTiket > 4) {
                hargaTiket *= 0.90;
            }

            totalTiket += jumlahTiket;
            totalHarga += hargaTiket;

            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + hargaTiket);
        }

        System.out.println("Total tiket yang terjual: " + totalTiket);
        System.out.println("Total harga penjualan tiket: Rp " + totalHarga);
        
        scanner.close();
    }
}
