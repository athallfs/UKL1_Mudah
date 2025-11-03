import java.util.Scanner;

public class UKL1_Mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Perhiutungan Biaya Ekspedisi
        System.out.println("---PROGRAM PERHITUNGAN BIAYA EKSPEDISI ---");

        System.out.print("Masukkan Berat Paket (Kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Jarak Tempuh (Km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan Panjang Paket (Cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan Lebar Paket (Cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan Tinggi Paket (Cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        double biayaPerKg;

        // Menentukan biaya per Kg berdasarkan jarak
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biaya = berat * biayaPerKg;


        // Tambahan biaya volume
        if (volume > 100) {
            biaya += 50000;
        }

        System.out.println("\n--- HASIL PERHITUNGAN ---");
        System.out.println("Volume paket : " + volume + " Cm^3");
        System.out.println("Biaya kirim  : Rp " + biaya);

        input.close();

    }
}
    


   