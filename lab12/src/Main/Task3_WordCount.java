import java.util.*;

public class Task3_WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.trim().split("\\s+").length);
    }
}
