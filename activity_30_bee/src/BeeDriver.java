/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 30 - BeeDriver
 */

import java.util.Random;

public class BeeDriver {

    public static void main(String[] args) {

        // TODO: Define an array of 15 Bees. All of the bees should be members of the same beehive (use your imagination to define a cool name for you beehive).  The first bee (i.e., index = 0) should be the queen. The remaining bees should be randomly assigned, but approximately 10% should be drones and around 90% of workers.
        Bee bees[] = new Bee[15];
        String beehive = "crazy for nectar";
        bees[0] = new Bee(beehive, Bee.QUEEN_TYPE);
        Random r = new Random();
        for (int i = 1; i < bees.length; i++)
            if (r.nextInt(100) < 10)
                bees[i] = new Bee(beehive, Bee.DRONE_TYPE);
            else
                bees[i] = new Bee(beehive);

        // TODO: Next, move all bees to random locations in the square defined by the left upper corner [-10, 10] and the right bottom corner [10, -10]. Right after you moved each bee, print information about it using the toString method implicit call.            

    }
}
