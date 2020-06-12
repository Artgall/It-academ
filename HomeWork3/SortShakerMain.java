package HomeWork3;

public class SortShakerMain {
    public static void main(String[] args) {

        // Создаём массив
        int[] array = new int[]{3, 5, 2, 9, 1, 4, 6, 7, 8};

        int left = 0;
        int right = array.length - 1;

        do {
            // Идём вправо ищем МАКС. значение
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            right--; // Уменьшаем диапозон для сортировки справа

            // Идём в обратную сторону ищем МИН. значение
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            left++; // Уменьшаем диапозон для сортировки слева

            // Выводим результаты промежуточной сортировки и её итог
            System.out.println(" ");
            for (int x : array){
                System.out.print(x + " ");
            }
        } while (left < right); // Условие при котором будут происходить проходы
    }
}