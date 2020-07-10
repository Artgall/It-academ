package src.HomeWork1;

import java.sql.SQLOutput;

public class BitOperationsMain1 {

    public static void main(String[] args) {

        System.out.println(42 | 15); // 101010 | 1111 , result = 101111

        System.out.println(42 & 15); // result = 1010

        System.out.println(42 ^ 15); // result = 100101

        System.out.println(~ 42); // result = 010101
        System.out.println(~ 15); // result = 110000

        System.out.println(42 << 2); // result = 10101000
        System.out.println(15 << 2); // result = 111100

        System.out.println(42 >> 2); // result = 10101000
        System.out.println(15 >> 2); // result = 1010

    }
}
