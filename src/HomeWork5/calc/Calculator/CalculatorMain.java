import java.text.DecimalFormat;

public class CalculatorMain {
    public static void main(String[] args) {

        CalculatorWithOperator calc = new CalculatorWithOperator();

        //форматирование числа
        DecimalFormat df = new DecimalFormat("#.##");

        double a = calc.multiply(15,7);
        double b = calc.div(28,5);
        double c = calc.power(b, 2);
        double d = calc.plus(4.1, a);
        double result = calc.plus(d, c);

        System.out.println("4.1 + 15 * 7 + (28 / 5) ^ 2 = " + df.format(result));

        System.out.println(calc.div(result, 0));  //При делении double на 0, получается бесконечность
        System.out.println(calc.div(result, 0.0d)); //Если положительное число делить на 0.0 ,получится плюс бесконечность, отрицательно - минус бесконечность
    }
}