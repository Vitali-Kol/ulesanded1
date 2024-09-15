package org.example;

import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        float temperaturecelsium = scanner.nextFloat();
        float temperaturefarenheit = (temperaturecelsium * 9 / 5) + 32;
        System.out.print("Температура в градусах Фаренгейта:" + temperaturefarenheit);
        scanner.close();
    }
}
 */
/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int number = scanner.nextInt();
        if (number < 100 || number > 999) {
            System.out.println("Введите именно ТРЕХЗНАЧНОЕ число");
            return;
        }
        int edinici = number % 10;
        int desyatki = (number / 10) % 10;
        int sotki = (number / 100) % 10;

        System.out.println("Количество единиц " + edinici);
        System.out.println("Количество десяток " + desyatki);
        System.out.println("Количество соток " + sotki);
        System.out.println("Сумма всех цифр " + (edinici + desyatki + sotki));
    }
}
*/
/*
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(500) * 2;
        }

        System.out.println("20 случайных четных целых чисел: " + Arrays.toString(numbers));

        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();

        int sum = 0;
        int count = 0;
        for (int number : numbers) {
            if (number != min && number != max) {
                sum += number;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое элементов массива без учета минимального и максимального элементов массива: " + average);
    }
}
*/
import java.util.Random;
import java.util.Scanner;
/*
public class Main {
    public static void main(String[] args) {
        // Создаем зубчатый массив для хранения температуры в течение года
        int[][] temperatures = new int[12][];
        Random random = new Random();

        // Определяем количество дней в каждом месяце
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Заполняем массив случайными температурами в зависимости от времени года
        for (int month = 0; month < 12; month++) {
            temperatures[month] = new int[daysInMonth[month]]; // Создаем массив для каждого месяца
            for (int day = 0; day < daysInMonth[month]; day++) {
                // Задаем диапазон температур в зависимости от месяца
                if (month >= 2 && month <= 4) { // Весна (март-май)
                    temperatures[month][day] = random.nextInt(15) + 5; // от 5 до 20
                } else if (month >= 5 && month <= 7) { // Лето (июнь-август)
                    temperatures[month][day] = random.nextInt(20) + 15; // от 15 до 35
                } else if (month >= 8 && month <= 10) { // Осень (сентябрь-ноябрь)
                    temperatures[month][day] = random.nextInt(15) + 5; // от 5 до 20
                } else { // Зима (декабрь-февраль)
                    temperatures[month][day] = random.nextInt(30) - 15; // от -15 до 15
                }
            }
        }

        // Ввод данных пользователя для получения температуры на указанную дату
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int monthInput = scanner.nextInt() - 1;
        System.out.print("Введите день (1-" + daysInMonth[monthInput] + "): ");
        int dayInput = scanner.nextInt() - 1;

        // Вывод температуры на указанную дату
        System.out.println("Температура на " + (monthInput + 1) + "/" + (dayInput + 1) + ": " + temperatures[monthInput][dayInput] + "°C");

        // Поиск самых теплых и холодных дней
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        String minDate = "", maxDate = "";

        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < temperatures[month].length; day++) {
                if (temperatures[month][day] < minTemp) {
                    minTemp = temperatures[month][day];
                    minDate = (month + 1) + "/" + (day + 1);
                }
                if (temperatures[month][day] > maxTemp) {
                    maxTemp = temperatures[month][day];
                    maxDate = (month + 1) + "/" + (day + 1);
                }
            }
        }

        // Вывод самых холодных и теплых дней
        System.out.println("Самый холодный день: " + minDate + " с температурой " + minTemp + "°C");
        System.out.println("Самый теплый день: " + maxDate + " с температурой " + maxTemp + "°C");

        // Вычисление средней температуры по каждому месяцу
        System.out.println("Средняя температура по месяцам:");
        for (int month = 0; month < 12; month++) {
            int sum = 0;
            for (int day = 0; day < temperatures[month].length; day++) {
                sum += temperatures[month][day];
            }
            double average = (double) sum / temperatures[month].length;
            System.out.println("Месяц " + (month + 1) + ": " + average + "°C");
        }
    }
}
*/
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Заданное предложение
        String inputText = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.".toLowerCase();

        // Определяем множество для всех букв русского алфавита
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'а'; c <= 'я'; c++) {
            alphabet.add(c);
        }

        // Удаляем из множества алфавита все буквы, которые встречаются в тексте
        for (char c : inputText.toCharArray()) {
            alphabet.remove(c);
        }

        // Если множество пустое, значит текст содержит все буквы алфавита
        if (alphabet.isEmpty()) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
        }
    }
}