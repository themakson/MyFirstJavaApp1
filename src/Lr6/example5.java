package Lr6;

class Suma {
    static public long quadSum(long n) {
        long xcv = 0;
        for (long i = 1; i <= n; i++) {
            xcv += i * i;
        }
        return xcv;
    }
}

public class example5 {
    public static void main(String[] args) {
        var n = 3;
        var result = Suma.quadSum(n);
        System.out.println("result: " + result);

        var check = n*(n + 1)*(2 * n + 1) / 6;
        System.out.println("real answer: " + check);


    }
}