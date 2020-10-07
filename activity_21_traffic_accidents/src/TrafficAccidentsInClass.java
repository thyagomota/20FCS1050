/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Activity 21 - TrafficAccidents
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TrafficAccidentsInClass {

    static final String FILE_NAME = "traffic_accidents.csv";

    // TODO: create and display a dynamic array of all types of traffic accidents based on data file obtained from FILE_NAME
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> accidentTypes = new ArrayList<>();
        Scanner file = new Scanner(new FileInputStream(FILE_NAME));
        file.nextLine(); // skipping the 1st line... nice :-)
        while (file.hasNext()) {
            String line = file.nextLine().strip(); // method chaining... cool :-)
            String data[] = line.split(",");
            String accidentType = data[5].substring(18).trim();
            if (accidentType.isEmpty())
                accidentType = "COMMON";
            if (!accidentTypes.contains(accidentType))
                accidentTypes.add(accidentType);
        }
        file.close();

        // TODO: use the dynamic array to display a menu of options (one for each type of traffic accident); then based on the user’s choice, display the number of traffic accidents of a given type.
        // System.out.println(accidentTypes);
//        for (String accidentType: accidentTypes)
//            System.out.println(accidentType);
        for (int i = 0; i < accidentTypes.size(); i++)
            System.out.println(i + ". " + accidentTypes.get(i));
        int choice = -1;
        Scanner in = new Scanner(System.in);
        while (choice < 0 || choice >= accidentTypes.size()) {
            System.out.print("? ");
            choice = in.nextInt();
        }
        System.out.println("Choice: " + choice + " - " + accidentTypes.get(choice));
    }
}
