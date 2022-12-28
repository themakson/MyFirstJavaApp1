package Lr1;

import java.util.Scanner;
public class example13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут? : ");
        String a = sc.nextLine();
        System.out.println("Ваш год рождения : ");
        int b = sc.nextInt();
        sc.close();
        int c = 2022 - b;
        System.out.println("Ваше имя - "+a);
        System.out.println("Ваш возраст составляет - "+c+"года/лет");
    }
    }