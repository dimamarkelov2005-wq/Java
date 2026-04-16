import java.util.*;

public class Task15_StreamChain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .filter(n -> n > 2)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);
    }
}
