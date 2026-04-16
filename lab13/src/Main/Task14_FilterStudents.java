import java.util.*;

public class Task14_FilterStudents {

    static class Student {
        String name;
        double grade;

        Student(String n, double g) {
            name = n;
            grade = g;
        }

        public String toString() {
            return name + " " + grade;
        }
    }

    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("Alice", 85),
                new Student("Bob", 70),
                new Student("Charlie", 90)
        );

        list.stream()
                .filter(s -> s.grade > 80)
                .forEach(System.out::println);
    }
}
