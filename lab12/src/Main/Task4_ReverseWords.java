import java.util.*;

public class Task4_ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("\\s+");
        for (String w : words) {
            System.out.print(new StringBuilder(w).reverse() + " ");
        }
    }
}
