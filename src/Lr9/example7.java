package Lr9;

public class example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");

            // Перехват ошибки в catch
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e2) {
                System.out.println("Перехват ошибки в catch: " + e2);
            }

        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}