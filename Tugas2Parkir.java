import java.util.Scanner;

public class Tugas2Parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan durasi parkir dalam jam (0 untuk selesai): ");
            int durasiParkir = scanner.nextInt();

            if (durasiParkir == 0) {
                break;
            }

            
            if (durasiParkir < 0) {
                System.out.println("Durasi parkir tidak valid. Silakan masukkan kembali.");
                continue; 
            }

            double biaya;
            
            if (durasiParkir > 5) {
                biaya = 12500; 
            } else {
                System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor): ");
                int jenisKendaraan = scanner.nextInt();
                
                if (jenisKendaraan == 1) {
                    biaya = durasiParkir * 3000; 
                } else if (jenisKendaraan == 2) {
                    biaya = durasiParkir * 2000; 
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Silakan masukkan kembali.");
                    continue;
                }
            }

            totalPembayaran += biaya;
            System.out.println("Biaya parkir untuk " + durasiParkir + " jam: Rp " + biaya);
        }

        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
        
        scanner.close();
    }
}
