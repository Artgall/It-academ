package HomeWork2;

import java.util.Scanner;

//Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль
public class TableMain3 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        // Устанавливаем ограничения числа
        if (num > 999999999) {
            System.out.println("Число слишком большое");
            return;
        }
        if (num == 0) {
            System.out.println("Число не может быть 0");
            return;
        }

        int res = 1;

        // Разбиваем число на цифры с помощью остатка от деления на 10
        while (num != 0 ){
            res *= num % 10;
            num /= 10;
            if (num!=0) {
                System.out.println("Ход вычисления: " + res + " * " + (num % 10) + " = " + (res * (num % 10)));
            }
        }
        System.out.println("Результат: " + res);
    }
}