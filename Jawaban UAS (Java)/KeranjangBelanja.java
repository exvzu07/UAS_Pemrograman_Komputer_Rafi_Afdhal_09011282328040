import java.util.Scanner;

public class KeranjangBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutBelanja = true;

        while (lanjutBelanja) {
            System.out.print("Masukkan harga per item: ");
            double harga = scanner.nextDouble();

            System.out.print("Masukkan jumlah: ");
            int jumlah = scanner.nextInt();

            double hargaTotal = hitungHargaTotal(harga, jumlah);
            System.out.printf("Harga Total setelah diskon: %.2f\n", hargaTotal);

            boolean inputValid = false;
            while (!inputValid) {
                System.out.print("Apakah Anda ingin melanjutkan belanja? (ya/tidak): ");
                String pilihan = scanner.next();
                if (pilihan.equalsIgnoreCase("ya")) {
                    inputValid = true;
                } else if (pilihan.equalsIgnoreCase("tidak")) {
                    lanjutBelanja = false;
                    inputValid = true;
                    System.out.println("Terima kasih. Program Berhenti.");
                } else {
                    System.out.println("Pilihan tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
                }
            }
        }

        scanner.close();
    }

    private static double hitungHargaTotal(double harga, int jumlah) {
        double tingkatDiskon;

        if (jumlah < 5) {
            tingkatDiskon = 0;
        } else if (jumlah <= 10) {
            tingkatDiskon = 0.05; // Diskon 5%
        } else if (jumlah <= 20) {
            tingkatDiskon = 0.10; // Diskon 10%
        } else {
            tingkatDiskon = 0.20; // Diskon 20%
        }

        return harga * jumlah * (1 - tingkatDiskon);
    }
}
