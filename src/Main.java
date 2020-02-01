import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] x = { 10, 20, 40, 80 };
        double[] y = { 100, 350, 1500, 6700 };
        PolynomialRegression regression = new PolynomialRegression(x, y, 0);

        regression.add(4,regression.predict(4));
        regression.clear();
        System.out.println(regression);
        System.out.println(Arrays.toString(regression.getCoefficients()));
    }
}
