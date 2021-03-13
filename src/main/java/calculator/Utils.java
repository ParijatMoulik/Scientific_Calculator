package calculator;

public class Utils {
    double SquareRoot(double a) {

        double res =Math.sqrt(a);
        return res;
    }
    double Factorial(double a) {

        return (a == 1 || a == 0) ? 1 : a * Factorial(a - 1);
    }
    double Logarithm(double a) {
        double res =Math.log(a);
        return res;
    }
    double Power(double a, double b) {
        double res =Math.pow(a,b);
        return res;
    }
}
