package home_work_3.calcs.simple;

public interface ICalculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
    double exp(double base, int exponent);
    double absolute(double a);
    double squareRoot(double a);
}