package src.HomeWork4;

import java.util.Scanner;

public class HanoiTowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество колец, минимум 3: ");
        int ring = scanner.nextInt();
        int ringCount = 3;

        if (ring < 3){
            System.out.println("Колец может быть минимум 3.");
            return;
        }

        int[][] towers = new int[ring][ringCount];

        for (int i = 0; i < towers.length; i++) {
            towers[i][0] = i + 1;
    }
        printTowers(towers);

        while (!checkEndGame(towers)){
            int choice = nextChoise();
            if (choice == 7){
                System.out.println("Жаль.");
            }
            int[] indexs = getIndexForChoice(choice);
            moveElement(indexs[0], indexs[1], towers);
            printTowers(towers);
        }
    }

    /**
     * Проверяем закончена ли игра
     * @param towers
     * @return true - закончена, false - нет
     */
    public static boolean checkEndGame(int [][] towers){
        for (int i = 0; i < towers.length; i++) {
            if (towers[i][towers.length - 1] == 0){
                System.out.println("Игра не закончена.");
                return false;
            }
        }
        return true;
    }

    public static int[] getIndexForChoice(int choice){
        int from = -1, to = -1;
        switch (choice){
            case 1:
                from = 0;
                to = 1;
                break;
            case 2:
                from = 0;
                to = 2;
                break;
            case 3:
                from = 1;
                to = 0;
                break;
            case 4:
                from = 1;
                to = 2;
                break;
            case 5:
                from = 2;
                to = 0;
                break;
            case 6:
                from = 2;
                to = 1;
                break;
        }
        return new int[] { from, to };
    }


    public static int nextChoise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите куда будем перемещать кольцо: ");
        System.out.println("1. 1 ->> 2");
        System.out.println("2. 1 ->> 3");
        System.out.println("3. 2 ->> 1");
        System.out.println("4. 2 ->> 3");
        System.out.println("5. 3 ->> 1");
        System.out.println("6. 3 ->> 2");
        System.out.println("7. Выйти из игры.");

        return scanner.nextInt();
    }
    /**
     * Перемещение колец
     * @param from откуда
     * @param to куда
     * @param towers
     */
    public static void moveElement(int from, int to, int[][] towers){
        if (from < 0  || to < 0){
            System.out.println("Нет такого варианта.");
            return;
        }

        for (int i = 0; i < towers.length; i++) {
            int fromValue = towers[i][from];
            if (fromValue != 0){
                for (int j = 0; j < towers.length; j++) {
                    int toValue =  towers[j][to];
                    if (j == 0 && toValue != 0){
                        System.out.println("Штырь " + (to + 1) + " переполнен.");
                        continue;
                    } else if (toValue < fromValue && toValue != 0){
                        System.out.println("Со штыря " + (from + 1) + " на штырь " + (to + 1) + " нельзя переместить кольцо.");
                        continue;
                    } else if (toValue > fromValue){
                        towers[i][from] = 0;
                        towers[j - 1][to] = fromValue;
                        break;
                    }else if (j + 1 == towers.length){
                        towers[i][from] = 0;
                        towers[j][to] = fromValue;
                    }
                }
                break;
            }
        }
    }

    // Вывод поля на экран
    public static void printTowers(int[][] towers) {
        for (int i = 0; i < towers.length; i++) {
            for (int j = 0; j < towers[i].length; j++) {
                int value = towers[i][j];
                if (value == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(value + " ");
                }
            }
                System.out.println();
        }
    }
}
