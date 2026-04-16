import java.util.function.Consumer;

public class Task11_Consumer {
    public static void main(String[] args) {
        Consumer<String> c = System.out::println;
        c.accept("Hello Consumer");
    }
}
