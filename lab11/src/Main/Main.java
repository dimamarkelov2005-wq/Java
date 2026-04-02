import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== ЛАБА 11 =====");
            System.out.println("1-14 задания");
            System.out.println("0 - Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: Task1.run(); break;
                case 2: Task2.run(); break;
                case 3: Task3.run(); break;
                case 4: Task4.run(); break;
                case 5: Task5.run(); break;
                case 6: Task6.run(); break;
                case 7: Task7.run(); break;
                case 8: Task8.run(); break;
                case 9: Task9.run(); break;
                case 10: Task10.run(); break;
                case 11: Task11.run(); break;
                case 12: Task12.run(); break;
                case 13: Task13.run(); break;
                case 14: Task14.run(); break;
                case 0: return;
                default: System.out.println("Ошибка!");
            }
        }
    }
}
