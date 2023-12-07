import java.util.Scanner;
import java.util.Stack;

public class PemeriksaBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutkan = true;

        while (lanjutkan) {
            System.out.print("Masukkan ekspresi: ");
            String ekspresi = scanner.nextLine();

            boolean seimbang = seimbang(ekspresi);
            String hasil = seimbang ? "Benar" : "Salah";
            System.out.println("Ekspresi seimbang? " + hasil);

            String pilihan;
            do {
                System.out.print("Apakah Anda ingin memeriksa ekspresi lainnya? (ya/tidak): ");
                pilihan = scanner.nextLine();
                if (!pilihan.equalsIgnoreCase("ya") && !pilihan.equalsIgnoreCase("tidak")) {
                    System.out.println("Pilihan Tidak Valid. Silakan masukkan \"ya\" atau \"tidak\".");
                }
            } while (!pilihan.equalsIgnoreCase("ya") && !pilihan.equalsIgnoreCase("tidak"));

            if (pilihan.equalsIgnoreCase("tidak")) {
                lanjutkan = false;
                System.out.println("Terima kasih. Program Berhenti.");
            }
        }

        scanner.close();
    }

    private static boolean seimbang(String ekspresi) {
        Stack<Character> stack = new Stack<>();
        for (char ch : ekspresi.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty() || !pasanganCocok(stack.pop(), ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean pasanganCocok(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
                (buka == '[' && tutup == ']') ||
                (buka == '{' && tutup == '}');
    }
}
