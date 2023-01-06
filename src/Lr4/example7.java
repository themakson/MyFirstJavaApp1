package Lr4;
public class example7
{
    public static void main(String[] args)
    {
        int arr_i = 6;
        int arr_j = 6;
        int a = 0, c = 1;
        int b = 0;
        int y = arr_j;
        int i = arr_i;
        int j = arr_j-1;

        int[][] arr_2 = new int[arr_i][arr_j];

        for (;a<arr_j;)
        {
            while (i>b)
            {
                if (b==y) {break;}
                arr_2[a][b] = c;
                b++;
                c++;
            }


            while (j >= 0)
            {
                if (arr_2[j][y-1] != 0) {break;}
                arr_2[j][y-1] = c;
                c++;
                j--;
            }

            a++;
            y--;
            b = 0;
            j = arr_j-1;

        }

        for(int[] row: arr_2)
        {
            for(int element: row)
            {
                if (element<10)
                {
                    System.out.print(element+"  ");
                }else
                {
                    System.out.print(element+" ");
                }
            }
            System.out.println();
        }
    }
}