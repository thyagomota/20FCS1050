/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 30 - Bee
 */

public class Bee {

    // instance variables
    private int    type;
    private String beehive;
    private int    x, y;    // current location of the bee

    // class variables (constants)
    public static final int WORKER_TYPE = 0;
    public static final int DRONE_TYPE  = 1;
    public static final int QUEEN_TYPE  = 2;

    // constructors
    public Bee(String beehive) {
        this.beehive = beehive;
        type = WORKER_TYPE;
        x = y = 0;
    }

    public Bee(String beehive, int type) {
        this.beehive = beehive;
        if (type == WORKER_TYPE ||
            type == DRONE_TYPE ||
            type == QUEEN_TYPE)
            this.type = type;
        else
            this.type = WORKER_TYPE;
        x = y = 0;
    }

    public int getType() {
        return type;
    }

    public String getBeehive() {
        return beehive;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private String getTypeAsString() {
        if (type == WORKER_TYPE)
            return "worker";
        else if (type == DRONE_TYPE)
            return "drone";
        else if (type == QUEEN_TYPE)
            return "queen";
        else
            return "unknown";
    }

    // TODOd: define a isInsideHive method that returns true/false depending on whether the bee is inside the hive (x = 0 and y = 0) or outside, respectively;
    public boolean isInsideHive() {
        return x == 0 && y == 0;
    }

    // TODOd: override the toString method returning an appropriate String from the object; see example output below for two bees from the “Crazy for Nectar” beehive (as you can see, if the bee is inside the beehive its coordinates should not be displayed):
    @Override
    public String toString() {
        String out = getTypeAsString() + " from \"" + beehive + "\" is ";
        if (isInsideHive())
            out += "inside hive!";
        else
            out += "outside hive @ (" + x + ", " + y + ")";
        return out;
    }

    // TODOd: define a move method that accepts new coordinates for the bee;
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
