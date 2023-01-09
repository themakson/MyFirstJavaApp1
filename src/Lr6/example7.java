package Lr6;

import java.util.Arrays;

class Converter {
    public static int[] convert(char[] chars) {
        var xcv = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            xcv[i] = chars[i];
        }
        return xcv;
    }
}

public class example7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Converter.convert(new char[]{'a', 'b', 'c'})));
    }
}