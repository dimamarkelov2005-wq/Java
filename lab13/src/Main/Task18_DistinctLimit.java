import java.util.*;

public class Task18_DistinctLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }
}
