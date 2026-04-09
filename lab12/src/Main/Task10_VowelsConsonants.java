import java.util.*;

public class Task10_VowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int v = 0, c = 0;
        String vowels = "aeiouAEIOUаеёиоуыэюяАЕЁИОУЫЭЮЯ";

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) v++;
                else c++;
            }
        }

        System.out.println("Гласные: " + v + ", Согласные: " + c);
    }
}
