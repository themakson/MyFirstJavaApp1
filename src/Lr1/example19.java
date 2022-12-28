package Lr1;

import java.util.Scanner;

class example19{
    static double c , j;

    public static double hyp(double a, double b) {
        return c = Math.sqrt(a * a + b * b);
    }

    public static double form(double a, double b){
        return j = Math.exp(b*Math.log(a));
    }

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert katet: ");
            double a = sc.nextDouble();
            System.out.println("Insert katet 2: ");
            double b = sc.nextDouble();
            sc.close();
            System.out.println("katet а=" + a);
            System.out.println("katet b=" + b);
            System.out.println("hypotenuse с=" + hyp(a,b));
            System.out.println("formula iz 11 zadaniya j=" + form(a,b));
        }
    }
}
