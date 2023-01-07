package Lr5;

class SomeoneClass {
    public char chr;
    public int integer;

    public SomeoneClass(char chr, int integer) {
        this.chr = chr;
        this.integer = integer;
    }

    public SomeoneClass(double dbl) {

        chr = (char) dbl;
        integer = (int) ((dbl % 1)*100);
    }
}

public class example4 {
    public static void main(String[] args) {
        var test = new SomeoneClass(33.1234d);
        System.out.println(test.chr);
        System.out.println(test.integer);
    }
}