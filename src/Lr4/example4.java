package Lr4;

public class example4 {
    public static void main(String[] args) {
        int twoD[][]=new int [10][10];
        int i,j,k =0 ;

        for (i=0; i<10; i++)
            for (j=0; j<10; j++){
                twoD[i][j] = k;
                k=2;
            }

        for (i=0; i<10; i++){
            for(j=0; j<i; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
}
