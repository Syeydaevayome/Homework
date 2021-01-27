package Group;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();
        Grooup g = new Grooup();
        g =s;
        g = t;

        boolean b = t instanceof Teacher;
        System.out.println(t);
        if (t instanceof Grooup){
             t =(Teacher) g;
        }
        if(s instanceof Grooup){
            s =(Student) g;
        }else{
            System.out.println("mistake");
        }
    }
}
