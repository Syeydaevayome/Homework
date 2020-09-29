package less3;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class main {
    static Scanner tt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите три числа");
        int a = tt.nextInt();
        int b = tt.nextInt();
        int c = tt.nextInt();
        int d = b * b - 4 * a * c;
        Boolean dd = d < 0;
        if (dd) {

            System.out.println("Нет корней");
        } else {
            System.out.println("Корни есть");
            double x1 = (-b - sqrt(d)) / (2 * a);
            double x2 = (-b + sqrt(d)) / (2 * a);
            System.out.println( "x1 =" + x1);
            System.out.println("x2 ="  + x2);


        }
    }
}