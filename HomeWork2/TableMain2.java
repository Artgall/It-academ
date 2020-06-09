package HomeWork2;

import java.util.Scanner;

// Перемножить числа от 1 до числа (включительно) введеннго через аргумент к исполняемой программе
public class TableMain2 {
    public static void main(String[] args) {

        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num >20) {
            System.out.println("Число не может быть больше 20");
            return;
        }
        if (num == 0) {
            System.out.println("Число не может быть 0");
            return;
        }
        long res = 1;
        for (int a = 1; a <= num; a++) {
            res *= a;
        }
        System.out.println("Результат: " + res);
    }
}