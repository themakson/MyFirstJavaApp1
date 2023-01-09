package Lr6;

import java.sql.Array;
import java.util.Arrays;

class ArraySyntax {
    public static int[] sub(int[] array, int n) {
        if (n >= array.length) return array.clone();
        var xcv = new int[n];
        for (int i = 0; i < n; i++) {
            xcv[i] = array[i];
        }
        return xcv;
    }
}

public class example6 {
    public static void main(String[] args) {
        var someArray = new int[] {1,2,3,4};

        System.out.println("array: "+ Arrays.toString(someArray));
        System.out.println("2 symbols of array: "+ Arrays.toString(ArraySyntax.sub(someArray, 2)));
        System.out.println("20 symbols of array: "+ Arrays.toString(ArraySyntax.sub(someArray, 20)));

    }
}