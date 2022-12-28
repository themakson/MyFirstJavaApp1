package Lr2;

import java.util.Scanner;
public class example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        sc.close();
        int b = (a - (a%1000))/1000;
        System.out.println("В веденном числе "+a +" Имеется: "+b +" тысяч(а)");
    }
}