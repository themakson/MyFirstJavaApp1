package Lr5;

class Intealer {
    private int a;
    private int b;

    public Intealer() {
    }

    public Intealer(int a) {
        this.a = a;
    }

    public Intealer(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class example3 {
    public static void main(String[] args) {
        new Intealer();
        new Intealer(1);
        new Intealer(1,2);
    }
}