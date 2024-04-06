package pl.comarch.camp.it.wielowatkowosc;

public class LepszyWatek implements Runnable {

    private int threadNo;

    public LepszyWatek(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Watek: " + this.threadNo + " I: " + i);
        }
    }
}
