package Lr1;

import java.util.Scanner;
public class example17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите втортое число: ");
        int b = sc.nextInt();
        int c = a+b;
        int d = a-b;
        System.out.println("Сумма данных чисел - "+c);
        System.out.println("Разность данных чисел - "+d);
    }
}