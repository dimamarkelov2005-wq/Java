import java.util.*;
import java.util.stream.*;

public class Task16_Grouping {

    static class Student {
        String name;
        int age;

        Student(String n, int a) {
            name = n;
            age = a;
        }
    }

    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("A", 20),
                new Student("B", 20),
                new Student("C", 21)
        );

        Map<Integer, List<Student>> map =
                list.stream()
                        .collect(Collectors.groupingBy(s -> s.age));

        System.out.println(map);
    }
}
