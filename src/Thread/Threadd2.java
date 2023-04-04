package Thread;

public class Threadd2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is Thread2 runnable interface");
            System.out.println(Thread.currentThread().getName());

        }


    }


}
