package pac1;

public class SumPR {
    int a1;
    int d;
    static int n;
    SumPR(int a, int b){
        a1 =a;
        d = b;
    }
    double sum (int a, int b, int n){
        double s = ( 2 *(double)a + d* (n-1))/2*n;
        return s;
    }
}
