package Lr6;

class Factorial {
    static public long doubleFactorial(int n) {
        long xcv = 1;
        for (int i = n; i >=1; i-=2) {
            xcv *= i;
        }
        return xcv;
    }
}

public class example4 {
    public static void main(String[] args) {
        System.out.println(Factorial.doubleFactorial(5)); // = 15
    }
}