package Lr5;

class Chara {
    private char start;
    private char end;

    public Chara(char start, char end) {
        this.start = start;
        this.end = end;
    }

    public void xcv() {
        var res = "";
        for (int i = start; i <= end; i++) {
            res += (char) i;
        }
        System.out.println(res);
    }
}

public class example2 {
    public static void main(String[] args) {
        var range = new Chara('a', 'e');
        range.xcv();
    }
}