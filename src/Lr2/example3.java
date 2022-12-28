package Lr2;

import java.util.Scanner;
public class example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Введите число: ");
        a = sc.nextInt();
        if (a%4 == 0) {
            System.out.println("Число" + " " + a + " " + "Делится на 4.");
        } else {
            System.out.println("Число Не делится на 4.");
        }if (a<10) {
            System.out.println("И это число Меньше 10");
        } else {
            System.out.println("И это число Больше 10");
        }

    }
}