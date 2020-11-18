/*
 * CS 1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 34 - StarMap
 */

import java.io.*;
import java.util.Scanner;

public class StarMap {

    static final String STAR_MAP_FILE = "star_map.txt";

    public static void main(String[] args) {
        StarMapFrame frame = new StarMapFrame();

        try {
            // TODO: declare and instantiate a Scanner with a FileInputStream to read all of the lines of StarMap.STAR_MAP_FILE file
            Scanner in = new Scanner(new FileInputStream(STAR_MAP_FILE));

            // TODO: define a loop to read one line at a time using the Scanner object
            while (in.hasNextLine()) {

                // TODO: inside the loop: extract the relevant information from the line
                String line = in.nextLine().strip();
                String data[] = line.split("\t");
                double x = Double.parseDouble(data[0]);
                double y = Double.parseDouble(data[1]);
                double brightness = Double.parseDouble(data[3]);

                // TODO: inside the loop: instantiate a Star object saving its reference
                Star star = new Star(x, y, brightness);

                // TODO: inside the loop: instantiate a StarPanel object passing the Star object and saving the StarPanel object reference
                StarPanel starPanel = new StarPanel(star);

                // TODO: inside the loop: add the StarPanel object into the frame (hint: use the add method)
                frame.add(starPanel);
            }

            // TODO: outside the loop, close the file
            in.close();

            frame.repaint();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
