package instanceOf;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        int x = 50;
        double y = 3.5;
        double z = x;
        int cc = (int) y;
        System.out.println(cc + " " + y);
        double q = 3200000000.0;
        int b = (int) q;
        System.out.println(b);
        Animal an = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        Animal ad = new Dog();
        Animal ac = new Cat();
        an = d;
        // d = an;
        d = (Dog) an;
        //d = ac ошибкааа компляции
        // d = (Dog)ac; ошибка исполнения
        boolean p = d instanceof Dog;
        System.out.println(p);
        if (d instanceof Animal) {
            an = d;
            System.out.println("1 все верно an = d");
        }

        if (ac instanceof Dog) {
           d = (Dog)ac;
        }else{
            System.out.println(" 2 ошибка");
        }
boolean u = c instanceof Animal;
        System.out.println(u);
        if (u){
            System.out.println("3 все верно an = c");
            an = c;
        }else{
            System.out.println("3 ошибка");
        }
    }
}
