package linear;

import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int square = number * number;
        System.out.println("Квадрат числа: " + square);

        scanner.close();
    }
}
