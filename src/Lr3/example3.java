package Lr3;
import java.util.Scanner;
public class example3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел последовательнотси: ");
        int a = sc.nextInt();
        int[] mass = new int[a];
        switch(a)
        {
            case(1):
                mass[0] = 1;
                break;
            default:
                mass[0] = 1;
                mass[1] = 1;

                for (int i = 2; i < mass.length; ++i)
                {
                    mass[i] = mass[i - 1] + mass[i - 2];
                }

        }
        for (int i = 0; i < mass.length; ++i)
        {
            System.out.print(mass[i]+" ");
        }
    }
}