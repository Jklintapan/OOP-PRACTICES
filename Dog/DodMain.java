package Dog;

public class DodMain {
     public static void main(String[] args) {
        // Create two Dog objects using constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Luna", "Poodle");

        // Display original info
        System.out.println("=== Original Dog Information ===");
        dog1.displayInfo();
        dog2.displayInfo();

        // Modify attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");
        dog2.setName("Bella");
        dog2.setBreed("German Shepherd");

        // Display updated info
        System.out.println("=== Updated Dog Information ===");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
      