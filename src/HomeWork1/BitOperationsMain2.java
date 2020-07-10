package src.HomeWork1;

public class BitOperationsMain2 {

    public static void main(String[] args) {

        System.out.println(-42 | -15); // 11010110 | 11110001 , result = 11110111

        System.out.println(-42 & -15); // result = 11010000

        System.out.println(-42 ^ -15); // result = 100111

        System.out.println(~ -42); // result = 101001
        System.out.println(~ -15); // result = 1110

        System.out.println(-42 << 2); // result = 101011000
        System.out.println(-15 << 2); // result = 11000100

        System.out.println(-42 >> 2); // result = 11110101
        System.out.println(-15 >> 2); // result = 11111100
    }
}
