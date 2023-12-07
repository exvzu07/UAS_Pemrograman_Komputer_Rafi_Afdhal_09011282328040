import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.print("Masukkan jumlah suku: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Silakan masukkan bilangan bulat positif.");
            } else {
                System.out.print("Seri Fibonacci: ");
                cetakSeriFibonacci(n);
            }

            boolean inputValid = false;
            while (!inputValid) {
                System.out.print("Apakah Anda ingin mencoba lagi? (ya/tidak): ");
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

    private static void cetakSeriFibonacci(int n) {
        int pertama = 1, kedua = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(pertama + " ");
            int berikutnya = pertama + kedua;
            pertama = kedua;
            kedua = berikutnya;
        }
        System.out.println();
    }
}
