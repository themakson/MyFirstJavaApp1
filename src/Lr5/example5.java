package Lr5;

class Integera {
    private int integer;

    public void setInteger(){
        integer = 0;
    }
    public void setInteger(int newInteger){
        integer = Math.min(newInteger, 100);
    }

    public Integera(int integer) {
        setInteger(integer);
    }

    public int getInteger() {
        return integer;
    }
}

public class example5 {
    public static void main(String[] args) {
        var holder = new Integera(420);
        System.out.println(holder.getInteger());
        holder.setInteger();
        System.out.println(holder.getInteger());
        holder.setInteger(123);
        System.out.println(holder.getInteger());

    }
}