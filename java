enum Signal {
    RED(5000),
    YELLOW(2000),
    GREEN(5000);

    private final int duration;

    Signal(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}

class TrafficSignal {

    private Signal currentSignal;

    public TrafficSignal() {
        currentSignal = Signal.RED;
    }

    public void changeSignal() {
        switch (currentSignal) {
            case RED:
                currentSignal = Signal.GREEN;
                break;
            case GREEN:
                currentSignal = Signal.YELLOW;
                break;
            case YELLOW:
                currentSignal = Signal.RED;
                break;
        }
    }

    public void displaySignal() {
        System.out.println("Current Signal: " + currentSignal);
    }

    public int getDuration() {
        return currentSignal.getDuration();
    }
}

public class TrafficSignalSystem {

    public static void main(String[] args) throws InterruptedException {

        TrafficSignal signal = new TrafficSignal();

        while (true) {
            signal.displaySignal();
            Thread.sleep(signal.getDuration());
            signal.changeSignal();
        }
    }
}
