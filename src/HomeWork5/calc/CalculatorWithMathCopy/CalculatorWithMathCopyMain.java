package HomeWork5.CalculatorWithMathCopy;

import java.text.DecimalFormat;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

        //форматирование числа
        DecimalFormat df = new DecimalFormat("#.##");

        double a = 4.1;
        double b = calc.multiply(15,7);
        double c = calc.div(28,5);
        double d = calc.power(c,2);
        double e = calc.plus(b, d);
        double result = calc.plus(a, e);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + df.format(result));

        System.out.println(calc.div(result, 0));  //При делении double на 0, получается бесконечность
        System.out.println(calc.div(result, 0.0d)); //Если положительное число делить на 0.0 ,получится плюс бесконечность, отрицательно - минус бесконечность
    }
}