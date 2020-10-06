package less10;

import java.util.Scanner;

public class Main {
    static Scanner aa = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = aa.nextInt();
        String c ;
        switch (a) {
            case 1:
                c = "понедельник";
                break;
            case 2:
                c = "вторник";
                break;
            case 3:
                c = "среда";
                break;
            case 4:
                c = "четверг";
                break;
            case 5:
                c = "пятница";
                break;
            case 6:
                c = "суббота";
                break;
            case 7:
                c = "воскресенье";
                break;

            default:
                c = "ошибка ввода";

        }
        System.out.println(c);
    }
}
