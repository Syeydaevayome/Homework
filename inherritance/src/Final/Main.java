package Final;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
       int x = 10;
       // x ++;
        System.out.println(x);
        //Human h1 = new Human("Artem", "порика 18", "", "")
        Human h2 = new Human(45);
       final Human h3 = new Human(8);
        h3.birthday = 23;
       final int x1 = fabrica(100);
        System.out.println(x1);
    }
   static int fabrica (int range){
        return(int) (Math.random()*range);
    }
}
class Human {
    static final  String NAME = "Daniel";
    String address;
    int weight;
   int birthday ;

    public Human( String NAME ,String address, int weight, int birthday) {
        this.address = address;
        this.weight= weight ;
        this.birthday = birthday;
    }

    public Human(int weight) {
        this.weight = weight;
    }
}