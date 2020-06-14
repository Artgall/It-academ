package HomeWork3.SortMerge;

import java.util.Arrays;

public class SortMergeMain {
    public static void main(String[] args) {
        // Создаём массив
        int[] array = new int[]{3, 5, 2, 8, 1, 4, 6, 7, 9};
        int[] arrayRes = SortMerge.sortMerge(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayRes));
    }
}
