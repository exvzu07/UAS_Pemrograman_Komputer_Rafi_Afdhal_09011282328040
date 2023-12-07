import java.util.Scanner;

class Buku {
    String judul;
    String penulis;
    int tahunTerbit;
    boolean dipinjam;

    Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    void meminjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku " + judul + " berhasil dipinjam.");
        } else {
            System.out.println("Buku " + judul + " sudah dipinjam.");
        }
    }

    void kembalikanBuku() {
        if (dipinjam) {
            dipinjam = false;
            System.out.println("Buku " + judul + " berhasil dikembalikan.");
        } else {
            System.out.println("Buku " + judul + " tidak sedang dipinjam.");
        }
    }

    void tampilInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Dipinjam: " + dipinjam);
        System.out.println();
    }
}

public class PerpustakaanPusat {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Love Live! Sunshine!! Maru's 4-Koma", "Sakuraku Ono", 2020);
        Buku buku2 = new Buku("If You Know What Happened In MCI", "VJ Heru & Tim MRCI", 2016);
        Buku buku3 = new Buku(
                "Ignite Millenial Leadership : 6  Langkah Untuk Memaksimalkan Potensi Pemimpin Generasi Berikutnya",
                "Andrew Senduk", 2018);
        Buku buku4 = new Buku("SABAR GORKY Satu Kaki Daki Gunung Tertinggi", "Dodi Mawardi", 2014);

        buku1.tampilInfoBuku();
        buku2.tampilInfoBuku();
        buku3.tampilInfoBuku();
        buku4.tampilInfoBuku();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingin meminjam buku? (Y/N)");
        String pilihan = scanner.nextLine();
        if (pilihan.equalsIgnoreCase("Y")) {
            System.out.println("Pilih buku yang ingin dipinjam (1-4): ");
            int bukuPilihan = scanner.nextInt();
            scanner.nextLine();
            if (bukuPilihan == 1) {
                buku1.meminjamBuku();
            } else if (bukuPilihan == 2) {
                buku2.meminjamBuku();
            } else if (bukuPilihan == 3) {
                buku3.meminjamBuku();
            } else if (bukuPilihan == 4) {
                buku4.meminjamBuku();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        buku1.tampilInfoBuku();
        buku2.tampilInfoBuku();
        buku3.tampilInfoBuku();
        buku4.tampilInfoBuku();

        System.out.println("Ingin mengembalikan buku? (Y/N)");
        String pilihan2 = scanner.nextLine();
        if (pilihan2.equalsIgnoreCase("Y")) {
            System.out.println("Pilih buku yang ingin Dikembalikan (1-4): ");
            int bukuPilihan = scanner.nextInt();
            scanner.nextLine();
            if (bukuPilihan == 1) {
                buku1.kembalikanBuku();
            } else if (bukuPilihan == 2) {
                buku2.kembalikanBuku();
            } else if (bukuPilihan == 3) {
                buku3.kembalikanBuku();
            } else if (bukuPilihan == 4) {
                buku4.kembalikanBuku();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        buku1.tampilInfoBuku();
        buku2.tampilInfoBuku();
        buku3.tampilInfoBuku();
        buku4.tampilInfoBuku();
    }
}
