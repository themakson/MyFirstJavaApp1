package Lr1;

import java.util.Scanner;
public class example8 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите Фамилию : ");
        String a = sc.nextLine();
        System.out.println("Введите Имя : ");
        String b = sc.nextLine();
        System.out.println("Введите Отчество : ");
        String c = sc.nextLine();
        System.out.println("Hallo <"+a+","+b+","+c+">.");
    }
}