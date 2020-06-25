package HomeWork5;

public class CalculatorWithOperator {
    public CalculatorWithOperator() {
    }

    // Метод сложения
    public double plus (double a, double b) {
        return a + b;
    }
    // Метод вычитания
    public double minus (double a, double b) {
        return a - b;
    }
    // Метод деления
    public double div (double a, double b) {
        return a / b;
    }
    // Метод умножения
    public double myltiply (double a, double b) {
        return a * b;
    }
    // Метод возведения в степень
    public double power (double a, double b) {
        double result = 1;
        for (int i = 0; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    // Метод модуль числа
    public double abs (double a) {
        return (a > 0) ? a : a * -1.0;
    }
    // Метод извлечение квадратного корня
    public double root(double a) {
        int b = 32;
        double result = a / 3;
        if (a <= 0) return 0;
        for (int i = 0; i < b; i++)
            result = (result + a / result) / 2;
        return result;
    }
}