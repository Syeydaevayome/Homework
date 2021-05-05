package lesson12_4_aqua;

import lesson12_3_aqua.Aquarium;

import java.util.Scanner;

public class AquariumVolume {
    static Scanner a = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" length = ");
        int length = a.nextInt();
        System.out.println(" width = ");
        int width = a.nextInt();
        System.out.println("height = ");
        int height = a.nextInt();
    Aquarium aq = new Aquarium(length, width, height);
    int fish = 10;
    double water = 9;
    double allWater = fish * water;
     double f = aq.AquariumVolume(length, width, height);

        System.out.println(f);

        if (f >= allWater) {
        System.out.println("+");
    } else {
        System.out.println("-");
    }
}
}
