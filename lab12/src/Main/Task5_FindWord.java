import java.util.*;

public class Task5_FindWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String word = sc.nextLine();
        System.out.println(text.contains(word));
    }
}
