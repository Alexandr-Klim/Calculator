import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();
        expression = expression.replace(" ", "");
        String[] result = null;
        char operator = 0;

        if (expression.contains("+")) {
            result = expression.split("\\+");
            operator = '+';
        } else if (expression.contains("-")) {
            result = expression.split("-");
            operator = '-';
        } else if (expression.contains("*")) {
            result = expression.split("\\*");
            operator = '*';
        } else if (expression.contains("/")) {
            result = expression.split("/");
            operator = '/';
        } else {
            if (expression.matches("\\d+\\D+\\d")) {
                System.out.println("Ошибка: некорректный оператор");
            } else {
                System.out.println("Ошибка: неверный формат ввода.");
            }
            return;
        }

        if (result.length == 2 && expression.matches("\\d+\\D+\\d")) {
            double countOne = Double.parseDouble(result[0]);
            double countTwo = Double.parseDouble(result[1]);
            calculation(countOne, countTwo, operator);
        } else
            System.out.println("Ошибка: неверный формат ввода.");
    }

    public static void calculation(double countOne, double countTwo, char operator) {
        double answer;
        if (operator == '/' && countTwo == 0) {
            System.out.println("Ошибка: деление на ноль невозможно");
        } else if (operator == '+') {
            answer = countOne + countTwo;
            System.out.println("Результат: " + answer);
        } else if (operator == '-') {
            answer = countOne - countTwo;
            System.out.println("Результат: " + answer);
        } else if (operator == '*') {
            answer = countOne * countTwo;
            System.out.println("Результат: " + answer);
        } else if (operator == '/') {
            answer = countOne / countTwo;
            System.out.println("Результат: " + answer);
        }
    }
}




