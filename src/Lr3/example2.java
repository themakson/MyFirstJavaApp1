package Lr3;
import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите назавние дня недели: ");
        String a = sc.nextLine();
        String dotw;
        switch (a){
            case "понедельник":
                dotw = "1 числу в списке дней недели";
                break;
            case "вторник":
                dotw = "2 числу в списке дней недели";
                break;
            case "среда":
                dotw = "3 числу в списке дней недели";
                break;
            case "четверг":
                dotw = "4 числу в списке дней недели";
                break;
            case "пятница":
                dotw = "5 числу в списке дней недели";
                break;
            case "суббота":
                dotw = "6 числу в списке дней недели";
                break;
            case "воскресенье":
                dotw = "7 числу в списке дней недели";
                break;
            default:
                dotw = "неккоректому числу дня недели";
        }System.out.println(
                "Ваш день недели относится к " + dotw);
    }
}
