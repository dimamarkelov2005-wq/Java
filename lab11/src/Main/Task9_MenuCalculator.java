import java.util.Scanner;

public class MenuCalculator {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch(op){
            case 1: System.out.println(a+b); break;
            case 2: System.out.println(a-b); break;
            case 3: System.out.println(a*b); break;
            case 4: System.out.println(a/b); break;
        }
    }
}
