package Lr3;

public class example7 {
    public static void main(String[] args) {

        char[] mass = new char[10];
        char charA = 'A';
        int count = 0;
        int a = 10;

        while (count < a)
        {
            mass[count] = charA;
            charA +=2;
            count++;
        }

        for (char Chars : mass)
        {
            System.out.print(Chars + " ");
        }
        System.out.println();

        for (int i = a-1; i >= 0 ; i--)
        {
            System.out.print(mass[i] + " ");
        }
    }
}