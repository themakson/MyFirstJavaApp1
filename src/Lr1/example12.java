package Lr1;

import java.util.Scanner;
public class example12 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ваш год рождения : ");
        int a = sc.nextInt();
        sc.close();
        int b = 2022 - a;
        System.out.println("Ваш возраст составляет - "+" "+b+" "+"года/лет");
    }
}