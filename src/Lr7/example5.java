package Lr7;

class StringBox {
    protected String str;

    public StringBox(String str) {
        this.str = str;
    }

    public void print() {
        System.out.println("StringBox{str=" + str + '}');
    }
}

class StringBoxA extends StringBox {
    protected int integer;

    public StringBoxA(String str, int integer) {
        super(str);
        this.integer = integer;
    }

    public void print() {
        System.out.println("StringBoxA{str=" + str + ", integer=" + integer + '}');
    }
}

class StringBoxB extends StringBox {
    protected char chr;

    public StringBoxB(String str, char chr) {
        super(str);
        this.chr = chr;
    }

    public void print() {
        System.out.println("StringBoxB{str=" + str + ", chr=" + chr + '}');
    }
}

public class example5 {
    public static void main(String[] args) {
        var box = new StringBox("str");
        box.print();
        var boxA = new StringBoxA("str", 20);
        boxA.print();
        var boxB = new StringBoxB("str", 'a');
        boxB.print();


        StringBox someBox = new StringBoxB("maybe str", '5');
        someBox.print();
    }
}