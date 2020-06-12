package HomeWork3;

public class SortChoiceMain {
    public static void main(String[] args) {

        // Создаём массив
        int[] array = new int[]{3, 5, 2, 8, 1, 4, 6, 7, 9};

        // Начинаем сортировку выбором
        for (int left = 0; left < array.length; left++) {
            int min = left;

            // Выбор минимального элемента
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[min]) {
                    min = i;
                }
            }

            // Меняем минимальный элемент с первым элементом в не отсортированной части
            int swap = array[left];
            array[left] = array[min];
            array[min] = swap;
        }

        // Выводим результаты промежуточной сортировки и её итог
        System.out.println(" ");
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}