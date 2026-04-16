import java.util.*;

public class Task13_SortStudents {

    static class Student {
        String name;
        int age;

        Student(String n, int a) {
            name = n;
            age = a;
        }

        public String toString() {
            return name + " " + age;
        }
    }

    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Charlie", 19)
        );

        list.stream()
                .sorted(Comparator.comparing(s -> s.age))
                .forEach(System.out::println);
    }
}
