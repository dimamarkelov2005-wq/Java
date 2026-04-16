import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== МЕНЮ ===");
            System.out.println("1 - Сложение чисел");
            System.out.println("2 - Строка в верхний регистр");
            System.out.println("3 - Фильтр нечётных чисел");
            System.out.println("4 - Квадраты чисел");
            System.out.println("5 - Максимум");
            System.out.println("6 - Сортировка строк по длине");
            System.out.println("7 - Первая буква заглавная");
            System.out.println("8 - Строки длиной > 5");
            System.out.println("9 - Вывод списка");
            System.out.println("10 - Минимум (Optional)");
            System.out.println("11 - Consumer");
            System.out.println("12 - Supplier");
            System.out.println("13 - Сортировка студентов по возрасту");
            System.out.println("14 - Студенты > 80");
            System.out.println("15 - Stream цепочка");
            System.out.println("16 - Группировка студентов");
            System.out.println("17 - Сумма (reduce)");
            System.out.println("18 - distinct + limit");
            System.out.println("19 - flatMap");
            System.out.println("20 - Заказы");
            System.out.println("0 - Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> task1();
                case 2 -> task2();
                case 3 -> task3();
                case 4 -> task4();
                case 5 -> task5();
                case 6 -> task6();
                case 7 -> task7();
                case 8 -> task8();
                case 9 -> task9();
                case 10 -> task10();
                case 11 -> task11();
                case 12 -> task12();
                case 13 -> task13();
                case 14 -> task14();
                case 15 -> task15();
                case 16 -> task16();
                case 17 -> task17();
                case 18 -> task18();
                case 19 -> task19();
                case 20 -> task20();
                case 0 -> {
                    System.out.println("Выход...");
                    return;
                }
                default -> System.out.println("Неверный выбор");
            }
        }
    }

    // ===== ВСПОМОГАТЕЛЬНЫЙ ВВОД =====
    static List<Integer> inputNumbers() {
        System.out.println("Введите числа через пробел:");
        return Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();
    }

    static List<String> inputStrings() {
        System.out.println("Введите строки через пробел:");
        return Arrays.stream(scanner.nextLine().split(" "))
                .toList();
    }

    // ===== ЗАДАНИЯ =====

    static void task1() {
        System.out.println("Введите 2 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println("Результат: " + sum.apply(a, b));
    }

    static void task2() {
        System.out.println("Введите строку:");
        String str = scanner.nextLine();

        Function<String, String> f = s -> s.toUpperCase();
        System.out.println(f.apply(str));
    }

    static void task3() {
        inputNumbers().stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);
    }

    static void task4() {
        inputNumbers().stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    static void task5() {
        int max = inputNumbers().stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Максимум: " + max);
    }

    static void task6() {
        inputStrings().stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    static void task7() {
        System.out.println("Введите строку:");
        String s = scanner.nextLine();

        System.out.println(
                s.substring(0,1).toUpperCase() + s.substring(1)
        );
    }

    static void task8() {
        inputStrings().stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }

    static void task9() {
        inputNumbers().forEach(System.out::println);
    }

    static void task10() {
        int min = inputNumbers().stream()
                .min(Integer::compare)
                .orElse(0);
        System.out.println("Минимум: " + min);
    }

    static void task11() {
        Consumer<String> c = System.out::println;
        c.accept("Привет из Consumer");
    }

    static void task12() {
        Supplier<Integer> s = () -> new Random().nextInt(100);
        System.out.println("Случайное число: " + s.get());
    }

    static List<Student> students = List.of(
            new Student("Alice", 20, 85),
            new Student("Bob", 22, 75),
            new Student("Charlie", 20, 90)
    );

    static void task13() {
        students.stream()
                .sorted(Comparator.comparing(st -> st.age))
                .forEach(System.out::println);
    }

    static void task14() {
        students.stream()
                .filter(s -> s.grade > 80)
                .forEach(System.out::println);
    }

    static void task15() {
        inputNumbers().stream()
                .filter(n -> n > 2)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);
    }

    static void task16() {
        Map<Integer, List<Student>> map =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(map);
    }

    static void task17() {
        int sum = inputNumbers().stream()
                .reduce(0, Integer::sum);
        System.out.println("Сумма: " + sum);
    }

    static void task18() {
        inputNumbers().stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }

    static void task19() {
        List<List<Integer>> list = List.of(
                List.of(1,2),
                List.of(3,4)
        );

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }

    static void task20() {
        inputNumbers().stream()
                .filter(n -> n > 1000)
                .sorted()
                .forEach(System.out::println);
    }

    // ===== КЛАСС =====
    static class Student {
        String name;
        int age;
        double grade;

        Student(String n, int a, double g) {
            name = n;
            age = a;
            grade = g;
        }

        public String toString() {
            return name + " (" + age + ", " + grade + ")";
        }
    }
}
