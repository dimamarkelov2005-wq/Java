import java.util.*;

public class HistoryCalculator {
    static ArrayList<String> history = new ArrayList<>();

    public static void run() {
        history.add("Example");
        for(String s: history) System.out.println(s);
    }
}
