package pl.comarch.camp.it.wielowatkowosc.incrementator;

public class Incrementator implements Runnable {

    private final IncrementatorTool incrementatorTool;

    public Incrementator(IncrementatorTool incrementatorTool) {
        this.incrementatorTool = incrementatorTool;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            incrementatorTool.increment();
        }
    }
}
