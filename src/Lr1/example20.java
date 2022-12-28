package Lr1;

import java.util.Scanner;
class example20 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            double a = sc.nextDouble();
            System.out.println("Дайте числу степень: ");
            int b = sc.nextInt();
            sc.close();
            System.out.println("квадрат числа а=" + Math.pow(a, b));
        }
    }
}