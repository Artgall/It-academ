package HomeWork3.SortMerge;

import static HomeWork3.SortMerge.Merge.merge;

public class SortMerge {

    // Функция для расщипления массива
    public static int[] sortMerge(int[] array) {
        if (array.length < 2) {
            return array;
        }
        // Делим массив пополам снова и снова. Заносим элементы в новые массивы
        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - array.length / 2];
        System.arraycopy(array, 0, left, 0, array.length / 2);
        System.arraycopy(array, array.length / 2, right, 0, array.length - array.length / 2);

        // Обращаемся к слиянию
        return merge(sortMerge(left), sortMerge(right));
    }
}
