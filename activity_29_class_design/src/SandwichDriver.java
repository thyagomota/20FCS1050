/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 29 - SandwichDriver
 */

public class SandwichDriver {

    public static void main(String[] args) {
        Sandwich blt = new Sandwich("BLT", 350, -5.5);
        System.out.println(blt);
        if (blt.isHealthy())
            System.out.println("It is healthy!");
        else
            System.out.println("It is NOT healthy!");
    }
}
