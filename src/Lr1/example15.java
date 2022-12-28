package Lr1;

import java.util.Scanner;
public class example15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Сумма этих чисел равна - "+c);
    }
}
