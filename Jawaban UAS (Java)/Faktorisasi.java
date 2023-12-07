import java.util.Scanner;

public class Faktorisasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.print("Masukkan angka untuk difaktorkan: ");
            int angka = scanner.nextInt();

            if (angka <= 1) {
                System.out.println("Harap masukkan bilangan bulat positif yang lebih besar dari 1.");
            } else {
                System.out.print("Faktorisasi dari " + angka + ": ");
                cetakFaktorisasi(angka);
            }

            System.out.print("Apakah Anda ingin mencoba lagi? (ya/tidak): ");
            String pilihan = scanner.next();

            while (!pilihan.equalsIgnoreCase("ya") && !pilihan.equalsIgnoreCase("tidak")) {
                System.out.println("Pilihan tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
                System.out.print("Apakah Anda ingin mencoba lagi? (ya/tidak): ");
                pilihan = scanner.next();
            }

            if (pilihan.equalsIgnoreCase("tidak")) {
                lanjutkan = false;
                System.out.println("Terima kasih. Program Berhenti.");
            }
        }

        scanner.close();
    }

    private static void cetakFaktorisasi(int angka) {
        boolean pertama = true;
        for (int faktor = 2; faktor <= angka; faktor++) {
            while (angka % faktor == 0) {
                if (pertama) {
                    System.out.print(faktor);
                    pertama = false;
                } else {
                    System.out.print(" * " + faktor);
                }
                angka /= faktor;
            }
        }
        System.out.println();
    }
}
