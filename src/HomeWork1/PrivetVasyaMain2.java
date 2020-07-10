package src.HomeWork1;

import java.util.Scanner;

public class PrivetVasyaMain2 {
    public static void main(String[] args) {

        System.out.println("Как Вас зовут?");

        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        switch (x) {
            case ("Вася"):
                System.out.println("Привет!" + "\n" + "Я тебя так долго ждал");
                break;
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
    }
}
