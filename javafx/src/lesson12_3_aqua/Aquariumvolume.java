package lesson12_3_aqua;

public class Aquariumvolume {
    public static void main(String[] args) {
        Aquarium aq1 = new Aquarium(50, 60, 90);
        Aquarium aq2 = new Aquarium (40, 70, 100);
        Aquarium aq3 = new Aquarium (45, 90, 120);
        int fish = 10;
        double water = 9;
        double allWater = fish * water;
        double f1 = aq1.Aquariumvolume();
        double f2 = aq2.Aquariumvolume();
        double f3 = aq3.Aquariumvolume();

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);


        if (f1 >= allWater) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
