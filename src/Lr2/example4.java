package Lr2;

import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Введите число: ");
        a = sc.nextInt();
        if (a>=5 && a <=10) {
            System.out.println("Число" + " " + a + " " + "Входит в диапозон от 5 до 10 включительно");
        } else {
            System.out.println("Число" + " " + a + " " + "Не входит в этот диапазон");
        }
    }
}