import java.util.function.Supplier;
import java.util.Random;

public class Task12_Supplier {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> new Random().nextInt(100);
        System.out.println(s.get());
    }
}
