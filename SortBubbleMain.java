package HomeWork3;

public class SortBubbleMain {
    public static void main(String[] args) {

        // Создаём массив
        int[] array = new int[]{3, 5, 2, 8, 1, 4, 6, 7, 9};

        // Флажок о том что массив отсортирован
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            // Сортируем массив пузырьком
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int swap = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = swap;
                    isSorted = false;
                }
            }

            // Выводим результаты промежуточной сортировки и её итог
            System.out.println(" ");
            for (int x : array){
                System.out.print(x + " ");
            }
        }
    }
}