package pl.comarch.camp.it.wielowatkowosc.incrementator;

public class App {

    static int counter = 0;
    static final Object lock = new Object();

    public static void main(String[] args) {
        IncrementatorTool incrementatorTool = new IncrementatorTool();
        Thread t1 = new Thread(new Incrementator(incrementatorTool));
        Thread t2 = new Thread(new Incrementator(incrementatorTool));
        Thread t3 = new Thread(new Incrementator(incrementatorTool));
        Thread t4 = new Thread(new Incrementator(incrementatorTool));
        Thread t5 = new Thread(new Incrementator(incrementatorTool));

        IncrementatorTool incrementatorTool2 = new IncrementatorTool();
        Thread t6 = new Thread(new Incrementator(incrementatorTool2));
        Thread t7 = new Thread(new Incrementator(incrementatorTool2));
        Thread t8 = new Thread(new Incrementator(incrementatorTool2));
        Thread t9 = new Thread(new Incrementator(incrementatorTool2));
        Thread t10 = new Thread(new Incrementator(incrementatorTool2));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println("cos sie zepsulo !!");
        }

        System.out.println(counter);
    }
}
