package Lr6;

class Averag {
    static public float aver(int[] ints) {
        float xcv = 0;
        for (int anInt : ints) {
            xcv += anInt;
        }
        return xcv / ints.length;
    }
}

public class example8 {
    public static void main(String[] args) {
        System.out.println(Averag.aver(new int[]{1, 2, 3, 4, 5}));
    }
}