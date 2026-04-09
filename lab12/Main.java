import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== МЕНЮ =====");
            System.out.println("1 - Длина строки");
            System.out.println("2 - Изменение регистра");
            System.out.println("3 - Подсчёт слов");
            System.out.println("4 - Разворот слов");
            System.out.println("5 - Поиск слова");
            System.out.println("6 - Замена слова");
            System.out.println("7 - Палиндром");
            System.out.println("8 - Сравнение строк");
            System.out.println("9 - Разделение строки");
            System.out.println("10 - Гласные и согласные");
            System.out.println("11 - Удалить пробелы");
            System.out.println("12 - Самое длинное слово");
            System.out.println("13 - Символы без пробелов");
            System.out.println("14 - startsWith");
            System.out.println("15 - endsWith");
            System.out.println("16 - Полный реверс");
            System.out.println("17 - Удалить цифры");
            System.out.println("18 - Гласные -> *");
            System.out.println("19 - Частота символов");
            System.out.println("20 - Только цифры");
            System.out.println("0 - Выход");

            System.out.print("Выберите задание: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            if (choice == 0) {
                System.out.println("Выход...");
                break;
            }

            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Длина: " + input.length());
                    break;

                case 2:
                    System.out.println("Верхний: " + input.toUpperCase());
                    System.out.println("Нижний: " + input.toLowerCase());
                    break;

                case 3:
                    String[] words = input.trim().split("\\s+");
                    System.out.println("Слов: " + words.length);
                    break;

                case 4:
                    for (String word : input.split("\\s+")) {
                        System.out.print(new StringBuilder(word).reverse() + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Введите слово: ");
                    String search = scanner.nextLine();
                    System.out.println(input.contains(search));
                    break;

                case 6:
                    System.out.print("Что заменить: ");
                    String oldW = scanner.nextLine();
                    System.out.print("На что заменить: ");
                    String newW = scanner.nextLine();
                    System.out.println(input.replace(oldW, newW));
                    break;

                case 7:
                    String clean = input.replaceAll("\\s+", "").toLowerCase();
                    String rev = new StringBuilder(clean).reverse().toString();
                    System.out.println("Палиндром: " + clean.equals(rev));
                    break;

                case 8:
                    System.out.print("Введите вторую строку: ");
                    String second = scanner.nextLine();
                    System.out.println("Равны: " + input.equals(second));
                    break;

                case 9:
                    System.out.print("Введите разделитель: ");
                    String delim = scanner.nextLine();
                    String[] parts = input.split(delim);
                    for (String p : parts) {
                        System.out.println(p);
                    }
                    break;

                case 10:
                    int v = 0, c = 0;
                    String vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";
                    for (char ch : input.toCharArray()) {
                        if (Character.isLetter(ch)) {
                            if (vowels.indexOf(ch) != -1) v++;
                            else c++;
                        }
                    }
                    System.out.println("Гласные: " + v + ", Согласные: " + c);
                    break;

                case 11:
                    System.out.println(input.replace(" ", ""));
                    break;

                case 12:
                    String longest = "";
                    for (String w : input.split("\\s+")) {
                        if (w.length() > longest.length()) longest = w;
                    }
                    System.out.println("Самое длинное: " + longest);
                    break;

                case 13:
                    System.out.println(input.replace(" ", "").length());
                    break;

                case 14:
                    System.out.print("Введите начало: ");
                    String start = scanner.nextLine();
                    System.out.println(input.startsWith(start));
                    break;

                case 15:
                    System.out.print("Введите окончание: ");
                    String end = scanner.nextLine();
                    System.out.println(input.endsWith(end));
                    break;

                case 16:
                    System.out.println(new StringBuilder(input).reverse());
                    break;

                case 17:
                    System.out.println(input.replaceAll("\\d", ""));
                    break;

                case 18:
                    System.out.println(input.replaceAll("(?i)[aeiouаеёиоуыэюя]", "*"));
                    break;

                case 19:
                    Map<Character, Integer> map = new HashMap<>();
                    for (char ch : input.toCharArray()) {
                        map.put(ch, map.getOrDefault(ch, 0) + 1);
                    }
                    for (Map.Entry<Character, Integer> e : map.entrySet()) {
                        System.out.println(e.getKey() + ": " + e.getValue());
                    }
                    break;

                case 20:
                    System.out.println(input.matches("\\d+"));
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }
        }
    }
}
