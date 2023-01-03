package Lr3;
import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {

        String firstText = "Размер Массива: ";

        Scanner scanner = new Scanner(System.in);
        System.out.println(firstText);

        if(scanner.hasNextInt()) {

            int n = Integer.parseInt(scanner.next());
            if (n <= 0){
                System.out.println("Этого значения не достаточно");
                System.exit(0);
            }
            int[] arrDigits = new int[n];

            int k = 0;                                  // индекс числа который равен i % 5 == 2
            double valSquare = 2;                       // сила двух
            double p = (double) n;                      // длина массива в двойном уменьшении
            double limitDigit = Math.pow(p, valSquare);  // мощность длины массива
            int digit = (int) limitDigit + 5;            // предел значений массива

            for (int i = 0; i <= digit; i++) {
                if (i % 5 == 2) {
                    arrDigits[k] = i;
                    k++;
                    if (k >= n) {
                        break;
                    }
                }
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arrDigits[j] + "\t");
            }
        } else {
            System.out.println("Это не цифра! Пока.");
        }
    }
}