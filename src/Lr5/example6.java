package Lr5;
class Yellow {
    private int min;
    private int max;

    public void set(int value) {
        set(value, value);
    }

    public void set(int a, int b) {
        min = Math.min(a, Math.min(b, min));
        max = Math.max(a, Math.max(b, max));
    }

    public Yellow(int a, int b) {
        set(a, b);
    }

    public void print() {
        System.out.println("min: " + min + " max: " + max);
    }
}

public class example6 {
    public static void main(String[] args) {
        var range = new Yellow(20,-1);
        range.print();
    }
}