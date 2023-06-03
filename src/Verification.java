class Verification {
    public static int checkNumber(String elements) {
        int number;
        try {
            number = Integer.parseInt(elements);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат числа");
        }

        if (number < 1 || number > 10) {
            throw new IllegalArgumentException("Число должно быть от 1 до 10");
        }

        return number;
    }
}