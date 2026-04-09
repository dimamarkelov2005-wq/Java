import java.util.*;

public class Task14_StartsWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String start = sc.nextLine();
        System.out.println(text.startsWith(start));
    }
}
