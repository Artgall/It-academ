package HomeWork2;

import java.util.Scanner;

public class ArraysWhileMain {
    public static void main(String[] args) {

        // Создаём пустой массив
        int [] array;

        // Присваиваем массиву колличество элементов
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество элементов в массиве: ");
        int num = in.nextInt();
        array = new int[num] ;

        // Заполняем массив
        int i = 0;
        while (i < array.length) {
            System.out.println("Введите число: ");
            array[i] = in.nextInt();
            i++;
        }

        // Выводим результат
        System.out.println("В массиве " + num + " элементов: ");
        int x = 0;
        while (x < array.length) {
            System.out.print(array[x] + " ");
            x++;
        }
    }
}