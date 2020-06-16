package HomeWork3;

import java.util.Arrays;

public class SortInsertionMain {
    public static void main(String[] args) {

        // Сортировка включением
        int[] array = new int[]{3, 5, 2, 8, 1, 4, 6, 7, 9};
        for (int i = 1; i < array.length; ++i) {
            int key = array[i];
            int x = i - 1;
            while (x >= 0 && array[x] > key) {
                array[x + 1] = array[x];
                x = x - 1;
            }
            array[x + 1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}