package HomeWork1;

import java.util.Scanner;

public class PrivetVasyaMain1 {

    public static void main(String[] args) {
        System.out.println("Как Вас зовут?");
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();

        if (x.equals("Вася")) {
            System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
        }
            else if(x.equals("Анастасия")) {
                System.out.println("Я тебя так долго ждал");
        }
            else {
                System.out.println("Добрый день, а Вы кто?");
            }
    }
}
