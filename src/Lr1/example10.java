package Lr1;

import java.util.Scanner;
public class example10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Какой сегодня день недели? : ");
        String a = sc.nextLine();
        System.out.println("А месяц ? : ");
        String b = sc.nextLine();
        System.out.println("Ну и число сегодняшнее : ");
        int c = sc.nextInt();
        System.out.println("Сегодня следующий день недели - "+a);
        System.out.println("Сегодня следующий месяц - "+b);
        System.out.println("Сегодня следующее число - "+c);





    }
}
