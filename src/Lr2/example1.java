package Lr2;

import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Введите число: ");
              a = sc.nextInt();
        if (a%3 == 0) {
            System.out.println("Число" + " " + a + " " + "Делится на 3");
        } else {
            System.out.println("Число Не делится на 3");
        }
    }
}




