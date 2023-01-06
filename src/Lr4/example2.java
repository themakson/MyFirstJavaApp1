package Lr4;

public class example2 {
    public static void main(String[] args) {
        int figure = 20; // число строк которое необходимо вывести
        int i ; // переменная задает число, необходимое для расчета количества строк
        int j ; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        for (i = 5 ; i <= figure; i++){
            System.out.print("+");
            for (j = 20; j > i; j--){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
