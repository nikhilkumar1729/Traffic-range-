public class TrafficController {
    private int trafficFlow; // vehicles per minute

    public TrafficController(int initialFlow) {
        this.trafficFlow = initialFlow;
    }

    public void accelerate(int increment) {
        if (increment > 0) {
            trafficFlow += increment;
            System.out.println("Traffic accelerated by " + increment + ". Current flow: " + trafficFlow);
        }
    }

    public void decelerate(int decrement) {
        if (decrement > 0 && trafficFlow - decrement >= 0) {
            trafficFlow -= decrement;
            System.out.println("Traffic decelerated by " + decrement + ". Current flow: " + trafficFlow);
        } else if (decrement > 0) {
            trafficFlow = 0;
            System.out.println("Traffic decelerated to zero.");
        }
    }

    public int getTrafficFlow() {
        return trafficFlow;
    }

    public static void main(String[] args) {
        TrafficController controller = new TrafficController(50); // starting traffic flow: 50 vehicles/minute
        controller.accelerate(20); // Increase traffic flow
        controller.decelerate(30); // Decrease traffic flow
        controller.decelerate(50); // Attempt to decrease below zero
    }
}
