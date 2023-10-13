import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert input to uppercase for case insensitivity
        scanner.close();

        int result = romanToInteger(romanNumeral);
        if (result == -1) {
            System.out.println("Invalid Roman numeral entered.");
        } else {
            System.out.println("Integer value: " + result);
        }
    }

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int value1 = romanCharToInt(s.charAt(i));

            if (i + 1 < s.length()) {
                int value2 = romanCharToInt(s.charAt(i + 1));

                if (value1 >= value2) {
                    result += value1;
                } else {
                    result += value2 - value1;
                    i++;
                }
            } else {
                result += value1;
            }
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1; // Invalid Roman numeral character
        }
    }
}


       
