package Lr5;

class CharHolder {
    private char chr;

    public CharHolder(char chr) {
        this.chr = chr;
    }

    public void setChar(char chr) {
        this.chr = chr;
    }

    public char getChar() {
        return chr;
    }
    public void printChar() {
        System.out.println(chr+" " + (int) chr);
    }
}

public class example1 {
    public static void main(String[] args) {
        var holder = new CharHolder('a');
        holder.setChar('b');

        holder.printChar();
    }
}