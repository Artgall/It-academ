package HomeWork2;

import java.util.Scanner;

public class ArraysEverySecondMain {
    public static void main(String[] args) {

        // Создаём пустой массив
        int [] array;

        // Присваиваем массиву колличество элементов
        Scanner in = new Scanner(System.in);
        System.out.println("Введите колличество элементов в массиве: ");
        int num = in.nextInt();
        array = new int[num] ;

        // Заполняем массив
        for (int i = 0; i < num; i++) {
            System.out.println("Введите число: ");
            array[i] = in.nextInt();
        }

        // Выводим результат
        System.out.println("В массиве " + num + " элементов. Выводим каждый второй: ");
        for (int x = 1; x < array.length; x+=2){
            System.out.print(array[x] + " ");
        }
    }
}
