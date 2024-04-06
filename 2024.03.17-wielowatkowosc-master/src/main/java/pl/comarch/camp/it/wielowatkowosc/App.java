package pl.comarch.camp.it.wielowatkowosc;

public class App {
    public static void main(String[] args) {
        /*Watek watek = new Watek(1);
        watek.start();

        Watek watek2 = new Watek(2);
        watek2.start();*/

        Thread t1 = new Thread(new LepszyWatek(1));
        Thread t2 = new Thread(new LepszyWatek(2));

        t1.start();
        t2.start();
    }
}
