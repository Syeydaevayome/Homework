package loop1;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);

    public static void main(String[] args) {
        //Вывод таблицы умножения через While
        System.out.println("введите пармаетр таблицы умножения");
        int a = tt.nextInt();
        int n = 1;
        while (n <= 10) {
            System.out.println(a + " * " + n + " = " + a * n);
            n++;
        }
        //Вывод таблицы умножения через Do
        System.out.println("введите параметр таблицы умножения");
        int b = tt.nextInt();
        int p = 1;
        while (p <= 0) ;
        do {
            System.out.println(b + " * " + p + " = " + b * p);
            p++;
        } while (p <= 10);

//Вывод таблицы умножения через for
        System.out.println("введите параметр таблицы умножения");
        int d = tt.nextInt();
        int o = 1;
        for(o = 1; o <= 10; o++) {
            System.out.println(d + " * " + o + " = " + d * o);
        }

    }
}






