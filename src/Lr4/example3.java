package Lr4;

public class example3 {
    public static void main(String[] args) {
        int twoD[][]=new int [4][8];
        int i,j,k =0 ;

        for (i=0; i<4; i++)
            for (j=0; j<8; j++){
                twoD[i][j] = k;
                k=2;
            }

        for (i=0; i<4; i++){
            for(j=0; j<8; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }
    }
    }

