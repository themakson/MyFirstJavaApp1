package Lr4;
import java.util.Random;

public class example5
{
    public static void main(String[] args)
    {

        int arr_i = 5;
        int arr_j = 5;
        int Mass;

        Integer[][] arra = new Integer[arr_i][arr_j];

        massprint print = new massprint();

        Random rand = new Random();

        for(int i=0;i<arr_i;i++)
        {
            for (int j=0;j<arr_j;j++)
            {
                arra[i][j] = rand.nextInt(0, 10);
            }
        }

        print.pprint(arra);

        for(int i=0;i<arr_i;i++)
        {
            for (int j=0;j<arr_j;j++)
            {
                if (i!=j)
                {
                    Mass = arra[i][j];
                    arra[i][j] = arra[j][i];
                    arra[j][i] = Mass;
                }else {break;}
            }
        }

        System.out.println();

        print.pprint(arra);
    }
}

class massprint
{
    public void pprint(Integer[][] arrb)
    {
        for(Integer[] row: arrb)
        {
            for(int element: row) {System.out.print(element);}
            System.out.println();
        }
    }
}