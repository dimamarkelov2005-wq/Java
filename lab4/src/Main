import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== МЕНЮ ЗАДАНИЙ =====");
        System.out.println("1 - Сумма чисел от 1 до N");
        System.out.println("2 - Чётные числа от 1 до 20");
        System.out.println("3 - Факториал числа");
        System.out.println("4 - Повтор символа (while)");
        System.out.println("5 - Нечётные числа от 1 до 100 (do-while)");
        System.out.println("6 - Сумма чисел до ввода 0");
        System.out.println("7 - Число положительное/отрицательное/ноль");
        System.out.println("8 - Оценка по баллам");
        System.out.println("9 - Сравнение двух чисел");
        System.out.println("10 - День недели");
        System.out.println("11 - Чётное или нечётное");
        System.out.println("12 - Доступ по возрасту");
        System.out.println("13 - Количество дней в месяце");
        System.out.println("14 - Определение температуры");
        System.out.println("15 - Проверка диапазона");
        System.out.println("16 - Калькулятор");
        System.out.print("Выберите номер задания: ");

        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Введите N: ");
                int n = scanner.nextInt();
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("Сумма: " + sum);
                break;

            case 2:
                System.out.println("Чётные числа от 1 до 20:");
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;

            case 3:
                System.out.print("Введите N: ");
                int f = scanner.nextInt();
                long factorial = 1;
                for (int i = 1; i <= f; i++) {
                    factorial *= i;
                }
                System.out.println("Факториал: " + factorial);
                break;

            case 4:
                System.out.print("Введите символ: ");
                char symbol = scanner.next().charAt(0);
                System.out.print("Сколько раз вывести?: ");
                int count = scanner.nextInt();
                int i = 0;
                while (i < count) {
                    System.out.print(symbol);
                    i++;
                }
                break;

            case 5:
                int j = 1;
                System.out.println("Нечётные числа от 1 до 100:");
                do {
                    if (j % 2 != 0) {
                        System.out.print(j + " ");
                    }
                    j++;
                } while (j <= 100);
                break;

            case 6:
                int number;
                int total = 0;
                System.out.println("Введите числа (0 для выхода):");
                do {
                    number = scanner.nextInt();
                    total += number;
                } while (number != 0);
                System.out.println("Сумма: " + total);
                break;

            case 7:
                System.out.print("Введите число: ");
                int num = scanner.nextInt();
                if (num > 0)
                    System.out.println("Положительное");
                else if (num < 0)
                    System.out.println("Отрицательное");
                else
                    System.out.println("Равно нулю");
                break;

            case 8:
                System.out.print("Введите балл (0-100): ");
                int score = scanner.nextInt();
                if (score >= 90)
                    System.out.println("Оценка: 5");
                else if (score >= 75)
                    System.out.println("Оценка: 4");
                else if (score >= 50)
                    System.out.println("Оценка: 3");
                else
                    System.out.println("Оценка: 2");
                break;

            case 9:
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Введите второе число: ");
                int b = scanner.nextInt();
                if (a > b)
                    System.out.println("Первое число больше");
                else if (a < b)
                    System.out.println("Второе число больше");
                else
                    System.out.println("Числа равны");
                break;

            case 10:
                System.out.print("Введите номер дня (1-7): ");
                int day = scanner.nextInt();
                switch (day) {
                    case 1: System.out.println("Понедельник"); break;
                    case 2: System.out.println("Вторник"); break;
                    case 3: System.out.println("Среда"); break;
                    case 4: System.out.println("Четверг"); break;
                    case 5: System.out.println("Пятница"); break;
                    case 6: System.out.println("Суббота"); break;
                    case 7: System.out.println("Воскресенье"); break;
                    default: System.out.println("Неверный номер дня");
                }
                break;

            case 11:
                System.out.print("Введите число: ");
                int even = scanner.nextInt();
                if (even % 2 == 0)
                    System.out.println("Чётное");
                else
                    System.out.println("Нечётное");
                break;

            case 12:
                System.out.print("Введите возраст: ");
                int age = scanner.nextInt();
                if (age >= 18)
                    System.out.println("Доступ разрешён");
                else
                    System.out.println("Доступ запрещён");
                break;

            case 13:
                System.out.print("Введите номер месяца (1-12): ");
                int month = scanner.nextInt();
                switch (month) {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        System.out.println("31 день");
                        break;
                    case 4: case 6: case 9: case 11:
                        System.out.println("30 дней");
                        break;
                    case 2:
                        System.out.println("28 или 29 дней");
                        break;
                    default:
                        System.out.println("Неверный месяц");
                }
                break;

            case 14:
                System.out.print("Введите температуру: ");
                int temp = scanner.nextInt();
                if (temp < 0)
                    System.out.println("Холодно");
                else if (temp <= 25)
                    System.out.println("Тепло");
                else
                    System.out.println("Жарко");
                break;

            case 15:
                System.out.print("Введите число: ");
                int range = scanner.nextInt();
                if (range >= 10 && range <= 50)
                    System.out.println("Число в диапазоне 10-50");
                else
                    System.out.println("Число вне диапазона");
                break;

            case 16:
                System.out.print("Введите первое число: ");
                double x = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double y = scanner.nextDouble();
                System.out.print("Введите операцию (+, -, *, /): ");
                char op = scanner.next().charAt(0);

                switch (op) {
                    case '+': System.out.println("Результат: " + (x + y)); break;
                    case '-': System.out.println("Результат: " + (x - y)); break;
                    case '*': System.out.println("Результат: " + (x * y)); break;
                    case '/':
                        if (y != 0)
                            System.out.println("Результат: " + (x / y));
                        else
                            System.out.println("Деление на ноль невозможно!");
                        break;
                    default:
                        System.out.println("Неверная операция");
                }
                break;

            default:
                System.out.println("Неверный выбор!");
        }

        scanner.close();
    }
}
