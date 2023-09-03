import java.util.Scanner;

public class CarNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Введите регистрационный номер автомобиля (для выхода введите 'exit'): ");
            input = scanner.nextLine().replaceAll(" ", "");

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println(isValidNumber(input));
        } while (true);

        scanner.close();
    }

    public static String isValidNumber(String input) {

        // Проверяем формат номера
        if (!input.matches("[АВЕКМНОРСТУХавекмнорстух]{1}\\d{3}[АВЕКМНОРСТУХавекмнорстух]{2}\\d{2,3}")) {
            return "Введенный номерной знак не соответствует формату федеральных номерных знаков.";
        }

        return getRegionNumber(input);
    }

    public static String getRegionNumber(String input) {
        // Получаем код региона
        String regionCode = input.substring(6);

        // Проверяем регион по коду
        switch (regionCode) {
            case "50", "90", "150", "190", "750", "790":
                return "Московская область";
            case "77", "97", "99", "177", "197", "199", "777", "797", "799", "977", "277", "297", "299":
                return "Москва";
            default:
                return "Невозможно определить регион номера.";
        }
    }


}