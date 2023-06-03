import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.nextLine();
            String[] elements = input.split(" ");

            if (elements.length != 3 && elements.length != 5) {
                throw new IllegalArgumentException("Неверный формат ввода");
            }

            int number1 = Verification.checkNumber(elements[0]);
            int number2 = Verification.checkNumber(elements[2]);
            int number3 = elements.length == 5 ? Verification.checkNumber(elements[4]) : 0;

            char operator1 = elements[1].charAt(0);
            char operator2 = elements.length == 5 ? elements[3].charAt(0) : ' ';

            double result = Calculator.calculate(number1, number2, number3, operator1, operator2);
            System.out.println(formatResult(result));
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static String formatResult(double result) {
        if (result % 1 == 0) {
            return String.format("%.0f", result);
        } else {
            return String.format("%.2f", result);
        }
    }
}