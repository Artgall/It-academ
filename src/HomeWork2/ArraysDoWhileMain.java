package src.HomeWork2;

import java.util.Scanner;

public class ArraysDoWhileMain {
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
        do{
             System.out.println("Введите число: ");
             array[i] = in.nextInt();
              i++;
        } while (i < array.length) ;

        // Выводим результат
        System.out.println("В массиве " + num + " элементов: ");
        int x = 0;
        do{
            System.out.print(array[x] + " ");
            x++;
        }while (x < array.length) ;
    }
}