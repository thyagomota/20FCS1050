/*
 * CS 1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 34 - Star
 */

// TODO: implement the Star class
public class Star {

    private double x, y;
    private double brightness;

    public static final double MIN_BRIGHTNESS = 0;
    public static final double MAX_BRIGHTNESS = 8;

    public Star(double x, double y, double brightness) {
        this.x = x;
        this.y = y;
        if (brightness < MIN_BRIGHTNESS)
            this.brightness = MIN_BRIGHTNESS;
        else if (brightness > MAX_BRIGHTNESS)
            this.brightness = MAX_BRIGHTNESS;
        else
            this.brightness = brightness;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getBrightness() {
        return brightness;
    }

    public int getGUIX() {
        return (int) ((x + 1) * StarMapFrame.WIDTH / 2);
    }

    public int getGUIY() {
        return (int) ((1 - y) * StarMapFrame.HEIGHT / 2);
    }
}
