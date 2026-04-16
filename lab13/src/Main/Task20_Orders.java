import java.util.*;

public class Task20_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .filter(n -> n > 1000)
                .sorted()
                .forEach(System.out::println);
    }
}
