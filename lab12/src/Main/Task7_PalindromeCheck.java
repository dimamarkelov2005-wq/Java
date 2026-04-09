import java.util.*;

public class Task7_PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(input).reverse().toString();
        System.out.println(input.equals(rev));
    }
}
