package linear;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();

        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();

        double area = length * width;
        System.out.println("Площадь прямоугольника: " + area);

        scanner.close();
    }
}
