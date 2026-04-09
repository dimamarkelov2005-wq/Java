import java.util.*;

public class Task13_CharCountNoSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().replace(" ", "").length());
    }
}
