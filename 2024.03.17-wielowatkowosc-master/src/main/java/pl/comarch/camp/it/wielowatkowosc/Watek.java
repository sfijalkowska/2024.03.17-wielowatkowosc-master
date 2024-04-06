package pl.comarch.camp.it.wielowatkowosc;

public class Watek extends Thread {

    private int threadNo;

    public Watek(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Watek: " + this.threadNo + " I: " + i);
        }
    }
}
