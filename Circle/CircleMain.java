package Circle;

public class CircleMain {
    public static void main(String[] args) {
        // Create Circle object
        Circle circle = new Circle(5.0);

        System.out.println("=== Original Circle Information ===");
        circle.displayInfo();

        // Modify radius using setter
        circle.setRadius(7.5);

        System.out.println("=== Updated Circle Information ===");
        circle.displayInfo();
    }
}

