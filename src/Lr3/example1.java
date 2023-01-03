package Lr3;
import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int day = sc.nextInt();
        String dotw;
        switch (day){
            case 1:
                dotw = "понедельнику";
                break;
            case 2:
                dotw = "вторнику";
                break;
            case 3:
                dotw = "среде";
                break;
            case 4:
                dotw = "четвергу";
                break;
            case 5:
                dotw = "пятнице";
                break;
            case 6:
                dotw = "субботе";
                break;
            case 7:
                dotw = "воскресенью";
                break;
            default:
                dotw = "неккоректному для дня недели значение";
        }System.out.println(
                "Ваше число относится к " + dotw);
    }
}