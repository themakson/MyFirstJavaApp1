package Lr1;

import java.util.Scanner;
public class example14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Какой ваш возраст? : ");
        int a = sc.nextInt();
        sc.close();
        int b = 2022 - a;
        System.out.println("Ваш год рождения - "+b);
    }
}
