import java.util.*;

public class Task15_EndsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String end = sc.nextLine();
        System.out.println(text.endsWith(end));
    }
}
