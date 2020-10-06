package less9;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    static Scanner v = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = v.nextInt();
        String w;
        switch (a) {
            case 0: w = "zero";
            break;
            case 1: w = "one";
                break;
            case 2: w = "two";
                break;
            case 3: w = "three";
                break;
            case 4: w = "four";
                break;
            case 5: w = "five";
                break;
            case 6: w = "six";
                break;
            case 7: w = "seven";
                break;
            case 8: w = "eight";
                break;
            case 9: w = "nine";
                break;
            default:
                w = "ошибка ввода";
        }
        System.out.println(w);
    }
}
