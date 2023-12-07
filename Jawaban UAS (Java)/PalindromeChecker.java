import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Masukkan Kata atau kalimat: ");
            String phrase = scanner.nextLine();

            boolean isPalindrome = checkPalindrome(phrase);
            String result = isPalindrome ? "Benar" : "Salah";
            System.out.println("\"" + phrase + "\" adalah palindrom? " + result);

            System.out.print("Apakah Anda ingin mencoba lagi? (ya/tidak): ");
            String choice = scanner.nextLine();

            while (!choice.equalsIgnoreCase("ya") && !choice.equalsIgnoreCase("tidak")) {
                System.out.print("Masukkan yang valid (ya/tidak): ");
                choice = scanner.nextLine();
            }

            if (choice.equalsIgnoreCase("tidak")) {
                continueProgram = false; // Menghentikan program jika pengguna tidak ingin mencoba lagi.
                System.out.println("Terima Kasih, Program berhenti.");
            }
        }

        scanner.close();
    }

    private static boolean checkPalindrome(String text) {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
