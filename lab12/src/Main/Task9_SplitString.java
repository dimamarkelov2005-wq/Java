import java.util.*;

public class Task9_SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String delim = sc.nextLine();
        for (String part : text.split(delim)) {
            System.out.println(part);
        }
    }
}
