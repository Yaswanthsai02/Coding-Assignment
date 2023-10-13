import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        boolean[] alphabetSeen = new boolean[26]; // 26 letters in the English alphabet

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                alphabetSeen[index] = true;
            }
        }

        for (boolean seen : alphabetSeen) {
            if (!seen) {
                return false; // If any letter is not seen, it's not a pangram
            }
        }

        return true; // All letters are seen, it's a pangram
    }
}

