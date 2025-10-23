package TrafficLight;

public class TrafficLightMain {
   public static void main(String[] args) {
        // Create a TrafficLight object
        TrafficLight light = new TrafficLight("Red", 30);

        System.out.println("=== Initial Traffic Light Status ===");
        light.displayStatus();

        // Change to green
        light.changeColor("Green", 45);
        light.displayStatus();

        // Change to yellow
        light.changeColor("Yellow", 5);
        light.displayStatus();
    }
} 

