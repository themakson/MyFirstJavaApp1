package Lr7;

class A {
    public int integer;

    public void setFields(int integer) {
        this.integer = integer;
    }

    public A(int integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "A{" +
                "integer=" + integer +
                '}';
    }
}

class B extends A {
    public char chr;

    public void setFields(int newInteger, char newChr) {
        super.setFields(newInteger);
        this.chr = newChr;
    }

    public B(int integer, char chr) {
        super(integer);
        this.chr = chr;
    }

    public String toString() {
        return "B{" +
                "integer=" + integer + ", " +
                "chr=" + chr +
                '}';
    }
}

class C extends B {
    public C(int integer, char chr, String str) {
        super(integer, chr);
        this.str = str;
    }

    public String str;

    public void setFields(int newInteger, char newChr, String newString) {
        super.setFields(newInteger, newChr);
        this.str = newString;
    }

    public String toString() {
        return "C{" +
                "integer=" + integer + ", " +
                "chr=" + chr + ", " +
                "str=" + str +
                '}';
    }

}

public class example3 {
    public static void main(String[] args) {
        var a = new A(3);
        System.out.println(a);
        var b = new B(3, 'a');
        System.out.println(b);
        var c = new C(3, 'a', "str");
        System.out.println(c);
        c.setFields(13, 'r', "withoutstring");
        System.out.println(c);
    }
}