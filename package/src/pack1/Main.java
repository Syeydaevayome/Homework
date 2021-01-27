package pac1;

import java.util.Scanner;

public class Main {
    static Scanner q = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите первый член арифметической прогрессии");
        int a1 = q.nextInt();
        System.out.println("введите разность арифметической прогрессии");
        int d = q.nextInt();
        System.out.println("Сумму какого количества членов требуется найти?");
        int n = q.nextInt();
        SumPR r = new SumPR(a1,d);
        double ss = r.sum(a1,d,n);
        System.out.println("Сумма" + n + "членов арифметической пргорессии=" + ss);
;    }

}
