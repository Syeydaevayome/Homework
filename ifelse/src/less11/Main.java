package less11;

import java.util.Scanner;

public class Main {
    static Scanner v = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = v.nextInt();
        String w;
        switch (a) {
            case 1:
                w = " январь,31";
                break;
            case 2:
                w = " февраль,28";
                break;
            case 3:
                w = "март 31";
                break;


            case 4:
                w = "апрель 30";
                break;
            case 5:
                w = "май 31";
                break;
            case 6:
                w = "июнь 30";
                break;
            case 7:
                w = "июль 31";
                break;
            case 8:
                w = "август 30";
                break;
            case 9:
                w = "сентябрь 31";
            case 10:
                w = "октябрь 30";
                break;
            case 11:
                w = "ноябрь 31";
                break;
            default:
                w = "ошибка ввода";
        }
    }
}