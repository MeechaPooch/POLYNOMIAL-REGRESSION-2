public class Main {
    public static void main(String[] args) {
        double[] x = { 10, 20, 40, 80 };
        double[] y = { 100, 350, 1500, 6700 };
        PolynomialRegression regression = new PolynomialRegression(x, y, 3);

        // Use System.out.println() so that it works with either stdlib.jar or algs4.jar version
        System.out.println(regression);
    }
}
