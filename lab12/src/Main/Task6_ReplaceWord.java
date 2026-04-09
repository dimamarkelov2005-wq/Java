import java.util.*;

public class Task6_ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String oldW = sc.nextLine();
        String newW = sc.nextLine();
        System.out.println(text.replace(oldW, newW));
    }
}
