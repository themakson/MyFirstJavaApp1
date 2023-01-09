package Lr6;
import java.util.Arrays;

class Statistic {
    static public int[] stats(int[] ints) {
        var max = Integer.MIN_VALUE;
        var min = Integer.MAX_VALUE;
        for (int i = 0; i < ints.length; i++) {
            max = Math.max(max, ints[i]);
            min = Math.min(min, ints[i]);

        }
        return new int[]{max, min};
    }
}

public class example10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Statistic.stats(new int[]{1, 2, 3, 4, 5})));
    }
}