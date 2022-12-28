package Lr1;

import java.util.Scanner;
public class example16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        sc.close();
        int b = a-1;
        int c = a+1;
        int d = a*a+b*b+c*c+2*a*b+2*a*c+2*b*c;
        System.out.println("Последовательность из 4 чисел - "+b+","+a+","+c+","+d);
    }
}
