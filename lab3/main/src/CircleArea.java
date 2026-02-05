package linear;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус: ");
        double r = scanner.nextDouble();

        final double PI = 3.14;
        double area = PI * r * r;

        System.out.println("Площадь круга: " + area);

        scanner.close();
    }
}
