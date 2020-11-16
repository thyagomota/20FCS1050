/*
 * CS 1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 34 - StarMap
 */

import java.io.*;

public class StarMap {

    static final String STAR_MAP_FILE = "star_map.txt";

    public static void main(String[] args) {
        StarMapFrame frame = new StarMapFrame();

        try {
            // TODO: declare and instantiate a Scanner with a FileInputStream to read all of the lines of StarMap.STAR_MAP_FILE file


            // TODO: define a loop to read one line at a time using the Scanner object


            // TODO: inside the loop: extract the relevant information from the line


            // TODO: inside the loop: instantiate a Star object saving its reference


            // TODO: inside the loop: instantiate a StarPanel object passing the Star object and saving the StarPanel object reference


            // TODO: inside the loop: add the StarPanel object into the frame (hint: use the add method)


            // TODO: outside the loop, close the file


            frame.repaint();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
