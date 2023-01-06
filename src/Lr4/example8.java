package Lr4;
import java.util.Scanner;

public class example8
{
    static class Cesar
    {
        public static final String alphabet = "abcdefghijklmnopqrstuvwxyz";

        public static String Encrypt(String text, int shift)
        {
            String result = "";
            for (int i = 0; i < text.length(); i++)
            {
                result = result + Cesar.shift(text.charAt(i), shift);
            }
            return result;
        }

        private static char shift(char symbol, int shift)
        {
            if (alphabet.indexOf(symbol) != -1) {
                var oldIndex = alphabet.indexOf(symbol);
                var newIndex = (oldIndex + shift) % alphabet.length();
                return alphabet.charAt(newIndex);
            }

            return symbol;
        }
    }

    public static void main(String[] args)
    {
        Scanner id = new Scanner(System.in);

        System.out.print("Введите текст шифрования: ");
        String text = id.nextLine();
        text = text.toLowerCase();

        System.out.print("Введите ключ: ");
        int shift = id.nextInt();

        System.out.print("Текст после преобразоания: ");
        var encryptedText = Cesar.Encrypt(text, shift);
        System.out.println(encryptedText);

        System.out.print("Выполнить обратное преобразование? (y/n): ");
        char decrypt = id.next().charAt(0);

        switch (decrypt)
        {
            case ('y'):
            {
                System.out.print("Обратное преобразоание: ");
                var decryptedText = Cesar.Encrypt(encryptedText, Cesar.alphabet.length() - shift);
                System.out.println(decryptedText);
                break;
            }
            case ('n'):
            {
                System.out.print("Пока!");
                break;
            }
            default:
                System.out.print("Введите праильный ответ!");
        }

    }
}