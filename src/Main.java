import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] x = { 10, 20, 40, 80 };
        double[] y = { 100, 350, 1500, 6700 };
        PolynomialRegression r;
        r = new PolynomialRegression(x, y, 0);
        r = new PolynomialRegression(4);
        r.add(5,7);
//        r.add(9,7);
        r.add(x,y);

        System.out.println(r);
    }
}
