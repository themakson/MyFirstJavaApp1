package lr13;

import java.time.LocalTime;

class JThread extends Thread {

    JThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s стартовал... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println();
        }
        System.out.printf("%s завершился... \n", Thread.currentThread().getName());
    }
}


public class example4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Основной поток стартовал...");
        for(int i=0; i <= 10; i++)
            new JThread("JThread " + i).start();
        System.out.println("Основной поток завершился...");
    }
}