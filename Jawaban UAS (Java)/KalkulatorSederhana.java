import java.util.Scanner;

public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.print("Masukkan angka pertama: ");
            double num1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();

            System.out.print("Pilih operasi (+, -, *, /): ");
            char operasi = scanner.next().charAt(0);

            try {
                double hasil = lakukanOperasi(num1, num2, operasi);
                System.out.println("Hasil: " + hasil);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }

            boolean inputValid = false;
            while (!inputValid) {
                System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
                String pilihan = scanner.next();
                if (pilihan.equalsIgnoreCase("ya")) {
                    inputValid = true;
                } else if (pilihan.equalsIgnoreCase("tidak")) {
                    lanjutkan = false;
                    inputValid = true;
                    System.out.println("Terima kasih. Program Berhenti.");
                } else {
                    System.out.println("Pilihan tidak valid. Silakan masukkan 'ya' atau 'tidak'.");
                }
            }
        }

        scanner.close();
    }

    private static double lakukanOperasi(double angka1, double angka2, char operasi) {
        switch (operasi) {
            case '+':
                return angka1 + angka2;
            case '-':
                return angka1 - angka2;
            case '*':
                return angka1 * angka2;
            case '/':
                if (angka2 == 0) {
                    throw new IllegalArgumentException("Pembagian oleh nol tidak diizinkan.");
                }
                return angka1 / angka2;
            default:
                throw new IllegalArgumentException("Operasi tidak valid. Silakan pilih +, -, *, atau /.");
        }
    }
}
