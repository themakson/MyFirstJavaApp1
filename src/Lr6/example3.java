package Lr6;

class Matha {
    static int max(int... args) {
        var xcv = Integer.MIN_VALUE;
        for (int arg : args) {
            xcv = Math.max(xcv, arg);
        }
        return xcv;
    }

    static int min(int... args) {
        var xcv = Integer.MAX_VALUE;
        for (int arg : args) {
            xcv = Math.min(xcv, arg);
        }
        return xcv;
    }

    static int avg(int... args) {
        var xcv = 0;
        for (int arg : args) {
            xcv += arg;
        }
        return xcv / args.length;
    }
}

public class example3 {
    public static void main(String[] args) {
        System.out.println("max(1,2,3):" + Matha.max(1, 2, 3));
        System.out.println("min(1,2,3):" + Matha.min(1, 2, 3));
        System.out.println("avg(1,2,3):" + Matha.avg(1, 2, 3));
    }
}