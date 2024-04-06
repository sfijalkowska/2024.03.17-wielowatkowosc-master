package pl.comarch.camp.it.wielowatkowosc.incrementator;

public class IncrementatorTool {
    public synchronized void increment() {
        App.counter++;
    }
}
