import java.util.*;

public class Task18_ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().replaceAll("(?i)[aeiouаеёиоуыэюя]", "*"));
    }
}
