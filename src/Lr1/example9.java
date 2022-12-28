package Lr1;

import java.util.Scanner;
public class example9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите Имя : ");
        String a = sc.nextLine();
        System.out.println("Введите ваш возраст : ");
        int b = sc.nextInt();
        System.out.println("Вас зовут - "+a+", а ваш возраст составляет целых"+" "+b+" "+"полных лет.");
    }
}
