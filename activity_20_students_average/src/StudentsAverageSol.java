/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 20 - StudentsAverage
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentsAverage {

    static final String FILE_NAME = "data.csv";

    // TODO: ask the user for a course number; then compute and display the average of the course using data from FILE_NAME
    public static void main(String[] args) throws FileNotFoundException {

        // TODO: do a first pass on the file to get all course numbers into a dynamic array
        ArrayList<Integer> courses = new ArrayList<>();
        Scanner file = new Scanner(new FileInputStream(FILE_NAME));
        while (file.hasNext()) {
            String line = file.nextLine();
            line = line.strip(); // get rid off the new line character
            String fields[] = line.split(",");
            int course = Integer.parseInt(fields[0]); // converting a string to an int
            if (!courses.contains(course))
                courses.add(course);
        }
        // System.out.println(courses);
        file.close();

        // TODO: use the dynamic array to validate the user input, preventing a user to enter a course number that we don’t have data to compute the average.
        Scanner in = new Scanner(System.in);
        int courseNumber = -1;
        while (!courses.contains(courseNumber)) {
            System.out.print("Please, enter the course number: ");
            courseNumber = in.nextInt();
        }
        System.out.println("Course number is " + courseNumber);

        // open the file!
        file = new Scanner(new FileInputStream(FILE_NAME));
        double sum = 0;
        int counter = 0;
        while (file.hasNext()) {
            String line = file.nextLine();
            line = line.strip(); // get rid of the new line character
            String fields[] = line.split(",");
            int course = Integer.parseInt(fields[0]); // converting a string to an int
            double grade = Double.parseDouble(fields[2]); // converting a string to a double
            if (course == courseNumber) {
                sum += grade;
                counter++;
            }
        }
        file.close();
        double avg = sum / counter;
        System.out.println("Average grade for course " + courseNumber + " was " + String.format("%.2f", avg));
    }
}