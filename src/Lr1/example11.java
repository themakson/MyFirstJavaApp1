package Lr1;

import java.util.Scanner;
public class example11 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Какой сейчас месяц? : ");
        String a = sc.nextLine();
        System.out.println("Сколько дней в этом месяце? : ");
        int b = sc.nextInt();
        System.out.println("Сегодня следующий месяц - "+a);
        System.out.println("В текущем месяце - "+b+" "+"(дней/день)");
    }
    }