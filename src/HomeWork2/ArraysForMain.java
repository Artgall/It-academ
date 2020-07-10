package src.HomeWork2;

import java.util.Scanner;

public class ArraysForMain {
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
            System.out.println("В массиве " + num + " элементов: ");
             for (int x = 0; x < array.length; x++){
                 System.out.print(array[x] + " ");
            }
        }
    }