package Thread;

class Printer implements Runnable{
    Storage st;
    public Printer(Storage st){
        this.st = st;
        new Thread(this, "Printer").start();
    }
    @Override
    public void run() {
        for(int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + " " + st.getN());
    }

}
