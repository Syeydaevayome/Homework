package loop_rec2;

import java.util.Scanner;

public class Main {
    static Scanner a =new Scanner(System.in);
    public static int summ(int n){
        if (n<10){
            return n;
    }
        return n % 10 + summ(n/10);
     }

    public static void main(String[] args) {
        System.out.println("введите число");
        int x= a.nextInt();
        System.out.println(summ(x));
    }

    }

