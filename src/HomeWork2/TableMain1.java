package src.HomeWork2;

//Вывести таблицу умножения в консоль

public class TableMain1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("");
        }
    }
}