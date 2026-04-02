import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.script.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== ЛАБОРАТОРНАЯ №11 =====");
            System.out.println("1 - Простой калькулятор");
            System.out.println("2 - Калькулятор с циклом");
            System.out.println("3 - Калькулятор с методами");
            System.out.println("4 - GUI калькулятор");
            System.out.println("5 - Степень");
            System.out.println("6 - Квадратный корень");
            System.out.println("7 - Отрицательные числа");
            System.out.println("8 - Проверка ввода");
            System.out.println("9 - Меню операций");
            System.out.println("10 - История");
            System.out.println("11 - Очистка экрана");
            System.out.println("12 - Проценты");
            System.out.println("13 - Инженерный калькулятор");
            System.out.println("14 - Выражения");
            System.out.println("0 - Выход");

            int choice = getInt("Выбор: ");

            switch (choice) {
                case 1: simpleCalculator(); break;
                case 2: calculatorLoop(); break;
                case 3: calculatorMethods(); break;
                case 4: showGUI(); break;
                case 5: powerTask(); break;
                case 6: sqrtTask(); break;
                case 7: negativeNumbers(); break;
                case 8: inputCheck(); break;
                case 9: menuCalculator(); break;
                case 10: showHistory(); break;
                case 11: clearScreen(); break;
                case 12: percentTask(); break;
                case 13: engineeringCalc(); break;
                case 14: expressionCalc(); break;
                case 0: return;
                default: System.out.println("Ошибка!");
            }
        }
    }

    // ===== ЗАДАНИЕ 1 =====
    static void simpleCalculator() {
        double a = getDouble("Введите a: ");
        double b = getDouble("Введите b: ");
        System.out.print("Операция (+ - * /): ");
        char op = scanner.next().charAt(0);

        double res = 0;

        switch (op) {
            case '+': res = a + b; break;
            case '-': res = a - b; break;
            case '*': res = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Деление на 0!");
                    return;
                }
                res = a / b; break;
        }

        System.out.println("Результат: " + res);
        history.add(a + " " + op + " " + b + " = " + res);
    }

    // ===== ЗАДАНИЕ 2 =====
    static void calculatorLoop() {
        String cont = "yes";
        while (cont.equalsIgnoreCase("yes")) {
            simpleCalculator();
            System.out.print("Продолжить? (yes/no): ");
            cont = scanner.next();
        }
    }

    // ===== ЗАДАНИЕ 3 =====
    static void calculatorMethods() {
        double a = getDouble("a: ");
        double b = getDouble("b: ");
        System.out.println("Сумма: " + add(a,b));
    }

    static double add(double a,double b){ return a+b; }

    // ===== ЗАДАНИЕ 4 =====
    static void showGUI() {
        JFrame f = new JFrame("Калькулятор");
        JTextField t = new JTextField();
        JButton b = new JButton("=");

        f.add(t, BorderLayout.NORTH);
        f.add(b, BorderLayout.SOUTH);

        b.addActionListener(e -> {
            try {
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                t.setText(engine.eval(t.getText()).toString());
            } catch (Exception ex) {
                t.setText("Ошибка");
            }
        });

        f.setSize(300,150);
        f.setVisible(true);
    }

    // ===== ЗАДАНИЕ 5 =====
    static void powerTask() {
        double a = getDouble("a: ");
        double b = getDouble("b: ");
        System.out.println(Math.pow(a,b));
    }

    // ===== ЗАДАНИЕ 6 =====
    static void sqrtTask() {
        double a = getDouble("Число: ");
        System.out.println(Math.sqrt(a));
    }

    // ===== ЗАДАНИЕ 7 =====
    static void negativeNumbers() {
        double a = getDouble("Введите отрицательное число: ");
        System.out.println("Вы ввели: " + a);
    }

    // ===== ЗАДАНИЕ 8 =====
    static void inputCheck() {
        double a = getDouble("Введите число (проверка): ");
        System.out.println("ОК: " + a);
    }

    // ===== ЗАДАНИЕ 9 =====
    static void menuCalculator() {
        System.out.println("1 +  2 -  3 *  4 /");
        int op = getInt("Выбор: ");
        double a = getDouble("a: ");
        double b = getDouble("b: ");

        switch (op) {
            case 1: System.out.println(a+b); break;
            case 2: System.out.println(a-b); break;
            case 3: System.out.println(a*b); break;
            case 4: System.out.println(a/b); break;
        }
    }

    // ===== ЗАДАНИЕ 10 =====
    static void showHistory() {
        for (String s: history) System.out.println(s);
    }

    // ===== ЗАДАНИЕ 11 =====
    static void clearScreen() {
        for(int i=0;i<30;i++) System.out.println();
    }

    // ===== ЗАДАНИЕ 12 =====
    static void percentTask() {
        double a = getDouble("%: ");
        double b = getDouble("от: ");
        System.out.println((a/100)*b);
    }

    // ===== ЗАДАНИЕ 13 =====
    static void engineeringCalc() {
        double a = getDouble("Угол: ");
        System.out.println("sin=" + Math.sin(Math.toRadians(a)));
        System.out.println("cos=" + Math.cos(Math.toRadians(a)));
        System.out.println("tan=" + Math.tan(Math.toRadians(a)));
    }

    // ===== ЗАДАНИЕ 14 =====
    static void expressionCalc() {
        scanner.nextLine();
        System.out.print("Введите выражение: ");
        String expr = scanner.nextLine();

        try {
            ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
            System.out.println(engine.eval(expr));
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }

    // ===== ВВОД =====
    static double getDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Ошибка!");
                scanner.next();
            }
        }
    }

    static int getInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Ошибка!");
                scanner.next();
            }
        }
    }
}
