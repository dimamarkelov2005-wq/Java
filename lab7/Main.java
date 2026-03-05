import java.util.*;

public class Lab7Interactive {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Лабораторная работа №7");
        System.out.println("Выберите задание (1-17): ");

        int task = input.nextInt();

        switch(task) {
            case 1: task1(); break;
            case 2: task2(); break;
            case 3: task3(); break;
            case 4: task4(); break;
            case 5: task5(); break;
            case 6: task6(); break;
            case 7: task7(); break;
            case 8: task8(); break;
            case 9: task9(); break;
            case 10: task10(); break;
            case 11: task11(); break;
            case 12: task12(); break;
            case 13: task13(); break;
            case 14: task14(); break;
            case 15: task15(); break;
            case 16: task16(); break;
            case 17: task17(); break;
            default: System.out.println("Неверный номер задания");
        }
    }

    static void task1() {
        int[] A = new int[20];
        int sum = 0;

        for(int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*40-20);
            System.out.print(A[i]+" ");
            if(A[i] < 0) sum += A[i];
        }

        System.out.println("\nСумма отрицательных = "+sum);
    }

    static void task2() {
        int[] B = new int[15];
        int sum = 0;

        for(int i=0;i<B.length;i++){
            B[i] = (int)(Math.random()*40-20);
            System.out.print(B[i]+" ");
            if(B[i] > 0) sum += B[i];
        }

        System.out.println("\nСумма положительных = "+sum);
    }

    static void task3() {
        double[] A = new double[12];
        double product = 1;

        for(int i=0;i<A.length;i++){
            A[i] = Math.random()*20-10;
            System.out.print(A[i]+" ");
            if(A[i] < 0) product *= A[i];
        }

        System.out.println("\nПроизведение отрицательных = "+product);
    }

    static void task4() {
        double[] C = new double[25];
        double product = 1;

        for(int i=0;i<C.length;i++){
            C[i] = Math.random()*20-10;
            System.out.print(C[i]+" ");
            if(C[i] > 0) product *= C[i];
        }

        System.out.println("\nПроизведение положительных = "+product);
    }

    static void task5() {
        double[] D = new double[17];
        double sum = 0;

        for(int i=0;i<D.length;i++){
            D[i] = Math.random()*100;
            System.out.print(D[i]+" ");
            sum += D[i];
        }

        System.out.println("\nСреднее = "+sum/D.length);
    }

    static void task6() {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                A[i][j]=(int)(Math.random()*20-10);
                System.out.print(A[i][j]+" ");
                if(A[i][j]<0) B[i]+=A[i][j];
            }
            System.out.println();
        }

        System.out.println("Суммы по строкам:");
        System.out.println(Arrays.toString(B));
    }

    static void task7() {
        int[][] B = new int[5][5];
        int[] A = new int[5];

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                B[i][j]=(int)(Math.random()*20-10);
                System.out.print(B[i][j]+" ");
                if(B[i][j]>0) A[i]+=B[i][j];
            }
            System.out.println();
        }

        System.out.println("Суммы положительных:");
        System.out.println(Arrays.toString(A));
    }

    static void task8() {
        int[][] A = new int[12][6];

        for(int i=0;i<12;i++){
            for(int j=0;j<6;j++){
                A[i][j]=(int)(Math.random()*20-10);
            }
        }

        for(int j=0;j<6;j++){
            int product=1;

            for(int i=0;i<12;i++){
                if(A[i][j]<0) product*=A[i][j];
            }

            System.out.println("Столбец "+j+" произведение = "+product);
        }
    }

    static void task9() {
        int[][] C = new int[5][5];
        int product=1;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                C[i][j]=(int)(Math.random()*20-10);
                System.out.print(C[i][j]+" ");

                if(i==j && C[i][j]>0) product*=C[i][j];
            }
            System.out.println();
        }

        System.out.println("Произведение диагонали = "+product);
    }

    static void task10() {
        int[][] D = new int[7][7];
        double sum=0;

        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                D[i][j]=(int)(Math.random()*20);
                System.out.print(D[i][j]+" ");

                if(i==j) sum+=D[i][j];
            }
            System.out.println();
        }

        System.out.println("Среднее диагонали = "+sum/7);
    }

    static void task11() {
        int[] A = new int[25];

        for(int i=0;i<A.length;i++){
            A[i]=(int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }

        int max=0,min=0;

        for(int i=1;i<A.length;i++){
            if(A[i]>A[max]) max=i;
            if(A[i]<A[min]) min=i;
        }

        int temp=A[max];
        A[max]=A[min];
        A[min]=temp;

        System.out.println("\nПосле обмена:");
        System.out.println(Arrays.toString(A));
    }

    static void task12() {
        int[] B = new int[25];

        for(int i=0;i<B.length;i++)
            B[i]=(int)(Math.random()*100);

        Arrays.sort(B);

        System.out.println(Arrays.toString(B));
    }

    static void task13() {
        int[] C = new int[20];
        int sum=0;

        for(int i=0;i<C.length;i++){
            C[i]=(int)(Math.random()*100);
            sum+=C[i];
        }

        System.out.println("Среднее = "+sum/(double)C.length);
    }

    static void task14() {
        int[] D = new int[30];
        int even=0,odd=0;

        for(int i=0;i<D.length;i++){
            D[i]=(int)(Math.random()*100);

            if(D[i]%2==0) even+=D[i];
            else odd+=D[i];
        }

        System.out.println("Сумма чётных = "+even);
        System.out.println("Сумма нечётных = "+odd);
    }

    static void task15() {
        int[][] a = new int[3][5];

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                a[i][j]=(int)(Math.random()*10);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int maxX() {
        int[] array = new int[10];

        for(int i=0;i<array.length;i++)
            array[i]=(int)(Math.random()*50);

        int max=array[0];

        for(int i=1;i<array.length;i++)
            if(array[i]>max) max=array[i];

        return max;
    }

    static void task16() {
        System.out.println("Максимальный элемент = "+maxX());
    }

    static void task17() {

        String s1="Hello ";
        String s2="World";
        String s3="Java";
        String s4="test";
        String s5="test";

        if(s4.equals(s5))
            System.out.println(s1+s2);
        else
            System.out.println(s1+s3);
    }
}
