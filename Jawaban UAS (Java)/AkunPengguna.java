import java.util.Scanner;

public class AkunPengguna {
    private String namaPengguna;
    private String kataSandi;
    private boolean aktif;

    public AkunPengguna(String namaPengguna, String kataSandi) {
        this.namaPengguna = namaPengguna;
        this.kataSandi = kataSandi;
        this.aktif = false; // Akun tidak aktif secara default
    }

    public void aktifkanAkun() {
        aktif = true;
        System.out.println(namaPengguna + " Akun diaktifkan.");
    }

    public void nonaktifkanAkun() {
        aktif = false;
        System.out.println(namaPengguna + " Akun dinonaktifkan.");
    }

    public String getNamaPengguna() {
        return namaPengguna;
    }

    public boolean isAktif() {
        return aktif;
    }

    // Setter methods to update username and password
    public void setNamaPengguna(String namaPengguna) {
        this.namaPengguna = namaPengguna;
    }

    public void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama pengguna: ");
        String namaPengguna = scanner.nextLine();
        System.out.print("Masukkan kata sandi: ");
        String kataSandi = scanner.nextLine();

        AkunPengguna akun = new AkunPengguna(namaPengguna, kataSandi);

        // Modify username and password
        akun.setNamaPengguna("Rafi");
        akun.setKataSandi("Fiizura05");

        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.println(
                    "Status Akun untuk " + akun.getNamaPengguna() + ": " + (akun.isAktif() ? "Aktif" : "Nonaktif"));
            System.out.print("Pilih tindakan (aktif/nonaktif/selesai): ");
            String tindakan = scanner.nextLine();

            if (tindakan.equalsIgnoreCase("aktif")) {
                akun.aktifkanAkun();
            } else if (tindakan.equalsIgnoreCase("nonaktif")) {
                akun.nonaktifkanAkun();
            } else if (tindakan.equalsIgnoreCase("selesai")) {
                lanjutkan = false;
                System.out.println("Terima kasih. Program Berhenti.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
