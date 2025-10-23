package Dog;

public class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Breed: " + breed);
        System.out.println();
    }
}


