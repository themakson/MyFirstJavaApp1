package Lr4;

import java.util.Random;

public class example6
{
    public static void main(String[] args)
    {
        int x = -1, y = -1;
        int arr_i = 4;
        int arr_j = 4;

        Integer[][] arr_b = new Integer[arr_i][arr_j];

        Integer[][] arr_a = new Integer[arr_i-1][arr_j-1];

        Random rand = new Random();

        massprinter print = new massprinter();

        int del_row = rand.nextInt(0, arr_i);
        int del_column = rand.nextInt(0, arr_j);

        for(int i=0;i<arr_i;i++)
        {
            for (int j=0;j<arr_j;j++)
            {
                arr_b[i][j] = rand.nextInt(0, 10);
            }
        }


        print.pprint(arr_b);


        for(int i=0;i<arr_i;i++)
        {
            if(i==del_row) {continue;}
            x++;
            for (int j=0;j<arr_j;j++)
            {
                if(j==del_column) {continue;}
                y++;
                arr_a[x][y] = arr_b [i][j];
            }
            y = -1;
        }
        System.out.println("\nDelete column: "+del_column+"\nDelete row:"+del_row+"\n");

        print.pprint(arr_a);
    }
}

class massprinter
{
    public void pprint(Integer[][] arr)
    {
        for(Integer[] row: arr)
        {
            for(int element: row) {System.out.print(element);}
            System.out.println();
        }
    }
}

