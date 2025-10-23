

package TrafficLight;

public class TrafficLight {
    
    // Attributes
    private String color;
    private int duration; // in seconds

    // Constructor
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    // Setter method to change the color
    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
        System.out.println("Traffic light changed to " + color + " for " + duration + " seconds.");
    }

    // Method to check if the light is red
    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    // Method to check if the light is green
    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    // Display current traffic light status
    public void displayStatus() {
        System.out.println("Current Color: " + color);
        System.out.println("Duration: " + duration + " seconds");
        if (isRed()) {
            System.out.println("STOP! The light is RED.");
        } else if (isGreen()) {
            System.out.println("GO! The light is GREEN.");
        } else {
            System.out.println("CAUTION! The light is " + color.toUpperCase() + ".");
        }
        System.out.println();
    }
}

