import java.util.Random;

public class Task15_RandomUntilZero {
    public static void main(String[] args) {
        Random rand = new Random();
        int r;
        do {
            r = rand.nextInt(11); // Числа от 0 до 10
            System.out.println("Сгенерировано: " + r);
        } while (r != 0);
        System.out.println("Выпал ноль, выход.");
    }
}
