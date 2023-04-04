package Thread;

public class ThreadDemo extends Thread{
    public void run(){
        for (int i=0;i<5;i++) {
            System.out.println("This is Thread Demo");
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
