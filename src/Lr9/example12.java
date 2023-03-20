package Lr9;

public class example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
    // Создали блок обработчика событий с выводом сообщения ошибки описания в процедуре m
    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}