package Lr2;

import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Введите число: ");
        a = sc.nextInt();
        if (a%5 == 2) {
            System.out.println("Число" + " " + a + " " + "Делится на 5 c остатком 2.");
        } else {
            System.out.println("Число Не делится на 5 с остатком 2.");
        }if (a%7 ==1) {
            System.out.println("Число" + " " + a + " " + "Делится на 7 c остатком 1.");
        } else {
            System.out.println("Число Не делится на 7 с остатком 1.");
        }

    }
}