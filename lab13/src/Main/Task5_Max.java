import java.util.*;

public class Task5_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .toList();

        int max = list.stream()
                .max(Integer::compare)
                .orElse(0);

        System.out.println(max);
    }
}
