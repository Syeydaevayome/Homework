package less5;

public class Main {
    public static void main(String[] args) {
        Boolean x = false;
        Boolean y = false;
        Boolean z = true;
        Boolean t1 = !x & !y;
        System.out.println(t1);
        Boolean t2 = !x & !y | z ;
        System.out.println(t2);
        Boolean t3 = x |(!y &!z);
        System.out.println(t3);
    }
}
