/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 29 - Dice
 */

import java.util.Random;

/*
A dice is defined by a number of sides (at least 2) and a value that keeps the dice’s current value (always set to 1 upon initialization). Users should be able to create a dice given its number of sides. If the informed value is < 2, set it to 2. Users should also be able to create a dice without informing its number of sides (in that case, set the number of sides to 6). Remember, the current value of a dice should always be set to 1 upon creation. Create a method called “getValue” that returns the dice’s current value. Also, define a method called “roll” to randomly pick another value for the dice, based of course on the number of sides.
 */
public class Dice {

    private int sides;
    private int value;

    private static final int MIN_SIDES     = 2;
    private static final int DEFAULT_SIDES = 6;
    private static final int INITIAL_VALUE = 1;

    // parameterless constructor
    public Dice() {
        sides = DEFAULT_SIDES;
        value = INITIAL_VALUE;
    }

    // parameterized constructor
    public Dice(int sides) {
        if (sides < MIN_SIDES)
            this.sides = MIN_SIDES;
        else
            this.sides = sides;
        value = INITIAL_VALUE;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        value = (new Random()).nextInt(sides) + 1;
    }

    @Override
    public String toString() {
        return "Dice with " + sides + "; current value is " + value;
    }
}
