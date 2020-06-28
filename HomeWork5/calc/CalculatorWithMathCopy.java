package HomeWork5.CalculatorWithMathCopy;

public class CalculatorWithMathCopy {

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
    public double multiply (double a, double b) {
        return a * b;
    }


    // Метод возведения в степень
    public double power (double a, double b) {
        return Math.pow(a, b);
    }
    // Метод модуль числа
    public double abs (double a) {
        return Math.abs(a);
    }
    // Метод извлечение квадратного корня
    public double root(double a) {
        return Math.sqrt(a);
    }
}