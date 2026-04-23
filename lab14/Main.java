import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ЛАБОРАТОРНАЯ РАБОТА №14 =====");
            System.out.println("Выберите задачу (1-18) или 0 для выхода:");
            System.out.println("1-8: Базовые | 9-18: Дополнительные");
            System.out.print("Введите номер: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера от символа новой строки

            switch (choice) {
                case 1: task1(); break;
                case 2: task2(scanner); break;
                case 3: task3(scanner); break;
                case 4: task4(scanner); break;
                case 5: task5(scanner); break;
                case 6: task6(scanner); break;
                case 7: task7(scanner); break;
                case 8: task8(); break;
                case 9: task9(scanner); break;
                case 10: task10(scanner); break;
                case 11: task11(scanner); break;
                case 12: task12(scanner); break;
                case 13: task13(scanner); break;
                case 14: task14(scanner); break;
                case 15: task15(); break;
                case 16: task16(scanner); break;
                case 17: task17(scanner); break;
                case 18: task18(scanner); break;
                case 0: System.out.println("Программа завершена."); break;
                default: System.out.println("Ошибка: неверный номер!");
            }
        } while (choice != 0);

        scanner.close();
    }

    // --- БАЗОВЫЕ ЗАДАЧИ ---

    static void task1() {
        int i = 1;
        do { System.out.print(i++ + " "); } while (i <= 10);
        System.out.println();
    }

    static void task2(Scanner sc) {
        int n;
        do {
            System.out.print("Введите положительное число: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("Успех: " + n);
    }

    static void task3(Scanner sc) {
        System.out.print("Введите число: ");
        int n = Math.abs(sc.nextInt()), sum = 0;
        do {
            sum += n % 10;
            n /= 10;
        } while (n > 0);
        System.out.println("Сумма цифр: " + sum);
    }

    static void task4(Scanner sc) {
        String pass = "12345", input;
        do {
            System.out.print("Пароль: ");
            input = sc.nextLine();
        } while (!input.equals(pass));
        System.out.println("Доступ разрешен!");
    }

    static void task5(Scanner sc) {
        System.out.print("Введите число: ");
        int n = sc.nextInt(), f = 1, i = 1;
        if (n > 0) {
            do { f *= i++; } while (i <= n);
        }
        System.out.println("Факториал: " + f);
    }

    static void task6(Scanner sc) {
        String choice;
        do {
            System.out.println("Работаем...");
            System.out.print("Продолжить? (yes/no): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }

    static void task7(Scanner sc) {
        String choice;
        do {
            System.out.print("A: "); int a = sc.nextInt();
            System.out.print("B: "); int b = sc.nextInt();
            System.out.println("Сумма: " + (a + b));
            sc.nextLine();
            System.out.print("Еще раз? (yes/no): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }

    static void task8() {
        int sum = 0, i = 2;
        do { sum += i; i += 2; } while (i <= 100);
        System.out.println("Сумма четных до 100: " + sum);
    }

    // --- ДОПОЛНИТЕЛЬНЫЕ ЗАДАЧИ ---

    static void task9(Scanner sc) {
        System.out.print("N: ");
        int n = sc.nextInt(), sum = 0, i = 1;
        do { sum += i++; } while (i <= n);
        System.out.println("Сумма от 1 до N: " + sum);
    }

    static void task10(Scanner sc) {
        System.out.print("Число: ");
        long n = Math.abs(sc.nextLong()); int count = 0;
        do { count++; n /= 10; } while (n > 0);
        System.out.println("Цифр: " + count);
    }

    static void task11(Scanner sc) {
        System.out.print("Число: ");
        int n = sc.nextInt(), i = 1;
        do { System.out.println(n + " * " + i + " = " + (n * i++)); } while (i <= 10);
    }

    static void task12(Scanner sc) {
        System.out.print("Число: ");
        int n = Math.abs(sc.nextInt()), max = 0;
        do {
            int d = n % 10;
            if (d > max) max = d;
            n /= 10;
        } while (n > 0);
        System.out.println("Max цифра: " + max);
    }

    static void task13(Scanner sc) {
        System.out.print("Число: ");
        int n = sc.nextInt(), temp = Math.abs(n), rev = 0;
        do {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        } while (temp > 0);
        System.out.println(Math.abs(n) == rev ? "Палиндром" : "Нет");
    }

    static void task14(Scanner sc) {
        System.out.print("Число: ");
        int n = Math.abs(sc.nextInt()), count = 0;
        do {
            if ((n % 10) % 2 == 0) count++;
            n /= 10;
        } while (n > 0);
        System.out.println("Четных цифр: " + count);
    }

    static void task15() {
        Random r = new Random(); int n;
        do {
            n = r.nextInt(11);
            System.out.println("Random: " + n);
        } while (n != 0);
    }

    static void task16(Scanner sc) {
        int n, sum = 0;
        System.out.println("Числа (0 - стоп):");
        do { n = sc.nextInt(); sum += n; } while (n != 0);
        System.out.println("Сумма: " + sum);
    }

    static void task17(Scanner sc) {
        String p;
        do {
            System.out.print("Пароль (>= 6 симв.): ");
            p = sc.nextLine();
        } while (p.length() < 6);
        System.out.println("Ок!");
    }

    static void task18(Scanner sc) {
        int n, min = Integer.MAX_VALUE;
        System.out.println("Числа (0 - стоп):");
        do {
            n = sc.nextInt();
            if (n != 0 && n < min) min = n;
        } while (n != 0);
        System.out.println("Минимум: " + (min == Integer.MAX_VALUE ? "-" : min));
    }
}
