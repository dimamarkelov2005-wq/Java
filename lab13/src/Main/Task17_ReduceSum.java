import java.util.*;

public class Task17_ReduceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
