package Lr9;

import java.util.Random;
import java.util.Scanner;

public class example16 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк в массиве: ");
            int line_array = scan.nextInt();
            System.out.print("Введите количество столбцов  в массиве: ");
            int column_array = scan.nextInt();

            int[][] array = new int[line_array][column_array];

            for (int i = 0; i < line_array; i++){
                for (int j = 0; j < column_array; j++){
                    array[i][j] = random.nextInt(10);
                }
            }

            for(int[] row: array)
            {
                for(int element: row)
                    System.out.print(element+" ");
                System.out.println();
            }

            System.out.print("Какой столбец вывести из массива: ");
            int numb = scan.nextInt() - 1;

            for (int i = 0; i < line_array; i++){
                System.out.println(array[i][numb]);
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Число вышло за пределы массива");
        } catch (Exception e){
            System.out.println("Введено некорректное число");
        }
    }
}