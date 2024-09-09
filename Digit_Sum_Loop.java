import java.util.Scanner;

public class Digit_Sum_Loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (or 'exit' to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (ValidInteger(input)) {
                int number = Integer.parseInt(input);
                int result = SingleDigit(number);
                System.out.println("Single digit result: " + result);
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static boolean ValidInteger(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    private static int SingleDigit(int number) {
        while (number >= 10) {
            number = sumOfDigits(number);
            System.out.println("Sum of given input is :" + number);
        }
        return number;
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

