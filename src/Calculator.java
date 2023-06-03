class Calculator {
    public static double calculate(int number1, int number2, int number3, char operator1, char operator2) {
        double result;

        if (operator2 == ' ') {
            result = SingleOperation(number1, number2, operator1);
        } else {
            if ((operator1 == '+' || operator1 == '-') && (operator2 == '*' || operator2 == '/')) {
                double halfResult = SingleOperation(number2, number3, operator2);
                result = SingleOperation(number1, halfResult, operator1);
            } else {
                double halfResult = SingleOperation(number1, number2, operator1);
                result = SingleOperation(halfResult, number3, operator2);
            }
        }

        return result;
    }

    private static double SingleOperation(double operand1, double operand2, char operator) {
        double result;

        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                throw new IllegalArgumentException("Недопустимый оператор");
        }

        return result;
    }
}