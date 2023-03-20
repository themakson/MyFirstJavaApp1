package Lr9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example17 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        try {
            int length_arr = scan.nextInt();
            byte[] arr = new byte[length_arr];

            for (int i = 0; i < arr.length; i++) {
                count++;
                System.out.print("Введите число типа byte #"+count+": ");
                arr[i] = scan.nextByte();
            }

            for (byte a : arr) {
                System.out.print(a +"; ");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введено некоректное значение!");
        }
    }
}