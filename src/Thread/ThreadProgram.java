package Thread;

public class ThreadProgram {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo th=new ThreadDemo();
        th.start();

        Threadd2 th1=new Threadd2();
        th1.run();

        th.join();



        System.out.println("main class");
    }
}
