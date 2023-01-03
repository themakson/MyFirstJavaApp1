package Lr3;
public class example8 {
    public static void main(String[] args) {

        char[] mass = new char[10];
        char charA = 'A';
        int count = 0;

        while (count < 10)
        {
            if (charA == 'A' || charA == 'E' || charA == 'I' || charA == 'O' || charA == 'U' || charA == 'Y')
            {
                charA++;
                continue;
            }
            mass[count] = charA;
            count++;
            charA++;
        }
        for (char Chars : mass)
        {
            System.out.print(Chars + " ");
        }
    }
}