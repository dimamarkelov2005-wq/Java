import java.util.*;

public class Task19_FlatMap {
    public static void main(String[] args) {

        List<List<Integer>> list = List.of(
                List.of(1,2),
                List.of(3,4)
        );

        list.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
