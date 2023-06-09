package lr12.Part1;

import java.util.List;
import java.util.stream.Collectors;
public class example3 {
    public static void main(String[] args) {
        String string = "Напишите функцию Которая принимает на вход список " +
                "строк и возвращает новый список, Содержащий только те строки, " +
                "который Начинаються с большой буквы. ";
        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Cтрока после сплитования : " + "\n");
        for (String e: strings){
            System.out.println(e);
        }

        List<String> stringAfter = filterCapitalizedString(strings);
        System.out.println("\n" + "Cтрока после преобразования : " + "\n");

        for (String e: stringAfter){
            System.out.println(e);
        }
    }

    private static List<String> filterCapitalizedString(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}