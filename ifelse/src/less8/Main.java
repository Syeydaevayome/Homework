package less8;

import java.util.Scanner;

public class Main {
    static Scanner n=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите целое число"); // бех сохранения переменной
        int a = n.nextInt();
        System.out.println(a % 2 ==0 ? "четное" : "нечетное" );

        System.out.println("Введите целое число"); // с сохранением переменой
        int b = n.nextInt();
        String s = (b % 2 ==0 ? "четное" : "нечетное" );
        System.out.println(s);


    }
}
