import java.util.*;

public class Task12_LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String longest = "";

        for (String w : sc.nextLine().split("\\s+")) {
            if (w.length() > longest.length()) longest = w;
        }

        System.out.println(longest);
    }
}
