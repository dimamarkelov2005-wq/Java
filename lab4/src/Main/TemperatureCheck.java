import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();

        if (temp < 0)
            System.out.println("Холодно");
        else if (temp <= 25)
            System.out.println("Тепло");
        else
            System.out.println("Жарко");

        scanner.close();
    }
}
