import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа: Циклы в Java");
        System.out.println("Выберите задание:");
        System.out.println("1 – Вывод чисел от 1 до N (for)");
        System.out.println("2 – Сумма чисел от 1 до N (while)");
        System.out.println("3 – Факториал числа N (for)");
        System.out.println("4 – Чётные числа от 1 до 100 (while + continue)");
        System.out.println("5 – Ввод чисел до 0 (do-while)");
        System.out.println("6 – Таблица умножения от 1 до 5 (вложенный цикл)");
        System.out.print("Введите номер задания: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                // Задание 1
                System.out.print("Введите число N: ");
                int n1 = scanner.nextInt();

                for (int i = 1; i <= n1; i++) {
                    System.out.println(i);
                }
                break;

            case 2:
                // Задание 2
                System.out.print("Введите число N: ");
                int n2 = scanner.nextInt();

                int sum = 0;
                int i = 1;

                while (i <= n2) {
                    sum += i;
                    i++;
                }

                System.out.println("Сумма чисел от 1 до " + n2 + " равна: " + sum);
                break;

            case 3:
                // Задание 3
                System.out.print("Введите число N: ");
                int n3 = scanner.nextInt();

                long factorial = 1;

                for (int j = 1; j <= n3; j++) {
                    factorial *= j;
                }

                System.out.println("Факториал числа " + n3 + " равен: " + factorial);
                break;

            case 4:
                // Задание 4
                int k = 1;

                while (k <= 100) {

                    if (k % 2 != 0) {
                        k++;
                        continue;
                    }

                    System.out.println(k);
                    k++;
                }
                break;

            case 5:
                // Задание 5
                int number;
                int total = 0;

                do {
                    System.out.print("Введите число (0 для выхода): ");
                    number = scanner.nextInt();
                    total += number;
                } while (number != 0);

                System.out.println("Сумма введённых чисел: " + total);
                break;

            case 6:
                // Дополнительное задание
                for (int a = 1; a <= 5; a++) {

                    for (int b = 1; b <= 5; b++) {
                        System.out.print(a * b + "\t");
                    }

                    System.out.println();
                }
                break;

            default:
                System.out.println("Неверный номер задания.");
        }

        scanner.close();
    }
}
