import java.util.*;

public class Task8_LengthFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.stream(sc.nextLine().split(" "))
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
