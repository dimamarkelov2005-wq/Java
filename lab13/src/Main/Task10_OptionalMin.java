import java.util.*;

public class Task10_OptionalMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .toList();

        int min = list.stream()
                .min(Integer::compare)
                .orElse(0);

        System.out.println(min);
    }
}
