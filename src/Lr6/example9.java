package Lr6;

class Green {
    static public char[] gr(char[] chars) {
        var tmp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            tmp[i] = chars[chars.length - i - 1];
        }
        return tmp;
    }
}

public class example9 {
    public static void main(String[] args) {
        System.out.println(Green.gr(new char[]{'a', 'b', 'c', 'd', 'e'}));
    }
}