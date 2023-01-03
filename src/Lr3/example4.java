package Lr3;
import java.util.Scanner;
public class example4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numba = scan.nextInt();

        System.out.print("Введите второе число: ");
        int numbb = scan.nextInt();

        if (numba < numbb)
        {
            while (numba != numbb+1) {
                System.out.print(numba+" ");
                numba+=1;
            }
        }else if (numbb < numba)
        {
            while (numbb != numba+1) {
                System.out.print(numbb+" ");
                numbb+=1;
            }
        }else
            System.out.println(numba);
    }
}