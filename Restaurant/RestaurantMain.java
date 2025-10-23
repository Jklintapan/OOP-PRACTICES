package Restaurant;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        
        rest.addItem("Pizza", 50.99, 4.5);
        rest.addItem("Burger", 30.99, 4.0);
        rest.addItem("Salad", 20.99, 3.5);
        
        System.out.println("Menu Items: " + rest.getMenuItems());
        System.out.println("Prices: " + rest.getPrices());
        System.out.println("Ratings: " + rest.getRatings());
        System.out.println("Average Rating: " + rest.calculateAverageRating());
        
        rest.removeItem("Burger");
        System.out.println("After removal - Menu Items: " + rest.getMenuItems());
        System.out.println("After removal - Average Rating: " + rest.calculateAverageRating());
        System.out.println("thank you for buying!!");
    }
}