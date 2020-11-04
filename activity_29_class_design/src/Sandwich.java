/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 29 - Sandwich
 */

/*
A sandwich is defined by a name, number of calories (integer is fine), and price. Users should be able to create a sandwich given its name, number of calories, and price. If informed number of calories or price is negative, make sure those values are initialized to zero. Define “toString” and a method called “isHealthy” that returns true if the number of calories is less than 250, false otherwise.
 */
public class Sandwich {

    private String name;
    private int    calories;
    private double price;

    private static final int HEALTHY_CALORIES_THRESHOLD = 250;
    private static final int DEFAULT_CALORIES = 0;
    private static final double DEFAULT_PRICE = 0.01;

    public Sandwich(String name, int calories, double price) {
        this.name = name;
        if (calories < 0)
            this.calories = DEFAULT_CALORIES;
        else
            this.calories = calories;
        if (price < 0)
            this.price = DEFAULT_PRICE;
        else
            this.price = price;
    }

    public boolean isHealthy() {
        return calories < HEALTHY_CALORIES_THRESHOLD;
    }

    @Override
    public String toString() {
        return name + " has " + calories + " and is priced as $" + price;
    }
}
