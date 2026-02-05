package linear;

import java.util.Scanner;

public class SquareAndCube {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        double n = scanner.nextDouble();

        double square = n * n;
        double cube = square * n;

        System.out.println("Квадрат: " + square);
        System.out.println("Куб: " + cube);

        scanner.close();
    }
}
