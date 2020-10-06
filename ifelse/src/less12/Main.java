package less12;


import java.util.Scanner;

public class Main {
    static Scanner ff = new Scanner(System.in);

    public static void main(String[] args) {
        int x1 = 2;
        int x2 = 6;
        int y1 = 6;
        int y2 = 4;

        int x11 = 9;
        int x22 = 15;
        int y11 = 3;
        int y22 = 7;
        System.out.println("Введите координаты точки");
        int x = ff.nextInt();
        int y = ff.nextInt();
        Boolean P2 = x > x1 & x < x2 & y > y2 & y < y1;

        if (P2) {
            System.out.println("Точка принадлежит");

        } else {
            System.out.println("Точка не принадлежит");}


            Boolean P1 = x > x1 & x < x2 & y > y2 & y < y1;

            if (P1) {
                System.out.println("Точка принадлежит");

            } else {
                System.out.println("Точка не принадлежит");

            }
            Boolean P3 =  P1  && P2;
        }
    }


