package Lr6;

class Counter {
    static private int value;

    static public void printAndInc(){
        System.out.println(value);
        value++;
    }
}

public class example2 {
    public static void main(String[] args) {
        Counter.printAndInc();
        Counter.printAndInc();
        Counter.printAndInc();
        Counter.printAndInc();
    }
}